package com.google.android.gms.internal.play_billing;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzer extends zzfb {
    public zzer(int i9) {
        super(i9, null);
    }

    @Override // com.google.android.gms.internal.play_billing.zzfb
    public final void zza() {
        if (!zzj()) {
            for (int i9 = 0; i9 < zzb(); i9++) {
                Map.Entry zzg = zzg(i9);
                if (((zzch) zzg.getKey()).zzg()) {
                    zzg.setValue(Collections.unmodifiableList((List) zzg.getValue()));
                }
            }
            for (Map.Entry entry : zzc()) {
                if (((zzch) entry.getKey()).zzg()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zza();
    }
}
