public class Solution500 {
    // only python3 version
    /*
    * class Solution(object):

    def inRow(self,word):
        word = word.lower()
        row1 ="qwertyuiop";
        row2 ="asdfghjkkl";
        row3 ="zxcvbnm";
        test = ""
        if word[0] in row1:
            test = row1
        elif word[0] in row2:
            test = row2
        elif word[0] in row3:
            test = row3

        for i in word:
            if not i in test:
                return False
        return True

    def findWords(self, words):
        """
        :type words: List[str]
        :rtype: List[str]
        """
        rs = []
        for i in words:
            if self.inRow(i):
                rs.append(i)

        return rs
    * */
}
