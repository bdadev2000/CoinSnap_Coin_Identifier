package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzdst {
    private final zzfik zza;
    private final zzdsq zzb;

    public zzdst(zzfik zzfikVar, zzdsq zzdsqVar) {
        this.zza = zzfikVar;
        this.zzb = zzdsqVar;
    }

    public final zzbrf zza() throws RemoteException {
        zzbrf zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbte zzb(String str) throws RemoteException {
        zzbte zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfim zzc(String str, JSONObject jSONObject) throws zzfhv {
        zzbri zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbsg(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbsg(new zzbtx());
            } else {
                zzbrf zza = zza();
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
                    } catch (JSONException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid custom event.", e4);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfim zzfimVar = new zzfim(zzb);
            this.zzb.zzc(str, zzfimVar);
            return zzfimVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjr)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfhv(th);
        }
    }

    public final boolean zzd() {
        if (this.zza.zzb() != null) {
            return true;
        }
        return false;
    }
}
