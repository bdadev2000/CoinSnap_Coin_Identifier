package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
final class zzau implements Iterator<zzaq> {
    private int zza = 0;
    private final /* synthetic */ zzas zzb;

    public zzau(zzas zzasVar) {
        this.zzb = zzasVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        String str;
        int i9 = this.zza;
        str = this.zzb.zza;
        if (i9 < str.length()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ zzaq next() {
        String str;
        String str2;
        int i9 = this.zza;
        str = this.zzb.zza;
        if (i9 < str.length()) {
            str2 = this.zzb.zza;
            int i10 = this.zza;
            this.zza = i10 + 1;
            return new zzas(String.valueOf(str2.charAt(i10)));
        }
        throw new NoSuchElementException();
    }
}
