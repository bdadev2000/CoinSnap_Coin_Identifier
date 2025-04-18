package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes3.dex */
public abstract class zzfsm implements Closeable {
    public static zzfsy zza() {
        return new zzfsy();
    }

    public static zzfsy zzb(final int i10, zzfsx zzfsxVar) {
        return new zzfsy(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsk
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i10);
                return valueOf;
            }
        }, new zzfxg() { // from class: com.google.android.gms.internal.ads.zzfsl
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                return zzfsm.zze();
            }
        }, zzfsxVar);
    }

    public static zzfsy zzc(zzfxg<Integer> zzfxgVar, zzfxg<Integer> zzfxgVar2, zzfsx zzfsxVar) {
        return new zzfsy(zzfxgVar, zzfxgVar2, zzfsxVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
