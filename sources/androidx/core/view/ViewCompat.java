package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.animation.PathInterpolator;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.d;
import com.bumptech.glide.e;
import com.plantcare.ai.identifier.plantid.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import n0.a;
import n0.a0;
import n0.a1;
import n0.b;
import n0.b0;
import n0.b1;
import n0.d0;
import n0.d1;
import n0.e1;
import n0.g;
import n0.m0;
import n0.n0;
import n0.o0;
import n0.p0;
import n0.r0;
import n0.r1;
import n0.r2;
import n0.s0;
import n0.t;
import n0.t0;
import n0.u1;
import n0.v0;
import n0.w2;
import n0.x1;
import n0.y0;
import n0.y1;
import n0.z;
import n0.z0;
import n0.z1;
import o0.c;
import o0.j;
import o0.m;
import o0.u;
import t0.q;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class ViewCompat {
    public static final int ACCESSIBILITY_LIVE_REGION_ASSERTIVE = 2;
    public static final int ACCESSIBILITY_LIVE_REGION_NONE = 0;
    public static final int ACCESSIBILITY_LIVE_REGION_POLITE = 1;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_AUTO = 0;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO = 2;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_NO_HIDE_DESCENDANTS = 4;

    @Deprecated
    public static final int IMPORTANT_FOR_ACCESSIBILITY_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_AUTO = 0;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO = 2;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_NO_EXCLUDE_DESCENDANTS = 8;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES = 1;
    public static final int IMPORTANT_FOR_CONTENT_CAPTURE_YES_EXCLUDE_DESCENDANTS = 4;

    @Deprecated
    public static final int LAYER_TYPE_HARDWARE = 2;

    @Deprecated
    public static final int LAYER_TYPE_NONE = 0;

    @Deprecated
    public static final int LAYER_TYPE_SOFTWARE = 1;

    @Deprecated
    public static final int LAYOUT_DIRECTION_INHERIT = 2;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LOCALE = 3;

    @Deprecated
    public static final int LAYOUT_DIRECTION_LTR = 0;

    @Deprecated
    public static final int LAYOUT_DIRECTION_RTL = 1;

    @Deprecated
    public static final int MEASURED_HEIGHT_STATE_SHIFT = 16;

    @Deprecated
    public static final int MEASURED_SIZE_MASK = 16777215;

    @Deprecated
    public static final int MEASURED_STATE_MASK = -16777216;

    @Deprecated
    public static final int MEASURED_STATE_TOO_SMALL = 16777216;

    @Deprecated
    public static final int OVER_SCROLL_ALWAYS = 0;

    @Deprecated
    public static final int OVER_SCROLL_IF_CONTENT_SCROLLS = 1;

    @Deprecated
    public static final int OVER_SCROLL_NEVER = 2;
    public static final int SCROLL_AXIS_HORIZONTAL = 1;
    public static final int SCROLL_AXIS_NONE = 0;
    public static final int SCROLL_AXIS_VERTICAL = 2;
    public static final int SCROLL_INDICATOR_BOTTOM = 2;
    public static final int SCROLL_INDICATOR_END = 32;
    public static final int SCROLL_INDICATOR_LEFT = 4;
    public static final int SCROLL_INDICATOR_RIGHT = 8;
    public static final int SCROLL_INDICATOR_START = 16;
    public static final int SCROLL_INDICATOR_TOP = 1;
    private static final String TAG = "ViewCompat";
    public static final int TYPE_NON_TOUCH = 1;
    public static final int TYPE_TOUCH = 0;
    private static boolean sAccessibilityDelegateCheckFailed = false;
    private static Field sAccessibilityDelegateField;
    private static Method sChildrenDrawingOrderMethod;
    private static Method sDispatchFinishTemporaryDetach;
    private static Method sDispatchStartTemporaryDetach;
    private static boolean sTempDetachBound;
    private static ThreadLocal<Rect> sThreadLocalRect;
    private static WeakHashMap<View, String> sTransitionNameMap;
    private static WeakHashMap<View, r1> sViewPropertyAnimatorMap;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final b0 NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new b0() { // from class: n0.l0
        @Override // n0.b0
        public final g a(g gVar) {
            g lambda$static$0;
            lambda$static$0 = ViewCompat.lambda$static$0(gVar);
            return lambda$static$0;
        }
    };
    private static final n0 sAccessibilityPaneVisibilityManager = new n0();

    @Deprecated
    public ViewCompat() {
    }

    private static o0 accessibilityHeadingProperty() {
        return new m0(R.id.tag_accessibility_heading, 3);
    }

    public static int addAccessibilityAction(@NonNull View view, @NonNull CharSequence charSequence, @NonNull u uVar) {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view, charSequence);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new c(null, availableActionIdFromResources, charSequence, uVar, null));
        }
        return availableActionIdFromResources;
    }

    public static void addKeyboardNavigationClusters(@NonNull View view, @NonNull Collection<View> collection, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            v0.a(view, collection, i10);
        }
    }

    public static void addOnUnhandledKeyEventListener(@NonNull View view, @NonNull d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            y0.a(view, d1Var);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(d1Var);
        if (arrayList.size() == 1) {
            ArrayList arrayList2 = e1.f22265d;
            synchronized (arrayList2) {
                Iterator it = arrayList2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((WeakReference) it.next()).get() == view) {
                            break;
                        }
                    } else {
                        e1.f22265d.add(new WeakReference(view));
                        break;
                    }
                }
            }
        }
    }

    @NonNull
    @Deprecated
    public static r1 animate(@NonNull View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new WeakHashMap<>();
        }
        r1 r1Var = sViewPropertyAnimatorMap.get(view);
        if (r1Var == null) {
            r1 r1Var2 = new r1(view);
            sViewPropertyAnimatorMap.put(view, r1Var2);
            return r1Var2;
        }
        return r1Var;
    }

    private static void bindTempDetach() {
        try {
            sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e2) {
            Log.e(TAG, "Couldn't find method", e2);
        }
        sTempDetachBound = true;
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i10) {
        return view.canScrollHorizontally(i10);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i10) {
        return view.canScrollVertically(i10);
    }

    public static void cancelDragAndDrop(@NonNull View view) {
        t0.a(view);
    }

    @Deprecated
    public static int combineMeasuredStates(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    private static void compatOffsetLeftAndRight(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    private static void compatOffsetTopAndBottom(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    @NonNull
    public static r2 computeSystemWindowInsets(@NonNull View view, @NonNull r2 r2Var, @NonNull Rect rect) {
        return r0.b(view, r2Var, rect);
    }

    @NonNull
    public static r2 dispatchApplyWindowInsets(@NonNull View view, @NonNull r2 r2Var) {
        WindowInsets g10 = r2Var.g();
        if (g10 != null) {
            WindowInsets a = p0.a(view, g10);
            if (!a.equals(g10)) {
                return r2.h(view, a);
            }
        }
        return r2Var;
    }

    public static void dispatchFinishTemporaryDetach(@NonNull View view) {
        t0.b(view);
    }

    public static boolean dispatchNestedFling(@NonNull View view, float f10, float f11, boolean z10) {
        return r0.c(view, f10, f11, z10);
    }

    public static boolean dispatchNestedPreFling(@NonNull View view, float f10, float f11) {
        return r0.d(view, f10, f11);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view, int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return r0.e(view, i10, i11, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr) {
        return r0.f(view, i10, i11, i12, i13, iArr);
    }

    public static void dispatchStartTemporaryDetach(@NonNull View view) {
        t0.c(view);
    }

    public static boolean dispatchUnhandledKeyEventBeforeCallback(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = e1.f22265d;
        e1 e1Var = (e1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (e1Var == null) {
            e1Var = new e1();
            view.setTag(R.id.tag_unhandled_key_event_manager, e1Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = e1Var.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = e1.f22265d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    if (e1Var.a == null) {
                        e1Var.a = new WeakHashMap();
                    }
                    int size = arrayList2.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        ArrayList arrayList3 = e1.f22265d;
                        View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                        if (view2 == null) {
                            arrayList3.remove(size);
                        } else {
                            e1Var.a.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                e1Var.a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View a = e1Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a != null && !KeyEvent.isModifierKey(keyCode)) {
                if (e1Var.f22266b == null) {
                    e1Var.f22266b = new SparseArray();
                }
                e1Var.f22266b.put(keyCode, new WeakReference(a));
            }
        }
        if (a == null) {
            return false;
        }
        return true;
    }

    public static boolean dispatchUnhandledKeyEventBeforeHierarchy(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = e1.f22265d;
        e1 e1Var = (e1) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (e1Var == null) {
            e1Var = new e1();
            view.setTag(R.id.tag_unhandled_key_event_manager, e1Var);
        }
        WeakReference weakReference2 = e1Var.f22267c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        e1Var.f22267c = new WeakReference(keyEvent);
        if (e1Var.f22266b == null) {
            e1Var.f22266b = new SparseArray();
        }
        SparseArray sparseArray = e1Var.f22266b;
        if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
            weakReference = (WeakReference) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        } else {
            weakReference = null;
        }
        if (weakReference == null) {
            weakReference = (WeakReference) sparseArray.get(keyEvent.getKeyCode());
        }
        if (weakReference == null) {
            return false;
        }
        View view2 = (View) weakReference.get();
        if (view2 != null && view2.isAttachedToWindow()) {
            e1.b(view2);
        }
        return true;
    }

    public static void enableAccessibleClickableSpanSupport(@NonNull View view) {
        ensureAccessibilityDelegateCompat(view);
    }

    public static void ensureAccessibilityDelegateCompat(@NonNull View view) {
        b accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new b();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    @Nullable
    public static b getAccessibilityDelegate(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        if (accessibilityDelegateInternal instanceof a) {
            return ((a) accessibilityDelegateInternal).a;
        }
        return new b(accessibilityDelegateInternal);
    }

    @Nullable
    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z0.a(view);
        }
        return getAccessibilityDelegateThroughReflection(view);
    }

    @Nullable
    private static View.AccessibilityDelegate getAccessibilityDelegateThroughReflection(@NonNull View view) {
        if (sAccessibilityDelegateCheckFailed) {
            return null;
        }
        if (sAccessibilityDelegateField == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                sAccessibilityDelegateField = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                sAccessibilityDelegateCheckFailed = true;
                return null;
            }
        }
        try {
            Object obj = sAccessibilityDelegateField.get(view);
            if (!(obj instanceof View.AccessibilityDelegate)) {
                return null;
            }
            return (View.AccessibilityDelegate) obj;
        } catch (Throwable unused2) {
            sAccessibilityDelegateCheckFailed = true;
            return null;
        }
    }

    @Deprecated
    public static int getAccessibilityLiveRegion(@NonNull View view) {
        return view.getAccessibilityLiveRegion();
    }

    @Nullable
    public static m getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new m(accessibilityNodeProvider);
        }
        return null;
    }

    @Nullable
    public static CharSequence getAccessibilityPaneTitle(@NonNull View view) {
        return (CharSequence) paneTitleProperty().b(view);
    }

    private static List<c> getActionList(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    @Deprecated
    public static float getAlpha(View view) {
        return view.getAlpha();
    }

    @Nullable
    public static q0.a getAutofillId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new q0.a(v0.b(view));
        }
        return null;
    }

    private static int getAvailableActionIdFromResources(View view, @NonNull CharSequence charSequence) {
        boolean z10;
        List<c> actionList = getActionList(view);
        for (int i10 = 0; i10 < actionList.size(); i10++) {
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfo.AccessibilityAction) actionList.get(i10).a).getLabel())) {
                return actionList.get(i10).a();
            }
        }
        int i11 = -1;
        int i12 = 0;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i12 >= iArr.length || i11 != -1) {
                break;
            }
            int i13 = iArr[i12];
            boolean z11 = true;
            for (int i14 = 0; i14 < actionList.size(); i14++) {
                if (actionList.get(i14).a() != i13) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z11 &= z10;
            }
            if (z11) {
                i11 = i13;
            }
            i12++;
        }
        return i11;
    }

    @Nullable
    public static ColorStateList getBackgroundTintList(@NonNull View view) {
        return r0.g(view);
    }

    @Nullable
    public static PorterDuff.Mode getBackgroundTintMode(@NonNull View view) {
        return r0.h(view);
    }

    @Nullable
    @Deprecated
    public static Rect getClipBounds(@NonNull View view) {
        return view.getClipBounds();
    }

    @Nullable
    public static r0.a getContentCaptureSession(@NonNull View view) {
        ContentCaptureSession b3;
        if (Build.VERSION.SDK_INT < 29 || (b3 = z0.b(view)) == null) {
            return null;
        }
        return new r0.a(view, b3);
    }

    @Nullable
    @Deprecated
    public static Display getDisplay(@NonNull View view) {
        return view.getDisplay();
    }

    public static float getElevation(@NonNull View view) {
        return r0.i(view);
    }

    private static Rect getEmptyTempRect() {
        if (sThreadLocalRect == null) {
            sThreadLocalRect = new ThreadLocal<>();
        }
        Rect rect = sThreadLocalRect.get();
        if (rect == null) {
            rect = new Rect();
            sThreadLocalRect.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static b0 getFallback(@NonNull View view) {
        if (view instanceof b0) {
            return (b0) view;
        }
        return NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR;
    }

    @Deprecated
    public static boolean getFitsSystemWindows(@NonNull View view) {
        return view.getFitsSystemWindows();
    }

    @Deprecated
    public static int getImportantForAccessibility(@NonNull View view) {
        return view.getImportantForAccessibility();
    }

    @SuppressLint({"InlinedApi"})
    public static int getImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.c(view);
        }
        return 0;
    }

    public static int getImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return a1.a(view);
        }
        return 0;
    }

    @Deprecated
    public static int getLabelFor(@NonNull View view) {
        return view.getLabelFor();
    }

    @Deprecated
    public static int getLayerType(View view) {
        return view.getLayerType();
    }

    @Deprecated
    public static int getLayoutDirection(@NonNull View view) {
        return view.getLayoutDirection();
    }

    @Nullable
    @Deprecated
    public static Matrix getMatrix(View view) {
        return view.getMatrix();
    }

    @Deprecated
    public static int getMeasuredHeightAndState(View view) {
        return view.getMeasuredHeightAndState();
    }

    @Deprecated
    public static int getMeasuredState(View view) {
        return view.getMeasuredState();
    }

    @Deprecated
    public static int getMeasuredWidthAndState(View view) {
        return view.getMeasuredWidthAndState();
    }

    @Deprecated
    public static int getMinimumHeight(@NonNull View view) {
        return view.getMinimumHeight();
    }

    @Deprecated
    public static int getMinimumWidth(@NonNull View view) {
        return view.getMinimumWidth();
    }

    public static int getNextClusterForwardId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.d(view);
        }
        return -1;
    }

    @Nullable
    public static String[] getOnReceiveContentMimeTypes(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return b1.a(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    @Deprecated
    public static int getOverScrollMode(View view) {
        return view.getOverScrollMode();
    }

    @Deprecated
    public static int getPaddingEnd(@NonNull View view) {
        return view.getPaddingEnd();
    }

    @Deprecated
    public static int getPaddingStart(@NonNull View view) {
        return view.getPaddingStart();
    }

    @Nullable
    @Deprecated
    public static ViewParent getParentForAccessibility(@NonNull View view) {
        return view.getParentForAccessibility();
    }

    @Deprecated
    public static float getPivotX(View view) {
        return view.getPivotX();
    }

    @Deprecated
    public static float getPivotY(View view) {
        return view.getPivotY();
    }

    @Nullable
    public static r2 getRootWindowInsets(@NonNull View view) {
        return s0.a(view);
    }

    @Deprecated
    public static float getRotation(View view) {
        return view.getRotation();
    }

    @Deprecated
    public static float getRotationX(View view) {
        return view.getRotationX();
    }

    @Deprecated
    public static float getRotationY(View view) {
        return view.getRotationY();
    }

    @Deprecated
    public static float getScaleX(View view) {
        return view.getScaleX();
    }

    @Deprecated
    public static float getScaleY(View view) {
        return view.getScaleY();
    }

    public static int getScrollIndicators(@NonNull View view) {
        return s0.b(view);
    }

    @Nullable
    public static CharSequence getStateDescription(@NonNull View view) {
        return (CharSequence) stateDescriptionProperty().b(view);
    }

    @NonNull
    public static List<Rect> getSystemGestureExclusionRects(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return z0.c(view);
        }
        return Collections.emptyList();
    }

    @Nullable
    public static String getTransitionName(@NonNull View view) {
        return r0.k(view);
    }

    @Deprecated
    public static float getTranslationX(View view) {
        return view.getTranslationX();
    }

    @Deprecated
    public static float getTranslationY(View view) {
        return view.getTranslationY();
    }

    public static float getTranslationZ(@NonNull View view) {
        return r0.l(view);
    }

    @Nullable
    @Deprecated
    public static w2 getWindowInsetsController(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return a1.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return new w2(window, view);
            }
        }
        return null;
    }

    @Deprecated
    public static int getWindowSystemUiVisibility(@NonNull View view) {
        return view.getWindowSystemUiVisibility();
    }

    @Deprecated
    public static float getX(View view) {
        return view.getX();
    }

    @Deprecated
    public static float getY(View view) {
        return view.getY();
    }

    public static float getZ(@NonNull View view) {
        return r0.m(view);
    }

    public static boolean hasAccessibilityDelegate(@NonNull View view) {
        return getAccessibilityDelegateInternal(view) != null;
    }

    public static boolean hasExplicitFocusable(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.e(view);
        }
        return view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(@NonNull View view) {
        return r0.n(view);
    }

    @Deprecated
    public static boolean hasOnClickListeners(@NonNull View view) {
        return view.hasOnClickListeners();
    }

    @Deprecated
    public static boolean hasOverlappingRendering(@NonNull View view) {
        return view.hasOverlappingRendering();
    }

    @Deprecated
    public static boolean hasTransientState(@NonNull View view) {
        return view.hasTransientState();
    }

    public static boolean isAccessibilityHeading(@NonNull View view) {
        Boolean bool = (Boolean) accessibilityHeadingProperty().b(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static boolean isAttachedToWindow(@NonNull View view) {
        return view.isAttachedToWindow();
    }

    public static boolean isFocusedByDefault(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.f(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(@NonNull View view) {
        return r0.o(view);
    }

    public static boolean isImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.g(view);
        }
        return true;
    }

    public static boolean isImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return a1.d(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isInLayout(@NonNull View view) {
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.h(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isLaidOut(@NonNull View view) {
        return view.isLaidOut();
    }

    @Deprecated
    public static boolean isLayoutDirectionResolved(@NonNull View view) {
        return view.isLayoutDirectionResolved();
    }

    public static boolean isNestedScrollingEnabled(@NonNull View view) {
        return r0.p(view);
    }

    @Deprecated
    public static boolean isOpaque(View view) {
        return view.isOpaque();
    }

    @Deprecated
    public static boolean isPaddingRelative(@NonNull View view) {
        return view.isPaddingRelative();
    }

    public static boolean isScreenReaderFocusable(@NonNull View view) {
        Boolean bool = (Boolean) screenReaderFocusableProperty().b(view);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        return false;
    }

    @Deprecated
    public static void jumpDrawablesToCurrentState(View view) {
        view.jumpDrawablesToCurrentState();
    }

    @Nullable
    public static View keyboardNavigationClusterSearch(@NonNull View view, @Nullable View view2, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.i(view, view2, i10);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g lambda$static$0(g gVar) {
        return gVar;
    }

    public static void notifyViewAccessibilityStateChangedIfNeeded(View view, int i10) {
        boolean z10;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z10) {
            if (i10 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(i10);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                    return;
                } catch (AbstractMethodError e2) {
                    Log.e(TAG, view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z10) {
            i11 = 2048;
        }
        obtain2.setEventType(i11);
        obtain2.setContentChangeTypes(i10);
        if (z10) {
            obtain2.getText().add(getAccessibilityPaneTitle(view));
            setImportantForAccessibilityIfNeeded(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void offsetLeftAndRight(@NonNull View view, int i10) {
        view.offsetLeftAndRight(i10);
    }

    public static void offsetTopAndBottom(@NonNull View view, int i10) {
        view.offsetTopAndBottom(i10);
    }

    @NonNull
    public static r2 onApplyWindowInsets(@NonNull View view, @NonNull r2 r2Var) {
        WindowInsets g10 = r2Var.g();
        if (g10 != null) {
            WindowInsets b3 = p0.b(view, g10);
            if (!b3.equals(g10)) {
                return r2.h(view, b3);
            }
        }
        return r2Var;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull j jVar) {
        view.onInitializeAccessibilityNodeInfo(jVar.a);
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    private static o0 paneTitleProperty() {
        return new m0(R.id.tag_accessibility_pane_title, 8, 28, 1);
    }

    @Deprecated
    public static boolean performAccessibilityAction(@NonNull View view, int i10, @Nullable Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static boolean performHapticFeedback(@NonNull View view, int i10) {
        int m10 = d.m(i10);
        if (m10 == -1) {
            return false;
        }
        return view.performHapticFeedback(m10);
    }

    @Nullable
    public static g performReceiveContent(@NonNull View view, @NonNull g gVar) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "performReceiveContent: " + gVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return b1.b(view, gVar);
        }
        a0 a0Var = (a0) view.getTag(R.id.tag_on_receive_content_listener);
        if (a0Var != null) {
            g a = ((q) a0Var).a(view, gVar);
            if (a == null) {
                return null;
            }
            return getFallback(view).a(a);
        }
        return getFallback(view).a(gVar);
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@NonNull View view) {
        view.postInvalidateOnAnimation();
    }

    @Deprecated
    public static void postOnAnimation(@NonNull View view, @NonNull Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    @SuppressLint({"LambdaLast"})
    @Deprecated
    public static void postOnAnimationDelayed(@NonNull View view, @NonNull Runnable runnable, long j3) {
        view.postOnAnimationDelayed(runnable, j3);
    }

    public static void removeAccessibilityAction(@NonNull View view, int i10) {
        removeActionWithId(i10, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    private static void removeActionWithId(int i10, View view) {
        List<c> actionList = getActionList(view);
        for (int i11 = 0; i11 < actionList.size(); i11++) {
            if (actionList.get(i11).a() == i10) {
                actionList.remove(i11);
                return;
            }
        }
    }

    public static void removeOnUnhandledKeyEventListener(@NonNull View view, @NonNull d1 d1Var) {
        if (Build.VERSION.SDK_INT >= 28) {
            y0.e(view, d1Var);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(d1Var);
            if (arrayList.size() == 0) {
                synchronized (e1.f22265d) {
                    int i10 = 0;
                    while (true) {
                        ArrayList arrayList2 = e1.f22265d;
                        if (i10 < arrayList2.size()) {
                            if (((WeakReference) arrayList2.get(i10)).get() == view) {
                                arrayList2.remove(i10);
                                return;
                            }
                            i10++;
                        } else {
                            return;
                        }
                    }
                }
            }
        }
    }

    public static void replaceAccessibilityAction(@NonNull View view, @NonNull c cVar, @Nullable CharSequence charSequence, @Nullable u uVar) {
        if (uVar == null && charSequence == null) {
            removeAccessibilityAction(view, cVar.a());
        } else {
            addAccessibilityAction(view, new c(null, cVar.f22964b, charSequence, uVar, cVar.f22965c));
        }
    }

    public static void requestApplyInsets(@NonNull View view) {
        p0.c(view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) y0.f(view, i10);
        }
        T t5 = (T) view.findViewById(i10);
        if (t5 != null) {
            return t5;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    public static boolean restoreDefaultFocus(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return v0.j(view);
        }
        return view.requestFocus();
    }

    public static void saveAttributeDataForStyleable(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            z0.d(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static o0 screenReaderFocusableProperty() {
        return new m0(R.id.tag_screen_reader_focusable, 0);
    }

    public static void setAccessibilityDelegate(@NonNull View view, @Nullable b bVar) {
        a aVar;
        if (bVar == null && (getAccessibilityDelegateInternal(view) instanceof a)) {
            bVar = new b();
        }
        setImportantForAccessibilityIfNeeded(view);
        if (bVar == null) {
            aVar = null;
        } else {
            aVar = bVar.f22247b;
        }
        view.setAccessibilityDelegate(aVar);
    }

    public static void setAccessibilityHeading(@NonNull View view, boolean z10) {
        accessibilityHeadingProperty().c(view, Boolean.valueOf(z10));
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(@NonNull View view, int i10) {
        view.setAccessibilityLiveRegion(i10);
    }

    public static void setAccessibilityPaneTitle(@NonNull View view, @Nullable CharSequence charSequence) {
        boolean z10;
        paneTitleProperty().c(view, charSequence);
        if (charSequence != null) {
            n0 n0Var = sAccessibilityPaneVisibilityManager;
            WeakHashMap weakHashMap = n0Var.f22327b;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z10));
            view.addOnAttachStateChangeListener(n0Var);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(n0Var);
                return;
            }
            return;
        }
        n0 n0Var2 = sAccessibilityPaneVisibilityManager;
        n0Var2.f22327b.remove(view);
        view.removeOnAttachStateChangeListener(n0Var2);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(n0Var2);
    }

    @Deprecated
    public static void setActivated(View view, boolean z10) {
        view.setActivated(z10);
    }

    @Deprecated
    public static void setAlpha(View view, float f10) {
        view.setAlpha(f10);
    }

    public static void setAutofillHints(@NonNull View view, @Nullable String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            v0.k(view, strArr);
        }
    }

    public static void setAutofillId(@NonNull View view, @Nullable q0.a aVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            y0.i(view, aVar);
        }
    }

    @Deprecated
    public static void setBackground(@NonNull View view, @Nullable Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setBackgroundTintList(@NonNull View view, @Nullable ColorStateList colorStateList) {
        r0.q(view, colorStateList);
    }

    public static void setBackgroundTintMode(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        r0.r(view, mode);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z10) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e2) {
                Log.e(TAG, "Unable to find childrenDrawingOrderEnabled", e2);
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, Boolean.valueOf(z10));
        } catch (IllegalAccessException e10) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e10);
        } catch (IllegalArgumentException e11) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e11);
        } catch (InvocationTargetException e12) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e12);
        }
    }

    @Deprecated
    public static void setClipBounds(@NonNull View view, @Nullable Rect rect) {
        view.setClipBounds(rect);
    }

    public static void setContentCaptureSession(@NonNull View view, @Nullable r0.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            z0.e(view, aVar);
        }
    }

    public static void setElevation(@NonNull View view, float f10) {
        r0.s(view, f10);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z10) {
        view.setFitsSystemWindows(z10);
    }

    public static void setFocusedByDefault(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            v0.l(view, z10);
        }
    }

    @Deprecated
    public static void setHasTransientState(@NonNull View view, boolean z10) {
        view.setHasTransientState(z10);
    }

    @Deprecated
    public static void setImportantForAccessibility(@NonNull View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    private static void setImportantForAccessibilityIfNeeded(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void setImportantForAutofill(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            v0.m(view, i10);
        }
    }

    public static void setImportantForContentCapture(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 30) {
            a1.e(view, i10);
        }
    }

    public static void setKeyboardNavigationCluster(@NonNull View view, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            v0.n(view, z10);
        }
    }

    @Deprecated
    public static void setLabelFor(@NonNull View view, int i10) {
        view.setLabelFor(i10);
    }

    @Deprecated
    public static void setLayerPaint(@NonNull View view, @Nullable Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    @Deprecated
    public static void setLayoutDirection(@NonNull View view, int i10) {
        view.setLayoutDirection(i10);
    }

    public static void setNestedScrollingEnabled(@NonNull View view, boolean z10) {
        r0.t(view, z10);
    }

    public static void setNextClusterForwardId(@NonNull View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            v0.o(view, i10);
        }
    }

    public static void setOnApplyWindowInsetsListener(@NonNull View view, @Nullable z zVar) {
        r0.u(view, zVar);
    }

    public static void setOnReceiveContentListener(@NonNull View view, @Nullable String[] strArr, @Nullable a0 a0Var) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 31) {
            b1.c(view, strArr, a0Var);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z11 = false;
        if (a0Var != null) {
            if (strArr != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            e.i(z10, "When the listener is set, MIME types must also be set");
        }
        if (strArr != null) {
            int length = strArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (strArr[i10].startsWith("*")) {
                    z11 = true;
                    break;
                }
                i10++;
            }
            e.i(true ^ z11, "A MIME type set here must not start with *: " + Arrays.toString(strArr));
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, a0Var);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i10) {
        view.setOverScrollMode(i10);
    }

    @Deprecated
    public static void setPaddingRelative(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.setPaddingRelative(i10, i11, i12, i13);
    }

    @Deprecated
    public static void setPivotX(View view, float f10) {
        view.setPivotX(f10);
    }

    @Deprecated
    public static void setPivotY(View view, float f10) {
        view.setPivotY(f10);
    }

    public static void setPointerIcon(@NonNull View view, @Nullable d0 d0Var) {
        t0.d(view, null);
    }

    @Deprecated
    public static void setRotation(View view, float f10) {
        view.setRotation(f10);
    }

    @Deprecated
    public static void setRotationX(View view, float f10) {
        view.setRotationX(f10);
    }

    @Deprecated
    public static void setRotationY(View view, float f10) {
        view.setRotationY(f10);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z10) {
        view.setSaveFromParentEnabled(z10);
    }

    @Deprecated
    public static void setScaleX(View view, float f10) {
        view.setScaleX(f10);
    }

    @Deprecated
    public static void setScaleY(View view, float f10) {
        view.setScaleY(f10);
    }

    public static void setScreenReaderFocusable(@NonNull View view, boolean z10) {
        screenReaderFocusableProperty().c(view, Boolean.valueOf(z10));
    }

    public static void setScrollIndicators(@NonNull View view, int i10) {
        s0.c(view, i10);
    }

    public static void setStateDescription(@NonNull View view, @Nullable CharSequence charSequence) {
        stateDescriptionProperty().c(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(@NonNull View view, @NonNull List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            z0.f(view, list);
        }
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            v0.p(view, charSequence);
        }
    }

    public static void setTransitionName(@NonNull View view, @Nullable String str) {
        r0.v(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f10) {
        view.setTranslationX(f10);
    }

    @Deprecated
    public static void setTranslationY(View view, float f10) {
        view.setTranslationY(f10);
    }

    public static void setTranslationZ(@NonNull View view, float f10) {
        r0.w(view, f10);
    }

    public static void setWindowInsetsAnimationCallback(@NonNull View view, @Nullable u1 u1Var) {
        z1 z1Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (u1Var != null) {
                z1Var = new z1(u1Var);
            }
            jb.z.r(view, z1Var);
            return;
        }
        PathInterpolator pathInterpolator = y1.f22370e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (u1Var == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener x1Var = new x1(view, u1Var);
        view.setTag(R.id.tag_window_insets_animation_callback, x1Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(x1Var);
        }
    }

    @Deprecated
    public static void setX(View view, float f10) {
        view.setX(f10);
    }

    @Deprecated
    public static void setY(View view, float f10) {
        view.setY(f10);
    }

    public static void setZ(@NonNull View view, float f10) {
        r0.x(view, f10);
    }

    public static boolean startDragAndDrop(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i10) {
        return t0.e(view, clipData, dragShadowBuilder, obj, i10);
    }

    public static boolean startNestedScroll(@NonNull View view, int i10) {
        return r0.y(view, i10);
    }

    private static o0 stateDescriptionProperty() {
        return new m0(R.id.tag_state_description, 64, 30, 2);
    }

    public static void stopNestedScroll(@NonNull View view) {
        r0.z(view);
    }

    private static void tickleInvalidationFlag(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void updateDragShadow(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        t0.f(view, dragShadowBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(@NonNull View view, int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2, int i12) {
        if (view instanceof t) {
            return ((t) view).dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
        }
        if (i12 == 0) {
            return dispatchNestedPreScroll(view, i10, i11, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, @NonNull int[] iArr2) {
        if (view instanceof n0.u) {
            ((n0.u) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
        } else {
            dispatchNestedScroll(view, i10, i11, i12, i13, iArr, i14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(@NonNull View view, int i10) {
        if (view instanceof t) {
            ((t) view).hasNestedScrollingParent(i10);
            return false;
        }
        if (i10 == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@NonNull View view, int i10, int i11, int i12, int i13) {
        view.postInvalidateOnAnimation(i10, i11, i12, i13);
    }

    public static void setScrollIndicators(@NonNull View view, int i10, int i11) {
        s0.d(view, i10, i11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(@NonNull View view, int i10, int i11) {
        if (view instanceof t) {
            return ((t) view).startNestedScroll(i10, i11);
        }
        if (i11 == 0) {
            return startNestedScroll(view, i10);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(@NonNull View view, int i10) {
        if (view instanceof t) {
            ((t) view).stopNestedScroll(i10);
        } else if (i10 == 0) {
            stopNestedScroll(view);
        }
    }

    public static boolean performHapticFeedback(@NonNull View view, int i10, int i11) {
        int m10 = d.m(i10);
        if (m10 == -1) {
            return false;
        }
        return view.performHapticFeedback(m10, i11);
    }

    private static void addAccessibilityAction(@NonNull View view, @NonNull c cVar) {
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(cVar.a(), view);
        getActionList(view).add(cVar);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14) {
        if (view instanceof t) {
            return ((t) view).dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
        }
        if (i14 == 0) {
            return dispatchNestedScroll(view, i10, i11, i12, i13, iArr);
        }
        return false;
    }
}
