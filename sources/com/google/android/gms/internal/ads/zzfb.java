package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzfb implements zzbc {
    public static final Parcelable.Creator<zzfb> CREATOR = new zzez();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzfb(long j3, long j10, long j11) {
        this.zza = j3;
        this.zzb = j10;
        this.zzc = j11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfb)) {
            return false;
        }
        zzfb zzfbVar = (zzfb) obj;
        if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb && this.zzc == zzfbVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.zza;
        int i10 = (int) (j3 ^ (j3 >>> 32));
        long j10 = this.zzc;
        long j11 = this.zzb;
        return ((((i10 + 527) * 31) + ((int) ((j11 >>> 32) ^ j11))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }

    public /* synthetic */ zzfb(Parcel parcel, zzfa zzfaVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }
}
