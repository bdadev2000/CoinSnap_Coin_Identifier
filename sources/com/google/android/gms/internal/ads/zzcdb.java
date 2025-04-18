package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import androidx.annotation.Nullable;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class zzcdb extends zzcbp implements TextureView.SurfaceTextureListener, zzcbz {
    private final zzccj zzc;
    private final zzcck zzd;
    private final zzcci zze;
    private zzcbo zzf;
    private Surface zzg;
    private zzcca zzh;
    private String zzi;
    private String[] zzj;
    private boolean zzk;
    private int zzl;
    private zzcch zzm;
    private final boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;
    private float zzs;

    public zzcdb(Context context, zzcck zzcckVar, zzccj zzccjVar, boolean z2, boolean z3, zzcci zzcciVar) {
        super(context);
        this.zzl = 1;
        this.zzc = zzccjVar;
        this.zzd = zzcckVar;
        this.zzn = z2;
        this.zze = zzcciVar;
        setSurfaceTextureListener(this);
        zzcckVar.zza(this);
    }

    private static String zzT(String str, Exception exc) {
        return str + RemoteSettings.FORWARD_SLASH_STRING + exc.getClass().getCanonicalName() + CertificateUtil.DELIMITER + exc.getMessage();
    }

    private final void zzU() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzQ(true);
        }
    }

    private final void zzV() {
        if (this.zzo) {
            return;
        }
        this.zzo = true;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcda
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzI();
            }
        });
        zzn();
        this.zzd.zzb();
        if (this.zzp) {
            zzp();
        }
    }

    private final void zzW(boolean z2, @Nullable Integer num) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null && !z2) {
            zzccaVar.zzP(num);
            return;
        }
        if (this.zzi == null || this.zzg == null) {
            return;
        }
        if (z2) {
            if (!zzad()) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                zzccaVar.zzU();
                zzY();
            }
        }
        if (this.zzi.startsWith("cache:")) {
            zzcdv zzp = this.zzc.zzp(this.zzi);
            if (zzp instanceof zzcee) {
                zzcca zza = ((zzcee) zzp).zza();
                this.zzh = zza;
                zza.zzP(num);
                if (!this.zzh.zzV()) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(zzp instanceof zzceb)) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache miss: ".concat(String.valueOf(this.zzi)));
                    return;
                }
                zzceb zzcebVar = (zzceb) zzp;
                String zzF = zzF();
                ByteBuffer zzk = zzcebVar.zzk();
                boolean zzl = zzcebVar.zzl();
                String zzi = zzcebVar.zzi();
                if (zzi == null) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Stream cache URL is null.");
                    return;
                } else {
                    zzcca zzE = zzE(num);
                    this.zzh = zzE;
                    zzE.zzG(new Uri[]{Uri.parse(zzi)}, zzF, zzk, zzl);
                }
            }
        } else {
            this.zzh = zzE(num);
            String zzF2 = zzF();
            Uri[] uriArr = new Uri[this.zzj.length];
            int i2 = 0;
            while (true) {
                String[] strArr = this.zzj;
                if (i2 >= strArr.length) {
                    break;
                }
                uriArr[i2] = Uri.parse(strArr[i2]);
                i2++;
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

    private final void zzX() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzQ(false);
        }
    }

    private final void zzY() {
        if (this.zzh != null) {
            zzZ(null, true);
            zzcca zzccaVar = this.zzh;
            if (zzccaVar != null) {
                zzccaVar.zzL(null);
                this.zzh.zzH();
                this.zzh = null;
            }
            this.zzl = 1;
            this.zzk = false;
            this.zzo = false;
            this.zzp = false;
        }
    }

    private final void zzZ(Surface surface, boolean z2) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set surface before player is initialized.");
            return;
        }
        try {
            zzccaVar.zzS(surface, z2);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
    }

    private final void zzaa() {
        zzab(this.zzq, this.zzr);
    }

    private final void zzab(int i2, int i3) {
        float f2 = i3 > 0 ? i2 / i3 : 1.0f;
        if (this.zzs != f2) {
            this.zzs = f2;
            requestLayout();
        }
    }

    private final boolean zzac() {
        return zzad() && this.zzl != 1;
    }

    private final boolean zzad() {
        zzcca zzccaVar = this.zzh;
        return (zzccaVar == null || !zzccaVar.zzV() || this.zzk) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30053h, this, me);
        return super.dispatchTouchEvent(me);
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = this.zzs;
        if (f2 != 0.0f && this.zzm == null) {
            float f3 = measuredWidth;
            float f4 = f3 / measuredHeight;
            if (f2 > f4) {
                measuredHeight = (int) (f3 / f2);
            }
            if (f2 < f4) {
                measuredWidth = (int) (measuredHeight * f2);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zzc(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
        if (this.zzn) {
            zzcch zzcchVar = new zzcch(getContext());
            this.zzm = zzcchVar;
            zzcchVar.zzd(surfaceTexture, i2, i3);
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
        if (this.zzq == 0 || this.zzr == 0) {
            zzab(i2, i3);
        } else {
            zzaa();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccx
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzM();
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        zzo();
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zze();
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
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcct
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzN();
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, final int i2, final int i3) {
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zzc(i2, i3);
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccs
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzO(i2, i3);
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.zzd.zzf(this);
        this.zza.zza(surfaceTexture, this.zzf);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(final int i2) {
        com.google.android.gms.ads.internal.util.zze.zza("AdExoPlayerView3 window visibility changed to " + i2);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccr
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzQ(i2);
            }
        });
        super.onWindowVisibilityChanged(i2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzA(int i2) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzN(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzB(int i2) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzR(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
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
        boolean z2 = false;
        if (this.zze.zzk && str2 != null && !str.equals(str2) && this.zzl == 4) {
            z2 = true;
        }
        this.zzi = str;
        zzW(z2, num);
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzD(int i2, int i3) {
        this.zzq = i2;
        this.zzr = i3;
        zzaa();
    }

    public final zzcca zzE(@Nullable Integer num) {
        zzcci zzcciVar = this.zze;
        zzccj zzccjVar = this.zzc;
        zzcew zzcewVar = new zzcew(zzccjVar.getContext(), zzcciVar, zzccjVar, num);
        com.google.android.gms.ads.internal.util.client.zzm.zzi("ExoPlayerAdapter initialized.");
        return zzcewVar;
    }

    public final String zzF() {
        zzccj zzccjVar = this.zzc;
        return com.google.android.gms.ads.internal.zzu.zzp().zzc(zzccjVar.getContext(), zzccjVar.zzn().afmaVersion);
    }

    public final /* synthetic */ void zzG(String str) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzb("ExoPlayerAdapter error", str);
        }
    }

    public final /* synthetic */ void zzH() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zza();
        }
    }

    public final /* synthetic */ void zzI() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzf();
        }
    }

    public final /* synthetic */ void zzJ(boolean z2, long j2) {
        this.zzc.zzv(z2, j2);
    }

    public final /* synthetic */ void zzK(String str) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzc("ExoPlayerAdapter exception", str);
        }
    }

    public final /* synthetic */ void zzL() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzg();
        }
    }

    public final /* synthetic */ void zzM() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzh();
        }
    }

    public final /* synthetic */ void zzN() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzi();
        }
    }

    public final /* synthetic */ void zzO(int i2, int i3) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzj(i2, i3);
        }
    }

    public final /* synthetic */ void zzP() {
        float zza = this.zzb.zza();
        zzcca zzccaVar = this.zzh;
        if (zzccaVar == null) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Trying to set volume before player is initialized.");
            return;
        }
        try {
            zzccaVar.zzT(zza, false);
        } catch (IOException e) {
            com.google.android.gms.ads.internal.util.client.zzm.zzk("", e);
        }
    }

    public final /* synthetic */ void zzQ(int i2) {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.onWindowVisibilityChanged(i2);
        }
    }

    public final /* synthetic */ void zzR() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zzd();
        }
    }

    public final /* synthetic */ void zzS() {
        zzcbo zzcboVar = this.zzf;
        if (zzcboVar != null) {
            zzcboVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zza() {
        if (zzac()) {
            return (int) this.zzh.zzy();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzb() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzr();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzc() {
        if (zzac()) {
            return (int) this.zzh.zzz();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zzd() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final int zze() {
        return this.zzq;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzf() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzx();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzg() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzA();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final long zzh() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzB();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzi(final boolean z2, final long j2) {
        if (this.zzc != null) {
            zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccu
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdb.this.zzJ(z2, j2);
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final String zzj() {
        return "ExoPlayer/2".concat(true != this.zzn ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzk(String str, Exception exc) {
        final String zzT = zzT(str, exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter error: ".concat(zzT));
        this.zzk = true;
        if (this.zze.zza) {
            zzX();
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccy
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzG(zzT);
            }
        });
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onError");
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzl(String str, Exception exc) {
        final String zzT = zzT("onLoadException", exc);
        com.google.android.gms.ads.internal.util.client.zzm.zzj("ExoPlayerAdapter exception: ".concat(zzT));
        com.google.android.gms.ads.internal.zzu.zzo().zzv(exc, "AdExoPlayerView.onException");
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccv
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzK(zzT);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzm(int i2) {
        if (this.zzl != i2) {
            this.zzl = i2;
            if (i2 == 3) {
                zzV();
                return;
            }
            if (i2 != 4) {
                return;
            }
            if (this.zze.zza) {
                zzX();
            }
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccz
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdb.this.zzH();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp, com.google.android.gms.internal.ads.zzccm
    public final void zzn() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccq
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzP();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzo() {
        if (zzac()) {
            if (this.zze.zza) {
                zzX();
            }
            this.zzh.zzO(false);
            this.zzd.zze();
            this.zzb.zzc();
            com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccw
                @Override // java.lang.Runnable
                public final void run() {
                    zzcdb.this.zzR();
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzp() {
        if (!zzac()) {
            this.zzp = true;
            return;
        }
        if (this.zze.zza) {
            zzU();
        }
        this.zzh.zzO(true);
        this.zzd.zzc();
        this.zzb.zzb();
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzccp
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzS();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzq(int i2) {
        if (zzac()) {
            this.zzh.zzI(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzr(zzcbo zzcboVar) {
        this.zzf = zzcboVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzs(@Nullable String str) {
        if (str != null) {
            zzC(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzt() {
        if (zzad()) {
            this.zzh.zzU();
            zzY();
        }
        this.zzd.zze();
        this.zzb.zzc();
        this.zzd.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzu(float f2, float f3) {
        zzcch zzcchVar = this.zzm;
        if (zzcchVar != null) {
            zzcchVar.zzf(f2, f3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbz
    public final void zzv() {
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcco
            @Override // java.lang.Runnable
            public final void run() {
                zzcdb.this.zzL();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    @Nullable
    public final Integer zzw() {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            return zzccaVar.zzC();
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzx(int i2) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzJ(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzy(int i2) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzK(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbp
    public final void zzz(int i2) {
        zzcca zzccaVar = this.zzh;
        if (zzccaVar != null) {
            zzccaVar.zzM(i2);
        }
    }
}
