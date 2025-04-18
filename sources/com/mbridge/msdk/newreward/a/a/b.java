package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.c.c;
import java.util.Map;

/* loaded from: classes4.dex */
public final class b extends a {
    public b(c cVar) {
        super(cVar);
    }

    @Override // com.mbridge.msdk.newreward.a.b.b
    public final void a(Object obj) {
        Map map = (Map) obj;
        a(((Integer) map.get("type")).intValue(), map.get("object"));
    }

    @Override // com.mbridge.msdk.newreward.a.b.b
    public final void a(com.mbridge.msdk.foundation.c.b bVar) {
        if (bVar != null && this.f14338c != null) {
            try {
                if (bVar.i() == -1) {
                    this.f14338c.c(System.currentTimeMillis());
                }
                this.f14338c.b(bVar.i() + "");
                com.mbridge.msdk.foundation.same.net.e.c.a().a(this.f14338c.v() + "_" + this.f14338c.w() + "_" + this.f14338c.A() + "_" + this.f14338c.p(), bVar.i(), bVar.k(), System.currentTimeMillis());
            } catch (Exception e2) {
                if (MBridgeConstans.DEBUG) {
                    e2.printStackTrace();
                }
            }
        }
        if (!this.f14338c.l() && !this.f14338c.m() && !this.f14338c.n()) {
            b(bVar);
        } else {
            a(this.f14337b, bVar);
        }
    }
}
