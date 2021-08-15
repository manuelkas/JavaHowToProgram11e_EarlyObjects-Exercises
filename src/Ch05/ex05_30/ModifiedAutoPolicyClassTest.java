package Ch05.ex05_30;

public class ModifiedAutoPolicyClassTest {

    public static void main(String[] args) {
        // create two ModifiedAutoPolicyClass objects
        ModifiedAutoPolicyClass policy1 =
                new ModifiedAutoPolicyClass(11111111, "Toyota Camry", "NJ");
        ModifiedAutoPolicyClass policy2 =
                new ModifiedAutoPolicyClass(22222222, "Ford Fusion", "ME");

        // add this object to test the change in setState method
        ModifiedAutoPolicyClass policy3 =
                new ModifiedAutoPolicyClass(33333, "Ford Fusion", "NJ");

        // testing the exercise
        policy3.setState("JPP");
        policy3.setState("CT");

        // display whether each policy is in a no-fault state
        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
        policyInNoFaultState(policy3);
    }

    // method that displays whether an ModifiedAutoPolicyClass
    // is in a state with no-fault auto insurance. All right.
    public static void policyInNoFaultState(ModifiedAutoPolicyClass policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s;%nState %s %s a no-fault state%n%n",
                policy.getAccountNumber(), policy.getMakeAndModel(),
                policy.getState(),
                (policy.isNoFaultState() ? "is" : "is not"));
    }
}
