var string1 = 'Rakshana';
var number = 3556;
this[string1] = number;
this[number] = string1;
console.log(this[number]);
console.log(this[string1]);