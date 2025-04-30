package com.google.android.gms.common.internal;

import M.a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.DeviceProperties;
import com.mbridge.msdk.foundation.entity.o;

/* loaded from: classes2.dex */
public final class zaaa extends Button {
    public zaaa(Context context, @Nullable AttributeSet attributeSet) {
        super(context, null, R.attr.buttonStyle);
    }

    private static final int zab(int i9, int i10, int i11, int i12) {
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    return i12;
                }
                throw new IllegalStateException(o.h(i9, "Unknown color scheme: "));
            }
            return i11;
        }
        return i10;
    }

    public final void zaa(Resources resources, int i9, int i10) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i11 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i11);
        setMinWidth(i11);
        int i12 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_dark;
        int i13 = com.google.android.gms.base.R.drawable.common_google_signin_btn_icon_light;
        int zab = zab(i10, i12, i13, i13);
        int i14 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_dark;
        int i15 = com.google.android.gms.base.R.drawable.common_google_signin_btn_text_light;
        int zab2 = zab(i10, i14, i15, i15);
        if (i9 != 0 && i9 != 1) {
            if (i9 != 2) {
                throw new IllegalStateException(o.h(i9, "Unknown button size: "));
            }
        } else {
            zab = zab2;
        }
        Drawable drawable = resources.getDrawable(zab);
        a.h(drawable, resources.getColorStateList(com.google.android.gms.base.R.color.common_google_signin_btn_tint));
        a.i(drawable, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(drawable);
        int i16 = com.google.android.gms.base.R.color.common_google_signin_btn_text_dark;
        int i17 = com.google.android.gms.base.R.color.common_google_signin_btn_text_light;
        setTextColor((ColorStateList) Preconditions.checkNotNull(resources.getColorStateList(zab(i10, i16, i17, i17))));
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 == 2) {
                    setText((CharSequence) null);
                } else {
                    throw new IllegalStateException(o.h(i9, "Unknown button size: "));
                }
            } else {
                setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text_long));
            }
        } else {
            setText(resources.getString(com.google.android.gms.base.R.string.common_signin_button_text));
        }
        setTransformationMethod(null);
        if (DeviceProperties.isWearable(getContext())) {
            setGravity(19);
        }
    }
}
