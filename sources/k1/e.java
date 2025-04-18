package k1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e extends c {
    public e() {
        this(a.f20211b);
    }

    public final Object a(b key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.a.get(key);
    }

    public final void b(b key, Object obj) {
        Intrinsics.checkNotNullParameter(key, "key");
        this.a.put(key, obj);
    }

    public e(c initialExtras) {
        Intrinsics.checkNotNullParameter(initialExtras, "initialExtras");
        this.a.putAll(initialExtras.a);
    }
}
