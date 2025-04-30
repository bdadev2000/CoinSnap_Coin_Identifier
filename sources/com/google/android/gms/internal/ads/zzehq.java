package com.google.android.gms.internal.ads;

import Q7.n0;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes2.dex */
public final class zzehq {
    private final String zzc;
    private zzfgw zzd = null;
    private zzfgt zze = null;
    private com.google.android.gms.ads.internal.client.zzu zzf = null;
    private final Map zzb = n0.q();
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzehq(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfgt zzfgtVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdA)).booleanValue()) {
            return zzfgtVar.zzaq;
        }
        return zzfgtVar.zzx;
    }

    private final synchronized void zzk(zzfgt zzfgtVar, int i9) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String zzj = zzj(zzfgtVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfgtVar.zzw.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfgtVar.zzw.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgX)).booleanValue()) {
            str = zzfgtVar.zzG;
            str2 = zzfgtVar.zzH;
            str3 = zzfgtVar.zzI;
            str4 = zzfgtVar.zzJ;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzu zzuVar = new com.google.android.gms.ads.internal.client.zzu(zzfgtVar.zzF, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i9, zzuVar);
        } catch (IndexOutOfBoundsException e4) {
            com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzuVar);
    }

    private final void zzl(zzfgt zzfgtVar, long j7, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z8) {
        Map map = this.zzb;
        String zzj = zzj(zzfgtVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfgtVar;
            }
            com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zzb.get(zzj);
            zzuVar.zzb = j7;
            zzuVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgY)).booleanValue() && z8) {
                this.zzf = zzuVar;
            }
        }
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzu zza() {
        return this.zzf;
    }

    public final zzcze zzb() {
        return new zzcze(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfgt zzfgtVar) {
        zzk(zzfgtVar, this.zza.size());
    }

    public final void zze(zzfgt zzfgtVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfgtVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < this.zzb.size()) {
            this.zzf = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < this.zza.size()) {
                    com.google.android.gms.ads.internal.client.zzu zzuVar = (com.google.android.gms.ads.internal.client.zzu) this.zza.get(indexOf);
                    zzuVar.zzb = 0L;
                    zzuVar.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfgt zzfgtVar, long j7, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfgtVar, j7, zzeVar, false);
    }

    public final void zzg(zzfgt zzfgtVar, long j7, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfgtVar, j7, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzu) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e4) {
                com.google.android.gms.ads.internal.zzu.zzo().zzw(e4, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfgt) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfgw zzfgwVar) {
        this.zzd = zzfgwVar;
    }
}
