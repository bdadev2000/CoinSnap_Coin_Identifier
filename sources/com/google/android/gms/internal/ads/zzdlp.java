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
import com.facebook.appevents.AppEventsConstants;
import com.google.android.gms.ads.formats.NativeAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.Executor;

/* loaded from: classes4.dex */
public final class zzdlp {
    static final ImageView.ScaleType zza = ImageView.ScaleType.CENTER_INSIDE;
    private final com.google.android.gms.ads.internal.util.zzg zzb;
    private final zzfhc zzc;
    private final zzdku zzd;
    private final zzdkp zze;

    @Nullable
    private final zzdmb zzf;

    @Nullable
    private final zzdmj zzg;
    private final Executor zzh;
    private final Executor zzi;
    private final zzbfr zzj;
    private final zzdkm zzk;

    public zzdlp(com.google.android.gms.ads.internal.util.zzg zzgVar, zzfhc zzfhcVar, zzdku zzdkuVar, zzdkp zzdkpVar, @Nullable zzdmb zzdmbVar, @Nullable zzdmj zzdmjVar, Executor executor, Executor executor2, zzdkm zzdkmVar) {
        this.zzb = zzgVar;
        this.zzc = zzfhcVar;
        this.zzj = zzfhcVar.zzi;
        this.zzd = zzdkuVar;
        this.zze = zzdkpVar;
        this.zzf = zzdmbVar;
        this.zzg = zzdmjVar;
        this.zzh = executor;
        this.zzi = executor2;
        this.zzk = zzdkmVar;
    }

