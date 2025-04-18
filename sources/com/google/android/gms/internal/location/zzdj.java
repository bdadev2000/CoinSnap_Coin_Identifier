package com.google.android.gms.internal.location;

import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import com.vungle.ads.internal.signals.j;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class zzdj {
    private static final SimpleDateFormat zza;
    private static final SimpleDateFormat zzb;
    private static final StringBuilder zzc;

    static {
        Locale locale = Locale.ROOT;
        zza = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", locale);
        zzb = new SimpleDateFormat("MM-dd HH:mm:ss", locale);
        zzc = new StringBuilder(33);
    }

    public static String zza(long j3) {
        String sb2;
        StringBuilder sb3 = zzc;
        synchronized (sb3) {
            sb3.setLength(0);
            zzb(j3, sb3);
            sb2 = sb3.toString();
        }
        return sb2;
    }

    public static void zzb(long j3, StringBuilder sb2) {
        if (j3 == 0) {
            sb2.append("0s");
            return;
        }
        sb2.ensureCapacity(sb2.length() + 27);
        boolean z10 = false;
        if (j3 < 0) {
            sb2.append("-");
            if (j3 != Long.MIN_VALUE) {
                j3 = -j3;
            } else {
                j3 = Long.MAX_VALUE;
                z10 = true;
            }
        }
        if (j3 >= j.TWENTY_FOUR_HOURS_MILLIS) {
            sb2.append(j3 / j.TWENTY_FOUR_HOURS_MILLIS);
            sb2.append("d");
            j3 %= j.TWENTY_FOUR_HOURS_MILLIS;
        }
        if (true == z10) {
            j3 = 25975808;
        }
        if (j3 >= 3600000) {
            sb2.append(j3 / 3600000);
            sb2.append("h");
            j3 %= 3600000;
        }
        if (j3 >= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS) {
            sb2.append(j3 / ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS);
            sb2.append("m");
            j3 %= ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (j3 >= 1000) {
            sb2.append(j3 / 1000);
            sb2.append("s");
            j3 %= 1000;
        }
        if (j3 > 0) {
            sb2.append(j3);
            sb2.append("ms");
        }
    }
}
