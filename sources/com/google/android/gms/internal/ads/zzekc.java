package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzekc implements zzgfk {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfgk zzb;
    final /* synthetic */ zzfgh zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfnc zze;
    final /* synthetic */ zzfgt zzf;
    final /* synthetic */ zzeke zzg;

    public zzekc(zzeke zzekeVar, long j2, zzfgk zzfgkVar, zzfgh zzfghVar, String str, zzfnc zzfncVar, zzfgt zzfgtVar) {
        this.zza = j2;
        this.zzb = zzfgkVar;
        this.zzc = zzfghVar;
        this.zzd = str;
        this.zze = zzfncVar;
        this.zzf = zzfgtVar;
        this.zzg = zzekeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgfk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzekc.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgfk
    public final void zzb(Object obj) {
        Clock clock;
        boolean z2;
        boolean z3;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzegp zzegpVar;
        LinkedHashMap linkedHashMap2;
        zzekg zzekgVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            try {
                zzeke zzekeVar = this.zzg;
                z2 = zzekeVar.zze;
                if (z2) {
                    zzekgVar = zzekeVar.zzb;
                    zzekgVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
                }
                zzeke zzekeVar2 = this.zzg;
                z3 = zzekeVar2.zzg;
                if (z3) {
                    return;
                }
                zzq = zzekeVar2.zzq(this.zzc);
                if (zzq) {
                    linkedHashMap2 = this.zzg.zzd;
                    ((zzekd) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
                } else {
                    linkedHashMap = this.zzg.zzd;
                    zzfgh zzfghVar = this.zzc;
                    linkedHashMap.put(zzfghVar, new zzekd(this.zzd, zzfghVar.zzaf, 0, elapsedRealtime, null));
                }
                zzegpVar = this.zzg.zzf;
                zzegpVar.zzg(this.zzc, elapsedRealtime, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
