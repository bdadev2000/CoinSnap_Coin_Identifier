package com.facebook.ads.internal.exoplayer2.thirdparty.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.facebook.ads.redexgen.uinode.GY;
import com.facebook.ads.redexgen.uinode.IF;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static String[] A0I = {"xspOKqpsuNSHsU6yQ2hmF9xUBvSadBKT", "riC8v0KGC6T6xbiWSXBaQkex98EmMIIC", "9xWod89i1gOfKdrnPe3DKCHyV8RTz8jG", "XViGCx7W3TmophXTcjUeDQCnuDQ44POI", "w1EdEHwQfo8X2adbO9aKaB1kW84D", "Di1edpBPlwoBYmfejQX2YYRqdQKgNm", "Px6EOsH51hKuaKZF9Dy11SJny8y4mC2Q", "lJLgMmMCf61ooNf0l2gCJ"};
    public static final DefaultTrackSelector$Parameters A0J = new DefaultTrackSelector$Parameters();
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR = new GY();
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final String A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A0G;
    public final SparseBooleanArray A0H;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 8
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static void A01(Parcel parcel, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = sparseArray.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            int keyAt = sparseArray.keyAt(i10);
            Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt = sparseArray.valueAt(i10);
            int size2 = valueAt.size();
            parcel.writeInt(keyAt);
            parcel.writeInt(size2);
            for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : valueAt.entrySet()) {
                parcel.writeParcelable(entry.getKey(), 0);
                parcel.writeParcelable(entry.getValue(), 0);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A02(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray2) {
        int size = sparseArray.size();
        if (sparseArray2.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i10));
            if (indexOfKey < 0 || !A04(sparseArray.valueAt(i10), sparseArray2.valueAt(indexOfKey))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static boolean A04(Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map, Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : map.entrySet()) {
            TrackGroupArray key = entry.getKey();
            if (!map2.containsKey(key) || !IF.A0g(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, true, true, Integer.MAX_VALUE, Integer.MAX_VALUE, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = IF.A0f(parcel);
        this.A00 = parcel.readInt();
        this.A0D = IF.A0f(parcel);
        this.A09 = IF.A0f(parcel);
        this.A0A = IF.A0f(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = IF.A0f(parcel);
        this.A0B = IF.A0f(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = IF.A0f(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z10, int i10, boolean z11, boolean z12, boolean z13, int i11, int i12, int i13, boolean z14, boolean z15, int i14, int i15, boolean z16, int i16) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = IF.A0L(str);
        this.A08 = IF.A0L(str2);
        this.A0E = z10;
        this.A00 = i10;
        this.A0D = z11;
        this.A09 = z12;
        this.A0A = z13;
        this.A03 = i11;
        this.A02 = i12;
        this.A01 = i13;
        this.A0C = z14;
        this.A0B = z15;
        this.A06 = i14;
        this.A05 = i15;
        this.A0F = z16;
        this.A04 = i16;
    }

    public static SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A00(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            int readInt2 = parcel.readInt();
            int overrideCount = parcel.readInt();
            HashMap hashMap = new HashMap(overrideCount);
            for (int i11 = 0; i11 < overrideCount; i11++) {
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        return sparseArray;
    }

    public static boolean A03(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            int firstSize2 = sparseBooleanArray.keyAt(i10);
            int indexOfKey = sparseBooleanArray2.indexOfKey(firstSize2);
            String[] strArr = A0I;
            String str = strArr[1];
            String str2 = strArr[3];
            int indexInFirst = str.charAt(1);
            int firstSize3 = str2.charAt(1);
            if (indexInFirst == firstSize3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[4] = "TWCHslMtrSPWm8Xm1qbYb45ITo2f";
            strArr2[7] = "RLfCzsREQIu8GIT95ZyUn";
            if (indexOfKey < 0) {
                return false;
            }
        }
        String[] strArr3 = A0I;
        String str3 = strArr3[1];
        String str4 = strArr3[3];
        int charAt = str3.charAt(1);
        int firstSize4 = str4.charAt(1);
        if (charAt != firstSize4) {
            String[] strArr4 = A0I;
            strArr4[1] = "9OmP0pM4oeSW4vYjuQnZsj7ARVAlNm9Q";
            strArr4[3] = "5jAxY38VzlYYY7G3iwLfCwgXJRn7HwV7";
            return true;
        }
        return true;
    }

    public final DefaultTrackSelector$SelectionOverride A05(int i10, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i10);
        if (overrides != null) {
            return overrides.get(trackGroupArray);
        }
        return null;
    }

    public final boolean A06(int i10) {
        return this.A0H.get(i10);
    }

    public final boolean A07(int i10, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i10);
        if (overrides != null) {
            boolean containsKey = overrides.containsKey(trackGroupArray);
            if (A0I[5].length() == 4) {
                throw new RuntimeException();
            }
            A0I[0] = "lzejp6YakqFZkogBPOKTH5ufeqqszLCx";
            if (containsKey) {
                return true;
            }
        }
        return false;
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
        DefaultTrackSelector$Parameters defaultTrackSelector$Parameters = (DefaultTrackSelector$Parameters) obj;
        if (this.A0E == defaultTrackSelector$Parameters.A0E && this.A00 == defaultTrackSelector$Parameters.A00 && this.A0D == defaultTrackSelector$Parameters.A0D && this.A09 == defaultTrackSelector$Parameters.A09 && this.A0A == defaultTrackSelector$Parameters.A0A && this.A03 == defaultTrackSelector$Parameters.A03 && this.A02 == defaultTrackSelector$Parameters.A02 && this.A0C == defaultTrackSelector$Parameters.A0C && this.A0B == defaultTrackSelector$Parameters.A0B) {
            boolean z10 = this.A0F;
            boolean z11 = defaultTrackSelector$Parameters.A0F;
            String[] strArr = A0I;
            if (strArr[1].charAt(1) != strArr[3].charAt(1)) {
                String[] strArr2 = A0I;
                strArr2[6] = "RsqquBPnZm6UmuAT62eIFIvrb8Rb5SvS";
                strArr2[2] = "EVCGEl3vM50CnHtU5PSWguXPf8LHPnJq";
                if (z10 == z11) {
                    int i10 = this.A06;
                    String[] strArr3 = A0I;
                    if (strArr3[4].length() != strArr3[7].length()) {
                        String[] strArr4 = A0I;
                        strArr4[4] = "cpo4I3FMY0KaSh3J5gQMPV4i0iDz";
                        strArr4[7] = "WmxBSRM06CbrVYU4lLmSD";
                        if (i10 == defaultTrackSelector$Parameters.A06 && this.A05 == defaultTrackSelector$Parameters.A05 && this.A01 == defaultTrackSelector$Parameters.A01 && this.A04 == defaultTrackSelector$Parameters.A04 && TextUtils.equals(this.A07, defaultTrackSelector$Parameters.A07) && TextUtils.equals(this.A08, defaultTrackSelector$Parameters.A08) && A03(this.A0H, defaultTrackSelector$Parameters.A0H) && A02(this.A0G, defaultTrackSelector$Parameters.A0G)) {
                            return true;
                        }
                    }
                }
            }
            throw new RuntimeException();
        }
        return false;
    }

    public final int hashCode() {
        int i10 = (((((((((((((((((((((((((((this.A0E ? 1 : 0) * 31) + this.A00) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + this.A03) * 31) + this.A02) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + this.A06) * 31) + this.A05) * 31) + this.A01) * 31) + this.A04) * 31;
        String str = this.A07;
        int hashCode = (i10 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode2 = hashCode + (str2 != null ? str2.hashCode() : 0);
        if (A0I[5].length() == 4) {
            throw new RuntimeException();
        }
        String[] strArr = A0I;
        strArr[6] = "0d6m0jAEOh63kopddSVpv8GRX8aDyFMT";
        strArr[2] = "KnimCfQbzsddQD04DwcfcTRdj8ibyvkP";
        return hashCode2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        A01(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        IF.A0V(parcel, this.A0E);
        parcel.writeInt(this.A00);
        IF.A0V(parcel, this.A0D);
        IF.A0V(parcel, this.A09);
        IF.A0V(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        IF.A0V(parcel, this.A0C);
        IF.A0V(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        IF.A0V(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}
