class Solution:
    def dailyTemperatures(self, temperatures: List[int]) -> List[int]:
        indexStack = []
        result = [0] * len(temperatures)
        for i in range(len(temperatures)):
            if i>0:
                while(indexStack
                and temperatures[indexStack[-1]]<temperatures[i]):
                    index = indexStack.pop()
                    diff = i - index
                    result[index] = diff
            indexStack.append(i)
        return result