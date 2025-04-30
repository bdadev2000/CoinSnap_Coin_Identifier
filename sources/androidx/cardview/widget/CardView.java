package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import k8.c;
import q6.b;
import v.AbstractC2830a;
import w.C2859a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f4320h = {R.attr.colorBackground};

    /* renamed from: i, reason: collision with root package name */
    public static final b f4321i = new Object();
    public boolean b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4322c;

    /* renamed from: d, reason: collision with root package name */
    public final Rect f4323d;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f4324f;

    /* renamed from: g, reason: collision with root package name */
    public final c f4325g;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [k8.c, java.lang.Object] */
    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.tools.arruler.photomeasure.camera.ruler.R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f4323d = rect;
        this.f4324f = new Rect();
        ?? obj = new Object();
        obj.f21500c = this;
        this.f4325g = obj;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2830a.f23451a, com.tools.arruler.photomeasure.camera.ruler.R.attr.cardViewStyle, com.tools.arruler.photomeasure.camera.ruler.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f4320h);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.tools.arruler.photomeasure.camera.ruler.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.tools.arruler.photomeasure.camera.ruler.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.b = obtainStyledAttributes.getBoolean(7, false);
        this.f4322c = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        b bVar = f4321i;
        C2859a c2859a = new C2859a(valueOf, dimension);
        obj.b = c2859a;
        setBackgroundDrawable(c2859a);
        setClipToOutline(true);
        setElevation(dimension2);
        bVar.b(obj, dimension3);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((C2859a) ((Drawable) this.f4325g.b)).f23653h;
    }

    public float getCardElevation() {
        return ((CardView) this.f4325g.f21500c).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f4323d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f4323d.left;
    }

    public int getContentPaddingRight() {
        return this.f4323d.right;
    }

    public int getContentPaddingTop() {
        return this.f4323d.top;
    }

    public float getMaxCardElevation() {
        return ((C2859a) ((Drawable) this.f4325g.b)).f23650e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f4322c;
    }

    public float getRadius() {
        return ((C2859a) ((Drawable) this.f4325g.b)).f23647a;
    }

    public boolean getUseCompatPadding() {
        return this.b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(i9, i10);
    }

    public void setCardBackgroundColor(int i9) {
        ColorStateList valueOf = ColorStateList.valueOf(i9);
        C2859a c2859a = (C2859a) ((Drawable) this.f4325g.b);
        if (valueOf == null) {
            c2859a.getClass();
            valueOf = ColorStateList.valueOf(0);
        }
        c2859a.f23653h = valueOf;
        c2859a.b.setColor(valueOf.getColorForState(c2859a.getState(), c2859a.f23653h.getDefaultColor()));
        c2859a.invalidateSelf();
    }

    public void setCardElevation(float f9) {
        ((CardView) this.f4325g.f21500c).setElevation(f9);
    }

    public void setMaxCardElevation(float f9) {
        f4321i.b(this.f4325g, f9);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i9) {
        super.setMinimumHeight(i9);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i9) {
        super.setMinimumWidth(i9);
    }

    @Override // android.view.View
    public final void setPadding(int i9, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i9, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z8) {
        if (z8 != this.f4322c) {
            this.f4322c = z8;
            b bVar = f4321i;
            c cVar = this.f4325g;
            bVar.b(cVar, ((C2859a) ((Drawable) cVar.b)).f23650e);
        }
    }

    public void setRadius(float f9) {
        C2859a c2859a = (C2859a) ((Drawable) this.f4325g.b);
        if (f9 != c2859a.f23647a) {
            c2859a.f23647a = f9;
            c2859a.b(null);
            c2859a.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z8) {
        if (this.b != z8) {
            this.b = z8;
            b bVar = f4321i;
            c cVar = this.f4325g;
            bVar.b(cVar, ((C2859a) ((Drawable) cVar.b)).f23650e);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        C2859a c2859a = (C2859a) ((Drawable) this.f4325g.b);
        if (colorStateList == null) {
            c2859a.getClass();
            colorStateList = ColorStateList.valueOf(0);
        }
        c2859a.f23653h = colorStateList;
        c2859a.b.setColor(colorStateList.getColorForState(c2859a.getState(), c2859a.f23653h.getDefaultColor()));
        c2859a.invalidateSelf();
    }
}
