package com.google.android.gms.measurement.internal;

import androidx.annotation.WorkerThread;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class zznk extends zzav {
    private final /* synthetic */ zznh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zznk(zznh zznhVar, zzjc zzjcVar) {
        super(zzjcVar);
        this.zza = zznhVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzav
    @WorkerThread
    public final void zzb() {
        zznh.zza(this.zza);
    }
}
