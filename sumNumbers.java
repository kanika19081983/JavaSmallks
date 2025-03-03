boolean isEven(int x) {
    return x % 2 == 0;
}
isEven(5);
boolean isOdd(int x) {
    return x % 2 != 0;
}
isOdd(5);


while (i <= 10) {
    System.out.println(i + " % 2 = " + i % 2);
    i++;
}
int i = 1;
 {
while (i <= 10) {
    if (isEven(i)) {
        System.out.println(i +" is even");
    } else {
        System.out.println(i + " is odd");
    }
    i++;
}
}
void printOddEven() {
    int i = 1;
    while (i <= 10) {
        if (isEven(i)) {
            System.out.println(i + " is even");
        }
        i++;
    }
}
isOdd(5);
isEven(4);