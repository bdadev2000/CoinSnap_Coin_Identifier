package k1;

import androidx.lifecycle.a1;
import androidx.lifecycle.x0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements a1 {
    public final f[] a;

    public d(f... initializers) {
        Intrinsics.checkNotNullParameter(initializers, "initializers");
        this.a = initializers;
    }

    @Override // androidx.lifecycle.a1
    public final x0 b(Class modelClass, e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        x0 x0Var = null;
        for (f fVar : this.a) {
            if (Intrinsics.areEqual(fVar.a, modelClass)) {
                Object invoke = fVar.f20212b.invoke(extras);
                if (invoke instanceof x0) {
                    x0Var = (x0) invoke;
                } else {
                    x0Var = null;
                }
            }
        }
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(modelClass.getName()));
    }
}
