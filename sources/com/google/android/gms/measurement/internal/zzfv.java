package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.MBridgeConstans;
import x0.AbstractC2914a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzfv implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzfw zzf;

    public zzfv(zzfw zzfwVar, int i9, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i9;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzfwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c9;
        long j7;
        char c10;
        long j9;
        zzgh zzn = this.zzf.zzu.zzn();
        if (zzn.zzaf()) {
            c9 = this.zzf.zza;
            if (c9 == 0) {
                if (this.zzf.zze().zzy()) {
                    this.zzf.zza = 'C';
                } else {
                    this.zzf.zza = 'c';
                }
            }
            j7 = this.zzf.zzb;
            if (j7 < 0) {
                this.zzf.zzb = 97001L;
            }
            char charAt = "01VDIWEA?".charAt(this.zza);
            c10 = this.zzf.zza;
            j9 = this.zzf.zzb;
            String zza = zzfw.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
            StringBuilder sb = new StringBuilder(MBridgeConstans.API_REUQEST_CATEGORY_APP);
            sb.append(charAt);
            sb.append(c10);
            sb.append(j9);
            String h6 = AbstractC2914a.h(sb, ":", zza);
            if (h6.length() > 1024) {
                h6 = this.zzb.substring(0, 1024);
            }
            zzgl zzglVar = zzn.zzb;
            if (zzglVar != null) {
                zzglVar.zza(h6, 1L);
                return;
            }
            return;
        }
        this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
    }
}
