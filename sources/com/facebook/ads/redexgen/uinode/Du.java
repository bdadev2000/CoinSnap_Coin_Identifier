package com.facebook.ads.redexgen.uinode;

import android.os.Parcel;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class Du {
    public static String[] A0B = {"WSNeg6N0n7AIShfXSzX5HQmTc8kFkZEc", "6rZRvoV62oNyzf", "F27AMpNiqyccCa5EB6sKY7eKfEMSqhrd", "FVKbL9f5FAHwz7hiZMN0u1v1YdCbdeYK", "vVfLkZocD1NxPHhP9fXAXrt0GsgaX4xN", "cFmUa63iy9OAJJOa0jT7jB1cdvdJ4hQa", "2QFrNOOxadMtahUuhILPt16xKsmCtJsL", "J"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final List<C0549Dt> A06;
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
    public static Du A02(C0651Hz c0651Hz) {
        long A0M = c0651Hz.A0M();
        boolean z10 = (c0651Hz.A0E() & 128) != 0;
        boolean z11 = false;
        boolean z12 = false;
        long j3 = C.TIME_UNSET;
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        boolean z13 = false;
        long j10 = C.TIME_UNSET;
        if (!z10) {
            int A0E = c0651Hz.A0E();
            z11 = (A0E & 128) != 0;
            z12 = (A0E & 64) != 0;
            if (A0B[7].length() != 1) {
                throw new RuntimeException();
            }
            A0B[1] = "02B3CRg7kTq01s";
            boolean z14 = (A0E & 32) != 0;
            if (z12) {
                j3 = c0651Hz.A0M();
            }
            if (!z12) {
                int A0E2 = c0651Hz.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i13 = 0; i13 < A0E2; i13++) {
                    arrayList.add(new C0549Dt(c0651Hz.A0E(), c0651Hz.A0M(), null));
                }
                String[] strArr = A0B;
                if (strArr[0].charAt(5) == strArr[5].charAt(5)) {
                    A0B[1] = "Wfp3iGqyia9VmI";
                }
            }
            if (z14) {
                long A0E3 = c0651Hz.A0E();
                z13 = (128 & A0E3) != 0;
                j10 = (1000 * (((1 & A0E3) << 32) | c0651Hz.A0M())) / 90;
            }
            i10 = c0651Hz.A0I();
            i11 = c0651Hz.A0E();
            i12 = c0651Hz.A0E();
        }
        return new Du(A0M, z10, z11, z12, arrayList, j3, z13, j10, i10, i11, i12);
    }

    public Du(long j3, boolean z10, boolean z11, boolean z12, List<C0549Dt> list, long j10, boolean z13, long j11, int i10, int i11, int i12) {
        this.A04 = j3;
        this.A0A = z10;
        this.A08 = z11;
        this.A09 = z12;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j10;
        this.A07 = z13;
        this.A03 = j11;
        this.A02 = i10;
        this.A00 = i11;
        this.A01 = i12;
    }

    public Du(Parcel parcel) {
        C0549Dt A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            A00 = C0549Dt.A00(parcel);
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

    public static Du A00(Parcel parcel) {
        return new Du(parcel);
    }

    public static /* synthetic */ Du A01(Parcel parcel) {
        return A00(parcel);
    }

    public static /* synthetic */ Du A03(C0651Hz c0651Hz) {
        return A02(c0651Hz);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            this.A06.get(i10).A02(parcel);
        }
        parcel.writeLong(this.A05);
        byte b3 = this.A07 ? (byte) 1 : (byte) 0;
        if (A0B[1].length() != 14) {
            throw new RuntimeException();
        }
        A0B[1] = "FoD8YYsiaA11j5";
        parcel.writeByte(b3);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A05(Du du, Parcel parcel) {
        du.A04(parcel);
    }
}
