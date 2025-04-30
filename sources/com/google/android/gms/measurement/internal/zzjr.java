package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzjr extends zzat {
    private final /* synthetic */ zziv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzjr(zziv zzivVar, zzil zzilVar) {
        super(zzilVar);
        this.zza = zzivVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzat
    public final void zzb() {
        zzat zzatVar;
        if (this.zza.zzu.zzah()) {
            zzatVar = this.zza.zzp;
            zzatVar.zza(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
