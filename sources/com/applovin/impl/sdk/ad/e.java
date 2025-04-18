package com.applovin.impl.sdk.ad;

import com.applovin.impl.ql;
import com.applovin.impl.rq;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements n.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f7617c;

    public /* synthetic */ e(b bVar, int i10) {
        this.f7616b = i10;
        this.f7617c = bVar;
    }

    @Override // n.a, o7.h
    public final Object apply(Object obj) {
        List j3;
        List lambda$getOpenMeasurementVerificationScriptResources$1;
        List r6;
        Map c10;
        List e2;
        rq q10;
        List d10;
        List a;
        List g10;
        List b3;
        List l10;
        List i10;
        List f10;
        int i11 = this.f7616b;
        b bVar = this.f7617c;
        switch (i11) {
            case 0:
                lambda$getOpenMeasurementVerificationScriptResources$1 = bVar.lambda$getOpenMeasurementVerificationScriptResources$1((JSONArray) obj);
                return lambda$getOpenMeasurementVerificationScriptResources$1;
            case 1:
                r6 = bVar.r((ql) obj);
                return r6;
            case 2:
                c10 = bVar.c((ql) obj);
                return c10;
            case 3:
                e2 = bVar.e((ql) obj);
                return e2;
            case 4:
                q10 = bVar.q((ql) obj);
                return q10;
            case 5:
                d10 = bVar.d((ql) obj);
                return d10;
            case 6:
                a = bVar.a((ql) obj);
                return a;
            case 7:
                g10 = bVar.g((ql) obj);
                return g10;
            case 8:
                b3 = bVar.b((ql) obj);
                return b3;
            case 9:
                l10 = bVar.l((ql) obj);
                return l10;
            case 10:
                i10 = bVar.i((ql) obj);
                return i10;
            case 11:
                f10 = bVar.f((ql) obj);
                return f10;
            default:
                j3 = bVar.j((ql) obj);
                return j3;
        }
    }
}
