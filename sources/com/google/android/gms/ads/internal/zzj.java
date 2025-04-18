package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.zzfpp;
import com.google.android.gms.internal.ads.zzfqs;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzj implements zzfqs {
    final /* synthetic */ zzk zza;

    public zzj(zzk zzkVar) {
        this.zza = zzkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zza(int i10, long j3) {
        zzfpp zzfppVar;
        zzfppVar = this.zza.zzi;
        zzfppVar.zzd(i10, System.currentTimeMillis() - j3);
    }

    @Override // com.google.android.gms.internal.ads.zzfqs
    public final void zzb(int i10, long j3, String str) {
        zzfpp zzfppVar;
        zzfppVar = this.zza.zzi;
        zzfppVar.zze(i10, System.currentTimeMillis() - j3, str);
    }
}
