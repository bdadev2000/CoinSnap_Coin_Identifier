package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcyp {
    private final zzflt zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhkj zzg;
    private final String zzh;
    private final zzexz zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfho zzk;
    private final zzdeu zzl;

    public zzcyp(zzflt zzfltVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzhkj zzhkjVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzexz zzexzVar, zzfho zzfhoVar, zzdeu zzdeuVar) {
        this.zza = zzfltVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhkjVar;
        this.zzh = str2;
        this.zzi = zzexzVar;
        this.zzj = zzgVar;
        this.zzk = zzfhoVar;
        this.zzl = zzdeuVar;
    }

    public final /* synthetic */ zzbxu zza(f4.c cVar, Bundle bundle) throws Exception {
        boolean z8;
        Bundle bundle2 = (Bundle) cVar.get();
        String str = (String) ((f4.c) this.zzg.zzb()).get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhq)).booleanValue() && this.zzj.zzS()) {
            z8 = true;
        } else {
            z8 = false;
        }
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbxu(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z8, this.zzk.zzb(), bundle);
    }

    public final f4.c zzb(Bundle bundle) {
        this.zzl.zza();
        return zzfld.zzc(this.zzi.zza(new Bundle(), bundle), zzfln.SIGNALS, this.zza).zza();
    }

    public final f4.c zzc() {
        Bundle bundle;
        final Bundle bundle2 = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcd)).booleanValue() && (bundle = this.zzk.zzs) != null) {
            bundle2.putAll(bundle);
        }
        final f4.c zzb = zzb(bundle2);
        return this.zza.zza(zzfln.REQUEST_PARCEL, zzb, (f4.c) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcyo
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcyp.this.zza(zzb, bundle2);
            }
        }).zza();
    }
}
