package com.google.android.gms.internal.ads;

import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzegp {
    private final String zzc;
    private zzfgk zzd = null;
    private zzfgh zze = null;
    private com.google.android.gms.ads.internal.client.zzw zzf = null;
    private final Map zzb = Collections.synchronizedMap(new HashMap());
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzegp(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfgh zzfghVar) {
        return ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdz)).booleanValue() ? zzfghVar.zzap : zzfghVar.zzw;
    }

    private final synchronized void zzk(zzfgh zzfghVar, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String zzj = zzj(zzfghVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfghVar.zzv.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfghVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgz)).booleanValue()) {
            str = zzfghVar.zzF;
            str2 = zzfghVar.zzG;
            str3 = zzfghVar.zzH;
            str4 = zzfghVar.zzI;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(zzfghVar.zzE, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i2, zzwVar);
        } catch (IndexOutOfBoundsException e) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzwVar);
    }

    private final void zzl(zzfgh zzfghVar, long j2, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z2) {
        Map map = this.zzb;
        String zzj = zzj(zzfghVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfghVar;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zzb.get(zzj);
            zzwVar.zzb = j2;
            zzwVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzgA)).booleanValue() && z2) {
                this.zzf = zzwVar;
            }
        }
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzw zza() {
        return this.zzf;
    }

    public final zzcxt zzb() {
        return new zzcxt(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfgh zzfghVar) {
        zzk(zzfghVar, this.zza.size());
    }

    public final void zze(zzfgh zzfghVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfghVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            return;
        }
        this.zzf = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(indexOf);
        while (true) {
            indexOf++;
            if (indexOf >= this.zza.size()) {
                return;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(indexOf);
            zzwVar.zzb = 0L;
            zzwVar.zzc = null;
        }
    }

    public final void zzf(zzfgh zzfghVar, long j2, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfghVar, j2, zzeVar, false);
    }

    public final void zzg(zzfgh zzfghVar, long j2, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfghVar, j2, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzw) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfgh) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfgk zzfgkVar) {
        this.zzd = zzfgkVar;
    }
}
