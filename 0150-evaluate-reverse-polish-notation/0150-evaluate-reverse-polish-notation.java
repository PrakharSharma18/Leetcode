class Solution {
    public int evalRPN(String[] tokens) {
      
        List<String> list = new ArrayList<>(Arrays.asList(tokens));

      while (list.size() > 1) {
            for (int i = 0; i < list.size(); i++) {
                String token = list.get(i);

                if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
                    int num1 = Integer.parseInt(list.get(i - 2));
                    int num2 = Integer.parseInt(list.get(i - 1));
                    int res = 0;

                    if (token.equals("+")) {
                        res = num1 + num2;
                    } else if (token.equals("-")) {
                        res = num1 - num2;
                    } else if (token.equals("*")) {
                        res = num1 * num2;
                    } else if (token.equals("/")) {
                        res = num1 / num2;
                    }
                    list.set(i - 2, String.valueOf(res));
                    list.remove(i - 1); 
                    list.remove(i - 1); 
                    break;
                }
            }
        }

        return Integer.parseInt(list.get(0));
    }
}
