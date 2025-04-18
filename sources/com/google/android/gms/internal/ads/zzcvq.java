package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzcvq {
    private final zzfjr zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhfr zzg;
    private final String zzh;
    private final zzewc zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzffo zzk;
    private final zzdbx zzl;

    public zzcvq(zzfjr zzfjrVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzhfr zzhfrVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzewc zzewcVar, zzffo zzffoVar, zzdbx zzdbxVar) {
        this.zza = zzfjrVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhfrVar;
        this.zzh = str2;
        this.zzi = zzewcVar;
        this.zzj = zzgVar;
        this.zzk = zzffoVar;
        this.zzl = zzdbxVar;
    }

    public final /* synthetic */ zzbvx zza(ua.b bVar, Bundle bundle) throws Exception {
        boolean z10;
        Bundle bundle2 = (Bundle) bVar.get();
        String str = (String) ((ua.b) this.zzg.zzb()).get();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgS)).booleanValue() && this.zzj.zzN()) {
            z10 = true;
        } else {
            z10 = false;
        }
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbvx(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z10, this.zzk.zzb(), bundle);
    }

    public final ua.b zzb(Bundle bundle) {
        this.zzl.zza();
        return zzfjb.zzc(this.zzi.zza(new Bundle(), bundle), zzfjl.SIGNALS, this.zza).zza();
    }

    public final ua.b zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzci)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final ua.b zzb = zzb(bundle);
        return this.zza.zza(zzfjl.REQUEST_PARCEL, zzb, (ua.b) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcvp
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcvq.this.zza(zzb, bundle);
            }
        }).zza();
    }
}
