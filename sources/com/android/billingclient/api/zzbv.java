package com.android.billingclient.api;

/* loaded from: classes3.dex */
public final class zzbv {
    private boolean zza;

    private zzbv() {
    }

    public /* synthetic */ zzbv(zzbu zzbuVar) {
    }

    public final zzbv zza() {
        this.zza = true;
        return this;
    }

    public final zzbx zzb() {
        if (this.zza) {
            return new zzbx(true, false, null);
        }
        throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
    }
}
