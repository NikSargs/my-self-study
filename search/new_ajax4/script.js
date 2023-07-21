const searchName = document.getElementById('searchName');
const searchAddress = document.getElementById('searchAddress');
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

searchName.addEventListener('input', (e) => {

// if input field is empty, clear the search results
	if(e.target.value === '') {
		render_lists(partners);
		return;
	}
	// filter the meals array
	const searchNameResults = partners.filter(partner => {
		return partner.name.toLowerCase().includes(e.target.value.toLowerCase());
	});

	// before displaying the search results, clear the search results div
	table.innerHTML = '';

	// display the titles of the meal objects that include the text entered in input field
	searchNameResults.forEach((partner, index) => {
		row =  "<tr>"+
	            	"<td class='pl-0 py-8'><span class='text-dark-75 d-block font-size-lg'>" 
	            	+ partner.name +"</span></td>" +
	            	"<td>" + partner.branches[0].city.name + "</td>" + 
	            	"<td>" + partner.branches[0].address + "</td>" +
	            	"<td>" + partner.branches[0].category.name + "</td>" +
	        	"</tr>";
	    table.innerHTML += row;
	});
});

searchAddress.addEventListener('input', (e) => {

// if input field is empty, clear the search results
	if(e.target.value === '') {
		render_lists(partners);
		return;
	}
	// filter the meals array
	const searchAddressResults = partners.filter(partner => {
		return partner.branches[0].address.toLowerCase().includes(e.target.value.toLowerCase());
	});

	// before displaying the search results, clear the search results div
	table.innerHTML = '';

	// display the titles of the meal objects that include the text entered in input field
	searchAddressResults.forEach((partner, index) => {
		row =  "<tr>"+
	            	"<td class='pl-0 py-8'><span class='text-dark-75 d-block font-size-lg'>" 
	            	+ partner.name +"</span></td>" +
	            	"<td>" + partner.branches[0].city.name + "</td>" + 
	            	"<td>" + partner.branches[0].address + "</td>" +
	            	"<td>" + partner.branches[0].category.name + "</td>" +
	        	"</tr>";
	    table.innerHTML += row;
	});
});