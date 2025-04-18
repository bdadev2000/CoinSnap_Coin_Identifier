package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzow extends ContentObserver {
    final /* synthetic */ zzoz zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzow(zzoz zzozVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzozVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        Context context;
        zzh zzhVar;
        zzpa zzpaVar;
        zzoz zzozVar = this.zza;
        context = zzozVar.zza;
        zzhVar = zzozVar.zzh;
        zzpaVar = zzozVar.zzg;
        this.zza.zzj(zzos.zzc(context, zzhVar, zzpaVar));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
