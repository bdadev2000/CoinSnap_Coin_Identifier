package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzcfq implements zzgee {
    final /* synthetic */ List zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ Uri zzc;
    final /* synthetic */ zzcfs zzd;

    public zzcfq(zzcfs zzcfsVar, List list, String str, Uri uri) {
        this.zza = list;
        this.zzb = str;
        this.zzc = uri;
        this.zzd = zzcfsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final void zza(Throwable th2) {
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Failed to parse gmsg params for: ".concat(String.valueOf(this.zzc)));
    }

    @Override // com.google.android.gms.internal.ads.zzgee
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list = this.zza;
        String str = this.zzb;
        this.zzd.zzX((Map) obj, list, str);
    }
}
