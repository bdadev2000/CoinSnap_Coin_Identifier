package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class zzfjo implements zzfjm {
    private final String zza;

    public zzfjo(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final boolean equals(Object obj) {
        if (!(obj instanceof zzfjo)) {
            return false;
        }
        return this.zza.equals(((zzfjo) obj).zza);
    }

    @Override // com.google.android.gms.internal.ads.zzfjm
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
