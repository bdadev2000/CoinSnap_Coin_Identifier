package com.meta.analytics.dsp.uinode;

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
    public final List<C1115Dt> A06;
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
    public static Du A02(C1217Hz c1217Hz) {
        long A0M = c1217Hz.A0M();
        boolean z8 = (c1217Hz.A0E() & 128) != 0;
        boolean z9 = false;
        boolean z10 = false;
        long j7 = C.TIME_UNSET;
        ArrayList arrayList = new ArrayList();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        long j9 = C.TIME_UNSET;
        if (!z8) {
            int A0E = c1217Hz.A0E();
            z9 = (A0E & 128) != 0;
            z10 = (A0E & 64) != 0;
            if (A0B[7].length() != 1) {
                throw new RuntimeException();
            }
            A0B[1] = "02B3CRg7kTq01s";
            boolean z12 = (A0E & 32) != 0;
            if (z10) {
                j7 = c1217Hz.A0M();
            }
            if (!z10) {
                int A0E2 = c1217Hz.A0E();
                arrayList = new ArrayList(A0E2);
                for (int i12 = 0; i12 < A0E2; i12++) {
                    arrayList.add(new C1115Dt(c1217Hz.A0E(), c1217Hz.A0M(), null));
                }
                String[] strArr = A0B;
                if (strArr[0].charAt(5) == strArr[5].charAt(5)) {
                    A0B[1] = "Wfp3iGqyia9VmI";
                }
            }
            if (z12) {
                long A0E3 = c1217Hz.A0E();
                z11 = (128 & A0E3) != 0;
                j9 = (1000 * (((1 & A0E3) << 32) | c1217Hz.A0M())) / 90;
            }
            i9 = c1217Hz.A0I();
            i10 = c1217Hz.A0E();
            i11 = c1217Hz.A0E();
        }
        return new Du(A0M, z8, z9, z10, arrayList, j7, z11, j9, i9, i10, i11);
    }

    public Du(long j7, boolean z8, boolean z9, boolean z10, List<C1115Dt> list, long j9, boolean z11, long j10, int i9, int i10, int i11) {
        this.A04 = j7;
        this.A0A = z8;
        this.A08 = z9;
        this.A09 = z10;
        this.A06 = Collections.unmodifiableList(list);
        this.A05 = j9;
        this.A07 = z11;
        this.A03 = j10;
        this.A02 = i9;
        this.A00 = i10;
        this.A01 = i11;
    }

    public Du(Parcel parcel) {
        C1115Dt A00;
        this.A04 = parcel.readLong();
        this.A0A = parcel.readByte() == 1;
        this.A08 = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i9 = 0; i9 < readInt; i9++) {
            A00 = C1115Dt.A00(parcel);
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

    public static /* synthetic */ Du A03(C1217Hz c1217Hz) {
        return A02(c1217Hz);
    }

    public void A04(Parcel parcel) {
        parcel.writeLong(this.A04);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        int size = this.A06.size();
        parcel.writeInt(size);
        for (int i9 = 0; i9 < size; i9++) {
            this.A06.get(i9).A02(parcel);
        }
        parcel.writeLong(this.A05);
        byte b = this.A07 ? (byte) 1 : (byte) 0;
        if (A0B[1].length() != 14) {
            throw new RuntimeException();
        }
        A0B[1] = "FoD8YYsiaA11j5";
        parcel.writeByte(b);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }

    public static /* synthetic */ void A05(Du du, Parcel parcel) {
        du.A04(parcel);
    }
}
