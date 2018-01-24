#클래스를 이용해서 성적처리 프로그램 작성









#print('이름=%s 국어점수=%d 영어점수=%d 수학점수=%d 총점=%d 평균점수=%.1f 학점=%s' % (sj.name, sj.kor, sj.eng, sj.mat, sj.getTotal(), sj.getAverage(),sj.getGrade()))

class SungJukVO:

    def __init__(self,name,kor,eng,mat):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.mat = mat

class SungJukService:

    def getTotal(self, sj):
        tot = sj.kor + sj.eng + sj.mat
        return tot

    def getAverage(self):
        avg = self.getTotal(sj)/3
        return avg

    def getGrade(self):
        grdlist = '가가가가가가미양우수수'
        var = int(self.getAverage()/10) #0~10까지의 수를 만들기 위해 10으로 나눔(배열의 인덱스 추출을 위해서)
        grd = grdlist[var]              #만들어진 0~10까지의 값이 있는 변수를 배열 인덱스의 값으로 사용
        return grd


sj = SungJukVO('지현', 98, 74, 69)
print(sj.name)
print(sj.kor)
print(sj.eng)
print(sj.mat)

sjsrv = SungJukService()
print(sjsrv.getTotal(sj))
print('%.1f' % (sjsrv.getAverage()))
print(sjsrv.getGrade())