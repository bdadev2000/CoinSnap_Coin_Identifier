package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdvf implements zzflu {
    private final zzdux zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdvf(zzdux zzduxVar, Set set, Clock clock) {
        zzfln zzflnVar;
        this.zzb = zzduxVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdve zzdveVar = (zzdve) it.next();
            Map map = this.zzd;
            zzflnVar = zzdveVar.zzc;
            map.put(zzflnVar, zzdveVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfln zzflnVar, boolean z8) {
        zzfln zzflnVar2;
        String str;
        String str2;
        zzflnVar2 = ((zzdve) this.zzd.get(zzflnVar)).zzb;
        if (this.zza.containsKey(zzflnVar2)) {
            if (true != z8) {
                str = "f.";
            } else {
                str = "s.";
            }
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflnVar2)).longValue();
            zzdux zzduxVar = this.zzb;
            Map map = this.zzd;
            Map zzb = zzduxVar.zzb();
            str2 = ((zzdve) map.get(zzflnVar)).zza;
            zzb.put("label.".concat(str2), str.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzd(zzfln zzflnVar, String str) {
        if (this.zza.containsKey(zzflnVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflnVar)).longValue();
            zzdux zzduxVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzduxVar.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzflnVar)) {
            zze(zzflnVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdC(zzfln zzflnVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdD(zzfln zzflnVar, String str, Throwable th) {
        if (this.zza.containsKey(zzflnVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflnVar)).longValue();
            zzdux zzduxVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzduxVar.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzflnVar)) {
            zze(zzflnVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflu
    public final void zzdE(zzfln zzflnVar, String str) {
        this.zza.put(zzflnVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
