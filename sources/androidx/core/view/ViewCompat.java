package androidx.core.view;

import C2.m;
import R2.b;
import T.AbstractC0281l0;
import T.B;
import T.C0258a;
import T.C0260b;
import T.C0268f;
import T.C0275i0;
import T.G0;
import T.I;
import T.InterfaceC0287s;
import T.InterfaceC0292x;
import T.InterfaceC0293y;
import T.InterfaceC0294z;
import T.J;
import T.K;
import T.L;
import T.L0;
import T.N;
import T.O;
import T.P;
import T.Q;
import T.T;
import T.U;
import T.V;
import T.W;
import T.Y;
import T.Z;
import T.o0;
import T.p0;
import T.q0;
import U.d;
import U.i;
import U.l;
import U.t;
import W.a;
import Z.r;
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
import com.mbridge.msdk.foundation.entity.o;
import com.tools.arruler.photomeasure.camera.ruler.R;
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
    private static WeakHashMap<View, C0275i0> sViewPropertyAnimatorMap;
    private static final int[] ACCESSIBILITY_ACTIONS_RESOURCE_IDS = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    private static final InterfaceC0294z NO_OP_ON_RECEIVE_CONTENT_VIEW_BEHAVIOR = new Object();
    private static final J sAccessibilityPaneVisibilityManager = new J();

    @Deprecated
    public ViewCompat() {
    }

    private static K accessibilityHeadingProperty() {
        return new I(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3);
    }

    public static int addAccessibilityAction(@NonNull View view, @NonNull CharSequence charSequence, @NonNull t tVar) {
        int availableActionIdFromResources = getAvailableActionIdFromResources(view, charSequence);
        if (availableActionIdFromResources != -1) {
            addAccessibilityAction(view, new d(null, availableActionIdFromResources, charSequence, tVar, null));
        }
        return availableActionIdFromResources;
    }

    public static void addKeyboardNavigationClusters(@NonNull View view, @NonNull Collection<View> collection, int i9) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q.a(view, collection, i9);
        }
    }

    public static void addOnUnhandledKeyEventListener(@NonNull View view, @NonNull Y y4) {
        if (Build.VERSION.SDK_INT >= 28) {
            T.a(view, y4);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList == null) {
            arrayList = new ArrayList();
            view.setTag(R.id.tag_unhandled_key_listeners, arrayList);
        }
        arrayList.add(y4);
        if (arrayList.size() == 1) {
            ArrayList arrayList2 = Z.f2873d;
            synchronized (arrayList2) {
                try {
                    Iterator it = arrayList2.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((WeakReference) it.next()).get() == view) {
                            }
                        } else {
                            Z.f2873d.add(new WeakReference(view));
                            break;
                        }
                    }
                } finally {
                }
            }
        }
    }

    @NonNull
    @Deprecated
    public static C0275i0 animate(@NonNull View view) {
        if (sViewPropertyAnimatorMap == null) {
            sViewPropertyAnimatorMap = new WeakHashMap<>();
        }
        C0275i0 c0275i0 = sViewPropertyAnimatorMap.get(view);
        if (c0275i0 == null) {
            C0275i0 c0275i02 = new C0275i0(view);
            sViewPropertyAnimatorMap.put(view, c0275i02);
            return c0275i02;
        }
        return c0275i0;
    }

    private static void bindTempDetach() {
        try {
            sDispatchStartTemporaryDetach = View.class.getDeclaredMethod("dispatchStartTemporaryDetach", null);
            sDispatchFinishTemporaryDetach = View.class.getDeclaredMethod("dispatchFinishTemporaryDetach", null);
        } catch (NoSuchMethodException e4) {
            Log.e(TAG, "Couldn't find method", e4);
        }
        sTempDetachBound = true;
    }

    @Deprecated
    public static boolean canScrollHorizontally(View view, int i9) {
        return view.canScrollHorizontally(i9);
    }

    @Deprecated
    public static boolean canScrollVertically(View view, int i9) {
        return view.canScrollVertically(i9);
    }

    public static void cancelDragAndDrop(@NonNull View view) {
        P.a(view);
    }

    @Deprecated
    public static int combineMeasuredStates(int i9, int i10) {
        return View.combineMeasuredStates(i9, i10);
    }

    private static void compatOffsetLeftAndRight(View view, int i9) {
        view.offsetLeftAndRight(i9);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    private static void compatOffsetTopAndBottom(View view, int i9) {
        view.offsetTopAndBottom(i9);
        if (view.getVisibility() == 0) {
            tickleInvalidationFlag(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                tickleInvalidationFlag((View) parent);
            }
        }
    }

    @NonNull
    public static G0 computeSystemWindowInsets(@NonNull View view, @NonNull G0 g02, @NonNull Rect rect) {
        return N.b(view, g02, rect);
    }

    @NonNull
    public static G0 dispatchApplyWindowInsets(@NonNull View view, @NonNull G0 g02) {
        WindowInsets g9 = g02.g();
        if (g9 != null) {
            WindowInsets a6 = L.a(view, g9);
            if (!a6.equals(g9)) {
                return G0.h(view, a6);
            }
        }
        return g02;
    }

    public static void dispatchFinishTemporaryDetach(@NonNull View view) {
        P.b(view);
    }

    public static boolean dispatchNestedFling(@NonNull View view, float f9, float f10, boolean z8) {
        return N.c(view, f9, f10, z8);
    }

    public static boolean dispatchNestedPreFling(@NonNull View view, float f9, float f10) {
        return N.d(view, f9, f10);
    }

    public static boolean dispatchNestedPreScroll(@NonNull View view, int i9, int i10, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return N.e(view, i9, i10, iArr, iArr2);
    }

    public static boolean dispatchNestedScroll(@NonNull View view, int i9, int i10, int i11, int i12, @Nullable int[] iArr) {
        return N.f(view, i9, i10, i11, i12, iArr);
    }

    public static void dispatchStartTemporaryDetach(@NonNull View view) {
        P.c(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T.Z, java.lang.Object] */
    public static boolean dispatchUnhandledKeyEventBeforeCallback(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = Z.f2873d;
        Z z8 = (Z) view.getTag(R.id.tag_unhandled_key_event_manager);
        Z z9 = z8;
        if (z8 == null) {
            ?? obj = new Object();
            obj.f2874a = null;
            obj.b = null;
            obj.f2875c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            z9 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = z9.f2874a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = Z.f2873d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (z9.f2874a == null) {
                            z9.f2874a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = Z.f2873d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                z9.f2874a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    z9.f2874a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a6 = z9.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a6 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (z9.b == null) {
                    z9.b = new SparseArray();
                }
                z9.b.put(keyCode, new WeakReference(a6));
            }
        }
        if (a6 == null) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [T.Z, java.lang.Object] */
    public static boolean dispatchUnhandledKeyEventBeforeHierarchy(View view, KeyEvent keyEvent) {
        WeakReference weakReference;
        ArrayList arrayList;
        int size;
        int indexOfKey;
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList2 = Z.f2873d;
        Z z8 = (Z) view.getTag(R.id.tag_unhandled_key_event_manager);
        Z z9 = z8;
        if (z8 == null) {
            ?? obj = new Object();
            obj.f2874a = null;
            obj.b = null;
            obj.f2875c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            z9 = obj;
        }
        WeakReference weakReference2 = z9.f2875c;
        if (weakReference2 != null && weakReference2.get() == keyEvent) {
            return false;
        }
        z9.f2875c = new WeakReference(keyEvent);
        if (z9.b == null) {
            z9.b = new SparseArray();
        }
        SparseArray sparseArray = z9.b;
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
        if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (ArrayList) view2.getTag(R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
            return true;
        }
        o.v(arrayList.get(size));
        throw null;
    }

    public static void enableAccessibleClickableSpanSupport(@NonNull View view) {
        ensureAccessibilityDelegateCompat(view);
    }

    public static void ensureAccessibilityDelegateCompat(@NonNull View view) {
        C0260b accessibilityDelegate = getAccessibilityDelegate(view);
        if (accessibilityDelegate == null) {
            accessibilityDelegate = new C0260b();
        }
        setAccessibilityDelegate(view, accessibilityDelegate);
    }

    @Deprecated
    public static int generateViewId() {
        return View.generateViewId();
    }

    @Nullable
    public static C0260b getAccessibilityDelegate(@NonNull View view) {
        View.AccessibilityDelegate accessibilityDelegateInternal = getAccessibilityDelegateInternal(view);
        if (accessibilityDelegateInternal == null) {
            return null;
        }
        if (accessibilityDelegateInternal instanceof C0258a) {
            return ((C0258a) accessibilityDelegateInternal).f2876a;
        }
        return new C0260b(accessibilityDelegateInternal);
    }

    @Nullable
    private static View.AccessibilityDelegate getAccessibilityDelegateInternal(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return U.a(view);
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
    public static l getAccessibilityNodeProvider(@NonNull View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider != null) {
            return new l(accessibilityNodeProvider);
        }
        return null;
    }

    @Nullable
    public static CharSequence getAccessibilityPaneTitle(@NonNull View view) {
        return (CharSequence) paneTitleProperty().c(view);
    }

    private static List<d> getActionList(View view) {
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
    public static a getAutofillId(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new a(Q.b(view));
        }
        return null;
    }

    private static int getAvailableActionIdFromResources(View view, @NonNull CharSequence charSequence) {
        boolean z8;
        List<d> actionList = getActionList(view);
        for (int i9 = 0; i9 < actionList.size(); i9++) {
            if (TextUtils.equals(charSequence, ((AccessibilityNodeInfo.AccessibilityAction) actionList.get(i9).f3093a).getLabel())) {
                return actionList.get(i9).a();
            }
        }
        int i10 = -1;
        int i11 = 0;
        while (true) {
            int[] iArr = ACCESSIBILITY_ACTIONS_RESOURCE_IDS;
            if (i11 >= iArr.length || i10 != -1) {
                break;
            }
            int i12 = iArr[i11];
            boolean z9 = true;
            for (int i13 = 0; i13 < actionList.size(); i13++) {
                if (actionList.get(i13).a() != i12) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 &= z8;
            }
            if (z9) {
                i10 = i12;
            }
            i11++;
        }
        return i10;
    }

    @Nullable
    public static ColorStateList getBackgroundTintList(@NonNull View view) {
        return N.g(view);
    }

    @Nullable
    public static PorterDuff.Mode getBackgroundTintMode(@NonNull View view) {
        return N.h(view);
    }

    @Nullable
    @Deprecated
    public static Rect getClipBounds(@NonNull View view) {
        return view.getClipBounds();
    }

    @Nullable
    public static X.a getContentCaptureSession(@NonNull View view) {
        ContentCaptureSession b;
        if (Build.VERSION.SDK_INT < 29 || (b = U.b(view)) == null) {
            return null;
        }
        return new X.a(b, view);
    }

    @Nullable
    @Deprecated
    public static Display getDisplay(@NonNull View view) {
        return view.getDisplay();
    }

    public static float getElevation(@NonNull View view) {
        return N.i(view);
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
    private static InterfaceC0294z getFallback(@NonNull View view) {
        if (view instanceof InterfaceC0294z) {
            return (InterfaceC0294z) view;
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
            return Q.c(view);
        }
        return 0;
    }

    public static int getImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return V.a(view);
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
            return Q.d(view);
        }
        return -1;
    }

    @Nullable
    public static String[] getOnReceiveContentMimeTypes(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return W.a(view);
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
    public static G0 getRootWindowInsets(@NonNull View view) {
        return O.a(view);
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
        return O.b(view);
    }

    @Nullable
    public static CharSequence getStateDescription(@NonNull View view) {
        return (CharSequence) stateDescriptionProperty().c(view);
    }

    @NonNull
    public static List<Rect> getSystemGestureExclusionRects(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return U.c(view);
        }
        return Collections.emptyList();
    }

    @Nullable
    public static String getTransitionName(@NonNull View view) {
        return N.k(view);
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
        return N.l(view);
    }

    @Nullable
    @Deprecated
    public static L0 getWindowInsetsController(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return V.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window == null) {
                    return null;
                }
                return new L0(window, view);
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
        return N.m(view);
    }

    public static boolean hasAccessibilityDelegate(@NonNull View view) {
        if (getAccessibilityDelegateInternal(view) != null) {
            return true;
        }
        return false;
    }

    public static boolean hasExplicitFocusable(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Q.e(view);
        }
        return view.hasFocusable();
    }

    public static boolean hasNestedScrollingParent(@NonNull View view) {
        return N.n(view);
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
        Boolean bool = (Boolean) accessibilityHeadingProperty().c(view);
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
            return Q.f(view);
        }
        return false;
    }

    public static boolean isImportantForAccessibility(@NonNull View view) {
        return N.o(view);
    }

    public static boolean isImportantForAutofill(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Q.g(view);
        }
        return true;
    }

    public static boolean isImportantForContentCapture(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return V.d(view);
        }
        return false;
    }

    @Deprecated
    public static boolean isInLayout(@NonNull View view) {
        return view.isInLayout();
    }

    public static boolean isKeyboardNavigationCluster(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Q.h(view);
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
        return N.p(view);
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
        Boolean bool = (Boolean) screenReaderFocusableProperty().c(view);
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
    public static View keyboardNavigationClusterSearch(@NonNull View view, @Nullable View view2, int i9) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Q.i(view, view2, i9);
        }
        return null;
    }

    public static void notifyViewAccessibilityStateChangedIfNeeded(View view, int i9) {
        boolean z8;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (getAccessibilityPaneTitle(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i10 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z8) {
            if (i9 == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(i9);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(getAccessibilityPaneTitle(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i9);
                    return;
                } catch (AbstractMethodError e4) {
                    Log.e(TAG, view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e4);
                    return;
                }
            }
            return;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z8) {
            i10 = 2048;
        }
        obtain2.setEventType(i10);
        obtain2.setContentChangeTypes(i9);
        if (z8) {
            obtain2.getText().add(getAccessibilityPaneTitle(view));
            setImportantForAccessibilityIfNeeded(view);
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static void offsetLeftAndRight(@NonNull View view, int i9) {
        view.offsetLeftAndRight(i9);
    }

    public static void offsetTopAndBottom(@NonNull View view, int i9) {
        view.offsetTopAndBottom(i9);
    }

    @NonNull
    public static G0 onApplyWindowInsets(@NonNull View view, @NonNull G0 g02) {
        WindowInsets g9 = g02.g();
        if (g9 != null) {
            WindowInsets b = L.b(view, g9);
            if (!b.equals(g9)) {
                return G0.h(view, b);
            }
        }
        return g02;
    }

    @Deprecated
    public static void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onInitializeAccessibilityEvent(accessibilityEvent);
    }

    @Deprecated
    public static void onInitializeAccessibilityNodeInfo(@NonNull View view, @NonNull i iVar) {
        view.onInitializeAccessibilityNodeInfo(iVar.f3098a);
    }

    @Deprecated
    public static void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        view.onPopulateAccessibilityEvent(accessibilityEvent);
    }

    private static K paneTitleProperty() {
        return new I(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1);
    }

    @Deprecated
    public static boolean performAccessibilityAction(@NonNull View view, int i9, @Nullable Bundle bundle) {
        return view.performAccessibilityAction(i9, bundle);
    }

    public static boolean performHapticFeedback(@NonNull View view, int i9) {
        int o3 = b.o(i9);
        if (o3 == -1) {
            return false;
        }
        return view.performHapticFeedback(o3);
    }

    @Nullable
    public static C0268f performReceiveContent(@NonNull View view, @NonNull C0268f c0268f) {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "performReceiveContent: " + c0268f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return W.b(view, c0268f);
        }
        InterfaceC0293y interfaceC0293y = (InterfaceC0293y) view.getTag(R.id.tag_on_receive_content_listener);
        if (interfaceC0293y != null) {
            C0268f a6 = ((r) interfaceC0293y).a(view, c0268f);
            if (a6 == null) {
                return null;
            }
            return getFallback(view).a(a6);
        }
        return getFallback(view).a(c0268f);
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
    public static void postOnAnimationDelayed(@NonNull View view, @NonNull Runnable runnable, long j7) {
        view.postOnAnimationDelayed(runnable, j7);
    }

    public static void removeAccessibilityAction(@NonNull View view, int i9) {
        removeActionWithId(i9, view);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    private static void removeActionWithId(int i9, View view) {
        List<d> actionList = getActionList(view);
        for (int i10 = 0; i10 < actionList.size(); i10++) {
            if (actionList.get(i10).a() == i9) {
                actionList.remove(i10);
                return;
            }
        }
    }

    public static void removeOnUnhandledKeyEventListener(@NonNull View view, @NonNull Y y4) {
        if (Build.VERSION.SDK_INT >= 28) {
            T.e(view, y4);
            return;
        }
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
        if (arrayList != null) {
            arrayList.remove(y4);
            if (arrayList.size() == 0) {
                synchronized (Z.f2873d) {
                    int i9 = 0;
                    while (true) {
                        try {
                            ArrayList arrayList2 = Z.f2873d;
                            if (i9 < arrayList2.size()) {
                                if (((WeakReference) arrayList2.get(i9)).get() == view) {
                                    arrayList2.remove(i9);
                                    return;
                                }
                                i9++;
                            } else {
                                return;
                            }
                        } finally {
                        }
                    }
                }
            }
        }
    }

    public static void replaceAccessibilityAction(@NonNull View view, @NonNull d dVar, @Nullable CharSequence charSequence, @Nullable t tVar) {
        if (tVar == null && charSequence == null) {
            removeAccessibilityAction(view, dVar.a());
        } else {
            addAccessibilityAction(view, new d(null, dVar.b, charSequence, tVar, dVar.f3094c));
        }
    }

    public static void requestApplyInsets(@NonNull View view) {
        L.c(view);
    }

    @NonNull
    public static <T extends View> T requireViewById(@NonNull View view, int i9) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (T) T.f(view, i9);
        }
        T t9 = (T) view.findViewById(i9);
        if (t9 != null) {
            return t9;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static int resolveSizeAndState(int i9, int i10, int i11) {
        return View.resolveSizeAndState(i9, i10, i11);
    }

    public static boolean restoreDefaultFocus(@NonNull View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return Q.j(view);
        }
        return view.requestFocus();
    }

    public static void saveAttributeDataForStyleable(@NonNull View view, @NonNull @SuppressLint({"ContextFirst"}) Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i9, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            U.d(view, context, iArr, attributeSet, typedArray, i9, i10);
        }
    }

    private static K screenReaderFocusableProperty() {
        return new I(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28, 0);
    }

    public static void setAccessibilityDelegate(@NonNull View view, @Nullable C0260b c0260b) {
        C0258a c0258a;
        if (c0260b == null && (getAccessibilityDelegateInternal(view) instanceof C0258a)) {
            c0260b = new C0260b();
        }
        setImportantForAccessibilityIfNeeded(view);
        if (c0260b == null) {
            c0258a = null;
        } else {
            c0258a = c0260b.b;
        }
        view.setAccessibilityDelegate(c0258a);
    }

    public static void setAccessibilityHeading(@NonNull View view, boolean z8) {
        accessibilityHeadingProperty().d(view, Boolean.valueOf(z8));
    }

    @Deprecated
    public static void setAccessibilityLiveRegion(@NonNull View view, int i9) {
        view.setAccessibilityLiveRegion(i9);
    }

    public static void setAccessibilityPaneTitle(@NonNull View view, @Nullable CharSequence charSequence) {
        boolean z8;
        paneTitleProperty().d(view, charSequence);
        if (charSequence != null) {
            J j7 = sAccessibilityPaneVisibilityManager;
            WeakHashMap weakHashMap = j7.b;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z8));
            view.addOnAttachStateChangeListener(j7);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(j7);
                return;
            }
            return;
        }
        J j9 = sAccessibilityPaneVisibilityManager;
        j9.b.remove(view);
        view.removeOnAttachStateChangeListener(j9);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(j9);
    }

    @Deprecated
    public static void setActivated(View view, boolean z8) {
        view.setActivated(z8);
    }

    @Deprecated
    public static void setAlpha(View view, float f9) {
        view.setAlpha(f9);
    }

    public static void setAutofillHints(@NonNull View view, @Nullable String... strArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q.k(view, strArr);
        }
    }

    public static void setAutofillId(@NonNull View view, @Nullable a aVar) {
        if (Build.VERSION.SDK_INT >= 28) {
            T.i(view, aVar);
        }
    }

    @Deprecated
    public static void setBackground(@NonNull View view, @Nullable Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void setBackgroundTintList(@NonNull View view, @Nullable ColorStateList colorStateList) {
        N.q(view, colorStateList);
    }

    public static void setBackgroundTintMode(@NonNull View view, @Nullable PorterDuff.Mode mode) {
        N.r(view, mode);
    }

    @SuppressLint({"BanUncheckedReflection"})
    @Deprecated
    public static void setChildrenDrawingOrderEnabled(ViewGroup viewGroup, boolean z8) {
        if (sChildrenDrawingOrderMethod == null) {
            try {
                sChildrenDrawingOrderMethod = ViewGroup.class.getDeclaredMethod("setChildrenDrawingOrderEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException e4) {
                Log.e(TAG, "Unable to find childrenDrawingOrderEnabled", e4);
            }
            sChildrenDrawingOrderMethod.setAccessible(true);
        }
        try {
            sChildrenDrawingOrderMethod.invoke(viewGroup, Boolean.valueOf(z8));
        } catch (IllegalAccessException e9) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e9);
        } catch (IllegalArgumentException e10) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e10);
        } catch (InvocationTargetException e11) {
            Log.e(TAG, "Unable to invoke childrenDrawingOrderEnabled", e11);
        }
    }

    @Deprecated
    public static void setClipBounds(@NonNull View view, @Nullable Rect rect) {
        view.setClipBounds(rect);
    }

    public static void setContentCaptureSession(@NonNull View view, @Nullable X.a aVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            U.e(view, aVar);
        }
    }

    public static void setElevation(@NonNull View view, float f9) {
        N.s(view, f9);
    }

    @Deprecated
    public static void setFitsSystemWindows(View view, boolean z8) {
        view.setFitsSystemWindows(z8);
    }

    public static void setFocusedByDefault(@NonNull View view, boolean z8) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q.l(view, z8);
        }
    }

    @Deprecated
    public static void setHasTransientState(@NonNull View view, boolean z8) {
        view.setHasTransientState(z8);
    }

    @Deprecated
    public static void setImportantForAccessibility(@NonNull View view, int i9) {
        view.setImportantForAccessibility(i9);
    }

    private static void setImportantForAccessibilityIfNeeded(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void setImportantForAutofill(@NonNull View view, int i9) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q.m(view, i9);
        }
    }

    public static void setImportantForContentCapture(@NonNull View view, int i9) {
        if (Build.VERSION.SDK_INT >= 30) {
            V.e(view, i9);
        }
    }

    public static void setKeyboardNavigationCluster(@NonNull View view, boolean z8) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q.n(view, z8);
        }
    }

    @Deprecated
    public static void setLabelFor(@NonNull View view, int i9) {
        view.setLabelFor(i9);
    }

    @Deprecated
    public static void setLayerPaint(@NonNull View view, @Nullable Paint paint) {
        view.setLayerPaint(paint);
    }

    @Deprecated
    public static void setLayerType(View view, int i9, Paint paint) {
        view.setLayerType(i9, paint);
    }

    @Deprecated
    public static void setLayoutDirection(@NonNull View view, int i9) {
        view.setLayoutDirection(i9);
    }

    public static void setNestedScrollingEnabled(@NonNull View view, boolean z8) {
        N.t(view, z8);
    }

    public static void setNextClusterForwardId(@NonNull View view, int i9) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q.o(view, i9);
        }
    }

    public static void setOnApplyWindowInsetsListener(@NonNull View view, @Nullable InterfaceC0292x interfaceC0292x) {
        N.u(view, interfaceC0292x);
    }

    public static void setOnReceiveContentListener(@NonNull View view, @Nullable String[] strArr, @Nullable InterfaceC0293y interfaceC0293y) {
        boolean z8;
        if (Build.VERSION.SDK_INT >= 31) {
            W.c(view, strArr, interfaceC0293y);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z9 = false;
        if (interfaceC0293y != null) {
            if (strArr != null) {
                z8 = true;
            } else {
                z8 = false;
            }
            m.e("When the listener is set, MIME types must also be set", z8);
        }
        if (strArr != null) {
            int length = strArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (strArr[i9].startsWith("*")) {
                    z9 = true;
                    break;
                }
                i9++;
            }
            m.e("A MIME type set here must not start with *: " + Arrays.toString(strArr), true ^ z9);
        }
        view.setTag(R.id.tag_on_receive_content_mime_types, strArr);
        view.setTag(R.id.tag_on_receive_content_listener, interfaceC0293y);
    }

    @Deprecated
    public static void setOverScrollMode(View view, int i9) {
        view.setOverScrollMode(i9);
    }

    @Deprecated
    public static void setPaddingRelative(@NonNull View view, int i9, int i10, int i11, int i12) {
        view.setPaddingRelative(i9, i10, i11, i12);
    }

    @Deprecated
    public static void setPivotX(View view, float f9) {
        view.setPivotX(f9);
    }

    @Deprecated
    public static void setPivotY(View view, float f9) {
        view.setPivotY(f9);
    }

    public static void setPointerIcon(@NonNull View view, @Nullable B b) {
        P.d(view, null);
    }

    @Deprecated
    public static void setRotation(View view, float f9) {
        view.setRotation(f9);
    }

    @Deprecated
    public static void setRotationX(View view, float f9) {
        view.setRotationX(f9);
    }

    @Deprecated
    public static void setRotationY(View view, float f9) {
        view.setRotationY(f9);
    }

    @Deprecated
    public static void setSaveFromParentEnabled(View view, boolean z8) {
        view.setSaveFromParentEnabled(z8);
    }

    @Deprecated
    public static void setScaleX(View view, float f9) {
        view.setScaleX(f9);
    }

    @Deprecated
    public static void setScaleY(View view, float f9) {
        view.setScaleY(f9);
    }

    public static void setScreenReaderFocusable(@NonNull View view, boolean z8) {
        screenReaderFocusableProperty().d(view, Boolean.valueOf(z8));
    }

    public static void setScrollIndicators(@NonNull View view, int i9) {
        O.c(view, i9);
    }

    public static void setStateDescription(@NonNull View view, @Nullable CharSequence charSequence) {
        stateDescriptionProperty().d(view, charSequence);
    }

    public static void setSystemGestureExclusionRects(@NonNull View view, @NonNull List<Rect> list) {
        if (Build.VERSION.SDK_INT >= 29) {
            U.f(view, list);
        }
    }

    public static void setTooltipText(@NonNull View view, @Nullable CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Q.p(view, charSequence);
        }
    }

    public static void setTransitionName(@NonNull View view, @Nullable String str) {
        N.v(view, str);
    }

    @Deprecated
    public static void setTranslationX(View view, float f9) {
        view.setTranslationX(f9);
    }

    @Deprecated
    public static void setTranslationY(View view, float f9) {
        view.setTranslationY(f9);
    }

    public static void setTranslationZ(@NonNull View view, float f9) {
        N.w(view, f9);
    }

    public static void setWindowInsetsAnimationCallback(@NonNull View view, @Nullable AbstractC0281l0 abstractC0281l0) {
        q0 q0Var = null;
        if (Build.VERSION.SDK_INT >= 30) {
            if (abstractC0281l0 != null) {
                q0Var = new q0(abstractC0281l0);
            }
            view.setWindowInsetsAnimationCallback(q0Var);
            return;
        }
        PathInterpolator pathInterpolator = p0.f2918e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (abstractC0281l0 == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener o0Var = new o0(view, abstractC0281l0);
        view.setTag(R.id.tag_window_insets_animation_callback, o0Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(o0Var);
        }
    }

    @Deprecated
    public static void setX(View view, float f9) {
        view.setX(f9);
    }

    @Deprecated
    public static void setY(View view, float f9) {
        view.setY(f9);
    }

    public static void setZ(@NonNull View view, float f9) {
        N.x(view, f9);
    }

    public static boolean startDragAndDrop(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i9) {
        return P.e(view, clipData, dragShadowBuilder, obj, i9);
    }

    public static boolean startNestedScroll(@NonNull View view, int i9) {
        return N.y(view, i9);
    }

    private static K stateDescriptionProperty() {
        return new I(R.id.tag_state_description, CharSequence.class, 64, 30, 2);
    }

    public static void stopNestedScroll(@NonNull View view) {
        N.z(view);
    }

    private static void tickleInvalidationFlag(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static void updateDragShadow(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
        P.f(view, dragShadowBuilder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedPreScroll(@NonNull View view, int i9, int i10, @Nullable int[] iArr, @Nullable int[] iArr2, int i11) {
        if (view instanceof T.r) {
            return ((T.r) view).dispatchNestedPreScroll(i9, i10, iArr, iArr2, i11);
        }
        if (i11 == 0) {
            return dispatchNestedPreScroll(view, i9, i10, iArr, iArr2);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void dispatchNestedScroll(@NonNull View view, int i9, int i10, int i11, int i12, @Nullable int[] iArr, int i13, @NonNull int[] iArr2) {
        if (view instanceof InterfaceC0287s) {
            ((InterfaceC0287s) view).dispatchNestedScroll(i9, i10, i11, i12, iArr, i13, iArr2);
        } else {
            dispatchNestedScroll(view, i9, i10, i11, i12, iArr, i13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean hasNestedScrollingParent(@NonNull View view, int i9) {
        if (view instanceof T.r) {
            ((T.r) view).hasNestedScrollingParent(i9);
            return false;
        }
        if (i9 == 0) {
            return hasNestedScrollingParent(view);
        }
        return false;
    }

    @Deprecated
    public static void postInvalidateOnAnimation(@NonNull View view, int i9, int i10, int i11, int i12) {
        view.postInvalidateOnAnimation(i9, i10, i11, i12);
    }

    public static void setScrollIndicators(@NonNull View view, int i9, int i10) {
        O.d(view, i9, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean startNestedScroll(@NonNull View view, int i9, int i10) {
        if (view instanceof T.r) {
            return ((T.r) view).startNestedScroll(i9, i10);
        }
        if (i10 == 0) {
            return startNestedScroll(view, i9);
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void stopNestedScroll(@NonNull View view, int i9) {
        if (view instanceof T.r) {
            ((T.r) view).stopNestedScroll(i9);
        } else if (i9 == 0) {
            stopNestedScroll(view);
        }
    }

    public static boolean performHapticFeedback(@NonNull View view, int i9, int i10) {
        int o3 = b.o(i9);
        if (o3 == -1) {
            return false;
        }
        return view.performHapticFeedback(o3, i10);
    }

    private static void addAccessibilityAction(@NonNull View view, @NonNull d dVar) {
        ensureAccessibilityDelegateCompat(view);
        removeActionWithId(dVar.a(), view);
        getActionList(view).add(dVar);
        notifyViewAccessibilityStateChangedIfNeeded(view, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean dispatchNestedScroll(@NonNull View view, int i9, int i10, int i11, int i12, @Nullable int[] iArr, int i13) {
        if (view instanceof T.r) {
            return ((T.r) view).dispatchNestedScroll(i9, i10, i11, i12, iArr, i13);
        }
        if (i13 == 0) {
            return dispatchNestedScroll(view, i9, i10, i11, i12, iArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C0268f lambda$static$0(C0268f c0268f) {
        return c0268f;
    }
}
