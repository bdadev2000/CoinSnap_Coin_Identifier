package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzahj implements zzbj {
    public static final Parcelable.Creator<zzahj> CREATOR = new zzahh();
    public final long zza;
    public final long zzb;
    public final long zzc;
    public final long zzd;
    public final long zze;

    public zzahj(long j2, long j3, long j4, long j5, long j6) {
        this.zza = j2;
        this.zzb = j3;
        this.zzc = j4;
        this.zzd = j5;
        this.zze = j6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahj.class == obj.getClass()) {
            zzahj zzahjVar = (zzahj) obj;
            if (this.zza == zzahjVar.zza && this.zzb == zzahjVar.zzb && this.zzc == zzahjVar.zzc && this.zzd == zzahjVar.zzd && this.zze == zzahjVar.zze) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.zza;
        int i2 = (int) (j2 ^ (j2 >>> 32));
        long j3 = this.zze;
        long j4 = this.zzd;
        long j5 = this.zzc;
        long j6 = this.zzb;
        return ((((((((i2 + 527) * 31) + ((int) ((j6 >>> 32) ^ j6))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)));
    }

    public final String toString() {
        return "Motion photo metadata: photoStartPosition=" + this.zza + ", photoSize=" + this.zzb + ", photoPresentationTimestampUs=" + this.zzc + ", videoStartPosition=" + this.zzd + ", videoSize=" + this.zze;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
        parcel.writeLong(this.zzd);
        parcel.writeLong(this.zze);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }

    public /* synthetic */ zzahj(Parcel parcel, zzahi zzahiVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
        this.zzd = parcel.readLong();
        this.zze = parcel.readLong();
    }
}
