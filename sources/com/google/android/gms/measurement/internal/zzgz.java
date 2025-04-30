package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import x.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzgz extends g {
    private final /* synthetic */ zzgt zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgz(zzgt zzgtVar, int i9) {
        super(20);
        this.zza = zzgtVar;
    }

    @Override // x.g
    public final /* synthetic */ Object create(Object obj) {
        String str = (String) obj;
        Preconditions.checkNotEmpty(str);
        return zzgt.zza(this.zza, str);
    }
}
