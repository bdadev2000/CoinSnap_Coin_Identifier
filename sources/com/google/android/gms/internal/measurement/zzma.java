package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzma extends zzmb {
    private final /* synthetic */ zzlv zza;

    @Override // com.google.android.gms.internal.measurement.zzmb, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzlx(this.zza);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzma(zzlv zzlvVar) {
        super(zzlvVar);
        this.zza = zzlvVar;
    }
}
