def myfunc(param):
    param ='함수 안에서 생성'
    print(param)

param = ' 함수밖에서 생성'
print(param)
myfunc(param)

del param
def myfunc2():
    global param # 함수내에서 전역변수 호출
    param = '함수에서 전역변수 수정'
    print(param)

param = '함수 밖에서 생성'
print(param)
myfunc(param)
myfunc2()

#함수 내에서 전역변수 사용하기
#함수 내에서 실행한 결과값을 외부에 전달해야 할 필요가 있을 때 사용


#def count():
#    times += 1
#    print(times)

#count()  #times의 기본값을 지정해주지 않았기 때문에 출력할 수 없음
            # count함수안에서 times의 기본값을 지정해주면 계속 같은 값이 나옴

def count():
    global times
    times += 1
    print(times)
# 글로벌 변수로 지정해주고
# 사용하기전 기본값을 지정해 주면 count함수안에 매개변수를 넣지 않아도 출력가능
times = 0
count()