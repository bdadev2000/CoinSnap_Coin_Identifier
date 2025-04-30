package androidx.lifecycle;

import r0.C2655c;

/* loaded from: classes.dex */
public interface d0 {
    default b0 a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    default b0 b(Class cls, C2655c c2655c) {
        return a(cls);
    }

    default b0 c(M7.b bVar, C2655c c2655c) {
        G7.j.e(bVar, "modelClass");
        return b(com.facebook.appevents.g.n(bVar), c2655c);
    }
}
