marks=int(input("enter the marks:"))
if(marks>=90 and marks<=80):
    print("grade A")
elif(marks<90 and marks>=80):
    print("grade B")
elif(marks<80 and marks>=70):
    print("grade c")
elif(marks<70):
    print("grade d")