package com.mbridge.msdk.newreward.b;

import android.text.TextUtils;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.a.f;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class d extends a implements RewardVideoListener, c {

    /* renamed from: d, reason: collision with root package name */
    RewardVideoListener f14426d;

    /* renamed from: e, reason: collision with root package name */
    private int f14427e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14428f;

    /* renamed from: g, reason: collision with root package name */
    private int f14429g;

    /* renamed from: h, reason: collision with root package name */
    private int f14430h;

    /* renamed from: i, reason: collision with root package name */
    private int f14431i;

    public d(int i10, String str, String str2, boolean z10) {
        super(i10, str, str2, z10);
        this.f14427e = 2;
        this.f14428f = false;
        if (i10 == 287) {
            this.f14427e = com.mbridge.msdk.foundation.same.a.W;
        } else {
            this.f14427e = com.mbridge.msdk.foundation.same.a.V;
        }
    }

    @Override // com.mbridge.msdk.newreward.b.a
    public final void a() {
        this.f14418b.a(this.a, this.f14419c);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final boolean b() {
        return this.f14418b.d();
    }

    public final String c() {
        e b3;
        com.mbridge.msdk.newreward.function.f.a x10;
        com.mbridge.msdk.newreward.function.d.a.b b10;
        com.mbridge.msdk.newreward.a.c cVar = this.f14418b;
        if (cVar == null || (b3 = cVar.b()) == null || (x10 = b3.x()) == null || (b10 = x10.b()) == null) {
            return "";
        }
        String d10 = b10.d();
        if (TextUtils.isEmpty(d10)) {
            return "";
        }
        return d10;
    }

    public final String d() {
        e b3;
        com.mbridge.msdk.newreward.function.f.a x10;
        com.mbridge.msdk.newreward.function.d.a.b b10;
        com.mbridge.msdk.newreward.a.c cVar = this.f14418b;
        if (cVar == null || (b3 = cVar.b()) == null || (x10 = b3.x()) == null || (b10 = x10.b()) == null) {
            return "";
        }
        return com.mbridge.msdk.foundation.same.c.a(b10.C());
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z10, int i10) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z10, i10);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        try {
            ((MBridgeDailyPlayModel) this.a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).insertDailyCap();
        } catch (Exception e2) {
            com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("updateDailyShowCap error:"), "RewardVideoController");
        }
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f14426d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(boolean z10, String str) {
        f fVar = new f(this.a);
        e eVar = new e(z10, this.f14419c.e(), str, this.f14419c.c(), this.f14419c.f());
        eVar.d(this.f14419c.d());
        eVar.d(this.f14427e);
        eVar.c(com.mbridge.msdk.foundation.controller.c.m().k());
        eVar.c(this.f14419c.f() ? 2 : 1);
        eVar.e(com.mbridge.msdk.newreward.function.h.b.a(str));
        eVar.b(this.f14428f);
        eVar.a(this.f14429g, this.f14430h, this.f14431i);
        this.f14418b.a(eVar, fVar);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(String str) {
        this.f14418b.c();
    }

    public final void a(int i10) {
        this.f14427e = i10;
        com.mbridge.msdk.newreward.a.c cVar = this.f14418b;
        if (cVar != null) {
            Iterator<e> it = cVar.a().iterator();
            while (it.hasNext()) {
                it.next().d(i10);
            }
        }
    }

    public final void a(int i10, int i11, int i12) {
        this.f14429g = i10;
        this.f14430h = i11;
        if (i11 == com.mbridge.msdk.foundation.same.a.J) {
            this.f14431i = i12 < 0 ? 5 : i12;
        }
        if (i11 == com.mbridge.msdk.foundation.same.a.I) {
            this.f14431i = i12 < 0 ? 80 : i12;
        }
        com.mbridge.msdk.newreward.function.h.a.a(this.f14419c.c(), i10, i11, i12);
    }

    public final void a(boolean z10) {
        this.f14428f = z10;
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(RewardVideoListener rewardVideoListener) {
        this.f14426d = rewardVideoListener;
        this.f14418b.a(this);
    }
}
