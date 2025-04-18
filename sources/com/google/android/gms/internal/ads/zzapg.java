package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzapg {
    private final Executor zza;

    public zzapg(Handler handler) {
        this.zza = new zzape(this, handler);
    }

    public final void zza(zzapp zzappVar, zzapy zzapyVar) {
        zzappVar.zzm("post-error");
        ((zzape) this.zza).zza.post(new zzapf(zzappVar, zzapv.zza(zzapyVar), null));
    }

    public final void zzb(zzapp zzappVar, zzapv zzapvVar, Runnable runnable) {
        zzappVar.zzq();
        zzappVar.zzm("post-response");
        ((zzape) this.zza).zza.post(new zzapf(zzappVar, zzapvVar, runnable));
    }
}
