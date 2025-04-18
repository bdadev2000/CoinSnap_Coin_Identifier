package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzhbe extends zzhbj {
    public zzhbe() {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.zzhbj
    public final void zza() {
        if (!zzj()) {
            for (int i10 = 0; i10 < zzc(); i10++) {
                Map.Entry zzg = zzg(i10);
                if (((zzgyl) ((zzhbf) zzg).zza()).zze()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzd()) {
                if (((zzgyl) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
