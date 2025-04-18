package com.google.android.gms.ads.internal;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.internal.ads.zzauz;
import com.google.android.gms.internal.ads.zzavb;
import com.google.android.gms.internal.ads.zzavc;
import java.util.concurrent.Callable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzq implements Callable {
    final /* synthetic */ zzu zza;

    public zzq(zzu zzuVar) {
        this.zza = zzuVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        VersionInfoParcel versionInfoParcel;
        Context context;
        zzu zzuVar = this.zza;
        versionInfoParcel = zzuVar.zza;
        String str = versionInfoParcel.afmaVersion;
        context = zzuVar.zzd;
        return new zzavc(zzavb.zzu(context, new zzauz(str, false)));
    }
}
