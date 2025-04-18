package com.bytedance.sdk.component.Sg.YFl.Sg;

import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DSW extends AlY {
    final transient byte[][] DSW;
    final transient int[] qsH;

    public DSW(YFl yFl, int i10) {
        super(null);
        NjR.YFl(yFl.Sg, 0L, i10);
        wN wNVar = yFl.YFl;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = wNVar.tN;
            int i15 = wNVar.Sg;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                wNVar = wNVar.f10333vc;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.DSW = new byte[i13];
        this.qsH = new int[i13 * 2];
        wN wNVar2 = yFl.YFl;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.DSW;
            bArr[i16] = wNVar2.YFl;
            int i17 = wNVar2.tN;
            int i18 = wNVar2.Sg;
            int i19 = (i17 - i18) + i11;
            if (i19 > i10) {
                i11 = i10;
            } else {
                i11 = i19;
            }
            int[] iArr = this.qsH;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            wNVar2.AlY = true;
            i16++;
            wNVar2 = wNVar2.f10333vc;
        }
    }

    private AlY wN() {
        return new AlY(AlY());
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public byte[] AlY() {
        int[] iArr = this.qsH;
        byte[][] bArr = this.DSW;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.qsH;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.DSW[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public String Sg() {
        return wN().Sg();
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public String YFl() {
        return wN().YFl();
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AlY) {
            AlY alY = (AlY) obj;
            if (alY.tN() == tN() && YFl(0, alY, 0, tN())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public int hashCode() {
        int i10 = this.wN;
        if (i10 != 0) {
            return i10;
        }
        int length = this.DSW.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.DSW[i11];
            int[] iArr = this.qsH;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.wN = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public int tN() {
        return this.qsH[this.DSW.length - 1];
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public String toString() {
        return wN().toString();
    }

    private int Sg(int i10) {
        int binarySearch = Arrays.binarySearch(this.qsH, 0, this.DSW.length, i10 + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public AlY YFl(int i10, int i11) {
        return wN().YFl(i10, i11);
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public byte YFl(int i10) {
        NjR.YFl(this.qsH[this.DSW.length - 1], i10, 1L);
        int Sg = Sg(i10);
        int i11 = Sg == 0 ? 0 : this.qsH[Sg - 1];
        int[] iArr = this.qsH;
        byte[][] bArr = this.DSW;
        return bArr[Sg][(i10 - i11) + iArr[bArr.length + Sg]];
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public boolean YFl(int i10, AlY alY, int i11, int i12) {
        if (i10 < 0 || i10 > tN() - i12) {
            return false;
        }
        int Sg = Sg(i10);
        while (i12 > 0) {
            int i13 = Sg == 0 ? 0 : this.qsH[Sg - 1];
            int min = Math.min(i12, ((this.qsH[Sg] - i13) + i13) - i10);
            int[] iArr = this.qsH;
            byte[][] bArr = this.DSW;
            if (!alY.YFl(i11, bArr[Sg], (i10 - i13) + iArr[bArr.length + Sg], min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            Sg++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.Sg.YFl.Sg.AlY
    public boolean YFl(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > tN() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int Sg = Sg(i10);
        while (i12 > 0) {
            int i13 = Sg == 0 ? 0 : this.qsH[Sg - 1];
            int min = Math.min(i12, ((this.qsH[Sg] - i13) + i13) - i10);
            int[] iArr = this.qsH;
            byte[][] bArr2 = this.DSW;
            if (!NjR.YFl(bArr2[Sg], (i10 - i13) + iArr[bArr2.length + Sg], bArr, i11, min)) {
                return false;
            }
            i10 += min;
            i11 += min;
            i12 -= min;
            Sg++;
        }
        return true;
    }
}
