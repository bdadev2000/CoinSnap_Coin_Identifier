package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzazi extends zzazs {
    private List zzi;
    private final Context zzj;

    public zzazi(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, Context context) {
        super(zzayeVar, "/W2ZEuHT/JiI5/Zhh6jV6ATrrvF8IBtmITl+4IJczntAr46Ow/LitCqqOR0RyWN9", "0yxvRSsGg+/BBPRqwe1F54W0T+vv1NRnE+jebtT36Vo=", zzatpVar, i9, 31);
        this.zzi = null;
        this.zzj = context;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        this.zze.zzad(-1L);
        this.zze.zzY(-1L);
        Context context = this.zzj;
        if (context == null) {
            context = this.zzb.zzb();
        }
        if (this.zzi == null) {
            this.zzi = (List) this.zzf.invoke(null, context);
        }
        List list = this.zzi;
        if (list != null && list.size() == 2) {
            synchronized (this.zze) {
                this.zze.zzad(((Long) this.zzi.get(0)).longValue());
                this.zze.zzY(((Long) this.zzi.get(1)).longValue());
            }
        }
    }
}
