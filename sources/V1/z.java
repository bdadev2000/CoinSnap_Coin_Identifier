package v1;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final Object f23601a;
    public final Throwable b;

    public z(i iVar) {
        this.f23601a = iVar;
        this.b = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        Object obj2 = this.f23601a;
        if (obj2 != null && obj2.equals(zVar.f23601a)) {
            return true;
        }
        Throwable th = this.b;
        if (th == null || zVar.b == null) {
            return false;
        }
        return th.toString().equals(th.toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23601a, this.b});
    }

    public z(Throwable th) {
        this.b = th;
        this.f23601a = null;
    }
}
