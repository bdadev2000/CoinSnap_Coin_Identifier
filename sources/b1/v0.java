package b1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class v0 implements Runnable, Comparable, q0 {

    @Nullable
    private volatile Object _heap;

    /* renamed from: a, reason: collision with root package name */
    public long f22382a;

    /* renamed from: b, reason: collision with root package name */
    public int f22383b = -1;

    public v0(long j2) {
        this.f22382a = j2;
    }

    public final g1.f0 a() {
        Object obj = this._heap;
        if (obj instanceof g1.f0) {
            return (g1.f0) obj;
        }
        return null;
    }

    public final int c(long j2, w0 w0Var, x0 x0Var) {
        synchronized (this) {
            if (this._heap == f0.f22307b) {
                return 2;
            }
            synchronized (w0Var) {
                try {
                    v0[] v0VarArr = w0Var.f30608a;
                    v0 v0Var = v0VarArr != null ? v0VarArr[0] : null;
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = x0.f22392h;
                    x0Var.getClass();
                    if (x0.f22394j.get(x0Var) != 0) {
                        return 1;
                    }
                    if (v0Var == null) {
                        w0Var.f22387c = j2;
                    } else {
                        long j3 = v0Var.f22382a;
                        if (j3 - j2 < 0) {
                            j2 = j3;
                        }
                        if (j2 - w0Var.f22387c > 0) {
                            w0Var.f22387c = j2;
                        }
                    }
                    long j4 = this.f22382a;
                    long j5 = w0Var.f22387c;
                    if (j4 - j5 < 0) {
                        this.f22382a = j5;
                    }
                    w0Var.a(this);
                    return 0;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j2 = this.f22382a - ((v0) obj).f22382a;
        if (j2 > 0) {
            return 1;
        }
        return j2 < 0 ? -1 : 0;
    }

    @Override // b1.q0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                android.support.v4.media.session.i iVar = f0.f22307b;
                if (obj == iVar) {
                    return;
                }
                w0 w0Var = obj instanceof w0 ? (w0) obj : null;
                if (w0Var != null) {
                    synchronized (w0Var) {
                        if (a() != null) {
                            w0Var.b(this.f22383b);
                        }
                    }
                }
                this._heap = iVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e(w0 w0Var) {
        if (this._heap == f0.f22307b) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        this._heap = w0Var;
    }

    public String toString() {
        return "Delayed[nanos=" + this.f22382a + ']';
    }
}
