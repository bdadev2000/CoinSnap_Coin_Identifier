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

/* loaded from: classes2.dex */
public final class zzcnt extends com.google.android.gms.ads.internal.client.zzcn {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final zzdst zzc;
    private final zzehn zzd;
    private final zzeny zze;
    private final zzdxf zzf;
    private final zzcau zzg;
    private final zzdsy zzh;
    private final zzdya zzi;
    private final zzbhd zzj;
    private final zzfmq zzk;
    private final zzfik zzl;
    private final zzcxd zzm;
    private final zzdvc zzn;
    private boolean zzo = false;
    private final Long zzp = Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime());

    public zzcnt(Context context, VersionInfoParcel versionInfoParcel, zzdst zzdstVar, zzehn zzehnVar, zzeny zzenyVar, zzdxf zzdxfVar, zzcau zzcauVar, zzdsy zzdsyVar, zzdya zzdyaVar, zzbhd zzbhdVar, zzfmq zzfmqVar, zzfik zzfikVar, zzcxd zzcxdVar, zzdvc zzdvcVar) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = zzdstVar;
        this.zzd = zzehnVar;
        this.zze = zzenyVar;
        this.zzf = zzdxfVar;
        this.zzg = zzcauVar;
        this.zzh = zzdsyVar;
        this.zzi = zzdyaVar;
        this.zzj = zzbhdVar;
        this.zzk = zzfmqVar;
        this.zzl = zzfikVar;
        this.zzm = zzcxdVar;
        this.zzn = zzdvcVar;
    }

    public final void zzb() {
        if (com.google.android.gms.ads.internal.zzu.zzo().zzi().zzR()) {
            String zzl = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzl();
            if (!com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, zzl, this.zzb.afmaVersion)) {
                com.google.android.gms.ads.internal.zzu.zzo().zzi().zzC(false);
                com.google.android.gms.ads.internal.zzu.zzo().zzi().zzB("");
            }
        }
    }

    public final void zzc(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map zze = com.google.android.gms.ads.internal.zzu.zzo().zzi().zzh().zze();
        if (!zze.isEmpty()) {
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
                    for (zzbqy zzbqyVar : ((zzbqz) it.next()).zza) {
                        String str = zzbqyVar.zzk;
                        for (String str2 : zzbqyVar.zzc) {
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
                        zzeho zza = this.zzd.zza(str3, jSONObject);
                        if (zza != null) {
                            zzfim zzfimVar = (zzfim) zza.zzb;
                            if (!zzfimVar.zzC() && zzfimVar.zzB()) {
                                zzfimVar.zzj(this.zza, (zzeji) zza.zzc, (List) entry.getValue());
                                com.google.android.gms.ads.internal.util.client.zzm.zze("Initialized rewarded video mediation adapter " + str3);
                            }
                        }
                    } catch (zzfhv e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzk("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e4);
                    }
                }
            }
        }
    }

    public final /* synthetic */ void zzd() {
        zzfit.zzb(this.zza, true);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized float zze() {
        return com.google.android.gms.ads.internal.zzu.zzr().zza();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final String zzf() {
        return this.zzb.afmaVersion;
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final List zzg() throws RemoteException {
        return this.zzf.zzg();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzh(String str) {
        this.zze.zzg(str);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzi() {
        this.zzf.zzl();
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzj(boolean z8) throws RemoteException {
        try {
            zzfvh.zzi(this.zza).zzn(z8);
        } catch (IOException e4) {
            throw new RemoteException(e4.getMessage());
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzk() {
        if (this.zzo) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Mobile ads is initialized already.");
            return;
        }
        zzbep.zza(this.zza);
        com.google.android.gms.ads.internal.zzu.zzo().zzu(this.zza, this.zzb);
        this.zzm.zzd();
        com.google.android.gms.ads.internal.zzu.zzc().zzi(this.zza);
        this.zzo = true;
        this.zzf.zzr();
        this.zze.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdY)).booleanValue()) {
            this.zzh.zzc();
        }
        this.zzi.zzg();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjj)).booleanValue()) {
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcno
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnt.this.zzb();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkT)).booleanValue()) {
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnq
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnt.this.zzw();
                }
            });
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzcO)).booleanValue()) {
            zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcnp
                @Override // java.lang.Runnable
                public final void run() {
                    zzcnt.this.zzd();
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e  */
    @Override // com.google.android.gms.ads.internal.client.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzl(@androidx.annotation.Nullable java.lang.String r12, com.google.android.gms.dynamic.IObjectWrapper r13) {
        /*
            r11 = this;
            android.content.Context r0 = r11.zza
            com.google.android.gms.internal.ads.zzbep.zza(r0)
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzec
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L2b
            com.google.android.gms.ads.internal.zzu.zzp()     // Catch: android.os.RemoteException -> L21
            android.content.Context r0 = r11.zza     // Catch: android.os.RemoteException -> L21
            java.lang.String r0 = com.google.android.gms.ads.internal.util.zzt.zzp(r0)     // Catch: android.os.RemoteException -> L21
            goto L2d
        L21:
            r0 = move-exception
            java.lang.String r1 = "NonagonMobileAdsSettingManager_AppId"
            com.google.android.gms.internal.ads.zzcby r2 = com.google.android.gms.ads.internal.zzu.zzo()
            r2.zzw(r0, r1)
        L2b:
            java.lang.String r0 = ""
        L2d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 1
            if (r2 != r1) goto L36
            r6 = r12
            goto L37
        L36:
            r6 = r0
        L37:
            boolean r12 = android.text.TextUtils.isEmpty(r6)
            if (r12 == 0) goto L3e
            goto L92
        L3e:
            com.google.android.gms.internal.ads.zzbeg r12 = com.google.android.gms.internal.ads.zzbep.zzdW
            com.google.android.gms.internal.ads.zzben r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r12 = r0.zza(r12)
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzaR
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r1 = r1.zza(r0)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r12 = r12 | r1
            com.google.android.gms.internal.ads.zzben r1 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r1.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L7c
            java.lang.Object r12 = com.google.android.gms.dynamic.ObjectWrapper.unwrap(r13)
            java.lang.Runnable r12 = (java.lang.Runnable) r12
            com.google.android.gms.internal.ads.zzcnr r13 = new com.google.android.gms.internal.ads.zzcnr
            r13.<init>()
        L7a:
            r7 = r13
            goto L7f
        L7c:
            r13 = 0
            r2 = r12
            goto L7a
        L7f:
            if (r2 == 0) goto L92
            android.content.Context r4 = r11.zza
            com.google.android.gms.ads.internal.util.client.VersionInfoParcel r5 = r11.zzb
            com.google.android.gms.internal.ads.zzfmq r8 = r11.zzk
            com.google.android.gms.internal.ads.zzdvc r9 = r11.zzn
            java.lang.Long r10 = r11.zzp
            com.google.android.gms.ads.internal.zzf r3 = com.google.android.gms.ads.internal.zzu.zza()
            r3.zza(r4, r5, r6, r7, r8, r9, r10)
        L92:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcnt.zzl(java.lang.String, com.google.android.gms.dynamic.IObjectWrapper):void");
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzm(com.google.android.gms.ads.internal.client.zzda zzdaVar) throws RemoteException {
        this.zzi.zzh(zzdaVar, zzdxz.API);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
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

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzo(zzbrf zzbrfVar) throws RemoteException {
        this.zzl.zzf(zzbrfVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzp(boolean z8) {
        com.google.android.gms.ads.internal.zzu.zzr().zzc(z8);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzq(float f9) {
        com.google.android.gms.ads.internal.zzu.zzr().zzd(f9);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized void zzr(String str) {
        zzbep.zza(this.zza);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdW)).booleanValue()) {
                com.google.android.gms.ads.internal.zzu.zza().zza(this.zza, this.zzb, str, null, this.zzk, null, null);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzs(zzbnu zzbnuVar) throws RemoteException {
        this.zzf.zzs(zzbnuVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzt(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzju)).booleanValue()) {
            com.google.android.gms.ads.internal.zzu.zzo().zzz(str);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final void zzu(com.google.android.gms.ads.internal.client.zzff zzffVar) throws RemoteException {
        this.zzg.zzn(this.zza, zzffVar);
    }

    @Override // com.google.android.gms.ads.internal.client.zzco
    public final synchronized boolean zzv() {
        return com.google.android.gms.ads.internal.zzu.zzr().zze();
    }

    public final /* synthetic */ void zzw() {
        this.zzj.zza(new zzbwo());
    }
}
