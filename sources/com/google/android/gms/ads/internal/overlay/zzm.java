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
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbsk;
import com.google.android.gms.internal.ads.zzbsz;
import com.google.android.gms.internal.ads.zzbtf;
import com.google.android.gms.internal.ads.zzcfk;
import com.google.android.gms.internal.ads.zzeeb;
import com.google.android.gms.internal.ads.zzeec;
import com.google.android.gms.internal.ads.zzeeu;
import com.google.android.gms.internal.ads.zzeew;
import com.google.android.gms.internal.ads.zzftd;
import java.util.Collections;

/* loaded from: classes3.dex */
public class zzm extends zzbtf implements zzag {
    static final int zza = Color.argb(0, 0, 0, 0);
    protected final Activity zzb;

    @Nullable
    AdOverlayInfoParcel zzc;
    zzcfk zzd;
    zzi zze;
    zzu zzf;
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
        zzeew zzQ;
        zzeeu zzP;
        zzcfk zzcfkVar = this.zzd;
        if (zzcfkVar != null) {
            if (((Boolean) zzbe.zzc().zza(zzbcn.zzfe)).booleanValue() && (zzP = zzcfkVar.zzP()) != null) {
                zzP.zza(view);
            } else if (((Boolean) zzbe.zzc().zza(zzbcn.zzfd)).booleanValue() && (zzQ = zzcfkVar.zzQ()) != null && zzQ.zzb()) {
                com.google.android.gms.ads.internal.zzv.zzB().zzg(zzQ.zza(), view);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzaN)).booleanValue() != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0045, code lost:
    
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(com.google.android.gms.internal.ads.zzbcn.zzaM)).booleanValue() != false) goto L20;
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
            com.google.android.gms.ads.internal.zzl r0 = r0.zzo
            if (r0 == 0) goto L10
            boolean r0 = r0.zzb
            if (r0 == 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            android.app.Activity r3 = r5.zzb
            com.google.android.gms.ads.internal.util.zzaa r4 = com.google.android.gms.ads.internal.zzv.zzr()
            boolean r6 = r4.zzd(r3, r6)
            boolean r3 = r5.zzk
            if (r3 == 0) goto L33
            if (r0 != 0) goto L33
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzaN
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r0 = r3.zza(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L48
        L33:
            if (r6 == 0) goto L4a
            com.google.android.gms.internal.ads.zzbce r6 = com.google.android.gms.internal.ads.zzbcn.zzaM
            com.google.android.gms.internal.ads.zzbcl r0 = com.google.android.gms.ads.internal.client.zzbe.zzc()
            java.lang.Object r6 = r0.zza(r6)
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L48
            goto L4a
        L48:
            r1 = r2
            goto L57
        L4a:
            com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel r6 = r5.zzc
            if (r6 == 0) goto L57
            com.google.android.gms.ads.internal.zzl r6 = r6.zzo
            if (r6 == 0) goto L57
            boolean r6 = r6.zzg
            if (r6 == 0) goto L57
            r2 = r1
        L57:
            android.app.Activity r6 = r5.zzb
            android.view.Window r6 = r6.getWindow()
            com.google.android.gms.internal.ads.zzbce r0 = com.google.android.gms.internal.ads.zzbcn.zzbl
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()
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
            r0 = 1024(0x400, float:1.435E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L9b
            r6.addFlags(r0)
            r6.clearFlags(r3)
            if (r2 == 0) goto L9a
            android.view.View r6 = r6.getDecorView()
            r0 = 4098(0x1002, float:5.743E-42)
            r6.setSystemUiVisibility(r0)
        L9a:
            return
        L9b:
            r6.addFlags(r3)
            r6.clearFlags(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzK(android.content.res.Configuration):void");
    }

    private static final void zzL(@Nullable zzeew zzeewVar, @Nullable View view) {
        if (zzeewVar != null && view != null) {
            if (!((Boolean) zzbe.zzc().zza(zzbcn.zzfd)).booleanValue() || !zzeewVar.zzb()) {
                com.google.android.gms.ads.internal.zzv.zzB().zzj(zzeewVar.zza(), view);
            }
        }
    }

    public final void zzA(int i10) {
        if (this.zzb.getApplicationInfo().targetSdkVersion >= ((Integer) zzbe.zzc().zza(zzbcn.zzfR)).intValue()) {
            if (this.zzb.getApplicationInfo().targetSdkVersion <= ((Integer) zzbe.zzc().zza(zzbcn.zzfS)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzbe.zzc().zza(zzbcn.zzfT)).intValue()) {
                    if (i11 <= ((Integer) zzbe.zzc().zza(zzbcn.zzfU)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            this.zzb.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzv.zzp().zzv(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzB(boolean z10) {
        if (z10) {
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

    /* JADX WARN: Removed duplicated region for block: B:107:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzD(boolean r27) throws com.google.android.gms.ads.internal.overlay.zzg {
        /*
            Method dump skipped, instructions count: 695
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzD(boolean):void");
    }

    public final void zzE() {
        synchronized (this.zzo) {
            this.zzr = true;
            Runnable runnable = this.zzq;
            if (runnable != null) {
                zzftd zzftdVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzftdVar.removeCallbacks(runnable);
                zzftdVar.post(this.zzq);
            }
        }
    }

    public final void zzF() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (this.zzb.isFinishing() && !this.zzt) {
            this.zzt = true;
            zzcfk zzcfkVar = this.zzd;
            if (zzcfkVar != null) {
                zzcfkVar.zzZ(this.zzn - 1);
                synchronized (this.zzo) {
                    if (!this.zzr && this.zzd.zzaC()) {
                        if (((Boolean) zzbe.zzc().zza(zzbcn.zzeP)).booleanValue() && !this.zzu && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                            zzrVar.zzdq();
                        }
                        Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzd
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzm.this.zzc();
                            }
                        };
                        this.zzq = runnable;
                        com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbe.zzc().zza(zzbcn.zzbe)).longValue());
                        return;
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

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final boolean zzH() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcn.zziz)).booleanValue() && this.zzd.canGoBack()) {
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
        zzcfk zzcfkVar;
        zzr zzrVar;
        if (!this.zzu) {
            this.zzu = true;
            zzcfk zzcfkVar2 = this.zzd;
            if (zzcfkVar2 != null) {
                this.zzl.removeView(zzcfkVar2.zzF());
                zzi zziVar = this.zze;
                if (zziVar != null) {
                    this.zzd.zzan(zziVar.zzd);
                    this.zzd.zzaq(false);
                    if (((Boolean) zzbe.zzc().zza(zzbcn.zzmq)).booleanValue() && this.zzd.getParent() != null) {
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
            if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                zzrVar.zzdu(this.zzn);
            }
            AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
            if (adOverlayInfoParcel2 != null && (zzcfkVar = adOverlayInfoParcel2.zzd) != null) {
                zzL(zzcfkVar.zzQ(), this.zzc.zzd.zzF());
            }
        }
    }

    public final void zzd() {
        this.zzl.zzb = true;
    }

    public final void zze() {
        this.zzd.zzaa();
    }

    public final void zzf(zzeec zzeecVar) throws zzg, RemoteException {
        zzbsz zzbszVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzbszVar = adOverlayInfoParcel.zzv) != null) {
            zzbszVar.zzg(ObjectWrapper.wrap(zzeecVar));
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

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzh(int i10, int i11, Intent intent) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzi() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzag
    public final void zzj() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzk(IObjectWrapper iObjectWrapper) {
        zzK((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0092 A[Catch: zzg -> 0x0116, TryCatch #0 {zzg -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a A[Catch: zzg -> 0x0116, TryCatch #0 {zzg -> 0x0116, blocks: (B:11:0x001b, B:13:0x0029, B:15:0x002d, B:17:0x0033, B:18:0x0039, B:19:0x0044, B:21:0x004f, B:22:0x0051, B:24:0x0059, B:25:0x0067, B:27:0x006e, B:30:0x007b, B:32:0x007f, B:34:0x0084, B:36:0x0092, B:38:0x0096, B:40:0x009c, B:41:0x009f, B:43:0x00a5, B:44:0x00a8, B:46:0x00ae, B:48:0x00b2, B:49:0x00b5, B:51:0x00bb, B:52:0x00be, B:59:0x00ed, B:62:0x00f1, B:63:0x00f8, B:64:0x00f9, B:66:0x00fd, B:68:0x010a, B:70:0x0075, B:72:0x0079, B:73:0x008e, B:74:0x010e, B:75:0x0115), top: B:10:0x001b }] */
    @Override // com.google.android.gms.internal.ads.zzbtg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void zzl(android.os.Bundle r9) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.overlay.zzm.zzl(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzm() {
        zzcfk zzcfkVar = this.zzd;
        if (zzcfkVar != null) {
            try {
                this.zzl.removeView(zzcfkVar.zzF());
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

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzo() {
        zzr zzrVar;
        zzg();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdk();
        }
        if (!((Boolean) zzbe.zzc().zza(zzbcn.zzeR)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzp(int i10, String[] strArr, int[] iArr) {
        zzm zzmVar;
        if (i10 == 12345) {
            Activity activity = this.zzb;
            zzeeb zze = zzeec.zze();
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

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzq() {
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzr() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdH();
        }
        zzK(this.zzb.getResources().getConfiguration());
        if (!((Boolean) zzbe.zzc().zza(zzbcn.zzeR)).booleanValue()) {
            zzcfk zzcfkVar = this.zzd;
            if (zzcfkVar != null && !zzcfkVar.zzaE()) {
                this.zzd.onResume();
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzs(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzt() {
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzeR)).booleanValue()) {
            zzcfk zzcfkVar = this.zzd;
            if (zzcfkVar != null && !zzcfkVar.zzaE()) {
                this.zzd.onResume();
            } else {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("The webview does not exist. Ignoring action.");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzu() {
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzeR)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzF();
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzv() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdt();
    }

    public final void zzw(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        if (this.zzc.zzw) {
            return;
        }
        int intValue = ((Integer) zzbe.zzc().zza(zzbcn.zzeU)).intValue();
        int i12 = 0;
        if (!((Boolean) zzbe.zzc().zza(zzbcn.zzbh)).booleanValue() && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        if (true != z11) {
            i10 = 0;
        } else {
            i10 = intValue;
        }
        zztVar.zza = i10;
        if (true != z11) {
            i12 = intValue;
        }
        zztVar.zzb = i12;
        zztVar.zzc = intValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        if (true != z11) {
            i11 = 9;
        } else {
            i11 = 11;
        }
        layoutParams.addRule(i11);
        zzy(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzJ(this.zzf);
    }

    @Override // com.google.android.gms.internal.ads.zzbtg
    public final void zzx() {
        this.zzs = true;
    }

    public final void zzy(boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z14 = true;
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzbf)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzbg)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z10 && z11 && z12 && !z13) {
            new zzbsk(this.zzd, "useCustomClose").zzh("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z13 && (!z11 || z12)) {
                z14 = false;
            }
            zzuVar.zzb(z14);
        }
    }

    public final void zzz() {
        this.zzl.removeView(this.zzf);
        zzw(true);
    }
}
