package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class zzbfj extends RelativeLayout {
    private static final float[] zza = {5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f};

    @Nullable
    private AnimationDrawable zzb;

    public zzbfj(Context context, zzbfi zzbfiVar, RelativeLayout.LayoutParams layoutParams) {
        super(context);
        Preconditions.checkNotNull(zzbfiVar);
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(zza, null, null));
        shapeDrawable.getPaint().setColor(zzbfiVar.zzd());
        setLayoutParams(layoutParams);
        setBackground(shapeDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        if (!TextUtils.isEmpty(zzbfiVar.zzg())) {
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            TextView textView = new TextView(context);
            textView.setLayoutParams(layoutParams3);
            textView.setId(1195835393);
            textView.setTypeface(Typeface.DEFAULT);
            textView.setText(zzbfiVar.zzg());
            textView.setTextColor(zzbfiVar.zze());
            textView.setTextSize(zzbfiVar.zzf());
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            int zzy = com.google.android.gms.ads.internal.util.client.zzf.zzy(context, 4);
            com.google.android.gms.ads.internal.client.zzbc.zzb();
            textView.setPadding(zzy, 0, com.google.android.gms.ads.internal.util.client.zzf.zzy(context, 4), 0);
            addView(textView);
            layoutParams2.addRule(1, textView.getId());
        }
        ImageView imageView = new ImageView(context);
        imageView.setLayoutParams(layoutParams2);
        imageView.setId(1195835394);
        List zzi = zzbfiVar.zzi();
        if (zzi != null && zzi.size() > 1) {
            this.zzb = new AnimationDrawable();
            Iterator it = zzi.iterator();
            while (it.hasNext()) {
                try {
                    this.zzb.addFrame((Drawable) ObjectWrapper.unwrap(((zzbfl) it.next()).zzf()), zzbfiVar.zzb());
                } catch (Exception e2) {
                    com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while getting drawable.", e2);
                }
            }
            imageView.setBackground(this.zzb);
        } else if (zzi.size() == 1) {
            try {
                imageView.setImageDrawable((Drawable) ObjectWrapper.unwrap(((zzbfl) zzi.get(0)).zzf()));
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzm.zzh("Error while getting drawable.", e10);
            }
        }
        addView(imageView);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        AnimationDrawable animationDrawable = this.zzb;
        if (animationDrawable != null) {
            animationDrawable.start();
        }
        super.onAttachedToWindow();
    }
}
