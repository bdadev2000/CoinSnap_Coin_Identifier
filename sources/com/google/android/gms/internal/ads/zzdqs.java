package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdqs {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final zzchq zzc;
    private final Context zzd;
    private final zzdvc zze;
    private final Executor zzf;
    private final zzaxd zzg;
    private final VersionInfoParcel zzh;
    private final zzefz zzj;
    private final zzfoe zzk;
    private final zzegk zzl;
    private final zzfhs zzm;
    private f4.c zzn;
    private final zzdqf zza = new zzdqf();
    private final zzbmf zzi = new zzbmf();

    public zzdqs(zzdqp zzdqpVar) {
        this.zzd = zzdqp.zza(zzdqpVar);
        this.zzf = zzdqp.zzk(zzdqpVar);
        this.zzg = zzdqp.zzb(zzdqpVar);
        this.zzh = zzdqp.zzd(zzdqpVar);
        this.zzb = zzdqp.zzc(zzdqpVar);
        this.zzc = zzdqp.zze(zzdqpVar);
        this.zzj = zzdqp.zzg(zzdqpVar);
        this.zzk = zzdqp.zzj(zzdqpVar);
        this.zze = zzdqp.zzf(zzdqpVar);
        this.zzl = zzdqp.zzh(zzdqpVar);
        this.zzm = zzdqp.zzi(zzdqpVar);
    }

    public final /* synthetic */ zzchd zza(zzchd zzchdVar) {
        zzchdVar.zzag("/result", this.zzi);
        zzciv zzN = zzchdVar.zzN();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzd, null, null);
        zzefz zzefzVar = this.zzj;
        zzfoe zzfoeVar = this.zzk;
        zzdvc zzdvcVar = this.zze;
        zzdqf zzdqfVar = this.zza;
        zzN.zzR(null, zzdqfVar, zzdqfVar, zzdqfVar, zzdqfVar, false, null, zzbVar, null, null, zzefzVar, zzfoeVar, zzdvcVar, null, null, null, null, null, null);
        return zzchdVar;
    }

    public final /* synthetic */ f4.c zzf(String str, JSONObject jSONObject, zzchd zzchdVar) throws Exception {
        return this.zzi.zzb(zzchdVar, str, jSONObject);
    }

    public final synchronized f4.c zzg(final String str, final JSONObject jSONObject) {
        f4.c cVar = this.zzn;
        if (cVar == null) {
            return zzgft.zzh(null);
        }
        return zzgft.zzn(cVar, new zzgfa() { // from class: com.google.android.gms.internal.ads.zzdqg
            @Override // com.google.android.gms.internal.ads.zzgfa
            public final f4.c zza(Object obj) {
                return zzdqs.this.zzf(str, jSONObject, (zzchd) obj);
            }
        }, this.zzf);
    }

    public final synchronized void zzh(zzfgt zzfgtVar, zzfgw zzfgwVar, zzcqd zzcqdVar) {
        f4.c cVar = this.zzn;
        if (cVar == null) {
            return;
        }
        zzgft.zzr(cVar, new zzdqm(this, zzfgtVar, zzfgwVar, zzcqdVar), this.zzf);
    }

    public final synchronized void zzi() {
        f4.c cVar = this.zzn;
        if (cVar == null) {
            return;
        }
        zzgft.zzr(cVar, new zzdqi(this), this.zzf);
        this.zzn = null;
    }

    public final synchronized void zzj(String str, Map map) {
        f4.c cVar = this.zzn;
        if (cVar == null) {
            return;
        }
        zzgft.zzr(cVar, new zzdql(this, "sendMessageToNativeJs", map), this.zzf);
    }

    public final synchronized void zzk() {
        final String str = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdL);
        final Context context = this.zzd;
        final zzaxd zzaxdVar = this.zzg;
        final VersionInfoParcel versionInfoParcel = this.zzh;
        final com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        final zzegk zzegkVar = this.zzl;
        final zzfhs zzfhsVar = this.zzm;
        f4.c zzm = zzgft.zzm(zzgft.zzk(new zzgez() { // from class: com.google.android.gms.internal.ads.zzcho
            @Override // com.google.android.gms.internal.ads.zzgez
            public final f4.c zza() {
                com.google.android.gms.ads.internal.zzu.zzz();
                Context context2 = context;
                zzcix zza = zzcix.zza();
                zzaxd zzaxdVar2 = zzaxdVar;
                zzegk zzegkVar2 = zzegkVar;
                com.google.android.gms.ads.internal.zza zzaVar2 = zzaVar;
                zzchd zza2 = zzchq.zza(context2, zza, "", false, false, zzaxdVar2, null, versionInfoParcel, null, null, zzaVar2, zzbdm.zza(), null, null, zzegkVar2, zzfhsVar);
                final zzccm zza3 = zzccm.zza(zza2);
                zza2.zzN().zzB(new zzcit() { // from class: com.google.android.gms.internal.ads.zzchn
                    @Override // com.google.android.gms.internal.ads.zzcit
                    public final void zza(boolean z8, int i9, String str2, String str3) {
                        zzccm.this.zzb();
                    }
                });
                zza2.loadUrl(str);
                return zza3;
            }
        }, zzcci.zze), new zzfxu() { // from class: com.google.android.gms.internal.ads.zzdqh
            @Override // com.google.android.gms.internal.ads.zzfxu
            public final Object apply(Object obj) {
                zzchd zzchdVar = (zzchd) obj;
                zzdqs.this.zza(zzchdVar);
                return zzchdVar;
            }
        }, this.zzf);
        this.zzn = zzm;
        zzccl.zza(zzm, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzl(String str, zzblp zzblpVar) {
        f4.c cVar = this.zzn;
        if (cVar == null) {
            return;
        }
        zzgft.zzr(cVar, new zzdqj(this, str, zzblpVar), this.zzf);
    }

    public final void zzm(WeakReference weakReference, String str, zzblp zzblpVar) {
        zzl(str, new zzdqr(this, weakReference, str, zzblpVar, null));
    }

    public final synchronized void zzn(String str, zzblp zzblpVar) {
        f4.c cVar = this.zzn;
        if (cVar == null) {
            return;
        }
        zzgft.zzr(cVar, new zzdqk(this, str, zzblpVar), this.zzf);
    }
}
