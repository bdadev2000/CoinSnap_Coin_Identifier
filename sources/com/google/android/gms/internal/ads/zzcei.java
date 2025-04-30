package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes2.dex */
public final class zzcei implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzceh zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzcei(Context context, zzceh zzcehVar) {
        this.zza = (AudioManager) context.getSystemService(MimeTypes.BASE_TYPE_AUDIO);
        this.zzb = zzcehVar;
    }

    private final void zzf() {
        boolean z8 = false;
        if (this.zzd && !this.zze && this.zzf > 0.0f) {
            if (!this.zzc) {
                AudioManager audioManager = this.zza;
                if (audioManager != null) {
                    if (audioManager.requestAudioFocus(this, 3, 2) == 1) {
                        z8 = true;
                    }
                    this.zzc = z8;
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
                    z8 = true;
                }
                this.zzc = z8;
            }
            this.zzb.zzn();
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i9) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.zzc = z8;
        this.zzb.zzn();
    }

    public final float zza() {
        float f9 = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f9;
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

    public final void zzd(boolean z8) {
        this.zze = z8;
        zzf();
    }

    public final void zze(float f9) {
        this.zzf = f9;
        zzf();
    }
}
