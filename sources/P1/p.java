package P1;

import f2.InterfaceC2268f;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC2268f f2366a;
    public final Executor b;

    public p(InterfaceC2268f interfaceC2268f, Executor executor) {
        this.f2366a = interfaceC2268f;
        this.b = executor;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.f2366a.equals(((p) obj).f2366a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2366a.hashCode();
    }
}
