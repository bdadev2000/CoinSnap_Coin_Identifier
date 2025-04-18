package androidx.lifecycle.viewmodel.internal;

import androidx.lifecycle.ViewModel;
import p0.a;

/* loaded from: classes4.dex */
public final class JvmViewModelProviders {
    public static ViewModel a(Class cls) {
        a.s(cls, "modelClass");
        try {
            Object newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            a.r(newInstance, "{\n            modelClass…).newInstance()\n        }");
            return (ViewModel) newInstance;
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Cannot create an instance of " + cls, e);
        } catch (InstantiationException e2) {
            throw new RuntimeException("Cannot create an instance of " + cls, e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("Cannot create an instance of " + cls, e3);
        }
    }
}
