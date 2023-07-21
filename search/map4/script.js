function onMapClick(e) {
    var popup = L.popup()
    .setLatLng(e.latlng)
    .setContent("<table><tr><td>Cell 1</td><td>Cell 2</td></tr></table>")
    .openOn(mymap);
    var lat = marker.getLatLng().lat;
    var lng = marker.getLatLng().lng;
    var myWindow = window.open('child.html?lat=' + lat + '&lng=' + lng, "MsgWindow", "width=200,height=100");
};

 function flyToLatLng(lat, lng) {
    mymap.flyTo([lat, lng], 15);
 };