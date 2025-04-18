package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public final class zzccj implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcci zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzccj(Context context, zzcci zzcciVar) {
        this.zza = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzb = zzcciVar;
    }

    private final void zzf() {
        boolean z10 = false;
        if (this.zzd && !this.zze && this.zzf > 0.0f) {
            if (!this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z10 = true;
                    }
                    this.zzc = z10;
                }
                this.zzb.zzn();
                return;
            }
            return;
        }
        if (this.zzc) {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                if (audioManager2.abandonAudioFocus(this) == 0) {
                    z10 = true;
                }
                this.zzc = z10;
            }
            this.zzb.zzn();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.zzc = i10 > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        float f10 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f10;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z10) {
        this.zze = z10;
        zzf();
    }

    public final void zze(float f10) {
        this.zzf = f10;
        zzf();
    }
}
