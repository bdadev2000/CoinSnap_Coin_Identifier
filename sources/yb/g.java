package yb;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class g implements wb.a {

    /* renamed from: d, reason: collision with root package name */
    public static final xb.a f28155d = new xb.a(2);
    public final HashMap a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f28156b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final xb.a f28157c = f28155d;

    public final wb.a a(Class cls, vb.d dVar) {
        this.a.put(cls, dVar);
        this.f28156b.remove(cls);
        return this;
    }
}
