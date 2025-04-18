package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes3.dex */
public abstract class VersionedParcel {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayMap f21724a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayMap f21725b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayMap f21726c;

    /* renamed from: androidx.versionedparcelable.VersionedParcel$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        public final Class resolveClass(ObjectStreamClass objectStreamClass) {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    /* loaded from: classes3.dex */
    public static class ParcelException extends RuntimeException {
    }

    public VersionedParcel(ArrayMap arrayMap, ArrayMap arrayMap2, ArrayMap arrayMap3) {
        this.f21724a = arrayMap;
        this.f21725b = arrayMap2;
        this.f21726c = arrayMap3;
    }

    public abstract void a();

    public abstract VersionedParcel b();

    public final Class c(Class cls) {
        String name = cls.getName();
        ArrayMap arrayMap = this.f21726c;
        Class cls2 = (Class) arrayMap.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        arrayMap.put(cls.getName(), cls3);
        return cls3;
    }

    public final Method d(String str) {
        ArrayMap arrayMap = this.f21724a;
        Method method = (Method) arrayMap.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        arrayMap.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method e(Class cls) {
        String name = cls.getName();
        ArrayMap arrayMap = this.f21725b;
        Method method = (Method) arrayMap.get(name);
        if (method != null) {
            return method;
        }
        Class c2 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c2.getDeclaredMethod("write", cls, VersionedParcel.class);
        arrayMap.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public boolean f() {
        return this instanceof VersionedParcelStream;
    }

    public abstract boolean g();

    public abstract byte[] h();

    public abstract CharSequence i();

    public abstract boolean j(int i2);

    public abstract int k();

    public final int l(int i2, int i3) {
        return !j(i3) ? i2 : k();
    }

    public abstract Parcelable m();

    public abstract String n();

    public final VersionedParcelable o() {
        String n2 = n();
        if (n2 == null) {
            return null;
        }
        try {
            return (VersionedParcelable) d(n2).invoke(null, b());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (InvocationTargetException e4) {
            if (e4.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e4.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
        }
    }

    public abstract void p(int i2);

    public void q(boolean z2, boolean z3) {
    }

    public abstract void r(boolean z2);

    public abstract void s(byte[] bArr);

    public abstract void t(CharSequence charSequence);

    public abstract void u(int i2);

    public final void v(int i2, int i3) {
        p(i3);
        u(i2);
    }

    public abstract void w(Parcelable parcelable);

    public abstract void x(String str);

    public final void y(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            x(null);
            return;
        }
        try {
            x(c(versionedParcelable.getClass()).getName());
            VersionedParcel b2 = b();
            try {
                e(versionedParcelable.getClass()).invoke(null, versionedParcelable, b2);
                b2.a();
            } catch (ClassNotFoundException e) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e4);
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
