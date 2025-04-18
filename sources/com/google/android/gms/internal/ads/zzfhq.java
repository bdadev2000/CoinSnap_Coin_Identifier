package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class zzfhq {
    private final HashMap zza = new HashMap();

    public final zzfhp zza(zzfhg zzfhgVar, Context context, zzfgy zzfgyVar, zzfhw zzfhwVar) {
        zzfhp zzfhpVar = (zzfhp) this.zza.get(zzfhgVar);
        if (zzfhpVar == null) {
            zzfhd zzfhdVar = new zzfhd(zzfhj.zza(zzfhgVar, context));
            zzfhp zzfhpVar2 = new zzfhp(zzfhdVar, new zzfhy(zzfhdVar, zzfgyVar, zzfhwVar));
            this.zza.put(zzfhgVar, zzfhpVar2);
            return zzfhpVar2;
        }
        return zzfhpVar;
    }
}
