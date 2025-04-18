package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdug implements zzflh {
    private final zzdty zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdug(zzdty zzdtyVar, Set set, Clock clock) {
        zzfla zzflaVar;
        this.zzb = zzdtyVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzduf zzdufVar = (zzduf) it.next();
            Map map = this.zzd;
            zzflaVar = zzdufVar.zzc;
            map.put(zzflaVar, zzdufVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfla zzflaVar, boolean z2) {
        zzfla zzflaVar2;
        String str;
        zzflaVar2 = ((zzduf) this.zzd.get(zzflaVar)).zzb;
        if (this.zza.containsKey(zzflaVar2)) {
            String str2 = true != z2 ? "f." : "s.";
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflaVar2)).longValue();
            zzdty zzdtyVar = this.zzb;
            Map map = this.zzd;
            Map zzb = zzdtyVar.zzb();
            str = ((zzduf) map.get(zzflaVar)).zza;
            zzb.put("label.".concat(str), str2.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzd(zzfla zzflaVar, String str) {
        if (this.zza.containsKey(zzflaVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflaVar)).longValue();
            zzdty zzdtyVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdtyVar.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzflaVar)) {
            zze(zzflaVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdC(zzfla zzflaVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdD(zzfla zzflaVar, String str, Throwable th) {
        if (this.zza.containsKey(zzflaVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzflaVar)).longValue();
            zzdty zzdtyVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdtyVar.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzflaVar)) {
            zze(zzflaVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzflh
    public final void zzdE(zzfla zzflaVar, String str) {
        this.zza.put(zzflaVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
