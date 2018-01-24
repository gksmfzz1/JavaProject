#Qna8,Qna10,Qna11,Qna12,Qna17,Qna18,Qna19,Qna20
#이름 짓기
#파스칼 표기법 : 첫단어를 대문자로 시작하여 이름을 지음 ex) Employees, RegisterEmployee // 주로 클래스를 만들 때 많이 쓰임
#카멜 표기법 : 첫단어는 소문자로 시작하여 이름을 지음 ex) employees, registerEmployee
#스네이크 표기법 : 소문자와 _ 기호를 이용해서 이름을 지음 ex) register_employee
#헝가리언 표기법 : 자료형을 의미하는 접두사를 이용해서 이름을 지음 ex) strName, isMarried, boolMarried

import random

#8 생활 속 문제를 파이썬으로 풀기

def compareRoom(width, height, price):
    return (width * height) / price

roomA = compareRoom(2.5,3,27)
roomB = compareRoom(4,2,30)

if (roomA > roomB):
    print('방B가 낫네요')
else:
    print('방A가 낫네요')

#10 이윤율 계산
# 문제에 대한 배경지식이 필요 - 이윤율 공식
# 이윤율 = 잉여가치액 / (불변자본 + 가변자본)

def computeProfit():
    c = int(input('불변자본을 입력하세요'))
    v = int(input('가변자본을 입력하세요'))
    s = int(input('잉여가치액을 입력하세요'))

    return ( c + v) / s

print('이윤율은 %.2f 입니다' % (computeProfit()))

        #constant capital (불변자본), variable capital(가변자본), surplus value(잉여가치액)
#11 외국 쇼핑몰에서 노트북 구매
#1070.10-달러환율
#1308.14-유로환율

def getExchangeRate(country):
    rate = 0
    if country =='us':
        rate = 1071
    elif country == 'euro':
        rate = 1309

    return rate

buyUS = 780 * getExchangeRate('us')
buyEuro = 650 * getExchangeRate('euro')

if buyUS>buyEuro:
    print('달러화가 더 비싸네요')
else:
    print('유로화가 더 비싸네요')

#12 육상시합 트랙

def howManyRun(radius):
    pi = 3.14
    return radius * pi

studentA = howManyRun(100)
studentB = howManyRun(90)

print('학생A는 학생 B보다 %d M 만큼 더 뜀' % (studentA-studentB))

#17

def intCalu():
    num1 = int(input('좌변값을 하나 입력하세요'))
    num2 = int(input('우변값을 하나 입력하세요'))
    fmt = ' %d + %d = %d \n %d - %d = %d \n %d * %d = %d \n %d / %d = %.2f \n %d ** %d = %d'
    print(fmt % ( num1, num2, num1+num2, \
            num1, num2, num1-num2, \
            num1, num2, num1*num2, \
            num1, num2, num1/num2, \
            num1, num2, num1**num2))

intCalu()

#18

def computeTax():
    salary = int(input('연봉을 입력하세요 (단위: 만원)'))
    ismarried = input('결혼 여부를 입력하세요 (y/n)')
    tax = 0
    if ismarried =='n':
        if salary < 3000:
            tax = salary*0.1

        else:
            tax = salary*0.25
        ismarried = '아니오'
    elif ismarried =='y':
        if salary < 6000:
            tax = salary*0.1

        else:
            tax = salary*0.25
        ismarried = "예"
    fmt ="연봉 : %d, 결혼여부 : %s, 세금 : %.1f"
    print(fmt % (salary,ismarried,tax))

computeTax()

# 19 윤년 계산 (2012년은 윤년)

def isLeapYear():
    year = int(input('윤년여부를 알고 싶은 년도를 입력하세요'))
    isleap = '윤년이 아닙니다'
    if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
        isleap = '윤년입니다'

    print("%d은(는) %s" % (year, isleap))

isLeapYear()

# 20 복권 발행 프로그램

def rouletteLotto():

    lotto = str(random.randint(100,999))
    lucky = input('복권 3자리 숫자를 입력하세요')
    match = 0
    prize = '꽝 다음기회에!'

    for i in [0,1,2]:
        for j in [0,1,2]:
            if (lucky[i] == lotto[j]):
                match += 1
    if match == 3:
        prize = '1등 당첨! 백만원!'
    elif match ==2:
        prize = '2등 당첨! 만원!'
    elif match ==1:
        prize = '3등 당첨! 천원!'

    print(lucky, lotto, prize)

rouletteLotto()