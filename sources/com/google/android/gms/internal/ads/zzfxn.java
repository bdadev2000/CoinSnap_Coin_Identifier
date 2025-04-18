package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzfxn implements zzfya {
    public static zzfxn zzc(char c2) {
        return new zzfxk(c2);
    }

    @Override // com.google.android.gms.internal.ads.zzfya
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c2);
}
