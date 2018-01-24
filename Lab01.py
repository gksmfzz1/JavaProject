#1 print() 를 이용 다음 내용을 출력
print(' /\_/\    -----   ')
print('( \' \' ) / Hello \ ')
print('(  -  )<  Junior |')
print(' | | |  \ Coder!/ ')
print('(__|__)   -----   ')

print('*   *   **   ****   ****  *   *')
print('*   *  *  *  *   *  *   * *   *')
print('***** *    * ****   ****   * * ')
print('*   * ****** *   *  *   *   *  ')
print('*   * *    * *    * *    *  *  ')

type(100)
type(99.99)
#2 name, weight, age를 변수로 선언하고 값으로 초기화
name = "하늘"
weight = 60
age = 27
print(name)
print(weight)
print(age)
#3 수학식을 파이썬 표현식으로 바꾸기
x = 1
y = 1
z = 1
print(3*x)
print((3*x)+y)
print((x+y)/7)
print((3*x)+y/(z+2))

#4 문장의 실행결과
x,y = 4,8
x*=y
print('x *= y :', x)
x,y - 4, 8
x -= y
print('x -= y :', x)

#5 x에 대입할 값을 수정
# x = ?
x = 3
print(x + 7 == 10)

#6 수식을 파이썬 프로그램으로 작성하고 계산 결과를 출력
print((-32+95)*12/3)
print((3*4-((-27+67)/4))**8)
print(((512+1968-432)/2**4)+128)
print(256 == 2**8)
print(50+50 <= 10*10)
print(99 != 10**2-1)

#7 표현식의 실행결과 서술하기
x = 2.5
y = -1.5
m = 18
n = 4
print(x+n*y-(x+n)*y)
print(m/n+m%n)
print(5*x-n/5)
print(1-(1-(1-(1-n))))

#8 생활 속 문제를 파이썬으로 풀기
a = 2.5 * 3 / 27
b = 4 * 2 / 30
print(a > b)
print(a)
print(b)

#9 각 표현식에 대한 결과 값
A, Z, D, M = 1, 2, 3, 4
print(3 + 4.5 * 2 +27 /8)
print(True or False and 3 < 4 or not (5 == 7))
print(True or (3 < 5 and 6 >= 2))
print(3 != A)
print(7 % 4 + 3 - 2 / 6 * Z)
print(D + 1 + M % 2 / 3)
print(5.0 / 3 + 3 / 3)
print(53 % 21 < 45 / 18)
print((4<6) or True and False or False and ( 2 > 3))
print(7 - ( 3 + 8 * 6 + 3) - (2 + 5 * 2))

#10 이윤율 계산
# 문제에 대한 배경지식이 필요 - 이윤율 공식
# 이윤율 = 잉여가치액 / (불변자본 + 가변자본)
print('이윤율 :', 45/(30+15))

#11 외국 쇼핑몰에서 노트북 구매
#1070.10-달러환율
#1308.14-유로환율
print('달러환율 =', 780*1070.10)
print('유로환율 =', 650*1308.14)
dolar = 780*1070.10
eur = 650*1308.14
print(dolar > eur)

#12 육상시합 트랙
a = 100*3.14
b = 90*3.14
c = a-b
print(a, b)
print('더 달려야 하는 거리 :', c)

#13 문장의 참 여부
print("Check out this line  ")
print("//hello there " + '9' + str(7))
print('H'+'I'+ "is" + str(1) + "more example")
print('H' + str(6.5) + 'I' + "is" + str(1) + 'more example')
print("Print both of us", "Me too")
print("Reverse" + 'I' + 'T')
print("Nonot Here is" + str(1) + "more example")
print("Here is" + str(10*10))
print( not True)
print()
print
print("How about this one" + '?' + 'Huh?')

#14 bool 표현식의 값 계산
print(True and False and True or True)
print(True or True and True and False)
print((True and False)or(True and not False)\
      or(False and not False))
print((2 < 3) or (5 > 2) and not (4 == 4) or 9 != 4)
print(6 == 9 or 5 < 6 and 8 < 4 or 4 > 3)

#15 유효한 표현식의 데이터 유형찾기
a = 27/13 +4
b = 27/13 +4.0
c = 42.7 % 3 + 18
d = (3 < 4)and 5/8
e = 23/5+23/5.0
h = 'a'+'b'
j = 'a' and not 'b'
print(a ,b,c,d,e,h,j)
type(a)
type(b)
type(c)
type(d)
type(e)
type(h)
type(j)

#16 증감 연산자가 파이썬에도 있나?
# 파이썬에서는 기본적으로 ++, --는 지원X
n = 3
#print(++n)  n+=1
#print("n == " + n)
#print(--n)  n-=1
#print("n == " + n)

#17
print('*** 사칙연산 프로그램 ***')
a = int(input('첫번째 정수를 입력하세요'))
b = int(input('두번째 정수를 입력하세요'))
print('%d + %d = %d' % (a, b,a+b))
print('%d - %d = %d' % (a, b,a-b))
print('%d * %d = %d' % (a, b,a*b))
print('%d / %d = %d' % (a, b,a/b))





