package com.instagram.common.viewpoint.core;

import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.9b, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC03849b {
    public static String[] A00 = {"TWeWJHtD68oI4yFXIilydMW", "7OXwSvrW4RtScAf8Z9lZWDI5S", "DcZbB64kSbo8f5VZBIC0", "vll5a2o0qWuXIFFWzt9Y9A9nrgE8UKFv", "dILdImg4xIVzqO9ozsJ57TrdeNizDAED", "XHg5TBVpct8AEYnDVgEX0lIhyoWixNuU", "EMKjBd49nl1RVQWP7azj", "v"};
    public static final int A01;
    public static final UUID A02;
    public static final UUID A03;
    public static final UUID A04;
    public static final UUID A05;
    public static final UUID A06;

    static {
        int i2;
        if (IK.A02 < 23) {
            i2 = 1020;
        } else {
            i2 = 6396;
        }
        A01 = i2;
        A05 = new UUID(0L, 0L);
        A03 = new UUID(1186680826959645954L, -5988876978535335093L);
        A02 = new UUID(-2129748144642739255L, 8654423357094679310L);
        A06 = new UUID(-1301668207276963122L, -6645017420763422227L);
        A04 = new UUID(-7348484286925749626L, -6083546864340672619L);
    }

    public static long A00(long j2) {
        if (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) {
            return j2;
        }
        if (A00[5].charAt(6) == 'p') {
            throw new RuntimeException();
        }
        A00[5] = "waSOeyTrnAwHOvUgKCthiNoRbzSAR0SV";
        return j2 * 1000;
    }

    public static long A01(long j2) {
        return (j2 == -9223372036854775807L || j2 == Long.MIN_VALUE) ? j2 : j2 / 1000;
    }
}
