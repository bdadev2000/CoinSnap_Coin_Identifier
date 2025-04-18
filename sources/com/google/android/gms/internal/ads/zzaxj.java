package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzaxj extends zzayc {
    private final Map zzh;
    private final View zzi;
    private final Context zzj;

    public zzaxj(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, Map map, View view, Context context) {
        super(zzawoVar, "8HOKLqLOucCjn3kWyyKimNsF6Dcutdd9y3ap015kDIWZNsgYbLJqzHSzKo+jDSQ4", "ikPkuPQbpnIYaQGo6Ao4zzPX0Qaf9HhmEZeT4ZfFQOg=", zzasmVar, i2, 85);
        this.zzh = map;
        this.zzi = view;
        this.zzj = context;
    }

    private final long zzc(int i2) {
        Map map = this.zzh;
        Integer valueOf = Integer.valueOf(i2);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzh.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context context = this.zzj;
        if (context == null) {
            context = this.zza.zzb();
        }
        long[] jArr2 = (long[]) this.zze.invoke(null, jArr, context, this.zzi);
        long j2 = jArr2[0];
        this.zzh.put(1, Long.valueOf(jArr2[1]));
        long j3 = jArr2[2];
        this.zzh.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zzd) {
            this.zzd.zzv(j2);
            this.zzd.zzu(j3);
        }
    }
}
