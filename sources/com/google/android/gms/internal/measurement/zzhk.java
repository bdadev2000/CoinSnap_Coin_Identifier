package com.google.android.gms.internal.measurement;

import d4.AbstractC2186n;
import d4.C2182j;
import d4.s;
import java.util.Collection;

/* loaded from: classes2.dex */
public final class zzhk {
    private final boolean zza;

    public zzhk(zzhn zzhnVar) {
        if (zzhnVar != null) {
            this.zza = !zzhnVar.zza();
            return;
        }
        throw new NullPointerException("BuildInfo must be non-null");
    }

    public final boolean zza(String str) {
        if (str != null) {
            if (!this.zza) {
                return true;
            }
            C2182j listIterator = ((AbstractC2186n) ((s) zzhm.zza.get()).b.values()).listIterator(0);
            while (listIterator.hasNext()) {
                if (((Collection) listIterator.next()).contains(str)) {
                    return true;
                }
            }
            return false;
        }
        throw new NullPointerException("flagName must not be null");
    }
}
