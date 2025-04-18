package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzgac extends zzgbt {
    final /* synthetic */ zzgad zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgac(zzgad zzgadVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgadVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
