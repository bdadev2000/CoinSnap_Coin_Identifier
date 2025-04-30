package com.mbridge.msdk.foundation.download;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class DownloadProgress implements Parcelable {
    public static final Parcelable.Creator<DownloadProgress> CREATOR = new Parcelable.Creator<DownloadProgress>() { // from class: com.mbridge.msdk.foundation.download.DownloadProgress.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadProgress createFromParcel(Parcel parcel) {
            return new DownloadProgress(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DownloadProgress[] newArray(int i9) {
            return new DownloadProgress[i9];
        }
    };
    private long current;
    private int currentDownloadRate;
    private long total;

    public DownloadProgress(long j7, long j9, int i9) {
        this.current = j7;
        this.total = j9;
        this.currentDownloadRate = i9;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getCurrent() {
        return this.current;
    }

    public int getCurrentDownloadRate() {
        return this.currentDownloadRate;
    }

    public long getTotal() {
        return this.total;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.current);
        parcel.writeLong(this.total);
        parcel.writeInt(this.currentDownloadRate);
    }

    public DownloadProgress(Parcel parcel) {
        this.current = parcel.readLong();
        this.total = parcel.readLong();
        this.currentDownloadRate = parcel.readInt();
    }
}
