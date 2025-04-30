package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgfb extends zzgfd {
    public zzgfb(zzgax zzgaxVar, boolean z8) {
        super(zzgaxVar, z8);
        zzv();
    }

    @Override // com.google.android.gms.internal.ads.zzgfd
    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        Object obj;
        ArrayList zza = zzgbs.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgfc zzgfcVar = (zzgfc) it.next();
            if (zzgfcVar != null) {
                obj = zzgfcVar.zza;
            } else {
                obj = null;
            }
            zza.add(obj);
        }
        return Collections.unmodifiableList(zza);
    }
}
