package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
final class zzgex extends zzgeu {
    private zzgex() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final int zza(zzgey zzgeyVar) {
        int i9;
        int i10;
        synchronized (zzgeyVar) {
            i9 = zzgeyVar.remaining;
            i10 = i9 - 1;
            zzgeyVar.remaining = i10;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgeu
    public final void zzb(zzgey zzgeyVar, Set set, Set set2) {
        Set set3;
        synchronized (zzgeyVar) {
            try {
                set3 = zzgeyVar.seenExceptions;
                if (set3 == null) {
                    zzgeyVar.seenExceptions = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public /* synthetic */ zzgex(zzgew zzgewVar) {
        super(null);
    }
}
