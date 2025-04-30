package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzfxy {
    private final String zza;
    private final zzfxw zzb;
    private zzfxw zzc;

    public /* synthetic */ zzfxy(String str, zzfxx zzfxxVar) {
        zzfxw zzfxwVar = new zzfxw();
        this.zzb = zzfxwVar;
        this.zzc = zzfxwVar;
        str.getClass();
        this.zza = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfxw zzfxwVar = this.zzb.zzb;
        String str = "";
        while (zzfxwVar != null) {
            Object obj = zzfxwVar.zza;
            sb.append(str);
            if (obj != null && obj.getClass().isArray()) {
                sb.append((CharSequence) Arrays.deepToString(new Object[]{obj}), 1, r2.length() - 1);
            } else {
                sb.append(obj);
            }
            zzfxwVar = zzfxwVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfxy zza(Object obj) {
        zzfxw zzfxwVar = new zzfxw();
        this.zzc.zzb = zzfxwVar;
        this.zzc = zzfxwVar;
        zzfxwVar.zza = obj;
        return this;
    }
}
