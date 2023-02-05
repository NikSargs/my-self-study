(function (argument) {
	'use strict'

	document.getElementById('convert').addEventListener('submit', function(event){

    		event.preventDefault();

    		let distance = document.getElementById('distance').value;
    		if (distance) {
    			let conversion = distance * 1.609344;
    			let roundedConversion = conversion.toFixed(3);
    			//alert(roundedConversion);
    			
    			let answer = document.getElementById('answer');
    			answer.innerHTML = `<h2>${distance} miles Distance miles convers to ${roundedConversion} killometrs</h2>`;
    		}
    		else {
    			answer.innerHTML = '<h2>Pleas write a number</h2>'

    		}
    		// alert(distance);
    	});
})();