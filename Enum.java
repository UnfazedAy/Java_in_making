enum Status{
    Failed, Sending, Success, Running;
}

public class Enum {
    public static void main(String[] args) {
        Status[] ss = Status.values();
        for (Status s: ss) {
            System.out.println(s + ": " + s.ordinal());
        }
    }
}