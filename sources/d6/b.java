package d6;

import java.util.HashMap;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: m, reason: collision with root package name */
    public static final HashMap f16859m = MapsKt.hashMapOf(TuplesKt.to("embedding.weight", "embed.weight"), TuplesKt.to("dense1.weight", "fc1.weight"), TuplesKt.to("dense2.weight", "fc2.weight"), TuplesKt.to("dense3.weight", "fc3.weight"), TuplesKt.to("dense1.bias", "fc1.bias"), TuplesKt.to("dense2.bias", "fc2.bias"), TuplesKt.to("dense3.bias", "fc3.bias"));
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final a f16860b;

    /* renamed from: c, reason: collision with root package name */
    public final a f16861c;

    /* renamed from: d, reason: collision with root package name */
    public final a f16862d;

    /* renamed from: e, reason: collision with root package name */
    public final a f16863e;

    /* renamed from: f, reason: collision with root package name */
    public final a f16864f;

    /* renamed from: g, reason: collision with root package name */
    public final a f16865g;

    /* renamed from: h, reason: collision with root package name */
    public final a f16866h;

    /* renamed from: i, reason: collision with root package name */
    public final a f16867i;

    /* renamed from: j, reason: collision with root package name */
    public final a f16868j;

    /* renamed from: k, reason: collision with root package name */
    public final a f16869k;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f16870l;

    public b(HashMap hashMap) {
        Object obj = hashMap.get("embed.weight");
        if (obj != null) {
            this.a = (a) obj;
            Object obj2 = hashMap.get("convs.0.weight");
            if (obj2 != null) {
                this.f16860b = g.J((a) obj2);
                Object obj3 = hashMap.get("convs.1.weight");
                if (obj3 != null) {
                    this.f16861c = g.J((a) obj3);
                    Object obj4 = hashMap.get("convs.2.weight");
                    if (obj4 != null) {
                        this.f16862d = g.J((a) obj4);
                        Object obj5 = hashMap.get("convs.0.bias");
                        if (obj5 != null) {
                            this.f16863e = (a) obj5;
                            Object obj6 = hashMap.get("convs.1.bias");
                            if (obj6 != null) {
                                this.f16864f = (a) obj6;
                                Object obj7 = hashMap.get("convs.2.bias");
                                if (obj7 != null) {
                                    this.f16865g = (a) obj7;
                                    Object obj8 = hashMap.get("fc1.weight");
                                    if (obj8 != null) {
                                        this.f16866h = g.I((a) obj8);
                                        Object obj9 = hashMap.get("fc2.weight");
                                        if (obj9 != null) {
                                            this.f16867i = g.I((a) obj9);
                                            Object obj10 = hashMap.get("fc1.bias");
                                            if (obj10 != null) {
                                                this.f16868j = (a) obj10;
                                                Object obj11 = hashMap.get("fc2.bias");
                                                if (obj11 != null) {
                                                    this.f16869k = (a) obj11;
                                                    this.f16870l = new HashMap();
                                                    for (String str : SetsKt.setOf((Object[]) new String[]{c.MTML_INTEGRITY_DETECT.a(), c.MTML_APP_EVENT_PREDICTION.a()})) {
                                                        String stringPlus = Intrinsics.stringPlus(str, ".weight");
                                                        String stringPlus2 = Intrinsics.stringPlus(str, ".bias");
                                                        a aVar = (a) hashMap.get(stringPlus);
                                                        a aVar2 = (a) hashMap.get(stringPlus2);
                                                        if (aVar != null) {
                                                            this.f16870l.put(stringPlus, g.I(aVar));
                                                        }
                                                        if (aVar2 != null) {
                                                            this.f16870l.put(stringPlus2, aVar2);
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

    public final a a(a dense, String[] texts, String task) {
        HashMap hashMap = this.f16870l;
        if (m6.a.b(this)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(dense, "dense");
            Intrinsics.checkNotNullParameter(texts, "texts");
            Intrinsics.checkNotNullParameter(task, "task");
            a h10 = g.h(g.m(texts, this.a), this.f16860b);
            g.c(h10, this.f16863e);
            g.E(h10);
            a h11 = g.h(h10, this.f16861c);
            g.c(h11, this.f16864f);
            g.E(h11);
            a x10 = g.x(h11, 2);
            a h12 = g.h(x10, this.f16862d);
            g.c(h12, this.f16865g);
            g.E(h12);
            a x11 = g.x(h10, h10.a[1]);
            a x12 = g.x(x10, x10.a[1]);
            a x13 = g.x(h12, h12.a[1]);
            g.o(x11);
            g.o(x12);
            g.o(x13);
            a l10 = g.l(g.g(new a[]{x11, x12, x13, dense}), this.f16866h, this.f16868j);
            g.E(l10);
            a l11 = g.l(l10, this.f16867i, this.f16869k);
            g.E(l11);
            a aVar = (a) hashMap.get(Intrinsics.stringPlus(task, ".weight"));
            a aVar2 = (a) hashMap.get(Intrinsics.stringPlus(task, ".bias"));
            if (aVar != null && aVar2 != null) {
                a l12 = g.l(l11, aVar, aVar2);
                g.H(l12);
                return l12;
            }
            return null;
        } catch (Throwable th2) {
            m6.a.a(this, th2);
            return null;
        }
    }
}
