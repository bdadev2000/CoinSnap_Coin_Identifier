package h2;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class a {
    public final r.b a;

    /* renamed from: b, reason: collision with root package name */
    public final r.b f18711b;

    /* renamed from: c, reason: collision with root package name */
    public final r.b f18712c;

    public a(r.b bVar, r.b bVar2, r.b bVar3) {
        this.a = bVar;
        this.f18711b = bVar2;
        this.f18712c = bVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        r.b bVar = this.f18712c;
        Class cls2 = (Class) bVar.getOrDefault(name, null);
        if (cls2 == null) {
            Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
            bVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        r.b bVar = this.a;
        Method method = (Method) bVar.getOrDefault(str, null);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            bVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method d(Class cls) {
        String name = cls.getName();
        r.b bVar = this.f18711b;
        Method method = (Method) bVar.getOrDefault(name, null);
        if (method == null) {
            Class b3 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b3.getDeclaredMethod("write", cls, a.class);
            bVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i10);

    public final int f(int i10, int i11) {
        if (!e(i11)) {
            return i10;
        }
        return ((b) this).f18714e.readInt();
    }

    public final Parcelable g(Parcelable parcelable, int i10) {
        if (!e(i10)) {
            return parcelable;
        }
        return ((b) this).f18714e.readParcelable(b.class.getClassLoader());
    }

    public final c h() {
        String readString = ((b) this).f18714e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
        } catch (NoSuchMethodException e11) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
        } catch (InvocationTargetException e12) {
            if (e12.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e12.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
        }
    }

    public abstract void i(int i10);

    public final void j(int i10, int i11) {
        i(i11);
        ((b) this).f18714e.writeInt(i10);
    }

    public final void k(Parcelable parcelable, int i10) {
        i(i10);
        ((b) this).f18714e.writeParcelable(parcelable, 0);
    }

    public final void l(c cVar) {
        if (cVar == null) {
            ((b) this).f18714e.writeString(null);
            return;
        }
        try {
            ((b) this).f18714e.writeString(b(cVar.getClass()).getName());
            b a = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a);
                int i10 = a.f18718i;
                if (i10 >= 0) {
                    int i11 = a.f18713d.get(i10);
                    Parcel parcel = a.f18714e;
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i11);
                    parcel.writeInt(dataPosition - i11);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (e12.getCause() instanceof RuntimeException) {
                    throw ((RuntimeException) e12.getCause());
                }
                throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e12);
            }
        } catch (ClassNotFoundException e13) {
            throw new RuntimeException(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
