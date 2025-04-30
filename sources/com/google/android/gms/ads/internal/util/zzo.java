package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.google.android.gms.internal.ads.zzbfl;
import com.google.android.gms.internal.ads.zzbfm;
import com.google.android.gms.internal.ads.zzhlh;
import u.C2738g;
import u.C2739h;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzo implements zzbfl {
    final /* synthetic */ zzbfm zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    public zzo(zzt zztVar, zzbfm zzbfmVar, Context context, Uri uri) {
        this.zza = zzbfmVar;
        this.zzb = context;
        this.zzc = uri;
    }

    @Override // com.google.android.gms.internal.ads.zzbfl
    public final void zza() {
        C2739h a6 = new C2738g(this.zza.zza()).a();
        a6.f23048a.setPackage(zzhlh.zza(this.zzb));
        a6.a(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
