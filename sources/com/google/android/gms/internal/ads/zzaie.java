package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaie implements zzcc {
    public static final Parcelable.Creator<zzaie> CREATOR = new zzaic();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzaie(long j7, long j9, long j10, long j11, long j12) {
        this.zza = j7;
        this.zzb = j9;
        this.zzc = j10;
        this.zzd = j11;
        this.zze = j12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaie.class == obj.getClass()) {
            zzaie zzaieVar = (zzaie) obj;
            if (this.zza == zzaieVar.zza && this.zzb == zzaieVar.zzb && this.zzc == zzaieVar.zzc && this.zzd == zzaieVar.zzd && this.zze == zzaieVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.zza;
        int i9 = (int) (j7 ^ (j7 >>> 32));
        long j9 = this.zze;
        long j10 = this.zzd;
        long j11 = this.zzc;
        long j12 = this.zzb;
        return ((((((((i9 + 527) * 31) + ((int) ((j12 >>> 32) ^ j12))) * 31) + ((int) (j11 ^ (j11 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final /* synthetic */ void zza(zzby zzbyVar) {
    }

    public /* synthetic */ zzaie(Parcel parcel, zzaid zzaidVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }
}
