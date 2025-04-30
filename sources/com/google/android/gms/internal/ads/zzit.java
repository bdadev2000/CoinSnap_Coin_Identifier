package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzit implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zziv zza;
    private final Handler zzb;

    public zzit(zziv zzivVar, Handler handler) {
        this.zza = zzivVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i9) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzis
            @Override // java.lang.Runnable
            public final void run() {
                zziv.zzc(zzit.this.zza, i9);
            }
        });
    }
}
