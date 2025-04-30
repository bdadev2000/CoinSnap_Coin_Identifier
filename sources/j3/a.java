package J3;

import M0.C0219j;
import a.AbstractC0325a;
import android.content.Context;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f1570f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1571a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f1572c;

    /* renamed from: d, reason: collision with root package name */
    public final int f1573d;

    /* renamed from: e, reason: collision with root package name */
    public final float f1574e;

    public a(Context context) {
        boolean o3 = AbstractC0325a.o(context, R.attr.elevationOverlayEnabled, false);
        int p2 = C0219j.p(context, R.attr.elevationOverlayColor, 0);
        int p7 = C0219j.p(context, R.attr.elevationOverlayAccentColor, 0);
        int p9 = C0219j.p(context, R.attr.colorSurface, 0);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.f1571a = o3;
        this.b = p2;
        this.f1572c = p7;
        this.f1573d = p9;
        this.f1574e = f9;
    }
}
