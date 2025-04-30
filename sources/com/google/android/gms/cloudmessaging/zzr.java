package com.google.android.gms.cloudmessaging;

import android.os.Bundle;

/* loaded from: classes2.dex */
final class zzr extends zzs {
    public zzr(int i9, int i10, Bundle bundle) {
        super(i9, i10, bundle);
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final void zza(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            zzd(null);
        } else {
            zzc(new zzt(4, "Invalid response to one way request", null));
        }
    }

    @Override // com.google.android.gms.cloudmessaging.zzs
    public final boolean zzb() {
        return true;
    }
}
