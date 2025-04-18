package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzdsp implements zzfjs {
    private final zzdsh zzb;
    private final Clock zzc;
    private final Map zza = new HashMap();
    private final Map zzd = new HashMap();

    public zzdsp(zzdsh zzdshVar, Set set, Clock clock) {
        zzfjl zzfjlVar;
        this.zzb = zzdshVar;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdso zzdsoVar = (zzdso) it.next();
            Map map = this.zzd;
            zzfjlVar = zzdsoVar.zzc;
            map.put(zzfjlVar, zzdsoVar);
        }
        this.zzc = clock;
    }

    private final void zze(zzfjl zzfjlVar, boolean z10) {
        zzfjl zzfjlVar2;
        String str;
        String str2;
        zzfjlVar2 = ((zzdso) this.zzd.get(zzfjlVar)).zzb;
        if (this.zza.containsKey(zzfjlVar2)) {
            if (true != z10) {
                str = "f.";
            } else {
                str = "s.";
            }
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfjlVar2)).longValue();
            zzdsh zzdshVar = this.zzb;
            Map map = this.zzd;
            Map zzb = zzdshVar.zzb();
            str2 = ((zzdso) map.get(zzfjlVar)).zza;
            zzb.put("label.".concat(str2), str.concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzd(zzfjl zzfjlVar, String str) {
        if (this.zza.containsKey(zzfjlVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfjlVar)).longValue();
            zzdsh zzdshVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdshVar.zzb().put("task.".concat(valueOf), "s.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfjlVar)) {
            zze(zzfjlVar, true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdC(zzfjl zzfjlVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdD(zzfjl zzfjlVar, String str, Throwable th2) {
        if (this.zza.containsKey(zzfjlVar)) {
            long elapsedRealtime = this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzfjlVar)).longValue();
            zzdsh zzdshVar = this.zzb;
            String valueOf = String.valueOf(str);
            zzdshVar.zzb().put("task.".concat(valueOf), "f.".concat(String.valueOf(Long.toString(elapsedRealtime))));
        }
        if (this.zzd.containsKey(zzfjlVar)) {
            zze(zzfjlVar, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfjs
    public final void zzdE(zzfjl zzfjlVar, String str) {
        this.zza.put(zzfjlVar, Long.valueOf(this.zzc.elapsedRealtime()));
    }
}
