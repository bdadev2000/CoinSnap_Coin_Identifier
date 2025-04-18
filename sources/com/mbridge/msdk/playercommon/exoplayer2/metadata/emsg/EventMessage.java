package com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.metadata.Metadata;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class EventMessage implements Metadata.Entry {
    public static final Parcelable.Creator<EventMessage> CREATOR = new Parcelable.Creator<EventMessage>() { // from class: com.mbridge.msdk.playercommon.exoplayer2.metadata.emsg.EventMessage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMessage createFromParcel(Parcel parcel) {
            return new EventMessage(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public EventMessage[] newArray(int i10) {
            return new EventMessage[i10];
        }
    };
    public final long durationMs;
    private int hashCode;

    /* renamed from: id, reason: collision with root package name */
    public final long f14730id;
    public final byte[] messageData;
    public final long presentationTimeUs;
    public final String schemeIdUri;
    public final String value;

    public EventMessage(String str, String str2, long j3, long j10, byte[] bArr, long j11) {
        this.schemeIdUri = str;
        this.value = str2;
        this.durationMs = j3;
        this.f14730id = j10;
        this.messageData = bArr;
        this.presentationTimeUs = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || EventMessage.class != obj.getClass()) {
            return false;
        }
        EventMessage eventMessage = (EventMessage) obj;
        if (this.presentationTimeUs == eventMessage.presentationTimeUs && this.durationMs == eventMessage.durationMs && this.f14730id == eventMessage.f14730id && Util.areEqual(this.schemeIdUri, eventMessage.schemeIdUri) && Util.areEqual(this.value, eventMessage.value) && Arrays.equals(this.messageData, eventMessage.messageData)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        if (this.hashCode == 0) {
            String str = this.schemeIdUri;
            int i11 = 0;
            if (str != null) {
                i10 = str.hashCode();
            } else {
                i10 = 0;
            }
            int i12 = (527 + i10) * 31;
            String str2 = this.value;
            if (str2 != null) {
                i11 = str2.hashCode();
            }
            long j3 = this.presentationTimeUs;
            int i13 = (((i12 + i11) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j10 = this.durationMs;
            int i14 = (i13 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f14730id;
            this.hashCode = Arrays.hashCode(this.messageData) + ((i14 + ((int) (j11 ^ (j11 >>> 32)))) * 31);
        }
        return this.hashCode;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.schemeIdUri + ", id=" + this.f14730id + ", value=" + this.value;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.schemeIdUri);
        parcel.writeString(this.value);
        parcel.writeLong(this.presentationTimeUs);
        parcel.writeLong(this.durationMs);
        parcel.writeLong(this.f14730id);
        parcel.writeByteArray(this.messageData);
    }

    public EventMessage(Parcel parcel) {
        this.schemeIdUri = parcel.readString();
        this.value = parcel.readString();
        this.presentationTimeUs = parcel.readLong();
        this.durationMs = parcel.readLong();
        this.f14730id = parcel.readLong();
        this.messageData = parcel.createByteArray();
    }
}
