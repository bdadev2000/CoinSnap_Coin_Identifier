package m0;

/* renamed from: m0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2456e {

    /* renamed from: a, reason: collision with root package name */
    public final long f21667a;
    public final long b;

    public C2456e(long j7, long j9) {
        if (j9 == 0) {
            this.f21667a = 0L;
            this.b = 1L;
        } else {
            this.f21667a = j7;
            this.b = j9;
        }
    }

    public final String toString() {
        return this.f21667a + "/" + this.b;
    }
}
