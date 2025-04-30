package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator<GeobFrame>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.GeobFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GeobFrame createFromParcel(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public GeobFrame[] newArray(int i9) {
            return new GeobFrame[i9];
        }
    };
    public static final String ID = "GEOB";
    public final byte[] data;
    public final String description;
    public final String filename;
    public final String mimeType;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(ID);
        this.mimeType = str;
        this.filename = str2;
        this.description = str3;
        this.data = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || GeobFrame.class != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        if (Util.areEqual(this.mimeType, geobFrame.mimeType) && Util.areEqual(this.filename, geobFrame.filename) && Util.areEqual(this.description, geobFrame.description) && Arrays.equals(this.data, geobFrame.data)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        String str = this.mimeType;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = (527 + i9) * 31;
        String str2 = this.filename;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = (i12 + i10) * 31;
        String str3 = this.description;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return Arrays.hashCode(this.data) + ((i13 + i11) * 31);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.id + ": mimeType=" + this.mimeType + ", filename=" + this.filename + ", description=" + this.description;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.mimeType);
        parcel.writeString(this.filename);
        parcel.writeString(this.description);
        parcel.writeByteArray(this.data);
    }

    public GeobFrame(Parcel parcel) {
        super(ID);
        this.mimeType = parcel.readString();
        this.filename = parcel.readString();
        this.description = parcel.readString();
        this.data = parcel.createByteArray();
    }
}
