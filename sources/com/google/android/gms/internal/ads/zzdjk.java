package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzdjk implements zzbjw {
    private final WeakReference zza;

    public /* synthetic */ zzdjk(zzdjl zzdjlVar, zzdjj zzdjjVar) {
        this.zza = new WeakReference(zzdjlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbjw
    public final void zza(Object obj, Map map) {
        zzdjl zzdjlVar = (zzdjl) this.zza.get();
        if (zzdjlVar == null) {
            return;
        }
        zzdjl.zzc(zzdjlVar).zza();
    }
}
