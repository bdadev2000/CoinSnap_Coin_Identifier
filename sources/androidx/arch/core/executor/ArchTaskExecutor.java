package androidx.arch.core.executor;

import android.os.Looper;
import androidx.annotation.RestrictTo;

@RestrictTo
/* loaded from: classes4.dex */
public class ArchTaskExecutor extends TaskExecutor {

    /* renamed from: b, reason: collision with root package name */
    public static volatile ArchTaskExecutor f1301b;

    /* renamed from: c, reason: collision with root package name */
    public static final a f1302c = new a(1);

    /* renamed from: a, reason: collision with root package name */
    public final DefaultTaskExecutor f1303a = new DefaultTaskExecutor();

    public static ArchTaskExecutor a() {
        if (f1301b != null) {
            return f1301b;
        }
        synchronized (ArchTaskExecutor.class) {
            try {
                if (f1301b == null) {
                    f1301b = new ArchTaskExecutor();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f1301b;
    }

    public final void b(Runnable runnable) {
        DefaultTaskExecutor defaultTaskExecutor = this.f1303a;
        if (defaultTaskExecutor.f1306c == null) {
            synchronized (defaultTaskExecutor.f1304a) {
                try {
                    if (defaultTaskExecutor.f1306c == null) {
                        defaultTaskExecutor.f1306c = DefaultTaskExecutor.a(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        defaultTaskExecutor.f1306c.post(runnable);
    }
}
