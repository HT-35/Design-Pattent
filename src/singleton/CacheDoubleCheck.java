package singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheDoubleCheck {

    private static volatile CacheDoubleCheck instance;

    private final Map<String, String> cache;

    private CacheDoubleCheck(){
         cache = new HashMap<>();
    }


    public static CacheDoubleCheck getInstance(){
        if (instance == null){
            synchronized (CacheDoubleCheck.class){
                if (instance == null){
                    instance = new CacheDoubleCheck();
                }
            }
        }
        return instance;
    }


    // Thêm dữ liệu vào cache
    public void put(String key, String value) {
        cache.put(key, value);
    }

    // Lấy dữ liệu từ cache theo key
    public String get(String key) {
        return cache.get(key);
    }

    // Xóa dữ liệu theo key
    public void remove(String key) {
        cache.remove(key);
    }

    // Kiểm tra xem key có tồn tại trong cache không
    public boolean containsKey(String key) {
        return cache.containsKey(key);
    }

}
