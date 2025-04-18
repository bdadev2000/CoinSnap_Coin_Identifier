package com.mbridge.msdk.videocommon.download;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes4.dex */
public final class h {
    private AtomicBoolean a;

    /* renamed from: b, reason: collision with root package name */
    private AtomicBoolean f16422b;

    /* loaded from: classes4.dex */
    public static final class a {
        private static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    public final boolean b(int i10) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f16422b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f16422b = new AtomicBoolean(af.a().a("r_v_r_f_c_r", false));
        } catch (Exception e2) {
            this.f16422b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.f16422b.get();
    }

    private h() {
    }

    public final boolean a(int i10) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i10 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i10 != 94 && i10 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.a = new AtomicBoolean(af.a().a("r_v_r_f_l", false));
        } catch (Exception e2) {
            this.a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.a.get();
    }

    public final int a(String str, int i10) {
        try {
            return af.a().a(str, i10);
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                com.applovin.impl.mediation.ads.e.p(e2, new StringBuilder("getRewardVideoCampaignRequestTimeout error: "), "RewardVideoRefactorManager");
            }
            return i10;
        }
    }
}
