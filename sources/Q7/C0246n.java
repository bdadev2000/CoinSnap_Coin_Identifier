package Q7;

import java.util.concurrent.CancellationException;

/* renamed from: Q7.n, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0246n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2571a;
    public final H b;

    /* renamed from: c, reason: collision with root package name */
    public final F7.l f2572c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f2573d;

    /* renamed from: e, reason: collision with root package name */
    public final Throwable f2574e;

    public C0246n(Object obj, H h6, F7.l lVar, Object obj2, Throwable th) {
        this.f2571a = obj;
        this.b = h6;
        this.f2572c = lVar;
        this.f2573d = obj2;
        this.f2574e = th;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.Throwable] */
    public static C0246n a(C0246n c0246n, H h6, CancellationException cancellationException, int i9) {
        Object obj = c0246n.f2571a;
        if ((i9 & 2) != 0) {
            h6 = c0246n.b;
        }
        H h9 = h6;
        F7.l lVar = c0246n.f2572c;
        Object obj2 = c0246n.f2573d;
        CancellationException cancellationException2 = cancellationException;
        if ((i9 & 16) != 0) {
            cancellationException2 = c0246n.f2574e;
        }
        c0246n.getClass();
        return new C0246n(obj, h9, lVar, obj2, cancellationException2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0246n)) {
            return false;
        }
        C0246n c0246n = (C0246n) obj;
        if (G7.j.a(this.f2571a, c0246n.f2571a) && G7.j.a(this.b, c0246n.b) && G7.j.a(this.f2572c, c0246n.f2572c) && G7.j.a(this.f2573d, c0246n.f2573d) && G7.j.a(this.f2574e, c0246n.f2574e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i9 = 0;
        Object obj = this.f2571a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        H h6 = this.b;
        if (h6 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = h6.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        F7.l lVar = this.f2572c;
        if (lVar == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = lVar.hashCode();
        }
        int i12 = (i11 + hashCode3) * 31;
        Object obj2 = this.f2573d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i13 = (i12 + hashCode4) * 31;
        Throwable th = this.f2574e;
        if (th != null) {
            i9 = th.hashCode();
        }
        return i13 + i9;
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f2571a + ", cancelHandler=" + this.b + ", onCancellation=" + this.f2572c + ", idempotentResume=" + this.f2573d + ", cancelCause=" + this.f2574e + ')';
    }

    public /* synthetic */ C0246n(Object obj, H h6, F7.l lVar, CancellationException cancellationException, int i9) {
        this(obj, (i9 & 2) != 0 ? null : h6, (i9 & 4) != 0 ? null : lVar, (Object) null, (i9 & 16) != 0 ? null : cancellationException);
    }
}
