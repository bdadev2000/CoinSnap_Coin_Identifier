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
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* loaded from: classes3.dex */
public final class zzbse extends zzbsk {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcfk zzj;
    private final Activity zzk;
    private zzche zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbsl zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    static {
        CollectionUtils.setOf("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");
    }

    public zzbse(zzcfk zzcfkVar, zzbsl zzbslVar) {
        super(zzcfkVar, "resize");
        this.zza = "top-right";
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcfkVar;
        this.zzk = zzcfkVar.zzi();
        this.zzo = zzbslVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkx)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzky)).booleanValue()) {
            ViewParent parent = ((View) this.zzj).getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.zzj);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkz)).booleanValue()) {
                try {
                    this.zzr.addView((View) this.zzj);
                    this.zzj.zzaj(this.zzl);
                } catch (IllegalStateException e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Unable to add webview back to view hierarchy.", e2);
                }
            } else {
                this.zzr.addView((View) this.zzj);
                this.zzj.zzaj(this.zzl);
            }
        }
        if (z10) {
            zzl("default");
            zzbsl zzbslVar = this.zzo;
            if (zzbslVar != null) {
                zzbslVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    public final void zza(final boolean z10) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzkw)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                    zzcaj.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbsc
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzbse.this.zzc(z10);
                        }
                    });
                } else {
                    zzc(z10);
                }
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:65:0x026b A[Catch: all -> 0x0487, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002f, B:18:0x0034, B:20:0x0036, B:22:0x003e, B:23:0x0043, B:25:0x0045, B:27:0x0053, B:28:0x0064, B:30:0x0072, B:31:0x0083, B:33:0x0091, B:34:0x00a2, B:36:0x00b0, B:37:0x00c1, B:39:0x00cf, B:40:0x00dd, B:42:0x00eb, B:43:0x00ed, B:45:0x00f1, B:47:0x00f5, B:49:0x00fd, B:52:0x0105, B:56:0x012b, B:62:0x0137, B:65:0x026b, B:66:0x0270, B:68:0x0272, B:70:0x0292, B:72:0x0296, B:74:0x02a3, B:75:0x02e0, B:105:0x039a, B:106:0x03c9, B:108:0x03e1, B:109:0x0402, B:111:0x040a, B:112:0x0411, B:113:0x0438, B:117:0x043b, B:119:0x045b, B:120:0x0470, B:122:0x03a1, B:123:0x03a8, B:124:0x03af, B:125:0x03b6, B:126:0x03bc, B:127:0x03c3, B:128:0x02dd, B:129:0x0472, B:130:0x0477, B:132:0x013e, B:134:0x0142, B:145:0x0195, B:147:0x01f4, B:149:0x01f9, B:151:0x01fc, B:153:0x0201, B:156:0x0207, B:157:0x01a2, B:159:0x01c2, B:161:0x01af, B:162:0x01bb, B:163:0x01cb, B:165:0x01d8, B:166:0x01e1, B:167:0x01ed, B:184:0x0219, B:187:0x0244, B:190:0x0255, B:191:0x024b, B:193:0x0253, B:194:0x023c, B:196:0x0242, B:197:0x025d, B:198:0x0263, B:199:0x0479, B:200:0x047e, B:202:0x0480, B:203:0x0485), top: B:3:0x0009, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0272 A[Catch: all -> 0x0487, TryCatch #0 {, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0014, B:12:0x001c, B:13:0x0021, B:15:0x0023, B:17:0x002f, B:18:0x0034, B:20:0x0036, B:22:0x003e, B:23:0x0043, B:25:0x0045, B:27:0x0053, B:28:0x0064, B:30:0x0072, B:31:0x0083, B:33:0x0091, B:34:0x00a2, B:36:0x00b0, B:37:0x00c1, B:39:0x00cf, B:40:0x00dd, B:42:0x00eb, B:43:0x00ed, B:45:0x00f1, B:47:0x00f5, B:49:0x00fd, B:52:0x0105, B:56:0x012b, B:62:0x0137, B:65:0x026b, B:66:0x0270, B:68:0x0272, B:70:0x0292, B:72:0x0296, B:74:0x02a3, B:75:0x02e0, B:105:0x039a, B:106:0x03c9, B:108:0x03e1, B:109:0x0402, B:111:0x040a, B:112:0x0411, B:113:0x0438, B:117:0x043b, B:119:0x045b, B:120:0x0470, B:122:0x03a1, B:123:0x03a8, B:124:0x03af, B:125:0x03b6, B:126:0x03bc, B:127:0x03c3, B:128:0x02dd, B:129:0x0472, B:130:0x0477, B:132:0x013e, B:134:0x0142, B:145:0x0195, B:147:0x01f4, B:149:0x01f9, B:151:0x01fc, B:153:0x0201, B:156:0x0207, B:157:0x01a2, B:159:0x01c2, B:161:0x01af, B:162:0x01bb, B:163:0x01cb, B:165:0x01d8, B:166:0x01e1, B:167:0x01ed, B:184:0x0219, B:187:0x0244, B:190:0x0255, B:191:0x024b, B:193:0x0253, B:194:0x023c, B:196:0x0242, B:197:0x025d, B:198:0x0263, B:199:0x0479, B:200:0x047e, B:202:0x0480, B:203:0x0485), top: B:3:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r18) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbse.zzb(java.util.Map):void");
    }

    public final void zzd(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }

    public final boolean zzf() {
        boolean z10;
        synchronized (this.zzi) {
            if (this.zzp != null) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }
}
