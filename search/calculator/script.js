let calculate_limit = document.getElementById('calculate_limit').addEventListener('click', function() {
	let salary = document.getElementById('salary').value;
	let contrib_loan = document.getElementById('contrib_loan').value;
	if (contrib_loan <= 0) {
		let sum = (salary / 2) * 3;
		document.getElementById('limit').value = sum; 	
	} else {
		let sum = ((parseInt(salary) / 2 ) - (parseInt(contrib_loan))) * 6;
		document.getElementById('limit').value = sum;
		if(sum < 0 || isNaN(sum) == true){
			document.getElementById('limit').value = 0;
		}
	}
});
