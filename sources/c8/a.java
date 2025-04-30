package c8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import u7.C2824o;
import x0.AbstractC2914a;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public List f5422a;
    public final ArrayList b;

    /* renamed from: c, reason: collision with root package name */
    public final HashSet f5423c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f5424d;

    /* renamed from: e, reason: collision with root package name */
    public final ArrayList f5425e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f5426f;

    public a(String str) {
        G7.j.e(str, "serialName");
        this.f5422a = C2824o.b;
        this.b = new ArrayList();
        this.f5423c = new HashSet();
        this.f5424d = new ArrayList();
        this.f5425e = new ArrayList();
        this.f5426f = new ArrayList();
    }

    public static void a(a aVar, String str, g gVar) {
        C2824o c2824o = C2824o.b;
        aVar.getClass();
        G7.j.e(gVar, "descriptor");
        if (aVar.f5423c.add(str)) {
            aVar.b.add(str);
            aVar.f5424d.add(gVar);
            aVar.f5425e.add(c2824o);
            aVar.f5426f.add(false);
            return;
        }
        throw new IllegalArgumentException(AbstractC2914a.e("Element with name '", str, "' is already registered").toString());
    }
}
