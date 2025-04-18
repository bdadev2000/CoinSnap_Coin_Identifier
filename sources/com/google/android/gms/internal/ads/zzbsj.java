package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;

/* loaded from: classes3.dex */
public final class zzbsj extends zzbsp {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcfo zzj;
    private final Activity zzk;
    private zzchi zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsq zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbsj(zzcfo zzcfoVar, zzbsq zzbsqVar) {
        super(zzcfoVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcfoVar;
        this.zzk = zzcfoVar.zzi();
        this.zzo = zzbsqVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkv)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkw)).booleanValue()) {
            ViewParent parent = ((View) this.zzj).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.zzj);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzkx)).booleanValue()) {
                try {
                    this.zzr.addView((View) this.zzj);
                    this.zzj.zzaj(this.zzl);
                } catch (IllegalStateException e) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to add webview back to view hierarchy.", e);
                }
            } else {
                this.zzr.addView((View) this.zzj);
                this.zzj.zzaj(this.zzl);
            }
        }
        if (z2) {
            zzl("default");
            zzbsq zzbsqVar = this.zzo;
            if (zzbsqVar != null) {
                zzbsqVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zza(final boolean z2) {
        synchronized (this.zzi) {
            try {
                if (this.zzp != null) {
                    if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzku)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        zzc(z2);
                    } else {
                        zzcan.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsh
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzbsj.this.zzc(z2);
                            }
                        });
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0269, code lost:
    
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026f, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0290 A[Catch: all -> 0x0014, TryCatch #1 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0032, B:18:0x0037, B:20:0x0039, B:22:0x0041, B:23:0x0046, B:25:0x0048, B:27:0x0056, B:28:0x0067, B:30:0x0075, B:31:0x0086, B:33:0x0094, B:34:0x00a5, B:36:0x00b3, B:37:0x00c4, B:39:0x00d2, B:40:0x00e0, B:42:0x00ee, B:43:0x00f0, B:45:0x00f4, B:47:0x00f8, B:49:0x0100, B:52:0x0108, B:56:0x0130, B:62:0x013c, B:64:0x0269, B:65:0x026e, B:67:0x0270, B:69:0x0290, B:71:0x0294, B:73:0x02a1, B:74:0x02de, B:89:0x0399, B:90:0x03c8, B:92:0x03e0, B:93:0x0401, B:95:0x0409, B:96:0x0410, B:97:0x0436, B:101:0x0439, B:103:0x0459, B:104:0x046e, B:106:0x03a0, B:107:0x03a7, B:108:0x03ae, B:109:0x03b5, B:110:0x03bb, B:111:0x03c2, B:128:0x02db, B:129:0x0470, B:130:0x0475, B:132:0x0143, B:134:0x0147, B:145:0x019a, B:146:0x01a4, B:148:0x01f7, B:150:0x01fa, B:152:0x01ff, B:155:0x0205, B:156:0x01a8, B:157:0x01b2, B:158:0x01b9, B:159:0x01c5, B:160:0x01cd, B:161:0x01e1, B:162:0x01ed, B:179:0x0219, B:183:0x0247, B:186:0x0257, B:187:0x024d, B:189:0x0255, B:190:0x023d, B:192:0x0243, B:194:0x025c, B:195:0x0262, B:196:0x0477, B:197:0x047c, B:199:0x047e, B:200:0x0483), top: B:3:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsj.zzb(java.util.Map):void");
    }

    public final void zzd(int i2, int i3, boolean z2) {
        synchronized (this.zzi) {
            this.zzc = i2;
            this.zzd = i3;
        }
    }

    public final void zze(int i2, int i3) {
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean zzf() {
        boolean z2;
        synchronized (this.zzi) {
            z2 = this.zzp != null;
        }
        return z2;
    }
}
