package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.support.v4.media.d;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.internal.ads.zzbcv;
import com.google.android.gms.internal.ads.zzcan;
import com.google.android.gms.internal.ads.zzdwx;
import com.google.android.gms.internal.ads.zzdxb;
import com.google.android.gms.internal.ads.zzgfz;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes2.dex */
public final class zzau {
    private final Context zza;
    private final zzdxb zzb;
    private String zzc;
    private String zzd;
    private String zze;

    @Nullable
    private String zzf;
    private int zzg;
    private int zzh;
    private PointF zzi;
    private PointF zzj;
    private Handler zzk;
    private Runnable zzl;

    public zzau(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
            @Override // java.lang.Runnable
            public final void run() {
                zzau.this.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzu.zzt().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzu.zzt().zza();
        this.zzb = com.google.android.gms.ads.internal.zzu.zzs().zza();
    }

    private final void zzs(Context context) {
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        int ordinal = this.zzb.zza().ordinal();
        final int i2 = ordinal != 1 ? ordinal != 2 ? zzu : zzu3 : zzu2;
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = zzt.zzK(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i2);
        zzK.setTitle("Setup gesture");
        zzK.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i2, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                atomicInteger.set(i3);
            }
        });
        zzK.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                zzau.this.zzr();
            }
        });
        zzK.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                zzau.this.zzh(atomicInteger, i2, zzu2, zzu3, dialogInterface, i3);
            }
        });
        zzK.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzas
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzau.this.zzr();
            }
        });
        zzK.create().show();
    }

    private final boolean zzt(float f2, float f3, float f4, float f5) {
        return Math.abs(this.zzi.x - f2) < ((float) this.zzh) && Math.abs(this.zzi.y - f3) < ((float) this.zzh) && Math.abs(this.zzj.x - f4) < ((float) this.zzh) && Math.abs(this.zzj.y - f5) < ((float) this.zzh);
    }

    private static final int zzu(List list, String str, boolean z2) {
        if (!z2) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.zzc);
        sb.append(",DebugSignal: ");
        sb.append(this.zzf);
        sb.append(",AFMA Version: ");
        sb.append(this.zze);
        sb.append(",Ad Unit ID: ");
        return d.r(sb, this.zzd, "}");
    }

    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzb() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzc(zzgfz zzgfzVar) {
        if (com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, this.zzd, this.zze)) {
            zzgfzVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzan
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.this.zzb();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzu.zzs().zzd(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zzd(zzgfz zzgfzVar) {
        if (com.google.android.gms.ads.internal.zzu.zzs().zzj(this.zza, this.zzd, this.zze)) {
            zzgfzVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // java.lang.Runnable
                public final void run() {
                    zzau.this.zzf();
                }
            });
        } else {
            com.google.android.gms.ads.internal.zzu.zzs().zzd(this.zza, this.zzd, this.zze);
        }
    }

    public final /* synthetic */ void zze() {
        com.google.android.gms.ads.internal.zzu.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzf() {
        com.google.android.gms.ads.internal.zzu.zzs().zzc(this.zza);
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    public final /* synthetic */ void zzh(AtomicInteger atomicInteger, int i2, int i3, int i4, DialogInterface dialogInterface, int i5) {
        if (atomicInteger.get() != i2) {
            if (atomicInteger.get() == i3) {
                this.zzb.zzm(zzdwx.SHAKE);
            } else if (atomicInteger.get() == i4) {
                this.zzb.zzm(zzdwx.FLICK);
            } else {
                this.zzb.zzm(zzdwx.NONE);
            }
        }
        zzr();
    }

    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i2) {
        com.google.android.gms.ads.internal.zzu.zzp();
        zzt.zzT(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzj(int i2, int i3, int i4, int i5, int i6, DialogInterface dialogInterface, int i7) {
        if (i7 != i2) {
            if (i7 == i3) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Debug mode [Creative Preview] selected.");
                zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzai
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.this.zzl();
                    }
                });
                return;
            }
            if (i7 == i4) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Debug mode [Troubleshooting] selected.");
                zzcan.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzau.this.zzk();
                    }
                });
                return;
            }
            if (i7 == i5) {
                zzdxb zzdxbVar = this.zzb;
                final zzgfz zzgfzVar = zzcan.zze;
                zzgfz zzgfzVar2 = zzcan.zza;
                if (zzdxbVar.zzq()) {
                    zzgfzVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzat
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.this.zze();
                        }
                    });
                    return;
                } else {
                    zzgfzVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.this.zzd(zzgfzVar);
                        }
                    });
                    return;
                }
            }
            if (i7 == i6) {
                zzdxb zzdxbVar2 = this.zzb;
                final zzgfz zzgfzVar3 = zzcan.zze;
                zzgfz zzgfzVar4 = zzcan.zza;
                if (zzdxbVar2.zzq()) {
                    zzgfzVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.this.zza();
                        }
                    });
                    return;
                } else {
                    zzgfzVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzau.this.zzc(zzgfzVar3);
                        }
                    });
                    return;
                }
            }
            return;
        }
        if (!(this.zza instanceof Activity)) {
            com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
            return;
        }
        String str = this.zzc;
        final String str2 = "No debug information";
        if (!TextUtils.isEmpty(str)) {
            Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
            StringBuilder sb = new StringBuilder();
            com.google.android.gms.ads.internal.zzu.zzp();
            Map zzP = zzt.zzP(build);
            for (String str3 : zzP.keySet()) {
                sb.append(str3);
                sb.append(" = ");
                sb.append((String) zzP.get(str3));
                sb.append("\n\n");
            }
            String trim = sb.toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                str2 = trim;
            }
        }
        com.google.android.gms.ads.internal.zzu.zzp();
        AlertDialog.Builder zzK = zzt.zzK(this.zza);
        zzK.setMessage(str2);
        zzK.setTitle("Ad Information");
        zzK.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i8) {
                zzau.this.zzi(str2, dialogInterface2, i8);
            }
        });
        zzK.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzak
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface2, int i8) {
            }
        });
        zzK.create().show();
    }

    public final /* synthetic */ void zzk() {
        zzay zzs = com.google.android.gms.ads.internal.zzu.zzs();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm = zzs.zzm();
        Context context = this.zza;
        zzs.zzh(zzs.zzj(context, str, str2));
        if (!zzs.zzm()) {
            zzs.zzd(context, str, str2);
            return;
        }
        if (!zzm && !TextUtils.isEmpty(str3)) {
            zzs.zze(context, str2, str3, str);
        }
        com.google.android.gms.ads.internal.util.client.zzm.zze("Device is linked for debug signals.");
        zzs.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
    }

    public final /* synthetic */ void zzl() {
        zzay zzs = com.google.android.gms.ads.internal.zzu.zzs();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzs.zzk(context, str, str2)) {
            zzs.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if ("2".equals(zzs.zza)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Creative is not pushed for this device.");
            zzs.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if (AppEventsConstants.EVENT_PARAM_VALUE_YES.equals(zzs.zza)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("The app is not linked for creative preview.");
            zzs.zzd(context, str, str2);
        } else if (AppEventsConstants.EVENT_PARAM_VALUE_NO.equals(zzs.zza)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Device is linked for in app preview.");
            zzs.zzi(context, "The device is successfully linked for creative preview.", false, true);
        }
    }

    public final void zzm(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.zzg = 0;
            this.zzi = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i2 = this.zzg;
        if (i2 == -1) {
            return;
        }
        if (i2 == 0) {
            if (actionMasked == 5) {
                this.zzg = 5;
                this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzeB)).longValue());
                return;
            }
            return;
        }
        if (i2 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z2 = false;
                for (int i3 = 0; i3 < historySize; i3++) {
                    z2 |= !zzt(motionEvent.getHistoricalX(0, i3), motionEvent.getHistoricalY(0, i3), motionEvent.getHistoricalX(1, i3), motionEvent.getHistoricalY(1, i3));
                }
                if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z2) {
                    return;
                }
            }
            this.zzg = -1;
            this.zzk.removeCallbacks(this.zzl);
        }
    }

    public final void zzn(String str) {
        this.zzd = str;
    }

    public final void zzo(String str) {
        this.zze = str;
    }

    public final void zzp(String str) {
        this.zzc = str;
    }

    public final void zzq(String str) {
        this.zzf = str;
    }

    public final void zzr() {
        try {
            if (!(this.zza instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzu.zzs().zzb())) {
                str = "Creative preview";
            }
            String str2 = true != com.google.android.gms.ads.internal.zzu.zzs().zzm() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int zzu = zzu(arrayList, "Ad information", true);
            final int zzu2 = zzu(arrayList, str, true);
            final int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zziM)).booleanValue();
            final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzu.zzp();
            AlertDialog.Builder zzK = zzt.zzK(this.zza);
            zzK.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    zzau.this.zzj(zzu, zzu2, zzu3, zzu4, zzu5, dialogInterface, i2);
                }
            });
            zzK.create().show();
        } catch (WindowManager.BadTokenException e) {
            zze.zzb("", e);
        }
    }

    public zzau(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
