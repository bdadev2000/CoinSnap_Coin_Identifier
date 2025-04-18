package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
final class zzges extends zzgep {
    private zzges() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final int zza(zzget zzgetVar) {
        int i2;
        int i3;
        synchronized (zzgetVar) {
            i2 = zzgetVar.remaining;
            i3 = i2 - 1;
            zzgetVar.remaining = i3;
        }
        return i3;
    }

    @Override // com.google.android.gms.internal.ads.zzgep
    public final void zzb(zzget zzgetVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgetVar) {
            try {
                set3 = zzgetVar.seenExceptions;
                if (set3 == null) {
                    zzgetVar.seenExceptions = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzges(zzger zzgerVar) {
        super(null);
    }
}
