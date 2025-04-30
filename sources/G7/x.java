package G7;

import java.util.List;
import u7.AbstractC2816g;

/* loaded from: classes3.dex */
public final class x implements M7.d {

    /* renamed from: a, reason: collision with root package name */
    public final M7.b f1337a;
    public final List b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1338c;

    public x(e eVar, List list) {
        j.e(list, "arguments");
        this.f1337a = eVar;
        this.b = list;
        this.f1338c = 0;
    }

    public final String a(boolean z8) {
        M7.b bVar;
        String name;
        String O;
        M7.b bVar2 = this.f1337a;
        Class cls = null;
        if (bVar2 instanceof M7.b) {
            bVar = bVar2;
        } else {
            bVar = null;
        }
        if (bVar != null) {
            cls = com.facebook.appevents.g.n(bVar);
        }
        int i9 = this.f1338c;
        if (cls == null) {
            name = bVar2.toString();
        } else if ((i9 & 4) != 0) {
            name = "kotlin.Nothing";
        } else if (cls.isArray()) {
            if (cls.equals(boolean[].class)) {
                name = "kotlin.BooleanArray";
            } else if (cls.equals(char[].class)) {
                name = "kotlin.CharArray";
            } else if (cls.equals(byte[].class)) {
                name = "kotlin.ByteArray";
            } else if (cls.equals(short[].class)) {
                name = "kotlin.ShortArray";
            } else if (cls.equals(int[].class)) {
                name = "kotlin.IntArray";
            } else if (cls.equals(float[].class)) {
                name = "kotlin.FloatArray";
            } else if (cls.equals(long[].class)) {
                name = "kotlin.LongArray";
            } else if (cls.equals(double[].class)) {
                name = "kotlin.DoubleArray";
            } else {
                name = "kotlin.Array";
            }
        } else if (z8 && cls.isPrimitive()) {
            j.c(bVar2, "null cannot be cast to non-null type kotlin.reflect.KClass<*>");
            name = com.facebook.appevents.g.o(bVar2).getName();
        } else {
            name = cls.getName();
        }
        List list = this.b;
        String str = "";
        if (list.isEmpty()) {
            O = "";
        } else {
            O = AbstractC2816g.O(list, ", ", "<", ">", new w(this, 0), 24);
        }
        if ((i9 & 1) != 0) {
            str = "?";
        }
        return com.mbridge.msdk.foundation.entity.o.k(name, O, str);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (j.a(this.f1337a, xVar.f1337a) && j.a(this.b, xVar.b) && j.a(null, null) && this.f1338c == xVar.f1338c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f1338c) + ((this.b.hashCode() + (this.f1337a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return a(false) + " (Kotlin reflection is not available)";
    }
}
