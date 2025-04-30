package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdxo implements zzczo, zzdcg, zzdbd {
    private final zzdya zza;
    private final String zzb;
    private final String zzc;
    private zzcze zzf;
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
    private zzdxn zze = zzdxn.AD_REQUESTED;

    public zzdxo(zzdya zzdyaVar, zzfho zzfhoVar, String str) {
        this.zza = zzdyaVar;
        this.zzc = str;
        this.zzb = zzfhoVar.zzf;
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

    private final JSONObject zzi(zzcze zzczeVar) throws JSONException {
        JSONObject zzh;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", zzczeVar.zzg());
        jSONObject.put("responseSecsSinceEpoch", zzczeVar.zzc());
        jSONObject.put("responseId", zzczeVar.zzi());
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjl)).booleanValue()) {
            String zzd = zzczeVar.zzd();
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjo)).booleanValue()) {
            jSONObject.put("hasExceededMemoryLimit", this.zzo);
        }
        JSONArray jSONArray = new JSONArray();
        for (com.google.android.gms.ads.internal.client.zzu zzuVar : zzczeVar.zzj()) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adapterClassName", zzuVar.zza);
            jSONObject2.put("latencyMillis", zzuVar.zzb);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjm)).booleanValue()) {
                jSONObject2.put("credentials", com.google.android.gms.ads.internal.client.zzay.zzb().zzi(zzuVar.zzd));
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = zzuVar.zzc;
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

    @Override // com.google.android.gms.internal.ads.zzdbd
    public final void zza(zzcup zzcupVar) {
        if (this.zza.zzq()) {
            this.zzf = zzcupVar.zzl();
            this.zze = zzdxn.AD_LOADED;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue()) {
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
        jSONObject2.put("format", zzfgt.zza(this.zzd));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue()) {
            jSONObject2.put("isOutOfContext", this.zzm);
            if (this.zzm) {
                jSONObject2.put("shown", this.zzn);
            }
        }
        zzcze zzczeVar = this.zzf;
        if (zzczeVar != null) {
            jSONObject = zzi(zzczeVar);
        } else {
            com.google.android.gms.ads.internal.client.zze zzeVar = this.zzg;
            JSONObject jSONObject3 = null;
            if (zzeVar != null && (iBinder = zzeVar.zze) != null) {
                zzcze zzczeVar2 = (zzcze) iBinder;
                jSONObject3 = zzi(zzczeVar2);
                if (zzczeVar2.zzj().isEmpty()) {
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

    @Override // com.google.android.gms.internal.ads.zzczo
    public final void zzdB(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza.zzq()) {
            this.zze = zzdxn.AD_LOAD_FAILED;
            this.zzg = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue()) {
                this.zza.zzf(this.zzb, this);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdn(zzbxu zzbxuVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjs)).booleanValue() && this.zza.zzq()) {
            this.zza.zzf(this.zzb, this);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdcg
    public final void zzdo(zzfhf zzfhfVar) {
        if (this.zza.zzq()) {
            int i9 = 0;
            if (!zzfhfVar.zzb.zza.isEmpty()) {
                this.zzd = ((zzfgt) zzfhfVar.zzb.zza.get(0)).zzb;
            }
            if (!TextUtils.isEmpty(zzfhfVar.zzb.zzb.zzk)) {
                this.zzh = zzfhfVar.zzb.zzb.zzk;
            }
            if (!TextUtils.isEmpty(zzfhfVar.zzb.zzb.zzl)) {
                this.zzi = zzfhfVar.zzb.zzb.zzl;
            }
            if (zzfhfVar.zzb.zzb.zzo.length() > 0) {
                this.zzl = zzfhfVar.zzb.zzb.zzo;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjo)).booleanValue()) {
                if (!this.zza.zzs()) {
                    this.zzo = true;
                    return;
                }
                if (!TextUtils.isEmpty(zzfhfVar.zzb.zzb.zzm)) {
                    this.zzj = zzfhfVar.zzb.zzb.zzm;
                }
                if (zzfhfVar.zzb.zzb.zzn.length() > 0) {
                    this.zzk = zzfhfVar.zzb.zzb.zzn;
                }
                zzdya zzdyaVar = this.zza;
                JSONObject jSONObject = this.zzk;
                if (jSONObject != null) {
                    i9 = jSONObject.toString().length();
                }
                if (!TextUtils.isEmpty(this.zzj)) {
                    i9 += this.zzj.length();
                }
                zzdyaVar.zzk(i9);
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
        if (this.zze != zzdxn.AD_REQUESTED) {
            return true;
        }
        return false;
    }
}
