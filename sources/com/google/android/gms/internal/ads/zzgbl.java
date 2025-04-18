package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes4.dex */
final class zzgbl extends zzgdc {
    final /* synthetic */ zzgbm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbl(zzgbm zzgbmVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgbmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
