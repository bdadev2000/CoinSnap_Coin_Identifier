package com.mbridge.msdk.foundation.same.report;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class BatchReportMessage implements Parcelable {
    public static final Parcelable.Creator<BatchReportMessage> CREATOR = new Parcelable.Creator<BatchReportMessage>() { // from class: com.mbridge.msdk.foundation.same.report.BatchReportMessage.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BatchReportMessage createFromParcel(Parcel parcel) {
            return new BatchReportMessage(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ BatchReportMessage[] newArray(int i9) {
            return new BatchReportMessage[i9];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f15867a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private String f15868c;

    public BatchReportMessage(String str, String str2, long j7) {
        this.f15868c = str;
        this.f15867a = str2;
        this.b = j7;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getReportMessage() {
        return this.f15867a;
    }

    public long getTimestamp() {
        return this.b;
    }

    public String getUuid() {
        return this.f15868c;
    }

    public void setReportMessage(String str) {
        this.f15867a = str;
    }

    public void setTimestamp(long j7) {
        this.b = j7;
    }

    public void setUuid(String str) {
        this.f15868c = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeString(this.f15868c);
        parcel.writeString(this.f15867a);
        parcel.writeLong(this.b);
    }

    public BatchReportMessage(Parcel parcel) {
        this.f15868c = parcel.readString();
        this.f15867a = parcel.readString();
        this.b = parcel.readLong();
    }
}
