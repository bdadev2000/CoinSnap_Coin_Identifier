package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfre;
import com.google.android.gms.internal.ads.zzfsl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzi implements zzfsl {
    final /* synthetic */ zzj zza;

    public zzi(zzj zzjVar) {
        this.zza = zzjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zza(int i9, long j7) {
        zzfre zzfreVar;
        zzfreVar = this.zza.zzi;
        zzfreVar.zzd(i9, System.currentTimeMillis() - j7);
    }

    @Override // com.google.android.gms.internal.ads.zzfsl
    public final void zzb(int i9, long j7, String str) {
        zzfre zzfreVar;
        zzfreVar = this.zza.zzi;
        zzfreVar.zze(i9, System.currentTimeMillis() - j7, str);
    }
}
