package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i10) {
            return new BatchReportMessage[i10];
        }
    };
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private long f13432b;

    /* renamed from: c, reason: collision with root package name */
    private String f13433c;

    public BatchReportMessage(String str, String str2, long j3) {
        this.f13433c = str;
        this.a = str2;
        this.f13432b = j3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.a;
    }

    public long getTimestamp() {
        return this.f13432b;
    }

    public String getUuid() {
        return this.f13433c;
    }

    public void setReportMessage(String str) {
        this.a = str;
    }

    public void setTimestamp(long j3) {
        this.f13432b = j3;
    }

    public void setUuid(String str) {
        this.f13433c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f13433c);
        parcel.writeString(this.a);
        parcel.writeLong(this.f13432b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f13433c = parcel.readString();
        this.a = parcel.readString();
        this.f13432b = parcel.readLong();
    }
}
