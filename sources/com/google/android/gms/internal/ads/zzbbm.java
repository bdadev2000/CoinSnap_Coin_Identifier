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

/* loaded from: classes2.dex */
public final class zzbbm extends Thread {
    private boolean zza;
    private boolean zzb;
    private final Object zzc;
    private final zzbbd zzd;
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
    private final boolean zzp;

    public zzbbm() {
        zzbbd zzbbdVar = new zzbbd();
        this.zza = false;
        this.zzb = false;
        this.zzd = zzbbdVar;
        this.zzc = new Object();
        this.zzf = ((Long) zzbgb.zzd.zze()).intValue();
        this.zzg = ((Long) zzbgb.zza.zze()).intValue();
        this.zzh = ((Long) zzbgb.zze.zze()).intValue();
        this.zzi = ((Long) zzbgb.zzc.zze()).intValue();
        this.zzj = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzR)).intValue();
        this.zzk = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzS)).intValue();
        this.zzl = ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzT)).intValue();
        this.zze = ((Long) zzbgb.zzf.zze()).intValue();
        this.zzm = (String) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzV);
        this.zzn = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzW)).booleanValue();
        this.zzo = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzX)).booleanValue();
        this.zzp = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzY)).booleanValue();
        setName("ContentFetchTask");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = com.google.android.gms.ads.internal.zzu.zzb().zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zze("ContentFetchThread: no activity. Sleeping.");
        zzf();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0093, code lost:
    
        com.google.android.gms.ads.internal.zzu.zzo().zzw(r0, "ContentFetchTask.extractContent");
        com.google.android.gms.ads.internal.util.client.zzm.zze("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d6, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c7, code lost:
    
        com.google.android.gms.ads.internal.util.client.zzm.zzh("Error in ContentFetchTask", r0);
        com.google.android.gms.ads.internal.zzu.zzo().zzw(r0, "ContentFetchTask.run");
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00de A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00de->B:16:0x00de, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbm.run():void");
    }

    public final zzbbc zza() {
        return this.zzd.zza(this.zzp);
    }

    public final zzbbl zzb(@Nullable View view, zzbbc zzbbcVar) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    zzbbcVar.zzk(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new zzbbl(this, 1, 0);
                }
            } else if ((view instanceof WebView) && !(view instanceof zzchd)) {
                WebView webView = (WebView) view;
                if (PlatformVersion.isAtLeastKitKat()) {
                    zzbbcVar.zzh();
                    webView.post(new zzbbk(this, zzbbcVar, webView, globalVisibleRect));
                    return new zzbbl(this, 0, 1);
                }
            } else if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int i9 = 0;
                int i10 = 0;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    zzbbl zzb = zzb(viewGroup.getChildAt(i11), zzbbcVar);
                    i9 += zzb.zza;
                    i10 += zzb.zzb;
                }
                return new zzbbl(this, i9, i10);
            }
        }
        return new zzbbl(this, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
    
        if (r11 == 0) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzc(android.view.View r11) {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.zzbbc r9 = new com.google.android.gms.internal.ads.zzbbc     // Catch: java.lang.Exception -> L53
            int r1 = r10.zzf     // Catch: java.lang.Exception -> L53
            int r2 = r10.zzg     // Catch: java.lang.Exception -> L53
            int r3 = r10.zzh     // Catch: java.lang.Exception -> L53
            int r4 = r10.zzi     // Catch: java.lang.Exception -> L53
            int r5 = r10.zzj     // Catch: java.lang.Exception -> L53
            int r6 = r10.zzk     // Catch: java.lang.Exception -> L53
            int r7 = r10.zzl     // Catch: java.lang.Exception -> L53
            boolean r8 = r10.zzo     // Catch: java.lang.Exception -> L53
            r0 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzbbh r0 = com.google.android.gms.ads.internal.zzu.zzb()     // Catch: java.lang.Exception -> L53
            android.content.Context r0 = r0.zzb()     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L53
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L53
            if (r1 != 0) goto L55
            android.content.res.Resources r1 = r0.getResources()     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzbeg r2 = com.google.android.gms.internal.ads.zzbep.zzU     // Catch: java.lang.Exception -> L53
            com.google.android.gms.internal.ads.zzben r3 = com.google.android.gms.ads.internal.client.zzba.zzc()     // Catch: java.lang.Exception -> L53
            java.lang.Object r2 = r3.zza(r2)     // Catch: java.lang.Exception -> L53
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L53
            java.lang.String r3 = "id"
            java.lang.String r0 = r0.getPackageName()     // Catch: java.lang.Exception -> L53
            int r0 = r1.getIdentifier(r2, r3, r0)     // Catch: java.lang.Exception -> L53
            java.lang.Object r0 = r11.getTag(r0)     // Catch: java.lang.Exception -> L53
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L55
            java.lang.String r1 = r10.zzm     // Catch: java.lang.Exception -> L53
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L7a
            goto L55
        L53:
            r11 = move-exception
            goto L81
        L55:
            com.google.android.gms.internal.ads.zzbbl r11 = r10.zzb(r11, r9)     // Catch: java.lang.Exception -> L53
            r9.zzm()     // Catch: java.lang.Exception -> L53
            int r0 = r11.zza     // Catch: java.lang.Exception -> L53
            if (r0 != 0) goto L64
            int r0 = r11.zzb     // Catch: java.lang.Exception -> L53
            if (r0 == 0) goto L7a
        L64:
            int r11 = r11.zzb     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L6f
            int r11 = r9.zzc()     // Catch: java.lang.Exception -> L53
            if (r11 == 0) goto L7a
            goto L71
        L6f:
            if (r11 != 0) goto L7b
        L71:
            com.google.android.gms.internal.ads.zzbbd r11 = r10.zzd     // Catch: java.lang.Exception -> L53
            boolean r11 = r11.zzd(r9)     // Catch: java.lang.Exception -> L53
            if (r11 != 0) goto L7a
            goto L7b
        L7a:
            return
        L7b:
            com.google.android.gms.internal.ads.zzbbd r11 = r10.zzd     // Catch: java.lang.Exception -> L53
            r11.zzb(r9)     // Catch: java.lang.Exception -> L53
            return
        L81:
            java.lang.String r0 = "Exception in fetchContentOnUIThread"
            com.google.android.gms.ads.internal.util.client.zzm.zzh(r0, r11)
            java.lang.String r0 = "ContentFetchTask.fetchContent"
            com.google.android.gms.internal.ads.zzcby r1 = com.google.android.gms.ads.internal.zzu.zzo()
            r1.zzw(r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbbm.zzc(android.view.View):void");
    }

    public final void zzd(zzbbc zzbbcVar, WebView webView, String str, boolean z8) {
        zzbbcVar.zzg();
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString(MimeTypes.BASE_TYPE_TEXT);
                if (!this.zzn && !TextUtils.isEmpty(webView.getTitle())) {
                    zzbbcVar.zzl(webView.getTitle() + "\n" + optString, z8, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                } else {
                    zzbbcVar.zzl(optString, z8, webView.getX(), webView.getY(), webView.getWidth(), webView.getHeight());
                }
            }
            if (zzbbcVar.zzo()) {
                this.zzd.zzc(zzbbcVar);
            }
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Json string may be malformed.");
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.client.zzm.zzf("Failed to get webview content.", th);
            com.google.android.gms.ads.internal.zzu.zzo().zzw(th, "ContentFetchTask.processWebViewContent");
        }
    }

    public final void zze() {
        synchronized (this.zzc) {
            try {
                if (this.zza) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Content hash thread already started, quitting...");
                } else {
                    this.zza = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void zzf() {
        synchronized (this.zzc) {
            this.zzb = true;
            com.google.android.gms.ads.internal.util.client.zzm.zze("ContentFetchThread: paused, pause = true");
        }
    }

    public final void zzg() {
        synchronized (this.zzc) {
            this.zzb = false;
            this.zzc.notifyAll();
            com.google.android.gms.ads.internal.util.client.zzm.zze("ContentFetchThread: wakeup");
        }
    }

    public final boolean zzh() {
        return this.zzb;
    }
}
