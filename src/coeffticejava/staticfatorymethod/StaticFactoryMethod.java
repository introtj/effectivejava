package coeffticejava.staticfatorymethod;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class StaticFactoryMethod {

    private StaticFactoryMethod() {
    }


    public static <K, V> Map<K, V> someMap(Map<K, V> map) {
        return new SomeMap<>(map);
    }


    private static class SomeMap<K, V> implements Map<K, V> {

        private final Map<K, V> m;

        public SomeMap(Map<K, V> map) {
            this.m = map;
        }

        @Override
        public int size() {
            return this.m.size();
        }

        @Override
        public boolean isEmpty() {
            return this.m.isEmpty();
        }

        @Override
        public boolean containsKey(Object key) {
            return this.m.containsKey(key);
        }

        @Override
        public boolean containsValue(Object value) {
            return this.m.containsValue(value);
        }

        @Override
        public V get(Object key) {
            return this.m.get(key);
        }

        @Override
        public V put(K key, V value) {
            return this.m.put(key, value);
        }

        @Override
        public V remove(Object key) {
            return this.m.remove(key);
        }

        @Override
        public void putAll(Map<? extends K, ? extends V> m) {
            this.m.putAll(m);
        }

        @Override
        public void clear() {
            this.m.clear();
        }

        @Override
        public Set<K> keySet() {
            return this.m.keySet();
        }

        @Override
        public Collection<V> values() {
            return this.m.values();
        }

        @Override
        public Set<Entry<K, V>> entrySet() {
            return this.m.entrySet();
        }
    }

}
