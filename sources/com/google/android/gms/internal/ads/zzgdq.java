package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzgdq extends zzgds {
    public zzgdq(zzfzj zzfzjVar, boolean z10) {
        super(zzfzjVar, z10);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgds
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        Object obj;
        ArrayList zza = zzgae.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgdr zzgdrVar = (zzgdr) it.next();
            if (zzgdrVar != null) {
                obj = zzgdrVar.zza;
            } else {
                obj = null;
            }
            zza.add(obj);
        }
        return Collections.unmodifiableList(zza);
    }
}
