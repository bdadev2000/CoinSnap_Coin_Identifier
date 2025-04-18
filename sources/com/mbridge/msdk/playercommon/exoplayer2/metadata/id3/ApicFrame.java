package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new Parcelable.Creator<ApicFrame>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.ApicFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ApicFrame[] newArray(int i10) {
            return new ApicFrame[i10];
        }
    };
    public static final String ID = "APIC";
    public final String description;
    public final String mimeType;
    public final byte[] pictureData;
    public final int pictureType;

    public ApicFrame(String str, String str2, int i10, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.description = str2;
        this.pictureType = i10;
        this.pictureData = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ApicFrame.class != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        if (this.pictureType == apicFrame.pictureType && Util.areEqual(this.mimeType, apicFrame.mimeType) && Util.areEqual(this.description, apicFrame.description) && Arrays.equals(this.pictureData, apicFrame.pictureData)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11 = (527 + this.pictureType) * 31;
        String str = this.mimeType;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i11 + i10) * 31;
        String str2 = this.description;
        if (str2 != null) {
            i12 = str2.hashCode();
        }
        return Arrays.hashCode(this.pictureData) + ((i13 + i12) * 31);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f14731id + ": mimeType=" + this.mimeType + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.description);
        parcel.writeInt(this.pictureType);
        parcel.writeByteArray(this.pictureData);
    }

    public ApicFrame(Parcel parcel) {
        super(ID);
        this.mimeType = parcel.readString();
        this.description = parcel.readString();
        this.pictureType = parcel.readInt();
        this.pictureData = parcel.createByteArray();
    }
}
