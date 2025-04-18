package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.core.view.ViewKt;
import androidx.customview.poolingcontainer.PoolingContainer;
import androidx.customview.poolingcontainer.PoolingContainerListener;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import com.cooldev.gba.emulator.gameboy.R;

/* loaded from: classes.dex */
public interface ViewCompositionStrategy {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f16604a = 0;

    /* loaded from: classes.dex */
    public static final class Companion {
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindow implements ViewCompositionStrategy {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final q0.a a(final AbstractComposeView abstractComposeView) {
            ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    AbstractComposeView.this.d();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindow$installFor$1(abstractComposeView, r02);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DisposeOnDetachedFromWindowOrReleasedFromPool implements ViewCompositionStrategy {

        /* renamed from: b, reason: collision with root package name */
        public static final DisposeOnDetachedFromWindowOrReleasedFromPool f16608b = new Object();

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View$OnAttachStateChangeListener, androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1] */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.n] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final q0.a a(final AbstractComposeView abstractComposeView) {
            ?? r02 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$listener$1
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                    p0.a.s(abstractComposeView2, "<this>");
                    for (Object obj : ViewKt.b(abstractComposeView2)) {
                        if (obj instanceof View) {
                            View view2 = (View) obj;
                            p0.a.s(view2, "<this>");
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null && bool.booleanValue()) {
                                return;
                            }
                        }
                    }
                    abstractComposeView2.d();
                }
            };
            abstractComposeView.addOnAttachStateChangeListener(r02);
            ?? r1 = new PoolingContainerListener() { // from class: androidx.compose.ui.platform.n
                @Override // androidx.customview.poolingcontainer.PoolingContainerListener
                public final void a() {
                    AbstractComposeView.this.d();
                }
            };
            PoolingContainer.a(abstractComposeView, r1);
            return new ViewCompositionStrategy$DisposeOnDetachedFromWindowOrReleasedFromPool$installFor$1(abstractComposeView, r02, r1);
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DisposeOnLifecycleDestroyed implements ViewCompositionStrategy {
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final q0.a a(AbstractComposeView abstractComposeView) {
            ViewCompositionStrategy_androidKt.a(abstractComposeView, null);
            throw null;
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class DisposeOnViewTreeLifecycleDestroyed implements ViewCompositionStrategy {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.internal.f0] */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1, android.view.View$OnAttachStateChangeListener] */
        @Override // androidx.compose.ui.platform.ViewCompositionStrategy
        public final q0.a a(final AbstractComposeView abstractComposeView) {
            if (!abstractComposeView.isAttachedToWindow()) {
                final ?? obj = new Object();
                ?? r1 = new View.OnAttachStateChangeListener() { // from class: androidx.compose.ui.platform.ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$listener$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewAttachedToWindow(View view) {
                        AbstractComposeView abstractComposeView2 = AbstractComposeView.this;
                        LifecycleOwner a2 = ViewTreeLifecycleOwner.a(abstractComposeView2);
                        if (a2 != null) {
                            obj.f30930a = ViewCompositionStrategy_androidKt.a(abstractComposeView2, a2.getLifecycle());
                            abstractComposeView2.removeOnAttachStateChangeListener(this);
                        } else {
                            InlineClassHelperKt.c("View tree for " + abstractComposeView2 + " has no ViewTreeLifecycleOwner");
                            throw null;
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public final void onViewDetachedFromWindow(View view) {
                    }
                };
                abstractComposeView.addOnAttachStateChangeListener(r1);
                obj.f30930a = new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$1(abstractComposeView, r1);
                return new ViewCompositionStrategy$DisposeOnViewTreeLifecycleDestroyed$installFor$2(obj);
            }
            LifecycleOwner a2 = ViewTreeLifecycleOwner.a(abstractComposeView);
            if (a2 != null) {
                return ViewCompositionStrategy_androidKt.a(abstractComposeView, a2.getLifecycle());
            }
            InlineClassHelperKt.c("View tree for " + abstractComposeView + " has no ViewTreeLifecycleOwner");
            throw null;
        }
    }

    q0.a a(AbstractComposeView abstractComposeView);
}
