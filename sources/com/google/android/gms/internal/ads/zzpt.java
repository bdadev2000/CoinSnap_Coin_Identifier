package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzpt extends ContentObserver {
    final /* synthetic */ zzpw zza;
    private final ContentResolver zzb;
    private final Uri zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzpt(zzpw zzpwVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.zza = zzpwVar;
        this.zzb = contentResolver;
        this.zzc = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z8) {
        Context context;
        zzk zzkVar;
        zzpx zzpxVar;
        zzpw zzpwVar = this.zza;
        context = zzpwVar.zza;
        zzkVar = zzpwVar.zzh;
        zzpxVar = zzpwVar.zzg;
        this.zza.zzj(zzpp.zzc(context, zzkVar, zzpxVar));
    }

    public final void zza() {
        this.zzb.registerContentObserver(this.zzc, false, this);
    }

    public final void zzb() {
        this.zzb.unregisterContentObserver(this);
    }
}
