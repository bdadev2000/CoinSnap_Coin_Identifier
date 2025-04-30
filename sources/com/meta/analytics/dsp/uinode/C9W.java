package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.9W, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public abstract class C9W {
    public static final int A00;
    public static final UUID A01;
    public static final UUID A02;
    public static final UUID A03;
    public static final UUID A04;
    public static final UUID A05;

    static {
        int i9;
        if (IF.A02 < 23) {
            i9 = 1020;
        } else {
            i9 = 6396;
        }
        A00 = i9;
        A04 = new UUID(0L, 0L);
        A02 = new UUID(1186680826959645954L, -5988876978535335093L);
        A01 = new UUID(-2129748144642739255L, 8654423357094679310L);
        A05 = new UUID(-1301668207276963122L, -6645017420763422227L);
        A03 = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long A00(long j7) {
        return (j7 == C.TIME_UNSET || j7 == Long.MIN_VALUE) ? j7 : j7 * 1000;
    }

    public static long A01(long j7) {
        return (j7 == C.TIME_UNSET || j7 == Long.MIN_VALUE) ? j7 : j7 / 1000;
    }
}
