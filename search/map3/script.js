const map = L.map('map', {attributionControl: false});
map.setView([42.83134, 74.62131], 18);

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

L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

for (let key in partners){

	const latitude = partners[key].branches[0].geoLat;

	const longitude = partners[key].branches[0].geoLng;

	if (latitude == null && longitude == null) { continue; }

	L.marker([latitude, longitude], {
	title: partners[key].name,
})
	.bindPopup('<h4>' + partners[key].name + '</h4>'
				+'<p>' + partners[key].branches[0].address + '</p>')
	.addTo(map)
}
