package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdbf extends zzdez implements zzbkf {
    private final Bundle zzb;

    public zzdbf(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbkf
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdbe
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
