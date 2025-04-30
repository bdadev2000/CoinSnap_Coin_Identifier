package com.mbridge.msdk.videocommon.download;

import com.applovin.impl.L;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.af;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private AtomicBoolean f19456a;
    private AtomicBoolean b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private static final h f19457a = new h();

        public static /* synthetic */ h a() {
            return f19457a;
        }
    }

    public static h a() {
        return a.f19457a;
    }

    public final boolean b(int i9) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i9 + ", key: REWARD_VIDEO_REFACTOR_FOR_CAMPAIGN_REQUEST");
        }
        if (i9 != 94 && i9 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.b;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.b = new AtomicBoolean(af.a().a("r_v_r_f_c_r", false));
        } catch (Exception e4) {
            this.b = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                L.s(e4, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.b.get();
    }

    private h() {
    }

    public final boolean a(int i9) {
        if (MBridgeConstans.DEBUG) {
            ad.c("RewardVideoRefactorManager", "isRewardVideoRefactor adType: " + i9 + ", key: REWARD_VIDEO_REFACTOR_FOR_LOAD");
        }
        if (i9 != 94 && i9 != 287) {
            return false;
        }
        AtomicBoolean atomicBoolean = this.f19456a;
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        try {
            this.f19456a = new AtomicBoolean(af.a().a("r_v_r_f_l", false));
        } catch (Exception e4) {
            this.f19456a = new AtomicBoolean(false);
            if (MBridgeConstans.DEBUG) {
                L.s(e4, new StringBuilder("isRewardVideoRefactor error: "), "RewardVideoRefactorManager");
            }
        }
        return this.f19456a.get();
    }

    public final int a(String str, int i9) {
        try {
            return af.a().a(str, i9);
        } catch (Exception e4) {
            if (MBridgeConstans.DEBUG) {
                L.s(e4, new StringBuilder("getRewardVideoCampaignRequestTimeout error: "), "RewardVideoRefactorManager");
            }
            return i9;
        }
    }
}
