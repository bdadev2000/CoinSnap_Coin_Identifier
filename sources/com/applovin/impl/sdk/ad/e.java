package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.rq;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import t.InterfaceC2702a;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements InterfaceC2702a {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f10767c;

    public /* synthetic */ e(b bVar, int i9) {
        this.b = i9;
        this.f10767c = bVar;
    }

    @Override // t.InterfaceC2702a
    public final Object apply(Object obj) {
        rq q9;
        List e4;
        List r9;
        List l;
        Map c9;
        List a6;
        List g9;
        List b;
        List i9;
        List lambda$getOpenMeasurementVerificationScriptResources$1;
        List j7;
        List f9;
        List d2;
        switch (this.b) {
            case 0:
                q9 = this.f10767c.q((ql) obj);
                return q9;
            case 1:
                e4 = this.f10767c.e((ql) obj);
                return e4;
            case 2:
                r9 = this.f10767c.r((ql) obj);
                return r9;
            case 3:
                l = this.f10767c.l((ql) obj);
                return l;
            case 4:
                c9 = this.f10767c.c((ql) obj);
                return c9;
            case 5:
                a6 = this.f10767c.a((ql) obj);
                return a6;
            case 6:
                g9 = this.f10767c.g((ql) obj);
                return g9;
            case 7:
                b = this.f10767c.b((ql) obj);
                return b;
            case 8:
                i9 = this.f10767c.i((ql) obj);
                return i9;
            case 9:
                lambda$getOpenMeasurementVerificationScriptResources$1 = this.f10767c.lambda$getOpenMeasurementVerificationScriptResources$1((JSONArray) obj);
                return lambda$getOpenMeasurementVerificationScriptResources$1;
            case 10:
                j7 = this.f10767c.j((ql) obj);
                return j7;
            case 11:
                f9 = this.f10767c.f((ql) obj);
                return f9;
            default:
                d2 = this.f10767c.d((ql) obj);
                return d2;
        }
    }
}
