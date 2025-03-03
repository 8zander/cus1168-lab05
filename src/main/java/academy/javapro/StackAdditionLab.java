package academy.javapro;

public class StackAdditionLab {
    public static void main(String[] args) {
        // Test case 1: Basic operations and addition
        System.out.println("=== Test Case 1: Basic Addition ===");
        ArrayStack<Integer> stack = new ArrayStack<>();
        System.out.println("Is stack empty? " + stack.isEmpty());  // Should print true

        stack.push(10);
        stack.push(20);
        System.out.println("Stack size: " + stack.size());  // Should print 2
        System.out.println(stack.getStats());  // Print stack statistics
        System.out.println(ArrayStack.getGlobalStats());  // Print global statistics

        stack.addTopTwo();
        Integer result = stack.pop();
        System.out.println("Result of addition: " + result);  // Should print 30

        // Test case 2: Resizing
        System.out.println("\n=== Test Case 2: Array Resizing ===");
        ArrayStack<Integer> resizeStack = new ArrayStack<>();
        System.out.println("Pushing 15 elements to trigger resize...");
        for (int i = 1; i <= 15; i++) {
            resizeStack.push(i);
        }
        System.out.println("Stack size after pushing 15 elements: " + resizeStack.size());  // Should print 15
        System.out.println(resizeStack.getStats());  // Print stack statistics
        
        System.out.println("\n=== Test Case 3: Multiple Stack Instances ===");
        ArrayStack<Double> floatStack = new ArrayStack<>();
        floatStack.push(1.5);
        floatStack.push(2.5);
        floatStack.push(3.5);
        System.out.println(floatStack.getStats());  // Print first stack statistics
        System.out.println(resizeStack.getStats());  // Print statistics for resizeStack
        System.out.println(floatStack.getStats());  // Print statistics for floatStack
        System.out.println(ArrayStack.getGlobalStats());  // Print global statistics
    }
}
