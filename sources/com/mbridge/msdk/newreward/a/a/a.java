package com.mbridge.msdk.newreward.a.a;

import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.function.c.c;
import com.mbridge.msdk.out.MBridgeIds;

/* loaded from: classes3.dex */
public abstract class a implements com.mbridge.msdk.newreward.a.b.b {

    /* renamed from: d, reason: collision with root package name */
    private static String f16917d = "LoadController";

    /* renamed from: a, reason: collision with root package name */
    protected c f16918a;
    protected MBridgeIds b;

    /* renamed from: c, reason: collision with root package name */
    protected e f16919c;

    /* renamed from: e, reason: collision with root package name */
    private RewardVideoListener f16920e;

    public a(c cVar) {
        this.f16918a = cVar;
    }

    public final void a(int i9, Object obj) {
        if (i9 == 1) {
            if (this.f16919c.h()) {
                return;
            }
            c cVar = this.f16918a;
            e eVar = this.f16919c;
            cVar.a(eVar, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_V3_CAMPAIGN_SUCCESS, cVar.a("metrics_data", obj, "auto_load", Integer.valueOf(eVar.B() ? 2 : 1), "cache", 2));
            if (this.f16920e != null) {
                this.f16919c.c(true);
                this.f16920e.onLoadSuccess(this.b);
                return;
            }
            return;
        }
        if (i9 != 2) {
            return;
        }
        this.f16919c.b(2);
        if (this.f16919c.i()) {
            return;
        }
        c cVar2 = this.f16918a;
        cVar2.a(this.f16919c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_VIDEO_CAMPAIGN_SUCCESS, cVar2.a("cache", 2));
        if (this.f16920e != null) {
            this.f16919c.d(true);
            this.f16920e.onVideoLoadSuccess(this.b);
        }
    }

    public final void b(final com.mbridge.msdk.foundation.c.b bVar) {
        c cVar = this.f16918a;
        cVar.b(cVar.a("adapter_model", this.f16919c, "command_manager", cVar, "scene", 2, "reason", bVar), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.2
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a.this.a(1, obj);
                a.this.a(2, obj);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                a aVar = a.this;
                aVar.a(aVar.b, bVar);
            }
        });
    }

    public final void a(MBridgeIds mBridgeIds, com.mbridge.msdk.foundation.c.b bVar) {
        this.f16919c.b(2);
        if (this.f16919c.i()) {
            return;
        }
        c cVar = this.f16918a;
        cVar.a(this.f16919c, com.mbridge.msdk.newreward.function.c.e.REPORT_LOAD_FAILED, cVar.a("metrics_data", bVar));
        if (this.f16920e != null) {
            this.f16919c.d(true);
            RewardVideoListener rewardVideoListener = this.f16920e;
            if (rewardVideoListener != null) {
                rewardVideoListener.onVideoLoadFail(mBridgeIds, bVar.b());
            }
        }
    }

    public final void a(e eVar) {
        eVar.b(1);
        this.f16919c = eVar;
        this.f16920e = eVar.D();
        MBridgeIds mBridgeIds = (MBridgeIds) this.f16918a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_BIDS);
        this.b = mBridgeIds;
        mBridgeIds.setLocalRequestId(this.f16919c.z());
        this.b.setBidToken(this.f16919c.C());
        c cVar = this.f16918a;
        cVar.c(cVar.a("command_type", com.mbridge.msdk.newreward.function.c.e.PRE_HANDLE_LOAD, "command_manager", cVar, "adapter_model", this.f16919c), new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.a.a.a.1
            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(Object obj) {
                a aVar = a.this;
                c cVar2 = aVar.f16918a;
                cVar2.a(cVar2.a("command_manager", cVar2, "adapter_model", aVar.f16919c), a.this);
            }

            @Override // com.mbridge.msdk.newreward.a.b.b
            public final void a(com.mbridge.msdk.foundation.c.b bVar) {
                a aVar = a.this;
                aVar.a(aVar.b, bVar);
            }
        });
    }
}
