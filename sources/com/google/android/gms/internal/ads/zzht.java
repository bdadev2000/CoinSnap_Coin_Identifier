package com.google.android.gms.internal.ads;

import android.media.AudioManager;
import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzht implements AudioManager.OnAudioFocusChangeListener {
    final /* synthetic */ zzhv zza;
    private final Handler zzb;

    public zzht(zzhv zzhvVar, Handler handler) {
        this.zza = zzhvVar;
        this.zzb = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(final int i10) {
        this.zzb.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzhs
            @Override // java.lang.Runnable
            public final void run() {
                zzhv.zzc(zzht.this.zza, i10);
            }
        });
    }
}
