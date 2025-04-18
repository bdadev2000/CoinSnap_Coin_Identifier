package com.google.android.gms.internal.ads;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
final class zzzu implements zzbq {
    private final zzcf zza;

    public zzzu(zzcf zzcfVar) {
        this.zza = zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbq
    public final zzbr zza(Context context, zzm zzmVar, zzp zzpVar, zzch zzchVar, Executor executor, List list, long j3) throws zzce {
        Constructor<?> constructor;
        Object[] objArr;
        try {
            constructor = Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzcf.class);
            objArr = new Object[1];
        } catch (Exception e2) {
            e = e2;
        }
        try {
            objArr[0] = this.zza;
            return ((zzbq) constructor.newInstance(objArr)).zza(context, zzmVar, zzpVar, zzchVar, executor, list, 0L);
        } catch (Exception e10) {
            e = e10;
            if (e instanceof zzce) {
                throw ((zzce) e);
            }
            throw new zzce(e, C.TIME_UNSET);
        }
    }
}
