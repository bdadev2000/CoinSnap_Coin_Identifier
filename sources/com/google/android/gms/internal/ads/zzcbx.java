package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.internal.Preconditions;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.events.MaxEvent;
import com.safedk.android.utils.g;
import java.util.HashMap;
import org.objectweb.asm.Opcodes;

/* loaded from: classes3.dex */
public final class zzcbx extends FrameLayout implements zzcbo {

    @VisibleForTesting
    final zzccl zza;
    private final zzccj zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbdk zze;
    private final long zzf;

    @Nullable
    private final zzcbp zzg;
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

    public zzcbx(Context context, zzccj zzccjVar, int i2, boolean z2, zzbdk zzbdkVar, zzcci zzcciVar) {
        super(context);
        this.zzb = zzccjVar;
        this.zze = zzbdkVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzccjVar.zzj());
        zzcbq zzcbqVar = zzccjVar.zzj().zza;
        zzcck zzcckVar = new zzcck(context, zzccjVar.zzn(), zzccjVar.zzdi(), zzbdkVar, zzccjVar.zzk());
        zzcbp zzcfdVar = i2 == 3 ? new zzcfd(context, zzcckVar) : i2 == 2 ? new zzcdb(context, zzcckVar, zzccjVar, z2, zzcbq.zza(zzccjVar), zzcciVar) : new zzcbn(context, zzccjVar, z2, zzcbq.zza(zzccjVar), zzcciVar, new zzcck(context, zzccjVar.zzn(), zzccjVar.zzdi(), zzbdkVar, zzccjVar.zzk()));
        this.zzg = zzcfdVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcfdVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzM)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzJ)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzO)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzL)).booleanValue();
        this.zzk = booleanValue;
        if (zzbdkVar != null) {
            zzbdkVar.zzd("spinner_used", true != booleanValue ? AppEventsConstants.EVENT_PARAM_VALUE_NO : AppEventsConstants.EVENT_PARAM_VALUE_YES);
        }
        this.zza = new zzccl(this);
        zzcfdVar.zzr(this);
    }

    private final void zzJ() {
        if (this.zzb.zzi() == null || !this.zzi || this.zzj) {
            return;
        }
        this.zzb.zzi().getWindow().clearFlags(128);
        this.zzi = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzK(String str, String... strArr) {
        HashMap hashMap = new HashMap();
        Integer zzl = zzl();
        if (zzl != null) {
            hashMap.put("playerId", zzl.toString());
        }
        hashMap.put(MaxEvent.f29810a, str);
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
        return this.zzq.getParent() != null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.viewOnTouch(g.f30053h, this, me);
        return super.dispatchTouchEvent(me);
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbp zzcbpVar = this.zzg;
            if (zzcbpVar != null) {
                zzcan.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbr
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbp.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z2) {
        super.onWindowFocusChanged(z2);
        if (z2) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbt
            @Override // java.lang.Runnable
            public final void run() {
                zzcbx.this.zzq(z2);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbo
    public final void onWindowVisibilityChanged(int i2) {
        boolean z2;
        super.onWindowVisibilityChanged(i2);
        if (i2 == 0) {
            this.zza.zzb();
            z2 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z2 = false;
        }
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcbw(this, z2));
    }

    public final void zzA(int i2) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzz(i2);
    }

    public final void zzB(int i2) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzA(i2);
    }

    public final void zzC(int i2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzM)).booleanValue()) {
            this.zzc.setBackgroundColor(i2);
            this.zzd.setBackgroundColor(i2);
        }
    }

    public final void zzD(int i2) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzB(i2);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i2, int i3, int i4, int i5) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder u2 = d.u("Set video bounds to x:", i2, ";y:", i3, ";w:");
            u2.append(i4);
            u2.append(";h:");
            u2.append(i5);
            com.google.android.gms.ads.internal.util.zze.zza(u2.toString());
        }
        if (i4 == 0 || i5 == 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i4, i5);
        layoutParams.setMargins(i2, i3, 0, 0);
        this.zzc.setLayoutParams(layoutParams);
        requestLayout();
    }

    public final void zzG(float f2) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzb.zze(f2);
        zzcbpVar.zzn();
    }

    public final void zzH(float f2, float f3) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar != null) {
            zzcbpVar.zzu(f2, f3);
        }
    }

    public final void zzI() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzb.zzd(false);
        zzcbpVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbV)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzb(String str, @Nullable String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzc(String str, @Nullable String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzd() {
        zzK("pause", new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zze() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbV)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            boolean z2 = (this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0;
            this.zzj = z2;
            if (!z2) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzf() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar != null && this.zzm == 0) {
            float zzc = zzcbpVar.zzc();
            zzcbp zzcbpVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(zzc / 1000.0f), "videoWidth", String.valueOf(zzcbpVar2.zze()), "videoHeight", String.valueOf(zzcbpVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzt.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbs
            @Override // java.lang.Runnable
            public final void run() {
                zzcbx.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcbu(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzt.zza.post(new zzcbv(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzj(int i2, int i3) {
        if (this.zzk) {
            zzbcm zzbcmVar = zzbcv.zzN;
            int max = Math.max(i2 / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).intValue(), 1);
            int max2 = Math.max(i3 / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcmVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbo
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg == null || this.zzp == null) {
            return;
        }
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
            zzbdk zzbdkVar = this.zze;
            if (zzbdkVar != null) {
                zzbdkVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
            }
        }
    }

    @Nullable
    public final Integer zzl() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar != null) {
            return zzcbpVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        TextView textView = new TextView(zzcbpVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzu.zzo().zze();
        textView.setText(String.valueOf(zze == null ? "AdMob - " : zze.getString(R.string.watermark_label_prefix)).concat(this.zzg.zzj()));
        textView.setTextColor(Opcodes.V_PREVIEW);
        textView.setBackgroundColor(-256);
        this.zzc.addView(textView, new FrameLayout.LayoutParams(-2, -2, 17));
        this.zzc.bringChildToFront(textView);
    }

    public final void zzo() {
        this.zza.zza();
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar != null) {
            zzcbpVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z2) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z2));
    }

    public final void zzr(Integer num) {
        if (this.zzg == null) {
            return;
        }
        if (TextUtils.isEmpty(this.zzn)) {
            zzK("no_src", new String[0]);
        } else {
            this.zzg.zzC(this.zzn, this.zzo, num);
        }
    }

    public final void zzs() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzb.zzd(true);
        zzcbpVar.zzn();
    }

    public final void zzt() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        long zza = zzcbpVar.zza();
        if (this.zzl == zza || zza <= 0) {
            return;
        }
        float f2 = ((float) zza) / 1000.0f;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzbT)).booleanValue()) {
            zzK("timeupdate", "time", String.valueOf(f2), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzu.zzB().currentTimeMillis()));
        } else {
            zzK("timeupdate", "time", String.valueOf(f2));
        }
        this.zzl = zza;
    }

    public final void zzu() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzo();
    }

    public final void zzv() {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzp();
    }

    public final void zzw(int i2) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzq(i2);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i2) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzx(i2);
    }

    public final void zzz(int i2) {
        zzcbp zzcbpVar = this.zzg;
        if (zzcbpVar == null) {
            return;
        }
        zzcbpVar.zzy(i2);
    }
}
