package C3;

import M0.C0219j;
import R3.f;
import R3.g;
import R3.k;
import R3.v;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.view.ViewCompat;
import com.google.android.material.button.MaterialButton;
import com.tools.arruler.photomeasure.camera.ruler.R;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final MaterialButton f537a;
    public k b;

    /* renamed from: c, reason: collision with root package name */
    public int f538c;

    /* renamed from: d, reason: collision with root package name */
    public int f539d;

    /* renamed from: e, reason: collision with root package name */
    public int f540e;

    /* renamed from: f, reason: collision with root package name */
    public int f541f;

    /* renamed from: g, reason: collision with root package name */
    public int f542g;

    /* renamed from: h, reason: collision with root package name */
    public int f543h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f544i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f545j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f546k;
    public ColorStateList l;
    public g m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f550q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f552s;

    /* renamed from: t, reason: collision with root package name */
    public int f553t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f547n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f548o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f549p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f551r = true;

    public c(MaterialButton materialButton, k kVar) {
        this.f537a = materialButton;
        this.b = kVar;
    }

    public final v a() {
        RippleDrawable rippleDrawable = this.f552s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f552s.getNumberOfLayers() > 2) {
                return (v) this.f552s.getDrawable(2);
            }
            return (v) this.f552s.getDrawable(1);
        }
        return null;
    }

    public final g b(boolean z8) {
        RippleDrawable rippleDrawable = this.f552s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (g) ((LayerDrawable) ((InsetDrawable) this.f552s.getDrawable(0)).getDrawable()).getDrawable(!z8 ? 1 : 0);
        }
        return null;
    }

    public final void c(k kVar) {
        this.b = kVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(kVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(kVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(kVar);
        }
    }

    public final void d(int i9, int i10) {
        MaterialButton materialButton = this.f537a;
        int paddingStart = ViewCompat.getPaddingStart(materialButton);
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = ViewCompat.getPaddingEnd(materialButton);
        int paddingBottom = materialButton.getPaddingBottom();
        int i11 = this.f540e;
        int i12 = this.f541f;
        this.f541f = i10;
        this.f540e = i9;
        if (!this.f548o) {
            e();
        }
        ViewCompat.setPaddingRelative(materialButton, paddingStart, (paddingTop + i9) - i11, paddingEnd, (paddingBottom + i10) - i12);
    }

    public final void e() {
        int i9;
        g gVar = new g(this.b);
        MaterialButton materialButton = this.f537a;
        gVar.i(materialButton.getContext());
        M.a.h(gVar, this.f545j);
        PorterDuff.Mode mode = this.f544i;
        if (mode != null) {
            M.a.i(gVar, mode);
        }
        float f9 = this.f543h;
        ColorStateList colorStateList = this.f546k;
        gVar.b.f2652k = f9;
        gVar.invalidateSelf();
        f fVar = gVar.b;
        if (fVar.f2645d != colorStateList) {
            fVar.f2645d = colorStateList;
            gVar.onStateChange(gVar.getState());
        }
        g gVar2 = new g(this.b);
        gVar2.setTint(0);
        float f10 = this.f543h;
        if (this.f547n) {
            i9 = C0219j.q(materialButton, R.attr.colorSurface);
        } else {
            i9 = 0;
        }
        gVar2.b.f2652k = f10;
        gVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i9);
        f fVar2 = gVar2.b;
        if (fVar2.f2645d != valueOf) {
            fVar2.f2645d = valueOf;
            gVar2.onStateChange(gVar2.getState());
        }
        g gVar3 = new g(this.b);
        this.m = gVar3;
        M.a.g(gVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(P3.a.a(this.l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{gVar2, gVar}), this.f538c, this.f540e, this.f539d, this.f541f), this.m);
        this.f552s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        g b = b(false);
        if (b != null) {
            b.j(this.f553t);
            b.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i9 = 0;
        g b = b(false);
        g b8 = b(true);
        if (b != null) {
            float f9 = this.f543h;
            ColorStateList colorStateList = this.f546k;
            b.b.f2652k = f9;
            b.invalidateSelf();
            f fVar = b.b;
            if (fVar.f2645d != colorStateList) {
                fVar.f2645d = colorStateList;
                b.onStateChange(b.getState());
            }
            if (b8 != null) {
                float f10 = this.f543h;
                if (this.f547n) {
                    i9 = C0219j.q(this.f537a, R.attr.colorSurface);
                }
                b8.b.f2652k = f10;
                b8.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i9);
                f fVar2 = b8.b;
                if (fVar2.f2645d != valueOf) {
                    fVar2.f2645d = valueOf;
                    b8.onStateChange(b8.getState());
                }
            }
        }
    }
}
