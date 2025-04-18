package androidx.compose.material3;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.DialogWindowProvider;
import b1.d0;
import kotlin.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

/* loaded from: classes2.dex */
final class ModalBottomSheetDialogLayout extends AbstractComposeView implements DialogWindowProvider {

    /* renamed from: j, reason: collision with root package name */
    public final Window f9784j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f9785k;

    /* renamed from: l, reason: collision with root package name */
    public final q0.a f9786l;

    /* renamed from: m, reason: collision with root package name */
    public final Animatable f9787m;

    /* renamed from: n, reason: collision with root package name */
    public final d0 f9788n;

    /* renamed from: o, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f9789o;

    /* renamed from: p, reason: collision with root package name */
    public Object f9790p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9791q;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api33Impl {
        @DoNotInline
        @NotNull
        public static final OnBackInvokedCallback a(@NotNull final q0.a aVar) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.c
                public final void onBackInvoked() {
                    q0.a.this.invoke();
                }
            };
        }

        @DoNotInline
        public static final void b(@NotNull View view, @Nullable Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
        }

        @DoNotInline
        public static final void c(@NotNull View view, @Nullable Object obj) {
            OnBackInvokedDispatcher findOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static final class Api34Impl {
        @DoNotInline
        @NotNull
        public static final OnBackAnimationCallback a(@NotNull final q0.a aVar, @NotNull final Animatable<Float, AnimationVector1D> animatable, @NotNull final d0 d0Var) {
            return new OnBackAnimationCallback() { // from class: androidx.compose.material3.ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1
                public final void onBackCancelled() {
                    e.v(d0Var, null, 0, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackCancelled$1(animatable, null), 3);
                }

                public final void onBackInvoked() {
                    aVar.invoke();
                }

                public final void onBackProgressed(BackEvent backEvent) {
                    e.v(d0Var, null, 0, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackProgressed$1(animatable, backEvent, null), 3);
                }

                public final void onBackStarted(BackEvent backEvent) {
                    e.v(d0Var, null, 0, new ModalBottomSheetDialogLayout$Api34Impl$createBackCallback$1$onBackStarted$1(animatable, backEvent, null), 3);
                }
            };
        }
    }

    public ModalBottomSheetDialogLayout(Context context, Window window, boolean z2, q0.a aVar, Animatable animatable, d0 d0Var) {
        super(context);
        ParcelableSnapshotMutableState f2;
        this.f9784j = window;
        this.f9785k = z2;
        this.f9786l = aVar;
        this.f9787m = animatable;
        this.f9788n = d0Var;
        f2 = SnapshotStateKt.f(ComposableSingletons$ModalBottomSheet_androidKt.f8618b, StructuralEqualityPolicy.f14078a);
        this.f9789o = f2;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(576708319);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            ((p) this.f9789o.getValue()).invoke(g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new ModalBottomSheetDialogLayout$Content$4(this, i2);
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f9791q;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public final Window getWindow() {
        return this.f9784j;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        int i2;
        super.onAttachedToWindow();
        if (!this.f9785k || (i2 = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        if (this.f9790p == null) {
            q0.a aVar = this.f9786l;
            this.f9790p = i2 >= 34 ? androidx.activity.e.m(Api34Impl.a(aVar, this.f9787m, this.f9788n)) : Api33Impl.a(aVar);
        }
        Api33Impl.b(this, this.f9790p);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.c(this, this.f9790p);
        }
        this.f9790p = null;
    }
}
