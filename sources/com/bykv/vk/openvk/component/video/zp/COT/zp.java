package com.bykv.vk.openvk.component.video.zp.COT;

import android.os.Build;
import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public class zp {
    private static final int zp = Build.VERSION.SDK_INT;

    public static int zp(long j7, long j9) {
        return Math.min(Math.max(0, j9 > 0 ? (int) (((j7 * 1.0d) / j9) * 100.0d) : 0), 100);
    }

    public static String zp(long j7) {
        StringBuilder sb = new StringBuilder();
        long j9 = j7 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j10 = ((j7 % 3600000) % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
        if (j9 >= 10) {
            sb.append(j9);
        } else if (j9 > 0) {
            sb.append(0);
            sb.append(j9);
        } else {
            sb.append("00");
        }
        sb.append(":");
        if (j10 >= 10) {
            sb.append(j10);
        } else if (j10 > 0) {
            sb.append(0);
            sb.append(j10);
        } else {
            sb.append("00");
        }
        return sb.toString();
    }

    public static void zp(View view, boolean z8) {
        if (view == null) {
            return;
        }
        if (z8) {
            view.setSystemUiVisibility(0);
            return;
        }
        int i9 = zp;
        if (i9 >= 19) {
            view.setSystemUiVisibility(3846);
        } else if (i9 >= 16) {
            view.setSystemUiVisibility(5);
        } else {
            view.setSystemUiVisibility(1);
        }
    }
}
