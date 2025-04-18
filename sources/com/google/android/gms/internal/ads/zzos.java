package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzos extends ContentObserver {
    final /* synthetic */ zzov zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzos(zzov zzovVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzovVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Context context;
        zzg zzgVar;
        zzow zzowVar;
        zzov zzovVar = this.zza;
        context = zzovVar.zza;
        zzgVar = zzovVar.zzh;
        zzowVar = zzovVar.zzg;
        this.zza.zzj(zzop.zzc(context, zzgVar, zzowVar));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
