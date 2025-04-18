package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new Parcelable.Creator<PrivFrame>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.PrivFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivFrame createFromParcel(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PrivFrame[] newArray(int i10) {
            return new PrivFrame[i10];
        }
    };
    public static final String ID = "PRIV";
    public final String owner;
    public final byte[] privateData;

    public PrivFrame(String str, byte[] bArr) {
        super(ID);
        this.owner = str;
        this.privateData = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || PrivFrame.class != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        if (Util.areEqual(this.owner, privFrame.owner) && Arrays.equals(this.privateData, privFrame.privateData)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.owner;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        return Arrays.hashCode(this.privateData) + ((527 + i10) * 31);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f14731id + ": owner=" + this.owner;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.owner);
        parcel.writeByteArray(this.privateData);
    }

    public PrivFrame(Parcel parcel) {
        super(ID);
        this.owner = parcel.readString();
        this.privateData = parcel.createByteArray();
    }
}
