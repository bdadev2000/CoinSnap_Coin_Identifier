package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class zzaqv {
    private final Executor zza;

    public zzaqv(Handler handler) {
        this.zza = new zzaqt(this, handler);
    }

    public final void zza(zzare zzareVar, zzarn zzarnVar) {
        zzareVar.zzm("post-error");
        ((zzaqt) this.zza).zza.post(new zzaqu(zzareVar, zzark.zza(zzarnVar), null));
    }

    public final void zzb(zzare zzareVar, zzark zzarkVar, Runnable runnable) {
        zzareVar.zzq();
        zzareVar.zzm("post-response");
        ((zzaqt) this.zza).zza.post(new zzaqu(zzareVar, zzarkVar, runnable));
    }
}
