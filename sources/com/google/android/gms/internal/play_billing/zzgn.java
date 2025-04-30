package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class zzgn implements zzcw {
    static final zzcw zza = new zzgn();

    private zzgn() {
    }

    @Override // com.google.android.gms.internal.play_billing.zzcw
    public final boolean zza(int i9) {
        zzgo zzgoVar;
        zzgo zzgoVar2 = zzgo.BROADCAST_ACTION_UNSPECIFIED;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        zzgoVar = null;
                    } else {
                        zzgoVar = zzgo.ALTERNATIVE_BILLING_ACTION;
                    }
                } else {
                    zzgoVar = zzgo.LOCAL_PURCHASES_UPDATED_ACTION;
                }
            } else {
                zzgoVar = zzgo.PURCHASES_UPDATED_ACTION;
            }
        } else {
            zzgoVar = zzgo.BROADCAST_ACTION_UNSPECIFIED;
        }
        if (zzgoVar != null) {
            return true;
        }
        return false;
    }
}
