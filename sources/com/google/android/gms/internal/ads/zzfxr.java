package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class zzfxr implements zzfyh {
    public static zzfxr zzc(char c9) {
        return new zzfxo(c9);
    }

    @Override // com.google.android.gms.internal.ads.zzfyh
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c9);
}
