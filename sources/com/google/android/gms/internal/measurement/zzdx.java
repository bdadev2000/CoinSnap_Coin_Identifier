package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.zzdy;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzdx extends zzdy.zza {
    private final /* synthetic */ String zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ Context zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ zzdy zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzdy zzdyVar, String str, String str2, Context context, Bundle bundle) {
        super(zzdyVar);
        this.zzc = str;
        this.zzd = str2;
        this.zze = context;
        this.zzf = bundle;
        this.zzg = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    public final void zza() {
        boolean zzc;
        String str;
        String str2;
        String str3;
        zzdj zzdjVar;
        boolean z10;
        zzdj zzdjVar2;
        String str4;
        String str5;
        try {
            zzc = this.zzg.zzc(this.zzc, this.zzd);
            if (zzc) {
                String str6 = this.zzd;
                String str7 = this.zzc;
                str5 = this.zzg.zzc;
                str3 = str6;
                str2 = str7;
                str = str5;
            } else {
                str = null;
                str2 = null;
                str3 = null;
            }
            Preconditions.checkNotNull(this.zze);
            zzdy zzdyVar = this.zzg;
            zzdyVar.zzj = zzdyVar.zza(this.zze, true);
            zzdjVar = this.zzg.zzj;
            if (zzdjVar == null) {
                str4 = this.zzg.zzc;
                Log.w(str4, "Failed to connect to measurement client.");
                return;
            }
            int localVersion = DynamiteModule.getLocalVersion(this.zze, ModuleDescriptor.MODULE_ID);
            int remoteVersion = DynamiteModule.getRemoteVersion(this.zze, ModuleDescriptor.MODULE_ID);
            int max = Math.max(localVersion, remoteVersion);
            if (remoteVersion < localVersion) {
                z10 = true;
            } else {
                z10 = false;
            }
            zzdw zzdwVar = new zzdw(106000L, max, z10, str, str2, str3, this.zzf, com.google.android.gms.measurement.internal.zzhs.zza(this.zze));
            zzdjVar2 = this.zzg.zzj;
            ((zzdj) Preconditions.checkNotNull(zzdjVar2)).initialize(ObjectWrapper.wrap(this.zze), zzdwVar, this.zza);
        } catch (Exception e2) {
            this.zzg.zza(e2, true, false);
        }
    }
}
