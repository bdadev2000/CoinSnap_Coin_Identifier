package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes.dex */
public final class zzahq implements zzbj {
    public static final Parcelable.Creator<zzahq> CREATOR = new zzaho();
    public final float zza;
    public final int zzb;

    public zzahq(float f2, int i2) {
        this.zza = f2;
        this.zzb = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzahq.class == obj.getClass()) {
            zzahq zzahqVar = (zzahq) obj;
            if (this.zza == zzahqVar.zza && this.zzb == zzahqVar.zzb) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.valueOf(this.zza).hashCode() + 527) * 31) + this.zzb;
    }

    public final String toString() {
        return "smta: captureFrameRate=" + this.zza + ", svcTemporalLayerCount=" + this.zzb;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzbj
    public final /* synthetic */ void zza(zzbf zzbfVar) {
    }

    public /* synthetic */ zzahq(Parcel parcel, zzahp zzahpVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }
}
