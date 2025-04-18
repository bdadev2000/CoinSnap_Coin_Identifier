package androidx.customview.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayCompatKt;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import androidx.customview.widget.FocusStrategy;
import com.google.android.gms.common.api.Api;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import org.objectweb.asm.Opcodes;

/* loaded from: classes.dex */
public abstract class ExploreByTouchHelper extends AccessibilityDelegateCompat {
    private static final String DEFAULT_CLASS_NAME = "android.view.View";
    public static final int HOST_ID = -1;
    public static final int INVALID_ID = Integer.MIN_VALUE;
    private static final Rect INVALID_PARENT_BOUNDS = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    private static final FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> NODE_ADAPTER = new Object();
    private static final FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> SPARSE_VALUES_ADAPTER = new Object();
    private final View mHost;
    private final AccessibilityManager mManager;
    private MyNodeProvider mNodeProvider;
    private final Rect mTempScreenRect = new Rect();
    private final Rect mTempParentRect = new Rect();
    private final Rect mTempVisibleRect = new Rect();
    private final int[] mTempGlobalRect = new int[2];
    int mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
    int mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
    private int mHoveredVirtualViewId = Integer.MIN_VALUE;

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$1, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass1 implements FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.BoundsAdapter
        public final void a(Object obj, Rect rect) {
            ((AccessibilityNodeInfoCompat) obj).f(rect);
        }
    }

    /* renamed from: androidx.customview.widget.ExploreByTouchHelper$2, reason: invalid class name */
    /* loaded from: classes.dex */
    public class AnonymousClass2 implements FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> {
        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public final AccessibilityNodeInfoCompat a(SparseArrayCompat sparseArrayCompat, int i2) {
            return (AccessibilityNodeInfoCompat) sparseArrayCompat.h(i2);
        }

        @Override // androidx.customview.widget.FocusStrategy.CollectionAdapter
        public final int b(SparseArrayCompat sparseArrayCompat) {
            return sparseArrayCompat.g();
        }
    }

    /* loaded from: classes.dex */
    public class MyNodeProvider extends AccessibilityNodeProviderCompat {
        public MyNodeProvider() {
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat b(int i2) {
            return new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain(ExploreByTouchHelper.this.obtainAccessibilityNodeInfo(i2).f18826a));
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final AccessibilityNodeInfoCompat c(int i2) {
            ExploreByTouchHelper exploreByTouchHelper = ExploreByTouchHelper.this;
            int i3 = i2 == 2 ? exploreByTouchHelper.mAccessibilityFocusedVirtualViewId : exploreByTouchHelper.mKeyboardFocusedVirtualViewId;
            if (i3 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i3);
        }

        @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
        public final boolean d(int i2, int i3, Bundle bundle) {
            return ExploreByTouchHelper.this.performAction(i2, i3, bundle);
        }
    }

    public ExploreByTouchHelper(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.mHost = view;
        this.mManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public final AccessibilityEvent a(int i2, int i3) {
        if (i2 == -1) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain(i3);
            this.mHost.onInitializeAccessibilityEvent(obtain);
            return obtain;
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain(i3);
        AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo = obtainAccessibilityNodeInfo(i2);
        obtain2.getText().add(obtainAccessibilityNodeInfo.g());
        AccessibilityNodeInfo accessibilityNodeInfo = obtainAccessibilityNodeInfo.f18826a;
        obtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        obtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        obtain2.setPassword(accessibilityNodeInfo.isPassword());
        obtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        obtain2.setChecked(accessibilityNodeInfo.isChecked());
        onPopulateEventForVirtualView(i2, obtain2);
        if (obtain2.getText().isEmpty() && obtain2.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        obtain2.setClassName(accessibilityNodeInfo.getClassName());
        obtain2.setSource(this.mHost, i2);
        obtain2.setPackageName(this.mHost.getContext().getPackageName());
        return obtain2;
    }

    public final AccessibilityNodeInfoCompat b(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        accessibilityNodeInfoCompat.k(DEFAULT_CLASS_NAME);
        Rect rect = INVALID_PARENT_BOUNDS;
        accessibilityNodeInfoCompat.i(rect);
        accessibilityNodeInfoCompat.j(rect);
        View view = this.mHost;
        accessibilityNodeInfoCompat.f18827b = -1;
        obtain.setParent(view);
        onPopulateNodeForVirtualView(i2, accessibilityNodeInfoCompat);
        if (accessibilityNodeInfoCompat.g() == null && obtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoCompat.f(this.mTempParentRect);
        if (this.mTempParentRect.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = obtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        obtain.setPackageName(this.mHost.getContext().getPackageName());
        View view2 = this.mHost;
        accessibilityNodeInfoCompat.f18828c = i2;
        obtain.setSource(view2, i2);
        if (this.mAccessibilityFocusedVirtualViewId == i2) {
            accessibilityNodeInfoCompat.h(true);
            accessibilityNodeInfoCompat.a(128);
        } else {
            accessibilityNodeInfoCompat.h(false);
            accessibilityNodeInfoCompat.a(64);
        }
        boolean z2 = this.mKeyboardFocusedVirtualViewId == i2;
        if (z2) {
            accessibilityNodeInfoCompat.a(2);
        } else if (obtain.isFocusable()) {
            accessibilityNodeInfoCompat.a(1);
        }
        obtain.setFocused(z2);
        this.mHost.getLocationOnScreen(this.mTempGlobalRect);
        obtain.getBoundsInScreen(this.mTempScreenRect);
        if (this.mTempScreenRect.equals(rect)) {
            accessibilityNodeInfoCompat.f(this.mTempScreenRect);
            if (accessibilityNodeInfoCompat.f18827b != -1) {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = new AccessibilityNodeInfoCompat(AccessibilityNodeInfo.obtain());
                for (int i3 = accessibilityNodeInfoCompat.f18827b; i3 != -1; i3 = accessibilityNodeInfoCompat2.f18827b) {
                    View view3 = this.mHost;
                    accessibilityNodeInfoCompat2.f18827b = -1;
                    accessibilityNodeInfoCompat2.f18826a.setParent(view3, -1);
                    accessibilityNodeInfoCompat2.i(INVALID_PARENT_BOUNDS);
                    onPopulateNodeForVirtualView(i3, accessibilityNodeInfoCompat2);
                    accessibilityNodeInfoCompat2.f(this.mTempParentRect);
                    Rect rect2 = this.mTempScreenRect;
                    Rect rect3 = this.mTempParentRect;
                    rect2.offset(rect3.left, rect3.top);
                }
            }
            this.mTempScreenRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
        }
        if (this.mHost.getLocalVisibleRect(this.mTempVisibleRect)) {
            this.mTempVisibleRect.offset(this.mTempGlobalRect[0] - this.mHost.getScrollX(), this.mTempGlobalRect[1] - this.mHost.getScrollY());
            if (this.mTempScreenRect.intersect(this.mTempVisibleRect)) {
                accessibilityNodeInfoCompat.j(this.mTempScreenRect);
                Rect rect4 = this.mTempScreenRect;
                if (rect4 != null && !rect4.isEmpty() && this.mHost.getWindowVisibility() == 0) {
                    Object parent = this.mHost.getParent();
                    while (true) {
                        if (parent instanceof View) {
                            View view4 = (View) parent;
                            if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                break;
                            }
                            parent = view4.getParent();
                        } else if (parent != null) {
                            accessibilityNodeInfoCompat.f18826a.setVisibleToUser(true);
                        }
                    }
                }
            }
        }
        return accessibilityNodeInfoCompat;
    }

    public final boolean c(int i2, Rect rect) {
        Object obj;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat;
        int d;
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        int i3 = 0;
        SparseArrayCompat sparseArrayCompat = new SparseArrayCompat(0);
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            sparseArrayCompat.f(((Integer) arrayList.get(i4)).intValue(), b(((Integer) arrayList.get(i4)).intValue()));
        }
        int i5 = this.mKeyboardFocusedVirtualViewId;
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = i5 == Integer.MIN_VALUE ? null : (AccessibilityNodeInfoCompat) sparseArrayCompat.c(i5);
        int i6 = -1;
        if (i2 == 1 || i2 == 2) {
            View view = this.mHost;
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            boolean z2 = view.getLayoutDirection() == 1;
            FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> collectionAdapter = SPARSE_VALUES_ADAPTER;
            FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> boundsAdapter = NODE_ADAPTER;
            int b2 = collectionAdapter.b(sparseArrayCompat);
            ArrayList arrayList2 = new ArrayList(b2);
            for (int i7 = 0; i7 < b2; i7++) {
                arrayList2.add(collectionAdapter.a(sparseArrayCompat, i7));
            }
            Collections.sort(arrayList2, new FocusStrategy.SequentialComparator(z2, boundsAdapter));
            if (i2 == 1) {
                int size = arrayList2.size();
                if (accessibilityNodeInfoCompat2 != null) {
                    size = arrayList2.indexOf(accessibilityNodeInfoCompat2);
                }
                int i8 = size - 1;
                if (i8 >= 0) {
                    obj = arrayList2.get(i8);
                    accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
                }
                obj = null;
                accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
            } else {
                if (i2 != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int lastIndexOf = (accessibilityNodeInfoCompat2 == null ? -1 : arrayList2.lastIndexOf(accessibilityNodeInfoCompat2)) + 1;
                if (lastIndexOf < size2) {
                    obj = arrayList2.get(lastIndexOf);
                    accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
                }
                obj = null;
                accessibilityNodeInfoCompat = (AccessibilityNodeInfoCompat) obj;
            }
        } else {
            if (i2 != 17 && i2 != 33 && i2 != 66 && i2 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i9 = this.mKeyboardFocusedVirtualViewId;
            if (i9 != Integer.MIN_VALUE) {
                obtainAccessibilityNodeInfo(i9).f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                View view2 = this.mHost;
                int width = view2.getWidth();
                int height = view2.getHeight();
                if (i2 == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i2 == 33) {
                    rect2.set(0, height, width, height);
                } else if (i2 == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i2 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            FocusStrategy.CollectionAdapter<SparseArrayCompat<AccessibilityNodeInfoCompat>, AccessibilityNodeInfoCompat> collectionAdapter2 = SPARSE_VALUES_ADAPTER;
            FocusStrategy.BoundsAdapter<AccessibilityNodeInfoCompat> boundsAdapter2 = NODE_ADAPTER;
            Rect rect3 = new Rect(rect2);
            if (i2 == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i2 == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i2 == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i2 != 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            int b3 = collectionAdapter2.b(sparseArrayCompat);
            Rect rect4 = new Rect();
            accessibilityNodeInfoCompat = null;
            for (int i10 = 0; i10 < b3; i10++) {
                AccessibilityNodeInfoCompat a2 = collectionAdapter2.a(sparseArrayCompat, i10);
                if (a2 != accessibilityNodeInfoCompat2) {
                    boundsAdapter2.a(a2, rect4);
                    if (FocusStrategy.c(i2, rect2, rect4)) {
                        if (FocusStrategy.c(i2, rect2, rect3) && !FocusStrategy.a(i2, rect2, rect4, rect3)) {
                            if (!FocusStrategy.a(i2, rect2, rect3, rect4)) {
                                int d2 = FocusStrategy.d(i2, rect2, rect4);
                                int e = FocusStrategy.e(i2, rect2, rect4);
                                int i11 = (e * e) + (d2 * 13 * d2);
                                int d3 = FocusStrategy.d(i2, rect2, rect3);
                                int e2 = FocusStrategy.e(i2, rect2, rect3);
                                if (i11 >= (e2 * e2) + (d3 * 13 * d3)) {
                                }
                            }
                        }
                        rect3.set(rect4);
                        accessibilityNodeInfoCompat = a2;
                    }
                }
            }
        }
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat3 = accessibilityNodeInfoCompat;
        if (accessibilityNodeInfoCompat3 == null) {
            d = Integer.MIN_VALUE;
        } else {
            if (sparseArrayCompat.f1609a) {
                SparseArrayCompatKt.a(sparseArrayCompat);
            }
            int i12 = sparseArrayCompat.d;
            while (true) {
                if (i3 >= i12) {
                    break;
                }
                if (sparseArrayCompat.f1611c[i3] == accessibilityNodeInfoCompat3) {
                    i6 = i3;
                    break;
                }
                i3++;
            }
            d = sparseArrayCompat.d(i6);
        }
        return requestKeyboardFocusForVirtualView(d);
    }

    public final boolean clearKeyboardFocusForVirtualView(int i2) {
        if (this.mKeyboardFocusedVirtualViewId != i2) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = Integer.MIN_VALUE;
        onVirtualViewKeyboardFocusChanged(i2, false);
        sendEventForVirtualView(i2, 8);
        return true;
    }

    public final boolean dispatchHoverEvent(@NonNull MotionEvent motionEvent) {
        int i2;
        if (!this.mManager.isEnabled() || !this.mManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int virtualViewAt = getVirtualViewAt(motionEvent.getX(), motionEvent.getY());
            int i3 = this.mHoveredVirtualViewId;
            if (i3 != virtualViewAt) {
                this.mHoveredVirtualViewId = virtualViewAt;
                sendEventForVirtualView(virtualViewAt, 128);
                sendEventForVirtualView(i3, 256);
            }
            return virtualViewAt != Integer.MIN_VALUE;
        }
        if (action != 10 || (i2 = this.mHoveredVirtualViewId) == Integer.MIN_VALUE) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.mHoveredVirtualViewId = Integer.MIN_VALUE;
            sendEventForVirtualView(Integer.MIN_VALUE, 128);
            sendEventForVirtualView(i2, 256);
        }
        return true;
    }

    public final boolean dispatchKeyEvent(@NonNull KeyEvent keyEvent) {
        int i2 = 0;
        if (keyEvent.getAction() == 1) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 61) {
            if (keyEvent.hasNoModifiers()) {
                return c(2, null);
            }
            if (keyEvent.hasModifiers(1)) {
                return c(1, null);
            }
            return false;
        }
        int i3 = 66;
        if (keyCode != 66) {
            switch (keyCode) {
                case 19:
                case 20:
                case 21:
                case 22:
                    if (!keyEvent.hasNoModifiers()) {
                        return false;
                    }
                    if (keyCode == 19) {
                        i3 = 33;
                    } else if (keyCode == 21) {
                        i3 = 17;
                    } else if (keyCode != 22) {
                        i3 = 130;
                    }
                    int repeatCount = keyEvent.getRepeatCount() + 1;
                    boolean z2 = false;
                    while (i2 < repeatCount && c(i3, null)) {
                        i2++;
                        z2 = true;
                    }
                    return z2;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        if (!keyEvent.hasNoModifiers() || keyEvent.getRepeatCount() != 0) {
            return false;
        }
        int i4 = this.mKeyboardFocusedVirtualViewId;
        if (i4 != Integer.MIN_VALUE) {
            onPerformActionForVirtualView(i4, 16, null);
        }
        return true;
    }

    public final int getAccessibilityFocusedVirtualViewId() {
        return this.mAccessibilityFocusedVirtualViewId;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(View view) {
        if (this.mNodeProvider == null) {
            this.mNodeProvider = new MyNodeProvider();
        }
        return this.mNodeProvider;
    }

    @Deprecated
    public int getFocusedVirtualView() {
        return getAccessibilityFocusedVirtualViewId();
    }

    public final int getKeyboardFocusedVirtualViewId() {
        return this.mKeyboardFocusedVirtualViewId;
    }

    public abstract int getVirtualViewAt(float f2, float f3);

    public abstract void getVisibleVirtualViews(List list);

    public final void invalidateRoot() {
        invalidateVirtualView(-1, 1);
    }

    public final void invalidateVirtualView(int i2) {
        invalidateVirtualView(i2, 0);
    }

    @NonNull
    public AccessibilityNodeInfoCompat obtainAccessibilityNodeInfo(int i2) {
        if (i2 != -1) {
            return b(i2);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.mHost);
        AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = new AccessibilityNodeInfoCompat(obtain);
        View view = this.mHost;
        WeakHashMap weakHashMap = ViewCompat.f18740a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        getVisibleVirtualViews(arrayList);
        if (obtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            accessibilityNodeInfoCompat.f18826a.addChild(this.mHost, ((Integer) arrayList.get(i3)).intValue());
        }
        return accessibilityNodeInfoCompat;
    }

    public final void onFocusChanged(boolean z2, int i2, @Nullable Rect rect) {
        int i3 = this.mKeyboardFocusedVirtualViewId;
        if (i3 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i3);
        }
        if (z2) {
            c(i2, rect);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        onPopulateEventForHost(accessibilityEvent);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        onPopulateNodeForHost(accessibilityNodeInfoCompat);
    }

    public abstract boolean onPerformActionForVirtualView(int i2, int i3, Bundle bundle);

    public void onPopulateEventForHost(@NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateEventForVirtualView(int i2, @NonNull AccessibilityEvent accessibilityEvent) {
    }

    public void onPopulateNodeForHost(@NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
    }

    public abstract void onPopulateNodeForVirtualView(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat);

    public void onVirtualViewKeyboardFocusChanged(int i2, boolean z2) {
    }

    public boolean performAction(int i2, int i3, Bundle bundle) {
        int i4;
        if (i2 == -1) {
            View view = this.mHost;
            WeakHashMap weakHashMap = ViewCompat.f18740a;
            return view.performAccessibilityAction(i3, bundle);
        }
        boolean z2 = true;
        if (i3 == 1) {
            return requestKeyboardFocusForVirtualView(i2);
        }
        if (i3 == 2) {
            return clearKeyboardFocusForVirtualView(i2);
        }
        if (i3 == 64) {
            if (this.mManager.isEnabled() && this.mManager.isTouchExplorationEnabled() && (i4 = this.mAccessibilityFocusedVirtualViewId) != i2) {
                if (i4 != Integer.MIN_VALUE) {
                    this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
                    this.mHost.invalidate();
                    sendEventForVirtualView(i4, 65536);
                }
                this.mAccessibilityFocusedVirtualViewId = i2;
                this.mHost.invalidate();
                sendEventForVirtualView(i2, 32768);
            }
            z2 = false;
        } else {
            if (i3 != 128) {
                return onPerformActionForVirtualView(i2, i3, bundle);
            }
            if (this.mAccessibilityFocusedVirtualViewId == i2) {
                this.mAccessibilityFocusedVirtualViewId = Integer.MIN_VALUE;
                this.mHost.invalidate();
                sendEventForVirtualView(i2, 65536);
            }
            z2 = false;
        }
        return z2;
    }

    public final boolean requestKeyboardFocusForVirtualView(int i2) {
        int i3;
        if ((!this.mHost.isFocused() && !this.mHost.requestFocus()) || (i3 = this.mKeyboardFocusedVirtualViewId) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            clearKeyboardFocusForVirtualView(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.mKeyboardFocusedVirtualViewId = i2;
        onVirtualViewKeyboardFocusChanged(i2, true);
        sendEventForVirtualView(i2, 8);
        return true;
    }

    public final boolean sendEventForVirtualView(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.mHost, a(i2, i3));
    }

    public final void invalidateVirtualView(int i2, int i3) {
        ViewParent parent;
        if (i2 == Integer.MIN_VALUE || !this.mManager.isEnabled() || (parent = this.mHost.getParent()) == null) {
            return;
        }
        AccessibilityEvent a2 = a(i2, Opcodes.ACC_STRICT);
        a2.setContentChangeTypes(i3);
        parent.requestSendAccessibilityEvent(this.mHost, a2);
    }
}
