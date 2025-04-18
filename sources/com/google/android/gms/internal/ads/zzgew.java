package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgew extends zzgey {
    public zzgew(zzgas zzgasVar, boolean z2) {
        super(zzgasVar, z2);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgey
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzgbn.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgex zzgexVar = (zzgex) it.next();
            zza.add(zzgexVar != null ? zzgexVar.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
