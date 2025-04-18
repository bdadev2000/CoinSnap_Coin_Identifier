package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzgs extends zzgan {
    private final Map zza;

    public zzgs(Map map) {
        this.zza = map;
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean containsKey(@Nullable Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean containsValue(@Nullable Object obj) {
        return super.zzd(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final Set entrySet() {
        return zzgcz.zzc(this.zza.entrySet(), new zzfya() { // from class: com.google.android.gms.internal.ads.zzgq
            @Override // com.google.android.gms.internal.ads.zzfya
            public final boolean zza(Object obj) {
                return ((Map.Entry) obj).getKey() != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean equals(@Nullable Object obj) {
        return obj != null && super.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    @Nullable
    public final /* synthetic */ Object get(@Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.zza.get(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final int hashCode() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final boolean isEmpty() {
        if (this.zza.isEmpty()) {
            return true;
        }
        return super.size() == 1 && super.containsKey(null);
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final Set keySet() {
        return zzgcz.zzc(this.zza.keySet(), new zzfya() { // from class: com.google.android.gms.internal.ads.zzgr
            @Override // com.google.android.gms.internal.ads.zzfya
            public final boolean zza(Object obj) {
                return ((String) obj) != null;
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzgan, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }

    @Override // com.google.android.gms.internal.ads.zzgan, com.google.android.gms.internal.ads.zzgao
    public final /* synthetic */ Object zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgan
    public final Map zzb() {
        return this.zza;
    }
}
