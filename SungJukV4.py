class SungJuk:
    type = '성적처리 프로그램'
    name = ' '
    kor = 0
    eng = 0
    mat = 0


    def __init__(self,name,kor,eng,mat):
        self.name = name
        self.kor = kor
        self.eng = eng
        self.mat = mat

    def getTotal():
        tot = kor + eng + mat
        return tot

    def getAverage(self):
        avg = tot/3
        return avg

    def getGrade(self):
        avg = getAverage()
        grd = '가'
        if avg>=90:
            grd ='수'
        elif avg>=80:
            grd ='우'
        elif avg>=70:
            grd ='미'
        elif avg>=60:
            grd ='양'


sj = SungJuk('혜교',90,80,70)
sj.getTotal()

