package db;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import s7.h1;

/* loaded from: classes3.dex */
public final class a {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final Set f16939b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f16940c;

    /* renamed from: d, reason: collision with root package name */
    public final int f16941d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16942e;

    /* renamed from: f, reason: collision with root package name */
    public final d f16943f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f16944g;

    public a(String str, Set set, Set set2, int i10, int i11, d dVar, Set set3) {
        this.a = str;
        this.f16939b = Collections.unmodifiableSet(set);
        this.f16940c = Collections.unmodifiableSet(set2);
        this.f16941d = i10;
        this.f16942e = i11;
        this.f16943f = dVar;
        this.f16944g = Collections.unmodifiableSet(set3);
    }

    public static h1 a(s sVar) {
        return new h1(sVar, new s[0]);
    }

    public static h1 b(Class cls) {
        return new h1(cls, new Class[0]);
    }

    public static a c(Object obj, Class cls, Class... clsArr) {
        h1 h1Var = new h1(cls, clsArr);
        h1Var.f24390f = new androidx.core.app.h(obj, 1);
        return h1Var.b();
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.f16939b.toArray()) + ">{" + this.f16941d + ", type=" + this.f16942e + ", deps=" + Arrays.toString(this.f16940c.toArray()) + "}";
    }
}
