package w9;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;
import com.plantcare.ai.identifier.plantid.R;
import ka.h;
import ka.i;
import ka.l;
import ka.x;
import v8.u0;

/* loaded from: classes3.dex */
public final class c {
    public final MaterialButton a;

    /* renamed from: b, reason: collision with root package name */
    public l f26932b;

    /* renamed from: c, reason: collision with root package name */
    public int f26933c;

    /* renamed from: d, reason: collision with root package name */
    public int f26934d;

    /* renamed from: e, reason: collision with root package name */
    public int f26935e;

    /* renamed from: f, reason: collision with root package name */
    public int f26936f;

    /* renamed from: g, reason: collision with root package name */
    public int f26937g;

    /* renamed from: h, reason: collision with root package name */
    public int f26938h;

    /* renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f26939i;

    /* renamed from: j, reason: collision with root package name */
    public ColorStateList f26940j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f26941k;

    /* renamed from: l, reason: collision with root package name */
    public ColorStateList f26942l;

    /* renamed from: m, reason: collision with root package name */
    public i f26943m;

    /* renamed from: q, reason: collision with root package name */
    public boolean f26947q;

    /* renamed from: s, reason: collision with root package name */
    public RippleDrawable f26949s;

    /* renamed from: t, reason: collision with root package name */
    public int f26950t;

    /* renamed from: n, reason: collision with root package name */
    public boolean f26944n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f26945o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f26946p = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f26948r = true;

    public c(MaterialButton materialButton, l lVar) {
        this.a = materialButton;
        this.f26932b = lVar;
    }

    public final x a() {
        RippleDrawable rippleDrawable = this.f26949s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 1) {
            if (this.f26949s.getNumberOfLayers() > 2) {
                return (x) this.f26949s.getDrawable(2);
            }
            return (x) this.f26949s.getDrawable(1);
        }
        return null;
    }

    public final i b(boolean z10) {
        RippleDrawable rippleDrawable = this.f26949s;
        if (rippleDrawable != null && rippleDrawable.getNumberOfLayers() > 0) {
            return (i) ((LayerDrawable) ((InsetDrawable) this.f26949s.getDrawable(0)).getDrawable()).getDrawable(!z10 ? 1 : 0);
        }
        return null;
    }

    public final void c(l lVar) {
        this.f26932b = lVar;
        if (b(false) != null) {
            b(false).setShapeAppearanceModel(lVar);
        }
        if (b(true) != null) {
            b(true).setShapeAppearanceModel(lVar);
        }
        if (a() != null) {
            a().setShapeAppearanceModel(lVar);
        }
    }

    public final void d(int i10, int i11) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i12 = this.f26935e;
        int i13 = this.f26936f;
        this.f26936f = i11;
        this.f26935e = i10;
        if (!this.f26945o) {
            e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i10) - i12, paddingEnd, (paddingBottom + i11) - i13);
    }

    public final void e() {
        int i10;
        i iVar = new i(this.f26932b);
        MaterialButton materialButton = this.a;
        iVar.h(materialButton.getContext());
        h0.a.h(iVar, this.f26940j);
        PorterDuff.Mode mode = this.f26939i;
        if (mode != null) {
            h0.a.i(iVar, mode);
        }
        float f10 = this.f26938h;
        ColorStateList colorStateList = this.f26941k;
        iVar.f20557b.f20546l = f10;
        iVar.invalidateSelf();
        h hVar = iVar.f20557b;
        if (hVar.f20539e != colorStateList) {
            hVar.f20539e = colorStateList;
            iVar.onStateChange(iVar.getState());
        }
        i iVar2 = new i(this.f26932b);
        iVar2.setTint(0);
        float f11 = this.f26938h;
        if (this.f26944n) {
            i10 = u0.x(R.attr.colorSurface, materialButton);
        } else {
            i10 = 0;
        }
        iVar2.f20557b.f20546l = f11;
        iVar2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        h hVar2 = iVar2.f20557b;
        if (hVar2.f20539e != valueOf) {
            hVar2.f20539e = valueOf;
            iVar2.onStateChange(iVar2.getState());
        }
        i iVar3 = new i(this.f26932b);
        this.f26943m = iVar3;
        h0.a.g(iVar3, -1);
        RippleDrawable rippleDrawable = new RippleDrawable(ia.a.a(this.f26942l), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{iVar2, iVar}), this.f26933c, this.f26935e, this.f26934d, this.f26936f), this.f26943m);
        this.f26949s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        i b3 = b(false);
        if (b3 != null) {
            b3.j(this.f26950t);
            b3.setState(materialButton.getDrawableState());
        }
    }

    public final void f() {
        int i10 = 0;
        i b3 = b(false);
        i b10 = b(true);
        if (b3 != null) {
            float f10 = this.f26938h;
            ColorStateList colorStateList = this.f26941k;
            b3.f20557b.f20546l = f10;
            b3.invalidateSelf();
            h hVar = b3.f20557b;
            if (hVar.f20539e != colorStateList) {
                hVar.f20539e = colorStateList;
                b3.onStateChange(b3.getState());
            }
            if (b10 != null) {
                float f11 = this.f26938h;
                if (this.f26944n) {
                    i10 = u0.x(R.attr.colorSurface, this.a);
                }
                b10.f20557b.f20546l = f11;
                b10.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(i10);
                h hVar2 = b10.f20557b;
                if (hVar2.f20539e != valueOf) {
                    hVar2.f20539e = valueOf;
                    b10.onStateChange(b10.getState());
                }
            }
        }
    }
}
