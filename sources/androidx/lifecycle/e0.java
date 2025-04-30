package androidx.lifecycle;

import r0.C2655c;

/* loaded from: classes.dex */
public class e0 implements d0 {

    /* renamed from: a, reason: collision with root package name */
    public static e0 f4888a;

    @Override // androidx.lifecycle.d0
    public b0 a(Class cls) {
        try {
            Object newInstance = cls.getDeclaredConstructor(null).newInstance(null);
            G7.j.d(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (b0) newInstance;
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("Cannot create an instance of " + cls, e4);
        } catch (InstantiationException e9) {
            throw new RuntimeException("Cannot create an instance of " + cls, e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("Cannot create an instance of " + cls, e10);
        }
    }

    @Override // androidx.lifecycle.d0
    public b0 b(Class cls, C2655c c2655c) {
        return a(cls);
    }

    @Override // androidx.lifecycle.d0
    public final b0 c(M7.b bVar, C2655c c2655c) {
        G7.j.e(bVar, "modelClass");
        return b(com.facebook.appevents.g.n(bVar), c2655c);
    }
}
