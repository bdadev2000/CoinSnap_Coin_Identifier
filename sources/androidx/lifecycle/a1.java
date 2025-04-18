package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public interface a1 {
    default x0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    default x0 b(Class modelClass, k1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return a(modelClass);
    }
}
