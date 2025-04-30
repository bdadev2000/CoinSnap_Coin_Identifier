package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
final class zzgb extends ContentObserver {
    private final /* synthetic */ zzfz zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgb(zzfz zzfzVar, Handler handler) {
        super(null);
        this.zza = zzfzVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        AtomicBoolean atomicBoolean;
        atomicBoolean = this.zza.zza;
        atomicBoolean.set(true);
    }
}
