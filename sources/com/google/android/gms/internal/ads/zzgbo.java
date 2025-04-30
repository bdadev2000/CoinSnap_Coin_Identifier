package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzgbo extends zzgdh {
    final /* synthetic */ zzgbp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbo(zzgbp zzgbpVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgbpVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
