package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class zzov {
    private final Context zza;
    private final Handler zzb;

    @Nullable
    private final zzor zzc;
    private final BroadcastReceiver zzd;

    @Nullable
    private final zzos zze;

    @Nullable
    private zzop zzf;

    @Nullable
    private zzow zzg;
    private zzg zzh;
    private boolean zzi;
    private final zzqf zzj;

    public zzov(Context context, zzqf zzqfVar, zzg zzgVar, @Nullable zzow zzowVar) {
        zzor zzorVar;
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzqfVar;
        this.zzh = zzgVar;
        this.zzg = zzowVar;
        byte b3 = 0;
        byte b10 = 0;
        Handler handler = new Handler(zzen.zzz(), null);
        this.zzb = handler;
        if (zzen.zza >= 23) {
            zzorVar = new zzor(this, b10 == true ? 1 : 0);
        } else {
            zzorVar = null;
        }
        this.zzc = zzorVar;
        this.zzd = new zzot(this, b3 == true ? 1 : 0);
        Uri zza = zzop.zza();
        this.zze = zza != null ? new zzos(this, handler, applicationContext.getContentResolver(), zza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzop zzopVar) {
        if (this.zzi && !zzopVar.equals(this.zzf)) {
            this.zzf = zzopVar;
            this.zzj.zza.zzJ(zzopVar);
        }
    }

    public final zzop zzc() {
        zzor zzorVar;
        if (this.zzi) {
            zzop zzopVar = this.zzf;
            zzopVar.getClass();
            return zzopVar;
        }
        this.zzi = true;
        zzos zzosVar = this.zze;
        if (zzosVar != null) {
            zzosVar.zza();
        }
        if (zzen.zza >= 23 && (zzorVar = this.zzc) != null) {
            zzoq.zza(this.zza, zzorVar, this.zzb);
        }
        zzop zzd = zzop.zzd(this.zza, this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }

    public final void zzg(zzg zzgVar) {
        this.zzh = zzgVar;
        zzj(zzop.zzc(this.zza, zzgVar, this.zzg));
    }

    @RequiresApi(23)
    public final void zzh(@Nullable AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        zzow zzowVar = this.zzg;
        zzow zzowVar2 = null;
        if (zzowVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = zzowVar.zza;
        }
        if (Objects.equals(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            zzowVar2 = new zzow(audioDeviceInfo);
        }
        this.zzg = zzowVar2;
        zzj(zzop.zzc(this.zza, this.zzh, zzowVar2));
    }

    public final void zzi() {
        zzor zzorVar;
        if (!this.zzi) {
            return;
        }
        this.zzf = null;
        if (zzen.zza >= 23 && (zzorVar = this.zzc) != null) {
            zzoq.zzb(this.zza, zzorVar);
        }
        this.zza.unregisterReceiver(this.zzd);
        zzos zzosVar = this.zze;
        if (zzosVar != null) {
            zzosVar.zzb();
        }
        this.zzi = false;
    }
}
