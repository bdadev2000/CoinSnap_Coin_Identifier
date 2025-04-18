package eb;

import android.os.StrictMode;
import com.facebook.r0;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f17256e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();

    /* renamed from: b, reason: collision with root package name */
    public final String f17257b;

    /* renamed from: c, reason: collision with root package name */
    public final int f17258c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f17259d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f17257b = str;
        this.f17258c = i10;
        this.f17259d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f17256e.newThread(new r0(28, this, runnable));
        newThread.setName(String.format(Locale.ROOT, "%s Thread #%d", this.f17257b, Long.valueOf(this.a.getAndIncrement())));
        return newThread;
    }
}
