package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.mbridge.msdk.MBridgeConstans;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class zzdjy {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzffo zzc;
    private final zzdjd zzd;
    private final zzdiy zze;

    @Nullable
    private final zzdkk zzf;

    @Nullable
    private final zzdks zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfn zzj;
    private final zzdiv zzk;

    public zzdjy(com.google.android.gms.ads.internal.util.zzg zzgVar, zzffo zzffoVar, zzdjd zzdjdVar, zzdiy zzdiyVar, @Nullable zzdkk zzdkkVar, @Nullable zzdks zzdksVar, Executor executor, Executor executor2, zzdiv zzdivVar) {
        this.zzb = zzgVar;
        this.zzc = zzffoVar;
        this.zzj = zzffoVar.zzi;
        this.zzd = zzdjdVar;
        this.zze = zzdiyVar;
        this.zzf = zzdkkVar;
        this.zzg = zzdksVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdivVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i10) {
        if (i10 != 0) {
            if (i10 != 2) {
                if (i10 != 3) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                    return;
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                    return;
                }
            }
            layoutParams.addRule(12);
            layoutParams.addRule(11);
            return;
        }
        layoutParams.addRule(10);
        layoutParams.addRule(9);
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z10) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z10) {
            zzg = this.zze.zzf();
        } else {
            zzg = this.zze.zzg();
        }
        if (zzg == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzg.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzg.getParent()).removeView(zzg);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdU)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z10;
        zzdiy zzdiyVar = this.zze;
        if (zzdiyVar.zzf() != null) {
            if (viewGroup != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (zzdiyVar.zzc() != 2 && zzdiyVar.zzc() != 1) {
                if (zzdiyVar.zzc() == 6) {
                    this.zzb.zzF(this.zzc.zzf, MBridgeConstans.API_REUQEST_CATEGORY_APP, z10);
                    this.zzb.zzF(this.zzc.zzf, "1", z10);
                    return;
                }
                return;
            }
            this.zzb.zzF(this.zzc.zzf, String.valueOf(zzdiyVar.zzc()), z10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb(zzdku zzdkuVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbfv zza2;
        Drawable drawable;
        Context context = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i10 = 0; i10 < 2; i10++) {
                View zzg = zzdkuVar.zzg(strArr[i10]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context2 = zzdkuVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdiy zzdiyVar = this.zze;
        if (zzdiyVar.zze() != null) {
            zzbfn zzbfnVar = this.zzj;
            view = zzdiyVar.zze();
            if (zzbfnVar != null && viewGroup == null) {
                zzh(layoutParams, zzbfnVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (!(zzdiyVar.zzl() instanceof zzbfi)) {
            view = null;
        } else {
            zzbfi zzbfiVar = (zzbfi) zzdiyVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfiVar.zzc());
                viewGroup = null;
            }
            View zzbfjVar = new zzbfj(context2, zzbfiVar, layoutParams);
            zzbfjVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzdS));
            view = zzbfjVar;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdkuVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdkuVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdkuVar.zzq(zzdkuVar.zzk(), view, true);
        }
        zzfzo zzfzoVar = zzdju.zza;
        int size = zzfzoVar.size();
        int i11 = 0;
        while (true) {
            if (i11 < size) {
                View zzg2 = zzdkuVar.zzg((String) zzfzoVar.get(i11));
                i11++;
                if (zzg2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) zzg2;
                    break;
                }
            } else {
                viewGroup2 = null;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjv
            @Override // java.lang.Runnable
            public final void run() {
                zzdjy.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 != null) {
            if (zzi(viewGroup2, true)) {
                zzdiy zzdiyVar2 = this.zze;
                if (zzdiyVar2.zzs() != null) {
                    zzdiyVar2.zzs().zzar(new zzdjx(zzdkuVar, viewGroup2));
                    return;
                }
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzjH)).booleanValue() && zzi(viewGroup2, false)) {
                zzdiy zzdiyVar3 = this.zze;
                if (zzdiyVar3.zzq() != null) {
                    zzdiyVar3.zzq().zzar(new zzdjx(zzdkuVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View zzf = zzdkuVar.zzf();
            if (zzf != null) {
                context = zzf.getContext();
            }
            if (context != null && (zza2 = this.zzk.zza()) != null) {
                try {
                    IObjectWrapper zzi = zza2.zzi();
                    if (zzi != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) != null) {
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(drawable);
                        IObjectWrapper zzj = zzdkuVar.zzj();
                        if (zzj != null) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcn.zzgb)).booleanValue()) {
                                imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                                imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                                viewGroup2.addView(imageView);
                            }
                        }
                        imageView.setScaleType(zza);
                        imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                        viewGroup2.addView(imageView);
                    }
                } catch (RemoteException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get main image drawable");
                }
            }
        }
    }

    public final void zzc(@Nullable zzdku zzdkuVar) {
        if (zzdkuVar != null && this.zzf != null && zzdkuVar.zzh() != null && this.zzd.zzg()) {
            try {
                zzdkuVar.zzh().addView(this.zzf.zza());
            } catch (zzcfw e2) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e2);
            }
        }
    }

    public final void zzd(@Nullable zzdku zzdkuVar) {
        if (zzdkuVar != null) {
            Context context = zzdkuVar.zzf().getContext();
            if (com.google.android.gms.ads.internal.util.zzbu.zzh(context, this.zzd.zza)) {
                if (!(context instanceof Activity)) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Activity context is needed for policy validator.");
                    return;
                }
                if (this.zzg != null && zzdkuVar.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzg.zza(zzdkuVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbu.zzb());
                    } catch (zzcfw e2) {
                        com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e2);
                    }
                }
            }
        }
    }

    public final void zze(final zzdku zzdkuVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdjw
            @Override // java.lang.Runnable
            public final void run() {
                zzdjy.this.zzb(zzdkuVar);
            }
        });
    }

    public final boolean zzf(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, false);
    }

    public final boolean zzg(@NonNull ViewGroup viewGroup) {
        return zzi(viewGroup, true);
    }
}
