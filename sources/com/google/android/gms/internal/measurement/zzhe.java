package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* loaded from: classes3.dex */
final class zzhe extends ContentObserver {
    public zzhe(zzhc zzhcVar, Handler handler) {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        zzhj.zzc();
    }
}
