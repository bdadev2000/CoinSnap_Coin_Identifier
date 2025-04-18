package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzcdk implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    @Nullable
    public final zzcdj zza(zzccf zzccfVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdj zzcdjVar = (zzcdj) it.next();
            if (zzcdjVar.zza == zzccfVar) {
                return zzcdjVar;
            }
        }
        return null;
    }

    public final void zzb(zzcdj zzcdjVar) {
        this.zza.add(zzcdjVar);
    }

    public final void zzc(zzcdj zzcdjVar) {
        this.zza.remove(zzcdjVar);
    }

    public final boolean zzd(zzccf zzccfVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdj zzcdjVar = (zzcdj) it.next();
            if (zzcdjVar.zza == zzccfVar) {
                arrayList.add(zzcdjVar);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((zzcdj) it2.next()).zzb.zzf();
        }
        return true;
    }
}
