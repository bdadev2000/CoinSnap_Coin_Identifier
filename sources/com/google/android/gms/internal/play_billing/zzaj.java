package com.google.android.gms.internal.play_billing;

import Q7.n0;
import com.mbridge.msdk.foundation.entity.o;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaj {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzaj(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String valueOf = String.valueOf(obj3);
        String valueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(n0.l(o.o("Multiple entries with same key: ", valueOf, "=", valueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
    }
}
