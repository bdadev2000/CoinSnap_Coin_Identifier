package g4;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class t {
    public final s4.g a;

    /* renamed from: b, reason: collision with root package name */
    public final Executor f18155b;

    public t(s4.g gVar, Executor executor) {
        this.a = gVar;
        this.f18155b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof t) {
            return this.a.equals(((t) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
