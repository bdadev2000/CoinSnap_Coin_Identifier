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

/* loaded from: classes2.dex */
public final class zzewf implements zzexw, zzexv {
    private final ApplicationInfo zza;

    @Nullable
    private final PackageInfo zzb;
    private final Context zzc;
    private final zzdux zzd;

    public zzewf(ApplicationInfo applicationInfo, @Nullable PackageInfo packageInfo, Context context, zzdux zzduxVar) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
        this.zzd = zzduxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 29;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return zzgft.zzh(this);
    }

    @Override // com.google.android.gms.internal.ads.zzexv
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
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcg)).booleanValue()) {
                this.zzd.zzc("vc", valueOf.toString());
            }
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcg)).booleanValue()) {
                this.zzd.zzc("vn", str2);
            }
        }
        try {
            Context context = this.zzc;
            String str3 = this.zza.packageName;
            zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
            bundle.putString("dl", String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str3)));
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzmI)).booleanValue()) {
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
                } catch (PackageManager.NameNotFoundException e4) {
                    com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "PackageInfoSignalsource.compose");
                }
            }
        }
    }
}
