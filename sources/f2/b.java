package F2;

import G7.j;
import java.util.HashMap;
import t7.C2720i;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public final class b {
    public static final HashMap m = AbstractC2829t.X(new C2720i("embedding.weight", "embed.weight"), new C2720i("dense1.weight", "fc1.weight"), new C2720i("dense2.weight", "fc2.weight"), new C2720i("dense3.weight", "fc3.weight"), new C2720i("dense1.bias", "fc1.bias"), new C2720i("dense2.bias", "fc2.bias"), new C2720i("dense3.bias", "fc3.bias"));

    /* renamed from: a, reason: collision with root package name */
    public final a f1118a;
    public final a b;

    /* renamed from: c, reason: collision with root package name */
    public final a f1119c;

    /* renamed from: d, reason: collision with root package name */
    public final a f1120d;

    /* renamed from: e, reason: collision with root package name */
    public final a f1121e;

    /* renamed from: f, reason: collision with root package name */
    public final a f1122f;

    /* renamed from: g, reason: collision with root package name */
    public final a f1123g;

    /* renamed from: h, reason: collision with root package name */
    public final a f1124h;

    /* renamed from: i, reason: collision with root package name */
    public final a f1125i;

    /* renamed from: j, reason: collision with root package name */
    public final a f1126j;

    /* renamed from: k, reason: collision with root package name */
    public final a f1127k;
    public final HashMap l;

    public b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj != null) {
            this.f1118a = (a) obj;
            Object obj2 = hashMap.get("convs.0.weight");
            if (obj2 != null) {
                this.b = h.X((a) obj2);
                Object obj3 = hashMap.get("convs.1.weight");
                if (obj3 != null) {
                    this.f1119c = h.X((a) obj3);
                    Object obj4 = hashMap.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f1120d = h.X((a) obj4);
                        Object obj5 = hashMap.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f1121e = (a) obj5;
                            Object obj6 = hashMap.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f1122f = (a) obj6;
                                Object obj7 = hashMap.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f1123g = (a) obj7;
                                    Object obj8 = hashMap.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f1124h = h.W((a) obj8);
                                        Object obj9 = hashMap.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f1125i = h.W((a) obj9);
                                            Object obj10 = hashMap.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f1126j = (a) obj10;
                                                Object obj11 = hashMap.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f1127k = (a) obj11;
                                                    this.l = new HashMap();
                                                    for (String str : com.bumptech.glide.d.W(c.b.a(), c.f1128c.a())) {
                                                        String j7 = j.j(".weight", str);
                                                        String j9 = j.j(".bias", str);
                                                        a aVar = (a) hashMap.get(j7);
                                                        a aVar2 = (a) hashMap.get(j9);
                                                        if (aVar != null) {
                                                            this.l.put(j7, h.W(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.l.put(j9, aVar2);
                                                        }
                                                    }
                                                    return;
                                                }
                                                throw new IllegalStateException("Required value was null.".toString());
                                            }
                                            throw new IllegalStateException("Required value was null.".toString());
                                        }
                                        throw new IllegalStateException("Required value was null.".toString());
                                    }
                                    throw new IllegalStateException("Required value was null.".toString());
                                }
                                throw new IllegalStateException("Required value was null.".toString());
                            }
                            throw new IllegalStateException("Required value was null.".toString());
                        }
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    throw new IllegalStateException("Required value was null.".toString());
                }
                throw new IllegalStateException("Required value was null.".toString());
            }
            throw new IllegalStateException("Required value was null.".toString());
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    public final a a(a aVar, String[] strArr, String str) {
        if (O2.a.b(this)) {
            return null;
        }
        try {
            a h6 = h.h(h.k(strArr, this.f1118a), this.b);
            h.a(h6, this.f1121e);
            h.Q(h6);
            a h9 = h.h(h6, this.f1119c);
            h.a(h9, this.f1122f);
            h.Q(h9);
            a C8 = h.C(h9, 2);
            a h10 = h.h(C8, this.f1120d);
            h.a(h10, this.f1123g);
            h.Q(h10);
            a C9 = h.C(h6, h6.f1116a[1]);
            a C10 = h.C(C8, C8.f1116a[1]);
            a C11 = h.C(h10, h10.f1116a[1]);
            h.l(C9);
            h.l(C10);
            h.l(C11);
            a j7 = h.j(h.g(new a[]{C9, C10, C11, aVar}), this.f1124h, this.f1126j);
            h.Q(j7);
            a j9 = h.j(j7, this.f1125i, this.f1127k);
            h.Q(j9);
            HashMap hashMap = this.l;
            a aVar2 = (a) hashMap.get(j.j(".weight", str));
            a aVar3 = (a) hashMap.get(j.j(".bias", str));
            if (aVar2 != null && aVar3 != null) {
                a j10 = h.j(j9, aVar2, aVar3);
                h.V(j10);
                return j10;
            }
            return null;
        } catch (Throwable th) {
            O2.a.a(this, th);
            return null;
        }
    }
}
