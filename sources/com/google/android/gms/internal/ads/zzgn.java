package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzgn implements zzcc {
    public static final Parcelable.Creator<zzgn> CREATOR = new zzgl();
    public final long zza;
    public final long zzb;
    public final long zzc;

    public zzgn(long j7, long j9, long j10) {
        this.zza = j7;
        this.zzb = j9;
        this.zzc = j10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzgn)) {
            return false;
        }
        zzgn zzgnVar = (zzgn) obj;
        if (this.zza == zzgnVar.zza && this.zzb == zzgnVar.zzb && this.zzc == zzgnVar.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j7 = this.zza;
        int i9 = (int) (j7 ^ (j7 >>> 32));
        long j9 = this.zzc;
        long j10 = this.zzb;
        return ((((i9 + 527) * 31) + ((int) ((j10 >>> 32) ^ j10))) * 31) + ((int) (j9 ^ (j9 >>> 32)));
    }

    public final String toString() {
        return "Mp4Timestamp: creation time=" + this.zza + ", modification time=" + this.zzb + ", timescale=" + this.zzc;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeLong(this.zza);
        parcel.writeLong(this.zzb);
        parcel.writeLong(this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final /* synthetic */ void zza(zzby zzbyVar) {
    }

    public /* synthetic */ zzgn(Parcel parcel, zzgm zzgmVar) {
        this.zza = parcel.readLong();
        this.zzb = parcel.readLong();
        this.zzc = parcel.readLong();
    }
}
