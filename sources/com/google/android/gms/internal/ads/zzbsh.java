package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes2.dex */
public final class zzbsh extends zzbrn {
    private final MediationInterscrollerAd zza;

    public zzbsh(MediationInterscrollerAd mediationInterscrollerAd) {
        this.zza = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final IObjectWrapper zze() {
        return ObjectWrapper.wrap(this.zza.getView());
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final boolean zzf() {
        return this.zza.shouldDelegateInterscrollerEffect();
    }
}
