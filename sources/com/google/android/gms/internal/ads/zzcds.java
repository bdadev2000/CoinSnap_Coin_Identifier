package com.google.android.gms.internal.ads;

import Q7.n0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class zzcds extends FrameLayout implements zzcdj {
    final zzceg zza;
    private final zzcee zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbfe zze;
    private final long zzf;

    @Nullable
    private final zzcdk zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private String zzn;
    private String[] zzo;
    private Bitmap zzp;
    private final ImageView zzq;
    private boolean zzr;

    public zzcds(Context context, zzcee zzceeVar, int i9, boolean z8, zzbfe zzbfeVar, zzced zzcedVar) {
        super(context);
        zzcdk zzcdiVar;
        String str;
        this.zzb = zzceeVar;
        this.zze = zzbfeVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzceeVar.zzj());
        zzcdl zzcdlVar = zzceeVar.zzj().zza;
        zzcef zzcefVar = new zzcef(context, zzceeVar.zzn(), zzceeVar.zzdi(), zzbfeVar, zzceeVar.zzk());
        if (i9 == 2) {
            zzcdiVar = new zzcew(context, zzcefVar, zzceeVar, z8, zzcdl.zza(zzceeVar), zzcedVar);
        } else {
            zzcdiVar = new zzcdi(context, zzceeVar, z8, zzcdl.zza(zzceeVar), zzcedVar, new zzcef(context, zzceeVar.zzn(), zzceeVar.zzdi(), zzbfeVar, zzceeVar.zzk()));
        }
        this.zzg = zzcdiVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcdiVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzF)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzC)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzH)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzE)).booleanValue();
        this.zzk = booleanValue;
        if (zzbfeVar != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            zzbfeVar.zzd("spinner_used", str);
        }
        this.zza = new zzceg(this);
        zzcdiVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() != null && this.zzi && !this.zzj) {
            this.zzb.zzi().getWindow().clearFlags(128);
            this.zzi = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put(NotificationCompat.CATEGORY_EVENT, str);
        String str2 = null;
        for (String str3 : strArr) {
            if (str2 == null) {
                str2 = str3;
            } else {
                hashMap.put(str2, str3);
                str2 = null;
            }
        }
        this.zzb.zzd("onVideoEvent", hashMap);
    }

    private final boolean zzL() {
        if (this.zzq.getParent() != null) {
            return true;
        }
        return false;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcdk zzcdkVar = this.zzg;
            if (zzcdkVar != null) {
                zzcci.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdm
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcdk.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z8) {
        super.onWindowFocusChanged(z8);
        if (z8) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdo
            @Override // java.lang.Runnable
            public final void run() {
                zzcds.this.zzq(z8);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcdj
    public final void onWindowVisibilityChanged(int i9) {
        boolean z8;
        super.onWindowVisibilityChanged(i9);
        if (i9 == 0) {
            this.zza.zzb();
            z8 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z8 = false;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcdr(this, z8));
    }

    public final void zzA(int i9) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzz(i9);
    }

    public final void zzB(int i9) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzA(i9);
    }

    public final void zzC(int i9) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzF)).booleanValue()) {
            this.zzc.setBackgroundColor(i9);
            this.zzd.setBackgroundColor(i9);
        }
    }

    public final void zzD(int i9) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzB(i9);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i9, int i10, int i11, int i12) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder o3 = n0.o(i9, i10, "Set video bounds to x:", ";y:", ";w:");
            o3.append(i11);
            o3.append(";h:");
            o3.append(i12);
            com.google.android.gms.ads.internal.util.zze.zza(o3.toString());
        }
        if (i11 != 0 && i12 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i11, i12);
            layoutParams.setMargins(i9, i10, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f9) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzb.zze(f9);
        zzcdkVar.zzn();
    }

    public final void zzH(float f9, float f10) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar != null) {
            zzcdkVar.zzu(f9, f10);
        }
    }

    public final void zzI() {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzb.zzd(false);
        zzcdkVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbT)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzb(String str, @Nullable String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzc(String str, @Nullable String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzd() {
        zzK(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zze() {
        boolean z8;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbT)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            if ((this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            this.zzj = z8;
            if (!z8) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzf() {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar != null && this.zzm == 0) {
            float zzc = zzcdkVar.zzc();
            zzcdk zzcdkVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(zzc / 1000.0f), "videoWidth", String.valueOf(zzcdkVar2.zze()), "videoHeight", String.valueOf(zzcdkVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcdn
            @Override // java.lang.Runnable
            public final void run() {
                zzcds.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcdp(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcdq(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzj(int i9, int i10) {
        if (this.zzk) {
            zzbeg zzbegVar = zzbep.zzG;
            int max = Math.max(i9 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).intValue(), 1);
            int max2 = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbegVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdj
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzu.zzB().elapsedRealtime() - elapsedRealtime;
            if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbfe zzbfeVar = this.zze;
                if (zzbfeVar != null) {
                    zzbfeVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    @Nullable
    public final Integer zzl() {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar != null) {
            return zzcdkVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        String string;
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        TextView textView = new TextView(zzcdkVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        if (zze == null) {
            string = "AdMob - ";
        } else {
            string = zze.getString(R.string.watermark_label_prefix);
        }
        textView.setText(String.valueOf(string).concat(this.zzg.zzj()));
        textView.setTextColor(-65536);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar != null) {
            zzcdkVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z8) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z8));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (!TextUtils.isEmpty(this.zzn)) {
            this.zzg.zzC(this.zzn, this.zzo, num);
        } else {
            zzK("no_src", new String[0]);
        }
    }

    public final void zzs() {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzb.zzd(true);
        zzcdkVar.zzn();
    }

    public final void zzt() {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar != null) {
            long zza = zzcdkVar.zza();
            if (this.zzl != zza && zza > 0) {
                float f9 = ((float) zza) / 1000.0f;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzbR)).booleanValue()) {
                    zzK("timeupdate", "time", String.valueOf(f9), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
                } else {
                    zzK("timeupdate", "time", String.valueOf(f9));
                }
                this.zzl = zza;
            }
        }
    }

    public final void zzu() {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzo();
    }

    public final void zzv() {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzp();
    }

    public final void zzw(int i9) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzq(i9);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i9) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzx(i9);
    }

    public final void zzz(int i9) {
        zzcdk zzcdkVar = this.zzg;
        if (zzcdkVar == null) {
            return;
        }
        zzcdkVar.zzy(i9);
    }
}
