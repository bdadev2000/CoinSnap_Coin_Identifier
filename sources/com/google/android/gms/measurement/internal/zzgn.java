package com.google.android.gms.measurement.internal;

import android.support.v4.media.d;
import com.facebook.internal.security.CertificateUtil;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgn implements Runnable {
    private final /* synthetic */ int zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ Object zzc;
    private final /* synthetic */ Object zzd;
    private final /* synthetic */ Object zze;
    private final /* synthetic */ zzgo zzf;

    public zzgn(zzgo zzgoVar, int i2, String str, Object obj, Object obj2, Object obj3) {
        this.zza = i2;
        this.zzb = str;
        this.zzc = obj;
        this.zzd = obj2;
        this.zze = obj3;
        this.zzf = zzgoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        char c2;
        long j2;
        char c3;
        long j3;
        zzha zzn = this.zzf.zzu.zzn();
        if (!zzn.zzaf()) {
            this.zzf.zza(6, "Persisted config not initialized. Not logging error/warn");
            return;
        }
        c2 = this.zzf.zza;
        if (c2 == 0) {
            if (this.zzf.zze().zzz()) {
                this.zzf.zza = 'C';
            } else {
                this.zzf.zza = 'c';
            }
        }
        j2 = this.zzf.zzb;
        if (j2 < 0) {
            this.zzf.zzb = 106000L;
        }
        char charAt = "01VDIWEA?".charAt(this.zza);
        c3 = this.zzf.zza;
        j3 = this.zzf.zzb;
        String zza = zzgo.zza(true, this.zzb, this.zzc, this.zzd, this.zze);
        StringBuilder sb = new StringBuilder("2");
        sb.append(charAt);
        sb.append(c3);
        sb.append(j3);
        String r2 = d.r(sb, CertificateUtil.DELIMITER, zza);
        if (r2.length() > 1024) {
            r2 = this.zzb.substring(0, 1024);
        }
        zzhe zzheVar = zzn.zzb;
        if (zzheVar != null) {
            zzheVar.zza(r2, 1L);
        }
    }
}
