package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcgq extends com.google.android.gms.ads.internal.client.zzea {
    private final zzccj zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzee zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbhk zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcgq(zzccj zzccjVar, float f2, boolean z2, boolean z3) {
        this.zza = zzccjVar;
        this.zzi = f2;
        this.zzc = z2;
        this.zzd = z3;
    }

    private final void zzw(final int i2, final int i3, final boolean z2, final boolean z3) {
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgp
            @Override // java.lang.Runnable
            public final void run() {
                zzcgq.this.zzd(i2, i3, z2, z3);
            }
        });
    }

    private final void zzx(String str, @Nullable Map map) {
        final HashMap hashMap = map == null ? new HashMap() : new HashMap(map);
        hashMap.put("action", str);
        zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgo
            @Override // java.lang.Runnable
            public final void run() {
                zzcgq.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f2, float f3, int i2, boolean z2, float f4) {
        boolean z3;
        boolean z4;
        int i3;
        synchronized (this.zzb) {
            try {
                z3 = true;
                if (f3 == this.zzi && f4 == this.zzk) {
                    z3 = false;
                }
                this.zzi = f3;
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzmr)).booleanValue()) {
                    this.zzj = f2;
                }
                z4 = this.zzh;
                this.zzh = z2;
                i3 = this.zze;
                this.zze = i2;
                float f5 = this.zzk;
                this.zzk = f4;
                if (Math.abs(f4 - f5) > 1.0E-4f) {
                    this.zza.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z3) {
            try {
                zzbhk zzbhkVar = this.zzn;
                if (zzbhkVar != null) {
                    zzbhkVar.zze();
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
            }
        }
        zzw(i3, i2, z4, z2);
    }

    public final /* synthetic */ void zzd(int i2, int i3, boolean z2, boolean z3) {
        int i4;
        boolean z4;
        boolean z5;
        com.google.android.gms.ads.internal.client.zzee zzeeVar;
        com.google.android.gms.ads.internal.client.zzee zzeeVar2;
        com.google.android.gms.ads.internal.client.zzee zzeeVar3;
        synchronized (this.zzb) {
            try {
                boolean z6 = this.zzg;
                if (z6 || i3 != 1) {
                    i4 = i3;
                    z4 = false;
                } else {
                    i3 = 1;
                    i4 = 1;
                    z4 = true;
                }
                boolean z7 = i2 != i3;
                if (z7 && i4 == 1) {
                    z5 = true;
                    i4 = 1;
                } else {
                    z5 = false;
                }
                boolean z8 = z7 && i4 == 2;
                boolean z9 = z7 && i4 == 3;
                this.zzg = z6 || z4;
                if (z4) {
                    try {
                        com.google.android.gms.ads.internal.client.zzee zzeeVar4 = this.zzf;
                        if (zzeeVar4 != null) {
                            zzeeVar4.zzi();
                        }
                    } catch (RemoteException e) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e);
                    }
                }
                if (z5 && (zzeeVar3 = this.zzf) != null) {
                    zzeeVar3.zzh();
                }
                if (z8 && (zzeeVar2 = this.zzf) != null) {
                    zzeeVar2.zzg();
                }
                if (z9) {
                    com.google.android.gms.ads.internal.client.zzee zzeeVar5 = this.zzf;
                    if (zzeeVar5 != null) {
                        zzeeVar5.zze();
                    }
                    this.zza.zzw();
                }
                if (z2 != z3 && (zzeeVar = this.zzf) != null) {
                    zzeeVar.zzf(z3);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzk;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzj;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        float f2;
        synchronized (this.zzb) {
            f2 = this.zzi;
        }
        return f2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
        int i2;
        synchronized (this.zzb) {
            i2 = this.zze;
        }
        return i2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzee zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzee zzeeVar;
        synchronized (this.zzb) {
            zzeeVar = this.zzf;
        }
        return zzeeVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzj(boolean z2) {
        zzx(true != z2 ? "unmute" : "mute", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
        zzx("pause", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzm(@Nullable com.google.android.gms.ads.internal.client.zzee zzeeVar) {
        synchronized (this.zzb) {
            this.zzf = zzeeVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzo() {
        boolean z2;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z2 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z2 = true;
                    }
                } finally {
                }
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
        boolean z2;
        synchronized (this.zzb) {
            try {
                z2 = false;
                if (this.zzc && this.zzl) {
                    z2 = true;
                }
            } finally {
            }
        }
        return z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
        boolean z2;
        synchronized (this.zzb) {
            z2 = this.zzh;
        }
        return z2;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzgb zzgbVar) {
        Object obj = this.zzb;
        boolean z2 = zzgbVar.zza;
        boolean z3 = zzgbVar.zzb;
        boolean z4 = zzgbVar.zzc;
        synchronized (obj) {
            this.zzl = z3;
            this.zzm = z4;
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", true != z2 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "customControlsRequested", true != z3 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES, "clickToExpandRequested", true != z4 ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES));
    }

    public final void zzt(float f2) {
        synchronized (this.zzb) {
            this.zzj = f2;
        }
    }

    public final void zzu() {
        boolean z2;
        int i2;
        synchronized (this.zzb) {
            z2 = this.zzh;
            i2 = this.zze;
            this.zze = 3;
        }
        zzw(i2, 3, z2, z2);
    }

    public final void zzv(zzbhk zzbhkVar) {
        synchronized (this.zzb) {
            this.zzn = zzbhkVar;
        }
    }
}
