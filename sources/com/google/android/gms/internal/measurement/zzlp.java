package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzlp extends zzlm {
    public zzlp() {
        super();
    }

    @Override // com.google.android.gms.internal.measurement.zzlm
    public final void zzd() {
        if (!zze()) {
            for (int i9 = 0; i9 < zza(); i9++) {
                Map.Entry zza = zza(i9);
                if (((zzjf) zza.getKey()).zze()) {
                    zza.setValue(Collections.unmodifiableList((List) zza.getValue()));
                }
            }
            for (Map.Entry entry : zzb()) {
                if (((zzjf) entry.getKey()).zze()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzd();
    }
}
