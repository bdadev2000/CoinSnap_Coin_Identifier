package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzatw implements PackageManager.OnChecksumsReadyListener {
    final zzgfa zza = zzgfa.zze();

    @Override // android.content.pm.PackageManager.OnChecksumsReadyListener
    public final void onChecksumsReady(List list) {
        int type;
        byte[] value;
        if (list == null) {
            this.zza.zzc("");
            return;
        }
        try {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                ApkChecksum f10 = androidx.core.app.c.f(list.get(i10));
                type = f10.getType();
                if (type == 8) {
                    zzgfa zzgfaVar = this.zza;
                    zzgcb zzf = zzgcb.zzi().zzf();
                    value = f10.getValue();
                    zzgfaVar.zzc(zzf.zzj(value, 0, value.length));
                    return;
                }
            }
        } catch (Throwable unused) {
        }
        this.zza.zzc("");
    }
}
