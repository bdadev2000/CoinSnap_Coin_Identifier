package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.newreward.function.c.c;
import java.util.Map;

/* loaded from: classes3.dex */
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
        if (bVar != null && this.f16919c != null) {
            try {
                if (bVar.i() == -1) {
                    this.f16919c.c(System.currentTimeMillis());
                }
                this.f16919c.b(bVar.i() + "");
                com.mbridge.msdk.foundation.same.net.e.c.a().a(this.f16919c.v() + "_" + this.f16919c.w() + "_" + this.f16919c.A() + "_" + this.f16919c.p(), bVar.i(), bVar.k(), System.currentTimeMillis());
            } catch (Exception e4) {
                if (MBridgeConstans.DEBUG) {
                    e4.printStackTrace();
                }
            }
        }
        if (!this.f16919c.l() && !this.f16919c.m() && !this.f16919c.n()) {
            b(bVar);
        } else {
            a(this.b, bVar);
        }
    }
}
