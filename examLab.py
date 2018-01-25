import random

num = int(input('교환할 돈은 얼마?'))


oman = num // 50000
num1 = num-(oman*50000)
man = num1 // 10000
num2 = num1 -(man*10000)
ochun = num2 // 5000
num3 = num2 -(ochun*5000)
chun = num3 // 1000
num4 = num3 - (chun*1000)
oback = num4 // 500
num5 = num4 - (oback*500)
back = num5 // 100
num6 = num5 - (back*100)
oship = num6 // 50
num7 = num6 -(oship*50)
ship = num7 // 10
num8 = num7 - (ship*10)
fmt = '50000원 %d장, 10000원 %d장, 5000원 %d장, 1000원 %d장, 500원 %d개, 100원 %d개, 50원 %d개, 10원 %d개\n바꾸지 못한돈 ==> %d원'
print(fmt % (oman, man, ochun, chun, oback, back, oship, ship, num8))

a = random.randint(1,6)
b = random.randint(1,6)
print(a,b)
if a > b:
    print('a가이겼습니다')
elif a == b:
    print('비겼습니다')
else:
    print('b가이겼습니다')

i, hap = 0, 0

for i in range(100,201,2):
    hap+=i
    print(i)
print('%d' % hap)

for i in range(1,10):
    for k in range(1,10):
        print('파이썬 정말 재밌어요!!.^^')


gu = int(input('몇단?'))

for i in range(1,10):

