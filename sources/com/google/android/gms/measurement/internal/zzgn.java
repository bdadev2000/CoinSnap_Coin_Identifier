package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.MBridgeConstans;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import vd.e;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgn implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzgo zzf;

    public zzgn(zzgo zzgoVar, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i10;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c10;
        long j3;
        char c11;
        long j10;
        zzha zzn = this.zzf.zzu.zzn();
        if (zzn.zzaf()) {
            c10 = this.zzf.zza;
            if (c10 == 0) {
                if (this.zzf.zze().zzz()) {
                    this.zzf.zza = 'C';
                } else {
                    this.zzf.zza = 'c';
                }
            }
            j3 = this.zzf.zzb;
            if (j3 < 0) {
                this.zzf.zzb = 106000L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            c11 = this.zzf.zza;
            j10 = this.zzf.zzb;
            String zza = zzgo.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb2 = new StringBuilder(MBridgeConstans.API_REUQEST_CATEGORY_APP);
            sb2.append(charAt);
            sb2.append(c11);
            sb2.append(j10);
            String h10 = e.h(sb2, ":", zza);
            if (h10.length() > 1024) {
                h10 = this.zzb.substring(0, LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
            }
            zzhe zzheVar = zzn.zzb;
            if (zzheVar != null) {
                zzheVar.zza(h10, 1L);
                return;
            }
            return;
        }
        this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
    }
}
