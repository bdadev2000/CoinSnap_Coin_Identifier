package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;

/* loaded from: classes3.dex */
public final class zzaxd extends zzaxt {
    private final zzavx zzh;

    public zzaxd(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, zzavx zzavxVar) {
        super(zzawfVar, "InzZioUCViOMoBpQHwvu/pIx3gXrXGOaM2JpzEjvxDIhnjzi/kaCZRYG9Kg1JwVe", "n5HdSerkTAgTJwRh00NQA14abEqPXtGNhLU/oVUfpWQ=", zzasfVar, i10, 94);
        this.zzh = zzavxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        int intValue = ((Integer) this.zze.invoke(null, this.zzh.zza())).intValue();
        synchronized (this.zzd) {
            this.zzd.zzae(zzasr.zza(intValue));
        }
    }
}
