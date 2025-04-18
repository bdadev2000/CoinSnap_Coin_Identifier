package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.concurrent.Callable;

/* loaded from: classes3.dex */
public final class zzevo implements zzevz {
    private final zzges zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;

    @Nullable
    private final String zzd;

    public zzevo(zzges zzgesVar, Context context, VersionInfoParcel versionInfoParcel, @Nullable String str) {
        this.zza = zzgesVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final int zza() {
        return 35;
    }

    @Override // com.google.android.gms.internal.ads.zzevz
    public final ua.b zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzevn
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzevo.this.zzc();
            }
        });
    }

    public final /* synthetic */ zzevp zzc() throws Exception {
        int i10;
        boolean isCallerInstantApp = Wrappers.packageManager(this.zzb).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzE = com.google.android.gms.ads.internal.util.zzs.zzE(this.zzb);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzv.zzq();
        boolean zzF = com.google.android.gms.ads.internal.util.zzs.zzF();
        com.google.android.gms.ads.internal.zzv.zzq();
        ApplicationInfo applicationInfo = this.zzb.getApplicationInfo();
        if (applicationInfo == null) {
            i10 = 0;
        } else {
            i10 = applicationInfo.targetSdkVersion;
        }
        int i11 = i10;
        Context context = this.zzb;
        return new zzevp(isCallerInstantApp, zzE, str, zzF, i11, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
