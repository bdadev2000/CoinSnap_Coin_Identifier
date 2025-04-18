package androidx.compose.ui.window;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import androidx.activity.ComponentDialog;
import androidx.activity.OnBackPressedDispatcherKt;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.WindowCompat;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.cooldev.gba.emulator.gameboy.R;
import d0.b0;
import java.util.UUID;
import kotlin.jvm.internal.r;
import q0.l;

/* loaded from: classes.dex */
final class DialogWrapper extends ComponentDialog implements ViewRootForInspector {

    /* renamed from: a, reason: collision with root package name */
    public q0.a f17673a;

    /* renamed from: b, reason: collision with root package name */
    public DialogProperties f17674b;

    /* renamed from: c, reason: collision with root package name */
    public final View f17675c;
    public final DialogLayout d;

    /* renamed from: f, reason: collision with root package name */
    public final int f17676f;

    /* renamed from: androidx.compose.ui.window.DialogWrapper$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    final class AnonymousClass2 extends r implements l {
        public AnonymousClass2() {
            super(1);
        }

        @Override // q0.l
        public final Object invoke(Object obj) {
            DialogWrapper dialogWrapper = DialogWrapper.this;
            if (dialogWrapper.f17674b.f17670a) {
                dialogWrapper.f17673a.invoke();
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

    public DialogWrapper(q0.a aVar, DialogProperties dialogProperties, View view, LayoutDirection layoutDirection, Density density, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), (Build.VERSION.SDK_INT >= 31 || dialogProperties.e) ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f17673a = aVar;
        this.f17674b = dialogProperties;
        this.f17675c = view;
        float f2 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window".toString());
        }
        this.f17676f = window.getAttributes().softInputMode & 240;
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        WindowCompat.a(window, this.f17674b.e);
        DialogLayout dialogLayout = new DialogLayout(getContext(), window);
        dialogLayout.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        dialogLayout.setClipChildren(false);
        dialogLayout.setElevation(density.y1(f2));
        dialogLayout.setOutlineProvider(new ViewOutlineProvider());
        this.d = dialogLayout;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            c(viewGroup);
        }
        setContentView(dialogLayout);
        ViewTreeLifecycleOwner.b(dialogLayout, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(dialogLayout, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(dialogLayout, ViewTreeSavedStateRegistryOwner.a(view));
        d(this.f17673a, this.f17674b, layoutDirection);
        OnBackPressedDispatcherKt.a(getOnBackPressedDispatcher(), this, new AnonymousClass2());
    }

    public static final void c(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof DialogLayout) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                c(viewGroup2);
            }
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }

    public final void d(q0.a aVar, DialogProperties dialogProperties, LayoutDirection layoutDirection) {
        Window window;
        this.f17673a = aVar;
        this.f17674b = dialogProperties;
        SecureFlagPolicy secureFlagPolicy = dialogProperties.f17672c;
        boolean b2 = AndroidPopup_androidKt.b(this.f17675c);
        int ordinal = secureFlagPolicy.ordinal();
        int i2 = 0;
        if (ordinal != 0) {
            if (ordinal == 1) {
                b2 = true;
            } else {
                if (ordinal != 2) {
                    throw new RuntimeException();
                }
                b2 = false;
            }
        }
        Window window2 = getWindow();
        p0.a.p(window2);
        window2.setFlags(b2 ? 8192 : -8193, 8192);
        int ordinal2 = layoutDirection.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                throw new RuntimeException();
            }
            i2 = 1;
        }
        DialogLayout dialogLayout = this.d;
        dialogLayout.setLayoutDirection(i2);
        boolean z2 = dialogProperties.d;
        if (z2 && !dialogLayout.f17666l && (window = getWindow()) != null) {
            window.setLayout(-2, -2);
        }
        dialogLayout.f17666l = z2;
        if (Build.VERSION.SDK_INT < 31) {
            if (dialogProperties.e) {
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setSoftInputMode(this.f17676f);
                    return;
                }
                return;
            }
            Window window4 = getWindow();
            if (window4 != null) {
                window4.setSoftInputMode(16);
            }
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (onTouchEvent && this.f17674b.f17671b) {
            this.f17673a.invoke();
        }
        return onTouchEvent;
    }
}
