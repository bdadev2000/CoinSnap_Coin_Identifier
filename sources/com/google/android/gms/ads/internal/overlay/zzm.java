package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbuj;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzbvf;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzegl;
import com.google.android.gms.internal.ads.zzegm;
import com.google.android.gms.internal.ads.zzehe;
import com.google.android.gms.internal.ads.zzehg;
import com.google.android.gms.internal.ads.zzfuv;
import java.util.Collections;

/* loaded from: classes2.dex */
public class zzm extends zzbvf implements zzae {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;

    @Nullable
    AdOverlayInfoParcel zzc;
    zzchd zzd;
    zzi zze;
    zzs zzf;
    FrameLayout zzh;
    WebChromeClient.CustomViewCallback zzi;
    zzh zzl;
    private Runnable zzq;
    private boolean zzr;
    private boolean zzs;
    private Toolbar zzw;
    boolean zzg = false;
    boolean zzj = false;
    boolean zzk = false;
    boolean zzm = false;
    int zzn = 1;
    private final Object zzo = new Object();
    private final View.OnClickListener zzp = new zzf(this);
    private boolean zzt = false;
    private boolean zzu = false;
    private boolean zzv = true;

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    private final void zzJ(View view) {
        zzehg zzQ;
        zzehe zzP;
        if (((Boolean) zzba.zzc().zza(zzbep.zzfc)).booleanValue() && (zzP = this.zzd.zzP()) != null) {
            zzP.zza(view);
        } else if (((Boolean) zzba.zzc().zza(zzbep.zzfb)).booleanValue() && (zzQ = this.zzd.zzQ()) != null && zzQ.zzb()) {
            com.google.android.gms.ads.internal.zzu.zzA().zzg(zzQ.zza(), view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzaG)).booleanValue() != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0048, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(com.google.android.gms.internal.ads.zzbep.zzaF)).booleanValue() != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzK(android.content.res.Configuration r6) {
        /*
            r5 = this;
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r0 = r5.zzc
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L10
            com.google.android.gms.ads.internal.zzk r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.zzb
            com.google.android.gms.ads.internal.util.zzab r4 = com.google.android.gms.ads.internal.zzu.zzq()
            boolean r6 = r4.zzd(r3, r6)
            boolean r3 = r5.zzk
            if (r3 == 0) goto L36
            if (r0 != 0) goto L36
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzaG
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L34
            goto L36
        L34:
            r1 = r2
            goto L57
        L36:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbeg r6 = com.google.android.gms.internal.ads.zzbep.zzaF
            com.google.android.gms.internal.ads.zzben r0 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L34
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzc
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzk r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.zzb
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbeg r0 = com.google.android.gms.internal.ads.zzbep.zzbf
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L83
            android.view.View r6 = r6.getDecorView()
            if (r1 == 0) goto L7d
            if (r2 == 0) goto L7a
            r0 = 5894(0x1706, float:8.259E-42)
            goto L7f
        L7a:
            r0 = 5380(0x1504, float:7.539E-42)
            goto L7f
        L7d:
            r0 = 256(0x100, float:3.59E-43)
        L7f:
            r6.setSystemUiVisibility(r0)
            return
        L83:
            r0 = 2048(0x800, float:2.87E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r3)
            r6.clearFlags(r0)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r0)
            r6.clearFlags(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzK(android.content.res.Configuration):void");
    }

    private static final void zzL(@Nullable zzehg zzehgVar, @Nullable View view) {
        if (zzehgVar != null && view != null) {
            if (!((Boolean) zzba.zzc().zza(zzbep.zzfb)).booleanValue() || !zzehgVar.zzb()) {
                com.google.android.gms.ads.internal.zzu.zzA().zzj(zzehgVar.zza(), view);
            }
        }
    }

    public final void zzA(int i9) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzba.zzc().zza(zzbep.zzgh)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzba.zzc().zza(zzbep.zzgi)).intValue()) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= ((Integer) zzba.zzc().zza(zzbep.zzgj)).intValue()) {
                    if (i10 <= ((Integer) zzba.zzc().zza(zzbep.zzgk)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i9);
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.zzu.zzo().zzv(th, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z8) {
        if (z8) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzC(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        FrameLayout frameLayout = new FrameLayout(this.zzb);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        this.zzb.setContentView(this.zzh);
        this.zzs = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzD(boolean r27) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
            Method dump skipped, instructions count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzD(boolean):void");
    }

    public final void zzE() {
        synchronized (this.zzo) {
            try {
                this.zzr = true;
                Runnable runnable = this.zzq;
                if (runnable != null) {
                    zzfuv zzfuvVar = com.google.android.gms.ads.internal.util.zzt.zza;
                    zzfuvVar.removeCallbacks(runnable);
                    zzfuvVar.post(this.zzq);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzp zzpVar;
        if (this.zzb.isFinishing() && !this.zzt) {
            this.zzt = true;
            zzchd zzchdVar = this.zzd;
            if (zzchdVar != null) {
                zzchdVar.zzZ(this.zzn - 1);
                synchronized (this.zzo) {
                    try {
                        if (!this.zzr && this.zzd.zzaC()) {
                            if (((Boolean) zzba.zzc().zza(zzbep.zzeN)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
                                zzpVar.zzdq();
                            }
                            Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                                @Override // java.lang.Runnable
                                public final void run() {
                                    zzm.this.zzc();
                                }
                            };
                            this.zzq = runnable;
                            com.google.android.gms.ads.internal.util.zzt.zza.postDelayed(runnable, ((Long) zzba.zzc().zza(zzbep.zzaY)).longValue());
                            return;
                        }
                    } finally {
                    }
                }
            }
            zzc();
        }
    }

    public final void zzG(String str) {
        Toolbar toolbar = this.zzw;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zziU)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zzaH = this.zzd.zzaH();
        if (!zzaH) {
            this.zzd.zzd("onbackblocked", Collections.emptyMap());
        }
        return zzaH;
    }

    public final void zzb() {
        this.zzn = 3;
        this.zzb.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && adOverlayInfoParcel.zzk == 5) {
            this.zzb.overridePendingTransition(0, 0);
        }
    }

    public final void zzc() {
        zzchd zzchdVar;
        zzp zzpVar;
        if (!this.zzu) {
            this.zzu = true;
            zzchd zzchdVar2 = this.zzd;
            if (zzchdVar2 != null) {
                this.zzl.removeView(zzchdVar2.zzF());
                zzi zziVar = this.zze;
                if (zziVar != null) {
                    this.zzd.zzan(zziVar.zzd);
                    this.zzd.zzaq(false);
                    if (((Boolean) zzba.zzc().zza(zzbep.zzmE)).booleanValue() && this.zzd.getParent() != null) {
                        ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzF());
                    }
                    ViewGroup viewGroup = this.zze.zzc;
                    View zzF = this.zzd.zzF();
                    zzi zziVar2 = this.zze;
                    viewGroup.addView(zzF, zziVar2.zza, zziVar2.zzb);
                    this.zze = null;
                } else if (this.zzb.getApplicationContext() != null) {
                    this.zzd.zzan(this.zzb.getApplicationContext());
                }
                this.zzd = null;
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
                zzpVar.zzdu(this.zzn);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzchdVar = adOverlayInfoParcel2.zzd) != null) {
                zzL(zzchdVar.zzQ(), this.zzc.zzd.zzF());
            }
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzegm zzegmVar) throws zzg, RemoteException {
        zzbuz zzbuzVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzbuzVar = adOverlayInfoParcel.zzv) != null) {
            zzbuzVar.zzg(ObjectWrapper.wrap(zzegmVar));
            return;
        }
        throw new zzg("noioou");
    }

    public final void zzg() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzA(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzs = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzh(int i9, int i10, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzae
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzK((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[Catch: zzg -> 0x0039, TryCatch #0 {zzg -> 0x0039, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003c, B:19:0x0047, B:21:0x0052, B:22:0x0054, B:24:0x005c, B:25:0x006a, B:27:0x0071, B:30:0x007e, B:32:0x0082, B:34:0x0087, B:36:0x0095, B:38:0x0099, B:40:0x009f, B:41:0x00a2, B:43:0x00a8, B:44:0x00ab, B:46:0x00b1, B:48:0x00b5, B:49:0x00b8, B:51:0x00be, B:52:0x00c1, B:59:0x00f0, B:62:0x00f4, B:63:0x00fb, B:64:0x00fc, B:66:0x0100, B:68:0x010d, B:70:0x0078, B:72:0x007c, B:73:0x0091, B:74:0x0111, B:75:0x0118), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d A[Catch: zzg -> 0x0039, TryCatch #0 {zzg -> 0x0039, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x003c, B:19:0x0047, B:21:0x0052, B:22:0x0054, B:24:0x005c, B:25:0x006a, B:27:0x0071, B:30:0x007e, B:32:0x0082, B:34:0x0087, B:36:0x0095, B:38:0x0099, B:40:0x009f, B:41:0x00a2, B:43:0x00a8, B:44:0x00ab, B:46:0x00b1, B:48:0x00b5, B:49:0x00b8, B:51:0x00be, B:52:0x00c1, B:59:0x00f0, B:62:0x00f4, B:63:0x00fb, B:64:0x00fc, B:66:0x0100, B:68:0x010d, B:70:0x0078, B:72:0x007c, B:73:0x0091, B:74:0x0111, B:75:0x0118), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbvg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzm() {
        zzchd zzchdVar = this.zzd;
        if (zzchdVar != null) {
            try {
                this.zzl.removeView(zzchdVar.zzF());
            } catch (NullPointerException unused) {
            }
        }
        zzF();
    }

    public final void zzn() {
        if (this.zzm) {
            this.zzm = false;
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzo() {
        zzp zzpVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdk();
        }
        if (!((Boolean) zzba.zzc().zza(zzbep.zzeP)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzp(int i9, String[] strArr, int[] iArr) {
        zzm zzmVar;
        if (i9 == 12345) {
            Activity activity = this.zzb;
            zzegl zze = zzegm.zze();
            zze.zza(activity);
            if (this.zzc.zzk == 5) {
                zzmVar = this;
            } else {
                zzmVar = null;
            }
            zze.zzb(zzmVar);
            try {
                this.zzc.zzv.zzf(strArr, iArr, ObjectWrapper.wrap(zze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzr() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdH();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzba.zzc().zza(zzbep.zzeP)).booleanValue()) {
            zzchd zzchdVar = this.zzd;
            if (zzchdVar != null && !zzchdVar.zzaE()) {
                this.zzd.onResume();
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzt() {
        if (((Boolean) zzba.zzc().zza(zzbep.zzeP)).booleanValue()) {
            zzchd zzchdVar = this.zzd;
            if (zzchdVar != null && !zzchdVar.zzaE()) {
                this.zzd.onResume();
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzu() {
        if (((Boolean) zzba.zzc().zza(zzbep.zzeP)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzv() {
        zzp zzpVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzpVar = adOverlayInfoParcel.zzc) != null) {
            zzpVar.zzdt();
        }
    }

    public final void zzw(boolean z8) {
        boolean z9;
        int i9;
        int i10;
        if (this.zzc.zzw) {
            return;
        }
        int intValue = ((Integer) zzba.zzc().zza(zzbep.zzeS)).intValue();
        int i11 = 0;
        if (((Boolean) zzba.zzc().zza(zzbep.zzbb)).booleanValue() || z8) {
            z9 = true;
        } else {
            z9 = false;
        }
        zzr zzrVar = new zzr();
        zzrVar.zzd = 50;
        if (true != z9) {
            i9 = 0;
        } else {
            i9 = intValue;
        }
        zzrVar.zza = i9;
        if (true != z9) {
            i11 = intValue;
        }
        zzrVar.zzb = i11;
        zzrVar.zzc = intValue;
        this.zzf = new zzs(this.zzb, zzrVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z9) {
            i10 = 9;
        } else {
            i10 = 11;
        }
        layoutParams.addRule(i10);
        zzy(z8, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbvg
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z8, boolean z9) {
        boolean z10;
        boolean z11;
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzk zzkVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzk zzkVar2;
        boolean z12 = true;
        if (((Boolean) zzba.zzc().zza(zzbep.zzaZ)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzkVar2 = adOverlayInfoParcel2.zzo) != null && zzkVar2.zzh) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (((Boolean) zzba.zzc().zza(zzbep.zzba)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzkVar = adOverlayInfoParcel.zzo) != null && zzkVar.zzi) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z8 && z9 && z10 && !z11) {
            new zzbuj(this.zzd, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzs zzsVar = this.zzf;
        if (zzsVar != null) {
            if (!z11 && (!z9 || z10)) {
                z12 = false;
            }
            zzsVar.zzb(z12);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
