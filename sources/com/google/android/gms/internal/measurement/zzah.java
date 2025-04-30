package com.google.android.gms.internal.measurement;

import com.mbridge.msdk.foundation.entity.o;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzah implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzaf zzb;

    public zzah(zzaf zzafVar) {
        this.zzb = zzafVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.zza < this.zzb.zzb()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        if (this.zza < this.zzb.zzb()) {
            zzaf zzafVar = this.zzb;
            int i9 = this.zza;
            this.zza = i9 + 1;
            return zzafVar.zza(i9);
        }
        throw new NoSuchElementException(o.h(this.zza, "Out of bounds index: "));
    }
}
