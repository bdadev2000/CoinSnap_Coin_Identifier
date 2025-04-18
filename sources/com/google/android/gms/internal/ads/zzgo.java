package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzgo extends zzfze {
    private final Map zza;

    public zzgo(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final Set entrySet() {
        return zzgbq.zzc(this.zza.entrySet(), new zzfwr() { // from class: com.google.android.gms.internal.ads.zzgm
            @Override // com.google.android.gms.internal.ads.zzfwr
            public final boolean zza(Object obj) {
                if (((Map.Entry) obj).getKey() != null) {
                    return true;
                }
                return false;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        if (super.size() == 1 && super.containsKey(null)) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final Set keySet() {
        return zzgbq.zzc(this.zza.keySet(), new zzfwr() { // from class: com.google.android.gms.internal.ads.zzgn
            @Override // com.google.android.gms.internal.ads.zzfwr
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzfze, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzfze, com.google.android.gms.internal.ads.zzfzf
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfze
    public final Map zzb() {
        return this.zza;
    }
}
