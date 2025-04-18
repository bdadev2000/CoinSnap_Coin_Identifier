package j5;

import android.os.Build;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;

/* loaded from: classes.dex */
public abstract class a {
    public static final int a = Build.VERSION.SDK_INT;

    public static int a(long j3, long j10) {
        return Math.min(Math.max(0, j10 > 0 ? (int) (((j3 * 1.0d) / j10) * 100.0d) : 0), 100);
    }

    public static String b(long j3) {
        StringBuilder sb2 = new StringBuilder();
        long j10 = j3 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        long j11 = ((j3 % 3600000) % ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) / 1000;
        if (j10 >= 10) {
            sb2.append(j10);
        } else if (j10 > 0) {
            sb2.append(0);
            sb2.append(j10);
        } else {
            sb2.append("00");
        }
        sb2.append(":");
        if (j11 >= 10) {
            sb2.append(j11);
        } else if (j11 > 0) {
            sb2.append(0);
            sb2.append(j11);
        } else {
            sb2.append("00");
        }
        return sb2.toString();
    }

    public static void c(ViewGroup viewGroup, boolean z10) {
        if (viewGroup == null) {
            return;
        }
        if (z10) {
            viewGroup.setSystemUiVisibility(0);
            return;
        }
        int i10 = a;
        if (i10 >= 19) {
            viewGroup.setSystemUiVisibility(3846);
        } else if (i10 >= 16) {
            viewGroup.setSystemUiVisibility(5);
        } else {
            viewGroup.setSystemUiVisibility(1);
        }
    }
}
