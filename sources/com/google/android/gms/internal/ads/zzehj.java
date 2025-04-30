package com.google.android.gms.internal.ads;

import android.content.Context;
import z0.C2968b;

/* loaded from: classes2.dex */
public final class zzehj {
    private final Context zza;

    public zzehj(Context context) {
        this.zza = context;
    }

    public final f4.c zza(boolean z8) {
        try {
            B0.a aVar = new B0.a(z8);
            C2968b a6 = C2968b.a(this.zza);
            if (a6 != null) {
                return a6.b(aVar);
            }
            return zzgft.zzg(new IllegalStateException());
        } catch (Exception e4) {
            return zzgft.zzg(e4);
        }
    }
}
