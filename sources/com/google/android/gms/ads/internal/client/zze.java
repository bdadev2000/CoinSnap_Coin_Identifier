package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "AdErrorParcelCreator")
/* loaded from: classes2.dex */
public final class zze extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zze> CREATOR = new zzf();

    @SafeParcelable.Field(id = 1)
    public final int zza;

    @SafeParcelable.Field(id = 2)
    public final String zzb;

    @SafeParcelable.Field(id = 3)
    public final String zzc;

    @Nullable
    @SafeParcelable.Field(id = 4)
    public zze zzd;

    @Nullable
    @SafeParcelable.Field(id = 5, type = "android.os.IBinder")
    public IBinder zze;

    @SafeParcelable.Constructor
    public zze(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) String str, @SafeParcelable.Param(id = 3) String str2, @Nullable @SafeParcelable.Param(id = 4) zze zzeVar, @Nullable @SafeParcelable.Param(id = 5) IBinder iBinder) {
        this.zza = i9;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzeVar;
        this.zze = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.zza;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeString(parcel, 2, this.zzb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zzc, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zzd, i9, false);
        SafeParcelWriter.writeIBinder(parcel, 5, this.zze, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final AdError zza() {
        AdError adError;
        zze zzeVar = this.zzd;
        if (zzeVar == null) {
            adError = null;
        } else {
            String str = zzeVar.zzc;
            adError = new AdError(zzeVar.zza, zzeVar.zzb, str);
        }
        return new AdError(this.zza, this.zzb, this.zzc, adError);
    }

    public final LoadAdError zzb() {
        AdError adError;
        zze zzeVar = this.zzd;
        zzdn zzdnVar = null;
        if (zzeVar == null) {
            adError = null;
        } else {
            adError = new AdError(zzeVar.zza, zzeVar.zzb, zzeVar.zzc);
        }
        int i9 = this.zza;
        String str = this.zzb;
        String str2 = this.zzc;
        IBinder iBinder = this.zze;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            if (queryLocalInterface instanceof zzdn) {
                zzdnVar = (zzdn) queryLocalInterface;
            } else {
                zzdnVar = new zzdl(iBinder);
            }
        }
        return new LoadAdError(i9, str, str2, adError, ResponseInfo.zza(zzdnVar));
    }
}
