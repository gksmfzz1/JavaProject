import sys
from project.v3 import sjvo , sjsrv
#현재 위치를 지정하려면 . 으로 입력가능

class SungJukV3Main:

    #성적 처리 서비스 객체 생성
    sjsrv = sjsrv.SungJukService()

    #메뉴 표시
    def displayMenu(self):
        str_list = []
        str_list.append(" -= 성적 처리 프로그램 v3 =- \n")
        str_list.append("------------------------\n")
        str_list.append(" 1 : 새로운 성적데이터 추가 \n")
        str_list.append(" 2 : 전체 성적데이터 조회 \n")
        str_list.append(" 3 : 성적데이터 상세 조회 \n")
        str_list.append(" 4 : 성적데이터 수정 \n")
        str_list.append(" 5 : 성적데이터 삭제 \n")
        str_list.append(" 0 : 성적처리프로그램 종료 \n")
        str_list.append("------------------------\n")
        str_list.append("실행할 작업을 선택하세요 >> ")

        print( ''.join(str_list) )

    # 성적 추가 메뉴
    def newSungJuk(self):
        str_list = []
        str_list.append("\n\n추가할 성적데이터를 입력하세요")
        str_list.append("\n데이터 입력순서는 이름/국어/영어/수학 입니다")
        str_list.append("\n예) 수지 78 65 21")

        print(''.join(str_list))

        n, k, e, m = input('').split()
        #성적데이터를 한줄에서 공백으로 구분해서 입력받음

        #입력받은 성적데이터로 성적객체 생성
        sj = sjvo.SungJuk(n, int(k), int(e), int(m))

        #성적객체를 추가함
        self.sjsrv.addSungJuk(sj)

        print("\n성적 데이터 성공적으로 저장!!\n\n")

    # 성적 전체 출력 메뉴
    def showSungJuk(self):
        str_list = []
        str_list.append("\n\n -= 전체 데이터 출력 =- \n")
        for sj in self.sjsrv.getSungJuk():
            #리스트 형태로 return 된 것을
            #for문으로 다시 하나씩 순환하며 출력
            str_list.append(sj)
        str_list.append("\n\n");

        print(''.join(str_list))

    # 성적 상세 출력 메뉴
    def showOneSungJuk(self):
        no = input("\n검색할 성적번호를 입력하세요\n>>")

        str_list = []
        print("\n\n -= 상세 성적 데이터 =- \n")
        str_list.append(self.sjsrv.getOneSungJuk( int(no)))
        print('\n\n')

        print(''.join(str_list))
    # 성적 수정 메뉴
    def updateSungJuk(self):
        no = input("\n수정할 성적번호를 입력하세요\n>>")

        str_list = []
        str_list.append("\n\n수정할 성적데이터를 입력하세요")
        str_list.append("\n데이터 입력순서는 이름/국어/영어/수학 입니다")
        str_list.append("\n예) 수지 78 65 21")

        print(''.join(str_list))

        n, k, e, m = input('').split()

        sj = sjvo.SungJuk(n, int(k), int(e), int(m))
        sj.sjno = int(no)
        self.sjsrv.modifySungJuk(sj)
        print("\n\n수정 성공!!\n\n")

    # 성적 삭제 메뉴
    def deleteSungJuk(self):
        no = input("\n삭제할 성적번호를 입력하세요\n>>")

        self.sjsrv.removeSungJuk(int(no))
        print("\n\n삭제 성공!!\n\n")

    # 프로그램 종료
    def exitSungJuk(self):
        sys.exit(1)

    # 파이썬에서는 switch 대신 dictinary를 이용해서
    # 메뉴항목에 대한 처리 정의



    # 파이썬 자료구조중 dictionary를 이용해서
    # 메뉴 분기시 실행할 함수를 객체형태로 저장
    menus = {'1': newSungJuk, '2': showSungJuk, '3': showOneSungJuk,
             '4': updateSungJuk, '5': deleteSungJuk, '0': exitSungJuk}

    # 메뉴처리
    def selectMenu(self):
        menu = input('')
        self.menus[menu](self)
        # if (menu == 1): newSungJuk()
        # elif (menu == 2): showSungJuk()
        # elif (menu == 3): showOneSungJuk()
        # elif (menu == 4): updateSungJuk()
        # elif (menu == 5): deleteSungJuk()
        # elif (menu == 0): exitSungJuk()

