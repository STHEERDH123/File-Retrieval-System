package pack1;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class IndexStore {
    private Map<String, Map<File, Integer>> index;

    public IndexStore() {
        this.index = new HashMap<>();
    }

    public void update(String term, File file, int frequency) {
        
        if (!index.containsKey(term)) {
            index.put(term, new HashMap<>());
        }
        index.get(term).put(file, frequency);
    }

    public Map<File, Integer> lookup(String term) {
        
        return index.getOrDefault(term, new HashMap<>());
    }
}
