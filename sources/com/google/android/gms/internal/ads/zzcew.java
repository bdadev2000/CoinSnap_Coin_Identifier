package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zzcew extends zzcdk implements TextureView.SurfaceTextureListener, zzcdu {
    private final zzcee zzc;
    private final zzcef zzd;
    private final zzced zze;
    private zzcdj zzf;
    private Surface zzg;
    private zzcdv zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcec zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcew(Context context, zzcef zzcefVar, zzcee zzceeVar, boolean z8, boolean z9, zzced zzcedVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzceeVar;
        this.zzd = zzcefVar;
        this.zzn = z8;
        this.zze = zzcedVar;
        setSurfaceTextureListener(this);
        zzcefVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (!this.zzo) {
            this.zzo = true;
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcev
                @Override // java.lang.Runnable
                public final void run() {
                    zzcew.this.zzI();
                }
            });
            zzn();
            this.zzd.zzb();
            if (this.zzp) {
                zzp();
            }
        }
    }

    private final void zzW(boolean z8, @Nullable Integer num) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null && !z8) {
            zzcdvVar.zzP(num);
            return;
        }
        if (this.zzi != null && this.zzg != null) {
            if (z8) {
                if (zzad()) {
                    zzcdvVar.zzU();
                    zzY();
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcfp zzp = this.zzc.zzp(this.zzi);
                if (zzp instanceof zzcfy) {
                    zzcdv zza = ((zzcfy) zzp).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp instanceof zzcfv) {
                    zzcfv zzcfvVar = (zzcfv) zzp;
                    String zzF = zzF();
                    ByteBuffer zzk = zzcfvVar.zzk();
                    boolean zzl = zzcfvVar.zzl();
                    String zzi = zzcfvVar.zzi();
                    if (zzi == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache URL is null.");
                        return;
                    } else {
                        zzcdv zzE = zzE(num);
                        this.zzh = zzE;
                        zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i9 = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i9 >= strArr.length) {
                        break;
                    }
                    uriArr[i9] = Uri.parse(strArr[i9]);
                    i9++;
                }
                this.zzh.zzF(uriArr, zzF2);
            }
            this.zzh.zzL(this);
            zzZ(this.zzg, false);
            if (this.zzh.zzV()) {
                int zzt = this.zzh.zzt();
                this.zzl = zzt;
                if (zzt == 3) {
                    zzV();
                }
            }
        }
    }

    private final void zzX() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcdv zzcdvVar = this.zzh;
            if (zzcdvVar != null) {
                zzcdvVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z8) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            try {
                zzcdvVar.zzS(surface, z8);
                return;
            } catch (IOException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", e4);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i9, int i10) {
        float f9;
        if (i10 > 0) {
            f9 = i9 / i10;
        } else {
            f9 = 1.0f;
        }
        if (this.zzs != f9) {
            this.zzs = f9;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcdv zzcdvVar = this.zzh;
        return (zzcdvVar == null || !zzcdvVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f9 = this.zzs;
        if (f9 != 0.0f && this.zzm == null) {
            float f10 = measuredWidth;
            float f11 = f10 / measuredHeight;
            if (f9 > f11) {
                measuredHeight = (int) (f10 / f9);
            }
            if (f9 < f11) {
                measuredWidth = (int) (measuredHeight * f9);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i9, int i10) {
        if (this.zzn) {
            zzcec zzcecVar = new zzcec(getContext());
            this.zzm = zzcecVar;
            zzcecVar.zzd(surfaceTexture, i9, i10);
            this.zzm.start();
            SurfaceTexture zzb = this.zzm.zzb();
            if (zzb != null) {
                surfaceTexture = zzb;
            } else {
                this.zzm.zze();
                this.zzm = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.zzg = surface;
        if (this.zzh == null) {
            zzW(false, null);
        } else {
            zzZ(surface, true);
            if (!this.zze.zza) {
                zzU();
            }
        }
        if (this.zzq != 0 && this.zzr != 0) {
            zzaa();
        } else {
            zzab(i9, i10);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzces
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zze();
            this.zzm = null;
        }
        if (this.zzh != null) {
            zzX();
            Surface surface = this.zzg;
            if (surface != null) {
                surface.release();
            }
            this.zzg = null;
            zzZ(null, true);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceo
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i9, final int i10) {
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zzc(i9, i10);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcen
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzO(i9, i10);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i9) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i9);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcem
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzQ(i9);
            }
        });
        super.onWindowVisibilityChanged(i9);
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzA(int i9) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzN(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzB(int i9) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzR(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzC(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        boolean z8 = false;
        if (this.zze.zzl && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z8 = true;
        }
        this.zzi = str;
        zzW(z8, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzD(int i9, int i10) {
        this.zzq = i9;
        this.zzr = i10;
        zzaa();
    }

    public final zzcdv zzE(@Nullable Integer num) {
        zzced zzcedVar = this.zze;
        zzcee zzceeVar = this.zzc;
        zzcgq zzcgqVar = new zzcgq(zzceeVar.getContext(), zzcedVar, zzceeVar, num);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        return zzcgqVar;
    }

    public final String zzF() {
        zzcee zzceeVar = this.zzc;
        return com.google.android.gms.ads.internal.zzu.zzp().zzc(zzceeVar.getContext(), zzceeVar.zzn().afmaVersion);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z8, long j7) {
        this.zzc.zzv(z8, j7);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i9, int i10) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzj(i9, i10);
        }
    }

    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            try {
                zzcdvVar.zzT(zza, false);
                return;
            } catch (IOException e4) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", e4);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set volume before player is initialized.");
    }

    public final /* synthetic */ void zzQ(int i9) {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.onWindowVisibilityChanged(i9);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcdj zzcdjVar = this.zzf;
        if (zzcdjVar != null) {
            zzcdjVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zzb() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final long zzf() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final long zzg() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final long zzh() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzi(final boolean z8, final long j7) {
        if (this.zzc != null) {
            zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcep
                @Override // java.lang.Runnable
                public final void run() {
                    zzcew.this.zzJ(z8, j7);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcet
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceq
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzm(int i9) {
        if (this.zzl != i9) {
            this.zzl = i9;
            if (i9 != 3) {
                if (i9 == 4) {
                    if (this.zze.zza) {
                        zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzceu
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzcew.this.zzH();
                        }
                    });
                    return;
                }
                return;
            }
            zzV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk, com.google.android.gms.internal.ads.zzceh
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcel
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcer
                @Override // java.lang.Runnable
                public final void run() {
                    zzcew.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcek
                @Override // java.lang.Runnable
                public final void run() {
                    zzcew.this.zzS();
                }
            });
            return;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzq(int i9) {
        if (zzac()) {
            this.zzh.zzI(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzr(zzcdj zzcdjVar) {
        this.zzf = zzcdjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzs(@Nullable String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzu(float f9, float f10) {
        zzcec zzcecVar = this.zzm;
        if (zzcecVar != null) {
            zzcecVar.zzf(f9, f10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdu
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcej
            @Override // java.lang.Runnable
            public final void run() {
                zzcew.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    @Nullable
    public final Integer zzw() {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            return zzcdvVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzx(int i9) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzJ(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzy(int i9) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzK(i9);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdk
    public final void zzz(int i9) {
        zzcdv zzcdvVar = this.zzh;
        if (zzcdvVar != null) {
            zzcdvVar.zzM(i9);
        }
    }
}
