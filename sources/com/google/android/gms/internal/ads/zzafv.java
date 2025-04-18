package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzafv implements zzbc {
    public static final Parcelable.Creator<zzafv> CREATOR = new zzafu();
    public final int zza;

    @Nullable
    public final String zzb;

    @Nullable
    public final String zzc;

    @Nullable
    public final String zzd;
    public final boolean zze;
    public final int zzf;

    public zzafv(int i10, @Nullable String str, @Nullable String str2, @Nullable String str3, boolean z10, int i11) {
        boolean z11 = true;
        if (i11 != -1 && i11 <= 0) {
            z11 = false;
        }
        zzdb.zzd(z11);
        this.zza = i10;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = z10;
        this.zzf = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzafv.class == obj.getClass()) {
            zzafv zzafvVar = (zzafv) obj;
            if (this.zza == zzafvVar.zza && Objects.equals(this.zzb, zzafvVar.zzb) && Objects.equals(this.zzc, zzafvVar.zzc) && Objects.equals(this.zzd, zzafvVar.zzd) && this.zze == zzafvVar.zze && this.zzf == zzafvVar.zzf) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        String str = this.zzb;
        int i12 = 0;
        if (str != null) {
            i10 = str.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = this.zza;
        String str2 = this.zzc;
        if (str2 != null) {
            i11 = str2.hashCode();
        } else {
            i11 = 0;
        }
        int i14 = ((i13 + 527) * 31) + i10;
        String str3 = this.zzd;
        if (str3 != null) {
            i12 = str3.hashCode();
        }
        return (((((((i14 * 31) + i11) * 31) + i12) * 31) + (this.zze ? 1 : 0)) * 31) + this.zzf;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.zzc + "\", genre=\"" + this.zzb + "\", bitrate=" + this.zza + ", metadataInterval=" + this.zzf;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        int i11 = zzen.zza;
        parcel.writeInt(this.zze ? 1 : 0);
        parcel.writeInt(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final void zza(zzay zzayVar) {
        String str = this.zzc;
        if (str != null) {
            zzayVar.zzp(str);
        }
        String str2 = this.zzb;
        if (str2 != null) {
            zzayVar.zzi(str2);
        }
    }

    public zzafv(Parcel parcel) {
        this.zza = parcel.readInt();
        this.zzb = parcel.readString();
        this.zzc = parcel.readString();
        this.zzd = parcel.readString();
        int i10 = zzen.zza;
        this.zze = parcel.readInt() != 0;
        this.zzf = parcel.readInt();
    }
}
