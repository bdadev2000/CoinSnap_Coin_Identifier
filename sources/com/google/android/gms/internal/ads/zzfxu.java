package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzfxu {
    private final String zza;
    private final zzfxs zzb;
    private zzfxs zzc;

    public /* synthetic */ zzfxu(String str, zzfxt zzfxtVar) {
        zzfxs zzfxsVar = new zzfxs();
        this.zzb = zzfxsVar;
        this.zzc = zzfxsVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfxs zzfxsVar = this.zzb.zzb;
        String str = "";
        while (zzfxsVar != null) {
            Object obj = zzfxsVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            }
            zzfxsVar = zzfxsVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfxu zza(Object obj) {
        zzfxs zzfxsVar = new zzfxs();
        this.zzc.zzb = zzfxsVar;
        this.zzc = zzfxsVar;
        zzfxsVar.zza = obj;
        return this;
    }
}
