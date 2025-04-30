package com.meta.analytics.dsp.uinode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class HR {
    public static byte[] A05;
    public static String[] A06 = {"j9EfDvchdu1KqySqOAnBSG3JWHZdS12U", "q23SQ5AypNqS8oaKOX4z", "zGl30nZzPzoLIdVG6oXXe73jwI6SvYzS", "XO0PMOb8qpQh9emdWW7Vnqfuo5cp8yJy", "hg0Ynef21ksm7drJYvbGXc6C6VdsLqYq", "sq8Z8cDX36Rb5yN4ZHuInHWL1DTNPmF7", "lpBmIRRiri9NKyd9o68rlNPCbyzvIw2I", "eicGPlwUgu"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C1555Vh A00 = C1555Vh.A04;
    public final TreeSet<C1553Vf> A04 = new TreeSet<>();

    public static String A01(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        int i12 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[6].charAt(21) != 'N') {
                throw new RuntimeException();
            }
            A06[6] = "ipIPz5SC6v0GmkIAozZhwN70MrudeMSU";
            if (i12 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i12] = (byte) ((copyOfRange[i12] - i11) - 100);
            i12++;
        }
    }

    public static void A02() {
        byte[] bArr = {-79, -9, -14, -6, -3, -10, -11, -65, -77, 7, 2, -77, 42, 61, 70, 57, 69, 65, 70, 63, -8, 71, 62, -8};
        String[] strArr = A06;
        if (strArr[4].charAt(2) != strArr[3].charAt(2)) {
            throw new RuntimeException();
        }
        A06[5] = "8leR2nWms8A7PmFgrtQ6nLfJYqb68GHr";
        A05 = bArr;
    }

    static {
        A02();
    }

    public HR(int i9, String str) {
        this.A02 = i9;
        this.A03 = str;
    }

    public static HR A00(int i9, DataInputStream dataInputStream) throws IOException {
        HR hr = new HR(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i9 < 2) {
            long readLong = dataInputStream.readLong();
            HW hw = new HW();
            HV.A05(hw, readLong);
            hr.A0F(hw);
        } else {
            hr.A00 = C1555Vh.A00(dataInputStream);
        }
        return hr;
    }

    public final int A03(int i9) {
        int result = this.A02;
        int i10 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i10 + result2;
        if (i9 < 2) {
            long A00 = HV.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j7, long j9) {
        C1553Vf A062 = A06(j7);
        if (A062.A01()) {
            return -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, j9);
        }
        long j10 = j7 + j9;
        long j11 = A062.A02 + A062.A01;
        if (j11 < j10) {
            TreeSet<C1553Vf> treeSet = this.A04;
            if (A06[1].length() != 20) {
                throw new RuntimeException();
            }
            A06[1] = "RgZ5bXDLk5KqdLdfFSHI";
            for (C1553Vf c1553Vf : treeSet.tailSet(A062, false)) {
                if (c1553Vf.A02 > j11) {
                    break;
                }
                j11 = Math.max(j11, c1553Vf.A02 + c1553Vf.A01);
                if (j11 >= j10) {
                    break;
                }
            }
        }
        return Math.min(j11 - j7, j9);
    }

    public final C1555Vh A05() {
        return this.A00;
    }

    public final C1553Vf A06(long j7) {
        C1553Vf A01 = C1553Vf.A01(this.A03, j7);
        C1553Vf floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j7) {
            return floor;
        }
        TreeSet<C1553Vf> treeSet = this.A04;
        String[] strArr = A06;
        if (strArr[2].charAt(22) != strArr[0].charAt(22)) {
            throw new RuntimeException();
        }
        A06[6] = "nd2bgBSeUAsM9albd5et6NmdTACtd3AP";
        C1553Vf lookupSpan = treeSet.ceiling(A01);
        if (lookupSpan == null) {
            return C1553Vf.A02(this.A03, j7);
        }
        return C1553Vf.A03(this.A03, j7, lookupSpan.A02 - j7);
    }

    public final C1553Vf A07(C1553Vf c1553Vf) throws HI {
        AbstractC1192Ha.A04(this.A04.remove(c1553Vf));
        C1553Vf A08 = c1553Vf.A08(this.A02);
        if (c1553Vf.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new HI(A01(12, 12, 116) + c1553Vf.A03 + A01(8, 4, 47) + A08.A03 + A01(0, 8, 45));
    }

    public final TreeSet<C1553Vf> A08() {
        return this.A04;
    }

    public final void A09(C1553Vf c1553Vf) {
        this.A04.add(c1553Vf);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z8) {
        this.A01 = z8;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(HO ho) {
        if (this.A04.remove(ho)) {
            ho.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(HW hw) {
        C1555Vh c1555Vh = this.A00;
        C1555Vh oldMetadata = this.A00.A08(hw);
        this.A00 = oldMetadata;
        return !oldMetadata.equals(c1555Vh);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HR hr = (HR) obj;
        if (this.A02 == hr.A02 && this.A03.equals(hr.A03) && this.A04.equals(hr.A04) && this.A00.equals(hr.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Integer.MAX_VALUE);
        int i9 = result * 31;
        int result2 = this.A04.hashCode();
        return i9 + result2;
    }
}
