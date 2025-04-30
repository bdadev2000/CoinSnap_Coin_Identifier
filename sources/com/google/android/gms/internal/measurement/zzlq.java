package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzlq extends zzlx {
    private final /* synthetic */ zzlm zza;

    @Override // com.google.android.gms.internal.measurement.zzlx, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzlo(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzlq(zzlm zzlmVar) {
        super(zzlmVar);
        this.zza = zzlmVar;
    }
}
