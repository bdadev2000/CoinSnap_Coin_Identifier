package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzfe implements zzbj {
    public static final Parcelable.Creator<zzfe> CREATOR = new zzfc();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfe(long j2, long j3, long j4) {
        this.zza = j2;
        this.zzb = j3;
        this.zzc = j4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfe)) {
            return false;
        }
        zzfe zzfeVar = (zzfe) obj;
        return this.zza == zzfeVar.zza && this.zzb == zzfeVar.zzb && this.zzc == zzfeVar.zzc;
    }

    public final int hashCode() {
        long j2 = this.zza;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.zzc;
        long j4 = this.zzb;
        return ((((i2 + 527) * 31) + ((int) ((j4 >>> 32) ^ j4))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }

    public /* synthetic */ zzfe(Parcel parcel, zzfd zzfdVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }
}
