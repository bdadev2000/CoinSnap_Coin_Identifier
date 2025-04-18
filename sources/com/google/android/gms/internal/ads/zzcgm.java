package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class zzcgm extends com.google.android.gms.ads.internal.client.zzea {
    private final zzccf zza;
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
    private zzbhg zzn;
    private final Object zzb = new Object();
    private boolean zzh = true;

    public zzcgm(zzccf zzccfVar, float f10, boolean z10, boolean z11) {
        this.zza = zzccfVar;
        this.zzi = f10;
        this.zzc = z10;
        this.zzd = z11;
    }

    private final void zzw(final int i10, final int i11, final boolean z10, final boolean z11) {
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgl
            @Override // java.lang.Runnable
            public final void run() {
                zzcgm.this.zzd(i10, i11, z10, z11);
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
        zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcgk
            @Override // java.lang.Runnable
            public final void run() {
                zzcgm.this.zzr(hashMap);
            }
        });
    }

    public final void zzc(float f10, float f11, int i10, boolean z10, float f12) {
        boolean z11;
        boolean z12;
        int i11;
        synchronized (this.zzb) {
            z11 = true;
            if (f11 == this.zzi && f12 == this.zzk) {
                z11 = false;
            }
            this.zzi = f11;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzmw)).booleanValue()) {
                this.zzj = f10;
            }
            z12 = this.zzh;
            this.zzh = z10;
            i11 = this.zze;
            this.zze = i10;
            float f13 = this.zzk;
            this.zzk = f12;
            if (Math.abs(f12 - f13) > 1.0E-4f) {
                this.zza.zzF().invalidate();
            }
        }
        if (z11) {
            try {
                zzbhg zzbhgVar = this.zzn;
                if (zzbhgVar != null) {
                    zzbhgVar.zze();
                }
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
            }
        }
        zzw(i11, i10, z12, z10);
    }

    public final /* synthetic */ void zzd(int i10, int i11, boolean z10, boolean z11) {
        int i12;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        com.google.android.gms.ads.internal.client.zzee zzeeVar;
        com.google.android.gms.ads.internal.client.zzee zzeeVar2;
        com.google.android.gms.ads.internal.client.zzee zzeeVar3;
        synchronized (this.zzb) {
            boolean z17 = this.zzg;
            boolean z18 = false;
            if (!z17 && i11 == 1) {
                i11 = 1;
                i12 = 1;
                z12 = true;
            } else {
                i12 = i11;
                z12 = false;
            }
            if (i10 != i11) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13 && i12 == 1) {
                z14 = true;
                i12 = 1;
            } else {
                z14 = false;
            }
            if (z13 && i12 == 2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z13 && i12 == 3) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z17 || z12) {
                z18 = true;
            }
            this.zzg = z18;
            if (z12) {
                try {
                    com.google.android.gms.ads.internal.client.zzee zzeeVar4 = this.zzf;
                    if (zzeeVar4 != null) {
                        zzeeVar4.zzi();
                    }
                } catch (RemoteException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzl("#007 Could not call remote method.", e2);
                }
            }
            if (z14 && (zzeeVar3 = this.zzf) != null) {
                zzeeVar3.zzh();
            }
            if (z15 && (zzeeVar2 = this.zzf) != null) {
                zzeeVar2.zzg();
            }
            if (z16) {
                com.google.android.gms.ads.internal.client.zzee zzeeVar5 = this.zzf;
                if (zzeeVar5 != null) {
                    zzeeVar5.zze();
                }
                this.zza.zzw();
            }
            if (z10 != z11 && (zzeeVar = this.zzf) != null) {
                zzeeVar.zzf(z11);
            }
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zze() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzk;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzf() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzj;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final float zzg() {
        float f10;
        synchronized (this.zzb) {
            f10 = this.zzi;
        }
        return f10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final int zzh() {
        int i10;
        synchronized (this.zzb) {
            i10 = this.zze;
        }
        return i10;
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
    public final void zzj(boolean z10) {
        String str;
        if (true != z10) {
            str = CampaignEx.JSON_NATIVE_VIDEO_UNMUTE;
        } else {
            str = CampaignEx.JSON_NATIVE_VIDEO_MUTE;
        }
        zzx(str, null);
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final void zzk() {
        zzx(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, null);
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
        boolean z10;
        Object obj = this.zzb;
        boolean zzp = zzp();
        synchronized (obj) {
            z10 = false;
            if (!zzp) {
                try {
                    if (this.zzm && this.zzd) {
                        z10 = true;
                    }
                } finally {
                }
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzp() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = false;
            if (this.zzc && this.zzl) {
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.google.android.gms.ads.internal.client.zzeb
    public final boolean zzq() {
        boolean z10;
        synchronized (this.zzb) {
            z10 = this.zzh;
        }
        return z10;
    }

    public final /* synthetic */ void zzr(Map map) {
        this.zza.zzd("pubVideoCmd", map);
    }

    public final void zzs(com.google.android.gms.ads.internal.client.zzga zzgaVar) {
        String str;
        String str2;
        String str3;
        Object obj = this.zzb;
        boolean z10 = zzgaVar.zza;
        boolean z11 = zzgaVar.zzb;
        boolean z12 = zzgaVar.zzc;
        synchronized (obj) {
            this.zzl = z11;
            this.zzm = z12;
        }
        if (true != z10) {
            str = "0";
        } else {
            str = "1";
        }
        String str4 = str;
        if (true != z11) {
            str2 = "0";
        } else {
            str2 = "1";
        }
        String str5 = str2;
        if (true != z12) {
            str3 = "0";
        } else {
            str3 = "1";
        }
        zzx("initialState", CollectionUtils.mapOf("muteStart", str4, "customControlsRequested", str5, "clickToExpandRequested", str3));
    }

    public final void zzt(float f10) {
        synchronized (this.zzb) {
            this.zzj = f10;
        }
    }

    public final void zzu() {
        boolean z10;
        int i10;
        synchronized (this.zzb) {
            z10 = this.zzh;
            i10 = this.zze;
            this.zze = 3;
        }
        zzw(i10, 3, z10, z10);
    }

    public final void zzv(zzbhg zzbhgVar) {
        synchronized (this.zzb) {
            this.zzn = zzbhgVar;
        }
    }
}
