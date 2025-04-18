package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbc;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbcn;

/* loaded from: classes3.dex */
public final class zzu extends FrameLayout implements View.OnClickListener {
    private final ImageButton zza;
    private final zzag zzb;

    public zzu(Context context, zzt zztVar, @Nullable zzag zzagVar) {
        super(context);
        zzs zzsVar;
        this.zzb = zzagVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zza = imageButton;
        zzc();
        imageButton.setBackgroundColor(0);
        imageButton.setOnClickListener(this);
        zzbc.zzb();
        int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zza);
        zzbc.zzb();
        int zzy2 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, 0);
        zzbc.zzb();
        int zzy3 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzb);
        zzbc.zzb();
        imageButton.setPadding(zzy, zzy2, zzy3, com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzc));
        imageButton.setContentDescription("Interstitial close button");
        zzbc.zzb();
        int zzy4 = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzd + zztVar.zza + zztVar.zzb);
        zzbc.zzb();
        addView(imageButton, new FrameLayout.LayoutParams(zzy4, com.google.android.gms.ads.internal.util.client.zzf.zzy(context, zztVar.zzd + zztVar.zzc), 17));
        long longValue = ((Long) zzbe.zzc().zza(zzbcn.zzbj)).longValue();
        if (longValue <= 0) {
            return;
        }
        if (((Boolean) zzbe.zzc().zza(zzbcn.zzbk)).booleanValue()) {
            zzsVar = new zzs(this);
        } else {
            zzsVar = null;
        }
        imageButton.setAlpha(0.0f);
        imageButton.animate().alpha(1.0f).setDuration(longValue).setListener(zzsVar);
    }

    private final void zzc() {
        String str = (String) zzbe.zzc().zza(zzbcn.zzbi);
        if (PlatformVersion.isAtLeastLollipop() && !TextUtils.isEmpty(str) && !"default".equals(str)) {
            Resources zze = com.google.android.gms.ads.internal.zzv.zzp().zze();
            if (zze != null) {
                Drawable drawable = null;
                try {
                    if ("white".equals(str)) {
                        drawable = zze.getDrawable(R.drawable.admob_close_button_white_circle_black_cross);
                    } else if ("black".equals(str)) {
                        drawable = zze.getDrawable(R.drawable.admob_close_button_black_circle_white_cross);
                    }
                } catch (Resources.NotFoundException unused) {
                    com.google.android.gms.ads.internal.util.client.zzm.zze("Close button resource not found, falling back to default.");
                }
                if (drawable == null) {
                    this.zza.setImageResource(android.R.drawable.btn_dialog);
                    return;
                } else {
                    this.zza.setImageDrawable(drawable);
                    this.zza.setScaleType(ImageView.ScaleType.CENTER);
                    return;
                }
            }
            this.zza.setImageResource(android.R.drawable.btn_dialog);
            return;
        }
        this.zza.setImageResource(android.R.drawable.btn_dialog);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzag zzagVar = this.zzb;
        if (zzagVar != null) {
            zzagVar.zzj();
        }
    }

    public final void zzb(boolean z10) {
        if (z10) {
            this.zza.setVisibility(8);
            if (((Long) zzbe.zzc().zza(zzbcn.zzbj)).longValue() > 0) {
                this.zza.animate().cancel();
                this.zza.clearAnimation();
                return;
            }
            return;
        }
        this.zza.setVisibility(0);
    }
}
