package l3;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* renamed from: l3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2441f {

    /* renamed from: a, reason: collision with root package name */
    public final k8.c f21563a;
    public final C2439d b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f21564c;

    /* JADX WARN: Type inference failed for: r0v0, types: [k8.c, java.lang.Object] */
    public C2441f(Context context, C2439d c2439d) {
        ?? obj = new Object();
        obj.f21500c = null;
        obj.b = context;
        this.f21564c = new HashMap();
        this.f21563a = obj;
        this.b = c2439d;
    }

    public final synchronized InterfaceC2443h a(String str) {
        if (this.f21564c.containsKey(str)) {
            return (InterfaceC2443h) this.f21564c.get(str);
        }
        CctBackendFactory b = this.f21563a.b(str);
        if (b == null) {
            return null;
        }
        C2439d c2439d = this.b;
        InterfaceC2443h create = b.create(new C2437b(c2439d.f21558a, c2439d.b, c2439d.f21559c, str));
        this.f21564c.put(str, create);
        return create;
    }
}
