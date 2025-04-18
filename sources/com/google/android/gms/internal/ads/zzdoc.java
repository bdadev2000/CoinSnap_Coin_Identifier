package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdoc {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdsm zzd;
    private final Executor zze;
    private final zzavc zzf;
    private final VersionInfoParcel zzg;
    private final zzedp zzi;
    private final zzflr zzj;
    private final zzeea zzk;
    private final zzffs zzl;
    private ua.b zzm;
    private final zzdnp zza = new zzdnp();
    private final zzbkh zzh = new zzbkh();

    public zzdoc(zzdnz zzdnzVar) {
        this.zzc = zzdnz.zza(zzdnzVar);
        this.zze = zzdnz.zzj(zzdnzVar);
        this.zzf = zzdnz.zzb(zzdnzVar);
        this.zzg = zzdnz.zzd(zzdnzVar);
        this.zzb = zzdnz.zzc(zzdnzVar);
        this.zzi = zzdnz.zzf(zzdnzVar);
        this.zzj = zzdnz.zzi(zzdnzVar);
        this.zzd = zzdnz.zze(zzdnzVar);
        this.zzk = zzdnz.zzg(zzdnzVar);
        this.zzl = zzdnz.zzh(zzdnzVar);
    }

    public final /* synthetic */ zzcfk zza(zzcfk zzcfkVar) {
        zzcfkVar.zzag("/result", this.zzh);
        zzchc zzN = zzcfkVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzedp zzedpVar = this.zzi;
        zzflr zzflrVar = this.zzj;
        zzdsm zzdsmVar = this.zzd;
        zzdnp zzdnpVar = this.zza;
        zzN.zzU(null, zzdnpVar, zzdnpVar, zzdnpVar, zzdnpVar, false, null, zzbVar, null, null, zzedpVar, zzflrVar, zzdsmVar, null, null, null, null, null, null);
        return zzcfkVar;
    }

    public final /* synthetic */ ua.b zzf(String str, JSONObject jSONObject, zzcfk zzcfkVar) throws Exception {
        return this.zzh.zzb(zzcfkVar, str, jSONObject);
    }

    public final synchronized ua.b zzg(final String str, final JSONObject jSONObject) {
        ua.b bVar = this.zzm;
        if (bVar == null) {
            return zzgei.zzh(null);
        }
        return zzgei.zzn(bVar, new zzgdp() { // from class: com.google.android.gms.internal.ads.zzdnq
            @Override // com.google.android.gms.internal.ads.zzgdp
            public final ua.b zza(Object obj) {
                return zzdoc.this.zzf(str, jSONObject, (zzcfk) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzh(zzfet zzfetVar, zzfew zzfewVar, zzcnb zzcnbVar) {
        ua.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgei.zzr(bVar, new zzdnw(this, zzfetVar, zzfewVar, zzcnbVar), this.zze);
    }

    public final synchronized void zzi() {
        ua.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgei.zzr(bVar, new zzdns(this), this.zze);
        this.zzm = null;
    }

    public final synchronized void zzj(String str, Map map) {
        ua.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgei.zzr(bVar, new zzdnv(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdP);
        final Context context = this.zzc;
        final zzavc zzavcVar = this.zzf;
        final VersionInfoParcel versionInfoParcel = this.zzg;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzeea zzeeaVar = this.zzk;
        final zzffs zzffsVar = this.zzl;
        ua.b zzm = zzgei.zzm(zzgei.zzk(new zzgdo() { // from class: com.google.android.gms.internal.ads.zzcfv
            @Override // com.google.android.gms.internal.ads.zzgdo
            public final ua.b zza() {
                com.google.android.gms.ads.internal.zzv.zzA();
                Context context2 = context;
                zzche zza = zzche.zza();
                zzavc zzavcVar2 = zzavcVar;
                zzeea zzeeaVar2 = zzeeaVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzcfk zza2 = zzcfx.zza(context2, zza, "", false, false, zzavcVar2, null, versionInfoParcel, null, null, zzaVar2, zzbbl.zza(), null, null, zzeeaVar2, zzffsVar);
                final zzcan zza3 = zzcan.zza(zza2);
                zza2.zzN().zzB(new zzcha() { // from class: com.google.android.gms.internal.ads.zzcfu
                    @Override // com.google.android.gms.internal.ads.zzcha
                    public final void zza(boolean z10, int i10, String str2, String str3) {
                        zzcan.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzcaj.zze), new zzfwh() { // from class: com.google.android.gms.internal.ads.zzdnr
            @Override // com.google.android.gms.internal.ads.zzfwh
            public final Object apply(Object obj) {
                zzcfk zzcfkVar = (zzcfk) obj;
                zzdoc.this.zza(zzcfkVar);
                return zzcfkVar;
            }
        }, this.zze);
        this.zzm = zzm;
        zzcam.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzbjr zzbjrVar) {
        ua.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgei.zzr(bVar, new zzdnt(this, str, zzbjrVar), this.zze);
    }

    public final void zzm(WeakReference weakReference, String str, zzbjr zzbjrVar) {
        zzl(str, new zzdoa(this, weakReference, str, zzbjrVar, null));
    }

    public final synchronized void zzn(String str, zzbjr zzbjrVar) {
        ua.b bVar = this.zzm;
        if (bVar == null) {
            return;
        }
        zzgei.zzr(bVar, new zzdnu(this, str, zzbjrVar), this.zze);
    }
}
