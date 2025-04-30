package com.meta.analytics.dsp.uinode;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: assets/audience_network.dex */
public final class AF {
    public static String[] A06 = {"WwB4b7", "9U9mb9jKte7kllJhP3clLvI5b73", "TDqEL0AoY", "4IvfGYKFDovhkqqhRuF", "llxeZdB1AGHDFzy1eOGJjj7vjbGoDyRo", "wyDFlV", "VELYNO0Lyu3d7b6TF4mD3ooMbXgWeIiM", "iuggwru9v4rPlYsWAIf5ZcemLGs"};
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public long A04;
    public FP A05;

    public final int A00() {
        return this.A05.A00;
    }

    public final int A01(int i9) {
        return this.A05.A04[i9].A00;
    }

    public final int A02(int i9) {
        return this.A05.A04[i9].A00();
    }

    public final int A03(int i9, int i10) {
        return this.A05.A04[i9].A01(i10);
    }

    public final int A04(long j7) {
        return this.A05.A00(j7);
    }

    public final int A05(long j7) {
        return this.A05.A01(j7);
    }

    public final long A06() {
        return this.A05.A01;
    }

    public final long A07() {
        return this.A01;
    }

    public final long A08() {
        return C9W.A01(this.A04);
    }

    public final long A09(int i9) {
        return this.A05.A03[i9];
    }

    public final long A0A(int i9, int i10) {
        FN fn = this.A05.A04[i9];
        if (fn.A00 == -1) {
            return C.TIME_UNSET;
        }
        long[] jArr = fn.A02;
        if (A06[2].length() != 9) {
            throw new RuntimeException();
        }
        A06[2] = "IGBMGqW3m";
        return jArr[i10];
    }

    public final AF A0B(Object obj, Object obj2, int i9, long j7, long j9) {
        return A0C(obj, obj2, i9, j7, j9, FP.A06);
    }

    public final AF A0C(Object obj, Object obj2, int i9, long j7, long j9, FP fp) {
        this.A02 = obj;
        this.A03 = obj2;
        this.A00 = i9;
        this.A01 = j7;
        this.A04 = j9;
        this.A05 = fp;
        return this;
    }

    public final boolean A0D(int i9) {
        return !this.A05.A04[i9].A02();
    }

    public final boolean A0E(int i9, int i10) {
        FN fn = this.A05.A04[i9];
        return (fn.A00 == -1 || fn.A01[i10] == 0) ? false : true;
    }
}
