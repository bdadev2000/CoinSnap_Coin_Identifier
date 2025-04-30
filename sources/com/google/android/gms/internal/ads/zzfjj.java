package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes2.dex */
public final class zzfjj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfjj> CREATOR = new zzfjk();
    public final Context zza;
    public final zzfjg zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfjg[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfjj(@SafeParcelable.Param(id = 1) int i9, @SafeParcelable.Param(id = 2) int i10, @SafeParcelable.Param(id = 3) int i11, @SafeParcelable.Param(id = 4) int i12, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i13, @SafeParcelable.Param(id = 7) int i14) {
        zzfjg[] values = zzfjg.values();
        this.zzh = values;
        int[] zza = zzfjh.zza();
        this.zzl = zza;
        int[] zza2 = zzfji.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i9;
        this.zzb = values[i9];
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        this.zzj = i13;
        this.zzg = zza[i13];
        this.zzk = i14;
        int i15 = zza2[i14];
    }

    public static zzfjj zza(zzfjg zzfjgVar, Context context) {
        if (zzfjgVar == zzfjg.Rewarded) {
            return new zzfjj(context, zzfjgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgC)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgI)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgK)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgM), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgE), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgG));
        }
        if (zzfjgVar == zzfjg.Interstitial) {
            return new zzfjj(context, zzfjgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgD)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgJ)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgL)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgN), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgF), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgH));
        }
        if (zzfjgVar == zzfjg.AppOpen) {
            return new zzfjj(context, zzfjgVar, ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgQ)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgS)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgT)).intValue(), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgO), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgP), (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgR));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i9) {
        int i10 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i10);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfjj(Context context, zzfjg zzfjgVar, int i9, int i10, int i11, String str, String str2, String str3) {
        int i12;
        this.zzh = zzfjg.values();
        this.zzl = zzfjh.zza();
        this.zzm = zzfji.zza();
        this.zza = context;
        this.zzi = zzfjgVar.ordinal();
        this.zzb = zzfjgVar;
        this.zzc = i9;
        this.zzd = i10;
        this.zze = i11;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i12 = 1;
        } else {
            i12 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i12;
        this.zzj = i12 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
