package com.google.android.gms.internal.ads;

import java.util.ListIterator;

/* loaded from: classes3.dex */
final class zzgaa extends zzgbt {
    final /* synthetic */ zzgab zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgaa(zzgab zzgabVar, ListIterator listIterator) {
        super(listIterator);
        this.zza = zzgabVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbs
    public final Object zza(Object obj) {
        return this.zza.zzb.apply(obj);
    }
}
