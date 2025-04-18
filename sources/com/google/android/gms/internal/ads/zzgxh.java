package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgxh extends zzgxi {
    final /* synthetic */ zzgxp zza;
    private int zzb = 0;
    private final int zzc;

    public zzgxh(zzgxp zzgxpVar) {
        this.zza = zzgxpVar;
        this.zzc = zzgxpVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxk
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 < this.zzc) {
            this.zzb = i10 + 1;
            return this.zza.zzb(i10);
        }
        throw new NoSuchElementException();
    }
}
