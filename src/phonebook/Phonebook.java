package phonebook;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Phonebook {

    Map<FullName, String> phonebook = new HashMap<>();

    public void addPhone(FullName fullname, String phoneNumber) {
        phonebook.put(fullname, phoneNumber);
    }

    public Set<Map.Entry<FullName, String>> getEntries() {
        return phonebook.entrySet();
    }

    @Override
    public String toString() {
        return
                  phonebook + "."
                ;
    }
}
