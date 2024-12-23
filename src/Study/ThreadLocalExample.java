package Study;

import Class.MyData;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadLocalExample {

    public static void main(String[] args) {
        // 创建 ThreadLocal 对象
        ThreadLocal<MyData> threadLocal = new ThreadLocal<MyData>() {
            @Override
            protected MyData initialValue() {
                return new MyData();
            }
        };

        // 创建线程池
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 提交任务到线程池
        for (int i = 0; i < 5; i++) {
            int taskId = i;
            executorService.submit(() -> {
                MyData data = threadLocal.get(); // 获取线程局部变量
                data.setValue((int) Thread.currentThread().getId()); // 设置线程局部变量的值

                // 在线程中使用 data
                System.out.println("Thread " + Thread.currentThread().getName() + " has value: " + data.getValue());

                // 清理线程局部变量（可选）
                threadLocal.remove();
            });
        }

        // 关闭线程池
        executorService.shutdown();
    }
}

