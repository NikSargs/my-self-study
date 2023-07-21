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
console.log(partners[0].name);

ul = document.getElementById("users-list");

var render_lists = function(lists){
  var li = "";
  for(index in lists){
    li += "<li>" + lists[index].name + "</li>";
  }
  ul.innerHTML = li;
}

render_lists(partners);

// lets filters it
input = document.getElementById('search_name');

var filterUsers = function(event){
  keyword = input.value.toLowerCase();
  filtered_users = Object.values(partners[0].name).filter(function(partner){
    partner = partner.toLowerCase();
    return partner.indexOf(keyword) > -1; 
  });
  
  render_lists(filtered_users);
}

input.addEventListener('keyup', filterUsers);

