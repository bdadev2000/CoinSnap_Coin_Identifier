package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import com.applovin.sdk.AppLovinEventTypes;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public class wN {
    static float Sg = 0.0f;
    static int YFl = -1;
    private static long tN;

    /* loaded from: classes.dex */
    public static class YFl {
        public final float Sg;
        public final int YFl;

        public YFl(int i10, float f10) {
            this.YFl = i10;
            this.Sg = f10;
        }
    }

    private static void YFl(Intent intent) {
        if (intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 2) {
            YFl = 1;
        } else {
            YFl = 0;
        }
        Sg = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static YFl YFl() {
        if (tN == 0 || SystemClock.elapsedRealtime() - tN > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent registerReceiver = com.bytedance.sdk.openadsdk.core.lG.YFl().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver)));
            if (registerReceiver != null) {
                YFl(registerReceiver);
                tN = SystemClock.elapsedRealtime();
            }
        }
        return new YFl(YFl, Sg);
    }
}
