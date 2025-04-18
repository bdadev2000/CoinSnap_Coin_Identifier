package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
final class zzmc implements Iterator {
    private int zza;
    private boolean zzb;
    private Iterator zzc;
    private final /* synthetic */ zzlv zzd;

    private final Iterator zza() {
        Map map;
        if (this.zzc == null) {
            map = this.zzd.zzc;
            this.zzc = map.entrySet().iterator();
        }
        return this.zzc;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10;
        Map map;
        int i11 = this.zza + 1;
        i10 = this.zzd.zzb;
        if (i11 >= i10) {
            map = this.zzd.zzc;
            if (map.isEmpty() || !zza().hasNext()) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        int i10;
        Object[] objArr;
        this.zzb = true;
        int i11 = this.zza + 1;
        this.zza = i11;
        i10 = this.zzd.zzb;
        if (i11 < i10) {
            objArr = this.zzd.zza;
            return (zzlz) objArr[this.zza];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i10;
        if (this.zzb) {
            this.zzb = false;
            this.zzd.zzg();
            int i11 = this.zza;
            i10 = this.zzd.zzb;
            if (i11 < i10) {
                zzlv zzlvVar = this.zzd;
                int i12 = this.zza;
                this.zza = i12 - 1;
                zzlvVar.zzb(i12);
                return;
            }
            zza().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    private zzmc(zzlv zzlvVar) {
        this.zzd = zzlvVar;
        this.zza = -1;
    }
}
