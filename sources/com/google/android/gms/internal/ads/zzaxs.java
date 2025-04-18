package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzaxs extends zzayc {
    private List zzh;
    private final Context zzi;

    public zzaxs(zzawo zzawoVar, String str, String str2, zzasm zzasmVar, int i2, int i3, Context context) {
        super(zzawoVar, "mh3tdFapbE/sJv8Vo+tGtSqGob+34XuR/yQkwrU1NOisAE1Jls0cSJi5Lk8Oid+3", "sgSNHgqJ9EwYu8w2dMx3zRGSIiO9D1spUgPO3F51srA=", zzasmVar, i2, 31);
        this.zzh = null;
        this.zzi = context;
    }

    @Override // com.google.android.gms.internal.ads.zzayc
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zzd.zzW(-1L);
        this.zzd.zzS(-1L);
        Context context = this.zzi;
        if (context == null) {
            context = this.zza.zzb();
        }
        if (this.zzh == null) {
            this.zzh = (List) this.zze.invoke(null, context);
        }
        List list = this.zzh;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.zzd) {
            this.zzd.zzW(((Long) this.zzh.get(0)).longValue());
            this.zzd.zzS(((Long) this.zzh.get(1)).longValue());
        }
    }
}
