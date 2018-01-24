# 성적 처리 프로그램 함수로 작성
# 총점 - getTotal()
# 평균 - getAverage()
# 학점 - getGrade()

print('-- 성적 처리 프로그램 v2 --')
name = input('이름을 입력하세요')
kor = int(input('국어점수를 입력하세요'))
eng = int(input('영어점수를 입력하세요'))
mat = int(input('수학점수를 입력하세요'))
# 함수만 선언하고 내용작성을 나중에 하고 싶을때 - pass 명령어 사용 (pass - dummy code)
def getTotal():
    tot = kor + eng + mat
    return tot          #출력을 밖에서 할 수 있게 return 사용

def getAverage():
    avg = getTotal()/3
    return avg

def getGrade():
    avg = getAverage()
    grd = '가'
    if avg >= 90:
        grd ='수'
    elif avg >= 80:
        grd = '우'
    elif avg >= 70:
        grd = '미'
    elif avg >= 60:
        grd = '양'
    return grd

fmt = '%s %d %d %d %d %.1f %s'
print(fmt % (name,kor,eng,mat,getTotal(),getAverage(),getGrade()))
