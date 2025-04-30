package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaha implements zzcc {
    public static final Parcelable.Creator<zzaha> CREATOR = new zzagz();
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzaha(int i9, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z8, int i10) {
        boolean z9 = true;
        if (i10 != -1 && i10 <= 0) {
            z9 = false;
        }
        zzeq.zzd(z9);
        this.zza = i9;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z8;
        this.zzf = i10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaha.class == obj.getClass()) {
            zzaha zzahaVar = (zzaha) obj;
            if (this.zza == zzahaVar.zza && zzgd.zzG(this.zzb, zzahaVar.zzb) && zzgd.zzG(this.zzc, zzahaVar.zzc) && zzgd.zzG(this.zzd, zzahaVar.zzd) && this.zze == zzahaVar.zze && this.zzf == zzahaVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i9;
        int i10;
        String str = this.zzb;
        int i11 = 0;
        if (str != null) {
            i9 = str.hashCode();
        } else {
            i9 = 0;
        }
        int i12 = this.zza;
        String str2 = this.zzc;
        if (str2 != null) {
            i10 = str2.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = ((i12 + 527) * 31) + i9;
        String str3 = this.zzd;
        if (str3 != null) {
            i11 = str3.hashCode();
        }
        return (((((((i13 * 31) + i10) * 31) + i11) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i10 = zzgd.zza;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final void zza(zzby zzbyVar) {
        String str = this.zzc;
        if (str != null) {
            zzbyVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzbyVar.zzi(str2);
        }
    }

    public zzaha(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i9 = zzgd.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
