package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzcfi implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    @Nullable
    public final zzcfh zza(zzcee zzceeVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcfh zzcfhVar = (zzcfh) it.next();
            if (zzcfhVar.zza == zzceeVar) {
                return zzcfhVar;
            }
        }
        return null;
    }

    public final void zzb(zzcfh zzcfhVar) {
        this.zza.add(zzcfhVar);
    }

    public final void zzc(zzcfh zzcfhVar) {
        this.zza.remove(zzcfhVar);
    }

    public final boolean zzd(zzcee zzceeVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcfh zzcfhVar = (zzcfh) it.next();
            if (zzcfhVar.zza == zzceeVar) {
                arrayList.add(zzcfhVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcfh) it2.next()).zzb.zzf();
        }
        return true;
    }
}
