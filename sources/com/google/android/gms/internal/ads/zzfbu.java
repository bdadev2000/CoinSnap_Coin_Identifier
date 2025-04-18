package com.google.android.gms.internal.ads;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes3.dex */
final class zzfbu implements zzgee {
    public zzfbu(zzfbw zzfbwVar) {
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit failed.");
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* synthetic */ void zzb(@NullableDecl Object obj) {
        com.google.android.gms.ads.internal.util.zze.zza("Notification of cache hit successful.");
    }
}
