package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.applovin.impl.mediation.ads.e;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhv {
    private final zzfxg zza;
    private final zzht zzb;

    @Nullable
    private zzhu zzc;
    private float zze = 1.0f;
    private int zzd = 0;

    public zzhv(final Context context, Handler handler, zzhu zzhuVar) {
        this.zza = zzfxk.zza(new zzfxg() { // from class: com.google.android.gms.internal.ads.zzhr
            @Override // com.google.android.gms.internal.ads.zzfxg
            public final Object zza() {
                AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MimeTypes.BASE_TYPE_AUDIO);
                audioManager.getClass();
                return audioManager;
            }
        });
        this.zzc = zzhuVar;
        this.zzb = new zzht(this, handler);
    }

    public static /* bridge */ /* synthetic */ void zzc(zzhv zzhvVar, int i10) {
        if (i10 != -3 && i10 != -2) {
            if (i10 != -1) {
                if (i10 != 1) {
                    e.r("Unknown focus change type: ", i10, "AudioFocusManager");
                    return;
                } else {
                    zzhvVar.zzg(2);
                    zzhvVar.zzf(1);
                    return;
                }
            }
            zzhvVar.zzf(-1);
            zzhvVar.zze();
            zzhvVar.zzg(1);
            return;
        }
        if (i10 != -2) {
            zzhvVar.zzg(4);
        } else {
            zzhvVar.zzf(0);
            zzhvVar.zzg(3);
        }
    }

    private final void zze() {
        int i10 = this.zzd;
        if (i10 != 1 && i10 != 0 && zzen.zza < 26) {
            ((AudioManager) this.zza.zza()).abandonAudioFocus(this.zzb);
        }
    }

    private final void zzf(int i10) {
        zzhu zzhuVar = this.zzc;
        if (zzhuVar != null) {
            int zzC = zzjv.zzC(i10);
            zzjv zzjvVar = ((zzjr) zzhuVar).zza;
            zzjv.zzM(zzjvVar, zzjvVar.zzu(), i10, zzC);
        }
    }

    private final void zzg(int i10) {
        float f10;
        if (this.zzd != i10) {
            this.zzd = i10;
            if (i10 == 4) {
                f10 = 0.2f;
            } else {
                f10 = 1.0f;
            }
            if (this.zze != f10) {
                this.zze = f10;
                zzhu zzhuVar = this.zzc;
                if (zzhuVar != null) {
                    zzjv.zzJ(((zzjr) zzhuVar).zza);
                }
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z10, int i10) {
        zze();
        zzg(0);
        return 1;
    }

    public final void zzd() {
        this.zzc = null;
        zze();
        zzg(0);
    }
}
