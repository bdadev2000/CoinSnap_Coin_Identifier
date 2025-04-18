package com.google.android.gms.internal.ads;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.PlatformVersion;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class zzazl extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzazc zzd;
    private final int zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int zzl;
    private final String zzm;
    private final boolean zzn;
    private final boolean zzo;

    public zzazl() {
        zzazc zzazcVar = new zzazc();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzazcVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbee.zzd.zze()).intValue();
        this.zzg = ((Long) zzbee.zza.zze()).intValue();
        this.zzh = ((Long) zzbee.zze.zze()).intValue();
        this.zzi = ((Long) zzbee.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzab)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzac)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzad)).intValue();
        this.zze = ((Long) zzbee.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzaf);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzag)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzah)).booleanValue();
        ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzai)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00c3, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c4, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0042, code lost:
    
        if (r3.importance != 100) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0052, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzv.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0062, code lost:
    
        if (r0 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0064, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zze("ContentFetchThread: no activity. Sleeping.");
        zze();
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x006d, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0072, code lost:
    
        if (r0.getWindow() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x007c, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007e, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x008e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008f, code lost:
    
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00dc A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00dc->B:16:0x00dc, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r6 = this;
        L0:
            com.google.android.gms.internal.ads.zzazg r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Throwable -> La8
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto Lc
            goto Lb2
        Lc:
            java.lang.String r1 = "activity"
            java.lang.Object r1 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager r1 = (android.app.ActivityManager) r1     // Catch: java.lang.Throwable -> La8
            java.lang.String r2 = "keyguard"
            java.lang.Object r2 = r0.getSystemService(r2)     // Catch: java.lang.Throwable -> La8
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            if (r2 == 0) goto Lb2
            java.util.List r1 = r1.getRunningAppProcesses()     // Catch: java.lang.Throwable -> La8
            if (r1 == 0) goto Lb2
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> La8
        L2a:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> La8
            if (r3 == 0) goto Lb2
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> La8
            android.app.ActivityManager$RunningAppProcessInfo r3 = (android.app.ActivityManager.RunningAppProcessInfo) r3     // Catch: java.lang.Throwable -> La8
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> La8
            int r5 = r3.pid     // Catch: java.lang.Throwable -> La8
            if (r4 != r5) goto L2a
            int r1 = r3.importance     // Catch: java.lang.Throwable -> La8
            r3 = 100
            if (r1 != r3) goto Lb2
            boolean r1 = r2.inKeyguardRestrictedInputMode()     // Catch: java.lang.Throwable -> La8
            if (r1 != 0) goto Lb2
            java.lang.String r1 = "power"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> La8
            android.os.PowerManager r0 = (android.os.PowerManager) r0     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            boolean r0 = r0.isScreenOn()     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb2
            com.google.android.gms.internal.ads.zzazg r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            android.app.Activity r0 = r0.zza()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            if (r0 != 0) goto L6d
            java.lang.String r0 = "ContentFetchThread: no activity. Sleeping."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.zze()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        L6d:
            r1 = 0
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r2 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r2 = r2.getDecorView()     // Catch: java.lang.Exception -> L8e
            if (r2 == 0) goto L9d
            android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Exception -> L8e
            android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Exception -> L8e
            r2 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r1 = r0.findViewById(r2)     // Catch: java.lang.Exception -> L8e
            goto L9d
        L8e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbzz r2 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r3 = "ContentFetchTask.extractContent"
            r2.zzw(r0, r3)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r0 = "Failed getting root view of activity. Content not extracted."
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        L9d:
            if (r1 == 0) goto Lba
            com.google.android.gms.internal.ads.zzazh r0 = new com.google.android.gms.internal.ads.zzazh     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r0.<init>(r6, r1)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r1.post(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Lba
        La8:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzbzz r1 = com.google.android.gms.ads.internal.zzv.zzp()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.String r2 = "ContentFetchTask.isInForeground"
            r1.zzw(r0, r2)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lb2:
            java.lang.String r0 = "ContentFetchTask: sleeping"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            r6.zze()     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
        Lba:
            int r0 = r6.zze     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            int r0 = r0 * 1000
            long r0 = (long) r0     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> Lc3 java.lang.InterruptedException -> Ld3
            goto Ld9
        Lc3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
            java.lang.String r1 = "ContentFetchTask.run"
            com.google.android.gms.internal.ads.zzbzz r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r0, r1)
            goto Ld9
        Ld3:
            r0 = move-exception
            java.lang.String r1 = "Error in ContentFetchTask"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r1, r0)
        Ld9:
            java.lang.Object r0 = r6.zzc
            monitor-enter(r0)
        Ldc:
            boolean r1 = r6.zzb     // Catch: java.lang.Throwable -> Lee
            if (r1 == 0) goto Leb
            java.lang.String r1 = "ContentFetchTask: waiting"
            com.google.android.gms.ads.internal.util.client.zzm.zze(r1)     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            java.lang.Object r1 = r6.zzc     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            r1.wait()     // Catch: java.lang.InterruptedException -> Ldc java.lang.Throwable -> Lee
            goto Ldc
        Leb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            goto L0
        Lee:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lee
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazl.run():void");
    }

    public final zzazk zza(@Nullable View view, zzazb zzazbVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzazbVar.zzh(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzazk(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzcfk)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    zzazbVar.zzf();
                    webView.post(new zzazj(this, zzazbVar, webView, globalVisibleRect));
                    return new zzazk(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i10 = 0;
                int i11 = 0;
                for (int i12 = 0; i12 < viewGroup.getChildCount(); i12++) {
                    zzazk zza = zza(viewGroup.getChildAt(i12), zzazbVar);
                    i10 += zza.zza;
                    i11 += zza.zzb;
                }
                return new zzazk(this, i10, i11);
            }
        }
        return new zzazk(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r11 == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzazb r9 = new com.google.android.gms.internal.ads.zzazb     // Catch: java.lang.Exception -> L7e
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L7e
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L7e
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L7e
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L7e
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L7e
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L7e
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L7e
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L7e
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzazg r0 = com.google.android.gms.ads.internal.zzv.zzb()     // Catch: java.lang.Exception -> L7e
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L7e
            if (r1 != 0) goto L52
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbce r2 = com.google.android.gms.internal.ads.zzbcn.zzae     // Catch: java.lang.Exception -> L7e
            com.google.android.gms.internal.ads.zzbcl r3 = com.google.android.gms.ads.internal.client.zzbe.zzc()     // Catch: java.lang.Exception -> L7e
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L7e
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L7e
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L7e
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L52
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L7e
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L77
        L52:
            com.google.android.gms.internal.ads.zzazk r11 = r10.zza(r11, r9)     // Catch: java.lang.Exception -> L7e
            r9.zzj()     // Catch: java.lang.Exception -> L7e
            int r0 = r11.zza     // Catch: java.lang.Exception -> L7e
            if (r0 != 0) goto L61
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r0 == 0) goto L77
        L61:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L6c
            int r11 = r9.zzb()     // Catch: java.lang.Exception -> L7e
            if (r11 == 0) goto L77
            goto L6e
        L6c:
            if (r11 != 0) goto L78
        L6e:
            com.google.android.gms.internal.ads.zzazc r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            boolean r11 = r11.zzc(r9)     // Catch: java.lang.Exception -> L7e
            if (r11 != 0) goto L77
            goto L78
        L77:
            return
        L78:
            com.google.android.gms.internal.ads.zzazc r11 = r10.zzd     // Catch: java.lang.Exception -> L7e
            r11.zza(r9)     // Catch: java.lang.Exception -> L7e
            return
        L7e:
            r11 = move-exception
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r11)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.zzbzz r1 = com.google.android.gms.ads.internal.zzv.zzp()
            r1.zzw(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzazl.zzb(android.view.View):void");
    }

    public final void zzc(zzazb zzazbVar, WebView webView, String str, boolean z10) {
        zzazbVar.zze();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(MimeTypes.BASE_TYPE_TEXT);
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    zzazbVar.zzi(webView.getTitle() + "\n" + optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzazbVar.zzi(optString, z10, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzazbVar.zzl()) {
                this.zzd.zzb(zzazbVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Json string may be malformed.");
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get webview content.", th2);
            com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zzd() {
        synchronized (this.zzc) {
            if (this.zza) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Content hash thread already started, quitting...");
            } else {
                this.zza = true;
                start();
            }
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            this.zzb = true;
            com.google.android.gms.ads.internal.util.client.zzm.zze("ContentFetchThread: paused, pause = true");
        }
    }
}
