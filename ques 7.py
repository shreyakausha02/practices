a=5
b=5
print("Arithmetic operator:\n")
print("addition: ",a+b)
print("subtraction: ",a-b)
print("multiplication: ",a*b)
print("division: ",a/b)
print("Modulus: ",a%b)
print("floor divison : ",a//b)
print("exponent:",a**b,"\n")


print("Relational Operators : \n")
print("greater than : ", a>b)
print("less than ", a<b)
print("greater than or equal to : ", a>=b)
print("less than or equal to : ", a<=b)
print("equal to : ",a==b)
print("not equal to : ", a!=b, "\n")
print("bitwise operators :\n")
print("bitwise AND : ",a&b)
print("bitwise OR : ", a|b)
print("bitwise NOT : ", ~a)
print("bitwise XOR : ", a^b)
print("left shift : ", a<<b)
print("right shift : ", a>>b, "\n")
print
print
print(" logical operator : \n")
print("logical AND : ", a and b)
print("logical OR : ", a or b)
print("logical NOT :, not a")
print
print("assignment operators : \n")
a +=b
print("a += b : ", a)
a, b = 5, 5
a -= b
print("a-=b : ", a)
a, b = 5, 5
a*=b
print("a*=b : ", a)
a, b = 5, 5
a/=b
print("a/=b : ", a)
a, b = 5, 5
a//=b
print("a %=b : ", a)
a, b = 5, 5
a//=b
print("a//=b :  ", a)
a, b = 5, 5
a**=b
print("a**=b :  ", a)

print("identitity operators : \n")
a, b = 5, 5
print("a is b : ", a is b)
a, b =5, 6
print("a is not b : ", a is not b)

print("membershipoperators : \n")
a=[1,2,3,4,5]
print("5 in a: ",5 in a)
print("10 not in a:",10 not in a)

print("Ternary operator : \n")
a,b=5,6
print("a>b:", a if a>b else b)