package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.RequiresApi;
import androidx.collection.ArrayMap;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes3.dex */
public class AnimatedVectorDrawableCompat extends VectorDrawableCommon implements Animatable2Compat {

    /* renamed from: c, reason: collision with root package name */
    public final Context f21656c;
    public Animator.AnimatorListener d = null;

    /* renamed from: f, reason: collision with root package name */
    public ArrayList f21657f = null;

    /* renamed from: g, reason: collision with root package name */
    public final Drawable.Callback f21658g = new Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
        @Override // android.graphics.drawable.Drawable.Callback
        public final void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j2);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    };

    /* renamed from: b, reason: collision with root package name */
    public final AnimatedVectorDrawableCompatState f21655b = new Drawable.ConstantState();

    /* loaded from: classes3.dex */
    public static class AnimatedVectorDrawableCompatState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public VectorDrawableCompat f21661a;

        /* renamed from: b, reason: collision with root package name */
        public AnimatorSet f21662b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList f21663c;
        public ArrayMap d;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState, android.graphics.drawable.Drawable$ConstantState] */
    public AnimatedVectorDrawableCompat(Context context) {
        this.f21656c = context;
    }

    public static AnimatedVectorDrawableCompat a(int i2, Context context) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        Drawable b2 = ResourcesCompat.b(context.getResources(), i2, context.getTheme());
        animatedVectorDrawableCompat.f21666a = b2;
        b2.setCallback(animatedVectorDrawableCompat.f21658g);
        new AnimatedVectorDrawableDelegateState(animatedVectorDrawableCompat.f21666a.getConstantState());
        return animatedVectorDrawableCompat;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.a(drawable, theme);
        }
    }

    public final void b(Animatable2Compat.AnimationCallback animationCallback) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).registerAnimationCallback(animationCallback.getPlatformCallback());
            return;
        }
        if (animationCallback == null) {
            return;
        }
        if (this.f21657f == null) {
            this.f21657f = new ArrayList();
        }
        if (this.f21657f.contains(animationCallback)) {
            return;
        }
        this.f21657f.add(animationCallback);
        if (this.d == null) {
            this.d = new AnimatorListenerAdapter() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f21657f);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).onAnimationEnd(animatedVectorDrawableCompat);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationStart(Animator animator) {
                    AnimatedVectorDrawableCompat animatedVectorDrawableCompat = AnimatedVectorDrawableCompat.this;
                    ArrayList arrayList = new ArrayList(animatedVectorDrawableCompat.f21657f);
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        ((Animatable2Compat.AnimationCallback) arrayList.get(i2)).onAnimationStart(animatedVectorDrawableCompat);
                    }
                }
            };
        }
        this.f21655b.f21662b.addListener(this.d);
    }

    public final boolean c(Animatable2Compat.AnimationCallback animationCallback) {
        Animator.AnimatorListener animatorListener;
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).unregisterAnimationCallback(animationCallback.getPlatformCallback());
        }
        ArrayList arrayList = this.f21657f;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean remove = arrayList.remove(animationCallback);
        if (this.f21657f.size() == 0 && (animatorListener = this.d) != null) {
            this.f21655b.f21662b.removeListener(animatorListener);
            this.d = null;
        }
        return remove;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            return DrawableCompat.b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f21655b;
        animatedVectorDrawableCompatState.f21661a.draw(canvas);
        if (animatedVectorDrawableCompatState.f21662b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getAlpha() : this.f21655b.f21661a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f21655b.getClass();
        return changingConfigurations | 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f21666a;
        return drawable != null ? DrawableCompat.c(drawable) : this.f21655b.f21661a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f21666a != null) {
            return new AnimatedVectorDrawableDelegateState(this.f21666a.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f21655b.f21661a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f21655b.f21661a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.getOpacity() : this.f21655b.f21661a.getOpacity();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x00b6, code lost:
    
        if (r3.f21662b != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00b8, code lost:
    
        r3.f21662b = new android.animation.AnimatorSet();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00bf, code lost:
    
        r3.f21662b.playTogether(r3.f21663c);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c6, code lost:
    
        return;
     */
    /* JADX WARN: Type inference failed for: r7v8, types: [androidx.collection.SimpleArrayMap, androidx.collection.ArrayMap] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void inflate(android.content.res.Resources r9, org.xmlpull.v1.XmlPullParser r10, android.util.AttributeSet r11, android.content.res.Resources.Theme r12) {
        /*
            r8 = this;
            android.graphics.drawable.Drawable r0 = r8.f21666a
            if (r0 == 0) goto L8
            androidx.core.graphics.drawable.DrawableCompat.e(r0, r9, r10, r11, r12)
            return
        L8:
            int r0 = r10.getEventType()
            int r1 = r10.getDepth()
            r2 = 1
            int r1 = r1 + r2
        L12:
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$AnimatedVectorDrawableCompatState r3 = r8.f21655b
            if (r0 == r2) goto Lb4
            int r4 = r10.getDepth()
            if (r4 >= r1) goto L1f
            r4 = 3
            if (r0 == r4) goto Lb4
        L1f:
            r4 = 2
            if (r0 != r4) goto Lae
            java.lang.String r0 = r10.getName()
            java.lang.String r4 = "animated-vector"
            boolean r4 = r4.equals(r0)
            r5 = 0
            if (r4 == 0) goto L54
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.e
            android.content.res.TypedArray r0 = androidx.core.content.res.TypedArrayUtils.d(r9, r12, r11, r0)
            int r4 = r0.getResourceId(r5, r5)
            if (r4 == 0) goto L50
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r4 = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.a(r9, r4, r12)
            r4.f21671g = r5
            android.graphics.drawable.Drawable$Callback r5 = r8.f21658g
            r4.setCallback(r5)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r5 = r3.f21661a
            if (r5 == 0) goto L4e
            r6 = 0
            r5.setCallback(r6)
        L4e:
            r3.f21661a = r4
        L50:
            r0.recycle()
            goto Lae
        L54:
            java.lang.String r4 = "target"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto Lae
            int[] r0 = androidx.vectordrawable.graphics.drawable.AndroidResources.f21653f
            android.content.res.TypedArray r0 = r9.obtainAttributes(r11, r0)
            java.lang.String r4 = r0.getString(r5)
            int r6 = r0.getResourceId(r2, r5)
            if (r6 == 0) goto Lab
            android.content.Context r7 = r8.f21656c
            if (r7 == 0) goto La0
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r7, r6)
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat r7 = r3.f21661a
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VectorDrawableCompatState r7 = r7.f21668b
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat$VPathRenderer r7 = r7.f21713b
            androidx.collection.ArrayMap r7 = r7.f21711o
            java.lang.Object r7 = r7.get(r4)
            r6.setTarget(r7)
            java.util.ArrayList r7 = r3.f21663c
            if (r7 != 0) goto L95
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r3.f21663c = r7
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap
            r7.<init>(r5)
            r3.d = r7
        L95:
            java.util.ArrayList r5 = r3.f21663c
            r5.add(r6)
            androidx.collection.ArrayMap r3 = r3.d
            r3.put(r6, r4)
            goto Lab
        La0:
            r0.recycle()
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Context can't be null when inflating animators"
            r9.<init>(r10)
            throw r9
        Lab:
            r0.recycle()
        Lae:
            int r0 = r10.next()
            goto L12
        Lb4:
            android.animation.AnimatorSet r9 = r3.f21662b
            if (r9 != 0) goto Lbf
            android.animation.AnimatorSet r9 = new android.animation.AnimatorSet
            r9.<init>()
            r3.f21662b = r9
        Lbf:
            android.animation.AnimatorSet r9 = r3.f21662b
            java.util.ArrayList r10 = r3.f21663c
            r9.playTogether(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.inflate(android.content.res.Resources, org.xmlpull.v1.XmlPullParser, android.util.AttributeSet, android.content.res.Resources$Theme):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.isAutoMirrored() : this.f21655b.f21661a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f21666a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f21655b.f21662b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.isStateful() : this.f21655b.f21661a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f21655b.f21661a.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i2) {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.setLevel(i2) : this.f21655b.f21661a.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f21666a;
        return drawable != null ? drawable.setState(iArr) : this.f21655b.f21661a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i2) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setAlpha(i2);
        } else {
            this.f21655b.f21661a.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f21655b.f21661a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f21655b.f21661a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i2) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.i(drawable, i2);
        } else {
            this.f21655b.f21661a.setTint(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.j(drawable, colorStateList);
        } else {
            this.f21655b.f21661a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            DrawableCompat.k(drawable, mode);
        } else {
            this.f21655b.f21661a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f21655b.f21661a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState = this.f21655b;
        if (animatedVectorDrawableCompatState.f21662b.isStarted()) {
            return;
        }
        animatedVectorDrawableCompatState.f21662b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f21666a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f21655b.f21662b.end();
        }
    }

    @RequiresApi
    /* loaded from: classes3.dex */
    public static class AnimatedVectorDrawableDelegateState extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f21664a;

        public AnimatedVectorDrawableDelegateState(Drawable.ConstantState constantState) {
            this.f21664a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f21664a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return this.f21664a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable newDrawable = this.f21664a.newDrawable();
            animatedVectorDrawableCompat.f21666a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f21658g);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable newDrawable = this.f21664a.newDrawable(resources);
            animatedVectorDrawableCompat.f21666a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f21658g);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(null);
            Drawable newDrawable = this.f21664a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f21666a = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f21658g);
            return animatedVectorDrawableCompat;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
