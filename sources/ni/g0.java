package ni;

import java.lang.reflect.Method;
import java.util.Map;

/* loaded from: classes5.dex */
public final class g0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22799i;

    /* renamed from: j, reason: collision with root package name */
    public final Method f22800j;

    /* renamed from: k, reason: collision with root package name */
    public final int f22801k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f22802l;

    public /* synthetic */ g0(Method method, int i10, boolean z10, int i11) {
        this.f22799i = i11;
        this.f22800j = method;
        this.f22801k = i10;
        this.f22802l = z10;
    }

    @Override // va.b
    public final /* bridge */ /* synthetic */ void e(p0 p0Var, Object obj) {
        switch (this.f22799i) {
            case 0:
                u(p0Var, (Map) obj);
                return;
            default:
                u(p0Var, (Map) obj);
                return;
        }
    }

    public final void u(p0 p0Var, Map map) {
        int i10 = this.f22799i;
        boolean z10 = this.f22802l;
        Method method = this.f22800j;
        int i11 = this.f22801k;
        switch (i10) {
            case 0:
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                String obj = value.toString();
                                if (obj != null) {
                                    p0Var.a(str, obj, z10);
                                } else {
                                    throw com.facebook.appevents.g.C(method, i11, "Field map value '" + value + "' converted to null by " + a.class.getName() + " for key '" + str + "'.", new Object[0]);
                                }
                            } else {
                                throw com.facebook.appevents.g.C(method, i11, com.applovin.impl.mediation.ads.e.f("Field map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw com.facebook.appevents.g.C(method, i11, "Field map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw com.facebook.appevents.g.C(method, i11, "Field map was null.", new Object[0]);
            default:
                if (map != null) {
                    for (Map.Entry entry2 : map.entrySet()) {
                        String str2 = (String) entry2.getKey();
                        if (str2 != null) {
                            Object value2 = entry2.getValue();
                            if (value2 != null) {
                                String obj2 = value2.toString();
                                if (obj2 != null) {
                                    p0Var.c(str2, obj2, z10);
                                } else {
                                    throw com.facebook.appevents.g.C(method, i11, "Query map value '" + value2 + "' converted to null by " + a.class.getName() + " for key '" + str2 + "'.", new Object[0]);
                                }
                            } else {
                                throw com.facebook.appevents.g.C(method, i11, com.applovin.impl.mediation.ads.e.f("Query map contained null value for key '", str2, "'."), new Object[0]);
                            }
                        } else {
                            throw com.facebook.appevents.g.C(method, i11, "Query map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw com.facebook.appevents.g.C(method, i11, "Query map was null", new Object[0]);
        }
    }
}
