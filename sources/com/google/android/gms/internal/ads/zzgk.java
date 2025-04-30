package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzgk implements zzcc {
    public static final Parcelable.Creator<zzgk> CREATOR = new zzgi();
    public final float zza;
    public final float zzb;

    public zzgk(float f9, float f10) {
        boolean z8 = false;
        if (f9 >= -90.0f && f9 <= 90.0f && f10 >= -180.0f && f10 <= 180.0f) {
            z8 = true;
        }
        zzeq.zze(z8, "Invalid latitude or longitude");
        this.zza = f9;
        this.zzb = f10;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzgk.class == obj.getClass()) {
            zzgk zzgkVar = (zzgk) obj;
            if (this.zza == zzgkVar.zza && this.zzb == zzgkVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + Float.valueOf(this.zzb).hashCode();
    }

    public final String toString() {
        return "xyz: latitude=" + this.zza + ", longitude=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final /* synthetic */ void zza(zzby zzbyVar) {
    }

    public /* synthetic */ zzgk(Parcel parcel, zzgj zzgjVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
