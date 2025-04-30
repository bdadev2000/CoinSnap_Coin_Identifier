package com.google.android.gms.internal.ads;

import java.util.Set;

/* loaded from: classes2.dex */
public final class zzdgh extends zzdez implements zzdgj {
    public zzdgh(Set set) {
        super(set);
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zza(String str) {
        final String str2 = "MalformedJson";
        zzq(new zzdey(str2) { // from class: com.google.android.gms.internal.ads.zzdgb
            public final /* synthetic */ String zza = "MalformedJson";

            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdgj) obj).zza(this.zza);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzb(final String str, final String str2) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdge
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdgj) obj).zzb(str, str2);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzc(final String str) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdgd
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdgj) obj).zzc(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzd(final String str) {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdgf
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdgj) obj).zzd(str);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zze() {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdgg
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdgj) obj).zze();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzdgj
    public final void zzf() {
        zzq(new zzdey() { // from class: com.google.android.gms.internal.ads.zzdgc
            @Override // com.google.android.gms.internal.ads.zzdey
            public final void zza(Object obj) {
                ((zzdgj) obj).zzf();
            }
        });
    }
}
