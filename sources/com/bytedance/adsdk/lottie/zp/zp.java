package com.bytedance.adsdk.lottie.zp;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.lottie.HWF.COT;

/* loaded from: classes.dex */
public class zp extends Paint {
    public zp() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i9) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((COT.zp(i9, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        } else {
            super.setAlpha(COT.zp(i9, 0, 255));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public zp(int i9) {
        super(i9);
    }

    public zp(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public zp(int i9, PorterDuff.Mode mode) {
        super(i9);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
