package androidx.compose.material3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import b1.d0;
import d0.b0;
import java.util.UUID;
import kotlin.jvm.internal.r;
import q0.l;

@ExperimentalMaterial3Api
/* loaded from: classes.dex */
final class ModalBottomSheetDialogWrapper extends ComponentDialog implements ViewRootForInspector {

    /* renamed from: a, reason: collision with root package name */
    public q0.a f9805a;

    /* renamed from: b, reason: collision with root package name */
    public ModalBottomSheetProperties f9806b;

    /* renamed from: c, reason: collision with root package name */
    public final View f9807c;
    public final ModalBottomSheetDialogLayout d;

    /* renamed from: androidx.compose.material3.ModalBottomSheetDialogWrapper$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    final class AnonymousClass3 extends r implements l {
        public AnonymousClass3() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            ModalBottomSheetDialogWrapper modalBottomSheetDialogWrapper = ModalBottomSheetDialogWrapper.this;
            if (modalBottomSheetDialogWrapper.f9806b.f9933b) {
                modalBottomSheetDialogWrapper.f9805a.invoke();
            }
            return b0.f30125a;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
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
        }
    }

    public ModalBottomSheetDialogWrapper(q0.a aVar, ModalBottomSheetProperties modalBottomSheetProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid, Animatable animatable, d0 d0Var, boolean z2) {
        super(new ContextThemeWrapper(view.getContext(), com.cooldev.gba.emulator.gameboy.R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        this.f9805a = aVar;
        this.f9806b = modalBottomSheetProperties;
        this.f9807c = view;
        float f2 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.a(window, false);
        ModalBottomSheetDialogLayout modalBottomSheetDialogLayout = new ModalBottomSheetDialogLayout(getContext(), window, this.f9806b.f9933b, this.f9805a, animatable, d0Var);
        modalBottomSheetDialogLayout.setTag(com.cooldev.gba.emulator.gameboy.R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        modalBottomSheetDialogLayout.setClipChildren(false);
        modalBottomSheetDialogLayout.setElevation(density.y1(f2));
        modalBottomSheetDialogLayout.setOutlineProvider(new ViewOutlineProvider());
        this.d = modalBottomSheetDialogLayout;
        setContentView(modalBottomSheetDialogLayout);
        ViewTreeLifecycleOwner.b(modalBottomSheetDialogLayout, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(modalBottomSheetDialogLayout, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(modalBottomSheetDialogLayout, ViewTreeSavedStateRegistryOwner.a(view));
        c(this.f9805a, this.f9806b, layoutDirection);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(window.getDecorView(), window);
        boolean z3 = !z2;
        windowInsetsControllerCompat.f(z3);
        windowInsetsControllerCompat.e(z3);
        OnBackPressedDispatcherKt.a(getOnBackPressedDispatcher(), this, new AnonymousClass3());
    }

    public final void c(q0.a aVar, ModalBottomSheetProperties modalBottomSheetProperties, LayoutDirection layoutDirection) {
        this.f9805a = aVar;
        this.f9806b = modalBottomSheetProperties;
        SecureFlagPolicy secureFlagPolicy = modalBottomSheetProperties.f9932a;
        ViewGroup.LayoutParams layoutParams = this.f9807c.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i2 = 0;
        boolean z2 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int ordinal = secureFlagPolicy.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                z2 = true;
            } else {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                z2 = false;
            }
        }
        Window window = getWindow();
        p0.a.p(window);
        window.setFlags(z2 ? 8192 : -8193, 8192);
        int ordinal2 = layoutDirection.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                throw new RuntimeException();
            }
            i2 = 1;
        }
        this.d.setLayoutDirection(i2);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent) {
            this.f9805a.invoke();
        }
        return onTouchEvent;
    }
}
