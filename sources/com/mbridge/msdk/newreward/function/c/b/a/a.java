package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes4.dex */
public final class a implements com.mbridge.msdk.newreward.function.c.b.d {
    private com.mbridge.msdk.newreward.function.b.a a;

    public final Object a(Object obj) {
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.newreward.a.e eVar;
        com.mbridge.msdk.newreward.function.c.c cVar;
        int i10;
        if (obj == null) {
            return null;
        }
        Map map = (Map) obj;
        if (map.get("reason") != null) {
            bVar = (com.mbridge.msdk.foundation.c.b) map.get("reason");
        } else {
            bVar = null;
        }
        if (map.get("adapter_model") != null) {
            eVar = (com.mbridge.msdk.newreward.a.e) map.get("adapter_model");
        } else {
            eVar = null;
        }
        if (map.get("command_manager") != null) {
            cVar = (com.mbridge.msdk.newreward.function.c.c) map.get("command_manager");
        } else {
            cVar = null;
        }
        if (eVar != null && cVar != null) {
            boolean z10 = false;
            if (map.get("candidate_type") != null) {
                i10 = ((Integer) map.get("candidate_type")).intValue();
            } else {
                i10 = 0;
            }
            if (this.a == null) {
                String A = eVar.A();
                if (eVar.p() == 287) {
                    z10 = true;
                }
                this.a = new com.mbridge.msdk.newreward.function.b.a(A, z10, cVar);
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar2.c(eVar.z());
            if (i10 == 0) {
                String C = eVar.C();
                if (TextUtils.isEmpty(C)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b a = this.a.a(bVar2, bVar, eVar, 1);
                    this.a.a(bVar2, C, a, null, null, eVar, 3);
                    return a;
                } catch (Exception e2) {
                    com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("load error"), "CandidateReceiver");
                    return null;
                }
            }
            if (i10 == 1) {
                String C2 = eVar.C();
                if (TextUtils.isEmpty(C2)) {
                    return Boolean.FALSE;
                }
                try {
                    return Boolean.valueOf(this.a.a(C2));
                } catch (Exception e10) {
                    com.applovin.impl.mediation.ads.e.p(e10, new StringBuilder("loadCallBack error"), "CandidateReceiver");
                    return Boolean.FALSE;
                }
            }
            if (i10 == 2) {
                String C3 = eVar.C();
                if (TextUtils.isEmpty(C3)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b a10 = this.a.a(bVar2, bVar, eVar, 2);
                    com.mbridge.msdk.newreward.function.b.a aVar = this.a;
                    if (aVar != null) {
                        aVar.a(bVar2, C3, a10, null, null, eVar, 1);
                    }
                    return a10;
                } catch (Exception e11) {
                    com.applovin.impl.mediation.ads.e.p(e11, new StringBuilder("loadCallBack error"), "CandidateReceiver");
                    return null;
                }
            }
            if (TextUtils.isEmpty(eVar.C())) {
                return null;
            }
            try {
                return this.a.a(bVar2, bVar, eVar, 2);
            } catch (Exception e12) {
                com.applovin.impl.mediation.ads.e.p(e12, new StringBuilder("load error"), "CandidateReceiver");
            }
        }
        return null;
    }
}
