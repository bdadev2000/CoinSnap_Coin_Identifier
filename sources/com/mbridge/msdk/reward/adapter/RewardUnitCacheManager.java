package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.system.NoProGuard;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes4.dex */
public final class RewardUnitCacheManager implements NoProGuard {
    private static final String TAG = "RewardUnitCacheManager";
    private ConcurrentHashMap<String, com.mbridge.msdk.videocommon.d.c> rewardUnitSettings;

    /* loaded from: classes4.dex */
    public static final class a {
        private static final RewardUnitCacheManager a = new RewardUnitCacheManager();
    }

    public static RewardUnitCacheManager getInstance() {
        return a.a;
    }

    public final void add(String str, String str2, com.mbridge.msdk.videocommon.d.c cVar) {
        try {
            String str3 = str + "_" + str2;
            if (cVar != null && this.rewardUnitSettings.containsKey(str3)) {
                this.rewardUnitSettings.remove(str3);
            }
            this.rewardUnitSettings.put(str3, cVar);
        } catch (Exception e2) {
            ad.b(TAG, e2.getMessage());
        }
    }

    public final com.mbridge.msdk.videocommon.d.c get(String str, String str2) {
        try {
            try {
                return this.rewardUnitSettings.remove(str + "_" + str2);
            } catch (Exception e2) {
                ad.b(TAG, e2.getMessage());
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    private RewardUnitCacheManager() {
        this.rewardUnitSettings = new ConcurrentHashMap<>();
    }
}
