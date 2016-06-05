/**
 * 
 */

function fun1 (){
	
var os;
	
	
var str1 = "hello world";

var str2 = '{"id":2,"label":"C"}';


os = str1.replace(/world/ig, 'san diego');

os = str2.replace(/"label":"[^]*"/ig, '"label":"' + str1 + '"');
	
document.getElementById("demo").innerHTML=os;

}