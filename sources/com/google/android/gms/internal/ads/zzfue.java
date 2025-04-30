package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes2.dex */
public abstract class zzfue implements Closeable {
    public static zzfuq zza() {
        return new zzfuq();
    }

    public static zzfuq zzb(final int i9, zzfup zzfupVar) {
        return new zzfuq(new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfuc
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                Integer valueOf;
                valueOf = Integer.valueOf(i9);
                return valueOf;
            }
        }, new zzfyw() { // from class: com.google.android.gms.internal.ads.zzfud
            @Override // com.google.android.gms.internal.ads.zzfyw
            public final Object zza() {
                return zzfue.zze();
            }
        }, zzfupVar);
    }

    public static zzfuq zzc(zzfyw<Integer> zzfywVar, zzfyw<Integer> zzfywVar2, zzfup zzfupVar) {
        return new zzfuq(zzfywVar, zzfywVar2, zzfupVar);
    }

    public static /* synthetic */ Integer zze() {
        return -1;
    }
}
