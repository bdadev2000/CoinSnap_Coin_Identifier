package com.bytedance.adsdk.Sg.YFl;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import com.bytedance.adsdk.Sg.vc.wN;

/* loaded from: classes.dex */
public class YFl extends Paint {
    public YFl() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 29) {
            setColor((wN.YFl(i10, 0, 255) << 24) | (getColor() & ViewCompat.MEASURED_SIZE_MASK));
        } else {
            super.setAlpha(wN.YFl(i10, 0, 255));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public YFl(int i10) {
        super(i10);
    }

    public YFl(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public YFl(int i10, PorterDuff.Mode mode) {
        super(i10);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
