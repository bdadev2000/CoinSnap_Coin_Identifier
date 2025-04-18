package com.google.android.gms.internal.ads;

/* loaded from: classes3.dex */
public abstract class zzfwf implements zzfwr {
    public static zzfwf zzc(char c10) {
        return new zzfwc(c10);
    }

    @Override // com.google.android.gms.internal.ads.zzfwr
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c10);
}
