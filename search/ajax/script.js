var users = [
  'haha1',
  'asd',
  'qwe',
  'gfd',
  'bvc',
  'jhg',
  'tre',
  'Steve Fox'
];

ul = document.getElementById("users-list");

var render_lists = function(lists){
  var li = "";
  for(index in lists){
    li += "<li>" + lists[index] + "</li>";
  }
  ul.innerHTML = li;
}

render_lists(users);

// lets filters it
input = document.getElementById('search_name');

var filterUsers = function(event){
  keyword = input.value.toLowerCase();
  filtered_users = users.filter(function(user){
        user = user.toLowerCase();
       return user.indexOf(keyword) > -1; 
  });
  
  render_lists(filtered_users);
}

input.addEventListener('keyup', filterUsers);

