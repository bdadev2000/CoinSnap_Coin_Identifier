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
import d3.g;
import ni.a;

/* loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* renamed from: h */
    public static final int[] f1120h = {R.attr.colorBackground};

    /* renamed from: i */
    public static final a f1121i = new a();

    /* renamed from: b */
    public boolean f1122b;

    /* renamed from: c */
    public boolean f1123c;

    /* renamed from: d */
    public final Rect f1124d;

    /* renamed from: f */
    public final Rect f1125f;

    /* renamed from: g */
    public final g f1126g;

    public CardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet, com.plantcare.ai.identifier.plantid.R.attr.cardViewStyle);
        int color;
        ColorStateList valueOf;
        Rect rect = new Rect();
        this.f1124d = rect;
        this.f1125f = new Rect();
        g gVar = new g(this);
        this.f1126g = gVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.a.a, com.plantcare.ai.identifier.plantid.R.attr.cardViewStyle, com.plantcare.ai.identifier.plantid.R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(f1120h);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(com.plantcare.ai.identifier.plantid.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(com.plantcare.ai.identifier.plantid.R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.f1122b = obtainStyledAttributes.getBoolean(7, false);
        this.f1123c = obtainStyledAttributes.getBoolean(6, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        rect.left = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        rect.top = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        rect.right = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        rect.bottom = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        dimension3 = dimension2 > dimension3 ? dimension2 : dimension3;
        obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        a aVar = f1121i;
        q.a aVar2 = new q.a(dimension, valueOf);
        gVar.f16812c = aVar2;
        ((CardView) gVar.f16813d).setBackgroundDrawable(aVar2);
        CardView cardView = (CardView) gVar.f16813d;
        cardView.setClipToOutline(true);
        cardView.setElevation(dimension2);
        aVar.u(gVar, dimension3);
    }

    public static /* synthetic */ void a(CardView cardView, int i10, int i11, int i12, int i13) {
        super.setPadding(i10, i11, i12, i13);
    }

    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return ((q.a) ((Drawable) this.f1126g.f16812c)).f23654h;
    }

    public float getCardElevation() {
        return ((CardView) this.f1126g.f16813d).getElevation();
    }

    public int getContentPaddingBottom() {
        return this.f1124d.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f1124d.left;
    }

    public int getContentPaddingRight() {
        return this.f1124d.right;
    }

    public int getContentPaddingTop() {
        return this.f1124d.top;
    }

    public float getMaxCardElevation() {
        return ((q.a) ((Drawable) this.f1126g.f16812c)).f23651e;
    }

    public boolean getPreventCornerOverlap() {
        return this.f1123c;
    }

    public float getRadius() {
        return ((q.a) ((Drawable) this.f1126g.f16812c)).a;
    }

    public boolean getUseCompatPadding() {
        return this.f1122b;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    public void setCardBackgroundColor(int i10) {
        ColorStateList valueOf = ColorStateList.valueOf(i10);
        q.a aVar = (q.a) ((Drawable) this.f1126g.f16812c);
        aVar.b(valueOf);
        aVar.invalidateSelf();
    }

    public void setCardElevation(float f10) {
        ((CardView) this.f1126g.f16813d).setElevation(f10);
    }

    public void setMaxCardElevation(float f10) {
        f1121i.u(this.f1126g, f10);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i10) {
        super.setMinimumHeight(i10);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i10) {
        super.setMinimumWidth(i10);
    }

    @Override // android.view.View
    public final void setPadding(int i10, int i11, int i12, int i13) {
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i10, int i11, int i12, int i13) {
    }

    public void setPreventCornerOverlap(boolean z10) {
        if (z10 != this.f1123c) {
            this.f1123c = z10;
            a aVar = f1121i;
            g gVar = this.f1126g;
            aVar.u(gVar, ((q.a) ((Drawable) gVar.f16812c)).f23651e);
        }
    }

    public void setRadius(float f10) {
        q.a aVar = (q.a) ((Drawable) this.f1126g.f16812c);
        if (f10 != aVar.a) {
            aVar.a = f10;
            aVar.c(null);
            aVar.invalidateSelf();
        }
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f1122b != z10) {
            this.f1122b = z10;
            a aVar = f1121i;
            g gVar = this.f1126g;
            aVar.u(gVar, ((q.a) ((Drawable) gVar.f16812c)).f23651e);
        }
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        q.a aVar = (q.a) ((Drawable) this.f1126g.f16812c);
        aVar.b(colorStateList);
        aVar.invalidateSelf();
    }
}
