package com.instagram.common.viewpoint.core;

import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Dz {
    public static String[] A0B = {"MbQlclBS93OpAIrGgy", "fr4nhdwawCkfl6xe", "", "jazGPK14ugDp9XSpPVwjXwSunadlaYol", "c8hCDXw30CLUJvo3hmXfNwPZepkI4Dm3", "1stzsAzc5mICw7Ui", "zsUepILv7pzPEMGeAcwpA2C", "FE9c5HnV3VVOUNIp57h4JuspLxtKtT80"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0507Dy> A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 24 out of bounds for length 23
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static Dz A02(I4 i4) {
        long A0M = i4.A0M();
        boolean z2 = (i4.A0E() & 128) != 0;
        boolean z3 = false;
        boolean z4 = false;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        boolean z5 = false;
        long j2 = -9223372036854775807L;
        if (!z2) {
            int A0E = i4.A0E();
            z3 = (A0E & 128) != 0;
            z4 = (A0E & 64) != 0;
            int i6 = A0E & 32;
            if (A0B[4].charAt(19) != 'f') {
                throw new RuntimeException();
            }
            String[] strArr = A0B;
            strArr[1] = "lR24oTmvDHmhIRnH";
            strArr[5] = "ZGf4jEcTYFHAfCYP";
            boolean z6 = i6 != 0;
            r14 = z4 ? i4.A0M() : -9223372036854775807L;
            if (!z4) {
                int A0E2 = i4.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i7 = 0; i7 < A0E2; i7++) {
                    arrayList.add(new C0507Dy(i4.A0E(), i4.A0M(), null));
                }
            }
            if (z6) {
                long A0E3 = i4.A0E();
                z5 = (128 & A0E3) != 0;
                j2 = (1000 * (((1 & A0E3) << 32) | i4.A0M())) / 90;
            }
            i2 = i4.A0I();
            i3 = i4.A0E();
            i5 = i4.A0E();
        }
        return new Dz(A0M, z2, z3, z4, arrayList, r14, z5, j2, i2, i3, i5);
    }

    public Dz(long j2, boolean z2, boolean z3, boolean z4, List<C0507Dy> list, long j3, boolean z5, long j4, int i2, int i3, int i4) {
        this.A04 = j2;
        this.A0A = z2;
        this.A08 = z3;
        this.A09 = z4;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j3;
        this.A07 = z5;
        this.A03 = j4;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public Dz(Parcel parcel) {
        C0507Dy A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            A00 = C0507Dy.A00(parcel);
            arrayList.add(A00);
        }
        this.A06 = Collections.unmodifiableList(arrayList);
        this.A05 = parcel.readLong();
        int componentSpliceListLength = parcel.readByte();
        this.A07 = componentSpliceListLength == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListLength2 = parcel.readInt();
        this.A02 = componentSpliceListLength2;
        int componentSpliceListLength3 = parcel.readInt();
        this.A00 = componentSpliceListLength3;
        int componentSpliceListLength4 = parcel.readInt();
        this.A01 = componentSpliceListLength4;
    }

    public static Dz A00(Parcel parcel) {
        return new Dz(parcel);
    }

    public static /* synthetic */ Dz A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ Dz A03(I4 i4) {
        return A02(i4);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A06.get(i2).A02(parcel);
        }
        parcel.writeLong(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A05(Dz dz, Parcel parcel) {
        dz.A04(parcel);
    }
}
