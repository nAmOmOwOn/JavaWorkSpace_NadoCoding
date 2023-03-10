package My_Try2;

class Cal implements PCal {
    public void doCal(String[] args) throws AddZeroException {
        try {
            if (args[1].equals("add")) {
                if (args[0].equals("0")) {
                    throw new AddZeroException(args[2]);
                } else if (args[2].equals("0")) {
                    throw new AddZeroException(args[0]);
                }
            }

            int op1 = Integer.parseInt(args[0]);
            String op = args[1];
            int op2 = Integer.parseInt(args[2]);

            if (op.equals("add")) {
                System.out.println(op1 + op2);
            } else if (op.equals(("sub"))) {
                System.out.println(op1 - op2);

            } else if (op.equals(("mul"))) {
                System.out.println(op1 * op2);
            } else if (op.equals("div")) {
                System.out.println(op1 / op2);
            }
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("finally");
        }
    }
}

