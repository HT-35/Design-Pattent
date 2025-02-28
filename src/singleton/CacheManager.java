package singleton;

import java.util.HashMap;
import java.util.Map;

public class CacheManager {

    // bước 1 khởi tạo instance của class theo mô hình Singleton
    private static CacheManager instance;
    // Map lưu trữ kiểu dữ liệu cache với dạng key-value
    private final Map<String, String> cache;

    // Constructor để ngăng chặn việc khởi tạo instance từ bên ngoài
    // vì constructor không nhận giá trị đầu vào và gắn kiểu dữ liệu trực tiếp cho instance nên ngăn được việc khởi tạo instance từ bên ngoài
    private CacheManager() {
        this.cache = new HashMap<>();
    }

    // trường hợp getInstance mà instance là null thì sẽ gán instance cho phương thức CacheMa
    public static CacheManager getInstance() {
        if (instance == null) {
            instance = new CacheManager();
        }

        return instance;
    }


    // các phương thức sử dụng với hàm giá trị
    public void put(String key, String value) {
        cache.put(key, value);
    }

    // các phương thức sử dụng với hàm giá trị
    public String get(String key) {
        return cache.get(key);
    }

    // các phương thức sử dụng với hàm giá trị
    public void remove(String key) {
        cache.remove(key);
    }

    // các phương thức sử dụng với hàm giá trị
    public boolean checkContainsKey(String key){
        return cache.containsKey(key);
    }



}
