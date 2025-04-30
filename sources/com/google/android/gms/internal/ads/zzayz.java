package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzayz extends zzazs {
    private final Map zzi;
    private final View zzj;
    private final Context zzk;

    public zzayz(zzaye zzayeVar, String str, String str2, zzatp zzatpVar, int i9, int i10, Map map, View view, Context context) {
        super(zzayeVar, "SKSJAjN3UKeguXyEasCGg04d/yJuUN8XZYgactMp4rfMtHcIJcD0mydl5RKvI49M", "lnMUlT0qopStslq/RfZHkyvg0xAUTVuMPsMot4SEaYA=", zzatpVar, i9, 85);
        this.zzi = map;
        this.zzj = view;
        this.zzk = context;
    }

    private final long zzc(int i9) {
        Map map = this.zzi;
        Integer valueOf = Integer.valueOf(i9);
        if (map.containsKey(valueOf)) {
            return ((Long) this.zzi.get(valueOf)).longValue();
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzazs
    public final void zza() throws IllegalAccessException, InvocationTargetException {
        long[] jArr = {zzc(1), zzc(2)};
        Context context = this.zzk;
        if (context == null) {
            context = this.zzb.zzb();
        }
        long[] jArr2 = (long[]) this.zzf.invoke(null, jArr, context, this.zzj);
        long j7 = jArr2[0];
        this.zzi.put(1, Long.valueOf(jArr2[1]));
        long j9 = jArr2[2];
        this.zzi.put(2, Long.valueOf(jArr2[3]));
        synchronized (this.zze) {
            this.zze.zzx(j7);
            this.zze.zzw(j9);
        }
    }
}
