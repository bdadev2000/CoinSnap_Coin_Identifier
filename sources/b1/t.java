package b1;

import java.util.concurrent.CancellationException;

/* loaded from: classes4.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final Object f22373a;

    /* renamed from: b, reason: collision with root package name */
    public final j f22374b;

    /* renamed from: c, reason: collision with root package name */
    public final q0.l f22375c;
    public final Object d;
    public final Throwable e;

    public t(Object obj, j jVar, q0.l lVar, Object obj2, Throwable th) {
        this.f22373a = obj;
        this.f22374b = jVar;
        this.f22375c = lVar;
        this.d = obj2;
        this.e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Throwable] */
    public static t a(t tVar, j jVar, CancellationException cancellationException, int i2) {
        Object obj = (i2 & 1) != 0 ? tVar.f22373a : null;
        if ((i2 & 2) != 0) {
            jVar = tVar.f22374b;
        }
        j jVar2 = jVar;
        q0.l lVar = (i2 & 4) != 0 ? tVar.f22375c : null;
        Object obj2 = (i2 & 8) != 0 ? tVar.d : null;
        CancellationException cancellationException2 = cancellationException;
        if ((i2 & 16) != 0) {
            cancellationException2 = tVar.e;
        }
        tVar.getClass();
        return new t(obj, jVar2, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return p0.a.g(this.f22373a, tVar.f22373a) && p0.a.g(this.f22374b, tVar.f22374b) && p0.a.g(this.f22375c, tVar.f22375c) && p0.a.g(this.d, tVar.d) && p0.a.g(this.e, tVar.e);
    }

    public final int hashCode() {
        Object obj = this.f22373a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        j jVar = this.f22374b;
        int hashCode2 = (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        q0.l lVar = this.f22375c;
        int hashCode3 = (hashCode2 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        Object obj2 = this.d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th = this.e;
        return hashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f22373a + ", cancelHandler=" + this.f22374b + ", onCancellation=" + this.f22375c + ", idempotentResume=" + this.d + ", cancelCause=" + this.e + ')';
    }

    public /* synthetic */ t(Object obj, j jVar, q0.l lVar, CancellationException cancellationException, int i2) {
        this(obj, (i2 & 2) != 0 ? null : jVar, (i2 & 4) != 0 ? null : lVar, (Object) null, (i2 & 16) != 0 ? null : cancellationException);
    }
}
