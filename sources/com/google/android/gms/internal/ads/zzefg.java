package com.google.android.gms.internal.ads;

import a4.j;
import android.os.Bundle;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

/* loaded from: classes3.dex */
public final class zzefg {
    private final String zzc;
    private zzfew zzd = null;
    private zzfet zze = null;
    private com.google.android.gms.ads.internal.client.zzw zzf = null;
    private final Map zzb = j.r();
    private final List zza = Collections.synchronizedList(new ArrayList());

    public zzefg(String str) {
        this.zzc = str;
    }

    private static String zzj(zzfet zzfetVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdG)).booleanValue()) {
            return zzfetVar.zzap;
        }
        return zzfetVar.zzw;
    }

    private final synchronized void zzk(zzfet zzfetVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        Map map = this.zzb;
        String zzj = zzj(zzfetVar);
        if (map.containsKey(zzj)) {
            return;
        }
        Bundle bundle = new Bundle();
        Iterator<String> keys = zzfetVar.zzv.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                bundle.putString(next, zzfetVar.zzv.getString(next));
            } catch (JSONException unused) {
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgE)).booleanValue()) {
            str = zzfetVar.zzF;
            str2 = zzfetVar.zzG;
            str3 = zzfetVar.zzH;
            str4 = zzfetVar.zzI;
        } else {
            str = "";
            str2 = "";
            str3 = "";
            str4 = "";
        }
        com.google.android.gms.ads.internal.client.zzw zzwVar = new com.google.android.gms.ads.internal.client.zzw(zzfetVar.zzE, 0L, null, bundle, str, str2, str3, str4);
        try {
            this.zza.add(i10, zzwVar);
        } catch (IndexOutOfBoundsException e2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdapterResponseInfoCollector.addAdapterResponseInfoEntryAtLocation");
        }
        this.zzb.put(zzj, zzwVar);
    }

    private final void zzl(zzfet zzfetVar, long j3, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar, boolean z10) {
        Map map = this.zzb;
        String zzj = zzj(zzfetVar);
        if (map.containsKey(zzj)) {
            if (this.zze == null) {
                this.zze = zzfetVar;
            }
            com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zzb.get(zzj);
            zzwVar.zzb = j3;
            zzwVar.zzc = zzeVar;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgF)).booleanValue() && z10) {
                this.zzf = zzwVar;
            }
        }
    }

    @Nullable
    public final com.google.android.gms.ads.internal.client.zzw zza() {
        return this.zzf;
    }

    public final zzcwf zzb() {
        return new zzcwf(this.zze, "", this, this.zzd, this.zzc);
    }

    public final List zzc() {
        return this.zza;
    }

    public final void zzd(zzfet zzfetVar) {
        zzk(zzfetVar, this.zza.size());
    }

    public final void zze(zzfet zzfetVar) {
        int indexOf = this.zza.indexOf(this.zzb.get(zzj(zzfetVar)));
        if (indexOf < 0 || indexOf >= this.zzb.size()) {
            indexOf = this.zza.indexOf(this.zzf);
        }
        if (indexOf >= 0 && indexOf < this.zzb.size()) {
            this.zzf = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(indexOf);
            while (true) {
                indexOf++;
                if (indexOf < this.zza.size()) {
                    com.google.android.gms.ads.internal.client.zzw zzwVar = (com.google.android.gms.ads.internal.client.zzw) this.zza.get(indexOf);
                    zzwVar.zzb = 0L;
                    zzwVar.zzc = null;
                } else {
                    return;
                }
            }
        }
    }

    public final void zzf(zzfet zzfetVar, long j3, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfetVar, j3, zzeVar, false);
    }

    public final void zzg(zzfet zzfetVar, long j3, @Nullable com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzl(zzfetVar, j3, null, true);
    }

    public final synchronized void zzh(String str, List list) {
        if (this.zzb.containsKey(str)) {
            int indexOf = this.zza.indexOf((com.google.android.gms.ads.internal.client.zzw) this.zzb.get(str));
            try {
                this.zza.remove(indexOf);
            } catch (IndexOutOfBoundsException e2) {
                com.google.android.gms.ads.internal.zzv.zzp().zzw(e2, "AdapterResponseInfoCollector.replaceAdapterResponseInfoEntry");
            }
            this.zzb.remove(str);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzk((zzfet) it.next(), indexOf);
                indexOf++;
            }
        }
    }

    public final void zzi(zzfew zzfewVar) {
        this.zzd = zzfewVar;
    }
}
