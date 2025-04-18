package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.applovin.exoplayer2.common.base.Ascii;
import com.facebook.ads.redexgen.uinode.C0538De;
import com.facebook.ads.redexgen.uinode.IF;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ChapterFrame extends Id3Frame {
    public static byte[] A06;
    public static String[] A07 = {"QpJSSLL1pAOhHOIuNBRkrzmXt1j3kGrp", "YDXCC3i5xiwq8rKE5Vv8RtOzkk3qmOGu", "a9Dyegh0cUh2NB45defTztP9U1vgFmVz", "Fo5phTLuHzrdJakbpxdIKAmZ2lieOpY4", "dsZIUxvA4XNulUgaba6Xxwm2YLZaneQj", "tf5IGK9pdoxQzr6GjeVrhLEpaxS6glNY", "h51Nv655qNU0F3QlRFxqTHMWff2CX7Q9", "n0uNxI60"};
    public static final Parcelable.Creator<ChapterFrame> CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final String A04;
    public final Id3Frame[] A05;

    public static String A00(int i10, int i11, int i12) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i10, i10 + i11);
        for (int i13 = 0; i13 < copyOfRange.length; i13++) {
            copyOfRange[i13] = (byte) ((copyOfRange[i13] - i12) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{Ascii.DLE, Ascii.NAK, Ascii.SO, Ascii.GS};
    }

    static {
        A01();
        CREATOR = new C0538De();
    }

    public ChapterFrame(Parcel parcel) {
        super(A00(0, 4, 102));
        this.A04 = parcel.readString();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        int readInt = parcel.readInt();
        this.A05 = new Id3Frame[readInt];
        for (int i10 = 0; i10 < readInt; i10++) {
            this.A05[i10] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterFrame(String str, int i10, int i11, long j3, long j10, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 102));
        this.A04 = str;
        this.A01 = i10;
        this.A00 = i11;
        this.A03 = j3;
        this.A02 = j10;
        this.A05 = id3FrameArr;
    }

    @Override // com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            Class<?> cls = getClass();
            Class<?> cls2 = obj.getClass();
            String[] strArr = A07;
            if (strArr[4].charAt(30) != strArr[6].charAt(30)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "XcR91xLCiqA5sQGMKj3Ma8f7fza10VW6";
            strArr2[0] = "VJeBRgLHewbbeoWUsBxJyvYKkza9BVMl";
            if (cls == cls2) {
                ChapterFrame chapterFrame = (ChapterFrame) obj;
                if (this.A01 == chapterFrame.A01 && this.A00 == chapterFrame.A00 && this.A03 == chapterFrame.A03 && this.A02 == chapterFrame.A02 && IF.A0g(this.A04, chapterFrame.A04) && Arrays.equals(this.A05, chapterFrame.A05)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = ((((17 * 31) + result) * 31) + this.A00) * 31;
        int result2 = (int) this.A03;
        int result3 = (((i10 + result2) * 31) + ((int) this.A02)) * 31;
        String str = this.A04;
        int result4 = str != null ? str.hashCode() : 0;
        return result3 + result4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.A04);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeInt(this.A05.length);
        for (Id3Frame id3Frame : this.A05) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
