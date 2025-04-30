package u4;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: u4.B, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2755B {

    /* renamed from: a, reason: collision with root package name */
    public static final ExecutorService f23108a = AbstractC2762g.a("awaitEvenIfOnMainThread task continuation executor");

    public static Object a(Task task) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        task.continueWith(f23108a, new C2781z(countDownLatch, 1));
        if (Looper.getMainLooper() == Looper.myLooper()) {
            countDownLatch.await(3L, TimeUnit.SECONDS);
        } else {
            countDownLatch.await(4L, TimeUnit.SECONDS);
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (!task.isCanceled()) {
            if (task.isComplete()) {
                throw new IllegalStateException(task.getException());
            }
            throw new TimeoutException();
        }
        throw new CancellationException("Task is already canceled");
    }
}
