package com.bytedance.sdk.component.lMd.zp.lMd;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class QR extends jU {
    final transient byte[][] QR;
    final transient int[] ku;

    public QR(zp zpVar, int i9) {
        super(null);
        YW.zp(zpVar.lMd, 0L, i9);
        COT cot = zpVar.zp;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i9) {
            int i13 = cot.KS;
            int i14 = cot.lMd;
            if (i13 != i14) {
                i11 += i13 - i14;
                i12++;
                cot = cot.HWF;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.QR = new byte[i12];
        this.ku = new int[i12 * 2];
        COT cot2 = zpVar.zp;
        int i15 = 0;
        while (i10 < i9) {
            byte[][] bArr = this.QR;
            bArr[i15] = cot2.zp;
            int i16 = cot2.KS;
            int i17 = cot2.lMd;
            int i18 = (i16 - i17) + i10;
            if (i18 > i9) {
                i10 = i9;
            } else {
                i10 = i18;
            }
            int[] iArr = this.ku;
            iArr[i15] = i10;
            iArr[bArr.length + i15] = i17;
            cot2.jU = true;
            i15++;
            cot2 = cot2.HWF;
        }
    }

    private jU COT() {
        return new jU(jU());
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public int KS() {
        return this.ku[this.QR.length - 1];
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jU) {
            jU jUVar = (jU) obj;
            if (jUVar.KS() == KS() && zp(0, jUVar, 0, KS())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public int hashCode() {
        int i9 = this.COT;
        if (i9 != 0) {
            return i9;
        }
        int length = this.QR.length;
        int i10 = 0;
        int i11 = 1;
        int i12 = 0;
        while (i10 < length) {
            byte[] bArr = this.QR[i10];
            int[] iArr = this.ku;
            int i13 = iArr[length + i10];
            int i14 = iArr[i10];
            int i15 = (i14 - i12) + i13;
            while (i13 < i15) {
                i11 = (i11 * 31) + bArr[i13];
                i13++;
            }
            i10++;
            i12 = i14;
        }
        this.COT = i11;
        return i11;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public byte[] jU() {
        int[] iArr = this.ku;
        byte[][] bArr = this.QR;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i9 = 0;
        int i10 = 0;
        while (i9 < length) {
            int[] iArr2 = this.ku;
            int i11 = iArr2[length + i9];
            int i12 = iArr2[i9];
            System.arraycopy(this.QR[i9], i11, bArr2, i10, i12 - i10);
            i9++;
            i10 = i12;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public String lMd() {
        return COT().lMd();
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public String toString() {
        return COT().toString();
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public String zp() {
        return COT().zp();
    }

    private int lMd(int i9) {
        int binarySearch = Arrays.binarySearch(this.ku, 0, this.QR.length, i9 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public jU zp(int i9, int i10) {
        return COT().zp(i9, i10);
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public byte zp(int i9) {
        YW.zp(this.ku[this.QR.length - 1], i9, 1L);
        int lMd = lMd(i9);
        int i10 = lMd == 0 ? 0 : this.ku[lMd - 1];
        int[] iArr = this.ku;
        byte[][] bArr = this.QR;
        return bArr[lMd][(i9 - i10) + iArr[bArr.length + lMd]];
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public boolean zp(int i9, jU jUVar, int i10, int i11) {
        if (i9 < 0 || i9 > KS() - i11) {
            return false;
        }
        int lMd = lMd(i9);
        while (i11 > 0) {
            int i12 = lMd == 0 ? 0 : this.ku[lMd - 1];
            int min = Math.min(i11, ((this.ku[lMd] - i12) + i12) - i9);
            int[] iArr = this.ku;
            byte[][] bArr = this.QR;
            if (!jUVar.zp(i10, bArr[lMd], (i9 - i12) + iArr[bArr.length + lMd], min)) {
                return false;
            }
            i9 += min;
            i10 += min;
            i11 -= min;
            lMd++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.lMd.zp.lMd.jU
    public boolean zp(int i9, byte[] bArr, int i10, int i11) {
        if (i9 < 0 || i9 > KS() - i11 || i10 < 0 || i10 > bArr.length - i11) {
            return false;
        }
        int lMd = lMd(i9);
        while (i11 > 0) {
            int i12 = lMd == 0 ? 0 : this.ku[lMd - 1];
            int min = Math.min(i11, ((this.ku[lMd] - i12) + i12) - i9);
            int[] iArr = this.ku;
            byte[][] bArr2 = this.QR;
            if (!YW.zp(bArr2[lMd], (i9 - i12) + iArr[bArr2.length + lMd], bArr, i10, min)) {
                return false;
            }
            i9 += min;
            i10 += min;
            i11 -= min;
            lMd++;
        }
        return true;
    }
}
