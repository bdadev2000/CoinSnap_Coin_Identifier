package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdpt {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdud zzd;
    private final Executor zze;
    private final zzavn zzf;
    private final VersionInfoParcel zzg;
    private final zzeey zzi;
    private final zzfng zzj;
    private final zzefj zzk;
    private final zzfhg zzl;
    private ListenableFuture zzm;
    private final zzdpg zza = new zzdpg();
    private final zzbkm zzh = new zzbkm();

    public zzdpt(zzdpq zzdpqVar) {
        this.zzc = zzdpq.zza(zzdpqVar);
        this.zze = zzdpq.zzj(zzdpqVar);
        this.zzf = zzdpq.zzb(zzdpqVar);
        this.zzg = zzdpq.zzd(zzdpqVar);
        this.zzb = zzdpq.zzc(zzdpqVar);
        this.zzi = zzdpq.zzf(zzdpqVar);
        this.zzj = zzdpq.zzi(zzdpqVar);
        this.zzd = zzdpq.zze(zzdpqVar);
        this.zzk = zzdpq.zzg(zzdpqVar);
        this.zzl = zzdpq.zzh(zzdpqVar);
    }

    public final /* synthetic */ zzcfo zza(zzcfo zzcfoVar) {
        zzcfoVar.zzag("/result", this.zzh);
        zzchg zzN = zzcfoVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzeey zzeeyVar = this.zzi;
        zzfng zzfngVar = this.zzj;
        zzdud zzdudVar = this.zzd;
        zzdpg zzdpgVar = this.zza;
        zzN.zzS(null, zzdpgVar, zzdpgVar, zzdpgVar, zzdpgVar, false, null, zzbVar, null, null, zzeeyVar, zzfngVar, zzdudVar, null, null, null, null, null, null);
        return zzcfoVar;
    }

    public final /* synthetic */ ListenableFuture zzf(String str, JSONObject jSONObject, zzcfo zzcfoVar) throws Exception {
        return this.zzh.zzb(zzcfoVar, str, jSONObject);
    }

    public final synchronized ListenableFuture zzg(final String str, final JSONObject jSONObject) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return zzgfo.zzh(null);
        }
        return zzgfo.zzn(listenableFuture, new zzgev() { // from class: com.google.android.gms.internal.ads.zzdph
            @Override // com.google.android.gms.internal.ads.zzgev
            public final ListenableFuture zza(Object obj) {
                return zzdpt.this.zzf(str, jSONObject, (zzcfo) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfgh zzfghVar, zzfgk zzfgkVar, zzcop zzcopVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgfo.zzr(listenableFuture, new zzdpn(this, zzfghVar, zzfgkVar, zzcopVar), this.zze);
    }

    public final synchronized void zzi() {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgfo.zzr(listenableFuture, new zzdpj(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgfo.zzr(listenableFuture, new zzdpm(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdI);
        final Context context = this.zzc;
        final zzavn zzavnVar = this.zzf;
        final VersionInfoParcel versionInfoParcel = this.zzg;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzefj zzefjVar = this.zzk;
        final zzfhg zzfhgVar = this.zzl;
        ListenableFuture zzm = zzgfo.zzm(zzgfo.zzk(new zzgeu() { // from class: com.google.android.gms.internal.ads.zzcfz
            @Override // com.google.android.gms.internal.ads.zzgeu
            public final ListenableFuture zza() {
                com.google.android.gms.ads.internal.zzu.zzz();
                Context context2 = context;
                zzchi zza = zzchi.zza();
                zzavn zzavnVar2 = zzavnVar;
                zzefj zzefjVar2 = zzefjVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcfo zza2 = zzcgb.zza(context2, zza, "", false, false, zzavnVar2, null, versionInfoParcel, null, null, zzaVar2, zzbbu.zza(), null, null, zzefjVar2, zzfhgVar);
                final zzcar zza3 = zzcar.zza(zza2);
                zza2.zzN().zzB(new zzche() { // from class: com.google.android.gms.internal.ads.zzcfy
                    @Override // com.google.android.gms.internal.ads.zzche
                    public final void zza(boolean z2, int i2, String str2, String str3) {
                        zzcar.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzcan.zze), new zzfxq() { // from class: com.google.android.gms.internal.ads.zzdpi
            @Override // com.google.android.gms.internal.ads.zzfxq
            public final Object apply(Object obj) {
                zzcfo zzcfoVar = (zzcfo) obj;
                zzdpt.this.zza(zzcfoVar);
                return zzcfoVar;
            }
        }, this.zze);
        this.zzm = zzm;
        zzcaq.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbjw zzbjwVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgfo.zzr(listenableFuture, new zzdpk(this, str, zzbjwVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbjw zzbjwVar) {
        zzl(str, new zzdps(this, weakReference, str, zzbjwVar, null));
    }

    public final synchronized void zzn(String str, zzbjw zzbjwVar) {
        ListenableFuture listenableFuture = this.zzm;
        if (listenableFuture == null) {
            return;
        }
        zzgfo.zzr(listenableFuture, new zzdpl(this, str, zzbjwVar), this.zze);
    }
}
