package com.facebook.ads.internal.exoplayer2.thirdparty.trackselection;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import com.google.android.gms.common.api.Api;
import com.instagram.common.viewpoint.core.C0550Gd;
import com.instagram.common.viewpoint.core.IK;
import java.util.HashMap;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class DefaultTrackSelector$Parameters implements Parcelable {
    public static String[] A0I = {"8cmZQKSr4e", "iMp0vhQuApByAzd3UlzuqPNosBBIij56", "lQE7OUEJZwYk", "ijVF0TjJmPEEom5xXBBS3MNokpliI9Vz", "24priIiqAscL", "HHTbuc6jJnpbFValFtkFIwv24qRilhed", "j1grCTc2L", "MPdgTc6Z3sPUFClC4uSLQHQa2XebDs9v"};
    public static final DefaultTrackSelector$Parameters A0J = new DefaultTrackSelector$Parameters();
    public static final Parcelable.Creator<DefaultTrackSelector$Parameters> CREATOR = new C0550Gd();
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
        for (int i2 = 0; i2 < size; i2++) {
            int keyAt = sparseArray.keyAt(i2);
            Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> valueAt = sparseArray.valueAt(i2);
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
    public static boolean A04(Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map, Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> map2) {
        if (map2.size() != map.size()) {
            return false;
        }
        for (Map.Entry<TrackGroupArray, DefaultTrackSelector$SelectionOverride> entry : map.entrySet()) {
            TrackGroupArray key = entry.getKey();
            if (!map2.containsKey(key) || !IK.A0g(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }

    public DefaultTrackSelector$Parameters() {
        this(new SparseArray(), new SparseBooleanArray(), null, null, false, 0, false, false, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, true, Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, true, 0);
    }

    public DefaultTrackSelector$Parameters(Parcel parcel) {
        this.A0G = A00(parcel);
        this.A0H = parcel.readSparseBooleanArray();
        this.A07 = parcel.readString();
        this.A08 = parcel.readString();
        this.A0E = IK.A0f(parcel);
        this.A00 = parcel.readInt();
        this.A0D = IK.A0f(parcel);
        this.A09 = IK.A0f(parcel);
        this.A0A = IK.A0f(parcel);
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A0C = IK.A0f(parcel);
        this.A0B = IK.A0f(parcel);
        this.A06 = parcel.readInt();
        this.A05 = parcel.readInt();
        this.A0F = IK.A0f(parcel);
        this.A04 = parcel.readInt();
    }

    public DefaultTrackSelector$Parameters(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray, SparseBooleanArray sparseBooleanArray, String str, String str2, boolean z2, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, int i5, boolean z6, boolean z7, int i6, int i7, boolean z8, int i8) {
        this.A0G = sparseArray;
        this.A0H = sparseBooleanArray;
        this.A07 = IK.A0L(str);
        this.A08 = IK.A0L(str2);
        this.A0E = z2;
        this.A00 = i2;
        this.A0D = z3;
        this.A09 = z4;
        this.A0A = z5;
        this.A03 = i3;
        this.A02 = i4;
        this.A01 = i5;
        this.A0C = z6;
        this.A0B = z7;
        this.A06 = i6;
        this.A05 = i7;
        this.A0F = z8;
        this.A04 = i8;
    }

    public static SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> A00(Parcel parcel) {
        int readInt = parcel.readInt();
        SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray = new SparseArray<>(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            int overrideCount = parcel.readInt();
            HashMap hashMap = new HashMap(overrideCount);
            for (int i3 = 0; i3 < overrideCount; i3++) {
                hashMap.put((TrackGroupArray) parcel.readParcelable(TrackGroupArray.class.getClassLoader()), (DefaultTrackSelector$SelectionOverride) parcel.readParcelable(DefaultTrackSelector$SelectionOverride.class.getClassLoader()));
            }
            sparseArray.put(readInt2, hashMap);
        }
        return sparseArray;
    }

    public static boolean A02(SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> second, SparseArray<Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride>> sparseArray) {
        int size = second.size();
        int firstSize = sparseArray.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInSecond = 0; indexInSecond < size; indexInSecond++) {
            int keyAt = second.keyAt(indexInSecond);
            String[] strArr = A0I;
            String str = strArr[3];
            String str2 = strArr[1];
            int indexInFirst = str.charAt(21);
            int firstSize2 = str2.charAt(21);
            if (indexInFirst == firstSize2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0I;
            strArr2[2] = "cTRaF8RO9nXx";
            strArr2[4] = "EDqN0kPd4EtP";
            int firstSize3 = sparseArray.indexOfKey(keyAt);
            if (firstSize3 < 0 || !A04(second.valueAt(indexInSecond), sparseArray.valueAt(firstSize3))) {
                return false;
            }
        }
        return true;
    }

    public static boolean A03(SparseBooleanArray sparseBooleanArray, SparseBooleanArray sparseBooleanArray2) {
        int size = sparseBooleanArray.size();
        int firstSize = sparseBooleanArray2.size();
        if (firstSize != size) {
            return false;
        }
        for (int indexInFirst = 0; indexInFirst < size; indexInFirst++) {
            int firstSize2 = sparseBooleanArray.keyAt(indexInFirst);
            if (sparseBooleanArray2.indexOfKey(firstSize2) < 0) {
                return false;
            }
        }
        return true;
    }

    public final DefaultTrackSelector$SelectionOverride A05(int i2, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i2);
        if (overrides != null) {
            return overrides.get(trackGroupArray);
        }
        return null;
    }

    public final boolean A06(int i2) {
        return this.A0H.get(i2);
    }

    public final boolean A07(int i2, TrackGroupArray trackGroupArray) {
        Map<TrackGroupArray, DefaultTrackSelector$SelectionOverride> overrides = this.A0G.get(i2);
        return overrides != null && overrides.containsKey(trackGroupArray);
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
        if (this.A0E == defaultTrackSelector$Parameters.A0E && this.A00 == defaultTrackSelector$Parameters.A00 && this.A0D == defaultTrackSelector$Parameters.A0D && this.A09 == defaultTrackSelector$Parameters.A09 && this.A0A == defaultTrackSelector$Parameters.A0A && this.A03 == defaultTrackSelector$Parameters.A03 && this.A02 == defaultTrackSelector$Parameters.A02) {
            boolean z2 = this.A0C;
            boolean z3 = defaultTrackSelector$Parameters.A0C;
            String[] strArr = A0I;
            if (strArr[5].charAt(6) == strArr[7].charAt(6)) {
                String[] strArr2 = A0I;
                strArr2[2] = "sfh4v5JH9YfM";
                strArr2[4] = "60euWtnhJ0n7";
                if (z2 == z3 && this.A0B == defaultTrackSelector$Parameters.A0B && this.A0F == defaultTrackSelector$Parameters.A0F && this.A06 == defaultTrackSelector$Parameters.A06 && this.A05 == defaultTrackSelector$Parameters.A05 && this.A01 == defaultTrackSelector$Parameters.A01) {
                    int i2 = this.A04;
                    String[] strArr3 = A0I;
                    if (strArr3[3].charAt(21) != strArr3[1].charAt(21)) {
                        String[] strArr4 = A0I;
                        strArr4[3] = "jFxDzMr4Wl6CXL9gL9bgBgUZ4CFyGZQQ";
                        strArr4[1] = "AvCBIiMA1IKKXmLhd6rc5nfLtcJ8dACa";
                        if (i2 == defaultTrackSelector$Parameters.A04 && TextUtils.equals(this.A07, defaultTrackSelector$Parameters.A07) && TextUtils.equals(this.A08, defaultTrackSelector$Parameters.A08) && A03(this.A0H, defaultTrackSelector$Parameters.A0H) && A02(this.A0G, defaultTrackSelector$Parameters.A0G)) {
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
        return ((((((((((((((((((((((((((((((this.A0E ? 1 : 0) * 31) + this.A00) * 31) + (this.A0D ? 1 : 0)) * 31) + (this.A09 ? 1 : 0)) * 31) + (this.A0A ? 1 : 0)) * 31) + this.A03) * 31) + this.A02) * 31) + (this.A0C ? 1 : 0)) * 31) + (this.A0B ? 1 : 0)) * 31) + (this.A0F ? 1 : 0)) * 31) + this.A06) * 31) + this.A05) * 31) + this.A01) * 31) + this.A04) * 31) + (this.A07 == null ? 0 : this.A07.hashCode())) * 31) + (this.A08 != null ? this.A08.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        A01(parcel, this.A0G);
        parcel.writeSparseBooleanArray(this.A0H);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        IK.A0V(parcel, this.A0E);
        parcel.writeInt(this.A00);
        IK.A0V(parcel, this.A0D);
        IK.A0V(parcel, this.A09);
        IK.A0V(parcel, this.A0A);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        IK.A0V(parcel, this.A0C);
        IK.A0V(parcel, this.A0B);
        parcel.writeInt(this.A06);
        parcel.writeInt(this.A05);
        IK.A0V(parcel, this.A0F);
        parcel.writeInt(this.A04);
    }
}
