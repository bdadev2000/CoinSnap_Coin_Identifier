package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* loaded from: classes3.dex */
final class zzaep implements zzaef {
    public final String zza;

    private zzaep(String str) {
        this.zza = str;
    }

    public static zzaep zzb(zzed zzedVar) {
        return new zzaep(zzedVar.zzB(zzedVar.zzb(), StandardCharsets.UTF_8));
    }

    @Override // com.google.android.gms.internal.ads.zzaef
    public final int zza() {
        return 1852994675;
    }
}
