package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzckp extends com.google.android.gms.ads.internal.client.zzcy {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdqd zzc;
    private final zzefd zzd;
    private final zzelo zze;
    private final zzdup zzf;
    private final zzbyv zzg;
    private final zzdqi zzh;
    private final zzdvk zzi;
    private final zzbfg zzj;
    private final zzfko zzk;
    private final zzfgk zzl;
    private final zzcue zzm;
    private final zzdsm zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime());

    public zzckp(Context context, VersionInfoParcel versionInfoParcel, zzdqd zzdqdVar, zzefd zzefdVar, zzelo zzeloVar, zzdup zzdupVar, zzbyv zzbyvVar, zzdqi zzdqiVar, zzdvk zzdvkVar, zzbfg zzbfgVar, zzfko zzfkoVar, zzfgk zzfgkVar, zzcue zzcueVar, zzdsm zzdsmVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdqdVar;
        this.zzd = zzefdVar;
        this.zze = zzeloVar;
        this.zzf = zzdupVar;
        this.zzg = zzbyvVar;
        this.zzh = zzdqiVar;
        this.zzi = zzdvkVar;
        this.zzj = zzbfgVar;
        this.zzk = zzfkoVar;
        this.zzl = zzfgkVar;
        this.zzm = zzcueVar;
        this.zzn = zzdsmVar;
    }

    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzv.zzp().zzi().zzM()) {
            String zzi = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzi();
            if (!com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, zzi, this.zzb.afmaVersion)) {
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzx(false);
                com.google.android.gms.ads.internal.zzv.zzp().zzi().zzw("");
            }
        }
    }

    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzv.zzp().zzi().zzg().zze();
        if (!zze.isEmpty()) {
            if (runnable != null) {
                try {
                    runnable.run();
                } catch (Throwable th2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not initialize rewarded ads.", th2);
                    return;
                }
            }
            if (this.zzc.zzd()) {
                HashMap hashMap = new HashMap();
                Iterator it = zze.values().iterator();
                while (it.hasNext()) {
                    for (zzboz zzbozVar : ((zzbpa) it.next()).zza) {
                        String str = zzbozVar.zzb;
                        for (String str2 : zzbozVar.zza) {
                            if (!hashMap.containsKey(str2)) {
                                hashMap.put(str2, new ArrayList());
                            }
                            if (str != null) {
                                ((List) hashMap.get(str2)).add(str);
                            }
                        }
                    }
                }
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str3 = (String) entry.getKey();
                    try {
                        zzefe zza = this.zzd.zza(str3, jSONObject);
                        if (zza != null) {
                            zzfgm zzfgmVar = (zzfgm) zza.zzb;
                            if (!zzfgmVar.zzC() && zzfgmVar.zzB()) {
                                zzfgmVar.zzj(this.zza, (zzegy) zza.zzc, (List) entry.getValue());
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzffv e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e2);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfgt.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzv.zzs().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzj(boolean z10) throws RemoteException {
        try {
            zzfti.zza(this.zza).zzc(z10);
        } catch (IOException e2) {
            throw new RemoteException(e2.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbcn.zza(this.zza);
        com.google.android.gms.ads.internal.zzv.zzp().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzv.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzec)).booleanValue()) {
            this.zzh.zzd();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckj
                @Override // java.lang.Runnable
                public final void run() {
                    zzckp.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkD)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckn
                @Override // java.lang.Runnable
                public final void run() {
                    zzckp.this.zzx();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzda)).booleanValue()) {
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckk
                @Override // java.lang.Runnable
                public final void run() {
                    zzckp.this.zzd();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeF)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeG)).booleanValue()) {
                zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzckl
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzckp.this.zzw();
                    }
                });
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0040  */
    @Override // com.google.android.gms.ads.internal.client.zzcz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(@androidx.annotation.Nullable java.lang.String r12, com.google.android.gms.dynamic.IObjectWrapper r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza
            com.google.android.gms.internal.ads.zzbcn.zza(r0)
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzeh
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d
            com.google.android.gms.ads.internal.zzv.zzq()     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            android.content.Context r0 = r11.zza     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzs.zzp(r0)     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            goto L2f
        L21:
            r0 = move-exception
            goto L24
        L23:
            r0 = move-exception
        L24:
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzbzz r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
        L2d:
            java.lang.String r0 = ""
        L2f:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L38
            r6 = r12
            goto L39
        L38:
            r6 = r0
        L39:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L40
            goto L93
        L40:
            com.google.android.gms.internal.ads.zzbce r12 = com.google.android.gms.internal.ads.zzbcn.zzea
            com.google.android.gms.internal.ads.zzbcl r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r0.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzaX
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r12 = r12 | r1
            com.google.android.gms.internal.ads.zzbcl r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7d
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            com.google.android.gms.internal.ads.zzcko r13 = new com.google.android.gms.internal.ads.zzcko
            r13.<init>()
            goto L7f
        L7d:
            r13 = 0
            r2 = r12
        L7f:
            r7 = r13
            if (r2 == 0) goto L93
            android.content.Context r4 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r11.zzb
            com.google.android.gms.internal.ads.zzfko r8 = r11.zzk
            com.google.android.gms.internal.ads.zzdsm r9 = r11.zzn
            java.lang.Long r10 = r11.zzp
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzv.zza()
            r3.zza(r4, r5, r6, r7, r8, r9, r10)
        L93:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzckp.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl zzdlVar) throws RemoteException {
        this.zzi.zzh(zzdlVar, zzdvj.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzn(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzg("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzat zzatVar = new com.google.android.gms.ads.internal.util.zzat(context);
        zzatVar.zzn(str);
        zzatVar.zzo(this.zzb.afmaVersion);
        zzatVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpg zzbpgVar) throws RemoteException {
        this.zzl.zzf(zzbpgVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzp(boolean z10) {
        com.google.android.gms.ads.internal.zzv.zzs().zzc(z10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzq(float f10) {
        com.google.android.gms.ads.internal.zzv.zzs().zzd(f10);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzr(String str) {
        zzbcn.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzea)).booleanValue()) {
                com.google.android.gms.ads.internal.zzv.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzblw zzblwVar) throws RemoteException {
        this.zzf.zzs(zzblwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziZ)).booleanValue()) {
            com.google.android.gms.ads.internal.zzv.zzp().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfv zzfvVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzfvVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzv.zzs().zze();
    }

    public final /* synthetic */ void zzw() {
        com.google.android.gms.ads.internal.zzv.zzf().zzb(this.zza, this.zzn);
    }

    public final /* synthetic */ void zzx() {
        this.zzj.zza(new zzbuo());
    }
}
