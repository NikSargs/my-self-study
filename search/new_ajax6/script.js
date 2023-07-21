const searchName = document.getElementById('searchName');
const searchAddress = document.getElementById('searchAddress');
let searchCity = document.getElementById('searchCity');
let searchCategory = document.getElementById('searchCategory');
const table = document.getElementById('partnerTable');

$.ajax({
	type: "GET", 
  	crossDomain: true,
  	dataType: 'json',
  	async: false,
  	url: 'https://cardplus.demirbank.kg/api/partner/city?lang=ru',
  	success: function (response) {
  		cities = response;
  	}
});

var render_cities = function(lists){
	var row = "<option value=''>Все города</option>";
	for(index in lists){
		row += "<option>" + lists[index].name + "</option>"
    }
    searchCity.innerHTML = row;
}
render_cities(cities);

$.ajax({
	type: "GET", 
  	crossDomain: true,
  	dataType: 'json',
  	async: false,
  	url: 'https://cardplus.demirbank.kg/api/partner/category?lang=ru',
  	success: function (response) {
  		categories = response;
  	}
});

var render_categories = function(lists){
	var row = "<option value=''>Все Категории</option>";
	for(index in lists){
		row += "<option>" + lists[index].name + "</option>"
    }
    searchCategory.innerHTML = row;
}
render_categories(categories);

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

console.log(partners[0].branches.length);

console.log(partners);


searchName.addEventListener('input', (e) => {
	// filter the meals array
	const searchNameResults = partners
	.filter(partner => {
		return partner.branches[0].address.toLowerCase().includes(searchAddress.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].city.name.toLowerCase().includes(searchCity.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].category.name.toLowerCase().includes(searchCategory.value.toLowerCase());
	})
	.filter(partner => {
		return partner.name.toLowerCase().includes(e.target.value.toLowerCase());
	});

	render_lists(searchNameResults);

});


searchAddress.addEventListener('input', (e) => {
	// filter the meals array
	const searchAddressResults = partners
	.filter(partner => {
		return partner.name.toLowerCase().includes(searchName.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].city.name.toLowerCase().includes(searchCity.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].category.name.toLowerCase().includes(searchCategory.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].address.toLowerCase().includes(e.target.value.toLowerCase());
	});

	render_lists(searchAddressResults);

});


searchCity.addEventListener('change', function() {
  
  const searchCityResults = partners
	.filter(partner => {
		return partner.name.toLowerCase().includes(searchName.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].address.toLowerCase().includes(searchAddress.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].category.name.toLowerCase().includes(searchCategory.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].city.name.toLowerCase().includes(this.value.toLowerCase());
	});

	render_lists(searchCityResults);

});

searchCategory.addEventListener('change', function() {
  
  const searchCategoryResults = partners
	.filter(partner => {
		return partner.name.toLowerCase().includes(searchName.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].address.toLowerCase().includes(searchAddress.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].city.name.toLowerCase().includes(searchCity.value.toLowerCase());
	})
	.filter(partner => {
		return partner.branches[0].category.name.toLowerCase().includes(this.value.toLowerCase());
	});

	render_lists(searchCategoryResults);

});

var render_lists = function(lists){
	var row = "";
	for(index in lists){
		row += "<tr>"+
            		"<td class='pl-0 py-8'><span class='text-dark-75 d-block font-size-lg'>" 
            		+ lists[index].name +"</span></td>" +
             		"<td>" + lists[index].branches[0].city.name + "</td>" + 
             		"<td>" + lists[index].branches[0].address + "</td>" +
            		"<td>" + lists[index].branches[0].category.name + "</td>" +
           		"</tr>"
    }
    table.innerHTML = row;
}
render_lists(partners);

