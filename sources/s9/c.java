package s9;

import android.animation.TimeInterpolator;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import vd.e;

/* loaded from: classes3.dex */
public final class c {
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24937b;

    /* renamed from: c, reason: collision with root package name */
    public final TimeInterpolator f24938c;

    /* renamed from: d, reason: collision with root package name */
    public int f24939d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f24940e = 1;

    public c(long j3, long j10, TimeInterpolator timeInterpolator) {
        this.a = 0L;
        this.f24937b = 300L;
        this.f24938c = null;
        this.a = j3;
        this.f24937b = j10;
        this.f24938c = timeInterpolator;
    }

    public final TimeInterpolator a() {
        TimeInterpolator timeInterpolator = this.f24938c;
        return timeInterpolator != null ? timeInterpolator : a.f24933b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.a != cVar.a || this.f24937b != cVar.f24937b || this.f24939d != cVar.f24939d || this.f24940e != cVar.f24940e) {
            return false;
        }
        return a().getClass().equals(cVar.a().getClass());
    }

    public final int hashCode() {
        long j3 = this.a;
        long j10 = this.f24937b;
        return ((((a().getClass().hashCode() + (((((int) (j3 ^ (j3 >>> 32))) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31)) * 31) + this.f24939d) * 31) + this.f24940e;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("\n");
        sb2.append(c.class.getName());
        sb2.append(AbstractJsonLexerKt.BEGIN_OBJ);
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" delay: ");
        sb2.append(this.a);
        sb2.append(" duration: ");
        sb2.append(this.f24937b);
        sb2.append(" interpolator: ");
        sb2.append(a().getClass());
        sb2.append(" repeatCount: ");
        sb2.append(this.f24939d);
        sb2.append(" repeatMode: ");
        return e.g(sb2, this.f24940e, "}\n");
    }
}
