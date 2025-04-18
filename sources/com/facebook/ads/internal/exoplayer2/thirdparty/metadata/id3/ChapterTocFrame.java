package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C0493Dk;
import com.instagram.common.viewpoint.core.IK;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static byte[] A05;
    public static String[] A06 = {"q", "nX4cEFX5rZNLgK66Zbr2M0LDj0xf4fJp", "fegio6ElLuca0kBWCpMXWgqLCFyhIORL", "RYIhd0rxGxSYfBpuDsCOXE9retMVZXKX", "5xJmLiJ3E3nNk4Qe2ivdSjFOtE", "q3jgB5DsBzWTh9ofyuUcyllX5SyVXG4i", "gt3ESKlhtS4Kk", "m"};
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR;
    public final String A00;
    public final boolean A01;
    public final boolean A02;
    public final String[] A03;
    public final Id3Frame[] A04;

    public static String A00(int i2, int i3, int i4) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < copyOfRange.length; i5++) {
            int i6 = copyOfRange[i5] ^ i4;
            if (A06[1].charAt(12) != 'g') {
                throw new RuntimeException();
            }
            A06[2] = "eTFhtvXuO96go1LxaU568guL4Hk8KVyX";
            copyOfRange[i5] = (byte) (i6 ^ 77);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{78, 89, 66, 78};
    }

    static {
        A01();
        CREATOR = new C0493Dk();
    }

    public ChapterTocFrame(Parcel parcel) {
        super(A00(0, 4, 64));
        this.A00 = parcel.readString();
        this.A02 = parcel.readByte() != 0;
        this.A01 = parcel.readByte() != 0;
        this.A03 = parcel.createStringArray();
        int readInt = parcel.readInt();
        this.A04 = new Id3Frame[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.A04[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public ChapterTocFrame(String str, boolean z2, boolean z3, String[] strArr, Id3Frame[] id3FrameArr) {
        super(A00(0, 4, 64));
        this.A00 = str;
        this.A02 = z2;
        this.A01 = z3;
        this.A03 = strArr;
        this.A04 = id3FrameArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        if (this.A02 == chapterTocFrame.A02 && this.A01 == chapterTocFrame.A01 && IK.A0g(this.A00, chapterTocFrame.A00) && Arrays.equals(this.A03, chapterTocFrame.A03) && Arrays.equals(this.A04, chapterTocFrame.A04)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((17 * 31) + (this.A02 ? 1 : 0)) * 31) + (this.A01 ? 1 : 0)) * 31) + (this.A00 != null ? this.A00.hashCode() : 0);
        if (A06[1].charAt(12) != 'g') {
            throw new RuntimeException();
        }
        A06[2] = "b81cAW5lkkuLKoB2DrgmzF0LBXDk4R48";
        return hashCode;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeString(this.A00);
        parcel.writeByte(this.A02 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A01 ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.A03);
        parcel.writeInt(this.A04.length);
        for (Id3Frame id3Frame : this.A04) {
            parcel.writeParcelable(id3Frame, 0);
            String[] strArr = A06;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A06[4] = "yIH6RTQSPR7uBoQIRLxBqA3R3f";
        }
    }
}
