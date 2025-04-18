package com.facebook.ads.redexgen.uinode;

import android.media.AudioTrack;
import android.os.SystemClock;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.io.encoding.Base64;

/* renamed from: com.facebook.ads.redexgen.X.Au, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0484Au {
    public static byte[] A0P;
    public static String[] A0Q = {"G0ejmsNLWo5N4HwPMLJOyhcWTLvm5k", "AaVAi8kEbPSTq7WMPq", "3SFwMFVKqfYZc9yidXjkKt9eYi", "MpavoNzourXMB6MEjk2fzdRtD4ZxlK4T", "tgtkP63ogxvavW2iBkIKDzfLLaZpZCzK", "ybOdqEkHneyM4wZj2LwFYBNLYP9L294", "eNRXQ28nuUhO04KATDB8SwCNKP", "apyaz1fP5pXVrlGks8RRBsGavNttMFUQ"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public AudioTrack A0H;
    public C0481Ar A0I;
    public Method A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final InterfaceC0482As A0N;
    public final long[] A0O;

    public static String A03(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A0P, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 126);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A0P = new byte[]{48, 46, Base64.padSymbol, Ascii.NAK, 42, Base64.padSymbol, 46, 55, 44, 66};
    }

    static {
        A06();
    }

    public C0484Au(InterfaceC0482As interfaceC0482As) {
        this.A0N = (InterfaceC0482As) AbstractC0626Ha.A01(interfaceC0482As);
        if (IF.A02 >= 18) {
            try {
                this.A0J = AudioTrack.class.getMethod(A03(0, 10, 75), null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.A0O = new long[10];
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008f, code lost:
    
        if (r0 > 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0092, code lost:
    
        if (r7 != 3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r11.A07 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x009a, code lost:
    
        r11.A07 = android.os.SystemClock.elapsedRealtime();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        return r11.A0A;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        if (r0 > 0) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private long A00() {
        /*
            r11 = this;
            long r1 = r11.A0G
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 == 0) goto L27
            long r2 = android.os.SystemClock.elapsedRealtime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r0
            long r0 = r11.A0G
            long r2 = r2 - r0
            int r0 = r11.A03
            long r4 = (long) r0
            long r4 = r4 * r2
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r0
            long r2 = r11.A06
            long r0 = r11.A0F
            long r0 = r0 + r4
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L27:
            android.media.AudioTrack r0 = r11.A0H
            int r7 = r0.getPlayState()
            r0 = 1
            r9 = 0
            if (r7 != r0) goto L33
            return r9
        L33:
            android.media.AudioTrack r0 = r11.A0H
            int r0 = r0.getPlaybackHeadPosition()
            long r3 = (long) r0
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r0
            boolean r0 = r11.A0M
            if (r0 == 0) goto L6d
            r0 = 2
            if (r7 != r0) goto L6a
            int r8 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0484Au.A0Q
            r0 = 7
            r1 = r2[r0]
            r0 = 3
            r2 = r2[r0]
            r0 = 23
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lbe
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0484Au.A0Q
            java.lang.String r1 = "2Rrhrvg7XFDDHkaxdizPj4VES"
            r0 = 1
            r2[r0] = r1
            if (r8 != 0) goto L6a
            long r0 = r11.A0A
            r11.A0C = r0
        L6a:
            long r0 = r11.A0C
            long r3 = r3 + r0
        L6d:
            int r1 = com.facebook.ads.redexgen.uinode.IF.A02
            r0 = 28
            if (r1 > r0) goto La8
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 != 0) goto La6
            long r0 = r11.A0A
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            java.lang.String[] r1 = com.facebook.ads.redexgen.uinode.C0484Au.A0Q
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 9
            if (r1 == r0) goto La3
            java.lang.String[] r2 = com.facebook.ads.redexgen.uinode.C0484Au.A0Q
            java.lang.String r1 = "5rZ1QvooVelNPm3umI"
            r0 = 5
            r2[r0] = r1
            if (r8 <= 0) goto La6
        L91:
            r0 = 3
            if (r7 != r0) goto La6
            long r1 = r11.A07
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto La0
            long r0 = android.os.SystemClock.elapsedRealtime()
            r11.A07 = r0
        La0:
            long r0 = r11.A0A
            return r0
        La3:
            if (r8 <= 0) goto La6
            goto L91
        La6:
            r11.A07 = r5
        La8:
            long r1 = r11.A0A
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            long r5 = r11.A0D
            r0 = 1
            long r5 = r5 + r0
            r11.A0D = r5
        Lb5:
            r11.A0A = r3
            long r1 = r11.A0D
            r0 = 32
            long r1 = r1 << r0
            long r1 = r1 + r3
            return r1
        Lbe:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.uinode.C0484Au.A00():long");
    }

    private long A01() {
        return A02(A00());
    }

    private long A02(long j3) {
        return (1000000 * j3) / this.A03;
    }

    private void A04() {
        long systemTimeUs = A01();
        if (systemTimeUs == 0) {
            return;
        }
        long nanoTime = System.nanoTime() / 1000;
        long playbackPositionUs = this.A09;
        if (nanoTime - playbackPositionUs >= 30000) {
            long[] jArr = this.A0O;
            int i10 = this.A01;
            long playbackPositionUs2 = systemTimeUs - nanoTime;
            jArr[i10] = playbackPositionUs2;
            this.A01 = (i10 + 1) % 10;
            int i11 = this.A04;
            if (i11 < 10) {
                this.A04 = i11 + 1;
            }
            this.A09 = nanoTime;
            this.A0E = 0L;
            int i12 = 0;
            while (true) {
                int i13 = this.A04;
                if (i12 >= i13) {
                    break;
                }
                long playbackPositionUs3 = i13;
                this.A0E += this.A0O[i12] / playbackPositionUs3;
                i12++;
            }
        }
        if (this.A0M) {
            return;
        }
        A08(nanoTime, systemTimeUs);
        A07(nanoTime);
    }

    private void A05() {
        this.A0E = 0L;
        this.A04 = 0;
        this.A01 = 0;
        this.A09 = 0L;
    }

    private void A07(long j3) {
        if (this.A0L) {
            Method method = this.A0J;
            if (A0Q[1].length() == 9) {
                throw new RuntimeException();
            }
            A0Q[5] = "5gTCJ";
            if (method != null && j3 - this.A08 >= 500000) {
                try {
                    long intValue = (((Integer) method.invoke(this.A0H, null)).intValue() * 1000) - this.A05;
                    this.A0B = intValue;
                    long max = Math.max(intValue, 0L);
                    this.A0B = max;
                    if (max > 5000000) {
                        this.A0N.ABv(max);
                        this.A0B = 0L;
                    }
                } catch (Exception unused) {
                    this.A0J = null;
                }
                this.A08 = j3;
            }
        }
    }

    private void A08(long j3, long audioTimestampSystemTimeUs) {
        if (!this.A0I.A08(j3)) {
            return;
        }
        long A02 = this.A0I.A02();
        long A01 = this.A0I.A01();
        if (Math.abs(A02 - j3) > 5000000) {
            this.A0N.ADH(A01, A02, j3, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else if (Math.abs(A02(A01) - audioTimestampSystemTimeUs) > 5000000) {
            this.A0N.ACi(A01, A02, j3, audioTimestampSystemTimeUs);
            this.A0I.A04();
        } else {
            this.A0I.A03();
        }
    }

    private boolean A09() {
        return this.A0M && this.A0H.getPlayState() == 2 && A00() == 0;
    }

    public static boolean A0A(int i10) {
        if (IF.A02 < 23) {
            if (i10 != 5) {
                String[] strArr = A0Q;
                if (strArr[6].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                A0Q[0] = "NO";
                if (i10 == 6) {
                }
            }
            return true;
        }
        return false;
    }

    public final int A0B(long j3) {
        int bytesPending = (int) (j3 - (A00() * this.A02));
        return this.A00 - bytesPending;
    }

    public final long A0C(boolean z10) {
        long systemTimeUs;
        if (this.A0H.getPlayState() == 3) {
            A04();
        }
        long elapsedSinceTimestampUs = System.nanoTime() / 1000;
        if (this.A0I.A06()) {
            long systemTimeUs2 = this.A0I.A01();
            long timestampPositionUs = A02(systemTimeUs2);
            boolean A07 = this.A0I.A07();
            if (A0Q[1].length() == 9) {
                throw new RuntimeException();
            }
            String[] strArr = A0Q;
            strArr[7] = "B2EPmPjaxRfTTctNgZbFUDggQYGnhm7g";
            strArr[3] = "gdL6KIe4ggUqKImq5hrR6J8T2bfxhE0p";
            if (!A07) {
                return timestampPositionUs;
            }
            C0481Ar c0481Ar = this.A0I;
            String[] strArr2 = A0Q;
            if (strArr2[6].length() != strArr2[2].length()) {
                long systemTimeUs3 = c0481Ar.A02();
                return timestampPositionUs + (elapsedSinceTimestampUs - systemTimeUs3);
            }
            A0Q[5] = "zkTTFu0HqLBb6JIYxZc4CSGv3";
            long systemTimeUs4 = c0481Ar.A02();
            return timestampPositionUs + (elapsedSinceTimestampUs - systemTimeUs4);
        }
        if (this.A04 == 0) {
            systemTimeUs = A01();
        } else {
            long systemTimeUs5 = this.A0E;
            systemTimeUs = systemTimeUs5 + elapsedSinceTimestampUs;
        }
        if (!z10) {
            long positionUs = this.A0B;
            return systemTimeUs - positionUs;
        }
        return systemTimeUs;
    }

    public final void A0D() {
        A05();
        this.A0H = null;
        this.A0I = null;
    }

    public final void A0E() {
        this.A0I.A05();
    }

    public final void A0F(long j3) {
        this.A0F = A00();
        this.A0G = SystemClock.elapsedRealtime() * 1000;
        this.A06 = j3;
    }

    public final void A0G(AudioTrack audioTrack, int i10, int i11, int i12) {
        this.A0H = audioTrack;
        this.A02 = i11;
        this.A00 = i12;
        this.A0I = new C0481Ar(audioTrack);
        this.A03 = audioTrack.getSampleRate();
        this.A0M = A0A(i10);
        boolean A0c = IF.A0c(i10);
        this.A0L = A0c;
        this.A05 = A0c ? A02(i12 / i11) : -9223372036854775807L;
        this.A0A = 0L;
        this.A0D = 0L;
        this.A0C = 0L;
        this.A0K = false;
        this.A0G = C.TIME_UNSET;
        this.A07 = C.TIME_UNSET;
        this.A0B = 0L;
    }

    public final boolean A0H() {
        return this.A0H.getPlayState() == 3;
    }

    public final boolean A0I() {
        A05();
        if (this.A0G == C.TIME_UNSET) {
            this.A0I.A05();
            return true;
        }
        return false;
    }

    public final boolean A0J(long j3) {
        return j3 > A00() || A09();
    }

    public final boolean A0K(long j3) {
        return this.A07 != C.TIME_UNSET && j3 > 0 && SystemClock.elapsedRealtime() - this.A07 >= 200;
    }

    public final boolean A0L(long j3) {
        InterfaceC0482As interfaceC0482As;
        int playState = this.A0H.getPlayState();
        if (this.A0M) {
            if (playState == 2) {
                this.A0K = false;
                return false;
            }
            if (playState == 1 && A00() == 0) {
                return false;
            }
        }
        boolean hadData = this.A0K;
        boolean A0J = A0J(j3);
        this.A0K = A0J;
        if (hadData && !A0J && playState != 1 && (interfaceC0482As = this.A0N) != null) {
            interfaceC0482As.ADQ(this.A00, C9W.A01(this.A05));
        }
        return true;
    }
}
