package l1;

import e0.w;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final String f31011a;

    /* renamed from: b, reason: collision with root package name */
    public List f31012b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f31013c;
    public final HashSet d;
    public final ArrayList e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f31014f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f31015g;

    public a(String str) {
        p0.a.s(str, "serialName");
        this.f31011a = str;
        this.f31012b = w.f30218a;
        this.f31013c = new ArrayList();
        this.d = new HashSet();
        this.e = new ArrayList();
        this.f31014f = new ArrayList();
        this.f31015g = new ArrayList();
    }

    public static void a(a aVar, String str, f fVar) {
        w wVar = w.f30218a;
        aVar.getClass();
        p0.a.s(fVar, "descriptor");
        if (!aVar.d.add(str)) {
            StringBuilder v2 = android.support.v4.media.d.v("Element with name '", str, "' is already registered in ");
            v2.append(aVar.f31011a);
            throw new IllegalArgumentException(v2.toString().toString());
        }
        aVar.f31013c.add(str);
        aVar.e.add(fVar);
        aVar.f31014f.add(wVar);
        aVar.f31015g.add(false);
    }
}
