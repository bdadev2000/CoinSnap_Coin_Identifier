package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzduy implements zzcwp, zzczj, zzcye {
    private final zzdvk zza;
    private final String zzb;
    private final String zzc;
    private zzcwf zzf;
    private com.google.android.gms.ads.internal.client.zze zzg;
    private JSONObject zzk;
    private JSONObject zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private int zzd = 0;
    private zzdux zze = zzdux.AD_REQUESTED;

    public zzduy(zzdvk zzdvkVar, zzffo zzffoVar, String str) {
        this.zza = zzdvkVar;
        this.zzc = str;
        this.zzb = zzffoVar.zzf;
    }

    private static JSONObject zzh(com.google.android.gms.ads.internal.client.zze zzeVar) throws JSONException {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", zzeVar.zzc);
        jSONObject.put("errorCode", zzeVar.zza);
        jSONObject.put("errorDescription", zzeVar.zzb);
        com.google.android.gms.ads.internal.client.zze zzeVar2 = zzeVar.zzd;
        if (zzeVar2 == null) {
            zzh = null;
        } else {
            zzh = zzh(zzeVar2);
        }
        jSONObject.put("underlyingError", zzh);
        return jSONObject;
    }

    private final JSONObject zzi(zzcwf zzcwfVar) throws JSONException {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzcwfVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzcwfVar.zzc());
        jSONObject.put("responseId", zzcwfVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziQ)).booleanValue()) {
            String zzd = zzcwfVar.zzd();
            if (!TextUtils.isEmpty(zzd)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Bidding data: ".concat(String.valueOf(zzd)));
                jSONObject.put("biddingData", new JSONObject(zzd));
            }
        }
        if (!TextUtils.isEmpty(this.zzh)) {
            jSONObject.put("adRequestUrl", this.zzh);
        }
        if (!TextUtils.isEmpty(this.zzi)) {
            jSONObject.put("postBody", this.zzi);
        }
        if (!TextUtils.isEmpty(this.zzj)) {
            jSONObject.put("adResponseBody", this.zzj);
        }
        Object obj = this.zzk;
        if (obj != null) {
            jSONObject.put("adResponseHeaders", obj);
        }
        Object obj2 = this.zzl;
        if (obj2 != null) {
            jSONObject.put("transactionExtras", obj2);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziT)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzw zzwVar : zzcwfVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzwVar.zza);
            jSONObject2.put("latencyMillis", zzwVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziR)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzbc.zzb().zzi(zzwVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzwVar.zzc;
            if (zzeVar == null) {
                zzh = null;
            } else {
                zzh = zzh(zzeVar);
            }
            jSONObject2.put("error", zzh);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zzcye
    public final void zza(zzcrq zzcrqVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcrqVar.zzm();
            this.zze = zzdux.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziX)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    public final String zzc() {
        return this.zzc;
    }

    public final JSONObject zzd() throws JSONException {
        JSONObject jSONObject;
        IBinder iBinder;
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("state", this.zze);
        jSONObject2.put("format", zzfet.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziX)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        zzcwf zzcwfVar = this.zzf;
        if (zzcwfVar != null) {
            jSONObject = zzi(zzcwfVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcwf zzcwfVar2 = (zzcwf) iBinder;
                jSONObject3 = zzi(zzcwfVar2);
                if (zzcwfVar2.zzj().isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(zzh(this.zzg));
                    jSONObject3.put("errors", jSONArray);
                }
            }
            jSONObject = jSONObject3;
        }
        jSONObject2.put("responseInfo", jSONObject);
        return jSONObject2;
    }

    @Override // com.google.android.gms.internal.ads.zzcwp
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzdux.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziX)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdn(zzbvx zzbvxVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziX)).booleanValue() && this.zza.zzq()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzczj
    public final void zzdo(zzfff zzfffVar) {
        if (this.zza.zzq()) {
            int i10 = 0;
            if (!zzfffVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfet) zzfffVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfffVar.zzb.zzb.zzl)) {
                this.zzh = zzfffVar.zzb.zzb.zzl;
            }
            if (!TextUtils.isEmpty(zzfffVar.zzb.zzb.zzm)) {
                this.zzi = zzfffVar.zzb.zzb.zzm;
            }
            if (zzfffVar.zzb.zzb.zzp.length() > 0) {
                this.zzl = zzfffVar.zzb.zzb.zzp;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziT)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfffVar.zzb.zzb.zzn)) {
                    this.zzj = zzfffVar.zzb.zzb.zzn;
                }
                if (zzfffVar.zzb.zzb.zzo.length() > 0) {
                    this.zzk = zzfffVar.zzb.zzb.zzo;
                }
                zzdvk zzdvkVar = this.zza;
                JSONObject jSONObject = this.zzk;
                if (jSONObject != null) {
                    i10 = jSONObject.toString().length();
                }
                if (!TextUtils.isEmpty(this.zzj)) {
                    i10 += this.zzj.length();
                }
                zzdvkVar.zzk(i10);
            }
        }
    }

    public final void zze() {
        this.zzm = true;
    }

    public final void zzf() {
        this.zzn = true;
    }

    public final boolean zzg() {
        return this.zze != zzdux.AD_REQUESTED;
    }
}
