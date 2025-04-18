package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhw implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzhy zza;
    private final Handler zzb;

    public zzhw(zzhy zzhyVar, Handler handler) {
        this.zza = zzhyVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i2) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhv
            @Override // java.lang.Runnable
            public final void run() {
                zzhy.zzc(zzhw.this.zza, i2);
            }
        });
    }
}
