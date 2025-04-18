package com.facebook.ads.redexgen.uinode;

import kotlin.UByte;

/* renamed from: com.facebook.ads.redexgen.X.Cp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0528Cp {
    public static String[] A04 = {"1Xip6MK3UX39SbdrhQxDlLsVDK2jyOlR", "AU2BHKQnn2fYqPG5g1tvrnNHtccLtsvW", "5fujN1flEc5Me9dyDOpwJW6OKLh1geLG", "d2hyRAFooTRyki1bdAaACMGjhokH1kbm", "1id0n4LmWumjAHQEVAwGAQFe8ZjykTcE", "nyz5FVBYTM1P8JU78hecVl8rttPnaVCa", "YJ", "Rq"};
    public int A00;
    public int A01;
    public final int A02;
    public final byte[] A03;

    public C0528Cp(byte[] bArr) {
        this.A03 = bArr;
        this.A02 = bArr.length;
    }

    private void A00() {
        int i10;
        int i11 = this.A01;
        AbstractC0626Ha.A04(i11 >= 0 && (i11 < (i10 = this.A02) || (i11 == i10 && this.A00 == 0)));
    }

    public final int A01() {
        return (this.A01 * 8) + this.A00;
    }

    public final int A02(int i10) {
        int bitsRead = this.A01;
        int tempByteOffset = Math.min(i10, 8 - this.A00);
        int i11 = bitsRead + 1;
        int tempByteOffset2 = this.A03[bitsRead];
        int tempByteOffset3 = ((tempByteOffset2 & 255) >> this.A00) & (255 >> (8 - tempByteOffset));
        while (tempByteOffset < i10) {
            int returnValue = this.A03[i11];
            tempByteOffset3 |= (returnValue & 255) << tempByteOffset;
            tempByteOffset += 8;
            i11++;
        }
        int returnValue2 = (-1) >>> (32 - i10);
        int tempByteOffset4 = tempByteOffset3 & returnValue2;
        A03(i10);
        return tempByteOffset4;
    }

    public final void A03(int i10) {
        int numBytes = i10 / 8;
        int i11 = this.A01 + numBytes;
        this.A01 = i11;
        int i12 = this.A00 + (i10 - (numBytes * 8));
        this.A00 = i12;
        if (i12 > 7) {
            this.A01 = i11 + 1;
            this.A00 = i12 - 8;
        }
        A00();
        String[] strArr = A04;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[2] = "0KTU32mldvOu3DR9Ufqh7FWixRDNtvi7";
    }

    public final boolean A04() {
        boolean returnValue = (((this.A03[this.A01] & UByte.MAX_VALUE) >> this.A00) & 1) == 1;
        A03(1);
        return returnValue;
    }
}
