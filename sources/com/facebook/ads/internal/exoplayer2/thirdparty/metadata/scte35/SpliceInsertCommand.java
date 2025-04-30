package com.facebook.ads.internal.exoplayer2.thirdparty.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.meta.analytics.dsp.uinode.C1111Dp;
import com.meta.analytics.dsp.uinode.C1112Dq;
import com.meta.analytics.dsp.uinode.C1217Hz;
import com.meta.analytics.dsp.uinode.IB;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static String[] A0D = {"rwcuqOJ6EdQ67q2Mv0J2HHeiL", "WP4j4wUrwc9dHeO22M7i1JH5Vq97obJg", "mJZdPTUXLZu74", "VLU2rxkJGeQdQarAjhhUo7gMPCvQOQS9", "TorhhvAEpNk7fEbKtUMeNjy7yeYkErzW", "2cgHesvtXq3tKj0PCMbQTWS3l1m9KzOv", "jB5ZWs0uqsLPN", "ipEqGNR1nINtqeP5fHPEDulQW"};
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new C1111Dp();
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final List<C1112Dq> A07;
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
    public SpliceInsertCommand(long j7, boolean z8, boolean z9, boolean z10, boolean z11, long j9, long j10, List<C1112Dq> list, boolean z12, long j11, int i9, int i10, int i11) {
        this.A06 = j7;
        this.A0B = z8;
        this.A09 = z9;
        this.A0A = z10;
        this.A0C = z11;
        this.A05 = j9;
        this.A04 = j10;
        this.A07 = Collections.unmodifiableList(list);
        this.A08 = z12;
        this.A03 = j11;
        this.A02 = i9;
        this.A00 = i10;
        this.A01 = i11;
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
        for (int i9 = 0; i9 < readInt; i9++) {
            arrayList.add(C1112Dq.A00(parcel));
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

    public /* synthetic */ SpliceInsertCommand(Parcel parcel, C1111Dp c1111Dp) {
        this(parcel);
    }

    public static SpliceInsertCommand A00(C1217Hz c1217Hz, long j7, IB ib) {
        long A0M = c1217Hz.A0M();
        boolean z8 = (c1217Hz.A0E() & 128) != 0;
        boolean z9 = false;
        boolean outOfNetworkIndicator = false;
        boolean z10 = false;
        long j9 = C.TIME_UNSET;
        List emptyList = Collections.emptyList();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        long j10 = C.TIME_UNSET;
        if (!z8) {
            int A0E = c1217Hz.A0E();
            if (A0D[1].charAt(24) == '7') {
                throw new RuntimeException();
            }
            A0D[4] = "wCIdN9eSc7apWAr1IiSVHk4IDh7dTuFq";
            z9 = (A0E & 128) != 0;
            outOfNetworkIndicator = (A0E & 64) != 0;
            boolean autoReturn = (A0E & 32) != 0;
            z10 = (A0E & 16) != 0;
            if (outOfNetworkIndicator && !z10) {
                j9 = TimeSignalCommand.A00(c1217Hz, j7);
            }
            if (!outOfNetworkIndicator) {
                int componentCount = c1217Hz.A0E();
                emptyList = new ArrayList(componentCount);
                for (int i12 = 0; i12 < componentCount; i12++) {
                    int componentTag = c1217Hz.A0E();
                    long j11 = C.TIME_UNSET;
                    if (!z10) {
                        j11 = TimeSignalCommand.A00(c1217Hz, j7);
                    }
                    emptyList.add(new C1112Dq(componentTag, j11, ib.A07(j11), null));
                }
            }
            if (autoReturn) {
                long A0E2 = c1217Hz.A0E();
                z11 = (A0E2 & 128) != 0;
                j10 = (1000 * (((A0E2 & 1) << 32) | c1217Hz.A0M())) / 90;
            }
            i9 = c1217Hz.A0I();
            i10 = c1217Hz.A0E();
            i11 = c1217Hz.A0E();
        }
        return new SpliceInsertCommand(A0M, z8, z9, outOfNetworkIndicator, z10, j9, ib.A07(j9), emptyList, z11, j10, i9, i10, i11);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.A06);
        parcel.writeByte(this.A0B ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A09 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0A ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A0C ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A04);
        int size = this.A07.size();
        parcel.writeInt(size);
        for (int i10 = 0; i10 < size; i10++) {
            List<C1112Dq> list = this.A07;
            if (A0D[3].length() != 32) {
                throw new RuntimeException();
            }
            String[] strArr = A0D;
            strArr[6] = "cIZczz40pT0Gu";
            strArr[2] = "8BKfMUSS1QcQc";
            list.get(i10).A01(parcel);
        }
        parcel.writeByte(this.A08 ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A01);
    }
}
