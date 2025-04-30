package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes2.dex */
final class zzgbq extends zzgdh {
    final /* synthetic */ zzgbr zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbq(zzgbr zzgbrVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgbrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdg
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
