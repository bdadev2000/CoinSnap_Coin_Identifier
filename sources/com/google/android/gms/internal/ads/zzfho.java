package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public final class zzfho implements zzfhm {
    private final String zza;

    public zzfho(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfhm
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfho)) {
            return false;
        }
        return this.zza.equals(((zzfho) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfhm
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
