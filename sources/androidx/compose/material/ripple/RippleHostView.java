package androidx.compose.material.ripple;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material.ripple.UnprojectedRipple;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;

@StabilityInferred
/* loaded from: classes.dex */
public final class RippleHostView extends View {

    /* renamed from: g */
    public static final int[] f7442g = {android.R.attr.state_pressed, android.R.attr.state_enabled};

    /* renamed from: h */
    public static final int[] f7443h = new int[0];

    /* renamed from: a */
    public UnprojectedRipple f7444a;

    /* renamed from: b */
    public Boolean f7445b;

    /* renamed from: c */
    public Long f7446c;
    public a d;

    /* renamed from: f */
    public q0.a f7447f;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    public static /* synthetic */ void a(RippleHostView rippleHostView) {
        setRippleState$lambda$2(rippleHostView);
    }

    private final void setRippleState(boolean z2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        Runnable runnable = this.d;
        if (runnable != null) {
            removeCallbacks(runnable);
            runnable.run();
        }
        Long l2 = this.f7446c;
        long longValue = currentAnimationTimeMillis - (l2 != null ? l2.longValue() : 0L);
        if (z2 || longValue >= 5) {
            int[] iArr = z2 ? f7442g : f7443h;
            UnprojectedRipple unprojectedRipple = this.f7444a;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(iArr);
            }
        } else {
            a aVar = new a(this, 0);
            this.d = aVar;
            postDelayed(aVar, 50L);
        }
        this.f7446c = Long.valueOf(currentAnimationTimeMillis);
    }

    public static final void setRippleState$lambda$2(RippleHostView rippleHostView) {
        UnprojectedRipple unprojectedRipple = rippleHostView.f7444a;
        if (unprojectedRipple != null) {
            unprojectedRipple.setState(f7443h);
        }
        rippleHostView.d = null;
    }

    public final void b(PressInteraction.Press press, boolean z2, long j2, int i2, long j3, float f2, q0.a aVar) {
        if (this.f7444a == null || !p0.a.g(Boolean.valueOf(z2), this.f7445b)) {
            UnprojectedRipple unprojectedRipple = new UnprojectedRipple(z2);
            setBackground(unprojectedRipple);
            this.f7444a = unprojectedRipple;
            this.f7445b = Boolean.valueOf(z2);
        }
        UnprojectedRipple unprojectedRipple2 = this.f7444a;
        p0.a.p(unprojectedRipple2);
        this.f7447f = aVar;
        Integer num = unprojectedRipple2.f7481c;
        if (num == null || num.intValue() != i2) {
            unprojectedRipple2.f7481c = Integer.valueOf(i2);
            UnprojectedRipple.MRadiusHelper.f7482a.a(unprojectedRipple2, i2);
        }
        e(j2, j3, f2);
        if (z2) {
            unprojectedRipple2.setHotspot(Offset.g(press.f3741a), Offset.h(press.f3741a));
        } else {
            unprojectedRipple2.setHotspot(unprojectedRipple2.getBounds().centerX(), unprojectedRipple2.getBounds().centerY());
        }
        setRippleState(true);
    }

    public final void c() {
        this.f7447f = null;
        a aVar = this.d;
        if (aVar != null) {
            removeCallbacks(aVar);
            a aVar2 = this.d;
            p0.a.p(aVar2);
            aVar2.run();
        } else {
            UnprojectedRipple unprojectedRipple = this.f7444a;
            if (unprojectedRipple != null) {
                unprojectedRipple.setState(f7443h);
            }
        }
        UnprojectedRipple unprojectedRipple2 = this.f7444a;
        if (unprojectedRipple2 == null) {
            return;
        }
        unprojectedRipple2.setVisible(false, false);
        unscheduleDrawable(unprojectedRipple2);
    }

    public final void d() {
        setRippleState(false);
    }

    public final void e(long j2, long j3, float f2) {
        UnprojectedRipple unprojectedRipple = this.f7444a;
        if (unprojectedRipple == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28) {
            f2 *= 2;
        }
        long b2 = Color.b(j3, p0.a.x(f2, 1.0f));
        Color color = unprojectedRipple.f7480b;
        if (color == null || !Color.c(color.f14964a, b2)) {
            unprojectedRipple.f7480b = new Color(b2);
            unprojectedRipple.setColor(ColorStateList.valueOf(ColorKt.j(b2)));
        }
        Rect rect = new Rect(0, 0, p0.a.t0(Size.d(j2)), p0.a.t0(Size.b(j2)));
        setLeft(rect.left);
        setTop(rect.top);
        setRight(rect.right);
        setBottom(rect.bottom);
        unprojectedRipple.setBounds(rect);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        q0.a aVar = this.f7447f;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
    }
}
