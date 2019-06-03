val data = List ("alpha", "gamma", "beta", "omega", "zeta")
//find strings with length 4
for (list <- data) {
	if ( list.length() == 4 ) {
		println(list)
	}
}

//find count of all strings with length 4
val result = data.filter( x => x.length == 4 ).size
println("Count of strings with length 4 :" + result)

//Convert list of strings to list of integers
println("List of Strings to integer :")
println(for (element <- data) yield element.length)
	
//Count of strings with letter 'm'
val result2 = data.filter(x => x contains 'm').size
println("Count of strings containing 'm' :"+ result2)

//Count of strings starting with letter 'a'
val result3 = data.filter(x => x startsWith("a")).size
println("Count of strings starting 'a' :"+ result3)

//Define GCD function
def gcd(x : Int,y : Int): Int = {
	if (y == 0) x else gcd (y , x%y)
}

//Print result for gcd of 20 and 30
val result4 = gcd(20,30)
println("GCD of 20 & 30 is "+ result4)
