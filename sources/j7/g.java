package j7;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class g {
    public final r4.c a;

    /* renamed from: b, reason: collision with root package name */
    public final e f19782b;

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f19783c;

    public g(Context context, e eVar) {
        r4.c cVar = new r4.c(context);
        this.f19783c = new HashMap();
        this.a = cVar;
        this.f19782b = eVar;
    }

    public final synchronized i a(String str) {
        if (this.f19783c.containsKey(str)) {
            return (i) this.f19783c.get(str);
        }
        CctBackendFactory p10 = this.a.p(str);
        if (p10 == null) {
            return null;
        }
        e eVar = this.f19782b;
        i create = p10.create(new c(eVar.a, eVar.f19777b, eVar.f19778c, str));
        this.f19783c.put(str, create);
        return create;
    }
}
