package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class zzgw extends ContentObserver {
    private final /* synthetic */ zzgu zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgw(zzgu zzguVar, Handler handler) {
        super(null);
        this.zza = zzguVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        this.zza.zzd();
    }
}
