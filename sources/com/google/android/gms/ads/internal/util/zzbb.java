package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfyv;

@SafeParcelable.Class(creator = "ExceptionParcelCreator")
/* loaded from: classes2.dex */
public final class zzbb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbb> CREATOR = new zzbc();

    @SafeParcelable.Field(id = 1)
    public final String zza;

    @SafeParcelable.Field(id = 2)
    public final int zzb;

    @SafeParcelable.Constructor
    public zzbb(@Nullable @SafeParcelable.Param(id = 1) String str, @SafeParcelable.Param(id = 2) int i9) {
        this.zza = str == null ? "" : str;
        this.zzb = i9;
    }

    public static zzbb zzb(Throwable th) {
        String message;
        com.google.android.gms.ads.internal.client.zze zza = zzfiq.zza(th);
        if (zzfyv.zzd(th.getMessage())) {
            message = zza.zzb;
        } else {
            message = th.getMessage();
        }
        return new zzbb(message, zza.zza);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        String str = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeInt(parcel, 2, this.zzb);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final zzba zza() {
        return new zzba(this.zza, this.zzb);
    }
}
