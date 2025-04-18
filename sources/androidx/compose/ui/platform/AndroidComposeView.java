package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Build;
import android.os.Trace;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import androidx.annotation.VisibleForTesting;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StructuralEqualityPolicy;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotStateObserver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.SessionMutex;
import androidx.compose.ui.autofill.AndroidAutofill;
import androidx.compose.ui.autofill.Autofill;
import androidx.compose.ui.autofill.AutofillApi23Helper;
import androidx.compose.ui.autofill.AutofillApi26Helper;
import androidx.compose.ui.autofill.AutofillCallback;
import androidx.compose.ui.autofill.AutofillNode;
import androidx.compose.ui.autofill.AutofillTree;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.draganddrop.DragAndDropManager;
import androidx.compose.ui.focus.FocusDirection;
import androidx.compose.ui.focus.FocusInteropUtils_androidKt;
import androidx.compose.ui.focus.FocusOwner;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidCanvas;
import androidx.compose.ui.graphics.AndroidGraphicsContext_androidKt;
import androidx.compose.ui.graphics.CanvasHolder;
import androidx.compose.ui.graphics.GraphicsContext;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.input.InputMode;
import androidx.compose.ui.input.InputModeManager;
import androidx.compose.ui.input.InputModeManagerImpl;
import androidx.compose.ui.input.key.KeyInputModifierKt;
import androidx.compose.ui.input.pointer.MotionEventAdapter;
import androidx.compose.ui.input.pointer.PointerIcon;
import androidx.compose.ui.input.pointer.PointerIconService;
import androidx.compose.ui.input.pointer.PointerIcon_androidKt;
import androidx.compose.ui.input.pointer.PointerInputEvent;
import androidx.compose.ui.input.pointer.PointerInputEventData;
import androidx.compose.ui.input.pointer.PointerInputEventProcessor;
import androidx.compose.ui.input.pointer.PointerKeyboardModifiers;
import androidx.compose.ui.input.pointer.PositionCalculator;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode;
import androidx.compose.ui.input.rotary.RotaryInputModifierKt;
import androidx.compose.ui.input.rotary.RotaryScrollEvent;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.RootMeasurePolicy;
import androidx.compose.ui.modifier.ModifierLocalManager;
import androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$3;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetsForDifferentPasses;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.LayoutNodeLayoutDelegate;
import androidx.compose.ui.node.LookaheadAlignmentLines;
import androidx.compose.ui.node.MeasureAndLayoutDelegate;
import androidx.compose.ui.node.OwnedLayer;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.PointerInputModifierNode;
import androidx.compose.ui.node.RootForTest;
import androidx.compose.ui.platform.ViewLayer;
import androidx.compose.ui.scrollcapture.ScrollCapture;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.compose.ui.semantics.SemanticsOwner;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyResolver_androidKt;
import androidx.compose.ui.text.input.TextInputService;
import androidx.compose.ui.text.input.TextInputServiceAndroid;
import androidx.compose.ui.unit.AndroidDensity_androidKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffsetKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import com.google.android.gms.common.api.Api;
import com.google.common.primitives.Ints;
import d0.b0;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.internal.a0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred
/* loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements Owner, ViewRootForTest, PositionCalculator, DefaultLifecycleObserver {
    public static Class C0;
    public static Method D0;
    public q0.l A;
    public final ScrollCapture A0;
    public final AndroidAutofill B;
    public final AndroidComposeView$pointerIconService$1 B0;
    public boolean C;
    public final AndroidClipboardManager D;
    public final OwnerSnapshotObserver E;
    public boolean F;
    public AndroidViewsHandler G;
    public DrawChildContainer H;
    public Constraints I;
    public boolean J;
    public final MeasureAndLayoutDelegate K;
    public final AndroidViewConfiguration L;
    public long M;
    public final int[] N;
    public final float[] O;
    public final float[] P;
    public final float[] Q;
    public long R;
    public boolean S;
    public long T;
    public boolean U;
    public final ParcelableSnapshotMutableState V;
    public final State W;

    /* renamed from: a, reason: collision with root package name */
    public long f16192a;

    /* renamed from: a0, reason: collision with root package name */
    public q0.l f16193a0;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f16194b;

    /* renamed from: b0, reason: collision with root package name */
    public final b f16195b0;

    /* renamed from: c, reason: collision with root package name */
    public final LayoutNodeDrawScope f16196c;

    /* renamed from: c0, reason: collision with root package name */
    public final c f16197c0;
    public final ParcelableSnapshotMutableState d;

    /* renamed from: d0, reason: collision with root package name */
    public final d f16198d0;

    /* renamed from: e0, reason: collision with root package name */
    public final TextInputServiceAndroid f16199e0;

    /* renamed from: f, reason: collision with root package name */
    public final FocusOwnerImpl f16200f;

    /* renamed from: f0, reason: collision with root package name */
    public final TextInputService f16201f0;

    /* renamed from: g, reason: collision with root package name */
    public h0.l f16202g;

    /* renamed from: g0, reason: collision with root package name */
    public final AtomicReference f16203g0;

    /* renamed from: h, reason: collision with root package name */
    public final DragAndDropManager f16204h;

    /* renamed from: h0, reason: collision with root package name */
    public final DelegatingSoftwareKeyboardController f16205h0;

    /* renamed from: i, reason: collision with root package name */
    public final WindowInfoImpl f16206i;

    /* renamed from: i0, reason: collision with root package name */
    public final AndroidFontResourceLoader f16207i0;

    /* renamed from: j, reason: collision with root package name */
    public final Modifier f16208j;

    /* renamed from: j0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f16209j0;

    /* renamed from: k, reason: collision with root package name */
    public final Modifier f16210k;

    /* renamed from: k0, reason: collision with root package name */
    public int f16211k0;

    /* renamed from: l, reason: collision with root package name */
    public final CanvasHolder f16212l;

    /* renamed from: l0, reason: collision with root package name */
    public final ParcelableSnapshotMutableState f16213l0;

    /* renamed from: m, reason: collision with root package name */
    public final LayoutNode f16214m;

    /* renamed from: m0, reason: collision with root package name */
    public final PlatformHapticFeedback f16215m0;

    /* renamed from: n, reason: collision with root package name */
    public final AndroidComposeView f16216n;

    /* renamed from: n0, reason: collision with root package name */
    public final InputModeManagerImpl f16217n0;

    /* renamed from: o, reason: collision with root package name */
    public final SemanticsOwner f16218o;

    /* renamed from: o0, reason: collision with root package name */
    public final ModifierLocalManager f16219o0;

    /* renamed from: p, reason: collision with root package name */
    public final AndroidComposeViewAccessibilityDelegateCompat f16220p;

    /* renamed from: p0, reason: collision with root package name */
    public final AndroidTextToolbar f16221p0;

    /* renamed from: q, reason: collision with root package name */
    public AndroidContentCaptureManager f16222q;

    /* renamed from: q0, reason: collision with root package name */
    public MotionEvent f16223q0;

    /* renamed from: r, reason: collision with root package name */
    public final AndroidAccessibilityManager f16224r;

    /* renamed from: r0, reason: collision with root package name */
    public long f16225r0;

    /* renamed from: s, reason: collision with root package name */
    public final GraphicsContext f16226s;

    /* renamed from: s0, reason: collision with root package name */
    public final WeakCache f16227s0;

    /* renamed from: t, reason: collision with root package name */
    public final AutofillTree f16228t;

    /* renamed from: t0, reason: collision with root package name */
    public final MutableVector f16229t0;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f16230u;

    /* renamed from: u0, reason: collision with root package name */
    public final AndroidComposeView$resendMotionEventRunnable$1 f16231u0;

    /* renamed from: v, reason: collision with root package name */
    public ArrayList f16232v;

    /* renamed from: v0, reason: collision with root package name */
    public final e f16233v0;
    public boolean w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f16234w0;
    public boolean x;

    /* renamed from: x0, reason: collision with root package name */
    public final q0.a f16235x0;

    /* renamed from: y, reason: collision with root package name */
    public final MotionEventAdapter f16236y;

    /* renamed from: y0, reason: collision with root package name */
    public final CalculateMatrixToWindow f16237y0;

    /* renamed from: z, reason: collision with root package name */
    public final PointerInputEventProcessor f16238z;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f16239z0;

    /* loaded from: classes.dex */
    public static final class Companion {
        public static final boolean a() {
            Class cls = AndroidComposeView.C0;
            try {
                if (AndroidComposeView.C0 == null) {
                    Class<?> cls2 = Class.forName("android.os.SystemProperties");
                    AndroidComposeView.C0 = cls2;
                    AndroidComposeView.D0 = cls2.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                }
                Method method = AndroidComposeView.D0;
                Object invoke = method != null ? method.invoke(null, "debug.layout", Boolean.FALSE) : null;
                Boolean bool = invoke instanceof Boolean ? (Boolean) invoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }
    }

    @StabilityInferred
    /* loaded from: classes.dex */
    public static final class ViewTreeOwners {

        /* renamed from: a, reason: collision with root package name */
        public final LifecycleOwner f16240a;

        /* renamed from: b, reason: collision with root package name */
        public final SavedStateRegistryOwner f16241b;

        public ViewTreeOwners(LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner) {
            this.f16240a = lifecycleOwner;
            this.f16241b = savedStateRegistryOwner;
        }
    }

    /* JADX WARN: Type inference failed for: r0v38, types: [androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1] */
    /* JADX WARN: Type inference failed for: r0v42, types: [androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1] */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.semantics.EmptySemanticsModifier] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.n, q0.l] */
    /* JADX WARN: Type inference failed for: r13v1, types: [q0.q, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r14v0, types: [q0.p, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r14v1, types: [q0.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.internal.n, q0.l] */
    /* JADX WARN: Type inference failed for: r16v0, types: [q0.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r17v0, types: [q0.a, kotlin.jvm.internal.n] */
    /* JADX WARN: Type inference failed for: r3v15, types: [androidx.compose.ui.platform.b] */
    /* JADX WARN: Type inference failed for: r3v16, types: [androidx.compose.ui.platform.c] */
    /* JADX WARN: Type inference failed for: r3v17, types: [androidx.compose.ui.platform.d] */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object, androidx.compose.ui.platform.AndroidFontResourceLoader] */
    /* JADX WARN: Type inference failed for: r6v5, types: [q0.a, kotlin.jvm.internal.a0] */
    public AndroidComposeView(Context context, h0.l lVar) {
        super(context);
        ParcelableSnapshotMutableState f2;
        ParcelableSnapshotMutableState f3;
        this.f16192a = 9205357640488583168L;
        int i2 = 1;
        this.f16194b = true;
        this.f16196c = new LayoutNodeDrawScope();
        this.d = SnapshotStateKt.f(AndroidDensity_androidKt.a(context), SnapshotStateKt.j());
        ?? node = new Modifier.Node();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(node);
        this.f16200f = new FocusOwnerImpl(new kotlin.jvm.internal.n(1, this, AndroidComposeView.class, "registerOnEndApplyChangesListener", "registerOnEndApplyChangesListener(Lkotlin/jvm/functions/Function0;)V", 0), new kotlin.jvm.internal.n(2, this, AndroidComposeView.class, "onRequestFocusForOwner", "onRequestFocusForOwner-7o62pno(Landroidx/compose/ui/focus/FocusDirection;Landroidx/compose/ui/geometry/Rect;)Z", 0), new kotlin.jvm.internal.n(1, this, AndroidComposeView.class, "onMoveFocusInChildren", "onMoveFocusInChildren-3ESFkO8(I)Z", 0), new kotlin.jvm.internal.n(0, this, AndroidComposeView.class, "onClearFocusForOwner", "onClearFocusForOwner()V", 0), new kotlin.jvm.internal.n(0, this, AndroidComposeView.class, "onFetchFocusRect", "onFetchFocusRect()Landroidx/compose/ui/geometry/Rect;", 0), new a0(this, AndroidComposeView.class, "layoutDirection", "getLayoutDirection()Landroidx/compose/ui/unit/LayoutDirection;", 0));
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new kotlin.jvm.internal.n(3, this, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0));
        this.f16202g = lVar;
        this.f16204h = dragAndDropModifierOnDragListener;
        this.f16206i = new WindowInfoImpl();
        Modifier a2 = KeyInputModifierKt.a(Modifier.Companion.f14687a, new AndroidComposeView$keyInputModifier$1(this));
        this.f16208j = a2;
        Modifier a3 = RotaryInputModifierKt.a(AndroidComposeView$rotaryInputModifier$1.f16260a);
        this.f16210k = a3;
        this.f16212l = new CanvasHolder();
        LayoutNode layoutNode = new LayoutNode(false, 3, 0);
        layoutNode.i(RootMeasurePolicy.f15833b);
        layoutNode.k(getDensity());
        layoutNode.j(emptySemanticsElement.T0(a3).T0(a2).T0(getFocusOwner().i()).T0(dragAndDropModifierOnDragListener.d));
        this.f16214m = layoutNode;
        this.f16216n = this;
        this.f16218o = new SemanticsOwner(getRoot(), node);
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = new AndroidComposeViewAccessibilityDelegateCompat(this);
        this.f16220p = androidComposeViewAccessibilityDelegateCompat;
        this.f16222q = new AndroidContentCaptureManager(this, new kotlin.jvm.internal.n(0, this, AndroidComposeView_androidKt.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1));
        this.f16224r = new AndroidAccessibilityManager(context);
        this.f16226s = AndroidGraphicsContext_androidKt.a(this);
        this.f16228t = new AutofillTree();
        this.f16230u = new ArrayList();
        this.f16236y = new MotionEventAdapter();
        this.f16238z = new PointerInputEventProcessor(getRoot());
        this.A = AndroidComposeView$configurationChangeObserver$1.f16246a;
        this.B = new AndroidAutofill(this, getAutofillTree());
        this.D = new AndroidClipboardManager(context);
        this.E = new OwnerSnapshotObserver(new AndroidComposeView$snapshotObserver$1(this));
        this.K = new MeasureAndLayoutDelegate(getRoot());
        this.L = new AndroidViewConfiguration(android.view.ViewConfiguration.get(context));
        this.M = IntOffsetKt.a(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER);
        this.N = new int[]{0, 0};
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.O = fArr;
        this.P = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.Q = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        this.R = -1L;
        this.T = 9187343241974906880L;
        this.U = true;
        f2 = SnapshotStateKt.f(null, StructuralEqualityPolicy.f14078a);
        this.V = f2;
        this.W = SnapshotStateKt.e(new AndroidComposeView$viewTreeOwners$2(this));
        this.f16195b0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: androidx.compose.ui.platform.b
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                Class cls = AndroidComposeView.C0;
                AndroidComposeView.this.R();
            }
        };
        this.f16197c0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: androidx.compose.ui.platform.c
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                Class cls = AndroidComposeView.C0;
                AndroidComposeView.this.R();
            }
        };
        this.f16198d0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: androidx.compose.ui.platform.d
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z2) {
                InputModeManagerImpl inputModeManagerImpl = AndroidComposeView.this.f16217n0;
                int i3 = z2 ? 1 : 2;
                inputModeManagerImpl.getClass();
                inputModeManagerImpl.f15499a.setValue(new InputMode(i3));
            }
        };
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(getView(), this);
        this.f16199e0 = textInputServiceAndroid;
        this.f16201f0 = new TextInputService(textInputServiceAndroid);
        this.f16203g0 = new AtomicReference(null);
        this.f16205h0 = new DelegatingSoftwareKeyboardController(getTextInputService());
        this.f16207i0 = new Object();
        this.f16209j0 = SnapshotStateKt.f(FontFamilyResolver_androidKt.a(context), SnapshotStateKt.j());
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = Build.VERSION.SDK_INT;
        this.f16211k0 = i3 >= 31 ? configuration.fontWeightAdjustment : 0;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        LayoutDirection layoutDirection2 = LayoutDirection.f17494a;
        LayoutDirection layoutDirection3 = layoutDirection != 0 ? layoutDirection != 1 ? null : LayoutDirection.f17495b : layoutDirection2;
        f3 = SnapshotStateKt.f(layoutDirection3 != null ? layoutDirection3 : layoutDirection2, StructuralEqualityPolicy.f14078a);
        this.f16213l0 = f3;
        this.f16215m0 = new PlatformHapticFeedback(this);
        this.f16217n0 = new InputModeManagerImpl(isInTouchMode() ? 1 : 2);
        this.f16219o0 = new ModifierLocalManager(this);
        this.f16221p0 = new AndroidTextToolbar(this);
        this.f16227s0 = new WeakCache();
        this.f16229t0 = new MutableVector(new q0.a[16]);
        this.f16231u0 = new Runnable() { // from class: androidx.compose.ui.platform.AndroidComposeView$resendMotionEventRunnable$1
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.removeCallbacks(this);
                MotionEvent motionEvent = androidComposeView.f16223q0;
                if (motionEvent != null) {
                    boolean z2 = motionEvent.getToolType(0) == 3;
                    int actionMasked = motionEvent.getActionMasked();
                    if (z2) {
                        if (actionMasked == 10 || actionMasked == 1) {
                            return;
                        }
                    } else if (actionMasked == 1) {
                        return;
                    }
                    int i4 = 7;
                    if (actionMasked != 7 && actionMasked != 9) {
                        i4 = 2;
                    }
                    AndroidComposeView androidComposeView2 = AndroidComposeView.this;
                    androidComposeView2.Q(motionEvent, i4, androidComposeView2.f16225r0, false);
                }
            }
        };
        this.f16233v0 = new e(this, i2);
        this.f16235x0 = new AndroidComposeView$resendMotionEventOnLayout$1(this);
        this.f16237y0 = i3 < 29 ? new CalculateMatrixToWindowApi21(fArr) : new CalculateMatrixToWindowApi29();
        addOnAttachStateChangeListener(this.f16222q);
        setWillNotDraw(false);
        setFocusable(true);
        AndroidComposeViewVerificationHelperMethodsO.f16323a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        ViewCompat.A(this, androidComposeViewAccessibilityDelegateCompat);
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().n(this);
        if (i3 >= 29) {
            AndroidComposeViewForceDarkModeQ.f16318a.a(this);
        }
        this.A0 = i3 >= 31 ? new ScrollCapture() : null;
        this.B0 = new PointerIconService() { // from class: androidx.compose.ui.platform.AndroidComposeView$pointerIconService$1

            /* renamed from: a, reason: collision with root package name */
            public PointerIcon f16253a;

            {
                PointerIcon.f15584a.getClass();
            }

            @Override // androidx.compose.ui.input.pointer.PointerIconService
            public final void a(PointerIcon pointerIcon) {
                if (pointerIcon == null) {
                    PointerIcon.f15584a.getClass();
                    pointerIcon = PointerIcon_androidKt.f15586a;
                }
                this.f16253a = pointerIcon;
                AndroidComposeViewVerificationHelperMethodsN.f16322a.a(AndroidComposeView.this, pointerIcon);
            }
        };
    }

    public static void A(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).t();
            } else if (childAt instanceof ViewGroup) {
                A((ViewGroup) childAt);
            }
        }
    }

    public static long B(int i2) {
        long j2;
        long j3;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            j2 = 0 << 32;
        } else {
            if (mode != 0) {
                if (mode != 1073741824) {
                    throw new IllegalStateException();
                }
                j3 = size;
                j2 = j3 << 32;
                return j2 | j3;
            }
            j2 = 0 << 32;
            size = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        j3 = size;
        return j2 | j3;
    }

    public static View C(int i2, View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return null;
        }
        Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", new Class[0]);
        declaredMethod.setAccessible(true);
        if (p0.a.g(declaredMethod.invoke(view, new Object[0]), Integer.valueOf(i2))) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View C = C(i2, viewGroup.getChildAt(i3));
            if (C != null) {
                return C;
            }
        }
        return null;
    }

    public static void E(LayoutNode layoutNode) {
        layoutNode.I();
        MutableVector E = layoutNode.E();
        int i2 = E.f14144c;
        if (i2 > 0) {
            Object[] objArr = E.f14142a;
            int i3 = 0;
            do {
                E((LayoutNode) objArr[i3]);
                i3++;
            } while (i3 < i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0082 A[LOOP:0: B:20:0x004c->B:35:0x0082, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085 A[EDGE_INSN: B:36:0x0085->B:39:0x0085 BREAK  A[LOOP:0: B:20:0x004c->B:35:0x0082], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean G(android.view.MotionEvent r6) {
        /*
            float r0 = r6.getX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawX()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            float r0 = r6.getRawY()
            boolean r1 = java.lang.Float.isInfinite(r0)
            if (r1 != 0) goto L44
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r0 != 0) goto L85
            int r1 = r6.getPointerCount()
            r4 = r3
        L4c:
            if (r4 >= r1) goto L85
            float r0 = r6.getX(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            float r0 = r6.getY(r4)
            boolean r5 = java.lang.Float.isInfinite(r0)
            if (r5 != 0) goto L7f
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != 0) goto L7f
            int r0 = android.os.Build.VERSION.SDK_INT
            r5 = 29
            if (r0 < r5) goto L7d
            androidx.compose.ui.platform.MotionEventVerifierApi29 r0 = androidx.compose.ui.platform.MotionEventVerifierApi29.f16532a
            boolean r0 = r0.a(r6, r4)
            if (r0 != 0) goto L7d
            goto L7f
        L7d:
            r0 = r2
            goto L80
        L7f:
            r0 = r3
        L80:
            if (r0 != 0) goto L85
            int r4 = r4 + 1
            goto L4c
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.G(android.view.MotionEvent):boolean");
    }

    @d0.a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewTreeOwners get_viewTreeOwners() {
        return (ViewTreeOwners) this.V.getValue();
    }

    private void setDensity(Density density) {
        this.d.setValue(density);
    }

    private void setFontFamilyResolver(FontFamily.Resolver resolver) {
        this.f16209j0.setValue(resolver);
    }

    private void setLayoutDirection(LayoutDirection layoutDirection) {
        this.f16213l0.setValue(layoutDirection);
    }

    private final void set_viewTreeOwners(ViewTreeOwners viewTreeOwners) {
        this.V.setValue(viewTreeOwners);
    }

    public static final void w(AndroidComposeView androidComposeView, int i2, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int c2;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = androidComposeView.f16220p;
        if (p0.a.g(str, androidComposeViewAccessibilityDelegateCompat.B)) {
            int c3 = androidComposeViewAccessibilityDelegateCompat.f16288z.c(i2);
            if (c3 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, c3);
                return;
            }
            return;
        }
        if (!p0.a.g(str, androidComposeViewAccessibilityDelegateCompat.C) || (c2 = androidComposeViewAccessibilityDelegateCompat.A.c(i2)) == -1) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, c2);
    }

    public static final boolean z(AndroidComposeView androidComposeView, FocusDirection focusDirection, Rect rect) {
        Integer c2;
        if (androidComposeView.isFocused() || androidComposeView.hasFocus()) {
            return true;
        }
        return super.requestFocus((focusDirection == null || (c2 = FocusInteropUtils_androidKt.c(focusDirection.f14833a)) == null) ? 130 : c2.intValue(), rect != null ? RectHelper_androidKt.a(rect) : null);
    }

    public final int D(MotionEvent motionEvent) {
        int i2;
        int actionMasked;
        float[] fArr = this.P;
        removeCallbacks(this.f16231u0);
        try {
            this.R = AnimationUtils.currentAnimationTimeMillis();
            this.f16237y0.a(this, fArr);
            InvertMatrixKt.a(fArr, this.Q);
            long a2 = Matrix.a(fArr, OffsetKt.a(motionEvent.getX(), motionEvent.getY()));
            this.T = OffsetKt.a(motionEvent.getRawX() - Offset.g(a2), motionEvent.getRawY() - Offset.h(a2));
            boolean z2 = true;
            this.S = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f16223q0;
                boolean z3 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                PointerInputEventProcessor pointerInputEventProcessor = this.f16238z;
                if (motionEvent2 != null && (motionEvent2.getSource() != motionEvent.getSource() || motionEvent2.getToolType(0) != motionEvent.getToolType(0))) {
                    if (motionEvent2.getButtonState() == 0 && (actionMasked = motionEvent2.getActionMasked()) != 0 && actionMasked != 2 && actionMasked != 6) {
                        if (motionEvent2.getActionMasked() != 10 && z3) {
                            Q(motionEvent2, 10, motionEvent2.getEventTime(), true);
                        }
                    }
                    pointerInputEventProcessor.b();
                }
                boolean z4 = motionEvent.getToolType(0) == 3;
                if (z3 || !z4 || actionMasked2 == 3 || actionMasked2 == 9 || !H(motionEvent)) {
                    i2 = 9;
                } else {
                    i2 = 9;
                    Q(motionEvent, 9, motionEvent.getEventTime(), true);
                }
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                MotionEvent motionEvent3 = this.f16223q0;
                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                    MotionEvent motionEvent4 = this.f16223q0;
                    int pointerId = motionEvent4 != null ? motionEvent4.getPointerId(0) : -1;
                    int action = motionEvent.getAction();
                    MotionEventAdapter motionEventAdapter = this.f16236y;
                    if (action == i2 && motionEvent.getHistorySize() == 0) {
                        if (pointerId >= 0) {
                            motionEventAdapter.f15559c.delete(pointerId);
                            motionEventAdapter.f15558b.delete(pointerId);
                        }
                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                        MotionEvent motionEvent5 = this.f16223q0;
                        float x = motionEvent5 != null ? motionEvent5.getX() : Float.NaN;
                        MotionEvent motionEvent6 = this.f16223q0;
                        boolean z5 = (x == motionEvent.getX() && (motionEvent6 != null ? motionEvent6.getY() : Float.NaN) == motionEvent.getY()) ? false : true;
                        MotionEvent motionEvent7 = this.f16223q0;
                        if ((motionEvent7 != null ? motionEvent7.getEventTime() : -1L) == motionEvent.getEventTime()) {
                            z2 = false;
                        }
                        if (z5 || z2) {
                            if (pointerId >= 0) {
                                motionEventAdapter.f15559c.delete(pointerId);
                                motionEventAdapter.f15558b.delete(pointerId);
                            }
                            pointerInputEventProcessor.f15616b.f15552b.f15568a.g();
                        }
                    }
                }
                this.f16223q0 = MotionEvent.obtainNoHistory(motionEvent);
                return P(motionEvent);
            } finally {
                Trace.endSection();
            }
        } finally {
            this.S = false;
        }
    }

    public final void F(LayoutNode layoutNode) {
        int i2 = 0;
        this.K.p(layoutNode, false);
        MutableVector E = layoutNode.E();
        int i3 = E.f14144c;
        if (i3 > 0) {
            Object[] objArr = E.f14142a;
            do {
                F((LayoutNode) objArr[i2]);
                i2++;
            } while (i2 < i3);
        }
    }

    public final boolean H(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y2 = motionEvent.getY();
        return 0.0f <= x && x <= ((float) getWidth()) && 0.0f <= y2 && y2 <= ((float) getHeight());
    }

    public final boolean I(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f16223q0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    public final void J(OwnedLayer ownedLayer, boolean z2) {
        ArrayList arrayList = this.f16230u;
        if (!z2) {
            if (this.w) {
                return;
            }
            arrayList.remove(ownedLayer);
            ArrayList arrayList2 = this.f16232v;
            if (arrayList2 != null) {
                arrayList2.remove(ownedLayer);
                return;
            }
            return;
        }
        if (!this.w) {
            arrayList.add(ownedLayer);
            return;
        }
        ArrayList arrayList3 = this.f16232v;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f16232v = arrayList3;
        }
        arrayList3.add(ownedLayer);
    }

    public final Rect K() {
        if (isFocused()) {
            return getFocusOwner().n();
        }
        View findFocus = findFocus();
        if (findFocus != null) {
            return FocusInteropUtils_androidKt.a(findFocus);
        }
        return null;
    }

    public final void L() {
        if (this.S) {
            return;
        }
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (currentAnimationTimeMillis != this.R) {
            this.R = currentAnimationTimeMillis;
            CalculateMatrixToWindow calculateMatrixToWindow = this.f16237y0;
            float[] fArr = this.P;
            calculateMatrixToWindow.a(this, fArr);
            InvertMatrixKt.a(fArr, this.Q);
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            int[] iArr = this.N;
            view.getLocationOnScreen(iArr);
            float f2 = iArr[0];
            float f3 = iArr[1];
            view.getLocationInWindow(iArr);
            this.T = OffsetKt.a(f2 - iArr[0], f3 - iArr[1]);
        }
    }

    public final void M(OwnedLayer ownedLayer) {
        WeakCache weakCache;
        Reference poll;
        MutableVector mutableVector;
        if (this.H != null) {
            q0.p pVar = ViewLayer.f16620q;
        }
        do {
            weakCache = this.f16227s0;
            poll = weakCache.f16644b.poll();
            mutableVector = weakCache.f16643a;
            if (poll != null) {
                mutableVector.n(poll);
            }
        } while (poll != null);
        mutableVector.b(new WeakReference(ownedLayer, weakCache.f16644b));
    }

    public final void N(AndroidViewHolder androidViewHolder) {
        l(new AndroidComposeView$removeAndroidView$1(this, androidViewHolder));
    }

    public final void O(LayoutNode layoutNode) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (layoutNode != null) {
            while (layoutNode != null && layoutNode.y() == LayoutNode.UsageByParent.f15970a) {
                if (!this.J) {
                    LayoutNode B = layoutNode.B();
                    if (B == null) {
                        break;
                    }
                    long j2 = B.B.f16089b.d;
                    if (Constraints.g(j2) && Constraints.f(j2)) {
                        break;
                    }
                }
                layoutNode = layoutNode.B();
            }
            if (layoutNode == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final int P(MotionEvent motionEvent) {
        Object obj;
        int i2 = 0;
        if (this.f16239z0) {
            this.f16239z0 = false;
            int metaState = motionEvent.getMetaState();
            this.f16206i.getClass();
            WindowInfoImpl.f16645b.setValue(new PointerKeyboardModifiers(metaState));
        }
        MotionEventAdapter motionEventAdapter = this.f16236y;
        PointerInputEvent a2 = motionEventAdapter.a(motionEvent, this);
        PointerInputEventProcessor pointerInputEventProcessor = this.f16238z;
        if (a2 != null) {
            List list = a2.f15604a;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i3 = size - 1;
                    obj = list.get(size);
                    if (((PointerInputEventData) obj).e) {
                        break;
                    }
                    if (i3 < 0) {
                        break;
                    }
                    size = i3;
                }
            }
            obj = null;
            PointerInputEventData pointerInputEventData = (PointerInputEventData) obj;
            if (pointerInputEventData != null) {
                this.f16192a = pointerInputEventData.d;
            }
            i2 = pointerInputEventProcessor.a(a2, this, H(motionEvent));
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked == 0 || actionMasked == 5) && (i2 & 1) == 0) {
                int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                motionEventAdapter.f15559c.delete(pointerId);
                motionEventAdapter.f15558b.delete(pointerId);
            }
        } else {
            pointerInputEventProcessor.b();
        }
        return i2;
    }

    public final void Q(MotionEvent motionEvent, int i2, long j2, boolean z2) {
        int actionMasked = motionEvent.getActionMasked();
        int i3 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i3 = motionEvent.getActionIndex();
            }
        } else if (i2 != 9 && i2 != 10) {
            i3 = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (i3 >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i4 = 0; i4 < pointerCount; i4++) {
            pointerPropertiesArr[i4] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i5 = 0; i5 < pointerCount; i5++) {
            pointerCoordsArr[i5] = new MotionEvent.PointerCoords();
        }
        int i6 = 0;
        while (i6 < pointerCount) {
            int i7 = ((i3 < 0 || i6 < i3) ? 0 : 1) + i6;
            motionEvent.getPointerProperties(i7, pointerPropertiesArr[i6]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i6];
            motionEvent.getPointerCoords(i7, pointerCoords);
            long s2 = s(OffsetKt.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Offset.g(s2);
            pointerCoords.y = Offset.h(s2);
            i6++;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j2 : motionEvent.getDownTime(), j2, i2, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z2 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        PointerInputEvent a2 = this.f16236y.a(obtain, this);
        p0.a.p(a2);
        this.f16238z.a(a2, this, true);
        obtain.recycle();
    }

    public final void R() {
        int[] iArr = this.N;
        getLocationOnScreen(iArr);
        long j2 = this.M;
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        boolean z2 = false;
        int i4 = iArr[0];
        if (i2 != i4 || i3 != iArr[1]) {
            this.M = IntOffsetKt.a(i4, iArr[1]);
            if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                getRoot().C.f15995r.x0();
                z2 = true;
            }
        }
        this.K.a(z2);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void a(boolean z2) {
        q0.a aVar;
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.K;
        if (measureAndLayoutDelegate.f16074b.c() || measureAndLayoutDelegate.e.f16152a.m()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z2) {
                try {
                    aVar = this.f16235x0;
                } catch (Throwable th) {
                    Trace.endSection();
                    throw th;
                }
            } else {
                aVar = null;
            }
            if (measureAndLayoutDelegate.j(aVar)) {
                requestLayout();
            }
            measureAndLayoutDelegate.a(false);
            if (this.x) {
                getViewTreeObserver().dispatchOnGlobalLayout();
                this.x = false;
            }
            Trace.endSection();
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        AndroidAutofill androidAutofill = this.B;
        if (androidAutofill != null) {
            int size = sparseArray.size();
            for (int i2 = 0; i2 < size; i2++) {
                int keyAt = sparseArray.keyAt(i2);
                AutofillValue autofillValue = (AutofillValue) sparseArray.get(keyAt);
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f14716a;
                if (autofillApi26Helper.d(autofillValue)) {
                    autofillApi26Helper.i(autofillValue).toString();
                } else {
                    if (autofillApi26Helper.b(autofillValue)) {
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                    }
                    if (autofillApi26Helper.c(autofillValue)) {
                        throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                    }
                    if (autofillApi26Helper.e(autofillValue)) {
                        throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                    }
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void b(LayoutNode layoutNode, boolean z2, boolean z3) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.K;
        if (!z2) {
            measureAndLayoutDelegate.getClass();
            int ordinal = layoutNode.C.f15982c.ordinal();
            if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                return;
            }
            if (ordinal != 4) {
                throw new RuntimeException();
            }
            LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
            if (!z3 && layoutNode.N() == layoutNodeLayoutDelegate.f15995r.f16040u && (layoutNodeLayoutDelegate.d || layoutNodeLayoutDelegate.e)) {
                return;
            }
            layoutNodeLayoutDelegate.e = true;
            layoutNodeLayoutDelegate.f15983f = true;
            if (!layoutNode.L && layoutNodeLayoutDelegate.f15995r.f16040u) {
                LayoutNode B = layoutNode.B();
                if ((B == null || !B.C.e) && (B == null || !B.C.d)) {
                    measureAndLayoutDelegate.f16074b.a(layoutNode, false);
                }
                if (measureAndLayoutDelegate.d) {
                    return;
                }
                O(null);
                return;
            }
            return;
        }
        measureAndLayoutDelegate.getClass();
        int ordinal2 = layoutNode.C.f15982c.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                return;
            }
            if (ordinal2 != 2) {
                if (ordinal2 == 3) {
                    return;
                }
                if (ordinal2 != 4) {
                    throw new RuntimeException();
                }
            }
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate2 = layoutNode.C;
        if ((layoutNodeLayoutDelegate2.f15984g || layoutNodeLayoutDelegate2.f15985h) && !z3) {
            return;
        }
        layoutNodeLayoutDelegate2.f15985h = true;
        layoutNodeLayoutDelegate2.f15986i = true;
        layoutNodeLayoutDelegate2.e = true;
        layoutNodeLayoutDelegate2.f15983f = true;
        if (layoutNode.L) {
            return;
        }
        LayoutNode B2 = layoutNode.B();
        boolean g2 = p0.a.g(layoutNode.O(), Boolean.TRUE);
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = measureAndLayoutDelegate.f16074b;
        if (g2 && ((B2 == null || !B2.C.f15984g) && (B2 == null || !B2.C.f15985h))) {
            depthSortedSetsForDifferentPasses.a(layoutNode, true);
        } else if (layoutNode.N() && ((B2 == null || !B2.C.e) && (B2 == null || !B2.C.d))) {
            depthSortedSetsForDifferentPasses.a(layoutNode, false);
        }
        if (measureAndLayoutDelegate.d) {
            return;
        }
        O(null);
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i2) {
        return this.f16220p.d(this.f16192a, i2, false);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i2) {
        return this.f16220p.d(this.f16192a, i2, true);
    }

    @Override // androidx.compose.ui.node.Owner
    public final long d(long j2) {
        L();
        return Matrix.a(this.P, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            E(getRoot());
        }
        a(true);
        Snapshot.Companion.g();
        this.w = true;
        CanvasHolder canvasHolder = this.f16212l;
        AndroidCanvas androidCanvas = canvasHolder.f14952a;
        Canvas canvas2 = androidCanvas.f14925a;
        androidCanvas.f14925a = canvas;
        getRoot().s(androidCanvas, null);
        canvasHolder.f14952a.f14925a = canvas2;
        ArrayList arrayList = this.f16230u;
        if (true ^ arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((OwnedLayer) arrayList.get(i2)).k();
            }
        }
        if (ViewLayer.f16625v) {
            int save = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(save);
        }
        arrayList.clear();
        this.w = false;
        ArrayList arrayList2 = this.f16232v;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (this.f16234w0) {
            e eVar = this.f16233v0;
            removeCallbacks(eVar);
            if (motionEvent.getActionMasked() == 8) {
                this.f16234w0 = false;
            } else {
                eVar.run();
            }
        }
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (G(motionEvent) || !isAttachedToWindow()) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (!motionEvent.isFromSource(4194304)) {
            return (D(motionEvent) & 1) != 0;
        }
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(getContext());
        float f2 = -motionEvent.getAxisValue(26);
        getContext();
        float b2 = ViewConfigurationCompat.b(viewConfiguration) * f2;
        getContext();
        return getFocusOwner().j(new RotaryScrollEvent(b2, ViewConfigurationCompat.a(viewConfiguration) * f2, motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean dispatchHoverEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return getFocusOwner().f(keyEvent, new AndroidComposeView$dispatchKeyEvent$1(this, keyEvent));
        }
        int metaState = keyEvent.getMetaState();
        this.f16206i.getClass();
        WindowInfoImpl.f16645b.setValue(new PointerKeyboardModifiers(metaState));
        return FocusOwner.k(getFocusOwner(), keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().e(keyEvent)) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            AndroidComposeViewAssistHelperMethodsO.f16317a.a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f16234w0) {
            e eVar = this.f16233v0;
            removeCallbacks(eVar);
            MotionEvent motionEvent2 = this.f16223q0;
            p0.a.p(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f16234w0 = false;
            } else {
                eVar.run();
            }
        }
        if (G(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !I(motionEvent)) {
            return false;
        }
        int D = D(motionEvent);
        if ((D & 2) != 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return (D & 1) != 0;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void e(LayoutNode layoutNode) {
        this.K.e.f16152a.b(layoutNode);
        layoutNode.K = true;
        O(null);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void f() {
    }

    @Nullable
    public final View findViewByAccessibilityIdTraversal(int i2) {
        View view = null;
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i2));
                if (invoke instanceof View) {
                    view = (View) invoke;
                }
            } else {
                view = C(i2, this);
            }
        } catch (NoSuchMethodException unused) {
        }
        return view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i2) {
        if (view != null) {
            Rect a2 = FocusInteropUtils_androidKt.a(view);
            FocusDirection d = FocusInteropUtils_androidKt.d(i2);
            if (p0.a.g(getFocusOwner().a(d != null ? d.f14833a : 6, a2, AndroidComposeView$focusSearch$1.f16249a), Boolean.TRUE)) {
                return this;
            }
        }
        return super.focusSearch(view, i2);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void g(LayoutNode layoutNode) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f16220p;
        androidComposeViewAccessibilityDelegateCompat.f16286v = true;
        if (androidComposeViewAccessibilityDelegateCompat.p()) {
            androidComposeViewAccessibilityDelegateCompat.r(layoutNode);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.f16222q;
        androidContentCaptureManager.f14748i = true;
        if (androidContentCaptureManager.d() && androidContentCaptureManager.f14749j.add(layoutNode)) {
            androidContentCaptureManager.f14750k.b(b0.f30125a);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidAccessibilityManager getAccessibilityManager() {
        return this.f16224r;
    }

    @NotNull
    public final AndroidViewsHandler getAndroidViewsHandler$ui_release() {
        if (this.G == null) {
            AndroidViewsHandler androidViewsHandler = new AndroidViewsHandler(getContext());
            this.G = androidViewsHandler;
            addView(androidViewsHandler, -1);
            requestLayout();
        }
        AndroidViewsHandler androidViewsHandler2 = this.G;
        p0.a.p(androidViewsHandler2);
        return androidViewsHandler2;
    }

    @Override // androidx.compose.ui.node.Owner
    @Nullable
    public Autofill getAutofill() {
        return this.B;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AutofillTree getAutofillTree() {
        return this.f16228t;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public AndroidClipboardManager getClipboardManager() {
        return this.D;
    }

    @NotNull
    public final q0.l getConfigurationChangeObserver() {
        return this.A;
    }

    @NotNull
    public final AndroidContentCaptureManager getContentCaptureManager$ui_release() {
        return this.f16222q;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public h0.l getCoroutineContext() {
        return this.f16202g;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Density getDensity() {
        return (Density) this.d.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public DragAndDropManager getDragAndDropManager() {
        return this.f16204h;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FocusOwner getFocusOwner() {
        return this.f16200f;
    }

    @Override // android.view.View
    public final void getFocusedRect(android.graphics.Rect rect) {
        b0 b0Var;
        Rect K = K();
        if (K != null) {
            rect.left = Math.round(K.f14914a);
            rect.top = Math.round(K.f14915b);
            rect.right = Math.round(K.f14916c);
            rect.bottom = Math.round(K.d);
            b0Var = b0.f30125a;
        } else {
            b0Var = null;
        }
        if (b0Var == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public FontFamily.Resolver getFontFamilyResolver() {
        return (FontFamily.Resolver) this.f16209j0.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Font.ResourceLoader getFontLoader() {
        return this.f16207i0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public GraphicsContext getGraphicsContext() {
        return this.f16226s;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public HapticFeedback getHapticFeedBack() {
        return this.f16215m0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.K.f16074b.c();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public InputModeManager getInputModeManager() {
        return this.f16217n0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.R;
    }

    @Override // android.view.View, android.view.ViewParent, androidx.compose.ui.node.Owner
    @NotNull
    public LayoutDirection getLayoutDirection() {
        return (LayoutDirection) this.f16213l0.getValue();
    }

    public long getMeasureIteration() {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.K;
        if (measureAndLayoutDelegate.f16075c) {
            return measureAndLayoutDelegate.f16077g;
        }
        InlineClassHelperKt.a("measureIteration should be only used during the measure/layout pass");
        throw null;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ModifierLocalManager getModifierLocalManager() {
        return this.f16219o0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public Placeable.PlacementScope getPlacementScope() {
        return PlaceableKt.b(this);
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public PointerIconService getPointerIconService() {
        return this.B0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNode getRoot() {
        return this.f16214m;
    }

    @NotNull
    public RootForTest getRootForTest() {
        return this.f16216n;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.A0) == null) {
            return false;
        }
        return ((Boolean) scrollCapture.f16765a.getValue()).booleanValue();
    }

    @NotNull
    public SemanticsOwner getSemanticsOwner() {
        return this.f16218o;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public LayoutNodeDrawScope getSharedDrawScope() {
        return this.f16196c;
    }

    @Override // androidx.compose.ui.node.Owner
    public boolean getShowLayoutBounds() {
        return this.F;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public OwnerSnapshotObserver getSnapshotObserver() {
        return this.E;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public SoftwareKeyboardController getSoftwareKeyboardController() {
        return this.f16205h0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextInputService getTextInputService() {
        return this.f16201f0;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public TextToolbar getTextToolbar() {
        return this.f16221p0;
    }

    @NotNull
    public View getView() {
        return this;
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return this.L;
    }

    @Nullable
    public final ViewTreeOwners getViewTreeOwners() {
        return (ViewTreeOwners) this.W.getValue();
    }

    @Override // androidx.compose.ui.node.Owner
    @NotNull
    public WindowInfo getWindowInfo() {
        return this.f16206i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.compose.ui.node.Owner
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(q0.p r5, h0.g r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = (androidx.compose.ui.platform.AndroidComposeView$textInputSession$1) r0
            int r1 = r0.f16264c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16264c = r1
            goto L18
        L13:
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$1 r0 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$1
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f16262a
            i0.a r1 = i0.a.f30806a
            int r2 = r0.f16264c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 == r3) goto L2b
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2b:
            kotlin.jvm.internal.q.m(r6)
            goto L42
        L2f:
            kotlin.jvm.internal.q.m(r6)
            java.util.concurrent.atomic.AtomicReference r6 = r4.f16203g0
            androidx.compose.ui.platform.AndroidComposeView$textInputSession$2 r2 = new androidx.compose.ui.platform.AndroidComposeView$textInputSession$2
            r2.<init>(r4)
            r0.f16264c = r3
            java.lang.Object r5 = androidx.compose.ui.SessionMutex.b(r6, r0, r2, r5)
            if (r5 != r1) goto L42
            return
        L42:
            d0.e r5 = new d0.e
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.h(q0.p, h0.g):void");
    }

    @Override // androidx.compose.ui.node.Owner
    public final void i(LayoutNode layoutNode, boolean z2) {
        this.K.f(layoutNode, z2);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void j(BackwardsCompatNode$initializeModifier$3 backwardsCompatNode$initializeModifier$3) {
        this.K.f16076f.b(backwardsCompatNode$initializeModifier$3);
        O(null);
    }

    @Override // androidx.compose.ui.node.Owner
    public final OwnedLayer k(q0.p pVar, q0.a aVar, GraphicsLayer graphicsLayer) {
        Reference poll;
        MutableVector mutableVector;
        Object obj;
        if (graphicsLayer != null) {
            return new GraphicsLayerOwnerLayer(graphicsLayer, null, this, pVar, aVar);
        }
        do {
            WeakCache weakCache = this.f16227s0;
            poll = weakCache.f16644b.poll();
            mutableVector = weakCache.f16643a;
            if (poll != null) {
                mutableVector.n(poll);
            }
        } while (poll != null);
        while (true) {
            if (!mutableVector.m()) {
                obj = null;
                break;
            }
            obj = ((Reference) mutableVector.o(mutableVector.f14144c - 1)).get();
            if (obj != null) {
                break;
            }
        }
        OwnedLayer ownedLayer = (OwnedLayer) obj;
        if (ownedLayer != null) {
            ownedLayer.f(pVar, aVar);
            return ownedLayer;
        }
        if (isHardwareAccelerated() && Build.VERSION.SDK_INT != 28) {
            return new GraphicsLayerOwnerLayer(getGraphicsContext().a(), getGraphicsContext(), this, pVar, aVar);
        }
        if (isHardwareAccelerated() && this.U) {
            try {
                return new RenderNodeLayer(this, pVar, aVar);
            } catch (Throwable unused) {
                this.U = false;
            }
        }
        if (this.H == null) {
            if (!ViewLayer.f16624u) {
                ViewLayer.Companion.a(new View(getContext()));
            }
            DrawChildContainer drawChildContainer = ViewLayer.f16625v ? new DrawChildContainer(getContext()) : new DrawChildContainer(getContext());
            this.H = drawChildContainer;
            addView(drawChildContainer, -1);
        }
        DrawChildContainer drawChildContainer2 = this.H;
        p0.a.p(drawChildContainer2);
        return new ViewLayer(this, drawChildContainer2, pVar, aVar);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void l(q0.a aVar) {
        MutableVector mutableVector = this.f16229t0;
        if (mutableVector.h(aVar)) {
            return;
        }
        mutableVector.b(aVar);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void m(LayoutNode layoutNode, long j2) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.K;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            measureAndLayoutDelegate.k(layoutNode, j2);
            if (!measureAndLayoutDelegate.f16074b.c()) {
                measureAndLayoutDelegate.a(false);
                if (this.x) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.x = false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    public final long n(long j2) {
        L();
        return Matrix.a(this.Q, OffsetKt.a(Offset.g(j2) - Offset.g(this.T), Offset.h(j2) - Offset.h(this.T)));
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    public final void o(float[] fArr) {
        L();
        Matrix.f(fArr, this.P);
        float g2 = Offset.g(this.T);
        float h2 = Offset.h(this.T);
        float[] fArr2 = this.O;
        Matrix.c(fArr2);
        Matrix.g(g2, h2, 0.0f, fArr2);
        AndroidComposeView_androidKt.b(fArr, fArr2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        LifecycleOwner lifecycleOwner2;
        LifecycleOwner lifecycleOwner3;
        super.onAttachedToWindow();
        this.f16206i.f16646a.setValue(Boolean.valueOf(hasWindowFocus()));
        F(getRoot());
        E(getRoot());
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f16155a;
        snapshotStateObserver.f14602g = Snapshot.Companion.e(snapshotStateObserver.d);
        AndroidAutofill androidAutofill = this.B;
        if (androidAutofill != null) {
            AutofillCallback.f14717a.a(androidAutofill);
        }
        LifecycleOwner a2 = ViewTreeLifecycleOwner.a(this);
        SavedStateRegistryOwner a3 = ViewTreeSavedStateRegistryOwner.a(this);
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (a2 != null && a3 != null && (a2 != (lifecycleOwner3 = viewTreeOwners.f16240a) || a3 != lifecycleOwner3))) {
            if (a2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (a3 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (lifecycleOwner = viewTreeOwners.f16240a) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.d(this);
            }
            a2.getLifecycle().a(this);
            ViewTreeOwners viewTreeOwners2 = new ViewTreeOwners(a2, a3);
            set_viewTreeOwners(viewTreeOwners2);
            q0.l lVar = this.f16193a0;
            if (lVar != null) {
                lVar.invoke(viewTreeOwners2);
            }
            this.f16193a0 = null;
        }
        int i2 = isInTouchMode() ? 1 : 2;
        InputModeManagerImpl inputModeManagerImpl = this.f16217n0;
        inputModeManagerImpl.getClass();
        inputModeManagerImpl.f15499a.setValue(new InputMode(i2));
        ViewTreeOwners viewTreeOwners3 = getViewTreeOwners();
        Lifecycle lifecycle2 = (viewTreeOwners3 == null || (lifecycleOwner2 = viewTreeOwners3.f16240a) == null) ? null : lifecycleOwner2.getLifecycle();
        if (lifecycle2 == null) {
            InlineClassHelperKt.c("No lifecycle owner exists");
            throw null;
        }
        lifecycle2.a(this);
        lifecycle2.a(this.f16222q);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f16195b0);
        getViewTreeObserver().addOnScrollChangedListener(this.f16197c0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f16198d0);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.f16321a.b(this);
        }
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        AndroidPlatformTextInputSession androidPlatformTextInputSession = (AndroidPlatformTextInputSession) SessionMutex.a(this.f16203g0);
        if (androidPlatformTextInputSession == null) {
            return this.f16199e0.d;
        }
        InputMethodSession inputMethodSession = (InputMethodSession) SessionMutex.a(androidPlatformTextInputSession.d);
        return inputMethodSession != null && (inputMethodSession.e ^ true);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setDensity(AndroidDensity_androidKt.a(getContext()));
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 >= 31 ? configuration.fontWeightAdjustment : 0) != this.f16211k0) {
            this.f16211k0 = i2 >= 31 ? configuration.fontWeightAdjustment : 0;
            setFontFamilyResolver(FontFamilyResolver_androidKt.a(getContext()));
        }
        this.A.invoke(configuration);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0029, code lost:
    
        if (r6 != false) goto L10;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.compose.ui.text.input.TextInputServiceAndroid$createInputConnection$1] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r15) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeView.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.f16222q.g(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LifecycleOwner lifecycleOwner;
        super.onDetachedFromWindow();
        SnapshotStateObserver snapshotStateObserver = getSnapshotObserver().f16155a;
        androidx.compose.runtime.snapshots.a aVar = snapshotStateObserver.f14602g;
        if (aVar != null) {
            aVar.dispose();
        }
        snapshotStateObserver.b();
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        Lifecycle lifecycle = (viewTreeOwners == null || (lifecycleOwner = viewTreeOwners.f16240a) == null) ? null : lifecycleOwner.getLifecycle();
        if (lifecycle == null) {
            InlineClassHelperKt.c("No lifecycle owner exists");
            throw null;
        }
        lifecycle.d(this.f16222q);
        lifecycle.d(this);
        AndroidAutofill androidAutofill = this.B;
        if (androidAutofill != null) {
            AutofillCallback.f14717a.b(androidAutofill);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f16195b0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f16197c0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f16198d0);
        if (Build.VERSION.SDK_INT >= 31) {
            AndroidComposeViewTranslationCallbackS.f16321a.a(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z2, int i2, android.graphics.Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (z2 || hasFocus()) {
            return;
        }
        getFocusOwner().p();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        this.K.j(this.f16235x0);
        this.I = null;
        R();
        if (this.G != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i4 - i2, i5 - i3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i2, int i3) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.K;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                F(getRoot());
            }
            long B = B(i2);
            long B2 = B(i3);
            long a2 = Constraints.Companion.a((int) (B >>> 32), (int) (B & 4294967295L), (int) (B2 >>> 32), (int) (4294967295L & B2));
            Constraints constraints = this.I;
            if (constraints == null) {
                this.I = new Constraints(a2);
                this.J = false;
            } else if (!Constraints.c(constraints.f17480a, a2)) {
                this.J = true;
            }
            measureAndLayoutDelegate.q(a2);
            measureAndLayoutDelegate.l();
            setMeasuredDimension(getRoot().C.f15995r.f15825a, getRoot().C.f15995r.f15826b);
            if (this.G != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().C.f15995r.f15825a, Ints.MAX_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(getRoot().C.f15995r.f15826b, Ints.MAX_POWER_OF_TWO));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i2) {
        AndroidAutofill androidAutofill;
        if (viewStructure == null || (androidAutofill = this.B) == null) {
            return;
        }
        AutofillApi23Helper autofillApi23Helper = AutofillApi23Helper.f14715a;
        AutofillTree autofillTree = androidAutofill.f14713b;
        int a2 = autofillApi23Helper.a(viewStructure, autofillTree.f14718a.size());
        for (Map.Entry entry : autofillTree.f14718a.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            AutofillNode autofillNode = (AutofillNode) entry.getValue();
            ViewStructure b2 = autofillApi23Helper.b(viewStructure, a2);
            if (b2 != null) {
                AutofillApi26Helper autofillApi26Helper = AutofillApi26Helper.f14716a;
                AutofillId a3 = autofillApi26Helper.a(viewStructure);
                p0.a.p(a3);
                autofillApi26Helper.g(b2, a3, intValue);
                autofillApi23Helper.d(b2, intValue, androidAutofill.f14712a.getContext().getPackageName(), null, null);
                autofillApi26Helper.h(b2, 1);
                autofillNode.getClass();
                throw null;
            }
            a2++;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner) {
        setShowLayoutBounds(Companion.a());
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i2) {
        if (this.f16194b) {
            LayoutDirection layoutDirection = LayoutDirection.f17494a;
            LayoutDirection layoutDirection2 = i2 != 0 ? i2 != 1 ? null : LayoutDirection.f17495b : layoutDirection;
            if (layoutDirection2 != null) {
                layoutDirection = layoutDirection2;
            }
            setLayoutDirection(layoutDirection);
        }
    }

    @Override // android.view.View
    public final void onScrollCaptureSearch(android.graphics.Rect rect, Point point, Consumer consumer) {
        ScrollCapture scrollCapture;
        if (Build.VERSION.SDK_INT < 31 || (scrollCapture = this.A0) == null) {
            return;
        }
        scrollCapture.c(this, getSemanticsOwner(), getCoroutineContext(), consumer);
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        AndroidContentCaptureManager androidContentCaptureManager = this.f16222q;
        androidContentCaptureManager.getClass();
        AndroidContentCaptureManager.j(androidContentCaptureManager, longSparseArray);
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        boolean a2;
        this.f16206i.f16646a.setValue(Boolean.valueOf(z2));
        this.f16239z0 = true;
        super.onWindowFocusChanged(z2);
        if (!z2 || getShowLayoutBounds() == (a2 = Companion.a())) {
            return;
        }
        setShowLayoutBounds(a2);
        E(getRoot());
    }

    @Override // androidx.compose.ui.node.Owner
    public final long p(long j2) {
        L();
        return Matrix.a(this.Q, j2);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void q(LayoutNode layoutNode, boolean z2, boolean z3, boolean z4) {
        LayoutNode B;
        LayoutNode B2;
        LayoutNodeLayoutDelegate.LookaheadPassDelegate lookaheadPassDelegate;
        LookaheadAlignmentLines lookaheadAlignmentLines;
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.K;
        if (!z2) {
            if (measureAndLayoutDelegate.p(layoutNode, z3) && z4) {
                O(layoutNode);
                return;
            }
            return;
        }
        measureAndLayoutDelegate.getClass();
        if (layoutNode.f15944f == null) {
            InlineClassHelperKt.b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            throw null;
        }
        LayoutNodeLayoutDelegate layoutNodeLayoutDelegate = layoutNode.C;
        int ordinal = layoutNodeLayoutDelegate.f15982c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2 && ordinal != 3) {
                if (ordinal != 4) {
                    throw new RuntimeException();
                }
                if (!layoutNodeLayoutDelegate.f15984g || z3) {
                    layoutNodeLayoutDelegate.f15984g = true;
                    layoutNodeLayoutDelegate.d = true;
                    if (layoutNode.L) {
                        return;
                    }
                    boolean g2 = p0.a.g(layoutNode.O(), Boolean.TRUE);
                    DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = measureAndLayoutDelegate.f16074b;
                    if ((g2 || (layoutNodeLayoutDelegate.f15984g && (layoutNode.z() == LayoutNode.UsageByParent.f15970a || !((lookaheadPassDelegate = layoutNodeLayoutDelegate.f15996s) == null || (lookaheadAlignmentLines = lookaheadPassDelegate.f16011s) == null || !lookaheadAlignmentLines.f())))) && ((B = layoutNode.B()) == null || !B.C.f15984g)) {
                        depthSortedSetsForDifferentPasses.a(layoutNode, true);
                    } else if ((layoutNode.N() || MeasureAndLayoutDelegate.h(layoutNode)) && ((B2 = layoutNode.B()) == null || !B2.C.d)) {
                        depthSortedSetsForDifferentPasses.a(layoutNode, false);
                    }
                    if (measureAndLayoutDelegate.d || !z4) {
                        return;
                    }
                    O(layoutNode);
                    return;
                }
                return;
            }
        }
        measureAndLayoutDelegate.f16078h.b(new MeasureAndLayoutDelegate.PostponedRequest(layoutNode, true, z3));
    }

    @Override // androidx.compose.ui.node.Owner
    public final void r(LayoutNode layoutNode) {
        MeasureAndLayoutDelegate measureAndLayoutDelegate = this.K;
        DepthSortedSetsForDifferentPasses depthSortedSetsForDifferentPasses = measureAndLayoutDelegate.f16074b;
        depthSortedSetsForDifferentPasses.f15914a.c(layoutNode);
        depthSortedSetsForDifferentPasses.f15915b.c(layoutNode);
        measureAndLayoutDelegate.e.f16152a.n(layoutNode);
        this.C = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i2, android.graphics.Rect rect) {
        if (isFocused()) {
            return true;
        }
        if (getFocusOwner().l().b()) {
            return super.requestFocus(i2, rect);
        }
        if (isInTouchMode()) {
            return false;
        }
        FocusDirection d = FocusInteropUtils_androidKt.d(i2);
        int i3 = d != null ? d.f14833a : 7;
        Boolean a2 = getFocusOwner().a(i3, rect != null ? RectHelper_androidKt.d(rect) : null, new AndroidComposeView$requestFocus$1(i3));
        if (a2 != null) {
            return a2.booleanValue();
        }
        return false;
    }

    @Override // androidx.compose.ui.input.pointer.PositionCalculator
    public final long s(long j2) {
        L();
        long a2 = Matrix.a(this.P, j2);
        return OffsetKt.a(Offset.g(this.T) + Offset.g(a2), Offset.h(this.T) + Offset.h(a2));
    }

    public void setAccessibilityEventBatchIntervalMillis(long j2) {
        this.f16220p.e = j2;
    }

    public final void setConfigurationChangeObserver(@NotNull q0.l lVar) {
        this.A = lVar;
    }

    public final void setContentCaptureManager$ui_release(@NotNull AndroidContentCaptureManager androidContentCaptureManager) {
        this.f16222q = androidContentCaptureManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.ui.Modifier$Node, androidx.compose.ui.node.DelegatableNode] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.compose.ui.node.NestedVectorStack, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21, types: [androidx.compose.ui.Modifier$Node] */
    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14, types: [androidx.compose.runtime.collection.MutableVector] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public void setCoroutineContext(@NotNull h0.l lVar) {
        int i2;
        int i3;
        this.f16202g = lVar;
        ?? r11 = getRoot().B.e;
        if (r11 instanceof SuspendingPointerInputModifierNode) {
            ((SuspendingPointerInputModifierNode) r11).M0();
        }
        Modifier.Node node = r11.f14688a;
        if (!node.f14699n) {
            InlineClassHelperKt.b("visitSubtree called on an unattached node");
            throw null;
        }
        Modifier.Node node2 = node.f14692g;
        LayoutNode f2 = DelegatableNodeKt.f(r11);
        ?? obj = new Object();
        obj.f16086b = new int[16];
        obj.f16087c = new MutableVector[16];
        while (f2 != null) {
            if (node2 == null) {
                node2 = f2.B.e;
            }
            if ((node2.d & 16) != 0) {
                while (node2 != null) {
                    if ((node2.f14690c & 16) != 0) {
                        DelegatingNode delegatingNode = node2;
                        ?? r6 = 0;
                        while (delegatingNode != 0) {
                            if (delegatingNode instanceof PointerInputModifierNode) {
                                PointerInputModifierNode pointerInputModifierNode = (PointerInputModifierNode) delegatingNode;
                                if (pointerInputModifierNode instanceof SuspendingPointerInputModifierNode) {
                                    ((SuspendingPointerInputModifierNode) pointerInputModifierNode).M0();
                                }
                            } else if ((delegatingNode.f14690c & 16) != 0 && (delegatingNode instanceof DelegatingNode)) {
                                Modifier.Node node3 = delegatingNode.f15909p;
                                int i4 = 0;
                                delegatingNode = delegatingNode;
                                r6 = r6;
                                while (node3 != null) {
                                    if ((node3.f14690c & 16) != 0) {
                                        i4++;
                                        r6 = r6;
                                        if (i4 == 1) {
                                            delegatingNode = node3;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new MutableVector(new Modifier.Node[16]);
                                            }
                                            if (delegatingNode != 0) {
                                                r6.b(delegatingNode);
                                                delegatingNode = 0;
                                            }
                                            r6.b(node3);
                                        }
                                    }
                                    node3 = node3.f14692g;
                                    delegatingNode = delegatingNode;
                                    r6 = r6;
                                }
                                if (i4 == 1) {
                                }
                            }
                            delegatingNode = DelegatableNodeKt.b(r6);
                        }
                    }
                    node2 = node2.f14692g;
                }
            }
            MutableVector E = f2.E();
            if (!E.l()) {
                int i5 = obj.f16085a;
                int[] iArr = obj.f16086b;
                if (i5 >= iArr.length) {
                    int[] copyOf = Arrays.copyOf(iArr, iArr.length * 2);
                    p0.a.r(copyOf, "copyOf(this, newSize)");
                    obj.f16086b = copyOf;
                    MutableVector[] mutableVectorArr = obj.f16087c;
                    Object[] copyOf2 = Arrays.copyOf(mutableVectorArr, mutableVectorArr.length * 2);
                    p0.a.r(copyOf2, "copyOf(this, newSize)");
                    obj.f16087c = (MutableVector[]) copyOf2;
                }
                obj.f16086b[i5] = E.f14144c - 1;
                obj.f16087c[i5] = E;
                obj.f16085a++;
            }
            int i6 = obj.f16085a;
            if (i6 <= 0 || (i3 = obj.f16086b[i6 - 1]) < 0) {
                f2 = null;
            } else {
                if (i6 <= 0) {
                    throw new IllegalStateException("Cannot call pop() on an empty stack. Guard with a call to isNotEmpty()".toString());
                }
                MutableVector mutableVector = obj.f16087c[i2];
                p0.a.p(mutableVector);
                if (i3 > 0) {
                    obj.f16086b[i2] = r5[i2] - 1;
                } else if (i3 == 0) {
                    obj.f16087c[i2] = null;
                    obj.f16085a--;
                }
                f2 = (LayoutNode) mutableVector.f14142a[i3];
            }
            node2 = null;
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j2) {
        this.R = j2;
    }

    public final void setOnViewTreeOwnersAvailable(@NotNull q0.l lVar) {
        ViewTreeOwners viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            lVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f16193a0 = lVar;
    }

    @Override // androidx.compose.ui.node.Owner
    public void setShowLayoutBounds(boolean z2) {
        this.F = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.compose.ui.node.Owner
    public final void t() {
        if (this.C) {
            getSnapshotObserver().a();
            this.C = false;
        }
        AndroidViewsHandler androidViewsHandler = this.G;
        if (androidViewsHandler != null) {
            A(androidViewsHandler);
        }
        while (true) {
            MutableVector mutableVector = this.f16229t0;
            if (!mutableVector.m()) {
                return;
            }
            int i2 = mutableVector.f14144c;
            for (int i3 = 0; i3 < i2; i3++) {
                Object[] objArr = mutableVector.f14142a;
                q0.a aVar = (q0.a) objArr[i3];
                objArr[i3] = null;
                if (aVar != null) {
                    aVar.invoke();
                }
            }
            mutableVector.p(0, i2);
        }
    }

    @Override // androidx.compose.ui.node.Owner
    public final void u() {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.f16220p;
        androidComposeViewAccessibilityDelegateCompat.f16286v = true;
        if (androidComposeViewAccessibilityDelegateCompat.p() && !androidComposeViewAccessibilityDelegateCompat.G) {
            androidComposeViewAccessibilityDelegateCompat.G = true;
            androidComposeViewAccessibilityDelegateCompat.f16273i.post(androidComposeViewAccessibilityDelegateCompat.H);
        }
        AndroidContentCaptureManager androidContentCaptureManager = this.f16222q;
        androidContentCaptureManager.f14748i = true;
        if (!androidContentCaptureManager.d() || androidContentCaptureManager.f14756q) {
            return;
        }
        androidContentCaptureManager.f14756q = true;
        androidContentCaptureManager.f14751l.post(androidContentCaptureManager.f14757r);
    }

    @Override // androidx.compose.ui.node.Owner
    public final void v() {
        this.x = true;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2) {
        p0.a.p(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, int i3) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i2;
        generateDefaultLayoutParams.height = i3;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i2, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }
}
