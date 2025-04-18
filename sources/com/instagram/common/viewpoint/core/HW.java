package com.instagram.common.viewpoint.core;

import com.google.android.gms.common.api.Api;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.TreeSet;

/* loaded from: assets/audience_network.dex */
public final class HW {
    public static byte[] A05;
    public static String[] A06 = {"2revu11PJC5JJW9Wa0yU7IMUA1J5NejP", "fJ5JOQQqtdBcbj27U0gmUjzU2HCLlz0g", "ET0kkCf4ARvl2PzoyLeVITbW2fplMVfR", "GxObTRUuHNyvHf6tkdVAqKD8xwa6jlLn", "B7q0fr4uC5I7vD4MQhzL4Z47zRUcP8kJ", "568trPd6mwfCGSMgqCQm2IVOVBWhAbWi", "EbkNl16qbhIMOqvfmLsDQ8wggfaUXum1", "SV9S1jJDj189NNWmtagkrr9CNMxjn3Dk"};
    public boolean A01;
    public final int A02;
    public final String A03;
    public C0964Wm A00 = C0964Wm.A04;
    public final TreeSet<C0962Wk> A04 = new TreeSet<>();

    public static String A01(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A06[3].charAt(30) == 'V') {
                throw new RuntimeException();
            }
            A06[6] = "S0u5zKZmiQfdscAZx2bCvjbBnL2oTB1W";
            if (i5 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i5] = (byte) ((copyOfRange[i5] ^ i4) ^ 28);
            i5++;
        }
    }

    public static void A02() {
        A05 = new byte[]{120, 62, 57, 49, 52, 61, 60, 118, 117, 33, 58, 117, 64, 119, 124, 115, Byte.MAX_VALUE, 123, 124, 117, 50, 125, 116, 50};
    }

    static {
        A02();
    }

    public HW(int i2, String str) {
        this.A02 = i2;
        this.A03 = str;
    }

    public static HW A00(int i2, DataInputStream dataInputStream) throws IOException {
        HW hw = new HW(dataInputStream.readInt(), dataInputStream.readUTF());
        if (i2 < 2) {
            long readLong = dataInputStream.readLong();
            C0572Hb c0572Hb = new C0572Hb();
            AbstractC0571Ha.A05(c0572Hb, readLong);
            hw.A0F(c0572Hb);
        } else {
            hw.A00 = C0964Wm.A00(dataInputStream);
        }
        return hw;
    }

    public final int A03(int i2) {
        int result = this.A02;
        int i3 = result * 31;
        int result2 = this.A03.hashCode();
        int result3 = i3 + result2;
        if (i2 < 2) {
            long A00 = AbstractC0571Ha.A00(this.A00);
            return (result3 * 31) + ((int) ((A00 >>> 32) ^ A00));
        }
        return (result3 * 31) + this.A00.hashCode();
    }

    public final long A04(long j2, long j3) {
        C0962Wk A062 = A06(j2);
        if (A062.A01()) {
            return -Math.min(A062.A02() ? Long.MAX_VALUE : A062.A01, j3);
        }
        long j4 = j2 + j3;
        long queryEndPosition = A062.A02 + A062.A01;
        if (queryEndPosition < j4) {
            for (C0962Wk c0962Wk : this.A04.tailSet(A062, false)) {
                String[] strArr = A06;
                if (strArr[2].charAt(8) == strArr[1].charAt(8)) {
                    throw new RuntimeException();
                }
                A06[7] = "b0ZaIIxnoqImZ25xzDHzhq2wNwo0sHmR";
                long currentEndPosition = c0962Wk.A02;
                if (currentEndPosition > queryEndPosition) {
                    break;
                }
                long currentEndPosition2 = c0962Wk.A02;
                queryEndPosition = Math.max(queryEndPosition, currentEndPosition2 + c0962Wk.A01);
                if (queryEndPosition >= j4) {
                    break;
                }
            }
        }
        return Math.min(queryEndPosition - j2, j3);
    }

    public final C0964Wm A05() {
        return this.A00;
    }

    public final C0962Wk A06(long j2) {
        C0962Wk A01 = C0962Wk.A01(this.A03, j2);
        C0962Wk floor = this.A04.floor(A01);
        if (floor != null && floor.A02 + floor.A01 > j2) {
            return floor;
        }
        C0962Wk lookupSpan = this.A04.ceiling(A01);
        if (lookupSpan == null) {
            return C0962Wk.A02(this.A03, j2);
        }
        return C0962Wk.A03(this.A03, j2, lookupSpan.A02 - j2);
    }

    public final C0962Wk A07(C0962Wk c0962Wk) throws HN {
        AbstractC0576Hf.A04(this.A04.remove(c0962Wk));
        C0962Wk A08 = c0962Wk.A08(this.A02);
        if (c0962Wk.A03.renameTo(A08.A03)) {
            this.A04.add(A08);
            return A08;
        }
        throw new HN(A01(12, 12, 14) + c0962Wk.A03 + A01(8, 4, 73) + A08.A03 + A01(0, 8, 68));
    }

    public final TreeSet<C0962Wk> A08() {
        return this.A04;
    }

    public final void A09(C0962Wk c0962Wk) {
        this.A04.add(c0962Wk);
    }

    public final void A0A(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeInt(this.A02);
        dataOutputStream.writeUTF(this.A03);
        this.A00.A09(dataOutputStream);
    }

    public final void A0B(boolean z2) {
        this.A01 = z2;
    }

    public final boolean A0C() {
        return this.A04.isEmpty();
    }

    public final boolean A0D() {
        return this.A01;
    }

    public final boolean A0E(HT ht) {
        if (this.A04.remove(ht)) {
            ht.A03.delete();
            return true;
        }
        return false;
    }

    public final boolean A0F(C0572Hb c0572Hb) {
        C0964Wm c0964Wm = this.A00;
        C0964Wm oldMetadata = this.A00;
        this.A00 = oldMetadata.A08(c0572Hb);
        C0964Wm oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c0964Wm);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HW hw = (HW) obj;
        if (this.A02 == hw.A02 && this.A03.equals(hw.A03)) {
            TreeSet<C0962Wk> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].charAt(21) != strArr[0].charAt(21)) {
                throw new RuntimeException();
            }
            A06[4] = "6WixUlfTKGOdvAUaxQ2Z5ifCzkckXFCZ";
            if (treeSet.equals(hw.A04) && this.A00.equals(hw.A00)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = A03(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        int i2 = result * 31;
        int result2 = this.A04.hashCode();
        return i2 + result2;
    }
}
