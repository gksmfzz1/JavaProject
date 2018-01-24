# 18 세금 계산 프로그램

#ismarried = input('결혼 여부를 입력하세요 (y/n)')

#if ismarried == 'n':

    #salary = int(input('연봉을 입력하세요 (단위: 만원)'))
    #if salary < 3000:
     #   print("당신의 세금은 %d만원 입니다" % (salary * 0.1))
    #else:
     #   print("당신의 세금은 %d만원 입니다" % (salary * 0.25))
#elif ismarried == 'y':

 #   salary2 = int(input('연봉을 입력하세요 (단위: 만원)'))
  #  if salary2 < 6000:
   #     print("당신의 세금은 %d만원 입니다" % (salary2 * 0.1))
    #else:
     #   print("당신의 세금은 %d만원 입니다" % (salary2 * 0.25))
#else:
 #   print("다시 입력하세요")



salary = int(input('연봉을 입력하세요 (단위: 만원)'))
ismarried = input('결혼 여부를 입력하세요 (y/n)')
tax = 0
if ismarried.upper() =='n':
    if salary < 3000:
        tax = salary*0.1
        print(tax)
    else:
        tax = salary*0.25
        print(tax)
elif ismarried.upper() =='y':
    if salary < 6000:
        tax = salary*0.1
        print(tax)
    else:
        tax = salary*0.25
        print(tax)
else:
    print('다시입력하세요')



# 19 윤년 계산 (2012년은 윤년)
year = int(input('윤년여부를 알고 싶은 년도를 입력하세요'))

if year % 4 == 0 and year % 100 != 0 or year % 400 == 0:
    print('{0} 은(는) 윤년입니다' .format(year))
else:
    print('{0} 은(는) 윤년이 아닙니다' .format(year))

# 20 복권 발행 프로그램
import random
lotto = str(random.randint(100,999))
print(lotto)
lucky = input('복권 3자리 숫자를 입력하세요')

match = 0

if lotto[0] == lucky[0] or lotto[0] == lucky[1] or lotto[0] == lucky[2]:
    match += 1
if lotto[1] == lucky[0] or lotto[1] == lucky[1] or lotto[1] == lucky[2]:
    match += 1
if lotto[2] == lucky[0] or lotto[2] == lucky[1] or lotto[2] == lucky[2]:
    match += 1

msg = '꽝이군요! 다음기회에'
if match == 3:
    msg = '모두 일치! 상금 1백만원'
if match == 2:
    msg = '2개 일치! 상금 1만원'
if match == 1:
    msg = '1개 일치! 상금 1천원'

print(msg)






#21 구구단 출력 프로그램
# 0: ASCII - 48, 9: ASCII - 57
dan = input('구구단을 출력할 숫자를 입력하세요 (1~9)')

if ord(dan[0]) >= ord('0') and ord(dan[0]) <= ord('9'):
    print('구구단 출력') #구구단 출력코드 생략
else:
    print('입력오류- 숫자만 입력하세요')
#22 소문자 입력받아 대문자로 출력
alp = ord(input('대문자로 변환할 소문자를 입력하세요 (a~z)'))

# a~z : 97~122
if alp >= 97 & alp <= 122:
    alp = alp - 32
    print(chr(alp))
else:
    print('잘못입력하셨습니다 notnot')

#23 숫자 맞추기 프로그램 작성
import random
num2 = random.randint(1,100)
isloop = True
while isloop:
    num1 = int(input('1-100 사이의 숫자를 입력하세요'))
    if num1 == num2:
        print('정답입니다!! 축하합니다:)')
        isloop = False
    elif num1 > num2:
        print('입력하신 숫자가 더 큽니다')
    else:
        print('입력하신 숫자가 더 작습니다')

#24 구구단 테이블 만들기
fmt = '%2d | %d %2d %2d %2d %2d %2d %2d %2d %2d'
print('         Multiplication Table')
print('     1  2  3  4  5  6  7  8  9')
print('-------------------------------')
for i in range(1,10):
    print("")
    print(fmt % (i , i, i*2, i*3, i*4, i*5, i*6, i*7, i*8, i*9))

#25 임의의 번호 6자리 입력 - 신용카드 종류/ 은행정보 출력

num = input('임의의 숫자 6자리를 입력하세요')

cType = num[0]
cType2 = num[1]
ctmsg = '카드정보 없음'
if cType == '3' and cType2 == '5':
    ctmsg = 'JCB카드'
elif cType == '4':
    ctmsg = '비자카드'
elif cType == '5':
    ctmsg = '마스타카드, Maestro'

bank = '은행정보 없음'
isloop = True

while isloop:
    if num == '356317':
        bank = 'NH농협카드'
        isloop = False
    elif num == '356901':
        bank = '신한카드'
        isloop = False
    elif num == '356912':
        bank = 'KB국민카드'
        isloop = False
    elif num == '404825':
        bank = '비씨카드'
        isloop = False
    elif num == '438676':
        bank = '신한카드'
        isloop = False
    elif num == '457973':
        bank = '국민은행'
        isloop = False
    elif num == '515594':
        bank = '신한카드'
        isloop = False
    elif num == '524353':
        bank = '외환카드'
        isloop = False
    elif num == '540926':
        bank = '국민은행'
        isloop = False

print('%s %s' % (ctmsg, bank))

#26 주민등록번호 유효성 검사
jumin='9201251177436'
plus = 0
jcode = 0
j= 2

for i, j in range(0,11):
    if j == 8:
        j = 2