#클래스
#변수와 그것과 관련된 함수를 하나의 이름으로 정의한 것
#크래스는 메서드, 속성, 클래스변수, 인스턴스변수로 구성
#더붙여 생성자와 소멸자도 사용하기도 함

#클래스 정의
#class 이름:
#   클래스 변수
#   생성자
#   함수정의(메서드)

#파이썬에서는 생성자나 메서드 정의시
#암시적으로 첫번째 매개변수가 self로 지정되어 있음
#self는 항상 객체 자기 자신을 가리키는 의미로 사용

#클래스의 멤버변수는 생성자를 통해서 정의
#파이썬에서는 객체로 생성된 후에도 멤버변수(인스턴스변수)를 추가할 수 있음(비추천)

class HelloPython:
    def sayhello(self):
        print('Hello, World!!')

print(HelloPython)
print(type(HelloPython))

#HelloPython.sayhello()
py = HelloPython()
py.sayhello()

#클래스 생성
class Animal:
    type = '동물' #클래스수준 변수
    def __init__(self, name, age):  # 객체자신을 가리키는 의미로 self 사용
        self.name = name
        self.age = age

    def eat(self):
        print('먹는다')

# 객체선언 및 사용 : 객체명.메서드
#tiger = Animal()
tiger = Animal('',0)        # name과 age의 값(여기에서는 기본값을 넣었음)
print(tiger.eat())      #메서드 호출
print(tiger.type)       #인스턴스 변수
print(Animal.type)      #클래스 변수 (다른 클래스와 공유)

tiger.name = '호랑이'      #생성자를 통해 정의된 인스턴스 변수
tiger.age = 65
tiger.gender = '수컷'     #실행중에 tiger객체에 멤버변수 추가함

print(tiger.name)
print(tiger.age)
print(tiger.gender)

zibra = Animal('얼룩말', 45)
#print(zibra.gender)        #tiger의객체에서만 사용할 수 있고 다른곳에서는 사용불가

#클래스의 상속
# class 클래스명(부모클래스):
#       클래스정의
class Tiger(Animal):
    def eat(self):
        print('호랑이는 고기를 먹는다')

class zibra(Animal):
    def eat(self):
        print('얼룩말은 풀을 먹는다')

t1 = Tiger('호순이', 45)
t1.name
t1.eat()

z1 = zibra('얼룩이', 12)
z1.name
z1.eat()

animals = [ t1, z1]      #객체 지향의 다형성을 이용
for ani in animals:
    print(ani.name)
    ani.eat()
