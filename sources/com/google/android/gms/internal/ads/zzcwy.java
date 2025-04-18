package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes3.dex */
public final class zzcwy extends zzdcc implements zzcwq {
    public zzcwy(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zza(final com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcwx
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcxc) obj).zzq(com.google.android.gms.ads.internal.client.zze.this);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzb() {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcww
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcxc) obj).zzq(zzfgq.zzd(11, null, null));
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcwq
    public final void zzc(final zzdgu zzdguVar) {
        zzq(new zzdcb() { // from class: com.google.android.gms.internal.ads.zzcwv
            @Override // com.google.android.gms.internal.ads.zzdcb
            public final void zza(Object obj) {
                ((zzcxc) obj).zzq(zzfgq.zzd(12, zzdgu.this.getMessage(), null));
            }
        });
    }
}
