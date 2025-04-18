package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class z0 extends b1 {

    /* renamed from: c, reason: collision with root package name */
    public static z0 f1848c;

    /* renamed from: b, reason: collision with root package name */
    public final Application f1849b;

    public z0(Application application) {
        this.f1849b = application;
    }

    @Override // androidx.lifecycle.b1, androidx.lifecycle.a1
    public final x0 a(Class modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Application application = this.f1849b;
        if (application != null) {
            return c(modelClass, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.a1
    public final x0 b(Class modelClass, k1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        if (this.f1849b != null) {
            return a(modelClass);
        }
        Application application = (Application) extras.a(b6.b.f2295g);
        if (application != null) {
            return c(modelClass, application);
        }
        if (!a.class.isAssignableFrom(modelClass)) {
            return super.a(modelClass);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public final x0 c(Class cls, Application application) {
        if (a.class.isAssignableFrom(cls)) {
            try {
                x0 x0Var = (x0) cls.getConstructor(Application.class).newInstance(application);
                Intrinsics.checkNotNullExpressionValue(x0Var, "{\n                try {\n…          }\n            }");
                return x0Var;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            } catch (InvocationTargetException e12) {
                throw new RuntimeException("Cannot create an instance of " + cls, e12);
            }
        }
        return super.a(cls);
    }
}
