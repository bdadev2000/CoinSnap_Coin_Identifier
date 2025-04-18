package com.google.android.gms.internal.measurement;

import android.support.v4.media.d;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzah implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzaf zzb;

    public zzah(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza < this.zzb.zzb();
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.zza >= this.zzb.zzb()) {
            throw new NoSuchElementException(d.i("Out of bounds index: ", this.zza));
        }
        zzaf zzafVar = this.zzb;
        int i2 = this.zza;
        this.zza = i2 + 1;
        return zzafVar.zza(i2);
    }
}
