const searchName = document.getElementById('searchName');
const table = document.getElementById('partnerTable');

let demirPartners = [];

$.ajax({
  type: "GET", 
  crossDomain: true,
  dataType: 'json',
  async: false,
  url: 'https://cardplus.demirbank.kg/api/partner/groupedList?lang=ru',
  success: function (response) {
    data = response;
  }
});



  for (var i = 0; i < data.length; i++){
    var row =  "<tr>"+
                    "<td class='pl-0 py-8'><span class='text-dark-75 d-block font-size-lg'>" + data[i].name +"</span></td>" +
                    "<td>" + data[i].branches[0].city.name + "</td>" + 
                    "<td>" + data[i].branches[0].address + "</td>" +
                    "<td>" + data[i].branches[0].category.name + "</td>" +
                "</tr>";
    table.innerHTML += row;

  }

    // console.log(demirPartners);

    searchName.addEventListener('keyup', (e) => {
    const searchString = e.target.value.toLowerCase();
    const filteredPartners = data.filter(
      function () {
        return data[0].name.toLowerCase().includes(searchString); });

    console.log(filteredPartners);
     
  });


