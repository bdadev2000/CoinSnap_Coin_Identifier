package com.google.android.gms.measurement.internal;

import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzkm extends zzav {
    private final /* synthetic */ zzjq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzkm(zzjq zzjqVar, zzjc zzjcVar) {
        super(zzjcVar);
        this.zza = zzjqVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzav
    public final void zzb() {
        zzav zzavVar;
        if (this.zza.zzu.zzah()) {
            zzavVar = this.zza.zzq;
            zzavVar.zza(AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS);
        }
    }
}
