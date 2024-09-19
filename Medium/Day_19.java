class Solution 
{

    public List<Integer> diffWaysToCompute(String expression) 
    {
        List<Integer> res = new ArrayList<>();

        if (expression.length() == 0) 
        return res;

        if (expression.length() == 1) 
        {
            res.add(Integer.parseInt(expression));
            return res;
        }

        if (expression.length() == 2 && Character.isDigit(expression.charAt(0))) 
        {
            res.add(Integer.parseInt(expression));
            return res;
        }

        for (int i = 0; i < expression.length(); i++) 
        {
            char current = expression.charAt(i);

            if (Character.isDigit(current)) continue;

            List<Integer> left = diffWaysToCompute(expression.substring(0, i));

            List<Integer> right = diffWaysToCompute(expression.substring(i + 1));

            for (int leftValue : left) 
            {
                for (int rightValue : right) 
                {
                    int compute = 0;

                    switch (current) 
                    {
                        case '+':
                            compute = leftValue + rightValue;
                            break;
                        case '-':
                            compute = leftValue - rightValue;
                            break;
                        case '*':
                            compute = leftValue * rightValue;
                            break;
                    }

                    res.add(compute);
                }
            }
        }

        return res;
    }
}