package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgzr extends zzgzt {
    final /* synthetic */ zzhac zza;
    private int zzb = 0;
    private final int zzc;

    public zzgzr(zzhac zzhacVar) {
        this.zza = zzhacVar;
        this.zzc = zzhacVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzv
    public final byte zza() {
        int i9 = this.zzb;
        if (i9 < this.zzc) {
            this.zzb = i9 + 1;
            return this.zza.zzb(i9);
        }
        throw new NoSuchElementException();
    }
}
