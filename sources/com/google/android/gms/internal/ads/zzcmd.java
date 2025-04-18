package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
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

/* loaded from: classes.dex */
public final class zzcmd extends com.google.android.gms.ads.internal.client.zzcy {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdru zzc;
    private final zzegm zzd;
    private final zzemx zze;
    private final zzdwg zzf;
    private final zzbyz zzg;
    private final zzdrz zzh;
    private final zzdxb zzi;
    private final zzbfk zzj;
    private final zzfmd zzk;
    private final zzfhy zzl;
    private final zzcvs zzm;
    private final zzdud zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());

    @VisibleForTesting
    public zzcmd(Context context, VersionInfoParcel versionInfoParcel, zzdru zzdruVar, zzegm zzegmVar, zzemx zzemxVar, zzdwg zzdwgVar, zzbyz zzbyzVar, zzdrz zzdrzVar, zzdxb zzdxbVar, zzbfk zzbfkVar, zzfmd zzfmdVar, zzfhy zzfhyVar, zzcvs zzcvsVar, zzdud zzdudVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdruVar;
        this.zzd = zzegmVar;
        this.zze = zzemxVar;
        this.zzf = zzdwgVar;
        this.zzg = zzbyzVar;
        this.zzh = zzdrzVar;
        this.zzi = zzdxbVar;
        this.zzj = zzbfkVar;
        this.zzk = zzfmdVar;
        this.zzl = zzfhyVar;
        this.zzm = zzcvsVar;
        this.zzn = zzdudVar;
    }

    @VisibleForTesting
    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzR()) {
            String zzl = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzl();
            if (com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, zzl, this.zzb.afmaVersion)) {
                return;
            }
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzC(false);
            com.google.android.gms.ads.internal.zzu.zzo().zzi().zzB("");
        }
    }

    @VisibleForTesting
    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zze();
        if (zze.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzc.zzd()) {
            HashMap hashMap = new HashMap();
            Iterator it = zze.values().iterator();
            while (it.hasNext()) {
                for (zzbpe zzbpeVar : ((zzbpf) it.next()).zza) {
                    String str = zzbpeVar.zzb;
                    for (String str2 : zzbpeVar.zza) {
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
                    zzegn zza = this.zzd.zza(str3, jSONObject);
                    if (zza != null) {
                        zzfia zzfiaVar = (zzfia) zza.zzb;
                        if (!zzfiaVar.zzC() && zzfiaVar.zzB()) {
                            zzfiaVar.zzj(this.zza, (zzeih) zza.zzc, (List) entry.getValue());
                            com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfhj e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfih.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzu.zzr().zza();
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
    public final void zzj(boolean z2) throws RemoteException {
        try {
            zzfuv.zzi(this.zza).zzn(z2);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbcv.zza(this.zza);
        com.google.android.gms.ads.internal.zzu.zzo().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzu.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdV)).booleanValue()) {
            this.zzh.zzd();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziM)).booleanValue()) {
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcly
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmd.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkB)).booleanValue()) {
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcma
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmd.this.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzcR)).booleanValue()) {
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzclz
                @Override // java.lang.Runnable
                public final void run() {
                    zzcmd.this.zzd();
                }
            });
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
            com.google.android.gms.internal.ads.zzbcv.zza(r0)
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzea
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2d
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            android.content.Context r0 = r11.zza     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.zzp(r0)     // Catch: android.os.RemoteException -> L21 java.lang.RuntimeException -> L23
            goto L2f
        L21:
            r0 = move-exception
            goto L24
        L23:
            r0 = move-exception
        L24:
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzcad r2 = com.google.android.gms.ads.internal.zzu.zzo()
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
            goto L94
        L40:
            com.google.android.gms.internal.ads.zzbcm r12 = com.google.android.gms.internal.ads.zzbcv.zzdT
            com.google.android.gms.internal.ads.zzbct r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r12 = r0.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.google.android.gms.internal.ads.zzbcm r0 = com.google.android.gms.internal.ads.zzbcv.zzaU
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r12 = r12 | r1
            com.google.android.gms.internal.ads.zzbct r1 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7e
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            com.google.android.gms.internal.ads.zzcmb r13 = new com.google.android.gms.internal.ads.zzcmb
            r13.<init>()
        L7c:
            r7 = r13
            goto L81
        L7e:
            r13 = 0
            r2 = r12
            goto L7c
        L81:
            if (r2 == 0) goto L94
            android.content.Context r4 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r11.zzb
            com.google.android.gms.internal.ads.zzfmd r8 = r11.zzk
            com.google.android.gms.internal.ads.zzdud r9 = r11.zzn
            java.lang.Long r10 = r11.zzp
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzu.zza()
            r3.zza(r4, r5, r6, r7, r8, r9, r10)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcmd.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzm(com.google.android.gms.ads.internal.client.zzdl zzdlVar) throws RemoteException {
        this.zzi.zzh(zzdlVar, zzdxa.API);
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
        com.google.android.gms.ads.internal.util.zzau zzauVar = new com.google.android.gms.ads.internal.util.zzau(context);
        zzauVar.zzn(str);
        zzauVar.zzo(this.zzb.afmaVersion);
        zzauVar.zzr();
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzo(zzbpl zzbplVar) throws RemoteException {
        this.zzl.zzf(zzbplVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzp(boolean z2) {
        com.google.android.gms.ads.internal.zzu.zzr().zzc(z2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzq(float f2) {
        com.google.android.gms.ads.internal.zzu.zzr().zzd(f2);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized void zzr(String str) {
        zzbcv.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdT)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzs(zzbmb zzbmbVar) throws RemoteException {
        this.zzf.zzs(zzbmbVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziX)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final void zzu(com.google.android.gms.ads.internal.client.zzfw zzfwVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzfwVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzcz
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzu.zzr().zze();
    }

    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbuu());
    }
}
