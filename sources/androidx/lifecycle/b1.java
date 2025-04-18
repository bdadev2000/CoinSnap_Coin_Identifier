package androidx.lifecycle;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class b1 implements a1 {
    public static b1 a;

    @Override // androidx.lifecycle.a1
    public x0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        try {
            Object newInstance = modelClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            Intrinsics.checkNotNullExpressionValue(newInstance, "{\n                modelC…wInstance()\n            }");
            return (x0) newInstance;
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
        } catch (InstantiationException e10) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("Cannot create an instance of " + modelClass, e11);
        }
    }
}
