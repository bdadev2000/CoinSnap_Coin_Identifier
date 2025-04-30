package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public abstract class zzfzd extends zzgdi {
    private Object zza;
    private int zzb = 2;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        boolean z8;
        if (this.zzb != 4) {
            z8 = true;
        } else {
            z8 = false;
        }
        zzfyg.zzj(z8);
        int i9 = this.zzb;
        int i10 = i9 - 1;
        if (i9 != 0) {
            if (i10 == 0) {
                return true;
            }
            if (i10 != 2) {
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

    public abstract Object zza();

    public final Object zzb() {
        this.zzb = 3;
        return null;
    }
}
