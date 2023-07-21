// const meals = [
//    {
//      id: 1,
//      title: 'Strawberry Salad with Poppy Seed Dressing',
//      img: 'Strawberry-Salad-with-Poppy-Seed-Dressing.jpg',
//      book: 1
//    },

//    {
//      id: 2,
//      title: 'Cashew Turkey Salad Sandwiches',
//      img: 'turkey-sandwich.jpg',
//      book: 2
//    }
// ];

const searchName = document.getElementById('searchName');
const table = document.getElementById('partnerTable');

$.ajax({
  type: "GET", 
  crossDomain: true,
  dataType: 'json',
  async: false,
  url: 'https://cardplus.demirbank.kg/api/partner/groupedList?lang=ru',
  success: function (response) {
    partners = response;
  }
});

  for (var i = 0; i < partners.length; i++){
    var row =  "<tr>"+
                    "<td class='pl-0 py-8'><span class='text-dark-75 d-block font-size-lg'>" + 
                    partners[i].name +"</span></td>" +
                    "<td>" + partners[i].branches[0].city.name + "</td>" + 
                    "<td>" + partners[i].branches[0].address + "</td>" +
                    "<td>" + partners[i].branches[0].category.name + "</td>" +
                "</tr>";
    table.innerHTML += row;

  }

const searchField = document.querySelector('#search');
const searchResultsContainer = document.querySelector('#partnerTable');

searchField.addEventListener('input', (e) => {
  
  // if input field is empty, clear the search results
  if(e.target.value === '') {
     table.innerHTML = row;
     return;
  }
  
  // filter the meals array
  const searchResults = partners.filter(partner => {
      return partner.name.toLowerCase().includes(e.target.value.toLowerCase());
  });
  
  // before displaying the search results, clear the search results div
  table.innerHTML = '';
  
  // display the titles of the meal objects that include the text entered in input field
  searchResults.forEach((element, index) => {
     
     // p.textContent = (index + 1) + '. ' + element.name;
     row =  "<tr>"+
                        "<td class='pl-0 py-8'><span class='text-dark-75 d-block font-size-lg'>" 
                        + element.name +"</span></td>" +
                        "<td>" + element.branches[0].city.name + "</td>" + 
                        "<td>" + element.branches[0].address + "</td>" +
                        "<td>" + element.branches[0].category.name + "</td>" +
                      "</tr>";
     table.innerHTML += row;
  });
});