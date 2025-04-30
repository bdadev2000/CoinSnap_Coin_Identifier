package D1;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.ViewCompat;

/* loaded from: classes.dex */
public final class i extends Paint {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f708a;

    @Override // android.graphics.Paint
    public void setAlpha(int i9) {
        switch (this.f708a) {
            case 2:
                if (Build.VERSION.SDK_INT < 30) {
                    int color = getColor();
                    PointF pointF = H1.g.f1365a;
                    setColor((Math.max(0, Math.min(255, i9)) << 24) | (color & ViewCompat.MEASURED_SIZE_MASK));
                    return;
                } else {
                    PointF pointF2 = H1.g.f1365a;
                    super.setAlpha(Math.max(0, Math.min(255, i9)));
                    return;
                }
            default:
                super.setAlpha(i9);
                return;
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
        switch (this.f708a) {
            case 2:
                return;
            default:
                super.setTextLocales(localeList);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i9, int i10) {
        super(i9);
        this.f708a = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(PorterDuff.Mode mode) {
        super(1);
        this.f708a = 2;
        setXfermode(new PorterDuffXfermode(mode));
    }

    private final void a(LocaleList localeList) {
    }
}