    private static void zzh(RelativeLayout.LayoutParams layoutParams, int i2) {
        if (i2 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i2 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i2 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    private final boolean zzi(@NonNull ViewGroup viewGroup, boolean z2) {
        View zzf = z2 ? this.zze.zzf() : this.zze.zzg();
        if (zzf == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (zzf.getParent() instanceof ViewGroup) {
            ((ViewGroup) zzf.getParent()).removeView(zzf);
        }
        viewGroup.addView(zzf, ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdN)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }

    public final /* synthetic */ void zza(ViewGroup viewGroup) {
        zzdkp zzdkpVar = this.zze;
        if (zzdkpVar.zzf() != null) {
            boolean z2 = viewGroup != null;
            if (zzdkpVar.zzc() == 2 || zzdkpVar.zzc() == 1) {
                this.zzb.zzK(this.zzc.zzf, String.valueOf(zzdkpVar.zzc()), z2);
            } else if (zzdkpVar.zzc() == 6) {
                this.zzb.zzK(this.zzc.zzf, "2", z2);
                this.zzb.zzK(this.zzc.zzf, AppEventsConstants.EVENT_PARAM_VALUE_YES, z2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ void zzb(zzdml zzdmlVar) {
        ViewGroup viewGroup;
        View view;
        final ViewGroup viewGroup2;
        zzbfz zza2;
        Drawable drawable;
        if (this.zzd.zzf() || this.zzd.zze()) {
            String[] strArr = {NativeAd.ASSET_ADCHOICES_CONTAINER_VIEW, "3011"};
            for (int i2 = 0; i2 < 2; i2++) {
                View zzg = zzdmlVar.zzg(strArr[i2]);
                if (zzg != null && (zzg instanceof ViewGroup)) {
                    viewGroup = (ViewGroup) zzg;
                    break;
                }
            }
        }
        viewGroup = null;
        Context context = zzdmlVar.zzf().getContext();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        zzdkp zzdkpVar = this.zze;
        if (zzdkpVar.zze() != null) {
            zzbfr zzbfrVar = this.zzj;
            view = zzdkpVar.zze();
            if (zzbfrVar != null && viewGroup == null) {
                zzh(layoutParams, zzbfrVar.zze);
                view.setLayoutParams(layoutParams);
                viewGroup = null;
            }
        } else if (zzdkpVar.zzl() instanceof zzbfm) {
            zzbfm zzbfmVar = (zzbfm) zzdkpVar.zzl();
            if (viewGroup == null) {
                zzh(layoutParams, zzbfmVar.zzc());
                viewGroup = null;
            }
            View zzbfnVar = new zzbfn(context, zzbfmVar, layoutParams);
            zzbfnVar.setContentDescription((CharSequence) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzdL));
            view = zzbfnVar;
        } else {
            view = null;
        }
        if (view != null) {
            if (view.getParent() instanceof ViewGroup) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                viewGroup.addView(view);
            } else {
                com.google.android.gms.ads.formats.zza zzaVar = new com.google.android.gms.ads.formats.zza(zzdmlVar.zzf().getContext());
                zzaVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                zzaVar.addView(view);
                FrameLayout zzh = zzdmlVar.zzh();
                if (zzh != null) {
                    zzh.addView(zzaVar);
                }
            }
            zzdmlVar.zzq(zzdmlVar.zzk(), view, true);
        }
        zzgax zzgaxVar = zzdll.zza;
        int size = zzgaxVar.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                viewGroup2 = null;
                break;
            }
            View zzg2 = zzdmlVar.zzg((String) zzgaxVar.get(i3));
            i3++;
            if (zzg2 instanceof ViewGroup) {
                viewGroup2 = (ViewGroup) zzg2;
                break;
            }
        }
        this.zzi.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdlm
            @Override // java.lang.Runnable
            public final void run() {
                zzdlp.this.zza(viewGroup2);
            }
        });
        if (viewGroup2 == null) {
            return;
        }
        if (zzi(viewGroup2, true)) {
            zzdkp zzdkpVar2 = this.zze;
            if (zzdkpVar2.zzs() != null) {
                zzdkpVar2.zzs().zzar(new zzdlo(zzdmlVar, viewGroup2));
                return;
            }
            return;
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzjF)).booleanValue() && zzi(viewGroup2, false)) {
            zzdkp zzdkpVar3 = this.zze;
            if (zzdkpVar3.zzq() != null) {
                zzdkpVar3.zzq().zzar(new zzdlo(zzdmlVar, viewGroup2));
                return;
            }
            return;
        }
        viewGroup2.removeAllViews();
        View zzf = zzdmlVar.zzf();
        Context context2 = zzf != null ? zzf.getContext() : null;
        if (context2 == null || (zza2 = this.zzk.zza()) == null) {
            return;
        }
        try {
            IObjectWrapper zzi = zza2.zzi();
            if (zzi == null || (drawable = (Drawable) ObjectWrapper.unwrap(zzi)) == null) {
                return;
            }
            ImageView imageView = new ImageView(context2);
            imageView.setImageDrawable(drawable);
            IObjectWrapper zzj = zzdmlVar.zzj();
            if (zzj != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcv.zzfW)).booleanValue()) {
                    imageView.setScaleType((ImageView.ScaleType) ObjectWrapper.unwrap(zzj));
                    imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    viewGroup2.addView(imageView);
                }
            }
            imageView.setScaleType(zza);
            imageView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            viewGroup2.addView(imageView);
        } catch (RemoteException unused) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("Could not get main image drawable");
        }
    }

    public final void zzc(@Nullable zzdml zzdmlVar) {
        if (zzdmlVar == null || this.zzf == null || zzdmlVar.zzh() == null || !this.zzd.zzg()) {
            return;
        }
        try {
            zzdmlVar.zzh().addView(this.zzf.zza());
        } catch (zzcga e) {
            com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
        }
    }

    public final void zzd(@Nullable zzdml zzdmlVar) {
        if (zzdmlVar == null) {
            return;
        }
        Context context = zzdmlVar.zzf().getContext();
        if (com.google.android.gms.ads.internal.util.zzbv.zzh(context, this.zzd.zza)) {
            if (!(context instanceof Activity)) {
                com.google.android.gms.ads.internal.util.client.zzm.zze("Activity context is needed for policy validator.");
                return;
            }
            if (this.zzg == null || zzdmlVar.zzh() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(this.zzg.zza(zzdmlVar.zzh(), windowManager), com.google.android.gms.ads.internal.util.zzbv.zzb());
            } catch (zzcga e) {
                com.google.android.gms.ads.internal.util.zze.zzb("web view can not be obtained", e);
            }
        }
    }

    public final void zze(final zzdml zzdmlVar) {
        this.zzh.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdln
            @Override // java.lang.Runnable
            public final void run() {
                zzdlp.this.zzb(zzdmlVar);
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
