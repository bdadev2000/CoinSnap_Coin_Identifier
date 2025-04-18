package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.List;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzcxe {
    private final zzflg zza;
    private final VersionInfoParcel zzb;
    private final ApplicationInfo zzc;
    private final String zzd;
    private final List zze;
    private final PackageInfo zzf;
    private final zzhic zzg;
    private final String zzh;
    private final zzexk zzi;
    private final com.google.android.gms.ads.internal.util.zzg zzj;
    private final zzfhc zzk;
    private final zzddm zzl;

    public zzcxe(zzflg zzflgVar, VersionInfoParcel versionInfoParcel, ApplicationInfo applicationInfo, String str, List list, @Nullable PackageInfo packageInfo, zzhic zzhicVar, com.google.android.gms.ads.internal.util.zzg zzgVar, String str2, zzexk zzexkVar, zzfhc zzfhcVar, zzddm zzddmVar) {
        this.zza = zzflgVar;
        this.zzb = versionInfoParcel;
        this.zzc = applicationInfo;
        this.zzd = str;
        this.zze = list;
        this.zzf = packageInfo;
        this.zzg = zzhicVar;
        this.zzh = str2;
        this.zzi = zzexkVar;
        this.zzj = zzgVar;
        this.zzk = zzfhcVar;
        this.zzl = zzddmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ zzbwa zza(ListenableFuture listenableFuture, Bundle bundle) throws Exception {
        Bundle bundle2 = (Bundle) listenableFuture.get();
        String str = (String) ((ListenableFuture) this.zzg.zzb()).get();
        boolean z2 = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgQ)).booleanValue() && this.zzj.zzS();
        String str2 = this.zzh;
        PackageInfo packageInfo = this.zzf;
        List list = this.zze;
        return new zzbwa(bundle2, this.zzb, this.zzc, this.zzd, list, packageInfo, str, str2, null, null, z2, this.zzk.zzb(), bundle);
    }

    public final ListenableFuture zzb(Bundle bundle) {
        this.zzl.zza();
        return zzfkq.zzc(this.zzi.zza(new Bundle(), bundle), zzfla.SIGNALS, this.zza).zza();
    }

    public final ListenableFuture zzc() {
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcf)).booleanValue()) {
            Bundle bundle2 = this.zzk.zzs;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            bundle.putBoolean("ls", false);
        }
        final ListenableFuture zzb = zzb(bundle);
        return this.zza.zza(zzfla.REQUEST_PARCEL, zzb, (ListenableFuture) this.zzg.zzb()).zza(new Callable() { // from class: com.google.android.gms.internal.ads.zzcxd
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzcxe.this.zza(zzb, bundle);
            }
        }).zza();
    }
}
