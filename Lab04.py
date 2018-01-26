# 30 while문을 이용 100이상10000미만 5의배수 합구하기
number = 100
isloot = True
sumnum = 0
while isloot:
    if number >= 10000:
        isloot = False

    sumnum += number
    number += 5

    print(sumnum)

# 34 화씨(F)를 섭씨(c)로 변환하는 프로그램 작성
# 섭씨 = (100/180) x (화씨 - 32)

F = 0
C = 0
isloot = True
while isloot:
    F = int(input('섭씨로 변환하려는 화씨를 입력하세요 종료(0입력)'))
    if F > 0 :
        C = (100/180)*(F-32)
        print('섭씨는 %d 입니다' % (C))

    elif F == 0:
        print('프로그램을 종료합니다')
        isloot = False

    else:
        print('숫자로 입력하세요')

# 35 잔돈 계산 프로그램




