class Chapter:
    def __init__(self, number, page, marks, name):
        self.number = number
        self.page = page
        self.marks = marks
        self.name = name


class Exam:
    def __init__(self, examName, chapterList):
        self.examName = examName
        self.chapterList = chapterList

    def findMinimumChapeterByMarks(self):
        if len(self.chapterList) == 0:
            return None
        return min(self.chapterList, key=lambda x: x.marks)

    def sortChapterByPage(self):
        if len(self.chapterList) == 0:
            return None
        return sorted(self.chapterList, key=lambda x: x.marks)


n = int(input())
chapterList = []
for i in range(n):
    number = input()
    page = float(input())
    marks = int(input())
    name = input()
    chapterList.append(Team(number, page, marks, name))

exam = Exam("KKR", chapterList)
r1 = exam.findMinimumChapeterByMarks()
r2 = exam.sortChapterByPage()
if r1 == None:
    print('No Data Found')
else:
    print(r1.number, r1.page, r1.marks, r1.name, sep="\n")
if r2 == None:
    print('No Data Found')
else:
    for x in r2:
        print(x.marks)
