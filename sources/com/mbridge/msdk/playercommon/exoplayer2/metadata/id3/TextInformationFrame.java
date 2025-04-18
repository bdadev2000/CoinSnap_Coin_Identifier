package com.mbridge.msdk.playercommon.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import vd.e;

/* loaded from: classes4.dex */
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new Parcelable.Creator<TextInformationFrame>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.TextInformationFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public TextInformationFrame[] newArray(int i10) {
            return new TextInformationFrame[i10];
        }
    };
    public final String description;
    public final String value;

    public TextInformationFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.value = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TextInformationFrame.class != obj.getClass()) {
            return false;
        }
        TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
        if (this.f14731id.equals(textInformationFrame.f14731id) && Util.areEqual(this.description, textInformationFrame.description) && Util.areEqual(this.value, textInformationFrame.value)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int c10 = e.c(this.f14731id, 527, 31);
        String str = this.description;
        int i11 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i12 = (c10 + i10) * 31;
        String str2 = this.value;
        if (str2 != null) {
            i11 = str2.hashCode();
        }
        return i12 + i11;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        return this.f14731id + ": value=" + this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f14731id);
        parcel.writeString(this.description);
        parcel.writeString(this.value);
    }

    public TextInformationFrame(Parcel parcel) {
        super(parcel.readString());
        this.description = parcel.readString();
        this.value = parcel.readString();
    }
}
