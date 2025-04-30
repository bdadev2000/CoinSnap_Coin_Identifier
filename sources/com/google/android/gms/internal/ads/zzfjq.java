package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzfjq {
    private final HashMap zza = new HashMap();

    public final zzfjp zza(zzfjg zzfjgVar, Context context, zzfiy zzfiyVar, zzfjw zzfjwVar) {
        zzfjp zzfjpVar = (zzfjp) this.zza.get(zzfjgVar);
        if (zzfjpVar == null) {
            zzfjd zzfjdVar = new zzfjd(zzfjj.zza(zzfjgVar, context));
            zzfjp zzfjpVar2 = new zzfjp(zzfjdVar, new zzfjy(zzfjdVar, zzfiyVar, zzfjwVar));
            this.zza.put(zzfjgVar, zzfjpVar2);
            return zzfjpVar2;
        }
        return zzfjpVar;
    }
}
