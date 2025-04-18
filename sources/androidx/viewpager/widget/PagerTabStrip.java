package androidx.viewpager.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.core.content.ContextCompat;

/* loaded from: classes3.dex */
public class PagerTabStrip extends PagerTitleStrip {

    /* renamed from: g, reason: collision with root package name */
    public int f21745g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21746h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f21747i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f21748j;

    /* renamed from: k, reason: collision with root package name */
    public float f21749k;

    /* renamed from: l, reason: collision with root package name */
    public float f21750l;

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$1, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass1 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    /* renamed from: androidx.viewpager.widget.PagerTabStrip$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    class AnonymousClass2 implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void b(float f2, int i2) {
        getHeight();
        throw null;
    }

    public boolean getDrawFullUnderline() {
        return this.f21746h;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), 0);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.f21745g;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getHeight();
        throw null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.f21748j) {
            return false;
        }
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (action == 0) {
            this.f21749k = x;
            this.f21750l = y2;
            this.f21748j = false;
        } else {
            if (action == 1) {
                throw null;
            }
            if (action == 2) {
                float f2 = 0;
                if (Math.abs(x - this.f21749k) > f2 || Math.abs(y2 - this.f21750l) > f2) {
                    this.f21748j = true;
                }
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
        super.setBackgroundColor(i2);
        if (this.f21747i) {
            return;
        }
        this.f21746h = (i2 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.f21747i) {
            return;
        }
        this.f21746h = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        if (this.f21747i) {
            return;
        }
        this.f21746h = i2 == 0;
    }

    public void setDrawFullUnderline(boolean z2) {
        this.f21746h = z2;
        this.f21747i = true;
        invalidate();
    }

    @Override // android.view.View
    public final void setPadding(int i2, int i3, int i4, int i5) {
        if (i5 < 0) {
            i5 = 0;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    public void setTabIndicatorColor(@ColorInt int i2) {
        this.f21745g = i2;
        throw null;
    }

    public void setTabIndicatorColorResource(@ColorRes int i2) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i2));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i2) {
        if (i2 < 0) {
            i2 = 0;
        }
        super.setTextSpacing(i2);
    }
}
