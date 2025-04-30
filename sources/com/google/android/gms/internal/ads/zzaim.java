package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;

/* loaded from: classes2.dex */
public final class zzaim implements zzcc {
    public static final Parcelable.Creator<zzaim> CREATOR = new zzaik();
    public final float zza;
    public final int zzb;

    public zzaim(float f9, int i9) {
        this.zza = f9;
        this.zzb = i9;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaim.class == obj.getClass()) {
            zzaim zzaimVar = (zzaim) obj;
            if (this.zza == zzaimVar.zza && this.zzb == zzaimVar.zzb) {
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
    public final void writeToParcel(Parcel parcel, int i9) {
        parcel.writeFloat(this.zza);
        parcel.writeInt(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzcc
    public final /* synthetic */ void zza(zzby zzbyVar) {
    }

    public /* synthetic */ zzaim(Parcel parcel, zzail zzailVar) {
        this.zza = parcel.readFloat();
        this.zzb = parcel.readInt();
    }
}
