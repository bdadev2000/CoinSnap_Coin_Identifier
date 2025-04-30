package com.google.android.gms.ads.nonagon.signalgeneration;

import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzdux;
import com.google.android.gms.internal.ads.zzdvh;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzk {
    private final zzdvh zzh;
    private Map zzi;
    private final ArrayDeque zzf = new ArrayDeque();
    private final ArrayDeque zzg = new ArrayDeque();
    private final int zza = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhh)).intValue();
    private final long zzb = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhi)).longValue();
    private final boolean zzc = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhn)).booleanValue();
    private final boolean zzd = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzhl)).booleanValue();
    private final Map zze = Collections.synchronizedMap(new zzj(this));

    public zzk(zzdvh zzdvhVar) {
        this.zzh = zzdvhVar;
    }

    private final synchronized void zzg(final zzdux zzduxVar) {
        if (!this.zzc) {
            return;
        }
        ArrayDeque arrayDeque = this.zzg;
        final ArrayDeque clone = arrayDeque.clone();
        arrayDeque.clear();
        ArrayDeque arrayDeque2 = this.zzf;
        final ArrayDeque clone2 = arrayDeque2.clone();
        arrayDeque2.clear();
        zzcci.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
            @Override // java.lang.Runnable
            public final void run() {
                zzk.this.zze(zzduxVar, clone, clone2);
            }
        });
    }

    private final void zzh(zzdux zzduxVar, ArrayDeque arrayDeque, String str) {
        Pair pair;
        while (!arrayDeque.isEmpty()) {
            Pair pair2 = (Pair) arrayDeque.poll();
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(zzduxVar.zzb());
            this.zzi = concurrentHashMap;
            concurrentHashMap.put("action", "ev");
            this.zzi.put("e_r", str);
            this.zzi.put("e_id", (String) pair2.first);
            if (this.zzd) {
                try {
                    JSONObject jSONObject = new JSONObject((String) pair2.second);
                    pair = new Pair(zzp.zzb(jSONObject.getJSONObject("extras").getString("query_info_type")), jSONObject.getString("request_agent"));
                } catch (JSONException unused) {
                    pair = new Pair("", "");
                }
                zzj(this.zzi, "e_type", (String) pair.first);
                zzj(this.zzi, "e_agent", (String) pair.second);
            }
            this.zzh.zzf(this.zzi);
        }
    }

    private final synchronized void zzi() {
        long currentTimeMillis = com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis();
        try {
            Iterator it = this.zze.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (currentTimeMillis - ((Long) ((Pair) entry.getValue()).first).longValue() <= this.zzb) {
                    break;
                }
                this.zzg.add(new Pair((String) entry.getKey(), (String) ((Pair) entry.getValue()).second));
                it.remove();
            }
        } catch (ConcurrentModificationException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "QueryJsonMap.removeExpiredEntries");
        }
    }

    private static final void zzj(Map map, String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            map.put(str, str2);
        }
    }

    @Nullable
    public final synchronized String zzb(String str, zzdux zzduxVar) {
        Pair pair = (Pair) this.zze.get(str);
        zzduxVar.zzb().put("request_id", str);
        if (pair != null) {
            String str2 = (String) pair.second;
            this.zze.remove(str);
            zzduxVar.zzb().put("mhit", "true");
            return str2;
        }
        zzduxVar.zzb().put("mhit", "false");
        return null;
    }

    public final synchronized void zzd(String str, String str2, zzdux zzduxVar) {
        this.zze.put(str, new Pair(Long.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()), str2));
        zzi();
        zzg(zzduxVar);
    }

    public final /* synthetic */ void zze(zzdux zzduxVar, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        zzh(zzduxVar, arrayDeque, "to");
        zzh(zzduxVar, arrayDeque2, "of");
    }

    public final synchronized void zzf(String str) {
        this.zze.remove(str);
    }
}
