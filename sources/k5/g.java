package k5;

import com.applovin.impl.L;

/* loaded from: classes2.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public long f21483a;
    public long b;

    public void a(long j7) {
        if (j7 >= 0) {
            this.b = j7;
            return;
        }
        throw new IllegalArgumentException(L.j("Minimum interval between fetches has to be a non-negative number. ", j7, " is an invalid argument"));
    }
}
