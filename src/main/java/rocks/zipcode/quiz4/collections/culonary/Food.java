package rocks.zipcode.quiz4.collections.culonary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author leon on 27/12/2018.
 */
public class Food {

    List<Spice> spices = new ArrayList<>();

    public List<Spice> getAllSpices() {
        return spices;
    }

    public Map<Class<? extends Spice>, Integer> getSpiceCount() {
        Map<Class<? extends Spice>, Integer> spiceMap = new HashMap<>();

        for (Spice s : spices) {
            Class<? extends Spice> key = s.getClass();

            if (spiceMap.containsKey(key)) {
                spiceMap.put(key, spiceMap.get(key) + 1);
            } else {
                spiceMap.put(key, 1);
            }
        }

        return spiceMap;
    }

    public void applySpice(Spice spice) {
        spices.add(spice);
    }
}
