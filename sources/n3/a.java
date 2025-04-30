package N3;

import M0.C0219j;
import Z.b;
import android.R;
import android.content.res.ColorStateList;
import q.C2579B;

/* loaded from: classes2.dex */
public final class a extends C2579B {

    /* renamed from: i, reason: collision with root package name */
    public static final int[][] f2095i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: g, reason: collision with root package name */
    public ColorStateList f2096g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f2097h;

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f2096g == null) {
            int q9 = C0219j.q(this, com.tools.arruler.photomeasure.camera.ruler.R.attr.colorControlActivated);
            int q10 = C0219j.q(this, com.tools.arruler.photomeasure.camera.ruler.R.attr.colorOnSurface);
            int q11 = C0219j.q(this, com.tools.arruler.photomeasure.camera.ruler.R.attr.colorSurface);
            this.f2096g = new ColorStateList(f2095i, new int[]{C0219j.u(1.0f, q11, q9), C0219j.u(0.54f, q11, q10), C0219j.u(0.38f, q11, q10), C0219j.u(0.38f, q11, q10)});
        }
        return this.f2096g;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f2097h && b.a(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z8) {
        this.f2097h = z8;
        if (z8) {
            b.c(this, getMaterialThemeColorsTintList());
        } else {
            b.c(this, null);
        }
    }
}
