package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Class(creator = "PoolConfigurationCreator")
/* loaded from: classes4.dex */
public final class zzfix extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfix> CREATOR = new zzfiy();
    public final Context zza;
    public final zzfiu zzb;

    @SafeParcelable.Field(id = 2)
    public final int zzc;

    @SafeParcelable.Field(id = 3)
    public final int zzd;

    @SafeParcelable.Field(id = 4)
    public final int zze;

    @SafeParcelable.Field(id = 5)
    public final String zzf;
    public final int zzg;
    private final zzfiu[] zzh;

    @SafeParcelable.Field(getter = "getFormatInt", id = 1)
    private final int zzi;

    @SafeParcelable.Field(getter = "getPoolDiscardStrategyInt", id = 6)
    private final int zzj;

    @SafeParcelable.Field(getter = "getPrecacheStartTriggerInt", id = 7)
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    @SafeParcelable.Constructor
    public zzfix(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) int i3, @SafeParcelable.Param(id = 3) int i4, @SafeParcelable.Param(id = 4) int i5, @SafeParcelable.Param(id = 5) String str, @SafeParcelable.Param(id = 6) int i6, @SafeParcelable.Param(id = 7) int i7) {
        zzfiu[] values = zzfiu.values();
        this.zzh = values;
        int[] zza = zzfiv.zza();
        this.zzl = zza;
        int[] zza2 = zzfiw.zza();
        this.zzm = zza2;
        this.zza = null;
        this.zzi = i2;
        this.zzb = values[i2];
        this.zzc = i3;
        this.zzd = i4;
        this.zze = i5;
        this.zzf = str;
        this.zzj = i6;
        this.zzg = zza[i6];
        this.zzk = i7;
        int i8 = zza2[i7];
    }

    public static zzfix zza(zzfiu zzfiuVar, Context context) {
        if (zzfiuVar == zzfiu.Rewarded) {
            return new zzfix(context, zzfiuVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzge)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgk)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgm)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgo), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgg), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgi));
        }
        if (zzfiuVar == zzfiu.Interstitial) {
            return new zzfix(context, zzfiuVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgf)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgl)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgn)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgp), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgh), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgj));
        }
        if (zzfiuVar != zzfiu.AppOpen) {
            return null;
        }
        return new zzfix(context, zzfiuVar, ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgs)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgu)).intValue(), ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgv)).intValue(), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgq), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgr), (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgt));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i3 = this.zzi;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, i3);
        SafeParcelWriter.writeInt(parcel, 2, this.zzc);
        SafeParcelWriter.writeInt(parcel, 3, this.zzd);
        SafeParcelWriter.writeInt(parcel, 4, this.zze);
        SafeParcelWriter.writeString(parcel, 5, this.zzf, false);
        SafeParcelWriter.writeInt(parcel, 6, this.zzj);
        SafeParcelWriter.writeInt(parcel, 7, this.zzk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    private zzfix(Context context, zzfiu zzfiuVar, int i2, int i3, int i4, String str, String str2, String str3) {
        int i5;
        this.zzh = zzfiu.values();
        this.zzl = zzfiv.zza();
        this.zzm = zzfiw.zza();
        this.zza = context;
        this.zzi = zzfiuVar.ordinal();
        this.zzb = zzfiuVar;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = str;
        if ("oldest".equals(str2)) {
            i5 = 1;
        } else {
            i5 = (!"lru".equals(str2) && "lfu".equals(str2)) ? 3 : 2;
        }
        this.zzg = i5;
        this.zzj = i5 - 1;
        "onAdClosed".equals(str3);
        this.zzk = 0;
    }
}
