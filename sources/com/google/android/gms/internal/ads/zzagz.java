package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzagz implements zzbc {
    public static final Parcelable.Creator<zzagz> CREATOR = new zzagx();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzagz(long j3, long j10, long j11, long j12, long j13) {
        this.zza = j3;
        this.zzb = j10;
        this.zzc = j11;
        this.zzd = j12;
        this.zze = j13;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzagz.class == obj.getClass()) {
            zzagz zzagzVar = (zzagz) obj;
            if (this.zza == zzagzVar.zza && this.zzb == zzagzVar.zzb && this.zzc == zzagzVar.zzc && this.zzd == zzagzVar.zzd && this.zze == zzagzVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j3 = this.zza;
        int i10 = (int) (j3 ^ (j3 >>> 32));
        long j10 = this.zze;
        long j11 = this.zzd;
        long j12 = this.zzc;
        long j13 = this.zzb;
        return ((((((((i10 + 527) * 31) + ((int) ((j13 >>> 32) ^ j13))) * 31) + ((int) (j12 ^ (j12 >>> 32)))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }

    public /* synthetic */ zzagz(Parcel parcel, zzagy zzagyVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }
}
