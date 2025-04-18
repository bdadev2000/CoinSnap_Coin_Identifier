package com.mbridge.msdk.playercommon.exoplayer2.source;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class TrackGroupArray implements Parcelable {
    private int hashCode;
    public final int length;
    private final TrackGroup[] trackGroups;
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);
    public static final Parcelable.Creator<TrackGroupArray> CREATOR = new Parcelable.Creator<TrackGroupArray>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroupArray createFromParcel(Parcel parcel) {
            return new TrackGroupArray(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TrackGroupArray[] newArray(int i10) {
            return new TrackGroupArray[i10];
        }
    };

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.trackGroups = trackGroupArr;
        this.length = trackGroupArr.length;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.length == trackGroupArray.length && Arrays.equals(this.trackGroups, trackGroupArray.trackGroups)) {
            return true;
        }
        return false;
    }

    public final TrackGroup get(int i10) {
        return this.trackGroups[i10];
    }

    public final int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = Arrays.hashCode(this.trackGroups);
        }
        return this.hashCode;
    }

    public final int indexOf(TrackGroup trackGroup) {
        for (int i10 = 0; i10 < this.length; i10++) {
            if (this.trackGroups[i10] == trackGroup) {
                return i10;
            }
        }
        return -1;
    }

    public final boolean isEmpty() {
        return this.length == 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.length);
        for (int i11 = 0; i11 < this.length; i11++) {
            parcel.writeParcelable(this.trackGroups[i11], 0);
        }
    }

    public TrackGroupArray(Parcel parcel) {
        int readInt = parcel.readInt();
        this.length = readInt;
        this.trackGroups = new TrackGroup[readInt];
        for (int i10 = 0; i10 < this.length; i10++) {
            this.trackGroups[i10] = (TrackGroup) parcel.readParcelable(TrackGroup.class.getClassLoader());
        }
    }
}
