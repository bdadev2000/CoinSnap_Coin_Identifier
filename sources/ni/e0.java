package ni;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class e0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22789i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f22790j;

    /* renamed from: k, reason: collision with root package name */
    public final int f22791k;

    /* renamed from: l, reason: collision with root package name */
    public final l f22792l;

    public /* synthetic */ e0(Method method, int i10, l lVar, int i11) {
        this.f22789i = i11;
        this.f22790j = method;
        this.f22791k = i10;
        this.f22792l = lVar;
    }

    @Override // va.b
    public final void e(p0 p0Var, Object obj) {
        int i10 = this.f22789i;
        l lVar = this.f22792l;
        Method method = this.f22790j;
        int i11 = this.f22791k;
        switch (i10) {
            case 0:
                if (obj != null) {
                    try {
                        p0Var.f22838k = (wh.s0) lVar.convert(obj);
                        return;
                    } catch (IOException e2) {
                        throw com.facebook.appevents.g.D(method, e2, i11, "Unable to convert " + obj + " to RequestBody", new Object[0]);
                    }
                }
                throw com.facebook.appevents.g.C(method, i11, "Body parameter value must not be null.", new Object[0]);
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                p0Var.b(str, (String) lVar.convert(value));
                            } else {
                                throw com.facebook.appevents.g.C(method, i11, com.applovin.impl.mediation.ads.e.f("Header map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw com.facebook.appevents.g.C(method, i11, "Header map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw com.facebook.appevents.g.C(method, i11, "Header map was null.", new Object[0]);
        }
    }
}
