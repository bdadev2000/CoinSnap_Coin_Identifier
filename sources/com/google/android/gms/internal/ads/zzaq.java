package com.google.android.gms.internal.ads;

import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zzaq {
    public final zzt zza;

    public /* synthetic */ zzaq(zzt zztVar, int i9, int i10, float f9, long j7, zzap zzapVar) {
        boolean z8;
        String h6 = o.h(i9, "width must be positive, but is: ");
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzeq.zze(z8, h6);
        zzeq.zze(i10 > 0, "height must be positive, but is: " + i10);
        this.zza = zztVar;
    }
}
