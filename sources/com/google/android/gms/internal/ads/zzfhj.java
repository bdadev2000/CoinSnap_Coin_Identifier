package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes3.dex */
public final class zzfhj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfhj> CREATOR = new zzfhk();
    public final Context zza;
    public final zzfhg zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfhg[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfhj(@SafeParcelable.Param(id = 1) int i10, @SafeParcelable.Param(id = 2) int i11, @SafeParcelable.Param(id = 3) int i12, @SafeParcelable.Param(id = 4) int i13, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i14, @SafeParcelable.Param(id = 7) int i15) {
        zzfhg[] values = zzfhg.values();
        this.zzh = values;
        int[] zza = zzfhh.zza();
        this.zzl = zza;
        int[] zza2 = zzfhi.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i10;
        this.zzb = values[i10];
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = str;
        this.zzj = i14;
        this.zzg = zza[i14];
        this.zzk = i15;
        int i16 = zza2[i15];
    }

    public static zzfhj zza(zzfhg zzfhgVar, Context context) {
        if (zzfhgVar == zzfhg.Rewarded) {
            return new zzfhj(context, zzfhgVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgj)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgp)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgr)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgt), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgl), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgn));
        }
        if (zzfhgVar == zzfhg.Interstitial) {
            return new zzfhj(context, zzfhgVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgk)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgq)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgs)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgu), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgm), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgo));
        }
        if (zzfhgVar == zzfhg.AppOpen) {
            return new zzfhj(context, zzfhgVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgx)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgz)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgA)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgv), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgw), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgy));
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i11);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfhj(Context context, zzfhg zzfhgVar, int i10, int i11, int i12, String str, String str2, String str3) {
        int i13;
        this.zzh = zzfhg.values();
        this.zzl = zzfhh.zza();
        this.zzm = zzfhi.zza();
        this.zza = context;
        this.zzi = zzfhgVar.ordinal();
        this.zzb = zzfhgVar;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = i12;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i13 = 1;
        } else {
            i13 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i13;
        this.zzj = i13 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
