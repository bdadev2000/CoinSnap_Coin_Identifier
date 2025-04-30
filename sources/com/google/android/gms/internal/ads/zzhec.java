package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzhec extends zzhem {
    public zzhec(int i9) {
        super(i9, null);
    }

    @Override // com.google.android.gms.internal.ads.zzhem
    public final void zza() {
        if (!zzj()) {
            for (int i9 = 0; i9 < zzb(); i9++) {
                Map.Entry zzg = zzg(i9);
                if (((zzhbc) zzg.getKey()).zzg()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzhbc) entry.getKey()).zzg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
