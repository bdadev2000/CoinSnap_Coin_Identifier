package com.meta.analytics.dsp.uinode;

import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class Cz {
    public static String[] A04 = {"2qF5pOFs0IqpaE", "RfbD", "IXwzeXFQZ", "dH", "BZS0QFjYyMMtKdvz4XAttyOti7UPpZp6", "Ysa0lHORyV9SROuBxKvF6aLHu99ippeO", "IeuKB6uAyoApG9pIT7", "E"};
    public static final byte[] A05 = {0, 0, 1};
    public int A00;
    public int A01;
    public byte[] A02;
    public boolean A03;

    public Cz(int i9) {
        this.A02 = new byte[i9];
    }

    public final void A00() {
        this.A03 = false;
        this.A00 = 0;
        this.A01 = 0;
    }

    public final void A01(byte[] bArr, int i9, int i10) {
        if (!this.A03) {
            return;
        }
        int i11 = i10 - i9;
        byte[] bArr2 = this.A02;
        int length = bArr2.length;
        int i12 = this.A00;
        int readLength = i12 + i11;
        if (length < readLength) {
            int i13 = i12 + i11;
            String[] strArr = A04;
            String str = strArr[3];
            String str2 = strArr[0];
            int length2 = str.length();
            int readLength2 = str2.length();
            if (length2 == readLength2) {
                throw new RuntimeException();
            }
            A04[6] = "v6SEB1OgzyQ0Lh40gt";
            int readLength3 = i13 * 2;
            this.A02 = Arrays.copyOf(bArr2, readLength3);
        }
        byte[] bArr3 = this.A02;
        int readLength4 = this.A00;
        System.arraycopy(bArr, i9, bArr3, readLength4, i11);
        int readLength5 = this.A00;
        this.A00 = readLength5 + i11;
    }

    public final boolean A02(int i9, int i10) {
        if (this.A03) {
            int i11 = this.A00 - i10;
            this.A00 = i11;
            if (this.A01 == 0 && i9 == 181) {
                this.A01 = i11;
            } else {
                this.A03 = false;
                return true;
            }
        } else if (i9 == 179) {
            this.A03 = true;
        }
        byte[] bArr = A05;
        A01(bArr, 0, bArr.length);
        return false;
    }
}
