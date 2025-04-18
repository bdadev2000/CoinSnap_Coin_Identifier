package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.facebook.internal.ServerProtocol;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdty;
import com.google.android.gms.internal.ads.zzdui;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class zzq {
    private final zzdui zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgI)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgJ)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgN)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgM)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzo(this));

    public zzq(zzdui zzduiVar) {
        this.zzh = zzduiVar;
    }

    private final synchronized void zzi(final zzdty zzdtyVar) {
        if (this.zzc) {
            ArrayDeque arrayDeque = this.zzg;
            final ArrayDeque clone = arrayDeque.clone();
            arrayDeque.clear();
            ArrayDeque arrayDeque2 = this.zzf;
            final ArrayDeque clone2 = arrayDeque2.clone();
            arrayDeque2.clear();
            zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
                @Override // java.lang.Runnable
                public final void run() {
                    zzq.this.zze(zzdtyVar, clone, clone2);
                }
            });
        }
    }

    private final void zzj(zzdty zzdtyVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdtyVar.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzv.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzl(this.zzi, "e_type", (String) pair.first);
                zzl(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzf(this.zzi);
        }
    }

    private final synchronized void zzk() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((zzp) entry.getValue()).zza.longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), ((zzp) entry.getValue()).zzb));
                it.remove();
            }
        } catch (ConcurrentModificationException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        map.put(str, str2);
    }

    @Nullable
    public final synchronized String zzb(String str, zzdty zzdtyVar) {
        try {
            zzp zzpVar = (zzp) this.zze.get(str);
            zzdtyVar.zzb().put(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, str);
            if (zzpVar == null) {
                zzdtyVar.zzb().put("mhit", "false");
                return null;
            }
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzhh)).booleanValue()) {
                this.zze.remove(str);
            }
            String str2 = zzpVar.zzb;
            zzdtyVar.zzb().put("mhit", ServerProtocol.DIALOG_RETURN_SCOPES_TRUE);
            return str2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void zzd(String str, String str2, zzdty zzdtyVar) {
        this.zze.put(str, new zzp(Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()), str2, new HashSet()));
        zzk();
        zzi(zzdtyVar);
    }

    public final /* synthetic */ void zze(zzdty zzdtyVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzj(zzdtyVar, arrayDeque, "to");
        zzj(zzdtyVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i2) {
        zzp zzpVar = (zzp) this.zze.get(str);
        if (zzpVar == null) {
            return false;
        }
        zzpVar.zzc.add(str2);
        return zzpVar.zzc.size() < i2;
    }

    public final synchronized boolean zzh(String str, String str2) {
        zzp zzpVar = (zzp) this.zze.get(str);
        if (zzpVar != null) {
            if (zzpVar.zzc.contains(str2)) {
                return true;
            }
        }
        return false;
    }
}
