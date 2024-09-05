function cToF (celcius)
{
	var cDegree = celcius;
	var convert = cDegree * 9/5 +32;
	var result = cDegree +'\xB0C is '+convert+'\xB0F.';
	console.log(result);
}

function fToC(fahrenheit)
{
	var fDegree = fahrenheit;
	var convert = (fDegree-32) * 5/9;
	var result = fDegree+'\xB0F is '+convert+'\xB0C.';
	console.log(result);
}
cToF(60);
fToC(45);