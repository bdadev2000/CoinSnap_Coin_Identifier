package com.facebook.ads.internal.exoplayer2.thirdparty.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.meta.analytics.dsp.uinode.IF;
import com.meta.analytics.dsp.uinode.II;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ColorInfo implements Parcelable {
    public static byte[] A05;
    public static String[] A06 = {"80VQOWtIFrOobbxiMsxZdJTT", "F010wdynq8oj1", "1G8DV5AZ5I95f1Je9i", "ymE5EqK7GRiHyv0bpa0nYI", "4rOqPYPNlmCZeQv62KaGY4PxmKKPRa2g", "BPp15N33wFN89GcqQAl924yYn9nOt5sV", "FKpG2ntl7oOqvW7BdDSBpi7R", "DKlX5mgkT3I8HdnXnsQ2T61BH17ERsuH"};
    public static final Parcelable.Creator<ColorInfo> CREATOR;
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static String A00(int i9, int i10, int i11) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i9, i9 + i10);
        for (int i12 = 0; i12 < copyOfRange.length; i12++) {
            copyOfRange[i12] = (byte) ((copyOfRange[i12] ^ i11) ^ 60);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{Ascii.RS, 39, 43, 74, 102, 101, 102, 123, 64, 103, 111, 102, 33};
    }

    static {
        A01();
        CREATOR = new II();
    }

    public ColorInfo(int i9, int i10, int i11, byte[] bArr) {
        this.A02 = i9;
        this.A01 = i10;
        this.A03 = i11;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        boolean hasHdrStaticInfo = IF.A0f(parcel);
        this.A04 = hasHdrStaticInfo ? parcel.createByteArray() : null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ColorInfo colorInfo = (ColorInfo) obj;
        if (this.A02 == colorInfo.A02 && this.A01 == colorInfo.A01 && this.A03 == colorInfo.A03) {
            boolean equals = Arrays.equals(this.A04, colorInfo.A04);
            String[] strArr = A06;
            if (strArr[0].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[7] = "F1LHbAULyMenVjTtnzL0DsTHigunRdPq";
            strArr2[4] = "k1FYGNTHyHoYlkM0jxfoMEweUKnWRrXG";
            if (equals) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A02;
            int result2 = ((((17 * 31) + result) * 31) + this.A01) * 31;
            int result3 = this.A03;
            this.A00 = ((result2 + result3) * 31) + Arrays.hashCode(this.A04);
        }
        int result4 = this.A00;
        return result4;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(3, 10, 53)).append(this.A02);
        String A00 = A00(1, 2, 55);
        return append.append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A04 != null).append(A00(0, 1, 11)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        IF.A0V(parcel, this.A04 != null);
        byte[] bArr = this.A04;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
