package com.google.android.gms.measurement.internal;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement@@22.1.2 */
/* loaded from: classes12.dex */
final class zznw {
    private String zza;
    private Map<String, String> zzb;
    private zznt zzc;

    public final zznt zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final Map<String, String> zzc() {
        Map<String, String> map = this.zzb;
        return map == null ? Collections.emptyMap() : map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznw(String str, zznt zzntVar) {
        this.zza = str;
        this.zzc = zzntVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zznw(String str, Map<String, String> map, zznt zzntVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzntVar;
    }
}
