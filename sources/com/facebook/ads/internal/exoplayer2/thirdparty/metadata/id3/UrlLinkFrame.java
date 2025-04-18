package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.uinode.C0543Dn;
import com.facebook.ads.redexgen.uinode.IF;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static byte[] A02;
    public static String[] A03 = {"SMzvxfBZNpFPtfhvCBNmxD5w5RZcFBHf", "ufm7DpG", "Uhgkugih78JCocZjliGLzLJI0JX97Wlp", "g9R3AZoZMQhVmKmsbmBYkyJs5Pvw", "3l4kBC2eMJfnpmpmOBC7pUzvvOmAScoF", "Nq", "iHYmFrwEGttvvV0G9MdeYy5oFPuwvwLA", "VbrIvN9oxWukUpyvbjswc4wHfKykQdOC"};
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR;
    public final String A00;
    public final String A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] ^ i12) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{Ascii.VT, 17, 68, 67, 93, Ascii.FF};
    }

    static {
        A01();
        CREATOR = new C0543Dn();
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
        if (super.A00.equals(((Id3Frame) urlLinkFrame).A00) && IF.A0g(this.A00, urlLinkFrame.A00) && IF.A0g(this.A01, urlLinkFrame.A01)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = super.A00.hashCode();
        int i10 = ((17 * 31) + result) * 31;
        String str = this.A00;
        int result2 = str != null ? str.hashCode() : 0;
        int i11 = (i10 + result2) * 31;
        String str2 = this.A01;
        int result3 = str2 != null ? str2.hashCode() : 0;
        int i12 = i11 + result3;
        if (A03[6].charAt(5) != 'r') {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "iVk9cRAeh9K6nojMUGV2Esaoop3Vky3R";
        strArr[4] = "iTOhXmgm6y1CYwjPHSdC5IBbJuUiDD8Y";
        return i12;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame
    public final String toString() {
        return super.A00 + A00(0, 6, 69) + this.A01;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(super.A00);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }
}
