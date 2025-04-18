package n3;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;
import y3.f;

/* loaded from: classes.dex */
public final class a extends Paint {
    public a() {
    }

    @Override // android.graphics.Paint
    public final void setAlpha(int i10) {
        if (Build.VERSION.SDK_INT < 30) {
            int color = getColor();
            PointF pointF = f.a;
            setColor((Math.max(0, Math.min(255, i10)) << 24) | (color & ViewCompat.MEASURED_SIZE_MASK));
        } else {
            PointF pointF2 = f.a;
            super.setAlpha(Math.max(0, Math.min(255, i10)));
        }
    }

    @Override // android.graphics.Paint
    public final void setTextLocales(LocaleList localeList) {
    }

    public a(int i10) {
        super(i10);
    }

    public a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public a(PorterDuff.Mode mode, int i10) {
        super(1);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
