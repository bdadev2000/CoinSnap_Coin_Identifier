package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzey implements zzbc {
    public static final Parcelable.Creator<zzey> CREATOR = new zzew();
    public final float zza;
    public final float zzb;

    public zzey(float f10, float f11) {
        boolean z10 = false;
        if (f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f) {
            z10 = true;
        }
        zzdb.zze(z10, "Invalid latitude or longitude");
        this.zza = f10;
        this.zzb = f11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzey.class == obj.getClass()) {
            zzey zzeyVar = (zzey) obj;
            if (this.zza == zzeyVar.zza && this.zzb == zzeyVar.zzb) {
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
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbc
    public final /* synthetic */ void zza(zzay zzayVar) {
    }

    public /* synthetic */ zzey(Parcel parcel, zzex zzexVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
