package com.google.android.gms.internal.ads;

import a4.j;
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

/* loaded from: classes3.dex */
public final class zzcbt extends FrameLayout implements zzcbk {
    final zzcch zza;
    private final zzccf zzb;
    private final FrameLayout zzc;
    private final View zzd;
    private final zzbdc zze;
    private final long zzf;

    @Nullable
    private final zzcbl zzg;
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

    public zzcbt(Context context, zzccf zzccfVar, int i10, boolean z10, zzbdc zzbdcVar, zzcce zzcceVar) {
        super(context);
        zzcbl zzcbjVar;
        String str;
        this.zzb = zzccfVar;
        this.zze = zzbdcVar;
        FrameLayout frameLayout = new FrameLayout(context);
        this.zzc = frameLayout;
        addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
        Preconditions.checkNotNull(zzccfVar.zzj());
        zzcbm zzcbmVar = zzccfVar.zzj().zza;
        zzccg zzccgVar = new zzccg(context, zzccfVar.zzn(), zzccfVar.zzdi(), zzbdcVar, zzccfVar.zzk());
        if (i10 == 3) {
            zzcbjVar = new zzcez(context, zzccgVar);
        } else if (i10 == 2) {
            zzcbjVar = new zzccx(context, zzccgVar, zzccfVar, z10, zzcbm.zza(zzccfVar), zzcceVar);
        } else {
            zzcbjVar = new zzcbj(context, zzccfVar, z10, zzcbm.zza(zzccfVar), zzcceVar, new zzccg(context, zzccfVar.zzn(), zzccfVar.zzdi(), zzbdcVar, zzccfVar.zzk()));
        }
        this.zzg = zzcbjVar;
        View view = new View(context);
        this.zzd = view;
        view.setBackgroundColor(0);
        frameLayout.addView(zzcbjVar, new FrameLayout.LayoutParams(-1, -1, 17));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzP)).booleanValue()) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
            frameLayout.bringChildToFront(view);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzM)).booleanValue()) {
            zzn();
        }
        this.zzq = new ImageView(context);
        this.zzf = ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzR)).longValue();
        boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzO)).booleanValue();
        this.zzk = booleanValue;
        if (zzbdcVar != null) {
            if (true != booleanValue) {
                str = "0";
            } else {
                str = "1";
            }
            zzbdcVar.zzd("spinner_used", str);
        }
        this.zza = new zzcch(this);
        zzcbjVar.zzr(this);
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
        return this.zzq.getParent() != null;
    }

    public final void finalize() throws Throwable {
        try {
            this.zza.zza();
            final zzcbl zzcblVar = this.zzg;
            if (zzcblVar != null) {
                zzcaj.zze.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcbl.this.zzt();
                    }
                });
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(final boolean z10) {
        super.onWindowFocusChanged(z10);
        if (z10) {
            this.zza.zzb();
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbp
            @Override // java.lang.Runnable
            public final void run() {
                zzcbt.this.zzq(z10);
            }
        });
    }

    @Override // android.view.View, com.google.android.gms.internal.ads.zzcbk
    public final void onWindowVisibilityChanged(int i10) {
        boolean z10;
        super.onWindowVisibilityChanged(i10);
        if (i10 == 0) {
            this.zza.zzb();
            z10 = true;
        } else {
            this.zza.zza();
            this.zzm = this.zzl;
            z10 = false;
        }
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbs(this, z10));
    }

    public final void zzA(int i10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzz(i10);
    }

    public final void zzB(int i10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzA(i10);
    }

    public final void zzC(int i10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzP)).booleanValue()) {
            this.zzc.setBackgroundColor(i10);
            this.zzd.setBackgroundColor(i10);
        }
    }

    public final void zzD(int i10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzB(i10);
    }

    public final void zzE(String str, String[] strArr) {
        this.zzn = str;
        this.zzo = strArr;
    }

    public final void zzF(int i10, int i11, int i12, int i13) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            StringBuilder n10 = j.n("Set video bounds to x:", i10, ";y:", i11, ";w:");
            n10.append(i12);
            n10.append(";h:");
            n10.append(i13);
            com.google.android.gms.ads.internal.util.zze.zza(n10.toString());
        }
        if (i12 != 0 && i13 != 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i12, i13);
            layoutParams.setMargins(i10, i11, 0, 0);
            this.zzc.setLayoutParams(layoutParams);
            requestLayout();
        }
    }

    public final void zzG(float f10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzb.zze(f10);
        zzcblVar.zzn();
    }

    public final void zzH(float f10, float f11) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null) {
            zzcblVar.zzu(f10, f11);
        }
    }

    public final void zzI() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzb.zzd(false);
        zzcblVar.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zza() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbY)).booleanValue()) {
            this.zza.zza();
        }
        zzK("ended", new String[0]);
        zzJ();
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzb(String str, @Nullable String str2) {
        zzK("error", "what", str, "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzc(String str, @Nullable String str2) {
        zzK("exception", "what", "ExoPlayerAdapter exception", "extra", str2);
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzd() {
        zzK(CampaignEx.JSON_NATIVE_VIDEO_PAUSE, new String[0]);
        zzJ();
        this.zzh = false;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zze() {
        boolean z10;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbY)).booleanValue()) {
            this.zza.zzb();
        }
        if (this.zzb.zzi() != null && !this.zzi) {
            if ((this.zzb.zzi().getWindow().getAttributes().flags & 128) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.zzj = z10;
            if (!z10) {
                this.zzb.zzi().getWindow().addFlags(128);
                this.zzi = true;
            }
        }
        this.zzh = true;
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzf() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null && this.zzm == 0) {
            float zzc = zzcblVar.zzc();
            zzcbl zzcblVar2 = this.zzg;
            zzK("canplaythrough", "duration", String.valueOf(zzc / 1000.0f), "videoWidth", String.valueOf(zzcblVar2.zze()), "videoHeight", String.valueOf(zzcblVar2.zzd()));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzg() {
        this.zzd.setVisibility(4);
        com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbo
            @Override // java.lang.Runnable
            public final void run() {
                zzcbt.this.zzp();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzh() {
        this.zza.zzb();
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbq(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzi() {
        if (this.zzr && this.zzp != null && !zzL()) {
            this.zzq.setImageBitmap(this.zzp);
            this.zzq.invalidate();
            this.zzc.addView(this.zzq, new FrameLayout.LayoutParams(-1, -1));
            this.zzc.bringChildToFront(this.zzq);
        }
        this.zza.zza();
        this.zzm = this.zzl;
        com.google.android.gms.ads.internal.util.zzs.zza.post(new zzcbr(this));
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzj(int i10, int i11) {
        if (this.zzk) {
            zzbce zzbceVar = zzbcn.zzQ;
            int max = Math.max(i10 / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).intValue(), 1);
            int max2 = Math.max(i11 / ((Integer) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbceVar)).intValue(), 1);
            Bitmap bitmap = this.zzp;
            if (bitmap != null && bitmap.getWidth() == max && this.zzp.getHeight() == max2) {
                return;
            }
            this.zzp = Bitmap.createBitmap(max, max2, Bitmap.Config.ARGB_8888);
            this.zzr = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcbk
    public final void zzk() {
        if (this.zzh && zzL()) {
            this.zzc.removeView(this.zzq);
        }
        if (this.zzg != null && this.zzp != null) {
            long elapsedRealtime = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime();
            if (this.zzg.getBitmap(this.zzp) != null) {
                this.zzr = true;
            }
            long elapsedRealtime2 = com.google.android.gms.ads.internal.zzv.zzC().elapsedRealtime() - elapsedRealtime;
            if (com.google.android.gms.ads.internal.util.zze.zzc()) {
                com.google.android.gms.ads.internal.util.zze.zza("Spinner frame grab took " + elapsedRealtime2 + "ms");
            }
            if (elapsedRealtime2 > this.zzf) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Spinner frame grab crossed jank threshold! Suspending spinner.");
                this.zzk = false;
                this.zzp = null;
                zzbdc zzbdcVar = this.zze;
                if (zzbdcVar != null) {
                    zzbdcVar.zzd("spinner_jank", Long.toString(elapsedRealtime2));
                }
            }
        }
    }

    @Nullable
    public final Integer zzl() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null) {
            return zzcblVar.zzw();
        }
        return null;
    }

    public final void zzn() {
        String string;
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        TextView textView = new TextView(zzcblVar.getContext());
        Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
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
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null) {
            zzcblVar.zzt();
        }
        zzJ();
    }

    public final /* synthetic */ void zzp() {
        zzK("firstFrameRendered", new String[0]);
    }

    public final /* synthetic */ void zzq(boolean z10) {
        zzK("windowFocusChanged", "hasWindowFocus", String.valueOf(z10));
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
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzb.zzd(true);
        zzcblVar.zzn();
    }

    public final void zzt() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar != null) {
            long zza = zzcblVar.zza();
            if (this.zzl != zza && zza > 0) {
                float f10 = ((float) zza) / 1000.0f;
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzbW)).booleanValue()) {
                    zzK("timeupdate", "time", String.valueOf(f10), "totalBytes", String.valueOf(this.zzg.zzh()), "qoeCachedBytes", String.valueOf(this.zzg.zzf()), "qoeLoadedBytes", String.valueOf(this.zzg.zzg()), "droppedFrames", String.valueOf(this.zzg.zzb()), "reportTime", String.valueOf(com.google.android.gms.ads.internal.zzv.zzC().currentTimeMillis()));
                } else {
                    zzK("timeupdate", "time", String.valueOf(f10));
                }
                this.zzl = zza;
            }
        }
    }

    public final void zzu() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzo();
    }

    public final void zzv() {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzp();
    }

    public final void zzw(int i10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzq(i10);
    }

    public final void zzx(MotionEvent motionEvent) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.dispatchTouchEvent(motionEvent);
    }

    public final void zzy(int i10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzx(i10);
    }

    public final void zzz(int i10) {
        zzcbl zzcblVar = this.zzg;
        if (zzcblVar == null) {
            return;
        }
        zzcblVar.zzy(i10);
    }
}
