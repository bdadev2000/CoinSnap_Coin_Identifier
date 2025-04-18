package fc;

import com.facebook.internal.m;
import dc.k;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
public final class e {

    /* renamed from: d, reason: collision with root package name */
    public static final long f17787d = TimeUnit.HOURS.toMillis(24);

    /* renamed from: e, reason: collision with root package name */
    public static final long f17788e = TimeUnit.MINUTES.toMillis(30);
    public final k a;

    /* renamed from: b, reason: collision with root package name */
    public long f17789b;

    /* renamed from: c, reason: collision with root package name */
    public int f17790c;

    public e() {
        if (m.f11048b == null) {
            Pattern pattern = k.f16988c;
            m.f11048b = new m();
        }
        m mVar = m.f11048b;
        if (k.f16989d == null) {
            k.f16989d = new k(mVar);
        }
        this.a = k.f16989d;
    }

    public final synchronized void a(int i10) {
        boolean z10;
        long min;
        boolean z11 = false;
        if ((i10 < 200 || i10 >= 300) && i10 != 401 && i10 != 404) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            synchronized (this) {
                this.f17790c = 0;
            }
            return;
        }
        this.f17790c++;
        synchronized (this) {
            if (i10 == 429 || (i10 >= 500 && i10 < 600)) {
                z11 = true;
            }
            if (!z11) {
                min = f17787d;
            } else {
                double pow = Math.pow(2.0d, this.f17790c);
                this.a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), f17788e);
            }
            this.a.a.getClass();
            this.f17789b = System.currentTimeMillis() + min;
        }
        return;
    }
}
