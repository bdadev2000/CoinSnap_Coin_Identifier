package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzeld implements zzgfp {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfgw zzb;
    final /* synthetic */ zzfgt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfoa zze;
    final /* synthetic */ zzfhf zzf;
    final /* synthetic */ zzelf zzg;

    public zzeld(zzelf zzelfVar, long j7, zzfgw zzfgwVar, zzfgt zzfgtVar, String str, zzfoa zzfoaVar, zzfhf zzfhfVar) {
        this.zza = j7;
        this.zzb = zzfgwVar;
        this.zzc = zzfgtVar;
        this.zzd = str;
        this.zze = zzfoaVar;
        this.zzf = zzfhfVar;
        this.zzg = zzelfVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgfp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeld.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgfp
    public final void zzb(Object obj) {
        Clock clock;
        boolean z8;
        boolean z9;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzehq zzehqVar;
        LinkedHashMap linkedHashMap2;
        zzelh zzelhVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            try {
                zzelf zzelfVar = this.zzg;
                z8 = zzelfVar.zze;
                if (z8) {
                    zzelhVar = zzelfVar.zzb;
                    zzelhVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
                }
                zzelf zzelfVar2 = this.zzg;
                z9 = zzelfVar2.zzg;
                if (z9) {
                    return;
                }
                zzq = zzelfVar2.zzq(this.zzc);
                if (zzq) {
                    linkedHashMap2 = this.zzg.zzd;
                    ((zzele) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
                } else {
                    linkedHashMap = this.zzg.zzd;
                    zzfgt zzfgtVar = this.zzc;
                    linkedHashMap.put(zzfgtVar, new zzele(this.zzd, zzfgtVar.zzag, 0, elapsedRealtime, null));
                }
                zzehqVar = this.zzg.zzf;
                zzehqVar.zzg(this.zzc, elapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
