package com.mbridge.msdk.newreward.function.c.b.a;

import android.text.TextUtils;
import com.applovin.impl.L;
import java.util.Map;

/* loaded from: classes3.dex */
public final class a implements com.mbridge.msdk.newreward.function.c.b.d {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.b.a f17063a;

    public final Object a(Object obj) {
        com.mbridge.msdk.foundation.c.b bVar;
        com.mbridge.msdk.newreward.a.e eVar;
        com.mbridge.msdk.newreward.function.c.c cVar;
        int i9;
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
            boolean z8 = false;
            if (map.get("candidate_type") != null) {
                i9 = ((Integer) map.get("candidate_type")).intValue();
            } else {
                i9 = 0;
            }
            if (this.f17063a == null) {
                String A8 = eVar.A();
                if (eVar.p() == 287) {
                    z8 = true;
                }
                this.f17063a = new com.mbridge.msdk.newreward.function.b.a(A8, z8, cVar);
            }
            com.mbridge.msdk.foundation.same.report.d.b bVar2 = new com.mbridge.msdk.foundation.same.report.d.b();
            bVar2.c(eVar.z());
            if (i9 == 0) {
                String C8 = eVar.C();
                if (TextUtils.isEmpty(C8)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b a6 = this.f17063a.a(bVar2, bVar, eVar, 1);
                    this.f17063a.a(bVar2, C8, a6, null, null, eVar, 3);
                    return a6;
                } catch (Exception e4) {
                    L.s(e4, new StringBuilder("load error"), "CandidateReceiver");
                    return null;
                }
            }
            if (i9 == 1) {
                String C9 = eVar.C();
                if (TextUtils.isEmpty(C9)) {
                    return Boolean.FALSE;
                }
                try {
                    return Boolean.valueOf(this.f17063a.a(C9));
                } catch (Exception e9) {
                    L.s(e9, new StringBuilder("loadCallBack error"), "CandidateReceiver");
                    return Boolean.FALSE;
                }
            }
            if (i9 == 2) {
                String C10 = eVar.C();
                if (TextUtils.isEmpty(C10)) {
                    return null;
                }
                try {
                    com.mbridge.msdk.newreward.function.a.b a9 = this.f17063a.a(bVar2, bVar, eVar, 2);
                    com.mbridge.msdk.newreward.function.b.a aVar = this.f17063a;
                    if (aVar != null) {
                        aVar.a(bVar2, C10, a9, null, null, eVar, 1);
                    }
                    return a9;
                } catch (Exception e10) {
                    L.s(e10, new StringBuilder("loadCallBack error"), "CandidateReceiver");
                    return null;
                }
            }
            if (TextUtils.isEmpty(eVar.C())) {
                return null;
            }
            try {
                return this.f17063a.a(bVar2, bVar, eVar, 2);
            } catch (Exception e11) {
                L.s(e11, new StringBuilder("load error"), "CandidateReceiver");
            }
        }
        return null;
    }
}
