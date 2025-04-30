package com.meta.analytics.dsp.uinode;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Display;
import android.view.WindowManager;
import com.applovin.exoplayer2.common.base.Ascii;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class IT {
    public static byte[] A0C;
    public static String[] A0D = {"xjDjhxCoR5E9PaR", "vpLFoDls1yXd", "vp7lX6ix760xQFA", "plC", "mnLR5dwnrEQUmTikV", "t5Nzngx1C9ROF", "WJjUxBMWNKZwORVrQ", "T20oC"};
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public boolean A08;
    public final WindowManager A09;
    public final IR A0A;
    public final IS A0B;

    public static String A02(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            int i13 = (copyOfRange[i12] - i11) - 91;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[2] = "fcjVOHbVEUruwwj";
            copyOfRange[i12] = (byte) i13;
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-13, -8, 2, -1, -5, -16, 8, Ascii.GS, Ascii.SI, Ascii.DC4, 10, Ascii.NAK, Ascii.GS};
    }

    static {
        A04();
    }

    public IT() {
        this(null);
    }

    public IT(Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.A09 = (WindowManager) context.getSystemService(A02(7, 6, 75));
        } else {
            this.A09 = null;
        }
        if (this.A09 != null) {
            this.A0A = IF.A02 >= 17 ? A01(context) : null;
            this.A0B = IS.A00();
        } else {
            this.A0A = null;
            this.A0B = null;
        }
        this.A06 = C.TIME_UNSET;
        this.A07 = C.TIME_UNSET;
    }

    public static long A00(long j7, long j9, long j10) {
        long j11;
        long vsyncCount = j10 * ((j7 - j9) / j10);
        long j12 = j9 + vsyncCount;
        if (j7 <= j12) {
            j11 = j12 - j10;
        } else {
            j11 = j12;
            if (A0D[5].length() != 13) {
                throw new RuntimeException();
            }
            A0D[7] = "KRnDU";
            j12 += j10;
        }
        return j12 - j7 < j7 - j11 ? j12 : j11;
    }

    private IR A01(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService(A02(0, 7, 52));
        if (displayManager == null) {
            return null;
        }
        return new IR(this, displayManager);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A03() {
        Display defaultDisplay = this.A09.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / defaultDisplay.getRefreshRate());
            this.A06 = refreshRate;
            this.A07 = (refreshRate * 80) / 100;
        }
    }

    private boolean A06(long j7, long j9) {
        long j10 = j7 - this.A04;
        long elapsedFrameTimeNs = this.A05;
        return Math.abs((j9 - elapsedFrameTimeNs) - j10) > 20000000;
    }

    public final long A07(long j7, long j9) {
        long j10 = 1000 * j7;
        long j11 = j10;
        long j12 = j9;
        if (this.A08) {
            if (j7 != this.A02) {
                this.A01++;
                this.A00 = this.A03;
            }
            long j13 = this.A01;
            if (j13 >= 6) {
                long j14 = this.A00 + ((j10 - this.A04) / j13);
                if (!A06(j14, j9)) {
                    j12 = (this.A05 + j14) - this.A04;
                    j11 = j14;
                } else {
                    this.A08 = false;
                }
            } else if (A06(j10, j9)) {
                this.A08 = false;
            }
        }
        if (!this.A08) {
            this.A04 = j10;
            this.A05 = j9;
            this.A01 = 0L;
            this.A08 = true;
        }
        this.A02 = j7;
        this.A03 = j11;
        IS is = this.A0B;
        if (is != null) {
            long j15 = this.A06;
            if (A0D[2].length() != 15) {
                throw new RuntimeException();
            }
            A0D[3] = "GMIC0";
            if (j15 != C.TIME_UNSET) {
                long j16 = is.A04;
                if (j16 == C.TIME_UNSET) {
                    return j12;
                }
                return A00(j12, j16, this.A06) - this.A07;
            }
        }
        return j12;
    }

    public final void A08() {
        if (this.A09 != null) {
            IR ir = this.A0A;
            if (ir != null) {
                ir.A01();
            }
            this.A0B.A07();
        }
    }

    public final void A09() {
        this.A08 = false;
        if (this.A09 != null) {
            this.A0B.A06();
            IR ir = this.A0A;
            if (ir != null) {
                ir.A00();
            }
            A03();
        }
    }
}
