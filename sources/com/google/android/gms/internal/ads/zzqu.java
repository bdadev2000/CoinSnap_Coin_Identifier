package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import com.vungle.ads.internal.protos.n;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
@RequiresApi(n.NOTIFICATION_REDIRECT_VALUE)
/* loaded from: classes3.dex */
public final class zzqu {
    final /* synthetic */ zzqw zza;
    private final Handler zzb = new Handler(Looper.myLooper());
    private final AudioTrack.StreamEventCallback zzc = new zzqt(this);

    public zzqu(zzqw zzqwVar) {
        this.zza = zzqwVar;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.zzqs] */
    public void zza(AudioTrack audioTrack) {
        final Handler handler = this.zzb;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new Executor() { // from class: com.google.android.gms.internal.ads.zzqs
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, this.zzc);
    }

    public void zzb(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.zzc);
        this.zzb.removeCallbacksAndMessages(null);
    }
}
