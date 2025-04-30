package com.mbridge.msdk.newreward.b;

import android.text.TextUtils;
import com.applovin.impl.L;
import com.mbridge.msdk.newout.RewardVideoListener;
import com.mbridge.msdk.newreward.a.e;
import com.mbridge.msdk.newreward.a.f;
import com.mbridge.msdk.newreward.function.common.MBridgeDailyPlayModel;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.RewardInfo;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d extends a implements RewardVideoListener, c {

    /* renamed from: d, reason: collision with root package name */
    RewardVideoListener f17029d;

    /* renamed from: e, reason: collision with root package name */
    private int f17030e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f17031f;

    /* renamed from: g, reason: collision with root package name */
    private int f17032g;

    /* renamed from: h, reason: collision with root package name */
    private int f17033h;

    /* renamed from: i, reason: collision with root package name */
    private int f17034i;

    public d(int i9, String str, String str2, boolean z8) {
        super(i9, str, str2, z8);
        this.f17030e = 2;
        this.f17031f = false;
        if (i9 == 287) {
            this.f17030e = com.mbridge.msdk.foundation.same.a.f15675W;
        } else {
            this.f17030e = com.mbridge.msdk.foundation.same.a.f15674V;
        }
    }

    @Override // com.mbridge.msdk.newreward.b.a
    public final void a() {
        this.b.a(this.f17021a, this.f17022c);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final boolean b() {
        return this.b.d();
    }

    public final String c() {
        e b;
        com.mbridge.msdk.newreward.function.f.a x9;
        com.mbridge.msdk.newreward.function.d.a.b b8;
        com.mbridge.msdk.newreward.a.c cVar = this.b;
        if (cVar == null || (b = cVar.b()) == null || (x9 = b.x()) == null || (b8 = x9.b()) == null) {
            return "";
        }
        String d2 = b8.d();
        if (TextUtils.isEmpty(d2)) {
            return "";
        }
        return d2;
    }

    public final String d() {
        e b;
        com.mbridge.msdk.newreward.function.f.a x9;
        com.mbridge.msdk.newreward.function.d.a.b b8;
        com.mbridge.msdk.newreward.a.c cVar = this.b;
        if (cVar == null || (b = cVar.b()) == null || (x9 = b.x()) == null || (b8 = x9.b()) == null) {
            return "";
        }
        return com.mbridge.msdk.foundation.same.c.a(b8.C());
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdClose(MBridgeIds mBridgeIds, RewardInfo rewardInfo) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdClose(mBridgeIds, rewardInfo);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdCloseWithIVReward(MBridgeIds mBridgeIds, boolean z8, int i9) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdCloseWithIVReward(mBridgeIds, z8, i9);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onAdShow(MBridgeIds mBridgeIds) {
        try {
            ((MBridgeDailyPlayModel) this.f17021a.a((Object) null, com.mbridge.msdk.newreward.function.c.e.CREATE_DAILY)).insertDailyCap();
        } catch (Exception e4) {
            L.s(e4, new StringBuilder("updateDailyShowCap error:"), "RewardVideoController");
        }
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onAdShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onEndcardShow(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onEndcardShow(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onShowFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onShowFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoAdClicked(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoAdClicked(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoComplete(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoComplete(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadFail(MBridgeIds mBridgeIds, String str) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadFail(mBridgeIds, str);
        }
    }

    @Override // com.mbridge.msdk.newout.RewardVideoListener
    public final void onVideoLoadSuccess(MBridgeIds mBridgeIds) {
        RewardVideoListener rewardVideoListener = this.f17029d;
        if (rewardVideoListener != null) {
            rewardVideoListener.onVideoLoadSuccess(mBridgeIds);
        }
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(boolean z8, String str) {
        f fVar = new f(this.f17021a);
        e eVar = new e(z8, this.f17022c.e(), str, this.f17022c.c(), this.f17022c.f());
        eVar.d(this.f17022c.d());
        eVar.d(this.f17030e);
        eVar.c(com.mbridge.msdk.foundation.controller.c.m().k());
        eVar.c(this.f17022c.f() ? 2 : 1);
        eVar.e(com.mbridge.msdk.newreward.function.h.b.a(str));
        eVar.b(this.f17031f);
        eVar.a(this.f17032g, this.f17033h, this.f17034i);
        this.b.a(eVar, fVar);
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(String str) {
        this.b.c();
    }

    public final void a(int i9) {
        this.f17030e = i9;
        com.mbridge.msdk.newreward.a.c cVar = this.b;
        if (cVar != null) {
            Iterator<e> it = cVar.a().iterator();
            while (it.hasNext()) {
                it.next().d(i9);
            }
        }
    }

    public final void a(int i9, int i10, int i11) {
        this.f17032g = i9;
        this.f17033h = i10;
        if (i10 == com.mbridge.msdk.foundation.same.a.f15663J) {
            this.f17034i = i11 < 0 ? 5 : i11;
        }
        if (i10 == com.mbridge.msdk.foundation.same.a.f15662I) {
            this.f17034i = i11 < 0 ? 80 : i11;
        }
        com.mbridge.msdk.newreward.function.h.a.a(this.f17022c.c(), i9, i10, i11);
    }

    public final void a(boolean z8) {
        this.f17031f = z8;
    }

    @Override // com.mbridge.msdk.newreward.b.c
    public final void a(RewardVideoListener rewardVideoListener) {
        this.f17029d = rewardVideoListener;
        this.b.a(this);
    }
}
