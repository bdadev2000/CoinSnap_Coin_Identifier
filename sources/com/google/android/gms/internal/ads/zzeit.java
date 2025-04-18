package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzeit implements zzgee {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfew zzb;
    final /* synthetic */ zzfet zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfln zze;
    final /* synthetic */ zzfff zzf;
    final /* synthetic */ zzeiv zzg;

    public zzeit(zzeiv zzeivVar, long j3, zzfew zzfewVar, zzfet zzfetVar, String str, zzfln zzflnVar, zzfff zzfffVar) {
        this.zza = j3;
        this.zzb = zzfewVar;
        this.zzc = zzfetVar;
        this.zzd = str;
        this.zze = zzflnVar;
        this.zzf = zzfffVar;
        this.zzg = zzeivVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgee
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(java.lang.Throwable r17) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeit.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zzb(Object obj) {
        Clock clock;
        boolean z10;
        boolean z11;
        boolean zzq;
        LinkedHashMap linkedHashMap;
        zzefg zzefgVar;
        LinkedHashMap linkedHashMap2;
        zzeix zzeixVar;
        clock = this.zzg.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (this.zzg) {
            zzeiv zzeivVar = this.zzg;
            z10 = zzeivVar.zze;
            if (z10) {
                zzeixVar = zzeivVar.zzb;
                zzeixVar.zza(this.zzb, this.zzc, 0, null, elapsedRealtime);
            }
            zzeiv zzeivVar2 = this.zzg;
            z11 = zzeivVar2.zzg;
            if (z11) {
                return;
            }
            zzq = zzeivVar2.zzq(this.zzc);
            if (zzq) {
                linkedHashMap2 = this.zzg.zzd;
                ((zzeiu) linkedHashMap2.get(this.zzc)).zzd = elapsedRealtime;
            } else {
                linkedHashMap = this.zzg.zzd;
                zzfet zzfetVar = this.zzc;
                linkedHashMap.put(zzfetVar, new zzeiu(this.zzd, zzfetVar.zzaf, 0, elapsedRealtime, null));
            }
            zzefgVar = this.zzg.zzf;
            zzefgVar.zzg(this.zzc, elapsedRealtime, null);
        }
    }
}
