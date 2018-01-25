from datetime import datetime
#날짜 추가하려면 datetime 패키지 추가 (날짜와 시간을 다루는 패키지)
from project.v3 import sjvo
class SungJuk:

    #생성자
    def __init__(self, name, kor, eng, mat):
        self.sjno = 0
        self.name = name
        self.kor = kor
        self.eng = eng
        self.mat = mat
        self.tot = 0
        self.avg = 0.0
        self.grd = '가'
        self.regdate = str(datetime.now())

    def to_str(self):
        fmt = '[번호: %s 이름: %s 국어: %d 영어: %d 수학: %d 총점: %d 평균: %1.f 학점: %s 등록일: %s] \n'
        return fmt % (self.sjno, self.name, self.kor,
                      self.eng, self.mat, self.tot,
                      self.avg, self.grd, self.regdate[:19])

    def to_str_list(self):
        fmt = '[번호: %s 이름: %s 국어: %d 영어: %d 수학: %d 등록일: %s] \n'
        return fmt % (self.sjno, self.name, self.kor,
                      self.eng, self.mat, self.regdate[:10])

