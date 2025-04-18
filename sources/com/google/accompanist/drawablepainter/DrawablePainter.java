package com.google.accompanist.drawablepainter;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.unit.LayoutDirection;
import b1.f0;
import d0.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p0.a;

@StabilityInferred
/* loaded from: classes2.dex */
public final class DrawablePainter extends Painter implements RememberObserver {
    public static final int $stable = 8;

    @NotNull
    private final h callback$delegate;

    @NotNull
    private final MutableState drawInvalidateTick$delegate;

    @NotNull
    private final Drawable drawable;

    @NotNull
    private final MutableState drawableIntrinsicSize$delegate;

    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DrawablePainter(@NotNull Drawable drawable) {
        ParcelableSnapshotMutableState f2;
        long intrinsicSize;
        ParcelableSnapshotMutableState f3;
        a.s(drawable, "drawable");
        this.drawable = drawable;
        f2 = SnapshotStateKt.f(0, StructuralEqualityPolicy.f14078a);
        this.drawInvalidateTick$delegate = f2;
        intrinsicSize = DrawablePainterKt.getIntrinsicSize(drawable);
        f3 = SnapshotStateKt.f(new Size(intrinsicSize), StructuralEqualityPolicy.f14078a);
        this.drawableIntrinsicSize$delegate = f3;
        this.callback$delegate = f0.t(new DrawablePainter$callback$2(this));
        if (drawable.getIntrinsicWidth() < 0 || drawable.getIntrinsicHeight() < 0) {
            return;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    private final Drawable.Callback getCallback() {
        return (Drawable.Callback) this.callback$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDrawInvalidateTick() {
        return ((Number) this.drawInvalidateTick$delegate.getValue()).intValue();
    }

    /* renamed from: getDrawableIntrinsicSize-NH-jbRc, reason: not valid java name */
    private final long m586getDrawableIntrinsicSizeNHjbRc() {
        return ((Size) this.drawableIntrinsicSize$delegate.getValue()).f14923a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDrawInvalidateTick(int i2) {
        this.drawInvalidateTick$delegate.setValue(Integer.valueOf(i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setDrawableIntrinsicSize-uvyYCjk, reason: not valid java name */
    public final void m587setDrawableIntrinsicSizeuvyYCjk(long j2) {
        this.drawableIntrinsicSize$delegate.setValue(new Size(j2));
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyAlpha(float f2) {
        this.drawable.setAlpha(a.A(a.t0(f2 * 255), 0, 255));
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyColorFilter(@Nullable ColorFilter colorFilter) {
        this.drawable.setColorFilter(colorFilter != null ? colorFilter.f14965a : null);
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public boolean applyLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        int i2;
        a.s(layoutDirection, "layoutDirection");
        Drawable drawable = this.drawable;
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i2 = 0;
        }
        return drawable.setLayoutDirection(i2);
    }

    @NotNull
    public final Drawable getDrawable() {
        return this.drawable;
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    /* renamed from: getIntrinsicSize-NH-jbRc */
    public long mo2getIntrinsicSizeNHjbRc() {
        return m586getDrawableIntrinsicSizeNHjbRc();
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onAbandoned() {
        onForgotten();
    }

    @Override // androidx.compose.ui.graphics.painter.Painter
    public void onDraw(@NotNull DrawScope drawScope) {
        a.s(drawScope, "<this>");
        Canvas a2 = drawScope.A1().a();
        getDrawInvalidateTick();
        this.drawable.setBounds(0, 0, a.t0(Size.d(drawScope.b())), a.t0(Size.b(drawScope.b())));
        try {
            a2.p();
            this.drawable.draw(AndroidCanvas_androidKt.b(a2));
        } finally {
            a2.i();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onForgotten() {
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
        this.drawable.setVisible(false, false);
        this.drawable.setCallback(null);
    }

    @Override // androidx.compose.runtime.RememberObserver
    public void onRemembered() {
        this.drawable.setCallback(getCallback());
        this.drawable.setVisible(true, true);
        Object obj = this.drawable;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }
}
