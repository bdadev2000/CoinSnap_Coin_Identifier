package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzcaj;
import com.google.android.gms.internal.ads.zzdvg;
import com.google.android.gms.internal.ads.zzdvk;
import com.google.android.gms.internal.ads.zzges;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import vd.e;

/* loaded from: classes3.dex */
public final class zzat {
    private final Context zza;
    private final zzdvk zzb;
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

    public zzat(Context context) {
        this.zzg = 0;
        this.zzl = new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzag
            @Override // java.lang.Runnable
            public final void run() {
                zzat.this.zzg();
            }
        };
        this.zza = context;
        this.zzh = ViewConfiguration.get(context).getScaledTouchSlop();
        com.google.android.gms.ads.internal.zzv.zzu().zzb();
        this.zzk = com.google.android.gms.ads.internal.zzv.zzu().zza();
        this.zzb = com.google.android.gms.ads.internal.zzv.zzt().zza();
    }

    private final void zzs(Context context) {
        final int i10;
        ArrayList arrayList = new ArrayList();
        int zzu = zzu(arrayList, "None", true);
        final int zzu2 = zzu(arrayList, "Shake", true);
        final int zzu3 = zzu(arrayList, "Flick", true);
        int ordinal = this.zzb.zza().ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i10 = zzu;
            } else {
                i10 = zzu3;
            }
        } else {
            i10 = zzu2;
        }
        com.google.android.gms.ads.internal.zzv.zzq();
        AlertDialog.Builder zzK = zzs.zzK(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i10);
        zzK.setTitle("Setup gesture");
        zzK.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i10, new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzao
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                atomicInteger.set(i11);
            }
        });
        zzK.setNegativeButton("Dismiss", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzap
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                zzat.this.zzr();
            }
        });
        zzK.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaq
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i11) {
                zzat.this.zzh(atomicInteger, i10, zzu2, zzu3, dialogInterface, i11);
            }
        });
        zzK.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.google.android.gms.ads.internal.util.zzar
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzat.this.zzr();
            }
        });
        zzK.create().show();
    }

    private final boolean zzt(float f10, float f11, float f12, float f13) {
        if (Math.abs(this.zzi.x - f10) < this.zzh && Math.abs(this.zzi.y - f11) < this.zzh && Math.abs(this.zzj.x - f12) < this.zzh && Math.abs(this.zzj.y - f13) < this.zzh) {
            return true;
        }
        return false;
    }

    private static final int zzu(List list, String str, boolean z10) {
        if (!z10) {
            return -1;
        }
        list.add(str);
        return list.size() - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(100);
        sb2.append("{Dialog: ");
        sb2.append(this.zzc);
        sb2.append(",DebugSignal: ");
        sb2.append(this.zzf);
        sb2.append(",AFMA Version: ");
        sb2.append(this.zze);
        sb2.append(",Ad Unit ID: ");
        return e.h(sb2, this.zzd, "}");
    }

    public final /* synthetic */ void zza() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzb() {
        zzs(this.zza);
    }

    public final /* synthetic */ void zzc(zzges zzgesVar) {
        if (!com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(this.zza, this.zzd, this.zze);
        } else {
            zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzam
                @Override // java.lang.Runnable
                public final void run() {
                    zzat.this.zzb();
                }
            });
        }
    }

    public final /* synthetic */ void zzd(zzges zzgesVar) {
        if (!com.google.android.gms.ads.internal.zzv.zzt().zzj(this.zza, this.zzd, this.zze)) {
            com.google.android.gms.ads.internal.zzv.zzt().zzd(this.zza, this.zzd, this.zze);
        } else {
            zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzal
                @Override // java.lang.Runnable
                public final void run() {
                    zzat.this.zzf();
                }
            });
        }
    }

    public final /* synthetic */ void zze() {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(this.zza);
    }

    public final /* synthetic */ void zzf() {
        com.google.android.gms.ads.internal.zzv.zzt().zzc(this.zza);
    }

    public final /* synthetic */ void zzg() {
        this.zzg = 4;
        zzr();
    }

    public final /* synthetic */ void zzh(AtomicInteger atomicInteger, int i10, int i11, int i12, DialogInterface dialogInterface, int i13) {
        if (atomicInteger.get() != i10) {
            if (atomicInteger.get() == i11) {
                this.zzb.zzm(zzdvg.SHAKE);
            } else if (atomicInteger.get() == i12) {
                this.zzb.zzm(zzdvg.FLICK);
            } else {
                this.zzb.zzm(zzdvg.NONE);
            }
        }
        zzr();
    }

    public final /* synthetic */ void zzi(String str, DialogInterface dialogInterface, int i10) {
        com.google.android.gms.ads.internal.zzv.zzq();
        zzs.zzT(this.zza, Intent.createChooser(new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.TEXT", str), "Share via"));
    }

    public final /* synthetic */ void zzj(int i10, int i11, int i12, int i13, int i14, DialogInterface dialogInterface, int i15) {
        if (i15 == i10) {
            if (!(this.zza instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zzi("Can not create dialog without Activity Context");
                return;
            }
            String str = this.zzc;
            final String str2 = "No debug information";
            if (!TextUtils.isEmpty(str)) {
                Uri build = new Uri.Builder().encodedQuery(str.replaceAll("\\+", "%20")).build();
                StringBuilder sb2 = new StringBuilder();
                com.google.android.gms.ads.internal.zzv.zzq();
                Map zzP = zzs.zzP(build);
                for (String str3 : zzP.keySet()) {
                    sb2.append(str3);
                    sb2.append(" = ");
                    sb2.append((String) zzP.get(str3));
                    sb2.append("\n\n");
                }
                String trim = sb2.toString().trim();
                if (!TextUtils.isEmpty(trim)) {
                    str2 = trim;
                }
            }
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder zzK = zzs.zzK(this.zza);
            zzK.setMessage(str2);
            zzK.setTitle("Ad Information");
            zzK.setPositiveButton("Share", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzai
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i16) {
                    zzat.this.zzi(str2, dialogInterface2, i16);
                }
            });
            zzK.setNegativeButton("Close", new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzaj
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i16) {
                }
            });
            zzK.create().show();
            return;
        }
        if (i15 == i11) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Debug mode [Creative Preview] selected.");
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzah
                @Override // java.lang.Runnable
                public final void run() {
                    zzat.this.zzl();
                }
            });
            return;
        }
        if (i15 == i12) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Debug mode [Troubleshooting] selected.");
            zzcaj.zza.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzaf
                @Override // java.lang.Runnable
                public final void run() {
                    zzat.this.zzk();
                }
            });
            return;
        }
        if (i15 == i13) {
            zzdvk zzdvkVar = this.zzb;
            final zzges zzgesVar = zzcaj.zze;
            zzges zzgesVar2 = zzcaj.zza;
            if (zzdvkVar.zzq()) {
                zzgesVar.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzas
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzat.this.zze();
                    }
                });
                return;
            } else {
                zzgesVar2.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzae
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzat.this.zzd(zzgesVar);
                    }
                });
                return;
            }
        }
        if (i15 == i14) {
            zzdvk zzdvkVar2 = this.zzb;
            final zzges zzgesVar3 = zzcaj.zze;
            zzges zzgesVar4 = zzcaj.zza;
            if (zzdvkVar2.zzq()) {
                zzgesVar3.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzad
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzat.this.zza();
                    }
                });
            } else {
                zzgesVar4.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.util.zzak
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzat.this.zzc(zzgesVar3);
                    }
                });
            }
        }
    }

    public final /* synthetic */ void zzk() {
        zzax zzt = com.google.android.gms.ads.internal.zzv.zzt();
        String str = this.zzd;
        String str2 = this.zze;
        String str3 = this.zzf;
        boolean zzm = zzt.zzm();
        Context context = this.zza;
        zzt.zzh(zzt.zzj(context, str, str2));
        if (zzt.zzm()) {
            if (!zzm && !TextUtils.isEmpty(str3)) {
                zzt.zze(context, str2, str3, str);
            }
            com.google.android.gms.ads.internal.util.client.zzm.zze("Device is linked for debug signals.");
            zzt.zzi(context, "The device is successfully linked for troubleshooting.", false, true);
            return;
        }
        zzt.zzd(context, str, str2);
    }

    public final /* synthetic */ void zzl() {
        zzax zzt = com.google.android.gms.ads.internal.zzv.zzt();
        Context context = this.zza;
        String str = this.zzd;
        String str2 = this.zze;
        if (!zzt.zzk(context, str, str2)) {
            zzt.zzi(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
            return;
        }
        if (MBridgeConstans.API_REUQEST_CATEGORY_APP.equals(zzt.zza)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Creative is not pushed for this device.");
            zzt.zzi(context, "There was no creative pushed from DFP to the device.", false, false);
        } else if ("1".equals(zzt.zza)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("The app is not linked for creative preview.");
            zzt.zzd(context, str, str2);
        } else if ("0".equals(zzt.zza)) {
            com.google.android.gms.ads.internal.util.client.zzm.zze("Device is linked for in app preview.");
            zzt.zzi(context, "The device is successfully linked for creative preview.", false, true);
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
        int i10 = this.zzg;
        if (i10 != -1) {
            if (i10 == 0) {
                if (actionMasked == 5) {
                    this.zzg = 5;
                    this.zzj = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                    this.zzk.postDelayed(this.zzl, ((Long) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzeI)).longValue());
                    return;
                }
                return;
            }
            if (i10 == 5) {
                if (pointerCount == 2) {
                    if (actionMasked == 2) {
                        boolean z10 = false;
                        for (int i11 = 0; i11 < historySize; i11++) {
                            z10 |= !zzt(motionEvent.getHistoricalX(0, i11), motionEvent.getHistoricalY(0, i11), motionEvent.getHistoricalX(1, i11), motionEvent.getHistoricalY(1, i11));
                        }
                        if (zzt(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z10) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                this.zzg = -1;
                this.zzk.removeCallbacks(this.zzl);
            }
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
            if (true == TextUtils.isEmpty(com.google.android.gms.ads.internal.zzv.zzt().zzb())) {
                str = "Creative preview";
            }
            String str2 = "Troubleshooting (enabled)";
            if (true != com.google.android.gms.ads.internal.zzv.zzt().zzm()) {
                str2 = "Troubleshooting";
            }
            ArrayList arrayList = new ArrayList();
            final int zzu = zzu(arrayList, "Ad information", true);
            final int zzu2 = zzu(arrayList, str, true);
            final int zzu3 = zzu(arrayList, str2, true);
            boolean booleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zziO)).booleanValue();
            final int zzu4 = zzu(arrayList, "Open ad inspector", booleanValue);
            final int zzu5 = zzu(arrayList, "Ad inspector settings", booleanValue);
            com.google.android.gms.ads.internal.zzv.zzq();
            AlertDialog.Builder zzK = zzs.zzK(this.zza);
            zzK.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: com.google.android.gms.ads.internal.util.zzan
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    zzat.this.zzj(zzu, zzu2, zzu3, zzu4, zzu5, dialogInterface, i10);
                }
            });
            zzK.create().show();
        } catch (WindowManager.BadTokenException e2) {
            zze.zzb("", e2);
        }
    }

    public zzat(Context context, String str) {
        this(context);
        this.zzc = str;
    }
}
