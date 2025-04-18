package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbdn;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzhgq;
import o.l;
import o.m;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzo implements zzbdn {
    final /* synthetic */ zzbdo zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzo(zzs zzsVar, zzbdo zzbdoVar, Context context, Uri uri) {
        this.zza = zzbdoVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbdn
    public final void zza() {
        m a = new l(this.zza.zza()).a();
        a.a.setPackage(zzhgq.zza(this.zzb));
        a.a(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
