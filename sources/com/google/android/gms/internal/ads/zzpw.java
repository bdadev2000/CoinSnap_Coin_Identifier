package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioDeviceInfo;
import android.net.Uri;
import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* loaded from: classes2.dex */
public final class zzpw {
    private final Context zza;
    private final Handler zzb;

    @Nullable
    private final zzps zzc;

    @Nullable
    private final BroadcastReceiver zzd;

    @Nullable
    private final zzpt zze;

    @Nullable
    private zzpp zzf;

    @Nullable
    private zzpx zzg;
    private zzk zzh;
    private boolean zzi;
    private final zzrh zzj;

    public zzpw(Context context, zzrh zzrhVar, zzk zzkVar, @Nullable zzpx zzpxVar) {
        zzps zzpsVar;
        Context applicationContext = context.getApplicationContext();
        this.zza = applicationContext;
        this.zzj = zzrhVar;
        this.zzh = zzkVar;
        this.zzg = zzpxVar;
        byte b = 0;
        byte b8 = 0;
        Handler handler = new Handler(zzgd.zzy(), null);
        this.zzb = handler;
        if (zzgd.zza >= 23) {
            zzpsVar = new zzps(this, b8 == true ? 1 : 0);
        } else {
            zzpsVar = null;
        }
        this.zzc = zzpsVar;
        this.zzd = new zzpv(this, b == true ? 1 : 0);
        Uri zza = zzpp.zza();
        this.zze = zza != null ? new zzpt(this, handler, applicationContext.getContentResolver(), zza) : null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzj(zzpp zzppVar) {
        if (this.zzi && !zzppVar.equals(this.zzf)) {
            this.zzf = zzppVar;
            this.zzj.zza.zzJ(zzppVar);
        }
    }

    public final zzpp zzc() {
        zzps zzpsVar;
        if (this.zzi) {
            zzpp zzppVar = this.zzf;
            zzppVar.getClass();
            return zzppVar;
        }
        this.zzi = true;
        zzpt zzptVar = this.zze;
        if (zzptVar != null) {
            zzptVar.zza();
        }
        if (zzgd.zza >= 23 && (zzpsVar = this.zzc) != null) {
            zzpq.zza(this.zza, zzpsVar, this.zzb);
        }
        Intent intent = null;
        if (this.zzd != null) {
            intent = this.zza.registerReceiver(this.zzd, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, this.zzb);
        }
        zzpp zzd = zzpp.zzd(this.zza, intent, this.zzh, this.zzg);
        this.zzf = zzd;
        return zzd;
    }

    public final void zzg(zzk zzkVar) {
        this.zzh = zzkVar;
        zzj(zzpp.zzc(this.zza, zzkVar, this.zzg));
    }

    @RequiresApi(23)
    public final void zzh(@Nullable AudioDeviceInfo audioDeviceInfo) {
        AudioDeviceInfo audioDeviceInfo2;
        zzpx zzpxVar = this.zzg;
        zzpx zzpxVar2 = null;
        if (zzpxVar == null) {
            audioDeviceInfo2 = null;
        } else {
            audioDeviceInfo2 = zzpxVar.zza;
        }
        if (zzgd.zzG(audioDeviceInfo, audioDeviceInfo2)) {
            return;
        }
        if (audioDeviceInfo != null) {
            zzpxVar2 = new zzpx(audioDeviceInfo);
        }
        this.zzg = zzpxVar2;
        zzj(zzpp.zzc(this.zza, this.zzh, zzpxVar2));
    }

    public final void zzi() {
        zzps zzpsVar;
        if (!this.zzi) {
            return;
        }
        this.zzf = null;
        if (zzgd.zza >= 23 && (zzpsVar = this.zzc) != null) {
            zzpq.zzb(this.zza, zzpsVar);
        }
        BroadcastReceiver broadcastReceiver = this.zzd;
        if (broadcastReceiver != null) {
            this.zza.unregisterReceiver(broadcastReceiver);
        }
        zzpt zzptVar = this.zze;
        if (zzptVar != null) {
            zzptVar.zzb();
        }
        this.zzi = false;
    }
}
