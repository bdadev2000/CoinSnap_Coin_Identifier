package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
abstract class zzfvz implements Iterator {
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z10;
        if (this.zzb != 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzfwq.zzk(z10);
        int i10 = this.zzb;
        int i11 = i10 - 1;
        if (i10 != 0) {
            if (i11 == 0) {
                return true;
            }
            if (i11 != 2) {
                this.zzb = 4;
                this.zza = zza();
                if (this.zzb != 3) {
                    this.zzb = 1;
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.zzb = 2;
            Object obj = this.zza;
            this.zza = null;
            return obj;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
