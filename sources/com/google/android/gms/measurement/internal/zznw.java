package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
final class zznw {
    private String zza;
    private Map<String, String> zzb;

    @NonNull
    private zznt zzc;

    public zznw(String str, zznt zzntVar) {
        this.zza = str;
        this.zzc = zzntVar;
    }

    public final zznt zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    @NonNull
    public final Map<String, String> zzc() {
        Map<String, String> map = this.zzb;
        if (map == null) {
            return Collections.emptyMap();
        }
        return map;
    }

    public zznw(String str, Map<String, String> map, zznt zzntVar) {
        this.zza = str;
        this.zzb = map;
        this.zzc = zzntVar;
    }
}
