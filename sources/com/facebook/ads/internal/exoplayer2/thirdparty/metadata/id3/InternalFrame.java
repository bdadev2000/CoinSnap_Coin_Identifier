package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.uinode.AbstractC0626Ha;
import com.facebook.ads.redexgen.uinode.Dk;
import com.facebook.ads.redexgen.uinode.IF;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class InternalFrame extends Id3Frame {
    public static byte[] A03;
    public static String[] A04 = {"6rP4TJ9dhvMapE0BBZceDYfMTh4TojcA", "lrdqSGw0HHSMAmwwx11wdr3YvkS3wUYa", "52ASZuwC", "0jlxCR8O", "LXKWLHHeOrS5lOritYi", "jXqOduePiWSkMNmBBFDcJBYI5WgIxX01", "Y9tl", "Ni0nwvF"};
    public static final Parcelable.Creator<InternalFrame> CREATOR;
    public final String A00;
    public final String A01;
    public final String A02;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 119);
            if (A04[4].length() != 19) {
                throw new RuntimeException();
            }
            A04[1] = "ksucHZMTxUYPWlnKQAaWw2DlZRkSfW4N";
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{Ascii.CAN, Ascii.FF, 80, 81, 95, 79, 94, 85, 92, 96, 85, 91, 90, 41, -10, -10, -10, -10, Ascii.NAK, -5, 63, 74, 72, 60, 68, 73, Ascii.CAN};
    }

    static {
        A01();
        CREATOR = new Dk();
    }

    public InternalFrame(Parcel parcel) {
        super(A00(14, 4, 82));
        this.A01 = (String) AbstractC0626Ha.A01(parcel.readString());
        this.A00 = (String) AbstractC0626Ha.A01(parcel.readString());
        this.A02 = (String) AbstractC0626Ha.A01(parcel.readString());
    }

    public InternalFrame(String str, String str2, String str3) {
        super(A00(14, 4, 82));
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        boolean A0g = IF.A0g(this.A00, internalFrame.A00);
        if (A04[4].length() != 19) {
            throw new RuntimeException();
        }
        A04[4] = "WYnJcvlfdgkhEaINowX";
        if (A0g && IF.A0g(this.A01, internalFrame.A01) && IF.A0g(this.A02, internalFrame.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = 17 * 31;
        String str = this.A01;
        int result = str != null ? str.hashCode() : 0;
        int result2 = (i10 + result) * 31;
        String str2 = this.A00;
        int result3 = str2 != null ? str2.hashCode() : 0;
        int i11 = (result2 + result3) * 31;
        String str3 = this.A02;
        int hashCode = i11 + (str3 != null ? str3.hashCode() : 0);
        if (A04[2].length() != 8) {
            throw new RuntimeException();
        }
        A04[2] = "LCjFSYtL";
        return hashCode;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(18, 9, 100) + this.A01 + A00(0, 14, 117) + this.A00;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
    }
}
