package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfqz;
import com.google.android.gms.internal.ads.zzfsc;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzi implements zzfsc {
    final /* synthetic */ zzj zza;

    public zzi(zzj zzjVar) {
        this.zza = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zza(int i2, long j2) {
        zzfqz zzfqzVar;
        zzfqzVar = this.zza.zzi;
        zzfqzVar.zzd(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.zzfsc
    public final void zzb(int i2, long j2, String str) {
        zzfqz zzfqzVar;
        zzfqzVar = this.zza.zzi;
        zzfqzVar.zze(i2, System.currentTimeMillis() - j2, str);
    }
}
