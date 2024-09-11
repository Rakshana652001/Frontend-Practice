var date = new Date();

var day = date.getDay();

var list = ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"];

console.log("Today is "+list[day]);

var hours = date.getHours();
var minutes = date.getMinutes();
var seconds = date.getSeconds();

var ampm = (hours>=12) ? "PM" : "AM";
hours = (hours>=12) ? hours-12 : hours;

if(hours === 0 && ampm === "PM")
{
	if(minutes === 0 && seconds === 0)
	{
		hours = 12;
		ampm = 'Noon';
	}
	else
	{
		hours = 12;
		ampm = 'PM';
	}
}
console.log("Time Now: "+hours+" "+ampm+":"+minutes+":"+seconds);