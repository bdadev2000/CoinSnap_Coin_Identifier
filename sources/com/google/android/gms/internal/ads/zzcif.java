package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class zzcif extends com.google.android.gms.ads.internal.client.zzdp {
    private final zzcee zza;
    private final boolean zzc;
    private final boolean zzd;
    private int zze;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzdt zzf;
    private boolean zzg;
    private float zzi;
    private float zzj;
    private float zzk;
    private boolean zzl;
    private boolean zzm;
    private zzbjd zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcif(zzcee zzceeVar, float f9, boolean z8, boolean z9) {
        this.zza = zzceeVar;
        this.zzi = f9;
        this.zzc = z8;
        this.zzd = z9;
    }

    private final void zzw(final int i9, final int i10, final boolean z8, final boolean z9) {
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcie
            @Override // java.lang.Runnable
            public final void run() {
                zzcif.this.zzd(i9, i10, z8, z9);
            }
        });
    }

    private final void zzx(String str, @Nullable Map map) {
        final HashMap hashMap;
        if (map == null) {
            hashMap = new HashMap();
        } else {
            hashMap = new HashMap(map);
        }
        hashMap.put("action", str);
        zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcid
            @Override // java.lang.Runnable
            public final void run() {
                zzcif.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f9, float f10, int i9, boolean z8, float f11) {
        boolean z9;
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            try {
                z9 = true;
                if (f10 == this.zzi && f11 == this.zzk) {
                    z9 = false;
                }
                this.zzi = f10;
                this.zzj = f9;
                z10 = this.zzh;
                this.zzh = z8;
                i10 = this.zze;
                this.zze = i9;
                float f12 = this.zzk;
                this.zzk = f11;
                if (Math.abs(f11 - f12) > 1.0E-4f) {
                    this.zza.zzF().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z9) {
            try {
                zzbjd zzbjdVar = this.zzn;
                if (zzbjdVar != null) {
                    zzbjdVar.zze();
                }
            } catch (RemoteException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
            }
        }
        zzw(i10, i9, z10, z8);
    }

    public final /* synthetic */ void zzd(int i9, int i10, boolean z8, boolean z9) {
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar2;
        com.google.android.gms.ads.internal.client.zzdt zzdtVar3;
        synchronized (this.zzb) {
            try {
                boolean z15 = this.zzg;
                boolean z16 = false;
                if (!z15 && i10 == 1) {
                    i10 = 1;
                    i11 = 1;
                    z10 = true;
                } else {
                    i11 = i10;
                    z10 = false;
                }
                if (i9 != i10) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11 && i11 == 1) {
                    z12 = true;
                    i11 = 1;
                } else {
                    z12 = false;
                }
                if (z11 && i11 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z11 && i11 == 3) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (z15 || z10) {
                    z16 = true;
                }
                this.zzg = z16;
                if (z10) {
                    try {
                        com.google.android.gms.ads.internal.client.zzdt zzdtVar4 = this.zzf;
                        if (zzdtVar4 != null) {
                            zzdtVar4.zzi();
                        }
                    } catch (RemoteException e4) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e4);
                    }
                }
                if (z12 && (zzdtVar3 = this.zzf) != null) {
                    zzdtVar3.zzh();
                }
                if (z13 && (zzdtVar2 = this.zzf) != null) {
                    zzdtVar2.zzg();
                }
                if (z14) {
                    com.google.android.gms.ads.internal.client.zzdt zzdtVar5 = this.zzf;
                    if (zzdtVar5 != null) {
                        zzdtVar5.zze();
                    }
                    this.zza.zzw();
                }
                if (z8 != z9 && (zzdtVar = this.zzf) != null) {
                    zzdtVar.zzf(z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zze() {
        float f9;
        synchronized (this.zzb) {
            f9 = this.zzk;
        }
        return f9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzf() {
        float f9;
        synchronized (this.zzb) {
            f9 = this.zzj;
        }
        return f9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final float zzg() {
        float f9;
        synchronized (this.zzb) {
            f9 = this.zzi;
        }
        return f9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final int zzh() {
        int i9;
        synchronized (this.zzb) {
            i9 = this.zze;
        }
        return i9;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    @Nullable
    public final com.google.android.gms.ads.internal.client.zzdt zzi() throws RemoteException {
        com.google.android.gms.ads.internal.client.zzdt zzdtVar;
        synchronized (this.zzb) {
            zzdtVar = this.zzf;
        }
        return zzdtVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzj(boolean z8) {
        String str;
        if (true != z8) {
            str = CampaignEx.JSON_NATIVE_VIDEO_UNMUTE;
        } else {
            str = CampaignEx.JSON_NATIVE_VIDEO_MUTE;
        }
        zzx(str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzk() {
        zzx(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzl() {
        zzx("play", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzm(@Nullable com.google.android.gms.ads.internal.client.zzdt zzdtVar) {
        synchronized (this.zzb) {
            this.zzf = zzdtVar;
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final void zzn() {
        zzx("stop", null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzo() {
        boolean z8;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z8 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z8 = true;
                    }
                } finally {
                }
            }
        }
        return z8;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzp() {
        boolean z8;
        synchronized (this.zzb) {
            try {
                z8 = false;
                if (this.zzc && this.zzl) {
                    z8 = true;
                }
            } finally {
            }
        }
        return z8;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdq
    public final boolean zzq() {
        boolean z8;
        synchronized (this.zzb) {
            z8 = this.zzh;
        }
        return z8;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzfk zzfkVar) {
        String str;
        String str2;
        String str3;
        Object obj = this.zzb;
        boolean z8 = zzfkVar.zza;
        boolean z9 = zzfkVar.zzb;
        boolean z10 = zzfkVar.zzc;
        synchronized (obj) {
            this.zzl = z9;
            this.zzm = z10;
        }
        if (true != z8) {
            str = "0";
        } else {
            str = "1";
        }
        String str4 = str;
        if (true != z9) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        String str5 = str2;
        if (true != z10) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", str4, "customControlsRequested", str5, "clickToExpandRequested", str3));
    }

    public final void zzt(float f9) {
        synchronized (this.zzb) {
            this.zzj = f9;
        }
    }

    public final void zzu() {
        boolean z8;
        int i9;
        synchronized (this.zzb) {
            z8 = this.zzh;
            i9 = this.zze;
            this.zze = 3;
        }
        zzw(i9, 3, z8, z8);
    }

    public final void zzv(zzbjd zzbjdVar) {
        synchronized (this.zzb) {
            this.zzn = zzbjdVar;
        }
    }
}
