package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdqd {
    private final zzfgk zza;
    private final zzdqa zzb;

    public zzdqd(zzfgk zzfgkVar, zzdqa zzdqaVar) {
        this.zza = zzfgkVar;
        this.zzb = zzdqaVar;
    }

    public final zzbpg zza() throws RemoteException {
        zzbpg zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrf zzb(String str) throws RemoteException {
        zzbrf zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfgm zzc(String str, JSONObject jSONObject) throws zzffv {
        zzbpj zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbqh(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbqh(new zzbry());
            } else {
                zzbpg zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        if (zza.zze(string)) {
                            zzb = zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter");
                        } else if (zza.zzd(string)) {
                            zzb = zza.zzb(string);
                        } else {
                            zzb = zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                        }
                    } catch (JSONException e2) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid custom event.", e2);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfgm zzfgmVar = new zzfgm(zzb);
            this.zzb.zzc(str, zzfgmVar);
            return zzfgmVar;
        } catch (Throwable th2) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziW)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzffv(th2);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
