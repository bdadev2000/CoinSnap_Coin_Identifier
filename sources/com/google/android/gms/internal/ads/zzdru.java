package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzdru {
    private final zzfhy zza;
    private final zzdrr zzb;

    public zzdru(zzfhy zzfhyVar, zzdrr zzdrrVar) {
        this.zza = zzfhyVar;
        this.zzb = zzdrrVar;
    }

    @VisibleForTesting
    public final zzbpl zza() throws RemoteException {
        zzbpl zzb = this.zza.zzb();
        if (zzb != null) {
            return zzb;
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Unexpected call to adapter creator.");
        throw new RemoteException();
    }

    public final zzbrk zzb(String str) throws RemoteException {
        zzbrk zzc = zza().zzc(str);
        this.zzb.zzd(str, zzc);
        return zzc;
    }

    public final zzfia zzc(String str, JSONObject jSONObject) throws zzfhj {
        zzbpo zzb;
        try {
            if ("com.google.ads.mediation.admob.AdMobAdapter".equals(str)) {
                zzb = new zzbqm(new AdMobAdapter());
            } else if ("com.google.ads.mediation.admob.AdMobCustomTabsAdapter".equals(str)) {
                zzb = new zzbqm(new zzbsd());
            } else {
                zzbpl zza = zza();
                if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
                    try {
                        String string = jSONObject.getString("class_name");
                        zzb = zza.zze(string) ? zza.zzb("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter") : zza.zzd(string) ? zza.zzb(string) : zza.zzb("com.google.ads.mediation.customevent.CustomEventAdapter");
                    } catch (JSONException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzh("Invalid custom event.", e);
                    }
                }
                zzb = zza.zzb(str);
            }
            zzfia zzfiaVar = new zzfia(zzb);
            this.zzb.zzc(str, zzfiaVar);
            return zzfiaVar;
        } catch (Throwable th) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziU)).booleanValue()) {
                this.zzb.zzc(str, null);
            }
            throw new zzfhj(th);
        }
    }

    public final boolean zzd() {
        return this.zza.zzb() != null;
    }
}
