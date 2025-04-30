package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.Set;

/* loaded from: classes2.dex */
public final class zzbud extends zzbuj {
    static final Set zza = CollectionUtils.setOf("top-left", "top-right", "top-center", TtmlNode.CENTER, "bottom-left", "bottom-right", "bottom-center");
    private String zzb;
    private boolean zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private final Object zzj;
    private final zzchd zzk;
    private final Activity zzl;
    private zzcix zzm;
    private ImageView zzn;
    private LinearLayout zzo;
    private final zzbuk zzp;
    private PopupWindow zzq;
    private RelativeLayout zzr;
    private ViewGroup zzs;

    public zzbud(zzchd zzchdVar, zzbuk zzbukVar) {
        super(zzchdVar, "resize");
        this.zzb = "top-right";
        this.zzc = true;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = -1;
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = -1;
        this.zzj = new Object();
        this.zzk = zzchdVar;
        this.zzl = zzchdVar.zzi();
        this.zzp = zzbukVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzc(boolean z8) {
        this.zzq.dismiss();
        this.zzr.removeView((View) this.zzk);
        ViewGroup viewGroup = this.zzs;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzn);
            this.zzs.addView((View) this.zzk);
            this.zzk.zzaj(this.zzm);
        }
        if (z8) {
            zzl("default");
            zzbuk zzbukVar = this.zzp;
            if (zzbukVar != null) {
                zzbukVar.zzb();
            }
        }
        this.zzq = null;
        this.zzr = null;
        this.zzs = null;
        this.zzo = null;
    }

    public final void zza(final boolean z8) {
        synchronized (this.zzj) {
            try {
                if (this.zzq != null) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzkP)).booleanValue() && Looper.getMainLooper().getThread() != Thread.currentThread()) {
                        zzcci.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbub
                            @Override // java.lang.Runnable
                            public final void run() {
                                zzbud.this.zzc(z8);
                            }
                        });
                    } else {
                        zzc(z8);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0264, code lost:
    
        zzh("Resize location out of screen or close button is not visible.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x026a, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x028b A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:4:0x0009, B:6:0x000d, B:7:0x0012, B:10:0x0017, B:12:0x001f, B:13:0x0024, B:15:0x0026, B:17:0x0032, B:18:0x0037, B:20:0x0039, B:22:0x0041, B:23:0x0046, B:25:0x0048, B:27:0x0056, B:28:0x0067, B:30:0x0075, B:31:0x0086, B:33:0x0094, B:34:0x00a5, B:36:0x00b3, B:37:0x00c4, B:39:0x00d2, B:40:0x00e0, B:42:0x00ee, B:43:0x00f0, B:45:0x00f4, B:47:0x00f8, B:49:0x0100, B:52:0x0108, B:56:0x0130, B:62:0x013c, B:64:0x0264, B:65:0x0269, B:67:0x026b, B:69:0x028b, B:71:0x028f, B:73:0x029c, B:74:0x02d9, B:89:0x0394, B:90:0x03c3, B:92:0x03db, B:93:0x03fc, B:95:0x0404, B:96:0x040b, B:97:0x0431, B:101:0x0434, B:103:0x0454, B:104:0x0469, B:106:0x039b, B:107:0x03a2, B:108:0x03a9, B:109:0x03b0, B:110:0x03b6, B:111:0x03bd, B:128:0x02d6, B:129:0x046b, B:130:0x0470, B:132:0x0143, B:134:0x0147, B:145:0x019a, B:146:0x01a4, B:148:0x01f7, B:150:0x01fa, B:152:0x01ff, B:155:0x0205, B:156:0x01a8, B:157:0x01b2, B:158:0x01b9, B:159:0x01c5, B:160:0x01cd, B:161:0x01e1, B:162:0x01ed, B:179:0x0214, B:183:0x0242, B:186:0x0252, B:187:0x0248, B:189:0x0250, B:190:0x0238, B:192:0x023e, B:194:0x0257, B:195:0x025d, B:196:0x0472, B:197:0x0477, B:199:0x0479, B:200:0x047e), top: B:3:0x0009, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzb(java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1206
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbud.zzb(java.util.Map):void");
    }

    public final void zzd(int i9, int i10, boolean z8) {
        synchronized (this.zzj) {
            this.zzd = i9;
            this.zze = i10;
        }
    }

    public final void zze(int i9, int i10) {
        this.zzd = i9;
        this.zze = i10;
    }

    public final boolean zzf() {
        boolean z8;
        synchronized (this.zzj) {
            if (this.zzq != null) {
                z8 = true;
            } else {
                z8 = false;
            }
        }
        return z8;
    }
}
