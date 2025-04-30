package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.admanager.AppEventListener;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdef extends zzdez implements zzbkh {
    public zzdef(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzbkh
    public final synchronized void zzb(final String str, final String str2) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdee
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((AppEventListener) obj).onAppEvent(str, str2);
            }
        });
    }
}
