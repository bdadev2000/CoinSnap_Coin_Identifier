package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SpliceInsertCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceInsertCommand> CREATOR = new Parcelable.Creator<SpliceInsertCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceInsertCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand createFromParcel(Parcel parcel) {
            return new SpliceInsertCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceInsertCommand[] newArray(int i10) {
            return new SpliceInsertCommand[i10];
        }
    };
    public final boolean autoReturn;
    public final int availNum;
    public final int availsExpected;
    public final long breakDurationUs;
    public final List<ComponentSplice> componentSpliceList;
    public final boolean outOfNetworkIndicator;
    public final boolean programSpliceFlag;
    public final long programSplicePlaybackPositionUs;
    public final long programSplicePts;
    public final boolean spliceEventCancelIndicator;
    public final long spliceEventId;
    public final boolean spliceImmediateFlag;
    public final int uniqueProgramId;

    /* loaded from: classes4.dex */
    public static final class ComponentSplice {
        public final long componentSplicePlaybackPositionUs;
        public final long componentSplicePts;
        public final int componentTag;

        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public final void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.componentSplicePts);
            parcel.writeLong(this.componentSplicePlaybackPositionUs);
        }

        private ComponentSplice(int i10, long j3, long j10) {
            this.componentTag = i10;
            this.componentSplicePts = j3;
            this.componentSplicePlaybackPositionUs = j10;
        }
    }

    public static SpliceInsertCommand parseFromSection(ParsableByteArray parsableByteArray, long j3, TimestampAdjuster timestampAdjuster) {
        boolean z10;
        List list;
        boolean z11;
        boolean z12;
        long j10;
        boolean z13;
        long j11;
        int i10;
        int i11;
        int i12;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        long j12;
        boolean z19;
        long j13;
        boolean z20;
        long j14;
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        List emptyList = Collections.emptyList();
        if (!z10) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            if ((readUnsignedByte & 128) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((readUnsignedByte & 64) != 0) {
                z16 = true;
            } else {
                z16 = false;
            }
            if ((readUnsignedByte & 32) != 0) {
                z17 = true;
            } else {
                z17 = false;
            }
            if ((readUnsignedByte & 16) != 0) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z16 && !z18) {
                j12 = TimeSignalCommand.parseSpliceTime(parsableByteArray, j3);
            } else {
                j12 = C.TIME_UNSET;
            }
            if (!z16) {
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                ArrayList arrayList = new ArrayList(readUnsignedByte2);
                for (int i13 = 0; i13 < readUnsignedByte2; i13++) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if (!z18) {
                        j14 = TimeSignalCommand.parseSpliceTime(parsableByteArray, j3);
                    } else {
                        j14 = C.TIME_UNSET;
                    }
                    arrayList.add(new ComponentSplice(readUnsignedByte3, j14, timestampAdjuster.adjustTsTimestamp(j14)));
                }
                emptyList = arrayList;
            }
            if (z17) {
                long readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                if ((128 & readUnsignedByte4) != 0) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                j13 = ((((readUnsignedByte4 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                z19 = z20;
            } else {
                z19 = false;
                j13 = C.TIME_UNSET;
            }
            i10 = parsableByteArray.readUnsignedShort();
            z14 = z16;
            i11 = parsableByteArray.readUnsignedByte();
            i12 = parsableByteArray.readUnsignedByte();
            list = emptyList;
            long j15 = j12;
            z13 = z19;
            j11 = j13;
            z12 = z18;
            z11 = z15;
            j10 = j15;
        } else {
            list = emptyList;
            z11 = false;
            z12 = false;
            j10 = C.TIME_UNSET;
            z13 = false;
            j11 = C.TIME_UNSET;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            z14 = false;
        }
        return new SpliceInsertCommand(readUnsignedInt, z10, z11, z14, z12, j10, timestampAdjuster.adjustTsTimestamp(j10), list, z13, j11, i10, i11, i12);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.spliceEventId);
        parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.spliceImmediateFlag ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.programSplicePts);
        parcel.writeLong(this.programSplicePlaybackPositionUs);
        int size = this.componentSpliceList.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.componentSpliceList.get(i11).writeToParcel(parcel);
        }
        parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.breakDurationUs);
        parcel.writeInt(this.uniqueProgramId);
        parcel.writeInt(this.availNum);
        parcel.writeInt(this.availsExpected);
    }

    private SpliceInsertCommand(long j3, boolean z10, boolean z11, boolean z12, boolean z13, long j10, long j11, List<ComponentSplice> list, boolean z14, long j12, int i10, int i11, int i12) {
        this.spliceEventId = j3;
        this.spliceEventCancelIndicator = z10;
        this.outOfNetworkIndicator = z11;
        this.programSpliceFlag = z12;
        this.spliceImmediateFlag = z13;
        this.programSplicePts = j10;
        this.programSplicePlaybackPositionUs = j11;
        this.componentSpliceList = Collections.unmodifiableList(list);
        this.autoReturn = z14;
        this.breakDurationUs = j12;
        this.uniqueProgramId = i10;
        this.availNum = i11;
        this.availsExpected = i12;
    }

    private SpliceInsertCommand(Parcel parcel) {
        this.spliceEventId = parcel.readLong();
        this.spliceEventCancelIndicator = parcel.readByte() == 1;
        this.outOfNetworkIndicator = parcel.readByte() == 1;
        this.programSpliceFlag = parcel.readByte() == 1;
        this.spliceImmediateFlag = parcel.readByte() == 1;
        this.programSplicePts = parcel.readLong();
        this.programSplicePlaybackPositionUs = parcel.readLong();
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(ComponentSplice.createFromParcel(parcel));
        }
        this.componentSpliceList = Collections.unmodifiableList(arrayList);
        this.autoReturn = parcel.readByte() == 1;
        this.breakDurationUs = parcel.readLong();
        this.uniqueProgramId = parcel.readInt();
        this.availNum = parcel.readInt();
        this.availsExpected = parcel.readInt();
    }
}
