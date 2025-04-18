package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zzfxk {
    public static zzfxg zza(zzfxg zzfxgVar) {
        if (!(zzfxgVar instanceof zzfxj) && !(zzfxgVar instanceof zzfxh)) {
            if (zzfxgVar instanceof Serializable) {
                return new zzfxh(zzfxgVar);
            }
            return new zzfxj(zzfxgVar);
        }
        return zzfxgVar;
    }
}
