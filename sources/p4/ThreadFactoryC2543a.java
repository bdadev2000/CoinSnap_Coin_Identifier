package p4;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: p4.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ThreadFactoryC2543a implements ThreadFactory {

    /* renamed from: e, reason: collision with root package name */
    public static final ThreadFactory f22217e = Executors.defaultThreadFactory();

    /* renamed from: a, reason: collision with root package name */
    public final AtomicLong f22218a = new AtomicLong();
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22219c;

    /* renamed from: d, reason: collision with root package name */
    public final StrictMode.ThreadPolicy f22220d;

    public ThreadFactoryC2543a(String str, int i9, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.f22219c = i9;
        this.f22220d = threadPolicy;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f22217e.newThread(new com.facebook.appevents.k(19, this, runnable));
        Locale locale = Locale.ROOT;
        newThread.setName(this.b + " Thread #" + this.f22218a.getAndIncrement());
        return newThread;
    }
}
