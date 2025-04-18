package androidx.navigation.serialization;

import android.os.Bundle;
import android.support.v4.media.d;
import androidx.navigation.NavType;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.io.Serializable;
import p0.a;
import z0.m;

/* loaded from: classes.dex */
public final class InternalNavType {

    /* renamed from: a, reason: collision with root package name */
    public static final InternalNavType$IntNullableType$1 f20752a = new NavType(true);

    /* renamed from: b, reason: collision with root package name */
    public static final InternalNavType$BoolNullableType$1 f20753b = new NavType(true);

    /* renamed from: c, reason: collision with root package name */
    public static final InternalNavType$DoubleType$1 f20754c = new NavType(false);
    public static final InternalNavType$DoubleNullableType$1 d = new NavType(true);
    public static final InternalNavType$FloatNullableType$1 e = new NavType(true);

    /* renamed from: f, reason: collision with root package name */
    public static final InternalNavType$LongNullableType$1 f20755f = new NavType(true);

    /* renamed from: g, reason: collision with root package name */
    public static final InternalNavType$StringNonNullableType$1 f20756g = new NavType(false);

    /* renamed from: h, reason: collision with root package name */
    public static final InternalNavType$DoubleArrayType$1 f20757h = new NavType(true);

    /* loaded from: classes.dex */
    public static final class EnumNullableType<D extends Enum<?>> extends SerializableNullableType<D> {

        /* renamed from: r, reason: collision with root package name */
        public final Class f20758r;

        public EnumNullableType(Class cls) {
            super(cls);
            if (cls.isEnum()) {
                this.f20758r = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // androidx.navigation.serialization.InternalNavType.SerializableNullableType, androidx.navigation.NavType
        public final String b() {
            return this.f20758r.getName();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object[], java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v0 */
        @Override // androidx.navigation.serialization.InternalNavType.SerializableNullableType
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Enum h(String str) {
            Enum r1 = null;
            if (!a.g(str, "null")) {
                Class cls = this.f20758r;
                ?? enumConstants = cls.getEnumConstants();
                a.p(enumConstants);
                int length = enumConstants.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    ?? r5 = enumConstants[i2];
                    Enum r6 = (Enum) r5;
                    a.p(r6);
                    if (m.S0(r6.name(), str, true)) {
                        r1 = r5;
                        break;
                    }
                    i2++;
                }
                r1 = r1;
                if (r1 == null) {
                    StringBuilder v2 = d.v("Enum value ", str, " not found for type ");
                    v2.append(cls.getName());
                    v2.append('.');
                    throw new IllegalArgumentException(v2.toString());
                }
            }
            return r1;
        }
    }

    /* loaded from: classes.dex */
    public static class SerializableNullableType<D extends Serializable> extends NavType<D> {

        /* renamed from: q, reason: collision with root package name */
        public final Class f20759q;

        public SerializableNullableType(Class cls) {
            super(true);
            this.f20759q = cls;
            if (Serializable.class.isAssignableFrom(cls)) {
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // androidx.navigation.NavType
        public final Object a(Bundle bundle, String str) {
            Object f2 = androidx.compose.foundation.text.input.a.f(bundle, "bundle", str, SDKConstants.PARAM_KEY, str);
            if (f2 instanceof Serializable) {
                return (Serializable) f2;
            }
            return null;
        }

        @Override // androidx.navigation.NavType
        public String b() {
            return this.f20759q.getName();
        }

        @Override // androidx.navigation.NavType
        public final void e(Bundle bundle, String str, Object obj) {
            a.s(str, SDKConstants.PARAM_KEY);
            bundle.putSerializable(str, (Serializable) this.f20759q.cast((Serializable) obj));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SerializableNullableType)) {
                return false;
            }
            return a.g(this.f20759q, ((SerializableNullableType) obj).f20759q);
        }

        @Override // androidx.navigation.NavType
        public Serializable h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final int hashCode() {
            return this.f20759q.hashCode();
        }
    }
}
