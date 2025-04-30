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

/* loaded from: classes2.dex */
public final class zzdmt {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfho zzc;
    private final zzdly zzd;
    private final zzdlt zze;

    @Nullable
    private final zzdnf zzf;

    @Nullable
    private final zzdnn zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbhk zzj;
    private final zzdlq zzk;

    public zzdmt(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfho zzfhoVar, zzdly zzdlyVar, zzdlt zzdltVar, @Nullable zzdnf zzdnfVar, @Nullable zzdnn zzdnnVar, Executor executor, Executor executor2, zzdlq zzdlqVar) {
        this.zzb = zzgVar;
        this.zzc = zzfhoVar;
        this.zzj = zzfhoVar.zzi;
        this.zzd = zzdlyVar;
        this.zze = zzdltVar;
        this.zzf = zzdnfVar;
        this.zzg = zzdnnVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdlqVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i9) {
        if (i9 != 0) {
            if (i9 != 2) {
                if (i9 != 3) {
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

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z8) {
        View zzg;
        FrameLayout.LayoutParams layoutParams;
        if (z8) {
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
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdQ)).booleanValue()) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1, 17);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2, 17);
        }
        viewGroup.addView(zzg, layoutParams);
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        boolean z8;
        zzdlt zzdltVar = this.zze;
        if (zzdltVar.zzf() != null) {
            if (viewGroup != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            if (zzdltVar.zzc() != 2 && zzdltVar.zzc() != 1) {
                if (zzdltVar.zzc() == 6) {
                    this.zzb.zzK(this.zzc.zzf, MBridgeConstans.API_REUQEST_CATEGORY_APP, z8);
                    this.zzb.zzK(this.zzc.zzf, "1", z8);
                    return;
                }
                return;
            }
            this.zzb.zzK(this.zzc.zzf, String.valueOf(zzdltVar.zzc()), z8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb(zzdnp zzdnpVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbhs zza2;
        Drawable drawable;
        Context context = null;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i9 = 0; i9 < 2; i9++) {
                View zzg = zzdnpVar.zzg(strArr[i9]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context2 = zzdnpVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdlt zzdltVar = this.zze;
        if (zzdltVar.zze() != null) {
            zzbhk zzbhkVar = this.zzj;
            view = zzdltVar.zze();
            if (zzbhkVar != null && viewGroup == null) {
                zzh(layoutParams, zzbhkVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (!(zzdltVar.zzl() instanceof zzbhf)) {
            view = null;
        } else {
            zzbhf zzbhfVar = (zzbhf) zzdltVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbhfVar.zzc());
                viewGroup = null;
            }
            View zzbhgVar = new zzbhg(context2, zzbhfVar, layoutParams);
            zzbhgVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzdO));
            view = zzbhgVar;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdnpVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdnpVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdnpVar.zzq(zzdnpVar.zzk(), view, true);
        }
        zzgbc zzgbcVar = zzdmp.zza;
        int size = zzgbcVar.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                View zzg2 = zzdnpVar.zzg((String) zzgbcVar.get(i10));
                i10++;
                if (zzg2 instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) zzg2;
                    break;
                }
            } else {
                viewGroup2 = null;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmq
            @Override // java.lang.Runnable
            public final void run() {
                zzdmt.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 != null) {
            if (zzi(viewGroup2, true)) {
                zzdlt zzdltVar2 = this.zze;
                if (zzdltVar2.zzs() != null) {
                    zzdltVar2.zzs().zzar(new zzdms(zzdnpVar, viewGroup2));
                    return;
                }
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzjZ)).booleanValue() && zzi(viewGroup2, false)) {
                zzdlt zzdltVar3 = this.zze;
                if (zzdltVar3.zzq() != null) {
                    zzdltVar3.zzq().zzar(new zzdms(zzdnpVar, viewGroup2));
                    return;
                }
                return;
            }
            viewGroup2.removeAllViews();
            View zzf = zzdnpVar.zzf();
            if (zzf != null) {
                context = zzf.getContext();
            }
            if (context != null && (zza2 = this.zzk.zza()) != null) {
                try {
                    IObjectWrapper zzi = zza2.zzi();
                    if (zzi != null && (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) != null) {
                        ImageView imageView = new ImageView(context);
                        imageView.setImageDrawable(drawable);
                        IObjectWrapper zzj = zzdnpVar.zzj();
                        if (zzj != null) {
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbep.zzgr)).booleanValue()) {
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

    public final void zzc(@Nullable zzdnp zzdnpVar) {
        if (zzdnpVar != null && this.zzf != null && zzdnpVar.zzh() != null && this.zzd.zzg()) {
            try {
                zzdnpVar.zzh().addView(this.zzf.zza());
            } catch (zzchp e4) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e4);
            }
        }
    }

    public final void zzd(@Nullable zzdnp zzdnpVar) {
        if (zzdnpVar != null) {
            Context context = zzdnpVar.zzf().getContext();
            if (com.google.android.gms.ads.internal.util.zzbz.zzh(context, this.zzd.zza)) {
                if (!(context instanceof Activity)) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Activity context is needed for policy validator.");
                    return;
                }
                if (this.zzg != null && zzdnpVar.zzh() != null) {
                    try {
                        WindowManager windowManager = (WindowManager) context.getSystemService("window");
                        windowManager.addView(this.zzg.zza(zzdnpVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbz.zzb());
                    } catch (zzchp e4) {
                        com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e4);
                    }
                }
            }
        }
    }

    public final void zze(final zzdnp zzdnpVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdmr
            @Override // java.lang.Runnable
            public final void run() {
                zzdmt.this.zzb(zzdnpVar);
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
