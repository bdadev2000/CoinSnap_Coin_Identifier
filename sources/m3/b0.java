package m3;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class b0 {
    public final Object a;

    /* renamed from: b, reason: collision with root package name */
    public final Throwable f21521b;

    public b0(j jVar) {
        this.a = jVar;
        this.f21521b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        Object obj2 = this.a;
        if (obj2 != null && obj2.equals(b0Var.a)) {
            return true;
        }
        Throwable th2 = this.f21521b;
        if (th2 == null || b0Var.f21521b == null) {
            return false;
        }
        return th2.toString().equals(th2.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.f21521b});
    }

    public b0(Throwable th2) {
        this.f21521b = th2;
        this.a = null;
    }
}
