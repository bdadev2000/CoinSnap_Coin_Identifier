package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C0500Dr;
import com.instagram.common.viewpoint.core.IK;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class TextInformationFrame extends Id3Frame {
    public static byte[] A02;
    public static String[] A03 = {"ASyNg1gGNlWG", "EFqAWZS8F4xLtUMHt9FEUL", "Vx6IBBIU6XaRdOAjHbXqr", "Phy73fqNY2GG", "BL", "Hr5eJHulkK4DitXKqFdG92R02ijGovUO", "UWMtrJKOpWh5LlzFeu6OG", "qBfMcdZL4b2QEWRUyBulqHXnGi8Olt5r"};
    public static final Parcelable.Creator<TextInformationFrame> CREATOR;
    public final String A00;
    public final String A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 68);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-64, -90, -4, -25, -14, -5, -21, -61};
    }

    static {
        A01();
        CREATOR = new C0500Dr();
    }

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.A00 = str2;
        this.A01 = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (super.A00.equals(((Id3Frame) textInformationFrame).A00) && IK.A0g(this.A00, textInformationFrame.A00) && IK.A0g(this.A01, textInformationFrame.A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int i2 = ((17 * 31) + result) * 31;
        int result2 = 0;
        int result3 = this.A00 != null ? this.A00.hashCode() : 0;
        int i3 = (i2 + result3) * 31;
        if (this.A01 != null) {
            String str = this.A01;
            String[] strArr = A03;
            String str2 = strArr[0];
            String str3 = strArr[3];
            int length = str2.length();
            int result4 = str3.length();
            if (length != result4) {
                throw new RuntimeException();
            }
            A03[7] = "m1qBjb1W4o0FDqjH8SQn0FxInYmbUXEs";
            result2 = str.hashCode();
        }
        return i3 + result2;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 8, 66) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
