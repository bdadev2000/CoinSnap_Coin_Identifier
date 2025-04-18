package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzaxa extends zzaxt {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzaxa(zzawf zzawfVar, String str, String str2, zzasf zzasfVar, int i10, int i11, Map map, View view, Context context) {
        super(zzawfVar, "SSi9+bc4LjSDCw5XbM9a3o0KjM00NEx8AzpqWTmGrN6ZCy4DwzQ9YQ8F3uOviR+R", "vovSRMWoC6DyReNhMsLU/AHhR3bWlWI4SOQQixDW2Zg=", zzasfVar, i10, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzc(int i10) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i10);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzh.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzaxt
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context context = this.zzj;
        if (context == null) {
            context = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, context, this.zzi);
        long j3 = jArr2[0];
        this.zzh.put(1, Long.valueOf(jArr2[1]));
        long j10 = jArr2[2];
        this.zzh.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zzd) {
            this.zzd.zzv(j3);
            this.zzd.zzu(j10);
        }
    }
}
