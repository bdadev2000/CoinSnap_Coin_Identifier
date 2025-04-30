package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzeob extends zzbtg {
    private final String zza;
    private final zzbte zzb;
    private final zzccn zzc;
    private final JSONObject zzd;
    private final long zze;
    private boolean zzf;

    public zzeob(String str, zzbte zzbteVar, zzccn zzccnVar, long j7) {
        JSONObject jSONObject = new JSONObject();
        this.zzd = jSONObject;
        this.zzf = false;
        this.zzc = zzccnVar;
        this.zza = str;
        this.zzb = zzbteVar;
        this.zze = j7;
        try {
            jSONObject.put("adapter_version", zzbteVar.zzf().toString());
            jSONObject.put("sdk_version", zzbteVar.zzg().toString());
            jSONObject.put("name", str);
        } catch (RemoteException | NullPointerException | JSONException unused) {
        }
    }

    public static synchronized void zzb(String str, zzccn zzccnVar) {
        synchronized (zzeob.class) {
            try {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("name", str);
                    jSONObject.put("signal_error", "Adapter failed to instantiate");
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbB)).booleanValue()) {
                        jSONObject.put("signal_error_code", 1);
                    }
                    zzccnVar.zzc(jSONObject);
                } catch (JSONException unused) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final synchronized void zzh(String str, int i9) {
        try {
            if (this.zzf) {
                return;
            }
            try {
                this.zzd.put("signal_error", str);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbC)).booleanValue()) {
                    this.zzd.put("latency", com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zze);
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbB)).booleanValue()) {
                    this.zzd.put("signal_error_code", i9);
                }
            } catch (JSONException unused) {
            }
            this.zzc.zzc(this.zzd);
            this.zzf = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzc() {
        zzh("Signal collection timeout.", 3);
    }

    public final synchronized void zzd() {
        if (this.zzf) {
            return;
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbB)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final synchronized void zze(String str) throws RemoteException {
        if (this.zzf) {
            return;
        }
        if (str == null) {
            zzf("Adapter returned null signals");
            return;
        }
        try {
            this.zzd.put("signals", str);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbC)).booleanValue()) {
                this.zzd.put("latency", com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - this.zze);
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbB)).booleanValue()) {
                this.zzd.put("signal_error_code", 0);
            }
        } catch (JSONException unused) {
        }
        this.zzc.zzc(this.zzd);
        this.zzf = true;
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final synchronized void zzf(String str) throws RemoteException {
        zzh(str, 2);
    }

    @Override // com.google.android.gms.internal.ads.zzbth
    public final synchronized void zzg(com.google.android.gms.ads.internal.client.zze zzeVar) throws RemoteException {
        zzh(zzeVar.zzb, 2);
    }
}
