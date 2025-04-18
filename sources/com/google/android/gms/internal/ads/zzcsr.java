package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import androidx.annotation.Nullable;
import androidx.collection.SimpleArrayMap;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class zzcsr implements zzczo, zzcyu {
    private final Context zza;

    @Nullable
    private final zzcfo zzb;
    private final zzfgh zzc;
    private final VersionInfoParcel zzd;

    @Nullable
    private zzegf zze;
    private boolean zzf;
    private final zzegd zzg;

    public zzcsr(Context context, @Nullable zzcfo zzcfoVar, zzfgh zzfghVar, VersionInfoParcel versionInfoParcel, zzegd zzegdVar) {
        this.zza = context;
        this.zzb = zzcfoVar;
        this.zzc = zzfghVar;
        this.zzd = versionInfoParcel;
        this.zzg = zzegdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
    private final synchronized void zza() {
        zzegc zzegcVar;
        zzegb zzegbVar;
        try {
            if (this.zzc.zzT && this.zzb != null) {
                if (com.google.android.gms.ads.internal.zzu.zzA().zzl(this.zza)) {
                    VersionInfoParcel versionInfoParcel = this.zzd;
                    String str = versionInfoParcel.buddyApkVersion + "." + versionInfoParcel.clientJarVersion;
                    zzfhf zzfhfVar = this.zzc.zzV;
                    String zza = zzfhfVar.zza();
                    if (zzfhfVar.zzc() == 1) {
                        zzegbVar = zzegb.VIDEO;
                        zzegcVar = zzegc.DEFINED_BY_JAVASCRIPT;
                    } else {
                        zzfgh zzfghVar = this.zzc;
                        zzegb zzegbVar2 = zzegb.HTML_DISPLAY;
                        zzegcVar = zzfghVar.zze == 1 ? zzegc.ONE_PIXEL : zzegc.BEGIN_TO_RENDER;
                        zzegbVar = zzegbVar2;
                    }
                    this.zze = com.google.android.gms.ads.internal.zzu.zzA().zza(str, this.zzb.zzG(), "", "javascript", zza, zzegcVar, zzegbVar, this.zzc.zzal);
                    View zzF = this.zzb.zzF();
                    zzegf zzegfVar = this.zze;
                    if (zzegfVar != null) {
                        zzfoi zza2 = zzegfVar.zza();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeW)).booleanValue()) {
                            com.google.android.gms.ads.internal.zzu.zzA().zzj(zza2, this.zzb.zzG());
                            Iterator it = this.zzb.zzV().iterator();
                            while (it.hasNext()) {
                                com.google.android.gms.ads.internal.zzu.zzA().zzg(zza2, (View) it.next());
                            }
                        } else {
                            com.google.android.gms.ads.internal.zzu.zzA().zzj(zza2, zzF);
                        }
                        this.zzb.zzat(this.zze);
                        com.google.android.gms.ads.internal.zzu.zzA().zzk(zza2);
                        this.zzf = true;
                        this.zzb.zzd("onSdkLoaded", new SimpleArrayMap());
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private final boolean zzb() {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeX)).booleanValue() && this.zzg.zzd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.Map, androidx.collection.SimpleArrayMap] */
    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzr() {
        zzcfo zzcfoVar;
        if (zzb()) {
            this.zzg.zzb();
            return;
        }
        if (!this.zzf) {
            zza();
        }
        if (!this.zzc.zzT || this.zze == null || (zzcfoVar = this.zzb) == 0) {
            return;
        }
        zzcfoVar.zzd("onSdkImpression", new SimpleArrayMap());
    }

    @Override // com.google.android.gms.internal.ads.zzczo
    public final synchronized void zzs() {
        if (zzb()) {
            this.zzg.zzc();
        } else {
            if (this.zzf) {
                return;
            }
            zza();
        }
    }
}
