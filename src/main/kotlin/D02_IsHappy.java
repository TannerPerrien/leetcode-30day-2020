import java.util.HashSet;

class D02_IsHappy {
    public boolean isHappy(int n) {
        HashSet<Integer> visited = new HashSet<>();
        
        while (true) {
            if (visited.contains(n)) {
                return false;
            }
            visited.add(n);
            int temp = n;
            int next = 0;
            while(temp > 0) {
                int digit = temp % 10;
                next += digit * digit;
                temp = temp / 10;
            }
            if (next == 1) {
                return true;
            }
            n = next;
        }
    }

    public static void main(String[] args) {
        System.out.println(new D02_IsHappy().isHappy(19));
    }
}
