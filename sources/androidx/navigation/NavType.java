package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.d;
import b1.f0;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import z0.m;

/* loaded from: classes.dex */
public abstract class NavType<T> {

    /* renamed from: b, reason: collision with root package name */
    public static final NavType$Companion$IntType$1 f20492b = new NavType(false);

    /* renamed from: c, reason: collision with root package name */
    public static final NavType$Companion$IntArrayType$1 f20493c = new NavType(true);
    public static final NavType$Companion$IntListType$1 d = new NavType(true);
    public static final NavType$Companion$LongType$1 e = new NavType(false);

    /* renamed from: f, reason: collision with root package name */
    public static final NavType$Companion$LongArrayType$1 f20494f = new NavType(true);

    /* renamed from: g, reason: collision with root package name */
    public static final NavType$Companion$LongListType$1 f20495g = new NavType(true);

    /* renamed from: h, reason: collision with root package name */
    public static final NavType$Companion$FloatType$1 f20496h = new NavType(false);

    /* renamed from: i, reason: collision with root package name */
    public static final NavType$Companion$FloatArrayType$1 f20497i = new NavType(true);

    /* renamed from: j, reason: collision with root package name */
    public static final NavType$Companion$FloatListType$1 f20498j = new NavType(true);

    /* renamed from: k, reason: collision with root package name */
    public static final NavType$Companion$BoolType$1 f20499k = new NavType(false);

    /* renamed from: l, reason: collision with root package name */
    public static final NavType$Companion$BoolArrayType$1 f20500l = new NavType(true);

    /* renamed from: m, reason: collision with root package name */
    public static final NavType$Companion$BoolListType$1 f20501m = new NavType(true);

    /* renamed from: n, reason: collision with root package name */
    public static final NavType$Companion$StringType$1 f20502n = new NavType(true);

    /* renamed from: o, reason: collision with root package name */
    public static final NavType$Companion$StringArrayType$1 f20503o = new NavType(true);

    /* renamed from: p, reason: collision with root package name */
    public static final NavType$Companion$StringListType$1 f20504p = new NavType(true);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20505a;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    /* loaded from: classes.dex */
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {

        /* renamed from: r, reason: collision with root package name */
        public final Class f20506r;

        public EnumType(Class cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f20506r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.NavType.SerializableType, androidx.navigation.NavType
        public final String b() {
            return this.f20506r.getName();
        }

        @Override // androidx.navigation.NavType.SerializableType
        /* renamed from: i, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final Enum h(String str) {
            Object obj;
            Class cls = this.f20506r;
            Object[] enumConstants = cls.getEnumConstants();
            p0.a.r(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    obj = null;
                    break;
                }
                obj = enumConstants[i2];
                if (m.S0(((Enum) obj).name(), str, true)) {
                    break;
                }
                i2++;
            }
            Enum r4 = (Enum) obj;
            if (r4 != null) {
                return r4;
            }
            StringBuilder v2 = d.v("Enum value ", str, " not found for type ");
            v2.append(cls.getName());
            v2.append('.');
            throw new IllegalArgumentException(v2.toString());
        }
    }

    /* loaded from: classes.dex */
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {

        /* renamed from: q, reason: collision with root package name */
        public final Class f20507q;

        public ParcelableArrayType(Class cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f20507q = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String str) {
            return (Parcelable[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        }

        @Override // androidx.navigation.NavType
        public final String b() {
            return this.f20507q.getName();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: d */
        public final Object h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            p0.a.s(str, SDKConstants.PARAM_KEY);
            this.f20507q.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !p0.a.g(ParcelableArrayType.class, obj.getClass())) {
                return false;
            }
            return p0.a.g(this.f20507q, ((ParcelableArrayType) obj).f20507q);
        }

        @Override // androidx.navigation.NavType
        public final boolean g(Object obj, Object obj2) {
            return f0.g((Parcelable[]) obj, (Parcelable[]) obj2);
        }

        public final int hashCode() {
            return this.f20507q.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class ParcelableType<D> extends NavType<D> {

        /* renamed from: q, reason: collision with root package name */
        public final Class f20508q;

        public ParcelableType(Class cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.f20508q = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String str) {
            return androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        }

        @Override // androidx.navigation.NavType
        public final String b() {
            return this.f20508q.getName();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: d */
        public final Object h(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String str, Object obj) {
            p0.a.s(str, SDKConstants.PARAM_KEY);
            this.f20508q.cast(obj);
            if (obj == null || (obj instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !p0.a.g(ParcelableType.class, obj.getClass())) {
                return false;
            }
            return p0.a.g(this.f20508q, ((ParcelableType) obj).f20508q);
        }

        public final int hashCode() {
            return this.f20508q.hashCode();
        }
    }

    /* loaded from: classes.dex */
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {

        /* renamed from: q, reason: collision with root package name */
        public final Class f20509q;

        public SerializableArrayType(Class cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f20509q = Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String str) {
            return (Serializable[]) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        }

        @Override // androidx.navigation.NavType
        public final String b() {
            return this.f20509q.getName();
        }

        @Override // androidx.navigation.NavType
        /* renamed from: d */
        public final Object h(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.io.Serializable[], java.io.Serializable] */
        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String str, Object obj) {
            ?? r4 = (Serializable[]) obj;
            p0.a.s(str, SDKConstants.PARAM_KEY);
            this.f20509q.cast(r4);
            bundle.putSerializable(str, r4);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !p0.a.g(SerializableArrayType.class, obj.getClass())) {
                return false;
            }
            return p0.a.g(this.f20509q, ((SerializableArrayType) obj).f20509q);
        }

        @Override // androidx.navigation.NavType
        public final boolean g(Object obj, Object obj2) {
            return f0.g((Serializable[]) obj, (Serializable[]) obj2);
        }

        public final int hashCode() {
            return this.f20509q.hashCode();
        }
    }

    public NavType(boolean z2) {
        this.f20505a = z2;
    }

    public abstract Object a(Bundle bundle, String str);

    public String b() {
        return "nav_type";
    }

    public Object c(Object obj, String str) {
        return h(str);
    }

    /* renamed from: d */
    public abstract Object h(String str);

    public abstract void e(Bundle bundle, String str, Object obj);

    public String f(Object obj) {
        return String.valueOf(obj);
    }

    public boolean g(Object obj, Object obj2) {
        return p0.a.g(obj, obj2);
    }

    public final String toString() {
        return b();
    }

    /* loaded from: classes.dex */
    public static class SerializableType<D extends Serializable> extends NavType<D> {

        /* renamed from: q, reason: collision with root package name */
        public final Class f20510q;

        public SerializableType(Class cls) {
            super(true);
            if (Serializable.class.isAssignableFrom(cls)) {
                if (true ^ cls.isEnum()) {
                    this.f20510q = cls;
                    return;
                }
                throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String str) {
            return (Serializable) androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
        }

        @Override // androidx.navigation.NavType
        public String b() {
            return this.f20510q.getName();
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            p0.a.s(str, SDKConstants.PARAM_KEY);
            p0.a.s(serializable, "value");
            this.f20510q.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableType)) {
                return false;
            }
            return p0.a.g(this.f20510q, ((SerializableType) obj).f20510q);
        }

        @Override // androidx.navigation.NavType
        public Serializable h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.f20510q.hashCode();
        }

        public SerializableType(Class cls, int i2) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f20510q = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }
    }
}
