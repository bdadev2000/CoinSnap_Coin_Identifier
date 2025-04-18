package u7;

import android.os.SystemClock;

/* loaded from: classes3.dex */
public final class m0 {
    public Exception a;

    /* renamed from: b, reason: collision with root package name */
    public long f25591b;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.a == null) {
            this.a = exc;
            this.f25591b = 100 + elapsedRealtime;
        }
        if (elapsedRealtime >= this.f25591b) {
            Exception exc2 = this.a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.a;
            this.a = null;
            throw exc3;
        }
    }
}
