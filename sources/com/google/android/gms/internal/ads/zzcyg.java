package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcyg extends zzdcc implements zzbih {
    private final Bundle zzb;

    public zzcyg(Set set) {
        super(set);
        this.zzb = new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.zzbih
    public final synchronized void zza(String str, Bundle bundle) {
        this.zzb.putAll(bundle);
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcyf
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((OnAdMetadataChangedListener) obj).onAdMetadataChanged();
            }
        });
    }

    public final synchronized Bundle zzb() {
        return new Bundle(this.zzb);
    }
}
