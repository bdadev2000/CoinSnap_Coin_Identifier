package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzavm;
import com.google.android.gms.internal.ads.zzavn;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzp implements Callable {
    final /* synthetic */ zzt zza;

    public zzp(zzt zztVar) {
        this.zza = zztVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        VersionInfoParcel versionInfoParcel;
        Context context;
        zzt zztVar = this.zza;
        versionInfoParcel = zztVar.zza;
        String str = versionInfoParcel.afmaVersion;
        context = zztVar.zzd;
        return new zzavn(zzavm.zzu(str, context, false));
    }
}
