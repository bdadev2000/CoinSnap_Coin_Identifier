package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.viewpoint.core.C0503Du;
import com.instagram.common.viewpoint.core.C0504Dv;
import com.instagram.common.viewpoint.core.I4;
import com.instagram.common.viewpoint.core.IG;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"o7T1oZxGxBAHWlRkOQbegsoO93grXIxk", "XvHj8Hk7hABY8IbbTIjHE9pA", "b34rJCODGAR2kw7", "DkxrTnoqNZJiwxANPjTMYz", "HEmBXoCf3O0IVvOMBCnyZOWE", "qlaxw3mTgaR0aM1", "MzIHyiWSWVKcGZIDQW3LWEN9ullkmdDP", "EF2bbwfelQ72cJWGrchq3sqAmXqEDeOA"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C0503Du();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C0504Dv> A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 20
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public SpliceInsertCommand(long j2, boolean z2, boolean z3, boolean z4, boolean z5, long j3, long j4, List<C0504Dv> list, boolean z6, long j5, int i2, int i3, int i4) {
        this.A06 = j2;
        this.A0B = z2;
        this.A09 = z3;
        this.A0A = z4;
        this.A0C = z5;
        this.A05 = j3;
        this.A04 = j4;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z6;
        this.A03 = j5;
        this.A02 = i2;
        this.A00 = i3;
        this.A01 = i4;
    }

    public SpliceInsertCommand(Parcel parcel) {
        this.A06 = parcel.readLong();
        this.A0B = parcel.readByte() == 1;
        this.A09 = parcel.readByte() == 1;
        this.A0A = parcel.readByte() == 1;
        this.A0C = parcel.readByte() == 1;
        this.A05 = parcel.readLong();
        this.A04 = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(C0504Dv.A00(parcel));
        }
        this.A07 = Collections.unmodifiableList(arrayList);
        int componentSpliceListSize = parcel.readByte();
        this.A08 = componentSpliceListSize == 1;
        this.A03 = parcel.readLong();
        int componentSpliceListSize2 = parcel.readInt();
        this.A02 = componentSpliceListSize2;
        int componentSpliceListSize3 = parcel.readInt();
        this.A00 = componentSpliceListSize3;
        int componentSpliceListSize4 = parcel.readInt();
        this.A01 = componentSpliceListSize4;
    }

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C0503Du c0503Du) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(I4 i4, long j2, IG ig) {
        long A0M = i4.A0M();
        boolean z2 = (i4.A0E() & 128) != 0;
        boolean z3 = false;
        boolean outOfNetworkIndicator = false;
        boolean z4 = false;
        long j3 = -9223372036854775807L;
        List emptyList = Collections.emptyList();
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        boolean z5 = false;
        long j4 = -9223372036854775807L;
        if (!z2) {
            int A0E = i4.A0E();
            z3 = (A0E & 128) != 0;
            outOfNetworkIndicator = (A0E & 64) != 0;
            boolean autoReturn = (A0E & 32) != 0;
            int i6 = A0E & 16;
            if (A0D[3].length() != 22) {
                throw new RuntimeException();
            }
            A0D[3] = "PfD4phwgK3fDtd36VsgCIY";
            if (i6 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (outOfNetworkIndicator && !z4) {
                j3 = TimeSignalCommand.A00(i4, j2);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = i4.A0E();
                emptyList = new ArrayList(componentCount);
                for (int i7 = 0; i7 < componentCount; i7++) {
                    int componentTag = i4.A0E();
                    long j5 = -9223372036854775807L;
                    if (!z4) {
                        j5 = TimeSignalCommand.A00(i4, j2);
                    }
                    emptyList.add(new C0504Dv(componentTag, j5, ig.A07(j5), null));
                }
            }
            if (autoReturn) {
                long A0E2 = i4.A0E();
                z5 = (A0E2 & 128) != 0;
                j4 = (1000 * (((A0E2 & 1) << 32) | i4.A0M())) / 90;
            }
            i2 = i4.A0I();
            i3 = i4.A0E();
            i5 = i4.A0E();
        }
        return new SpliceInsertCommand(A0M, z2, z3, outOfNetworkIndicator, z4, j3, ig.A07(j3), emptyList, z5, j4, i2, i3, i5);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i3 = 0; i3 < size; i3++) {
            List<C0504Dv> list = this.A07;
            String[] strArr = A0D;
            if (strArr[2].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[1] = "4YWbA25kauTneX5iGtOo38Lw";
            strArr2[4] = "7oIVhYtWgczHhLZ4eBK9i0jf";
            list.get(i3).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
