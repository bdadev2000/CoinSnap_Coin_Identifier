package O0;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import x0.AbstractC2914a;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public final x.b f2137a;
    public final x.b b;

    /* renamed from: c, reason: collision with root package name */
    public final x.b f2138c;

    public a(x.b bVar, x.b bVar2, x.b bVar3) {
        this.f2137a = bVar;
        this.b = bVar2;
        this.f2138c = bVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        x.b bVar = this.f2138c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(AbstractC2914a.f(cls.getPackage().getName(), ".", cls.getSimpleName(), "Parcelizer"), false, cls.getClassLoader());
            bVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        x.b bVar = this.f2137a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            bVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        x.b bVar = this.b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, a.class);
            bVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i9);

    public final int f(int i9, int i10) {
        if (!e(i10)) {
            return i9;
        }
        return ((b) this).f2140e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i9) {
        if (!e(i9)) {
            return parcelable;
        }
        return ((b) this).f2140e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f2140e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
        } catch (NoSuchMethodException e10) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
        } catch (InvocationTargetException e11) {
            if (e11.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e11.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
        }
    }

    public abstract void i(int i9);

    public final void j(int i9, int i10) {
        i(i10);
        ((b) this).f2140e.writeInt(i9);
    }

    public final void k(c cVar) {
        if (cVar == null) {
            ((b) this).f2140e.writeString(null);
            return;
        }
        try {
            ((b) this).f2140e.writeString(b(cVar.getClass()).getName());
            b a6 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a6);
                int i9 = a6.f2144i;
                if (i9 >= 0) {
                    int i10 = a6.f2139d.get(i9);
                    Parcel parcel = a6.f2140e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e4) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
            } catch (IllegalAccessException e9) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e9);
            } catch (NoSuchMethodException e10) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e10);
            } catch (InvocationTargetException e11) {
                if (e11.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e11.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e12);
        }
    }
}
