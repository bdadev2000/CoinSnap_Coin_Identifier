package o4;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o4.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2496b {

    /* renamed from: a, reason: collision with root package name */
    public final String f21944a;
    public final Set b;

    /* renamed from: c, reason: collision with root package name */
    public final Set f21945c;

    /* renamed from: d, reason: collision with root package name */
    public final int f21946d;

    /* renamed from: e, reason: collision with root package name */
    public final int f21947e;

    /* renamed from: f, reason: collision with root package name */
    public final InterfaceC2498d f21948f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f21949g;

    public C2496b(String str, Set set, Set set2, int i9, int i10, InterfaceC2498d interfaceC2498d, Set set3) {
        this.f21944a = str;
        this.b = Collections.unmodifiableSet(set);
        this.f21945c = Collections.unmodifiableSet(set2);
        this.f21946d = i9;
        this.f21947e = i10;
        this.f21948f = interfaceC2498d;
        this.f21949g = Collections.unmodifiableSet(set3);
    }

    public static C2495a a(Class cls) {
        return new C2495a(cls, new Class[0]);
    }

    public static C2495a b(q qVar) {
        return new C2495a(qVar, new q[0]);
    }

    public static C2496b c(Object obj, Class cls, Class... clsArr) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(q.a(cls));
        for (Class cls2 : clsArr) {
            com.bumptech.glide.d.H(cls2, "Null interface");
            hashSet.add(q.a(cls2));
        }
        return new C2496b(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new F2.d(obj, 19), hashSet3);
    }

    public final String toString() {
        return "Component<" + Arrays.toString(this.b.toArray()) + ">{" + this.f21946d + ", type=" + this.f21947e + ", deps=" + Arrays.toString(this.f21945c.toArray()) + "}";
    }
}
