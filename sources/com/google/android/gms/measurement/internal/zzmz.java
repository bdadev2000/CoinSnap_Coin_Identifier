package com.google.android.gms.measurement.internal;

import androidx.annotation.NonNull;
import java.util.Map;

/* loaded from: classes2.dex */
final class zzmz {
    private String zza;
    private Map<String, String> zzb;

    @NonNull
    private int zzc;

    public zzmz(String str, int i9) {
        this.zza = str;
        this.zzc = i9;
    }

    public final int zza() {
        return this.zzc;
    }

    public final String zzb() {
        return this.zza;
    }

    public final Map<String, String> zzc() {
        return this.zzb;
    }

    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;Ljava/lang/Integer;)V */
    public zzmz(String str, Map map, int i9) {
        this.zza = str;
        this.zzb = map;
        this.zzc = i9;
    }
}
