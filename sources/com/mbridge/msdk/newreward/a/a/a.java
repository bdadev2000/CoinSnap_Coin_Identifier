package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes4.dex */
public abstract class a implements com.mbridge.msdk.newreward.a.b.b {

    /* renamed from: d, reason: collision with root package name */
    private static String f14336d = "LoadController";
    protected c a;

    /* renamed from: b, reason: collision with root package name */
    protected MBridgeIds f14337b;

    /* renamed from: c, reason: collision with root package name */
    protected e f14338c;

    /* renamed from: e, reason: collision with root package name */
    private RewardVideoListener f14339e;

    public a(c cVar) {
        this.a = cVar;
    }

    public final void a(int i10, Object obj) {
        if (i10 != 1) {
            if (i10 != 2) {
                return;
            }
            this.f14338c.b(2);
            if (this.f14338c.i()) {
                return;
            }
            c cVar = this.a;
            cVar.a(this.f14338c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS, cVar.a("cache", 2));
            if (this.f14339e != null) {
                this.f14338c.d(true);
                this.f14339e.onVideoLoadSuccess(this.f14337b);
                return;
            }
            return;
        }
        if (this.f14338c.h()) {
            return;
        }
        c cVar2 = this.a;
        e eVar = this.f14338c;
        com.mbridge.msdk.newreward.function.c.e eVar2 = com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS;
        Object[] objArr = new Object[6];
        objArr[0] = "metrics_data";
        objArr[1] = obj;
        objArr[2] = "auto_load";
        objArr[3] = Integer.valueOf(eVar.B() ? 2 : 1);
        objArr[4] = "cache";
        objArr[5] = 2;
        cVar2.a(eVar, eVar2, cVar2.a(objArr));
        if (this.f14339e != null) {
            this.f14338c.c(true);
            this.f14339e.onLoadSuccess(this.f14337b);
        }
    }

    public final void b(final com.mbridge.msdk.foundation.c.b bVar) {
        c cVar = this.a;
        cVar.b(cVar.a("adapter_model", this.f14338c, "command_manager", cVar, "scene", 2, "reason", bVar), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a.this.a(1, obj);
                a.this.a(2, obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                a aVar = a.this;
                aVar.a(aVar.f14337b, bVar);
            }
        });
    }

    public final void a(MBridgeIds mBridgeIds, com.mbridge.msdk.foundation.c.b bVar) {
        this.f14338c.b(2);
        if (this.f14338c.i()) {
            return;
        }
        c cVar = this.a;
        cVar.a(this.f14338c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
        if (this.f14339e != null) {
            this.f14338c.d(true);
            RewardVideoListener rewardVideoListener = this.f14339e;
            if (rewardVideoListener != null) {
                rewardVideoListener.onVideoLoadFail(mBridgeIds, bVar.b());
            }
        }
    }

    public final void a(e eVar) {
        eVar.b(1);
        this.f14338c = eVar;
        this.f14339e = eVar.D();
        MBridgeIds mBridgeIds = (MBridgeIds) this.a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        this.f14337b = mBridgeIds;
        mBridgeIds.setLocalRequestId(this.f14338c.z());
        this.f14337b.setBidToken(this.f14338c.C());
        c cVar = this.a;
        cVar.c(cVar.a("command_type", com.mbridge.msdk.newreward.function.c.e.PRE_HANDLE_LOAD, "command_manager", cVar, "adapter_model", this.f14338c), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a aVar = a.this;
                c cVar2 = aVar.a;
                cVar2.a(cVar2.a("command_manager", cVar2, "adapter_model", aVar.f14338c), a.this);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar) {
                a aVar = a.this;
                aVar.a(aVar.f14337b, bVar);
            }
        });
    }
}
