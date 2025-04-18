package com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new Parcelable.Creator<SpliceScheduleCommand>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.scte35.SpliceScheduleCommand.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand createFromParcel(Parcel parcel) {
            return new SpliceScheduleCommand(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SpliceScheduleCommand[] newArray(int i10) {
            return new SpliceScheduleCommand[i10];
        }
    };
    public final List<Event> events;

    /* loaded from: classes4.dex */
    public static final class ComponentSplice {
        public final int componentTag;
        public final long utcSpliceTime;

        /* JADX INFO: Access modifiers changed from: private */
        public static ComponentSplice createFromParcel(Parcel parcel) {
            return new ComponentSplice(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeInt(this.componentTag);
            parcel.writeLong(this.utcSpliceTime);
        }

        private ComponentSplice(int i10, long j3) {
            this.componentTag = i10;
            this.utcSpliceTime = j3;
        }
    }

    public static SpliceScheduleCommand parseFromSection(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        ArrayList arrayList = new ArrayList(readUnsignedByte);
        for (int i10 = 0; i10 < readUnsignedByte; i10++) {
            arrayList.add(Event.parseFromSection(parsableByteArray));
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int size = this.events.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.events.get(i11).writeToParcel(parcel);
        }
    }

    private SpliceScheduleCommand(List<Event> list) {
        this.events = Collections.unmodifiableList(list);
    }

    private SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i10 = 0; i10 < readInt; i10++) {
            arrayList.add(Event.createFromParcel(parcel));
        }
        this.events = Collections.unmodifiableList(arrayList);
    }

    /* loaded from: classes4.dex */
    public static final class Event {
        public final boolean autoReturn;
        public final int availNum;
        public final int availsExpected;
        public final long breakDurationUs;
        public final List<ComponentSplice> componentSpliceList;
        public final boolean outOfNetworkIndicator;
        public final boolean programSpliceFlag;
        public final boolean spliceEventCancelIndicator;
        public final long spliceEventId;
        public final int uniqueProgramId;
        public final long utcSpliceTime;

        private Event(long j3, boolean z10, boolean z11, boolean z12, List<ComponentSplice> list, long j10, boolean z13, long j11, int i10, int i11, int i12) {
            this.spliceEventId = j3;
            this.spliceEventCancelIndicator = z10;
            this.outOfNetworkIndicator = z11;
            this.programSpliceFlag = z12;
            this.componentSpliceList = Collections.unmodifiableList(list);
            this.utcSpliceTime = j10;
            this.autoReturn = z13;
            this.breakDurationUs = j11;
            this.uniqueProgramId = i10;
            this.availNum = i11;
            this.availsExpected = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event createFromParcel(Parcel parcel) {
            return new Event(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Event parseFromSection(ParsableByteArray parsableByteArray) {
            boolean z10;
            ArrayList arrayList;
            boolean z11;
            long j3;
            boolean z12;
            long j10;
            int i10;
            int i11;
            int i12;
            boolean z13;
            boolean z14;
            boolean z15;
            boolean z16;
            long j11;
            boolean z17;
            long j12;
            boolean z18;
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ArrayList arrayList2 = new ArrayList();
            if (!z10) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if ((readUnsignedByte & 128) != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((readUnsignedByte & 64) != 0) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((readUnsignedByte & 32) != 0) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                if (z15) {
                    j11 = parsableByteArray.readUnsignedInt();
                } else {
                    j11 = C.TIME_UNSET;
                }
                if (!z15) {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    ArrayList arrayList3 = new ArrayList(readUnsignedByte2);
                    for (int i13 = 0; i13 < readUnsignedByte2; i13++) {
                        arrayList3.add(new ComponentSplice(parsableByteArray.readUnsignedByte(), parsableByteArray.readUnsignedInt()));
                    }
                    arrayList2 = arrayList3;
                }
                if (z16) {
                    long readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    if ((128 & readUnsignedByte3) != 0) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    j12 = ((((readUnsignedByte3 & 1) << 32) | parsableByteArray.readUnsignedInt()) * 1000) / 90;
                    z17 = z18;
                } else {
                    z17 = false;
                    j12 = C.TIME_UNSET;
                }
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                z13 = z15;
                i12 = parsableByteArray.readUnsignedByte();
                j10 = j12;
                arrayList = arrayList2;
                long j13 = j11;
                i10 = readUnsignedShort;
                i11 = readUnsignedByte4;
                j3 = j13;
                boolean z19 = z14;
                z12 = z17;
                z11 = z19;
            } else {
                arrayList = arrayList2;
                z11 = false;
                j3 = C.TIME_UNSET;
                z12 = false;
                j10 = C.TIME_UNSET;
                i10 = 0;
                i11 = 0;
                i12 = 0;
                z13 = false;
            }
            return new Event(readUnsignedInt, z10, z11, z13, arrayList, j3, z12, j10, i10, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void writeToParcel(Parcel parcel) {
            parcel.writeLong(this.spliceEventId);
            parcel.writeByte(this.spliceEventCancelIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.outOfNetworkIndicator ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.programSpliceFlag ? (byte) 1 : (byte) 0);
            int size = this.componentSpliceList.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.componentSpliceList.get(i10).writeToParcel(parcel);
            }
            parcel.writeLong(this.utcSpliceTime);
            parcel.writeByte(this.autoReturn ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.breakDurationUs);
            parcel.writeInt(this.uniqueProgramId);
            parcel.writeInt(this.availNum);
            parcel.writeInt(this.availsExpected);
        }

        private Event(Parcel parcel) {
            this.spliceEventId = parcel.readLong();
            this.spliceEventCancelIndicator = parcel.readByte() == 1;
            this.outOfNetworkIndicator = parcel.readByte() == 1;
            this.programSpliceFlag = parcel.readByte() == 1;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                arrayList.add(ComponentSplice.createFromParcel(parcel));
            }
            this.componentSpliceList = Collections.unmodifiableList(arrayList);
            this.utcSpliceTime = parcel.readLong();
            this.autoReturn = parcel.readByte() == 1;
            this.breakDurationUs = parcel.readLong();
            this.uniqueProgramId = parcel.readInt();
            this.availNum = parcel.readInt();
            this.availsExpected = parcel.readInt();
        }
    }
}
