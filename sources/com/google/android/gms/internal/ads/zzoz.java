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
public final class zzoz {
    private final Context zza;
    private final Handler zzb;

    @Nullable
    private final zzov zzc;
    private final BroadcastReceiver zzd;

    @Nullable
    private final zzow zze;

    @Nullable
    private zzos zzf;

    @Nullable
    private zzpa zzg;
    private zzh zzh;
    private boolean zzi;
    private final zzqj zzj;

    public zzoz(Context context, zzqj zzqjVar, zzh zzhVar, @Nullable zzpa zzpaVar) {
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzqjVar;
        this.zzh = zzhVar;
        this.zzg = zzpaVar;
        byte b2 = 0;
        byte b3 = 0;
        Handler handler = new Handler(zzeu.zzy(), null);
        this.zzb = handler;
        this.zzc = zzeu.zza >= 23 ? new zzov(this, b3 == true ? 1 : 0) : null;
        this.zzd = new zzoy(this, b2 == true ? 1 : 0);
        Uri zza = zzos.zza();
        this.zze = zza != null ? new zzow(this, handler, applicationContext.getContentResolver(), zza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzos zzosVar) {
        if (!this.zzi || zzosVar.equals(this.zzf)) {
            return;
        }
        this.zzf = zzosVar;
        this.zzj.zza.zzJ(zzosVar);
    }

    public final zzos zzc() {
        zzov zzovVar;
        if (this.zzi) {
            zzos zzosVar = this.zzf;
            zzosVar.getClass();
            return zzosVar;
        }
        this.zzi = true;
        zzow zzowVar = this.zze;
        if (zzowVar != null) {
            zzowVar.zza();
        }
        if (zzeu.zza >= 23 && (zzovVar = this.zzc) != null) {
            zzot.zza(this.zza, zzovVar, this.zzb);
        }
        zzos zzd = zzos.zzd(this.zza, this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb), this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }

    public final void zzg(zzh zzhVar) {
        this.zzh = zzhVar;
        zzj(zzos.zzc(this.zza, zzhVar, this.zzg));
    }

    @RequiresApi
    public final void zzh(@Nullable AudioDeviceInfo audioDeviceInfo) {
        zzpa zzpaVar = this.zzg;
        if (Objects.equals(audioDeviceInfo, zzpaVar == null ? null : zzpaVar.zza)) {
            return;
        }
        zzpa zzpaVar2 = audioDeviceInfo != null ? new zzpa(audioDeviceInfo) : null;
        this.zzg = zzpaVar2;
        zzj(zzos.zzc(this.zza, this.zzh, zzpaVar2));
    }

    public final void zzi() {
        zzov zzovVar;
        if (this.zzi) {
            this.zzf = null;
            if (zzeu.zza >= 23 && (zzovVar = this.zzc) != null) {
                zzot.zzb(this.zza, zzovVar);
            }
            this.zza.unregisterReceiver(this.zzd);
            zzow zzowVar = this.zze;
            if (zzowVar != null) {
                zzowVar.zzb();
            }
            this.zzi = false;
        }
    }
}
