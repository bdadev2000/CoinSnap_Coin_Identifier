package com.google.android.gms.internal.ads;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzaaw implements zzcu {
    private final zzdr zza;

    public zzaaw(zzdr zzdrVar) {
        this.zza = zzdrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcu
    public final zzcv zza(Context context, zzt zztVar, zzw zzwVar, zzdt zzdtVar, Executor executor, List list, long j7) throws zzdq {
        try {
            try {
                return ((zzcu) Class.forName("androidx.media3.effect.PreviewingSingleInputVideoGraph$Factory").getConstructor(zzdr.class).newInstance(this.zza)).zza(context, zztVar, zzwVar, zzdtVar, executor, list, 0L);
            } catch (Exception e4) {
                e = e4;
                if (e instanceof zzdq) {
                    throw ((zzdq) e);
                }
                throw new zzdq(e, C.TIME_UNSET);
            }
        } catch (Exception e9) {
            e = e9;
        }
    }
}
