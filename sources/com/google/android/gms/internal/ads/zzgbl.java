package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzgbl extends zzgdi {
    private Object zza;

    public zzgbl(Object obj) {
        this.zza = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.zza;
        this.zza = this;
        if (obj != this) {
            return obj;
        }
        throw new NoSuchElementException();
    }
}
