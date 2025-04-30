package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class zzexl implements zzexw {
    private final zzgge zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;

    @Nullable
    private final String zzd;

    public zzexl(zzgge zzggeVar, Context context, VersionInfoParcel versionInfoParcel, @Nullable String str) {
        this.zza = zzggeVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzexw
    public final f4.c zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzexk
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzexl.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzexm zzc() throws Exception {
        int i9;
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zzE = com.google.android.gms.ads.internal.util.zzt.zzE(this.zzb);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzu.zzp();
        boolean zzF = com.google.android.gms.ads.internal.util.zzt.zzF();
        com.google.android.gms.ads.internal.zzu.zzp();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i9 = 0;
        } else {
            i9 = applicationInfo.targetSdkVersion;
        }
        int i10 = i9;
        Context context = this.zzb;
        return new zzexm(isCallerInstantApp, zzE, str, zzF, i10, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
