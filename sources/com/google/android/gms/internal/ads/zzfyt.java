package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes3.dex */
public final class zzfyt {
    public static zzfyp zza(zzfyp zzfypVar) {
        return ((zzfypVar instanceof zzfys) || (zzfypVar instanceof zzfyq)) ? zzfypVar : zzfypVar instanceof Serializable ? new zzfyq(zzfypVar) : new zzfys(zzfypVar);
    }
}
