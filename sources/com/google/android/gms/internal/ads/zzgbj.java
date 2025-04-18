package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes4.dex */
final class zzgbj extends zzgdc {
    final /* synthetic */ zzgbk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgbj(zzgbk zzgbkVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdb
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
