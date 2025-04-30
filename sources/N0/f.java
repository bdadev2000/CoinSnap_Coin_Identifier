package N0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import g4.AbstractC2292b;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class f extends g implements Animatable {

    /* renamed from: d, reason: collision with root package name */
    public final Context f2025d;

    /* renamed from: f, reason: collision with root package name */
    public B3.c f2026f = null;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f2027g = null;

    /* renamed from: h, reason: collision with root package name */
    public final c f2028h = new c(this);

    /* renamed from: c, reason: collision with root package name */
    public final d f2024c = new Drawable.ConstantState();

    /* JADX WARN: Type inference failed for: r2v1, types: [android.graphics.drawable.Drawable$ConstantState, N0.d] */
    public f(Context context) {
        this.f2025d = context;
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return M.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        d dVar = this.f2024c;
        dVar.f2020a.draw(canvas);
        if (dVar.b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f2024c.f2020a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f2024c.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return M.a.c(drawable);
        }
        return this.f2024c.f2020a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.b != null) {
            return new e(this.b.getConstantState(), 0);
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f2024c.f2020a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f2024c.f2020a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f2024c.f2020a.getOpacity();
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [x.l, x.b] */
    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        d dVar;
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            dVar = this.f2024c;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray f9 = K.b.f(resources, theme, attributeSet, a.f2017e);
                    int resourceId = f9.getResourceId(0, 0);
                    if (resourceId != 0) {
                        p pVar = new p();
                        ThreadLocal threadLocal = K.o.f1632a;
                        pVar.b = K.i.a(resources, resourceId, theme);
                        new o(pVar.b.getConstantState());
                        pVar.f2079h = false;
                        pVar.setCallback(this.f2028h);
                        p pVar2 = dVar.f2020a;
                        if (pVar2 != null) {
                            pVar2.setCallback(null);
                        }
                        dVar.f2020a = pVar;
                    }
                    f9.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, a.f2018f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f2025d;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(dVar.f2020a.f2075c.b.f2063o.getOrDefault(string, null));
                            if (dVar.f2021c == null) {
                                dVar.f2021c = new ArrayList();
                                dVar.f2022d = new x.l();
                            }
                            dVar.f2021c.add(loadAnimator);
                            dVar.f2022d.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (dVar.b == null) {
            dVar.b = new AnimatorSet();
        }
        dVar.b.playTogether(dVar.f2021c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f2024c.f2020a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f2024c.b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f2024c.f2020a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f2024c.f2020a.setBounds(rect);
        }
    }

    @Override // N0.g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setLevel(i9);
        }
        return this.f2024c.f2020a.setLevel(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f2024c.f2020a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else {
            this.f2024c.f2020a.setAlpha(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z8) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setAutoMirrored(z8);
        } else {
            this.f2024c.f2020a.setAutoMirrored(z8);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f2024c.f2020a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            AbstractC2292b.o(drawable, i9);
        } else {
            this.f2024c.f2020a.setTint(i9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.h(drawable, colorStateList);
        } else {
            this.f2024c.f2020a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.b;
        if (drawable != null) {
            M.a.i(drawable, mode);
        } else {
            this.f2024c.f2020a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z8, boolean z9) {
        Drawable drawable = this.b;
        if (drawable != null) {
            return drawable.setVisible(z8, z9);
        }
        this.f2024c.f2020a.setVisible(z8, z9);
        return super.setVisible(z8, z9);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        d dVar = this.f2024c;
        if (dVar.b.isStarted()) {
            return;
        }
        dVar.b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f2024c.b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
