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

/* loaded from: classes3.dex */
public final class zzccx extends zzcbl implements TextureView.SurfaceTextureListener, zzcbv {
    private final zzccf zzc;
    private final zzccg zzd;
    private final zzcce zze;
    private zzcbk zzf;
    private Surface zzg;
    private zzcbw zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzccd zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzccx(Context context, zzccg zzccgVar, zzccf zzccfVar, boolean z10, boolean z11, zzcce zzcceVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzccfVar;
        this.zzd = zzccgVar;
        this.zzn = z10;
        this.zze = zzcceVar;
        setSurfaceTextureListener(this);
        zzccgVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + "/" + exc.getClass().getCanonicalName() + ":" + exc.getMessage();
    }

    private final void zzU() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (!this.zzo) {
            this.zzo = true;
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccw
                @Override // java.lang.Runnable
                public final void run() {
                    zzccx.this.zzI();
                }
            });
            zzn();
            this.zzd.zzb();
            if (this.zzp) {
                zzp();
            }
        }
    }

    private final void zzW(boolean z10, @Nullable Integer num) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null && !z10) {
            zzcbwVar.zzP(num);
            return;
        }
        if (this.zzi != null && this.zzg != null) {
            if (z10) {
                if (zzad()) {
                    zzcbwVar.zzU();
                    zzY();
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("No valid ExoPlayerAdapter exists when switch source.");
                    return;
                }
            }
            if (this.zzi.startsWith("cache:")) {
                zzcdr zzp = this.zzc.zzp(this.zzi);
                if (zzp instanceof zzcea) {
                    zzcbw zza = ((zzcea) zzp).zza();
                    this.zzh = zza;
                    zza.zzP(num);
                    if (!this.zzh.zzV()) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Precached video player has been released.");
                        return;
                    }
                } else if (zzp instanceof zzcdx) {
                    zzcdx zzcdxVar = (zzcdx) zzp;
                    String zzF = zzF();
                    ByteBuffer zzl = zzcdxVar.zzl();
                    boolean zzm = zzcdxVar.zzm();
                    String zzk = zzcdxVar.zzk();
                    if (zzk == null) {
                        com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache URL is null.");
                        return;
                    } else {
                        zzcbw zzE = zzE(num);
                        this.zzh = zzE;
                        zzE.zzG(new Uri[]{Uri.parse(zzk)}, zzF, zzl, zzm);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
            } else {
                this.zzh = zzE(num);
                String zzF2 = zzF();
                Uri[] uriArr = new Uri[this.zzj.length];
                int i10 = 0;
                while (true) {
                    String[] strArr = this.zzj;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    uriArr[i10] = Uri.parse(strArr[i10]);
                    i10++;
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
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcbw zzcbwVar = this.zzh;
            if (zzcbwVar != null) {
                zzcbwVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z10) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            try {
                zzcbwVar.zzS(surface, z10);
                return;
            } catch (IOException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", e2);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set surface before player is initialized.");
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i10, int i11) {
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.zzs != f10) {
            this.zzs = f10;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcbw zzcbwVar = this.zzh;
        return (zzcbwVar == null || !zzcbwVar.zzV() || this.zzk) ? false : true;
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.zzs;
        if (f10 != 0.0f && this.zzm == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        if (this.zzn) {
            zzccd zzccdVar = new zzccd(getContext());
            this.zzm = zzccdVar;
            zzccdVar.zzd(surfaceTexture, i10, i11);
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
            zzab(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcct
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zze();
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
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i10, final int i11) {
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zzc(i10, i11);
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcco
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzO(i10, i11);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i10) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i10);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccn
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzQ(i10);
            }
        });
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzA(int i10) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzN(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzB(int i10) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzR(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzC(@Nullable String str, @Nullable String[] strArr, @Nullable Integer num) {
        if (str == null) {
            return;
        }
        boolean z10 = true;
        if (strArr == null) {
            this.zzj = new String[]{str};
        } else {
            this.zzj = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.zzi;
        if (!this.zze.zzk || str2 == null || str.equals(str2) || this.zzl != 4) {
            z10 = false;
        }
        this.zzi = str;
        zzW(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzD(int i10, int i11) {
        this.zzq = i10;
        this.zzr = i11;
        zzaa();
    }

    public final zzcbw zzE(@Nullable Integer num) {
        zzcce zzcceVar = this.zze;
        zzccf zzccfVar = this.zzc;
        zzces zzcesVar = new zzces(zzccfVar.getContext(), zzcceVar, zzccfVar, num);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        return zzcesVar;
    }

    public final String zzF() {
        zzccf zzccfVar = this.zzc;
        return com.google.android.gms.ads.internal.zzv.zzq().zzc(zzccfVar.getContext(), zzccfVar.zzn().afmaVersion);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z10, long j3) {
        this.zzc.zzv(z10, j3);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i10, int i11) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzj(i10, i11);
        }
    }

    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            try {
                zzcbwVar.zzT(zza, false);
                return;
            } catch (IOException e2) {
                com.google.android.gms.ads.internal.util.client.zzm.zzk("", e2);
                return;
            }
        }
        com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set volume before player is initialized.");
    }

    public final /* synthetic */ void zzQ(int i10) {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.onWindowVisibilityChanged(i10);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcbk zzcbkVar = this.zzf;
        if (zzcbkVar != null) {
            zzcbkVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzb() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzf() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzg() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final long zzh() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzi(final boolean z10, final long j3) {
        if (this.zzc != null) {
            zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
                @Override // java.lang.Runnable
                public final void run() {
                    zzccx.this.zzJ(z10, j3);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccu
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzv.zzp().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccr
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzm(int i10) {
        if (this.zzl != i10) {
            this.zzl = i10;
            if (i10 != 3) {
                if (i10 == 4) {
                    if (this.zze.zza) {
                        zzX();
                    }
                    this.zzd.zze();
                    this.zzb.zzc();
                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccv
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzccx.this.zzH();
                        }
                    });
                    return;
                }
                return;
            }
            zzV();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl, com.google.android.gms.internal.ads.zzcci
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccm
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccs
                @Override // java.lang.Runnable
                public final void run() {
                    zzccx.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzp() {
        if (zzac()) {
            if (this.zze.zza) {
                zzU();
            }
            this.zzh.zzO(true);
            this.zzd.zzc();
            this.zzb.zzb();
            this.zza.zzb();
            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccl
                @Override // java.lang.Runnable
                public final void run() {
                    zzccx.this.zzS();
                }
            });
            return;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzq(int i10) {
        if (zzac()) {
            this.zzh.zzI(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzr(zzcbk zzcbkVar) {
        this.zzf = zzcbkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzs(@Nullable String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzu(float f10, float f11) {
        zzccd zzccdVar = this.zzm;
        if (zzccdVar != null) {
            zzccdVar.zzf(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbv
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcck
            @Override // java.lang.Runnable
            public final void run() {
                zzccx.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    @Nullable
    public final Integer zzw() {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            return zzcbwVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzx(int i10) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzJ(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzy(int i10) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzK(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbl
    public final void zzz(int i10) {
        zzcbw zzcbwVar = this.zzh;
        if (zzcbwVar != null) {
            zzcbwVar.zzM(i10);
        }
    }
}
