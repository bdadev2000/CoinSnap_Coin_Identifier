package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdsh;
import com.google.android.gms.internal.ads.zzdsr;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzq {
    private final zzdsr zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgM)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgN)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgR)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgQ)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzo(this));

    public zzq(zzdsr zzdsrVar) {
        this.zzh = zzdsrVar;
    }

    private final synchronized void zzi(final zzdsh zzdshVar) {
        if (!this.zzc) {
            return;
        }
        ArrayDeque arrayDeque = this.zzg;
        final ArrayDeque clone = arrayDeque.clone();
        arrayDeque.clear();
        ArrayDeque arrayDeque2 = this.zzf;
        final ArrayDeque clone2 = arrayDeque2.clone();
        arrayDeque2.clear();
        zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzn
            @Override // java.lang.Runnable
            public final void run() {
                zzq.this.zze(zzdshVar, clone, clone2);
            }
        });
    }

    private final void zzj(zzdsh zzdshVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzdshVar.zzb());
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
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis();
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
        } catch (ConcurrentModificationException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzl(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    @Nullable
    public final synchronized String zzb(String str, zzdsh zzdshVar) {
        zzp zzpVar = (zzp) this.zze.get(str);
        zzdshVar.zzb().put("request_id", str);
        if (zzpVar != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzhj)).booleanValue()) {
                this.zze.remove(str);
            }
            String str2 = zzpVar.zzb;
            zzdshVar.zzb().put("mhit", "true");
            return str2;
        }
        zzdshVar.zzb().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdsh zzdshVar) {
        this.zze.put(str, new zzp(Long.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()), str2, new HashSet()));
        zzk();
        zzi(zzdshVar);
    }

    public final /* synthetic */ void zze(zzdsh zzdshVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzj(zzdshVar, arrayDeque, "to");
        zzj(zzdshVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }

    public final synchronized boolean zzg(String str, String str2, int i10) {
        zzp zzpVar = (zzp) this.zze.get(str);
        if (zzpVar == null) {
            return false;
        }
        zzpVar.zzc.add(str2);
        if (zzpVar.zzc.size() >= i10) {
            return false;
        }
        return true;
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
