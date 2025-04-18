package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes3.dex */
public abstract class zzftw implements Closeable {
    public static zzfui zza() {
        return new zzfui();
    }

    public static zzfui zzb(final int i2, zzfuh zzfuhVar) {
        return new zzfui(new zzfyp() { // from class: com.google.android.gms.internal.ads.zzftu
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i2);
                return valueOf;
            }
        }, new zzfyp() { // from class: com.google.android.gms.internal.ads.zzftv
            @Override // com.google.android.gms.internal.ads.zzfyp
            public final Object zza() {
                return zzftw.zze();
            }
        }, zzfuhVar);
    }

    public static zzfui zzc(zzfyp<Integer> zzfypVar, zzfyp<Integer> zzfypVar2, zzfuh zzfuhVar) {
        return new zzfui(zzfypVar, zzfypVar2, zzfuhVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
