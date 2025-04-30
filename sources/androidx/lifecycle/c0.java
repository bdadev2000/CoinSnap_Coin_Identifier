package androidx.lifecycle;

import a5.C0398b;
import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import r0.C2655c;

/* loaded from: classes.dex */
public final class c0 extends e0 {

    /* renamed from: c, reason: collision with root package name */
    public static c0 f4884c;

    /* renamed from: d, reason: collision with root package name */
    public static final C0398b f4885d = new Object();
    public final Application b;

    public c0(Application application) {
        this.b = application;
    }

    @Override // androidx.lifecycle.e0, androidx.lifecycle.d0
    public final b0 a(Class cls) {
        Application application = this.b;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.e0, androidx.lifecycle.d0
    public final b0 b(Class cls, C2655c c2655c) {
        if (this.b != null) {
            return a(cls);
        }
        Application application = (Application) c2655c.f22812a.get(f4885d);
        if (application != null) {
            return d(cls, application);
        }
        if (!AbstractC0491a.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final b0 d(Class cls, Application application) {
        if (AbstractC0491a.class.isAssignableFrom(cls)) {
            try {
                b0 b0Var = (b0) cls.getConstructor(Application.class).newInstance(application);
                G7.j.d(b0Var, "{\n                try {\n…          }\n            }");
                return b0Var;
            } catch (IllegalAccessException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InstantiationException e9) {
                throw new RuntimeException("Cannot create an instance of " + cls, e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }
        return super.a(cls);
    }
}
