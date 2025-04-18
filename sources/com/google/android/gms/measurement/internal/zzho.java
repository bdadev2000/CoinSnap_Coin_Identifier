package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import r.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzho extends f {
    private final /* synthetic */ zzhl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzho(zzhl zzhlVar, int i10) {
        super(20);
        this.zza = zzhlVar;
    }

    @Override // r.f
    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzhl.zza(this.zza, str);
    }
}
