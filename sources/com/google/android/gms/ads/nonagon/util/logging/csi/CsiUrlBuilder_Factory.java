package com.google.android.gms.ads.nonagon.util.logging.csi;

import androidx.annotation.NonNull;
import com.google.android.gms.internal.ads.zzhkp;

/* loaded from: classes2.dex */
public final class CsiUrlBuilder_Factory implements zzhkp<CsiUrlBuilder> {
    @NonNull
    public static CsiUrlBuilder_Factory create() {
        CsiUrlBuilder_Factory csiUrlBuilder_Factory;
        csiUrlBuilder_Factory = zza.zza;
        return csiUrlBuilder_Factory;
    }

    @NonNull
    public static CsiUrlBuilder newInstance() {
        return new CsiUrlBuilder();
    }

    @Override // com.google.android.gms.internal.ads.zzhlg
    @NonNull
    /* renamed from: get, reason: merged with bridge method [inline-methods] */
    public CsiUrlBuilder zzb() {
        return newInstance();
    }
}
