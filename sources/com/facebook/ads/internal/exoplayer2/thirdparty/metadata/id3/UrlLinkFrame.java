package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C0501Ds;
import com.instagram.common.viewpoint.core.IK;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static byte[] A02;
    public static String[] A03 = {"c8NCicdTZLmJ2inXNQ3toHzjPVonMpXv", "aSFF6gCbWZYo0gLtpjiRDBRud", "sZ2yfR3DpzNh9v", "y92XvuK2sC", "N8ai6xP5Od7TVPMs8Jay0FHFPRYirWFh", "HDzkZih2lrYPKcmzm9KSPoyEojuK7yog", "DDwCgFPJHFvA5diTm92X28ohtWZRLkNX", "hxFm1PcRgye5xp5wgZFxUZFURn"};
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR;
    public final String A00;
    public final String A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            copyOfRange[i5] = (byte) ((copyOfRange[i5] - i4) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-56, -82, 3, 0, -6, -53};
    }

    static {
        A01();
        CREATOR = new C0501Ds();
    }

    public UrlLinkFrame(Parcel parcel) {
        super(parcel.readString());
        this.A00 = parcel.readString();
        this.A01 = parcel.readString();
    }

    public UrlLinkFrame(String str, String str2, String str3) {
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
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        if (super.A00.equals(((Id3Frame) urlLinkFrame).A00)) {
            boolean A0g = IK.A0g(this.A00, urlLinkFrame.A00);
            String[] strArr = A03;
            if (strArr[2].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A03[4] = "96TNA6xbUpDgxS3VY7GPr8bnLD9hElYA";
            if (A0g && IK.A0g(this.A01, urlLinkFrame.A01)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int hashCode = ((((17 * 31) + result) * 31) + (this.A00 != null ? this.A00.hashCode() : 0)) * 31;
        String str = this.A01;
        if (A03[0].charAt(15) != '5') {
            String[] strArr = A03;
            strArr[6] = "R0KoAZWGaaNUWbKBmgSqKMf6V9pQtd6g";
            strArr[5] = "3J85XNytcsZ3pYJamIMiFyJCjuH41ABd";
            int hashCode2 = hashCode + (str != null ? this.A01.hashCode() : 0);
            if (A03[7].length() != 9) {
                A03[7] = "Kz";
                return hashCode2;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 6, 22) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
