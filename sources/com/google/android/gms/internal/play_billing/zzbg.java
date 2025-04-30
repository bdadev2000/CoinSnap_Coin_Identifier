package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzbg extends zzbi {
    final /* synthetic */ zzbq zza;
    private int zzb = 0;
    private final int zzc;

    public zzbg(zzbq zzbqVar) {
        this.zza = zzbqVar;
        this.zzc = zzbqVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbk
    public final byte zza() {
        int i9 = this.zzb;
        if (i9 < this.zzc) {
            this.zzb = i9 + 1;
            return this.zza.zzb(i9);
        }
        throw new NoSuchElementException();
    }
}
