package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zznf implements zznr {
    final /* synthetic */ zznc zza;

    public zznf(zznc zzncVar) {
        this.zza = zzncVar;
    }

    @Override // com.google.android.gms.measurement.internal.zznr
    public final void zza(String str, String str2, Bundle bundle) {
        zzhj zzhjVar;
        zzhj zzhjVar2;
        if (TextUtils.isEmpty(str)) {
            zzhjVar = this.zza.zzm;
            if (zzhjVar != null) {
                zzhjVar2 = this.zza.zzm;
                zzhjVar2.zzj().zzg().zza("AppId not known when logging event", str2);
                return;
            }
            return;
        }
        this.zza.zzl().zzb(new zzni(this, str, str2, bundle));
    }
}
