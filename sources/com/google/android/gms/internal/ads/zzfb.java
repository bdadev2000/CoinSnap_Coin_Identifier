package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.FloatRange;
import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public final class zzfb implements zzbj {
    public static final Parcelable.Creator<zzfb> CREATOR = new zzez();
    public final float zza;
    public final float zzb;

    public zzfb(@FloatRange float f2, @FloatRange float f3) {
        boolean z2 = false;
        if (f2 >= -90.0f && f2 <= 90.0f && f3 >= -180.0f && f3 <= 180.0f) {
            z2 = true;
        }
        zzdi.zze(z2, "Invalid latitude or longitude");
        this.zza = f2;
        this.zzb = f3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfb.class == obj.getClass()) {
            zzfb zzfbVar = (zzfb) obj;
            if (this.zza == zzfbVar.zza && this.zzb == zzfbVar.zzb) {
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
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.zza);
        parcel.writeFloat(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }

    public /* synthetic */ zzfb(Parcel parcel, zzfa zzfaVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readFloat();
    }
}
