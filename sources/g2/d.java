package g2;

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
import f0.q;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public final class d extends e implements Animatable {

    /* renamed from: c, reason: collision with root package name */
    public final b f17937c;

    /* renamed from: d, reason: collision with root package name */
    public final Context f17938d;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.d f17939f = null;

    /* renamed from: g, reason: collision with root package name */
    public ArrayList f17940g = null;

    /* renamed from: h, reason: collision with root package name */
    public final i.a f17941h;

    public d(Context context) {
        i.a aVar = new i.a(this);
        this.f17941h = aVar;
        this.f17938d = context;
        this.f17937c = new b(aVar);
    }

    @Override // g2.e, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            h0.a.a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return h0.a.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        b bVar = this.f17937c;
        bVar.a.draw(canvas);
        if (bVar.f17934b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.f17937c.a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f17937c.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return h0.a.c(drawable);
        }
        return this.f17937c.a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f17942b != null) {
            return new c(this.f17942b.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f17937c.a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f17937c.a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f17937c.a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        b bVar;
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            h0.a.d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            bVar = this.f17937c;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray K = com.bumptech.glide.c.K(resources, theme, attributeSet, d6.g.f16888e);
                    int resourceId = K.getResourceId(0, 0);
                    if (resourceId != 0) {
                        n nVar = new n();
                        ThreadLocal threadLocal = q.a;
                        nVar.f17942b = f0.i.a(resources, resourceId, theme);
                        new m(nVar.f17942b.getConstantState());
                        nVar.f17999h = false;
                        nVar.setCallback(this.f17941h);
                        n nVar2 = bVar.a;
                        if (nVar2 != null) {
                            nVar2.setCallback(null);
                        }
                        bVar.a = nVar;
                    }
                    K.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, d6.g.f16889f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f17938d;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            loadAnimator.setTarget(bVar.a.f17995c.f17983b.f17982o.getOrDefault(string, null));
                            if (bVar.f17935c == null) {
                                bVar.f17935c = new ArrayList();
                                bVar.f17936d = new r.b();
                            }
                            bVar.f17935c.add(loadAnimator);
                            bVar.f17936d.put(loadAnimator, string);
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
        if (bVar.f17934b == null) {
            bVar.f17934b = new AnimatorSet();
        }
        bVar.f17934b.playTogether(bVar.f17935c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.f17937c.a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f17937c.f17934b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f17937c.a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f17937c.a.setBounds(rect);
        }
    }

    @Override // g2.e, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i10) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.setLevel(i10);
        }
        return this.f17937c.a.setLevel(i10);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f17937c.a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else {
            this.f17937c.a.setAlpha(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setAutoMirrored(z10);
        } else {
            this.f17937c.a.setAutoMirrored(z10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f17937c.a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            com.bumptech.glide.d.B(drawable, i10);
        } else {
            this.f17937c.a.setTint(i10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            com.bumptech.glide.d.C(drawable, colorStateList);
        } else {
            this.f17937c.a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            com.bumptech.glide.d.D(drawable, mode);
        } else {
            this.f17937c.a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            return drawable.setVisible(z10, z11);
        }
        this.f17937c.a.setVisible(z10, z11);
        return super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        b bVar = this.f17937c;
        if (bVar.f17934b.isStarted()) {
            return;
        }
        bVar.f17934b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f17942b;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f17937c.f17934b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
