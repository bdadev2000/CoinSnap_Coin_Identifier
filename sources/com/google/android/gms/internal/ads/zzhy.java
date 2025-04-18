package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import androidx.annotation.Nullable;
import com.applovin.impl.adview.t;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class zzhy {
    private final AudioManager zza;
    private final zzhw zzb;

    @Nullable
    private zzhx zzc;
    private int zzd;
    private float zze = 1.0f;

    public zzhy(Context context, Handler handler, zzhx zzhxVar) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        audioManager.getClass();
        this.zza = audioManager;
        this.zzc = zzhxVar;
        this.zzb = new zzhw(this, handler);
        this.zzd = 0;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzhy zzhyVar, int i2) {
        if (i2 == -3 || i2 == -2) {
            if (i2 != -2) {
                zzhyVar.zzg(4);
                return;
            } else {
                zzhyVar.zzf(0);
                zzhyVar.zzg(3);
                return;
            }
        }
        if (i2 == -1) {
            zzhyVar.zzf(-1);
            zzhyVar.zze();
            zzhyVar.zzg(1);
        } else if (i2 != 1) {
            t.C("Unknown focus change type: ", i2, "AudioFocusManager");
        } else {
            zzhyVar.zzg(2);
            zzhyVar.zzf(1);
        }
    }

    private final void zze() {
        int i2 = this.zzd;
        if (i2 == 1 || i2 == 0 || zzeu.zza >= 26) {
            return;
        }
        this.zza.abandonAudioFocus(this.zzb);
    }

    private final void zzf(int i2) {
        int zzS;
        zzhx zzhxVar = this.zzc;
        if (zzhxVar != null) {
            zzS = zzjz.zzS(i2);
            zzjz zzjzVar = ((zzjv) zzhxVar).zza;
            zzjzVar.zzaf(zzjzVar.zzu(), i2, zzS);
        }
    }

    private final void zzg(int i2) {
        if (this.zzd == i2) {
            return;
        }
        this.zzd = i2;
        float f2 = i2 == 4 ? 0.2f : 1.0f;
        if (this.zze != f2) {
            this.zze = f2;
            zzhx zzhxVar = this.zzc;
            if (zzhxVar != null) {
                ((zzjv) zzhxVar).zza.zzac();
            }
        }
    }

    public final float zza() {
        return this.zze;
    }

    public final int zzb(boolean z2, int i2) {
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
