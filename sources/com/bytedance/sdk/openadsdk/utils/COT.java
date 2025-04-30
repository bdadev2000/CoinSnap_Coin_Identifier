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
public class COT {
    private static long KS = 0;
    static float lMd = 0.0f;
    static int zp = -1;

    /* loaded from: classes.dex */
    public static class zp {
        public final float lMd;
        public final int zp;

        public zp(int i9, float f9) {
            this.zp = i9;
            this.lMd = f9;
        }
    }

    private static void zp(Intent intent) {
        if (intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1) == 2) {
            zp = 1;
        } else {
            zp = 0;
        }
        lMd = (intent.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static zp zp() {
        if (KS == 0 || SystemClock.elapsedRealtime() - KS > ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            Intent registerReceiver = com.bytedance.sdk.openadsdk.core.KVG.zp().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(registerReceiver)));
            if (registerReceiver != null) {
                zp(registerReceiver);
                KS = SystemClock.elapsedRealtime();
            }
        }
        return new zp(zp, lMd);
    }
}
