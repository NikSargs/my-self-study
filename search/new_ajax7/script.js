const table = document.getElementById('table');

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

var render_lists = function(lists){
	var row = "";
	for(index in lists){
		let urlForMarker = "file:///C:/search/new_ajax7/basic.html" + "?"
												 	+ "Lat=" + lists[index].branches[0].geoLat 
													+ "Lng=" + lists[index].branches[0].geoLng
													+ "Zoom=" + 15;

		row +="<div>" + "<a href=" + urlForMarker +  ">" + "hello" + "</a>" + "</div>"
    }
    table.innerHTML = row;
	
    }
    
render_lists(partners);

