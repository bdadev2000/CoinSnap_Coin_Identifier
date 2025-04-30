package com.meta.analytics.dsp.uinode;

/* renamed from: com.facebook.ads.redexgen.X.Cp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1094Cp {
    public static String[] A04 = {"1Xip6MK3UX39SbdrhQxDlLsVDK2jyOlR", "AU2BHKQnn2fYqPG5g1tvrnNHtccLtsvW", "5fujN1flEc5Me9dyDOpwJW6OKLh1geLG", "d2hyRAFooTRyki1bdAaACMGjhokH1kbm", "1id0n4LmWumjAHQEVAwGAQFe8ZjykTcE", "nyz5FVBYTM1P8JU78hecVl8rttPnaVCa", "YJ", "Rq"};
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C1094Cp(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        int i9;
        int i10 = this.A01;
        AbstractC1192Ha.A04(i10 >= 0 && (i10 < (i9 = this.A02) || (i10 == i9 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i9) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i9, 8 - this.A00);
        int i10 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & 255) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < i9) {
            int returnValue = this.A03[i10];
            tempByteOffset3 |= (returnValue & 255) << tempByteOffset;
            tempByteOffset += 8;
            i10++;
        }
        int returnValue2 = (-1) >>> (32 - i9);
        int tempByteOffset4 = tempByteOffset3 & returnValue2;
        A03(i9);
        return tempByteOffset4;
    }

    public final void A03(int i9) {
        int numBytes = i9 / 8;
        int i10 = this.A01 + numBytes;
        this.A01 = i10;
        int i11 = this.A00 + (i9 - (numBytes * 8));
        this.A00 = i11;
        if (i11 > 7) {
            this.A01 = i10 + 1;
            this.A00 = i11 - 8;
        }
        A00();
        String[] strArr = A04;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[2] = "0KTU32mldvOu3DR9Ufqh7FWixRDNtvi7";
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & 255) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
