name_list = []
kor_list = []
eng_list = []
mat_list = []

tot_list = []
avg_list = []
grd_list = []



print('-- 성적 처리 프로그램 v3 --')
name_list.append(input('이름을 입력하세요'))
kor_list.append(int(input('국어점수를 입력하세요')))
eng_list.append(int(input('영어점수를 입력하세요')))
mat_list.append(int(input('수학점수를 입력하세요')))

tot_list.append(kor_list[0] + eng_list[0] + mat_list[0])
avg_list.append(tot_list[0]/3)

def grade():
    avg = avg_list[0]
    grd = '가'
    if avg >= 90:
        grd = '수'
    elif avg >= 80:
        grd = '우'
    elif avg >= 70:
        grd = '미'
    elif avg >= 60:
        grd = '양'
    return grd

grd_list.append(grade())

fmt = '%s %d %d %d %d %.1f %s'

print(fmt % (name_list[0], kor_list[0], eng_list[0], mat_list[0], tot_list[0], avg_list[0], grd_list[0]))

