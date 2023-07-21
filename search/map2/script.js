const map = L.map('map');
map.setView([52.488, -0.89], 7);

const data = {
	gatwick: {
		id: 1,
		coords: [51.1539, -0.182],
		title: "Gatwick",
		address: "aaaa"
	},
	manchester: {
		id: 2,
		coords: [53.3502, -2.2803],
		title: "Manchester",
		address: "bbbb"

	},
	heathrow: {
		id: 3,
		coords: [51.4712, -0.4599],
		title: "Heathrow",
		address: "cccc"
	}
}

L.tileLayer('https://tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; <a href="https://www.openstreetmap.org/copyright">OpenStreetMap</a> contributors'
}).addTo(map);

for (let key in data){

	const airport = data[key];

	L.marker(airport.coords, {
	title: airport.title,
})
	.bindPopup('<h2 id =' + airport.id + '>'+ airport.address +'</h2>')
	.addTo(map)
}
