package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzhz extends zzib {
    private int zza = 0;
    private final int zzb;
    private final /* synthetic */ zzia zzc;

    public zzhz(zzia zziaVar) {
        this.zzc = zziaVar;
        this.zzb = zziaVar.zzb();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza < this.zzb) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zzig
    public final byte zza() {
        int i9 = this.zza;
        if (i9 < this.zzb) {
            this.zza = i9 + 1;
            return this.zzc.zzb(i9);
        }
        throw new NoSuchElementException();
    }
}
