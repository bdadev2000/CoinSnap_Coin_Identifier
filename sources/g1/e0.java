package g1;

/* loaded from: classes3.dex */
public final class e0 implements h0.k {

    /* renamed from: a, reason: collision with root package name */
    public final ThreadLocal f30605a;

    public e0(ThreadLocal threadLocal) {
        this.f30605a = threadLocal;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e0) && p0.a.g(this.f30605a, ((e0) obj).f30605a);
    }

    public final int hashCode() {
        return this.f30605a.hashCode();
    }

    public final String toString() {
        return "ThreadLocalKey(threadLocal=" + this.f30605a + ')';
    }
}
