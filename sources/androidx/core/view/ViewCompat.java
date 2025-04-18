package androidx.core.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.collection.SimpleArrayMap;
import androidx.core.graphics.Insets;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ContentInfoCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsAnimationCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.core.view.autofill.AutofillIdCompat;
import androidx.core.view.contentcapture.ContentCaptureSessionCompat;
import com.cooldev.gba.emulator.gameboy.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import org.objectweb.asm.Opcodes;

@SuppressLint({"PrivateConstructorForUtilityClass"})
/* loaded from: classes.dex */
public class ViewCompat {

    /* renamed from: a, reason: collision with root package name */
    public static WeakHashMap f18740a;

    /* renamed from: b, reason: collision with root package name */
    public static Field f18741b;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f18742c;
    public static final int[] d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final g e = new Object();

    /* renamed from: f, reason: collision with root package name */
    public static final AccessibilityPaneVisibilityManager f18743f = new AccessibilityPaneVisibilityManager();

    /* renamed from: androidx.core.view.ViewCompat$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass1 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.d(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.j(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.core.view.ViewCompat$2, reason: invalid class name */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api28Impl.b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.h(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$3, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass3 extends AccessibilityViewProperty<CharSequence> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Api30Impl.b(view);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api30Impl.f(view, (CharSequence) obj);
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
        }
    }

    /* renamed from: androidx.core.view.ViewCompat$4, reason: invalid class name */
    /* loaded from: classes2.dex */
    class AnonymousClass4 extends AccessibilityViewProperty<Boolean> {
        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final Object a(View view) {
            return Boolean.valueOf(Api28Impl.c(view));
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final void b(View view, Object obj) {
            Api28Impl.g(view, ((Boolean) obj).booleanValue());
        }

        @Override // androidx.core.view.ViewCompat.AccessibilityViewProperty
        public final boolean e(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            Boolean bool2 = (Boolean) obj2;
            return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
        }
    }

    /* loaded from: classes.dex */
    public static class AccessibilityPaneVisibilityManager implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* renamed from: a, reason: collision with root package name */
        public final WeakHashMap f18744a = new WeakHashMap();

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                for (Map.Entry entry : this.f18744a.entrySet()) {
                    View view = (View) entry.getKey();
                    boolean booleanValue = ((Boolean) entry.getValue()).booleanValue();
                    boolean z2 = view.isShown() && view.getWindowVisibility() == 0;
                    if (booleanValue != z2) {
                        ViewCompat.t(z2 ? 16 : 32, view);
                        entry.setValue(Boolean.valueOf(z2));
                    }
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }

    /* loaded from: classes.dex */
    public static abstract class AccessibilityViewProperty<T> {

        /* renamed from: a, reason: collision with root package name */
        public final int f18745a;

        /* renamed from: b, reason: collision with root package name */
        public final Class f18746b;

        /* renamed from: c, reason: collision with root package name */
        public final int f18747c;
        public final int d;

        public AccessibilityViewProperty(int i2, Class cls, int i3, int i4) {
            this.f18745a = i2;
            this.f18746b = cls;
            this.d = i3;
            this.f18747c = i4;
        }

        public abstract Object a(View view);

        public abstract void b(View view, Object obj);

        public final Object c(View view) {
            if (Build.VERSION.SDK_INT >= this.f18747c) {
                return a(view);
            }
            Object tag = view.getTag(this.f18745a);
            if (this.f18746b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public final void d(View view, Object obj) {
            if (Build.VERSION.SDK_INT >= this.f18747c) {
                b(view, obj);
                return;
            }
            if (e(c(view), obj)) {
                AccessibilityDelegateCompat e = ViewCompat.e(view);
                if (e == null) {
                    e = new AccessibilityDelegateCompat();
                }
                ViewCompat.A(view, e);
                view.setTag(this.f18745a, obj);
                ViewCompat.t(this.d, view);
            }
        }

        public boolean e(Object obj, Object obj2) {
            return !obj2.equals(obj);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api20Impl {
        @DoNotInline
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        @DoNotInline
        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api21Impl {
        @DoNotInline
        public static void a(@NonNull WindowInsets windowInsets, @NonNull View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        @DoNotInline
        public static WindowInsetsCompat b(@NonNull View view, @NonNull WindowInsetsCompat windowInsetsCompat, @NonNull Rect rect) {
            WindowInsets r2 = windowInsetsCompat.r();
            if (r2 != null) {
                return WindowInsetsCompat.s(view, view.computeSystemWindowInsets(r2, rect));
            }
            rect.setEmpty();
            return windowInsetsCompat;
        }

        @DoNotInline
        public static boolean c(@NonNull View view, float f2, float f3, boolean z2) {
            return view.dispatchNestedFling(f2, f3, z2);
        }

        @DoNotInline
        public static boolean d(@NonNull View view, float f2, float f3) {
            return view.dispatchNestedPreFling(f2, f3);
        }

        @DoNotInline
        public static boolean e(View view, int i2, int i3, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i2, i3, iArr, iArr2);
        }

        @DoNotInline
        public static boolean f(View view, int i2, int i3, int i4, int i5, int[] iArr) {
            return view.dispatchNestedScroll(i2, i3, i4, i5, iArr);
        }

        @DoNotInline
        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        @DoNotInline
        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        @DoNotInline
        public static float i(View view) {
            return view.getElevation();
        }

        @Nullable
        @DoNotInline
        public static WindowInsetsCompat j(@NonNull View view) {
            if (!WindowInsetsCompat.Api21ReflectionHolder.d || !view.isAttachedToWindow()) {
                return null;
            }
            try {
                Object obj = WindowInsetsCompat.Api21ReflectionHolder.f18790a.get(view.getRootView());
                if (obj == null) {
                    return null;
                }
                Rect rect = (Rect) WindowInsetsCompat.Api21ReflectionHolder.f18791b.get(obj);
                Rect rect2 = (Rect) WindowInsetsCompat.Api21ReflectionHolder.f18792c.get(obj);
                if (rect == null || rect2 == null) {
                    return null;
                }
                WindowInsetsCompat.BuilderImpl builderImpl = new WindowInsetsCompat.Builder().f18793a;
                builderImpl.e(Insets.b(rect.left, rect.top, rect.right, rect.bottom));
                builderImpl.g(Insets.b(rect2.left, rect2.top, rect2.right, rect2.bottom));
                WindowInsetsCompat b2 = builderImpl.b();
                b2.f18789a.r(b2);
                b2.f18789a.d(view.getRootView());
                return b2;
            } catch (IllegalAccessException e) {
                Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                return null;
            }
        }

        @DoNotInline
        public static String k(View view) {
            return view.getTransitionName();
        }

        @DoNotInline
        public static float l(View view) {
            return view.getTranslationZ();
        }

        @DoNotInline
        public static float m(@NonNull View view) {
            return view.getZ();
        }

        @DoNotInline
        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        @DoNotInline
        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        @DoNotInline
        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        @DoNotInline
        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        @DoNotInline
        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        @DoNotInline
        public static void s(View view, float f2) {
            view.setElevation(f2);
        }

        @DoNotInline
        public static void t(View view, boolean z2) {
            view.setNestedScrollingEnabled(z2);
        }

        @DoNotInline
        public static void u(@NonNull final View view, @Nullable final OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(R.id.tag_on_apply_window_listener, onApplyWindowInsetsListener);
            }
            if (onApplyWindowInsetsListener == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
            } else {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.core.view.ViewCompat.Api21Impl.1

                    /* renamed from: a, reason: collision with root package name */
                    public WindowInsetsCompat f18748a = null;

                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        WindowInsetsCompat s2 = WindowInsetsCompat.s(view2, windowInsets);
                        int i2 = Build.VERSION.SDK_INT;
                        OnApplyWindowInsetsListener onApplyWindowInsetsListener2 = onApplyWindowInsetsListener;
                        if (i2 < 30) {
                            Api21Impl.a(windowInsets, view);
                            if (s2.equals(this.f18748a)) {
                                return onApplyWindowInsetsListener2.onApplyWindowInsets(view2, s2).r();
                            }
                        }
                        this.f18748a = s2;
                        WindowInsetsCompat onApplyWindowInsets = onApplyWindowInsetsListener2.onApplyWindowInsets(view2, s2);
                        if (i2 >= 30) {
                            return onApplyWindowInsets.r();
                        }
                        WeakHashMap weakHashMap = ViewCompat.f18740a;
                        Api20Impl.c(view2);
                        return onApplyWindowInsets.r();
                    }
                });
            }
        }

        @DoNotInline
        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        @DoNotInline
        public static void w(View view, float f2) {
            view.setTranslationZ(f2);
        }

        @DoNotInline
        public static void x(@NonNull View view, float f2) {
            view.setZ(f2);
        }

        @DoNotInline
        public static boolean y(View view, int i2) {
            return view.startNestedScroll(i2);
        }

        @DoNotInline
        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api23Impl {
        @Nullable
        public static WindowInsetsCompat a(@NonNull View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            WindowInsetsCompat s2 = WindowInsetsCompat.s(null, rootWindowInsets);
            WindowInsetsCompat.Impl impl = s2.f18789a;
            impl.r(s2);
            impl.d(view.getRootView());
            return s2;
        }

        @DoNotInline
        public static int b(@NonNull View view) {
            return view.getScrollIndicators();
        }

        @DoNotInline
        public static void c(@NonNull View view, int i2) {
            view.setScrollIndicators(i2);
        }

        @DoNotInline
        public static void d(@NonNull View view, int i2, int i3) {
            view.setScrollIndicators(i2, i3);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api24Impl {
        @DoNotInline
        public static void a(@NonNull View view) {
            view.cancelDragAndDrop();
        }

        @DoNotInline
        public static void b(View view) {
            view.dispatchFinishTemporaryDetach();
        }

        @DoNotInline
        public static void c(View view) {
            view.dispatchStartTemporaryDetach();
        }

        @DoNotInline
        public static void d(@NonNull View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }

        @DoNotInline
        public static boolean e(@NonNull View view, @Nullable ClipData clipData, @NonNull View.DragShadowBuilder dragShadowBuilder, @Nullable Object obj, int i2) {
            return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i2);
        }

        @DoNotInline
        public static void f(@NonNull View view, @NonNull View.DragShadowBuilder dragShadowBuilder) {
            view.updateDragShadow(dragShadowBuilder);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api26Impl {
        @DoNotInline
        public static void a(@NonNull View view, Collection<View> collection, int i2) {
            view.addKeyboardNavigationClusters(collection, i2);
        }

        @DoNotInline
        public static AutofillId b(View view) {
            return view.getAutofillId();
        }

        @DoNotInline
        public static int c(View view) {
            return view.getImportantForAutofill();
        }

        @DoNotInline
        public static int d(@NonNull View view) {
            return view.getNextClusterForwardId();
        }

        @DoNotInline
        public static boolean e(@NonNull View view) {
            return view.hasExplicitFocusable();
        }

        @DoNotInline
        public static boolean f(@NonNull View view) {
            return view.isFocusedByDefault();
        }

        @DoNotInline
        public static boolean g(View view) {
            return view.isImportantForAutofill();
        }

        @DoNotInline
        public static boolean h(@NonNull View view) {
            return view.isKeyboardNavigationCluster();
        }

        @DoNotInline
        public static View i(@NonNull View view, View view2, int i2) {
            return view.keyboardNavigationClusterSearch(view2, i2);
        }

        @DoNotInline
        public static boolean j(@NonNull View view) {
            return view.restoreDefaultFocus();
        }

        @DoNotInline
        public static void k(@NonNull View view, String... strArr) {
            view.setAutofillHints(strArr);
        }

        @DoNotInline
        public static void l(@NonNull View view, boolean z2) {
            view.setFocusedByDefault(z2);
        }

        @DoNotInline
        public static void m(View view, int i2) {
            view.setImportantForAutofill(i2);
        }

        @DoNotInline
        public static void n(@NonNull View view, boolean z2) {
            view.setKeyboardNavigationCluster(z2);
        }

        @DoNotInline
        public static void o(View view, int i2) {
            view.setNextClusterForwardId(i2);
        }

        @DoNotInline
        public static void p(@NonNull View view, CharSequence charSequence) {
            view.setTooltipText(charSequence);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api28Impl {
        @DoNotInline
        public static void a(@NonNull View view, @NonNull final OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null) {
                simpleArrayMap = new SimpleArrayMap();
                view.setTag(R.id.tag_unhandled_key_listeners, simpleArrayMap);
            }
            Objects.requireNonNull(onUnhandledKeyEventListenerCompat);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener() { // from class: androidx.core.view.h
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    return ViewCompat.OnUnhandledKeyEventListenerCompat.this.a();
                }
            };
            simpleArrayMap.put(onUnhandledKeyEventListenerCompat, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        @DoNotInline
        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        @DoNotInline
        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        @DoNotInline
        public static void e(@NonNull View view, @NonNull OnUnhandledKeyEventListenerCompat onUnhandledKeyEventListenerCompat) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            SimpleArrayMap simpleArrayMap = (SimpleArrayMap) view.getTag(R.id.tag_unhandled_key_listeners);
            if (simpleArrayMap == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) simpleArrayMap.get(onUnhandledKeyEventListenerCompat)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        @DoNotInline
        public static <T> T f(View view, int i2) {
            return (T) view.requireViewById(i2);
        }

        @DoNotInline
        public static void g(View view, boolean z2) {
            view.setAccessibilityHeading(z2);
        }

        @DoNotInline
        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        @DoNotInline
        public static void i(View view, AutofillIdCompat autofillIdCompat) {
            view.setAutofillId(null);
        }

        @DoNotInline
        public static void j(View view, boolean z2) {
            view.setScreenReaderFocusable(z2);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api29Impl {
        @DoNotInline
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        @DoNotInline
        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        @DoNotInline
        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        @DoNotInline
        public static void d(@NonNull View view, @NonNull Context context, @NonNull int[] iArr, @Nullable AttributeSet attributeSet, @NonNull TypedArray typedArray, int i2, int i3) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i2, i3);
        }

        @DoNotInline
        public static void e(View view, ContentCaptureSessionCompat contentCaptureSessionCompat) {
            view.setContentCaptureSession(null);
        }

        @DoNotInline
        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static class Api30Impl {
        @DoNotInline
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        @DoNotInline
        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        @Nullable
        public static WindowInsetsControllerCompat c(@NonNull View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return new WindowInsetsControllerCompat(windowInsetsController);
            }
            return null;
        }

        @DoNotInline
        public static boolean d(View view) {
            return view.isImportantForContentCapture();
        }

        @DoNotInline
        public static void e(View view, int i2) {
            view.setImportantForContentCapture(i2);
        }

        @DoNotInline
        public static void f(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class Api31Impl {
        @Nullable
        @DoNotInline
        public static String[] a(@NonNull View view) {
            return view.getReceiveContentMimeTypes();
        }

        @Nullable
        @DoNotInline
        public static ContentInfoCompat b(@NonNull View view, @NonNull ContentInfoCompat contentInfoCompat) {
            ContentInfo a2 = contentInfoCompat.f18691a.a();
            Objects.requireNonNull(a2);
            ContentInfo i2 = androidx.compose.ui.contentcapture.a.i(a2);
            ContentInfo performReceiveContent = view.performReceiveContent(i2);
            if (performReceiveContent == null) {
                return null;
            }
            return performReceiveContent == i2 ? contentInfoCompat : new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(performReceiveContent));
        }

        @DoNotInline
        public static void c(@NonNull View view, @Nullable String[] strArr, @Nullable OnReceiveContentListener onReceiveContentListener) {
            if (onReceiveContentListener == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerAdapter(onReceiveContentListener));
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface FocusDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface FocusRealDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface FocusRelativeDirection {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface NestedScrollType {
    }

    @RequiresApi
    /* loaded from: classes.dex */
    public static final class OnReceiveContentListenerAdapter implements android.view.OnReceiveContentListener {

        /* renamed from: a, reason: collision with root package name */
        public final OnReceiveContentListener f18751a;

        public OnReceiveContentListenerAdapter(OnReceiveContentListener onReceiveContentListener) {
            this.f18751a = onReceiveContentListener;
        }

        public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            ContentInfoCompat contentInfoCompat = new ContentInfoCompat(new ContentInfoCompat.Compat31Impl(contentInfo));
            ContentInfoCompat a2 = this.f18751a.a(view, contentInfoCompat);
            if (a2 == null) {
                return null;
            }
            if (a2 == contentInfoCompat) {
                return contentInfo;
            }
            ContentInfo a3 = a2.f18691a.a();
            Objects.requireNonNull(a3);
            return androidx.compose.ui.contentcapture.a.i(a3);
        }
    }

    /* loaded from: classes.dex */
    public interface OnUnhandledKeyEventListenerCompat {
        boolean a();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface ScrollAxis {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes.dex */
    public @interface ScrollIndicators {
    }

    /* loaded from: classes.dex */
    public static class UnhandledKeyEventManager {
        public static final ArrayList d = new ArrayList();

        /* renamed from: a, reason: collision with root package name */
        public WeakHashMap f18752a;

        /* renamed from: b, reason: collision with root package name */
        public SparseArray f18753b;

        /* renamed from: c, reason: collision with root package name */
        public WeakReference f18754c;

        public static boolean b(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_unhandled_key_listeners);
            if (arrayList == null) {
                return false;
            }
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (((OnUnhandledKeyEventListenerCompat) arrayList.get(size)).a()) {
                    return true;
                }
            }
            return false;
        }

        public final View a(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f18752a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View a2 = a(viewGroup.getChildAt(childCount), keyEvent);
                        if (a2 != null) {
                            return a2;
                        }
                    }
                }
                if (b(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }
    }

    public static void A(View view, AccessibilityDelegateCompat accessibilityDelegateCompat) {
        if (accessibilityDelegateCompat == null && (f(view) instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter)) {
            accessibilityDelegateCompat = new AccessibilityDelegateCompat();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(accessibilityDelegateCompat == null ? null : accessibilityDelegateCompat.getBridge());
    }

    public static void B(View view, boolean z2) {
        new AccessibilityViewProperty(R.id.tag_accessibility_heading, Boolean.class, 0, 28).d(view, Boolean.valueOf(z2));
    }

    public static void C(View view, CharSequence charSequence) {
        new AccessibilityViewProperty(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).d(view, charSequence);
        AccessibilityPaneVisibilityManager accessibilityPaneVisibilityManager = f18743f;
        if (charSequence == null) {
            accessibilityPaneVisibilityManager.f18744a.remove(view);
            view.removeOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
        } else {
            accessibilityPaneVisibilityManager.f18744a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(accessibilityPaneVisibilityManager);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(accessibilityPaneVisibilityManager);
            }
        }
    }

    public static void D(View view, ColorStateList colorStateList) {
        Api21Impl.q(view, colorStateList);
    }

    public static void E(View view, PorterDuff.Mode mode) {
        Api21Impl.r(view, mode);
    }

    public static void F(View view, float f2) {
        Api21Impl.s(view, f2);
    }

    public static void G(View view, int i2) {
        Api26Impl.m(view, i2);
    }

    public static void H(View view, OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        Api21Impl.u(view, onApplyWindowInsetsListener);
    }

    public static void I(View view, PointerIconCompat pointerIconCompat) {
        Api24Impl.d(view, pointerIconCompat != null ? pointerIconCompat.f18728a : null);
    }

    public static void J(View view, boolean z2) {
        new AccessibilityViewProperty(R.id.tag_screen_reader_focusable, Boolean.class, 0, 28).d(view, Boolean.valueOf(z2));
    }

    public static void K(ViewGroup viewGroup, int i2) {
        Api23Impl.d(viewGroup, i2, 3);
    }

    public static void L(View view, CharSequence charSequence) {
        new AccessibilityViewProperty(R.id.tag_state_description, CharSequence.class, 64, 30).d(view, charSequence);
    }

    public static void M(View view, String str) {
        Api21Impl.v(view, str);
    }

    public static void N(View view, float f2) {
        Api21Impl.w(view, f2);
    }

    public static void O(View view, WindowInsetsAnimationCompat.Callback callback) {
        if (Build.VERSION.SDK_INT >= 30) {
            androidx.compose.foundation.layout.a.o(view, callback != null ? new WindowInsetsAnimationCompat.Impl30.ProxyCallback(callback) : null);
            return;
        }
        PathInterpolator pathInterpolator = WindowInsetsAnimationCompat.Impl21.e;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (callback == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener impl21OnApplyWindowInsetsListener = new WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener(view, callback);
        view.setTag(R.id.tag_window_insets_animation_callback, impl21OnApplyWindowInsetsListener);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(impl21OnApplyWindowInsetsListener);
        }
    }

    public static void P(View view, float f2) {
        Api21Impl.x(view, f2);
    }

    public static ViewPropertyAnimatorCompat a(View view) {
        if (f18740a == null) {
            f18740a = new WeakHashMap();
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat = (ViewPropertyAnimatorCompat) f18740a.get(view);
        if (viewPropertyAnimatorCompat != null) {
            return viewPropertyAnimatorCompat;
        }
        ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2 = new ViewPropertyAnimatorCompat(view);
        f18740a.put(view, viewPropertyAnimatorCompat2);
        return viewPropertyAnimatorCompat2;
    }

    public static void b(View view, WindowInsetsCompat windowInsetsCompat, Rect rect) {
        Api21Impl.b(view, windowInsetsCompat, rect);
    }

    public static void c(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets r2 = windowInsetsCompat.r();
        if (r2 != null) {
            WindowInsets a2 = Api20Impl.a(view, r2);
            if (a2.equals(r2)) {
                return;
            }
            WindowInsetsCompat.s(view, a2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [androidx.core.view.ViewCompat$UnhandledKeyEventManager, java.lang.Object] */
    public static boolean d(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = UnhandledKeyEventManager.d;
        UnhandledKeyEventManager unhandledKeyEventManager = (UnhandledKeyEventManager) view.getTag(R.id.tag_unhandled_key_event_manager);
        UnhandledKeyEventManager unhandledKeyEventManager2 = unhandledKeyEventManager;
        if (unhandledKeyEventManager == null) {
            ?? obj = new Object();
            obj.f18752a = null;
            obj.f18753b = null;
            obj.f18754c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            unhandledKeyEventManager2 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = unhandledKeyEventManager2.f18752a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = UnhandledKeyEventManager.d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (unhandledKeyEventManager2.f18752a == null) {
                            unhandledKeyEventManager2.f18752a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = UnhandledKeyEventManager.d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                unhandledKeyEventManager2.f18752a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    unhandledKeyEventManager2.f18752a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View a2 = unhandledKeyEventManager2.a(view, keyEvent);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (a2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (unhandledKeyEventManager2.f18753b == null) {
                    unhandledKeyEventManager2.f18753b = new SparseArray();
                }
                unhandledKeyEventManager2.f18753b.put(keyCode, new WeakReference(a2));
            }
        }
        return a2 != null;
    }

    public static AccessibilityDelegateCompat e(View view) {
        View.AccessibilityDelegate f2 = f(view);
        if (f2 == null) {
            return null;
        }
        return f2 instanceof AccessibilityDelegateCompat.AccessibilityDelegateAdapter ? ((AccessibilityDelegateCompat.AccessibilityDelegateAdapter) f2).f18688a : new AccessibilityDelegateCompat(f2);
    }

    public static View.AccessibilityDelegate f(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(view);
        }
        if (f18742c) {
            return null;
        }
        if (f18741b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f18741b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f18742c = true;
                return null;
            }
        }
        try {
            Object obj = f18741b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f18742c = true;
            return null;
        }
    }

    public static CharSequence g(View view) {
        return (CharSequence) new AccessibilityViewProperty(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28).c(view);
    }

    public static ArrayList h(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static ColorStateList i(View view) {
        return Api21Impl.g(view);
    }

    public static PorterDuff.Mode j(View view) {
        return Api21Impl.h(view);
    }

    public static float k(View view) {
        return Api21Impl.i(view);
    }

    public static int l(View view) {
        return Api26Impl.c(view);
    }

    public static String[] m(View view) {
        return Build.VERSION.SDK_INT >= 31 ? Api31Impl.a(view) : (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static WindowInsetsCompat n(View view) {
        return Api23Impl.a(view);
    }

    public static String o(View view) {
        return Api21Impl.k(view);
    }

    public static float p(View view) {
        return Api21Impl.l(view);
    }

    public static WindowInsetsControllerCompat q(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return Api30Impl.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new WindowInsetsControllerCompat(view, window);
                }
                return null;
            }
        }
        return null;
    }

    public static float r(View view) {
        return Api21Impl.m(view);
    }

    public static boolean s(View view) {
        return Api21Impl.p(view);
    }

    public static void t(int i2, View view) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = g(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : Opcodes.ACC_STRICT);
                obtain.setContentChangeTypes(i2);
                if (z2) {
                    obtain.getText().add(g(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i2 != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i2);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i2);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(g(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    public static WindowInsetsCompat u(View view, WindowInsetsCompat windowInsetsCompat) {
        WindowInsets r2 = windowInsetsCompat.r();
        if (r2 != null) {
            WindowInsets b2 = Api20Impl.b(view, r2);
            if (!b2.equals(r2)) {
                return WindowInsetsCompat.s(view, b2);
            }
        }
        return windowInsetsCompat;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ContentInfoCompat v(View view, ContentInfoCompat contentInfoCompat) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + contentInfoCompat + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return Api31Impl.b(view, contentInfoCompat);
        }
        OnReceiveContentListener onReceiveContentListener = (OnReceiveContentListener) view.getTag(R.id.tag_on_receive_content_listener);
        OnReceiveContentViewBehavior onReceiveContentViewBehavior = e;
        if (onReceiveContentListener == null) {
            if (view instanceof OnReceiveContentViewBehavior) {
                onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
            }
            return onReceiveContentViewBehavior.onReceiveContent(contentInfoCompat);
        }
        ContentInfoCompat a2 = onReceiveContentListener.a(view, contentInfoCompat);
        if (a2 == null) {
            return null;
        }
        if (view instanceof OnReceiveContentViewBehavior) {
            onReceiveContentViewBehavior = (OnReceiveContentViewBehavior) view;
        }
        return onReceiveContentViewBehavior.onReceiveContent(a2);
    }

    public static void w(int i2, View view) {
        ArrayList h2 = h(view);
        for (int i3 = 0; i3 < h2.size(); i3++) {
            if (((AccessibilityNodeInfoCompat.AccessibilityActionCompat) h2.get(i3)).a() == i2) {
                h2.remove(i3);
                return;
            }
        }
    }

    public static void x(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, String str, AccessibilityViewCommand accessibilityViewCommand) {
        if (accessibilityViewCommand == null && str == null) {
            w(accessibilityActionCompat.a(), view);
            t(0, view);
            return;
        }
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat2 = new AccessibilityNodeInfoCompat.AccessibilityActionCompat(null, accessibilityActionCompat.f18844b, str, accessibilityViewCommand, accessibilityActionCompat.f18845c);
        AccessibilityDelegateCompat e2 = e(view);
        if (e2 == null) {
            e2 = new AccessibilityDelegateCompat();
        }
        A(view, e2);
        w(accessibilityActionCompat2.a(), view);
        h(view).add(accessibilityActionCompat2);
        t(0, view);
    }

    public static void y(View view) {
        Api20Impl.c(view);
    }

    public static void z(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.d(view, context, iArr, attributeSet, typedArray, i2, 0);
        }
    }
}
