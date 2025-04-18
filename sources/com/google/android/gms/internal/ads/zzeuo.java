package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* loaded from: classes3.dex */
public final class zzeuo implements zzevz, zzevy {
    private final ApplicationInfo zza;

    @Nullable
    private final PackageInfo zzb;
    private final Context zzc;
    private final zzdsh zzd;

    public zzeuo(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, Context context, zzdsh zzdshVar) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
        this.zzd = zzdshVar;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return zzgei.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzevy
    public final /* bridge */ /* synthetic */ void zzj(Object obj) {
        Integer valueOf;
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        String initiatingPackageName;
        Bundle bundle = (Bundle) obj;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        if (packageInfo == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (valueOf != null) {
            bundle.putInt("vc", valueOf.intValue());
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzco)).booleanValue()) {
                this.zzd.zzc("vc", valueOf.toString());
            }
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzco)).booleanValue()) {
                this.zzd.zzc("vn", str2);
            }
        }
        try {
            Context context = this.zzc;
            String str3 = this.zza.packageName;
            zzftd zzftdVar = com.google.android.gms.ads.internal.util.zzs.zza;
            bundle.putString("dl", String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmu)).booleanValue()) {
                try {
                    installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        if (!TextUtils.isEmpty(installingPackageName)) {
                            bundle.putString("ins_pn", installingPackageName);
                        } else {
                            com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                        }
                        initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                        if (!TextUtils.isEmpty(initiatingPackageName)) {
                            bundle.putString("ini_pn", initiatingPackageName);
                        } else {
                            com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                        }
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "PackageInfoSignalsource.compose");
                }
            }
        }
    }
}
