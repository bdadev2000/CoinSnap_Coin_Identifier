package ni;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class j0 extends va.b {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f22810i = 1;

    /* renamed from: j, reason: collision with root package name */
    public final Method f22811j;

    /* renamed from: k, reason: collision with root package name */
    public final int f22812k;

    /* renamed from: l, reason: collision with root package name */
    public final l f22813l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f22814m;

    public j0(Method method, int i10, wh.z zVar, l lVar) {
        this.f22811j = method;
        this.f22812k = i10;
        this.f22814m = zVar;
        this.f22813l = lVar;
    }

    @Override // va.b
    public final void e(p0 p0Var, Object obj) {
        wh.h0 h0Var = p0Var.f22836i;
        int i10 = this.f22810i;
        Object obj2 = this.f22814m;
        int i11 = this.f22812k;
        Method method = this.f22811j;
        l lVar = this.f22813l;
        switch (i10) {
            case 0:
                if (obj != null) {
                    try {
                        wh.s0 body = (wh.s0) lVar.convert(obj);
                        h0Var.getClass();
                        Intrinsics.checkNotNullParameter(body, "body");
                        wh.i0 part = wh.a0.l((wh.z) obj2, body);
                        Intrinsics.checkNotNullParameter(part, "part");
                        h0Var.f27065c.add(part);
                        return;
                    } catch (IOException e2) {
                        throw com.facebook.appevents.g.C(method, i11, "Unable to convert " + obj + " to RequestBody", e2);
                    }
                }
                return;
            default:
                Map map = (Map) obj;
                if (map != null) {
                    for (Map.Entry entry : map.entrySet()) {
                        String str = (String) entry.getKey();
                        if (str != null) {
                            Object value = entry.getValue();
                            if (value != null) {
                                wh.z n10 = qc.s0.n("Content-Disposition", com.applovin.impl.mediation.ads.e.f("form-data; name=\"", str, "\""), "Content-Transfer-Encoding", (String) obj2);
                                wh.s0 body2 = (wh.s0) lVar.convert(value);
                                h0Var.getClass();
                                Intrinsics.checkNotNullParameter(body2, "body");
                                wh.i0 part2 = wh.a0.l(n10, body2);
                                Intrinsics.checkNotNullParameter(part2, "part");
                                h0Var.f27065c.add(part2);
                            } else {
                                throw com.facebook.appevents.g.C(method, i11, com.applovin.impl.mediation.ads.e.f("Part map contained null value for key '", str, "'."), new Object[0]);
                            }
                        } else {
                            throw com.facebook.appevents.g.C(method, i11, "Part map contained null key.", new Object[0]);
                        }
                    }
                    return;
                }
                throw com.facebook.appevents.g.C(method, i11, "Part map was null.", new Object[0]);
        }
    }

    public j0(Method method, int i10, l lVar, String str) {
        this.f22811j = method;
        this.f22812k = i10;
        this.f22813l = lVar;
        this.f22814m = str;
    }
}
