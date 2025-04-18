package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.DynamicProvidableCompositionLocal;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntRectKt;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.cooldev.gba.emulator.gameboy.R;
import java.util.UUID;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@StabilityInferred
@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector {
    public boolean A;
    public final int[] B;

    /* renamed from: j, reason: collision with root package name */
    public q0.a f17678j;

    /* renamed from: k, reason: collision with root package name */
    public PopupProperties f17679k;

    /* renamed from: l, reason: collision with root package name */
    public String f17680l;

    /* renamed from: m, reason: collision with root package name */
    public final View f17681m;

    /* renamed from: n, reason: collision with root package name */
    public final PopupLayoutHelper f17682n;

    /* renamed from: o, reason: collision with root package name */
    public final WindowManager f17683o;

    /* renamed from: p, reason: collision with root package name */
    public final WindowManager.LayoutParams f17684p;

    /* renamed from: q, reason: collision with root package name */
    public PopupPositionProvider f17685q;

    /* renamed from: r, reason: collision with root package name */
    public LayoutDirection f17686r;

    /* renamed from: s, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17687s;

    /* renamed from: t, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17688t;

    /* renamed from: u, reason: collision with root package name */
    public IntRect f17689u;

    /* renamed from: v, reason: collision with root package name */
    public final State f17690v;
    public final Rect w;
    public final SnapshotStateObserver x;

    /* renamed from: y, reason: collision with root package name */
    public Object f17691y;

    /* renamed from: z, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f17692z;

    /* renamed from: androidx.compose.ui.window.PopupLayout$2, reason: invalid class name */
    /* loaded from: classes3.dex */
    public final class AnonymousClass2 extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
    }

    /* loaded from: classes2.dex */
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.window.PopupLayoutHelper] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public PopupLayout(q0.a aVar, PopupProperties popupProperties, String str, View view, Density density, PopupPositionProvider popupPositionProvider, UUID uuid) {
        super(view.getContext());
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        ParcelableSnapshotMutableState f4;
        ?? obj = Build.VERSION.SDK_INT >= 29 ? new Object() : new Object();
        this.f17678j = aVar;
        this.f17679k = popupProperties;
        this.f17680l = str;
        this.f17681m = view;
        this.f17682n = obj;
        Object systemService = view.getContext().getSystemService("window");
        p0.a.q(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f17683o = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        PopupProperties popupProperties2 = this.f17679k;
        boolean b2 = AndroidPopup_androidKt.b(view);
        boolean z2 = popupProperties2.f17703b;
        int i2 = popupProperties2.f17702a;
        if (z2 && b2) {
            i2 |= 8192;
        } else if (z2 && !b2) {
            i2 &= -8193;
        }
        layoutParams.flags = i2;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f17684p = layoutParams;
        this.f17685q = popupPositionProvider;
        this.f17686r = LayoutDirection.f17494a;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f17687s = f2;
        f3 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.f17688t = f3;
        this.f17690v = SnapshotStateKt.e(new PopupLayout$canCalculatePosition$2(this));
        this.w = new Rect();
        this.x = new SnapshotStateObserver(new PopupLayout$snapshotStateObserver$1(this));
        setId(android.R.id.content);
        ViewTreeLifecycleOwner.b(this, ViewTreeLifecycleOwner.a(view));
        ViewTreeViewModelStoreOwner.b(this, ViewTreeViewModelStoreOwner.a(view));
        ViewTreeSavedStateRegistryOwner.b(this, ViewTreeSavedStateRegistryOwner.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(density.y1((float) 8));
        setOutlineProvider(new ViewOutlineProvider());
        f4 = SnapshotStateKt.f(ComposableSingletons$AndroidPopup_androidKt.f17662a, StructuralEqualityPolicy.f14078a);
        this.f17692z = f4;
        this.B = new int[2];
    }

    private final p getContent() {
        return (p) this.f17692z.getValue();
    }

    private final int getDisplayHeight() {
        return Math.round(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return Math.round(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    @VisibleForTesting
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates getParentLayoutCoordinates() {
        return (LayoutCoordinates) this.f17688t.getValue();
    }

    private final void setContent(p pVar) {
        this.f17692z.setValue(pVar);
    }

    private final void setParentLayoutCoordinates(LayoutCoordinates layoutCoordinates) {
        this.f17688t.setValue(layoutCoordinates);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void a(Composer composer, int i2) {
        int i3;
        ComposerImpl g2 = composer.g(-857613600);
        if ((i2 & 6) == 0) {
            i3 = (g2.w(this) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 3) == 2 && g2.i()) {
            g2.A();
        } else {
            getContent().invoke(g2, 0);
        }
        RecomposeScopeImpl Z = g2.Z();
        if (Z != null) {
            Z.d = new PopupLayout$Content$4(this, i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f17679k.f17704c) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                q0.a aVar = this.f17678j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void f(int i2, int i3, int i4, int i5, boolean z2) {
        View childAt;
        super.f(i2, i3, i4, i5, z2);
        if (this.f17679k.f17705f || (childAt = getChildAt(0)) == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.f17684p;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f17682n.a(this.f17683o, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void g(int i2, int i3) {
        if (this.f17679k.f17705f) {
            super.g(i2, i3);
        } else {
            super.g(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f17690v.getValue()).booleanValue();
    }

    @NotNull
    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f17684p;
    }

    @NotNull
    public final LayoutDirection getParentLayoutDirection() {
        return this.f17686r;
    }

    @Nullable
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m5getPopupContentSizebOM6tXw() {
        return (IntSize) this.f17687s.getValue();
    }

    @NotNull
    public final PopupPositionProvider getPositionProvider() {
        return this.f17685q;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A;
    }

    @NotNull
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    @NotNull
    public final String getTestTag() {
        return this.f17680l;
    }

    @Nullable
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void j(CompositionContext compositionContext, p pVar) {
        setParentCompositionContext(compositionContext);
        setContent(pVar);
        this.A = true;
    }

    public final void k(q0.a aVar, PopupProperties popupProperties, String str, LayoutDirection layoutDirection) {
        int i2;
        this.f17678j = aVar;
        this.f17680l = str;
        if (!p0.a.g(this.f17679k, popupProperties)) {
            boolean z2 = popupProperties.f17705f;
            WindowManager.LayoutParams layoutParams = this.f17684p;
            if (z2 && !this.f17679k.f17705f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.f17679k = popupProperties;
            boolean b2 = AndroidPopup_androidKt.b(this.f17681m);
            boolean z3 = popupProperties.f17703b;
            int i3 = popupProperties.f17702a;
            if (z3 && b2) {
                i3 |= 8192;
            } else if (z3 && !b2) {
                i3 &= -8193;
            }
            layoutParams.flags = i3;
            this.f17682n.a(this.f17683o, this, layoutParams);
        }
        int ordinal = layoutDirection.ordinal();
        if (ordinal != 0) {
            i2 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i2 = 0;
        }
        super.setLayoutDirection(i2);
    }

    public final void l() {
        LayoutCoordinates parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.B()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long a2 = parentLayoutCoordinates.a();
            long M = parentLayoutCoordinates.M(0L);
            IntRect a3 = IntRectKt.a(IntOffsetKt.a(Math.round(Offset.g(M)), Math.round(Offset.h(M))), a2);
            if (p0.a.g(a3, this.f17689u)) {
                return;
            }
            this.f17689u = a3;
            n();
        }
    }

    public final void m(LayoutCoordinates layoutCoordinates) {
        setParentLayoutCoordinates(layoutCoordinates);
        l();
    }

    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.jvm.internal.e0, java.lang.Object] */
    public final void n() {
        IntSize m5getPopupContentSizebOM6tXw;
        IntRect intRect = this.f17689u;
        if (intRect == null || (m5getPopupContentSizebOM6tXw = m5getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j2 = m5getPopupContentSizebOM6tXw.f17493a;
        PopupLayoutHelper popupLayoutHelper = this.f17682n;
        Rect rect = this.w;
        popupLayoutHelper.b(rect, this.f17681m);
        DynamicProvidableCompositionLocal dynamicProvidableCompositionLocal = AndroidPopup_androidKt.f17615a;
        IntRect intRect2 = new IntRect(rect.left, rect.top, rect.right, rect.bottom);
        long a2 = IntSizeKt.a(intRect2.c(), intRect2.b());
        ?? obj = new Object();
        obj.f30927a = 0L;
        this.x.e(this, PopupLayout$Companion$onCommitAffectingPopupPosition$1.f17693a, new PopupLayout$updatePosition$1(obj, this, intRect, a2, j2));
        WindowManager.LayoutParams layoutParams = this.f17684p;
        long j3 = obj.f30927a;
        layoutParams.x = (int) (j3 >> 32);
        layoutParams.y = (int) (j3 & 4294967295L);
        if (this.f17679k.e) {
            popupLayoutHelper.c(this, (int) (a2 >> 32), (int) (a2 & 4294967295L));
        }
        popupLayoutHelper.a(this.f17683o, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        SnapshotStateObserver snapshotStateObserver = this.x;
        snapshotStateObserver.f14602g = Snapshot.Companion.e(snapshotStateObserver.d);
        if (!this.f17679k.f17704c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f17691y == null) {
            this.f17691y = Api33Impl.a(this.f17678j);
        }
        Api33Impl.b(this, this.f17691y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = this.x;
        androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.f14602g;
        if (aVar != null) {
            aVar.dispose();
        }
        snapshotStateObserver.b();
        if (Build.VERSION.SDK_INT >= 33) {
            Api33Impl.c(this, this.f17691y);
        }
        this.f17691y = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f17679k.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            q0.a aVar = this.f17678j;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        q0.a aVar2 = this.f17678j;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
    }

    public final void setParentLayoutDirection(@NotNull LayoutDirection layoutDirection) {
        this.f17686r = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m6setPopupContentSizefhxjrPA(@Nullable IntSize intSize) {
        this.f17687s.setValue(intSize);
    }

    public final void setPositionProvider(@NotNull PopupPositionProvider popupPositionProvider) {
        this.f17685q = popupPositionProvider;
    }

    public final void setTestTag(@NotNull String str) {
        this.f17680l = str;
    }
}
