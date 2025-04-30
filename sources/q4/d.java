package Q4;

import O4.k;
import R3.e;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final long f2518d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f2519e = TimeUnit.MINUTES.toMillis(30);

    /* renamed from: a, reason: collision with root package name */
    public final k f2520a;
    public long b;

    /* renamed from: c, reason: collision with root package name */
    public int f2521c;

    public d() {
        if (e.f2642c == null) {
            Pattern pattern = k.f2194c;
            e.f2642c = new e(10);
        }
        e eVar = e.f2642c;
        if (k.f2195d == null) {
            k.f2195d = new k(eVar);
        }
        this.f2520a = k.f2195d;
    }

    public final synchronized boolean a() {
        boolean z8;
        if (this.f2521c != 0) {
            this.f2520a.f2196a.getClass();
            if (System.currentTimeMillis() <= this.b) {
                z8 = false;
            }
        }
        z8 = true;
        return z8;
    }

    public final synchronized void b(int i9) {
        long min;
        if ((i9 < 200 || i9 >= 300) && i9 != 401 && i9 != 404) {
            this.f2521c++;
            synchronized (this) {
                if (i9 != 429 && (i9 < 500 || i9 >= 600)) {
                    min = f2518d;
                } else {
                    double pow = Math.pow(2.0d, this.f2521c);
                    this.f2520a.getClass();
                    min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f2519e);
                }
                this.f2520a.f2196a.getClass();
                this.b = System.currentTimeMillis() + min;
            }
            return;
        }
        synchronized (this) {
            this.f2521c = 0;
        }
        return;
    }
}
