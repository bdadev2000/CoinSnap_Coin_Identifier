package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewConfigurationCompat;
import androidx.fragment.app.FragmentTransaction;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements n0.t, n0.u {
    static final int DEFAULT_ORIENTATION = 1;
    static final boolean DISPATCH_TEMP_DETACH = false;
    private static final float FLING_DESTRETCH_FACTOR = 4.0f;
    static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final float INFLEXION = 0.35f;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    static final int MAX_SCROLL_DURATION = 2000;
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    private static final float SCROLL_FRICTION = 0.015f;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    static boolean sDebugAssertionsEnabled = false;
    static final l1 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    q1 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    j0 mAdapter;
    b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private m0 mChildDrawingOrderCallback;
    d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private n0 mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    s mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private z0 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    q0 mItemAnimator;
    private o0 mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<r0> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    v0 mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final f1 mObserver;
    private List<x0> mOnChildAttachStateListeners;
    private y0 mOnFlingListener;
    private final ArrayList<z0> mOnItemTouchListeners;
    final List<o1> mPendingAccessibilityImportanceChange;
    g1 mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    q mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final d1 mRecycler;
    e1 mRecyclerListener;
    final List<e1> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private a1 mScrollListener;
    private List<a1> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private n0.w mScrollingChildHelper;
    final k1 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final n1 mViewFlinger;
    private final c2 mViewInfoProcessCallback;
    final d2 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    static {
        Class<?> cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new x0.c(1);
        sDefaultEdgeEffectFactory = new l1();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ void access$500(RecyclerView recyclerView, int i10, int i11) {
        recyclerView.setMeasuredDimension(i10, i11);
    }

    private void addAnimatingView(o1 o1Var) {
        boolean z10;
        View view = o1Var.itemView;
        if (view.getParent() == this) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mRecycler.n(getChildViewHolder(view));
        if (o1Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z10) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        d dVar = this.mChildHelper;
        int indexOfChild = dVar.a.a.indexOfChild(view);
        if (indexOfChild >= 0) {
            dVar.f1886b.n(indexOfChild);
            dVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(@NonNull o1 o1Var, @NonNull o1 o1Var2, @NonNull p0 p0Var, @NonNull p0 p0Var2, boolean z10, boolean z11) {
        o1Var.setIsRecyclable(false);
        if (z10) {
            addAnimatingView(o1Var);
        }
        if (o1Var != o1Var2) {
            if (z11) {
                addAnimatingView(o1Var2);
            }
            o1Var.mShadowedHolder = o1Var2;
            addAnimatingView(o1Var);
            this.mRecycler.n(o1Var);
            o1Var2.setIsRecyclable(false);
            o1Var2.mShadowingHolder = o1Var;
        }
        if (this.mItemAnimator.a(o1Var, o1Var2, p0Var, p0Var2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull o1 o1Var) {
        WeakReference<RecyclerView> weakReference = o1Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == o1Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            o1Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i10, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i11) {
        if (i10 > 0 && edgeEffect != null && com.bumptech.glide.e.y(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(com.bumptech.glide.e.L(edgeEffect, ((-i10) * FLING_DESTRETCH_FACTOR) / i11, 0.5f) * ((-i11) / FLING_DESTRETCH_FACTOR));
            if (round != i10) {
                edgeEffect.finish();
            }
            return i10 - round;
        }
        if (i10 < 0 && edgeEffect2 != null && com.bumptech.glide.e.y(edgeEffect2) != DECELERATION_RATE) {
            float f10 = i11;
            int round2 = Math.round(com.bumptech.glide.e.L(edgeEffect2, (i10 * FLING_DESTRETCH_FACTOR) / f10, 0.5f) * (f10 / FLING_DESTRETCH_FACTOR));
            if (round2 != i10) {
                edgeEffect2.finish();
            }
            return i10 - round2;
        }
        return i10;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i10, int i11) {
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(v0.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i10), Integer.valueOf(i11)};
                    } catch (NoSuchMethodException e2) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e10) {
                            e10.initCause(e2);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e10);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((v0) constructor.newInstance(objArr));
                } catch (ClassCastException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e11);
                } catch (ClassNotFoundException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e12);
                } catch (IllegalAccessException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e13);
                } catch (InstantiationException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e14);
                } catch (InvocationTargetException e15) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e15);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i10, int i11) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i10 && iArr[1] == i11) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i10 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i10 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(i10);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        boolean z10;
        boolean z11;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f1967i = false;
        startInterceptRequestLayout();
        d2 d2Var = this.mViewInfoStore;
        d2Var.a.clear();
        d2Var.f1897b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        k1 k1Var = this.mState;
        if (k1Var.f1968j && this.mItemsChanged) {
            z10 = true;
        } else {
            z10 = false;
        }
        k1Var.f1966h = z10;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        k1Var.f1965g = k1Var.f1969k;
        k1Var.f1963e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f1968j) {
            int e2 = this.mChildHelper.e();
            for (int i10 = 0; i10 < e2; i10++) {
                o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    q0 q0Var = this.mItemAnimator;
                    q0.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    q0Var.getClass();
                    p0 p0Var = new p0();
                    p0Var.a(childViewHolderInt);
                    r.k kVar = this.mViewInfoStore.a;
                    b2 b2Var = (b2) kVar.getOrDefault(childViewHolderInt, null);
                    if (b2Var == null) {
                        b2Var = b2.a();
                        kVar.put(childViewHolderInt, b2Var);
                    }
                    b2Var.f1879b = p0Var;
                    b2Var.a |= 4;
                    if (this.mState.f1966h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.f1897b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f1969k) {
            saveOldPositions();
            k1 k1Var2 = this.mState;
            boolean z12 = k1Var2.f1964f;
            k1Var2.f1964f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, k1Var2);
            this.mState.f1964f = z12;
            for (int i11 = 0; i11 < this.mChildHelper.e(); i11++) {
                o1 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i11));
                if (!childViewHolderInt2.shouldIgnore()) {
                    b2 b2Var2 = (b2) this.mViewInfoStore.a.getOrDefault(childViewHolderInt2, null);
                    if (b2Var2 != null && (b2Var2.a & 4) != 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (!z11) {
                        q0.b(childViewHolderInt2);
                        boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        q0 q0Var2 = this.mItemAnimator;
                        childViewHolderInt2.getUnmodifiedPayloads();
                        q0Var2.getClass();
                        p0 p0Var2 = new p0();
                        p0Var2.a(childViewHolderInt2);
                        if (hasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, p0Var2);
                        } else {
                            r.k kVar2 = this.mViewInfoStore.a;
                            b2 b2Var3 = (b2) kVar2.getOrDefault(childViewHolderInt2, null);
                            if (b2Var3 == null) {
                                b2Var3 = b2.a();
                                kVar2.put(childViewHolderInt2, b2Var3);
                            }
                            b2Var3.a |= 2;
                            b2Var3.f1879b = p0Var2;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f1962d = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z10;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f1963e = this.mAdapter.getItemCount();
        this.mState.f1961c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f1918d;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        k1 k1Var = this.mState;
        k1Var.f1965g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, k1Var);
        k1 k1Var2 = this.mState;
        k1Var2.f1964f = false;
        if (k1Var2.f1968j && this.mItemAnimator != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        k1Var2.f1968j = z10;
        k1Var2.f1962d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        boolean g10;
        boolean z10;
        boolean z11;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        k1 k1Var = this.mState;
        k1Var.f1962d = 1;
        if (k1Var.f1968j) {
            for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
                o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e2));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    p0 p0Var = new p0();
                    p0Var.a(childViewHolderInt);
                    o1 o1Var = (o1) this.mViewInfoStore.f1897b.d(changedHolderKey, null);
                    if (o1Var != null && !o1Var.shouldIgnore()) {
                        b2 b2Var = (b2) this.mViewInfoStore.a.getOrDefault(o1Var, null);
                        if (b2Var != null && (b2Var.a & 1) != 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        b2 b2Var2 = (b2) this.mViewInfoStore.a.getOrDefault(childViewHolderInt, null);
                        if (b2Var2 != null && (b2Var2.a & 1) != 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (z10 && o1Var == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, p0Var);
                        } else {
                            p0 b3 = this.mViewInfoStore.b(o1Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, p0Var);
                            p0 b10 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b3 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, o1Var);
                            } else {
                                animateChange(o1Var, childViewHolderInt, b3, b10, z10, z11);
                            }
                        }
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt, p0Var);
                    }
                }
            }
            d2 d2Var = this.mViewInfoStore;
            c2 c2Var = this.mViewInfoProcessCallback;
            r.k kVar = d2Var.a;
            for (int i10 = kVar.f23955d - 1; i10 >= 0; i10--) {
                o1 o1Var2 = (o1) kVar.h(i10);
                b2 b2Var3 = (b2) kVar.j(i10);
                int i11 = b2Var3.a;
                if ((i11 & 3) == 3) {
                    RecyclerView recyclerView = ((h0) c2Var).a;
                    recyclerView.mLayout.removeAndRecycleView(o1Var2.itemView, recyclerView.mRecycler);
                } else if ((i11 & 1) != 0) {
                    p0 p0Var2 = b2Var3.f1879b;
                    if (p0Var2 == null) {
                        RecyclerView recyclerView2 = ((h0) c2Var).a;
                        recyclerView2.mLayout.removeAndRecycleView(o1Var2.itemView, recyclerView2.mRecycler);
                    } else {
                        p0 p0Var3 = b2Var3.f1880c;
                        RecyclerView recyclerView3 = ((h0) c2Var).a;
                        recyclerView3.mRecycler.n(o1Var2);
                        recyclerView3.animateDisappearance(o1Var2, p0Var2, p0Var3);
                    }
                } else if ((i11 & 14) == 14) {
                    ((h0) c2Var).a.animateAppearance(o1Var2, b2Var3.f1879b, b2Var3.f1880c);
                } else if ((i11 & 12) == 12) {
                    p0 p0Var4 = b2Var3.f1879b;
                    p0 p0Var5 = b2Var3.f1880c;
                    h0 h0Var = (h0) c2Var;
                    h0Var.getClass();
                    o1Var2.setIsRecyclable(false);
                    RecyclerView recyclerView4 = h0Var.a;
                    if (recyclerView4.mDataSetHasChangedAfterLayout) {
                        if (recyclerView4.mItemAnimator.a(o1Var2, o1Var2, p0Var4, p0Var5)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        k kVar2 = (k) recyclerView4.mItemAnimator;
                        kVar2.getClass();
                        int i12 = p0Var4.a;
                        int i13 = p0Var5.a;
                        if (i12 == i13 && p0Var4.f2007b == p0Var5.f2007b) {
                            kVar2.c(o1Var2);
                            g10 = false;
                        } else {
                            g10 = kVar2.g(o1Var2, i12, p0Var4.f2007b, i13, p0Var5.f2007b);
                        }
                        if (g10) {
                            recyclerView4.postAnimationRunner();
                        }
                    }
                } else if ((i11 & 4) != 0) {
                    p0 p0Var6 = b2Var3.f1879b;
                    RecyclerView recyclerView5 = ((h0) c2Var).a;
                    recyclerView5.mRecycler.n(o1Var2);
                    recyclerView5.animateDisappearance(o1Var2, p0Var6, null);
                } else if ((i11 & 8) != 0) {
                    ((h0) c2Var).a.animateAppearance(o1Var2, b2Var3.f1879b, b2Var3.f1880c);
                }
                b2Var3.a = 0;
                b2Var3.f1879b = null;
                b2Var3.f1880c = null;
                b2.f1878d.c(b2Var3);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        k1 k1Var2 = this.mState;
        k1Var2.f1960b = k1Var2.f1963e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        k1Var2.f1968j = false;
        k1Var2.f1969k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.f1890b;
        if (arrayList != null) {
            arrayList.clear();
        }
        v0 v0Var = this.mLayout;
        if (v0Var.mPrefetchMaxObservedInInitialPrefetch) {
            v0Var.mPrefetchMaxCountObserved = 0;
            v0Var.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        d2 d2Var2 = this.mViewInfoStore;
        d2Var2.a.clear();
        d2Var2.f1897b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ce, code lost:
    
        if (r10 >= 0) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0125, code lost:
    
        if (r7 >= 0) goto L120;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean dispatchToOnItemTouchListeners(android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.dispatchToOnItemTouchListeners(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r6 == 2) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.z0> r1 = r11.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L6e
            java.util.ArrayList<androidx.recyclerview.widget.z0> r4 = r11.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.z0 r4 = (androidx.recyclerview.widget.z0) r4
            r5 = r4
            androidx.recyclerview.widget.p r5 = (androidx.recyclerview.widget.p) r5
            int r6 = r5.f2002v
            r7 = 1
            r8 = 2
            if (r6 != r7) goto L5e
            float r6 = r12.getX()
            float r9 = r12.getY()
            boolean r6 = r5.b(r6, r9)
            float r9 = r12.getX()
            float r10 = r12.getY()
            boolean r9 = r5.a(r9, r10)
            int r10 = r12.getAction()
            if (r10 != 0) goto L62
            if (r6 != 0) goto L41
            if (r9 == 0) goto L62
        L41:
            if (r9 == 0) goto L4e
            r5.f2003w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f1997p = r6
            goto L5a
        L4e:
            if (r6 == 0) goto L5a
            r5.f2003w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f1994m = r6
        L5a:
            r5.c(r8)
            goto L60
        L5e:
            if (r6 != r8) goto L62
        L60:
            r5 = r7
            goto L63
        L62:
            r5 = r2
        L63:
            if (r5 == 0) goto L6b
            r5 = 3
            if (r0 == r5) goto L6b
            r11.mInterceptingOnItemTouchListener = r4
            return r7
        L6b:
            int r3 = r3 + 1
            goto Lc
        L6e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findInterceptingOnItemTouchListener(android.view.MotionEvent):boolean");
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e2 = this.mChildHelper.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i10 = Integer.MAX_VALUE;
        int i11 = Integer.MIN_VALUE;
        for (int i12 = 0; i12 < e2; i12++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i12));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i10) {
                    i10 = layoutPosition;
                }
                if (layoutPosition > i11) {
                    i11 = layoutPosition;
                }
            }
        }
        iArr[0] = i10;
        iArr[1] = i11;
    }

    @Nullable
    public static RecyclerView findNestedRecyclerView(@NonNull View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i10));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        o1 findViewHolderForAdapterPosition;
        k1 k1Var = this.mState;
        int i10 = k1Var.f1970l;
        if (i10 == -1) {
            i10 = 0;
        }
        int b3 = k1Var.b();
        for (int i11 = i10; i11 < b3; i11++) {
            o1 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i11);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b3, i10);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    public static o1 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((w0) view.getLayoutParams()).a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        w0 w0Var = (w0) view.getLayoutParams();
        Rect rect2 = w0Var.f2059b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) w0Var).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) w0Var).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) w0Var).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) w0Var).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id2 = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id2 = view.getId();
            }
        }
        return id2;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        }
        if (str.contains(".")) {
            return str;
        }
        return RecyclerView.class.getPackage().getName() + '.' + str;
    }

    private n0.w getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new n0.w(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i10) {
        double log = Math.log((Math.abs(i10) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f10 = DECELERATION_RATE;
        return (float) (Math.exp((f10 / (f10 - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j3, o1 o1Var, o1 o1Var2) {
        int e2 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e2; i10++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != o1Var && getChangedHolderKey(childViewHolderInt) == j3) {
                j0 j0Var = this.mAdapter;
                if (j0Var != null && j0Var.hasStableIds()) {
                    StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb2.append(childViewHolderInt);
                    sb2.append(" \n View Holder 2:");
                    sb2.append(o1Var);
                    throw new IllegalStateException(a4.j.d(this, sb2));
                }
                StringBuilder sb3 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb3.append(childViewHolderInt);
                sb3.append(" \n View Holder 2:");
                sb3.append(o1Var);
                throw new IllegalStateException(a4.j.d(this, sb3));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + o1Var2 + " cannot be found but it is necessary for " + o1Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e2 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e2; i10++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        if (ViewCompat.getImportantForAutofill(this) == 0) {
            ViewCompat.setImportantForAutofill(this, 8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new d(new h0(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i10) {
        int i11;
        int i12;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c10 = 65535;
        if (this.mLayout.getLayoutDirection() == 1) {
            i11 = -1;
        } else {
            i11 = 1;
        }
        Rect rect = this.mTempRect;
        int i13 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i14 = rect2.left;
        if ((i13 < i14 || rect.right <= i14) && rect.right < rect2.right) {
            i12 = 1;
        } else {
            int i15 = rect.right;
            int i16 = rect2.right;
            if ((i15 > i16 || i13 >= i16) && i13 > i14) {
                i12 = -1;
            } else {
                i12 = 0;
            }
        }
        int i17 = rect.top;
        int i18 = rect2.top;
        if ((i17 < i18 || rect.bottom <= i18) && rect.bottom < rect2.bottom) {
            c10 = 1;
        } else {
            int i19 = rect.bottom;
            int i20 = rect2.bottom;
            if ((i19 <= i20 && i17 < i20) || i17 <= i18) {
                c10 = 0;
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 17) {
                    if (i10 != 33) {
                        if (i10 != 66) {
                            if (i10 == 130) {
                                if (c10 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            StringBuilder sb2 = new StringBuilder("Invalid direction: ");
                            sb2.append(i10);
                            throw new IllegalArgumentException(a4.j.d(this, sb2));
                        }
                        if (i12 <= 0) {
                            return false;
                        }
                        return true;
                    }
                    if (c10 >= 0) {
                        return false;
                    }
                    return true;
                }
                if (i12 >= 0) {
                    return false;
                }
                return true;
            }
            if (c10 <= 0 && (c10 != 0 || i12 * i11 <= 0)) {
                return false;
            }
            return true;
        }
        if (c10 >= 0 && (c10 != 0 || i12 * i11 >= 0)) {
            return false;
        }
        return true;
    }

    private void nestedScrollByInternal(int i10, int i11, @Nullable MotionEvent motionEvent, int i12) {
        int i13;
        float y4;
        float x10;
        int i14;
        int i15;
        int i16;
        v0 v0Var = this.mLayout;
        if (v0Var == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        int i17 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = v0Var.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollVertically) {
            i13 = (canScrollHorizontally ? 1 : 0) | 2;
        } else {
            i13 = canScrollHorizontally ? 1 : 0;
        }
        if (motionEvent == null) {
            y4 = getHeight() / 2.0f;
        } else {
            y4 = motionEvent.getY();
        }
        if (motionEvent == null) {
            x10 = getWidth() / 2.0f;
        } else {
            x10 = motionEvent.getX();
        }
        int releaseHorizontalGlow = i10 - releaseHorizontalGlow(i10, y4);
        int releaseVerticalGlow = i11 - releaseVerticalGlow(i11, x10);
        startNestedScroll(i13, i12);
        if (canScrollHorizontally) {
            i14 = releaseHorizontalGlow;
        } else {
            i14 = 0;
        }
        if (canScrollVertically) {
            i15 = releaseVerticalGlow;
        } else {
            i15 = 0;
        }
        if (dispatchNestedPreScroll(i14, i15, this.mReusableIntPair, this.mScrollOffset, i12)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        if (canScrollHorizontally) {
            i16 = releaseHorizontalGlow;
        } else {
            i16 = 0;
        }
        if (canScrollVertically) {
            i17 = releaseVerticalGlow;
        }
        scrollByInternal(i16, i17, motionEvent, i12);
        s sVar = this.mGapWorker;
        if (sVar != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            sVar.a(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i12);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i10;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i10 = 1;
            } else {
                i10 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i10);
            int x10 = (int) (motionEvent.getX(i10) + 0.5f);
            this.mLastTouchX = x10;
            this.mInitialTouchX = x10;
            int y4 = (int) (motionEvent.getY(i10) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            b bVar = this.mAdapterHelper;
            bVar.l(bVar.f1862b);
            bVar.l(bVar.f1863c);
            bVar.f1866f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        if (!this.mItemsAddedOrRemoved && !this.mItemsChanged) {
            z10 = false;
        } else {
            z10 = true;
        }
        k1 k1Var = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z12 = this.mDataSetHasChangedAfterLayout) || z10 || this.mLayout.mRequestedSimpleAnimations) && (!z12 || this.mAdapter.hasStableIds()))) {
            z11 = true;
        } else {
            z11 = false;
        }
        k1Var.f1968j = z11;
        k1 k1Var2 = this.mState;
        if (k1Var2.f1968j && z10 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z13 = true;
        }
        k1Var2.f1969k = z13;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L21
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            com.bumptech.glide.e.L(r1, r4, r9)
        L1f:
            r9 = r3
            goto L3c
        L21:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L3b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            com.bumptech.glide.e.L(r1, r4, r9)
            goto L1f
        L3b:
            r9 = 0
        L3c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L56
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            com.bumptech.glide.e.L(r9, r1, r7)
            goto L72
        L56:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L71
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            com.bumptech.glide.e.L(r9, r1, r2)
            goto L72
        L71:
            r3 = r9
        L72:
            if (r3 != 0) goto L7c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L7c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L7f
        L7c:
            androidx.core.view.ViewCompat.postInvalidateOnAnimation(r6)
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        o1 o1Var;
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (IGNORE_DETACHED_FOCUSED_CHILD && (focusedChild.getParent() == null || !focusedChild.hasFocus())) {
                        if (this.mChildHelper.e() == 0) {
                            requestFocus();
                            return;
                        }
                    } else if (!this.mChildHelper.k(focusedChild)) {
                        return;
                    }
                }
                View view = null;
                if (this.mState.f1971m != -1 && this.mAdapter.hasStableIds()) {
                    o1Var = findViewHolderForItemId(this.mState.f1971m);
                } else {
                    o1Var = null;
                }
                if (o1Var != null && !this.mChildHelper.k(o1Var.itemView) && o1Var.itemView.hasFocusable()) {
                    view = o1Var.itemView;
                } else if (this.mChildHelper.e() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i10 = this.mState.f1972n;
                    if (i10 != -1 && (findViewById = view.findViewById(i10)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private int releaseHorizontalGlow(int i10, float f10) {
        float height = f10 / getHeight();
        float width = i10 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect != null && com.bumptech.glide.e.y(edgeEffect) != DECELERATION_RATE) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f12 = -com.bumptech.glide.e.L(this.mLeftGlow, -width, 1.0f - height);
                if (com.bumptech.glide.e.y(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && com.bumptech.glide.e.y(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float L = com.bumptech.glide.e.L(this.mRightGlow, width, height);
                    if (com.bumptech.glide.e.y(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f11 = L;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getWidth());
    }

    private int releaseVerticalGlow(int i10, float f10) {
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f11 = DECELERATION_RATE;
        if (edgeEffect != null && com.bumptech.glide.e.y(edgeEffect) != DECELERATION_RATE) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f12 = -com.bumptech.glide.e.L(this.mTopGlow, -height, width);
                if (com.bumptech.glide.e.y(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f11 = f12;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && com.bumptech.glide.e.y(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float L = com.bumptech.glide.e.L(this.mBottomGlow, height, 1.0f - width);
                    if (com.bumptech.glide.e.y(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f11 = L;
                }
                invalidate();
            }
        }
        return Math.round(f11 * getHeight());
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3;
        boolean z10;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof w0) {
            w0 w0Var = (w0) layoutParams;
            if (!w0Var.f2060c) {
                Rect rect = this.mTempRect;
                int i10 = rect.left;
                Rect rect2 = w0Var.f2059b;
                rect.left = i10 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        v0 v0Var = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z11 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        v0Var.requestChildRectangleOnScreen(this, view, rect3, z11, z10);
    }

    private void resetFocusInfo() {
        k1 k1Var = this.mState;
        k1Var.f1971m = -1L;
        k1Var.f1970l = -1;
        k1Var.f1972n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        View view;
        long j3;
        int absoluteAdapterPosition;
        o1 o1Var = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            o1Var = findContainingViewHolder(view);
        }
        if (o1Var == null) {
            resetFocusInfo();
            return;
        }
        k1 k1Var = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j3 = o1Var.getItemId();
        } else {
            j3 = -1;
        }
        k1Var.f1971m = j3;
        k1 k1Var2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (o1Var.isRemoved()) {
            absoluteAdapterPosition = o1Var.mOldPosition;
        } else {
            absoluteAdapterPosition = o1Var.getAbsoluteAdapterPosition();
        }
        k1Var2.f1970l = absoluteAdapterPosition;
        this.mState.f1972n = getDeepestFocusedViewWithId(o1Var.itemView);
    }

    private void setAdapterInternal(@Nullable j0 j0Var, boolean z10, boolean z11) {
        j0 j0Var2 = this.mAdapter;
        if (j0Var2 != null) {
            j0Var2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z10 || z11) {
            removeAndRecycleViews();
        }
        b bVar = this.mAdapterHelper;
        bVar.l(bVar.f1862b);
        bVar.l(bVar.f1863c);
        int i10 = 0;
        bVar.f1866f = 0;
        j0 j0Var3 = this.mAdapter;
        this.mAdapter = j0Var;
        if (j0Var != null) {
            j0Var.registerAdapterDataObserver(this.mObserver);
            j0Var.onAttachedToRecyclerView(this);
        }
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.onAdapterChanged(j0Var3, this.mAdapter);
        }
        d1 d1Var = this.mRecycler;
        j0 j0Var4 = this.mAdapter;
        d1Var.a.clear();
        d1Var.h();
        d1Var.g(j0Var3, true);
        c1 c10 = d1Var.c();
        if (j0Var3 != null) {
            c10.f1884b--;
        }
        if (!z10 && c10.f1884b == 0) {
            while (true) {
                SparseArray sparseArray = c10.a;
                if (i10 >= sparseArray.size()) {
                    break;
                }
                b1 b1Var = (b1) sparseArray.valueAt(i10);
                Iterator it = b1Var.a.iterator();
                while (it.hasNext()) {
                    com.facebook.appevents.i.a(((o1) it.next()).itemView);
                }
                b1Var.a.clear();
                i10++;
            }
        }
        if (j0Var4 != null) {
            c10.f1884b++;
        } else {
            c10.getClass();
        }
        d1Var.f();
        this.mState.f1964f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z10) {
        sDebugAssertionsEnabled = z10;
    }

    public static void setVerboseLoggingEnabled(boolean z10) {
        sVerboseLoggingEnabled = z10;
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i10, int i11) {
        if (i10 > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i10) < com.bumptech.glide.e.y(edgeEffect) * i11) {
            return true;
        }
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && com.bumptech.glide.e.y(edgeEffect) != DECELERATION_RATE && !canScrollHorizontally(-1)) {
            com.bumptech.glide.e.L(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z10 = true;
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && com.bumptech.glide.e.y(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            com.bumptech.glide.e.L(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z10 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && com.bumptech.glide.e.y(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            com.bumptech.glide.e.L(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z10 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && com.bumptech.glide.e.y(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
            com.bumptech.glide.e.L(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z10;
    }

    private void stopScrollersInternal() {
        n1 n1Var = this.mViewFlinger;
        n1Var.f1982i.removeCallbacks(n1Var);
        n1Var.f1978d.abortAnimation();
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i10, int i11) {
        if (i10 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i10);
            }
        }
        if (i11 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i11);
            }
        } else if (i11 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i11);
            }
        }
        if (i10 != 0 || i11 != 0) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        v0 v0Var = this.mLayout;
        if (v0Var == null || !v0Var.onAddFocusables(this, arrayList, i10, i11)) {
            super.addFocusables(arrayList, i10, i11);
        }
    }

    public void addItemDecoration(@NonNull r0 r0Var, int i10) {
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i10 < 0) {
            this.mItemDecorations.add(r0Var);
        } else {
            this.mItemDecorations.add(i10, r0Var);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull x0 x0Var) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(x0Var);
    }

    public void addOnItemTouchListener(@NonNull z0 z0Var) {
        this.mOnItemTouchListeners.add(z0Var);
    }

    public void addOnScrollListener(@NonNull a1 a1Var) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(a1Var);
    }

    public void addRecyclerListener(@NonNull e1 e1Var) {
        boolean z10;
        if (e1Var != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        com.bumptech.glide.e.i(z10, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(e1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void animateAppearance(@androidx.annotation.NonNull androidx.recyclerview.widget.o1 r8, @androidx.annotation.Nullable androidx.recyclerview.widget.p0 r9, @androidx.annotation.NonNull androidx.recyclerview.widget.p0 r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.q0 r0 = r7.mItemAnimator
            r1 = r0
            androidx.recyclerview.widget.k r1 = (androidx.recyclerview.widget.k) r1
            if (r9 == 0) goto L24
            r1.getClass()
            int r3 = r9.a
            int r5 = r10.a
            if (r3 != r5) goto L1a
            int r0 = r9.f2007b
            int r2 = r10.f2007b
            if (r0 == r2) goto L24
        L1a:
            int r4 = r9.f2007b
            int r6 = r10.f2007b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L33
        L24:
            r1.l(r8)
            android.view.View r9 = r8.itemView
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.f1950i
            r9.add(r8)
            r8 = 1
        L33:
            if (r8 == 0) goto L38
            r7.postAnimationRunner()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.animateAppearance(androidx.recyclerview.widget.o1, androidx.recyclerview.widget.p0, androidx.recyclerview.widget.p0):void");
    }

    public void animateDisappearance(@NonNull o1 o1Var, @NonNull p0 p0Var, @Nullable p0 p0Var2) {
        int i10;
        int i11;
        boolean z10;
        addAnimatingView(o1Var);
        o1Var.setIsRecyclable(false);
        k kVar = (k) this.mItemAnimator;
        kVar.getClass();
        int i12 = p0Var.a;
        int i13 = p0Var.f2007b;
        View view = o1Var.itemView;
        if (p0Var2 == null) {
            i10 = view.getLeft();
        } else {
            i10 = p0Var2.a;
        }
        int i14 = i10;
        if (p0Var2 == null) {
            i11 = view.getTop();
        } else {
            i11 = p0Var2.f2007b;
        }
        int i15 = i11;
        if (!o1Var.isRemoved() && (i12 != i14 || i13 != i15)) {
            view.layout(i14, i15, view.getWidth() + i14, view.getHeight() + i15);
            z10 = kVar.g(o1Var, i12, i13, i14, i15);
        } else {
            kVar.l(o1Var);
            kVar.f1949h.add(o1Var);
            z10 = true;
        }
        if (z10) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(a4.j.d(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(a4.j.d(this, eb.j.m(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(a4.j.d(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(a4.j.d(this, new StringBuilder(""))));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean canReuseUpdatedViewHolder(androidx.recyclerview.widget.o1 r5) {
        /*
            r4 = this;
            androidx.recyclerview.widget.q0 r0 = r4.mItemAnimator
            r1 = 1
            if (r0 == 0) goto L2d
            java.util.List r2 = r5.getUnmodifiedPayloads()
            androidx.recyclerview.widget.k r0 = (androidx.recyclerview.widget.k) r0
            r0.getClass()
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L28
            boolean r0 = r0.f1948g
            if (r0 == 0) goto L22
            boolean r5 = r5.isInvalid()
            if (r5 == 0) goto L20
            goto L22
        L20:
            r5 = r3
            goto L23
        L22:
            r5 = r1
        L23:
            if (r5 == 0) goto L26
            goto L28
        L26:
            r5 = r3
            goto L29
        L28:
            r5 = r1
        L29:
            if (r5 == 0) goto L2c
            goto L2d
        L2c:
            r1 = r3
        L2d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.canReuseUpdatedViewHolder(androidx.recyclerview.widget.o1):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof w0) && this.mLayout.checkLayoutParams((w0) layoutParams);
    }

    public void clearOldPositions() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        d1 d1Var = this.mRecycler;
        ArrayList arrayList = d1Var.f1891c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            ((o1) arrayList.get(i11)).clearOldPosition();
        }
        ArrayList arrayList2 = d1Var.a;
        int size2 = arrayList2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            ((o1) arrayList2.get(i12)).clearOldPosition();
        }
        ArrayList arrayList3 = d1Var.f1890b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i13 = 0; i13 < size3; i13++) {
                ((o1) d1Var.f1890b.get(i13)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<x0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<a1> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        v0 v0Var = this.mLayout;
        if (v0Var == null || !v0Var.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        v0 v0Var = this.mLayout;
        if (v0Var == null || !v0Var.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        v0 v0Var = this.mLayout;
        if (v0Var == null || !v0Var.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollRange(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        v0 v0Var = this.mLayout;
        if (v0Var == null || !v0Var.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        v0 v0Var = this.mLayout;
        if (v0Var == null || !v0Var.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        v0 v0Var = this.mLayout;
        if (v0Var == null || !v0Var.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollRange(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int i10, int i11) {
        boolean z10;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i10 > 0) {
            this.mLeftGlow.onRelease();
            z10 = this.mLeftGlow.isFinished();
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i10 < 0) {
            this.mRightGlow.onRelease();
            z10 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i11 > 0) {
            this.mTopGlow.onRelease();
            z10 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i11 < 0) {
            this.mBottomGlow.onRelease();
            z10 |= this.mBottomGlow.isFinished();
        }
        if (z10) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i10) {
        return consumeFlingInStretch(i10, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        boolean z10;
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.g()) {
                return;
            }
            b bVar = this.mAdapterHelper;
            int i10 = bVar.f1866f;
            boolean z11 = false;
            if ((4 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if ((i10 & 11) != 0) {
                    z11 = true;
                }
                if (!z11) {
                    int i11 = j0.n.a;
                    Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    Trace.endSection();
                    return;
                }
            }
            if (bVar.g()) {
                int i12 = j0.n.a;
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
                return;
            }
            return;
        }
        int i13 = j0.n.a;
        Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
    }

    public void defaultOnMeasure(int i10, int i11) {
        setMeasuredDimension(v0.chooseSize(i10, getPaddingRight() + getPaddingLeft(), ViewCompat.getMinimumWidth(this)), v0.chooseSize(i11, getPaddingBottom() + getPaddingTop(), ViewCompat.getMinimumHeight(this)));
    }

    public void dispatchChildAttached(View view) {
        o1 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        j0 j0Var = this.mAdapter;
        if (j0Var != null && childViewHolderInt != null) {
            j0Var.onViewAttachedToWindow(childViewHolderInt);
        }
        List<x0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((j2.i) this.mOnChildAttachStateListeners.get(size)).getClass();
                w0 w0Var = (w0) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) w0Var).width != -1 || ((ViewGroup.MarginLayoutParams) w0Var).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void dispatchChildDetached(View view) {
        o1 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        j0 j0Var = this.mAdapter;
        if (j0Var != null && childViewHolderInt != null) {
            j0Var.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<x0> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).getClass();
            }
        }
    }

    public void dispatchLayout() {
        boolean z10;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        boolean z11 = false;
        this.mState.f1967i = false;
        if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f1962d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            b bVar = this.mAdapterHelper;
            if (!bVar.f1863c.isEmpty() && !bVar.f1862b.isEmpty()) {
                z11 = true;
            }
            if (!z11 && !z10 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return getScrollingChildHelper().a(f10, f11, z10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return getScrollingChildHelper().b(f10, f11);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i10) {
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.onScrollStateChanged(i10);
        }
        onScrollStateChanged(i10);
        a1 a1Var = this.mScrollListener;
        if (a1Var != null) {
            a1Var.a(this, i10);
        }
        List<a1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i10);
            }
        }
    }

    public void dispatchOnScrolled(int i10, int i11) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i10, scrollY - i11);
        onScrolled(i10, i11);
        a1 a1Var = this.mScrollListener;
        if (a1Var != null) {
            a1Var.b(this, i10, i11);
        }
        List<a1> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i10, i11);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i10;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            o1 o1Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (o1Var.itemView.getParent() == this && !o1Var.shouldIgnore() && (i10 = o1Var.mPendingAccessibilityState) != -1) {
                ViewCompat.setImportantForAccessibility(o1Var.itemView, i10);
                o1Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        boolean z10;
        int i10;
        boolean z11;
        boolean z12;
        int i11;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z13 = false;
        for (int i12 = 0; i12 < size; i12++) {
            this.mItemDecorations.get(i12).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z14 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i11 = getPaddingBottom();
            } else {
                i11 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i11, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z10 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z12 = true;
            } else {
                z12 = false;
            }
            z10 |= z12;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i10 = getPaddingTop();
            } else {
                i10 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i10, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z11 = true;
            } else {
                z11 = false;
            }
            z10 |= z11;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z13 = true;
            }
            z10 |= z13;
            canvas.restoreToCount(save4);
        }
        if (z10 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) {
            z14 = z10;
        }
        if (z14) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((l1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mBottomGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow != null) {
            return;
        }
        ((l1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mLeftGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow != null) {
            return;
        }
        ((l1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mRightGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow != null) {
            return;
        }
        ((l1) this.mEdgeEffectFactory).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.mTopGlow = edgeEffect;
        if (this.mClipToPadding) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public String exceptionLabel() {
        return " " + super.toString() + ", adapter:" + this.mAdapter + ", layout:" + this.mLayout + ", context:" + getContext();
    }

    public final void fillRemainingScrollValues(k1 k1Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f1978d;
            overScroller.getFinalX();
            overScroller.getCurrX();
            k1Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        k1Var.getClass();
    }

    @Nullable
    public View findChildViewUnder(float f10, float f11) {
        for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
            View d10 = this.mChildHelper.d(e2);
            float translationX = d10.getTranslationX();
            float translationY = d10.getTranslationY();
            if (f10 >= d10.getLeft() + translationX && f10 <= d10.getRight() + translationX && f11 >= d10.getTop() + translationY && f11 <= d10.getBottom() + translationY) {
                return d10;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:
    
        return r3;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View findContainingItemView(@androidx.annotation.NonNull android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findContainingItemView(android.view.View):android.view.View");
    }

    @Nullable
    public o1 findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @Nullable
    public o1 findViewHolderForAdapterPosition(int i10) {
        o1 o1Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h10 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h10; i11++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i10) {
                if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                    o1Var = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return o1Var;
    }

    public o1 findViewHolderForItemId(long j3) {
        j0 j0Var = this.mAdapter;
        o1 o1Var = null;
        if (j0Var != null && j0Var.hasStableIds()) {
            int h10 = this.mChildHelper.h();
            for (int i10 = 0; i10 < h10; i10++) {
                o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j3) {
                    if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                        o1Var = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return o1Var;
    }

    @Nullable
    public o1 findViewHolderForLayoutPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    @Nullable
    @Deprecated
    public o1 findViewHolderForPosition(int i10) {
        return findViewHolderForPosition(i10, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x0201, code lost:
    
        if (r0 < r14) goto L346;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.recyclerview.widget.RecyclerView] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.recyclerview.widget.f0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7, types: [androidx.recyclerview.widget.v0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fling(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 589
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i10) {
        boolean z10;
        View view2;
        boolean z11;
        boolean z12;
        boolean z13;
        int i11;
        int i12;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i10);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z14 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z10 = true;
        } else {
            z10 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z10 && (i10 == 2 || i10 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (i10 == 2) {
                    i12 = 130;
                } else {
                    i12 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i12) == null) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i12;
                }
            } else {
                z11 = false;
            }
            if (!z11 && this.mLayout.canScrollHorizontally()) {
                if (this.mLayout.getLayoutDirection() == 1) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i10 == 2) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 ^ z13) {
                    i11 = 66;
                } else {
                    i11 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i11) != null) {
                    z14 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i10 = i11;
                }
                z11 = z14;
            }
            if (z11) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i10);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i10);
            if (findNextFocus == null && z10) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i10, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i10);
            }
            requestChildOnScreen(view2, null);
            return view;
        }
        if (!isPreferredNextFocus(view, view2, i10)) {
            return super.focusSearch(view, i10);
        }
        return view2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            return v0Var.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(a4.j.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            return v0Var.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(a4.j.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public j0 getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(o1 o1Var) {
        if (o1Var.hasAnyOfTheFlags(524) || !o1Var.isBound()) {
            return -1;
        }
        b bVar = this.mAdapterHelper;
        int i10 = o1Var.mPosition;
        ArrayList arrayList = bVar.f1862b;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = (a) arrayList.get(i11);
            int i12 = aVar.a;
            if (i12 != 1) {
                if (i12 != 2) {
                    if (i12 == 8) {
                        int i13 = aVar.f1855b;
                        if (i13 == i10) {
                            i10 = aVar.f1857d;
                        } else {
                            if (i13 < i10) {
                                i10--;
                            }
                            if (aVar.f1857d <= i10) {
                                i10++;
                            }
                        }
                    }
                } else {
                    int i14 = aVar.f1855b;
                    if (i14 <= i10) {
                        int i15 = aVar.f1857d;
                        if (i14 + i15 > i10) {
                            return -1;
                        }
                        i10 -= i15;
                    } else {
                        continue;
                    }
                }
            } else if (aVar.f1855b <= i10) {
                i10 += aVar.f1857d;
            }
        }
        return i10;
    }

    @Override // android.view.View
    public int getBaseline() {
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            return v0Var.getBaseline();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(o1 o1Var) {
        return this.mAdapter.hasStableIds() ? o1Var.getItemId() : o1Var.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        o1 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        return super.getChildDrawingOrder(i10, i11);
    }

    public long getChildItemId(@NonNull View view) {
        o1 childViewHolderInt;
        j0 j0Var = this.mAdapter;
        if (j0Var == null || !j0Var.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        o1 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public o1 getChildViewHolder(@NonNull View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return getChildViewHolderInt(view);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    @Nullable
    public q1 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public n0 getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public q0 getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        w0 w0Var = (w0) view.getLayoutParams();
        boolean z10 = w0Var.f2060c;
        Rect rect = w0Var.f2059b;
        if (!z10) {
            return rect;
        }
        if (this.mState.f1965g && (w0Var.b() || w0Var.a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i10).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i11 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i11 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        w0Var.f2060c = false;
        return rect;
    }

    @NonNull
    public r0 getItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            return this.mItemDecorations.get(i10);
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public v0 getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0L;
    }

    @Nullable
    public y0 getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public c1 getRecycledViewPool() {
        return this.mRecycler.c();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().f(0) != null;
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.g()) {
            return false;
        }
        return true;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new b(new h0(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException(a4.j.d(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() == 0) {
            return;
        }
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        q0 q0Var = this.mItemAnimator;
        return q0Var != null && q0Var.f();
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().f22361d;
    }

    public void jumpToPositionForSmoothScroller(int i10) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i10);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            ((w0) this.mChildHelper.g(i10).getLayoutParams()).f2060c = true;
        }
        ArrayList arrayList = this.mRecycler.f1891c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            w0 w0Var = (w0) ((o1) arrayList.get(i11)).itemView.getLayoutParams();
            if (w0Var != null) {
                w0Var.f2060c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        d1 d1Var = this.mRecycler;
        ArrayList arrayList = d1Var.f1891c;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            o1 o1Var = (o1) arrayList.get(i11);
            if (o1Var != null) {
                o1Var.addFlags(6);
                o1Var.addChangePayload(null);
            }
        }
        j0 j0Var = d1Var.f1896h.mAdapter;
        if (j0Var == null || !j0Var.hasStableIds()) {
            d1Var.h();
        }
    }

    public void nestedScrollBy(int i10, int i11) {
        nestedScrollByInternal(i10, i11, null, 1);
    }

    public void offsetChildrenHorizontal(int i10) {
        int e2 = this.mChildHelper.e();
        for (int i11 = 0; i11 < e2; i11++) {
            this.mChildHelper.d(i11).offsetLeftAndRight(i10);
        }
    }

    public void offsetChildrenVertical(int i10) {
        int e2 = this.mChildHelper.e();
        for (int i11 = 0; i11 < e2; i11++) {
            this.mChildHelper.d(i11).offsetTopAndBottom(i10);
        }
    }

    public void offsetPositionRecordsForInsert(int i10, int i11) {
        int h10 = this.mChildHelper.h();
        for (int i12 = 0; i12 < h10; i12++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i11));
                }
                childViewHolderInt.offsetPosition(i11, false);
                this.mState.f1964f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f1891c;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            o1 o1Var = (o1) arrayList.get(i13);
            if (o1Var != null && o1Var.mPosition >= i10) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i13 + " holder " + o1Var + " now at position " + (o1Var.mPosition + i11));
                }
                o1Var.offsetPosition(i11, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int h10 = this.mChildHelper.h();
        int i19 = -1;
        if (i10 < i11) {
            i13 = i10;
            i12 = i11;
            i14 = -1;
        } else {
            i12 = i10;
            i13 = i11;
            i14 = 1;
        }
        for (int i20 = 0; i20 < h10; i20++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i20));
            if (childViewHolderInt != null && (i18 = childViewHolderInt.mPosition) >= i13 && i18 <= i12) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i20 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i10) {
                    childViewHolderInt.offsetPosition(i11 - i10, false);
                } else {
                    childViewHolderInt.offsetPosition(i14, false);
                }
                this.mState.f1964f = true;
            }
        }
        d1 d1Var = this.mRecycler;
        d1Var.getClass();
        if (i10 < i11) {
            i16 = i10;
            i15 = i11;
        } else {
            i15 = i10;
            i19 = 1;
            i16 = i11;
        }
        ArrayList arrayList = d1Var.f1891c;
        int size = arrayList.size();
        for (int i21 = 0; i21 < size; i21++) {
            o1 o1Var = (o1) arrayList.get(i21);
            if (o1Var != null && (i17 = o1Var.mPosition) >= i16 && i17 <= i15) {
                if (i17 == i10) {
                    o1Var.offsetPosition(i11 - i10, false);
                } else {
                    o1Var.offsetPosition(i19, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i21 + " holder " + o1Var);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i10, int i11, boolean z10) {
        int i12 = i10 + i11;
        int h10 = this.mChildHelper.h();
        for (int i13 = 0; i13 < h10; i13++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i13));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i14 = childViewHolderInt.mPosition;
                if (i14 >= i12) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i11));
                    }
                    childViewHolderInt.offsetPosition(-i11, z10);
                    this.mState.f1964f = true;
                } else if (i14 >= i10) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i13 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i10 - 1, -i11, z10);
                    this.mState.f1964f = true;
                }
            }
        }
        d1 d1Var = this.mRecycler;
        ArrayList arrayList = d1Var.f1891c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                o1 o1Var = (o1) arrayList.get(size);
                if (o1Var != null) {
                    int i15 = o1Var.mPosition;
                    if (i15 >= i12) {
                        if (sVerboseLoggingEnabled) {
                            Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + o1Var + " now at position " + (o1Var.mPosition - i11));
                        }
                        o1Var.offsetPosition(-i11, z10);
                    } else if (i15 >= i10) {
                        o1Var.addFlags(8);
                        d1Var.i(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
    
        if (r1 >= 30.0f) goto L55;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.mLayoutOrScrollCounter = r0
            r1 = 1
            r5.mIsAttached = r1
            boolean r2 = r5.mFirstLayoutComplete
            if (r2 == 0) goto L14
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L14
            goto L15
        L14:
            r1 = r0
        L15:
            r5.mFirstLayoutComplete = r1
            androidx.recyclerview.widget.d1 r1 = r5.mRecycler
            r1.f()
            androidx.recyclerview.widget.v0 r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L7e
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.s.f2025g
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.s r1 = (androidx.recyclerview.widget.s) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L61
            androidx.recyclerview.widget.s r1 = new androidx.recyclerview.widget.s
            r1.<init>()
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.getDisplay(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L53
            if (r1 == 0) goto L53
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L53
            goto L55
        L53:
            r1 = 1114636288(0x42700000, float:60.0)
        L55:
            androidx.recyclerview.widget.s r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f2029d = r3
            r0.set(r2)
        L61:
            androidx.recyclerview.widget.s r0 = r5.mGapWorker
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            java.util.ArrayList r0 = r0.f2027b
            if (r1 == 0) goto L7b
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L73
            goto L7b
        L73:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7b:
            r0.add(r5)
        L7e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    public void onChildAttachedToWindow(@NonNull View view) {
    }

    public void onChildDetachedFromWindow(@NonNull View view) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        s sVar;
        super.onDetachedFromWindow();
        q0 q0Var = this.mItemAnimator;
        if (q0Var != null) {
            q0Var.e();
        }
        stopScroll();
        int i10 = 0;
        this.mIsAttached = false;
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (b2.f1878d.d() != null);
        d1 d1Var = this.mRecycler;
        int i11 = 0;
        while (true) {
            ArrayList arrayList = d1Var.f1891c;
            if (i11 >= arrayList.size()) {
                break;
            }
            com.facebook.appevents.i.a(((o1) arrayList.get(i11)).itemView);
            i11++;
        }
        d1Var.g(d1Var.f1896h.mAdapter, false);
        Intrinsics.checkNotNullParameter(this, "<this>");
        Iterator it = new n0.k1(this, i10).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            v0.a aVar = (v0.a) view.getTag(com.plantcare.ai.identifier.plantid.R.id.pooling_container_listener_holder_tag);
            if (aVar == null) {
                aVar = new v0.a();
                view.setTag(com.plantcare.ai.identifier.plantid.R.id.pooling_container_listener_holder_tag, aVar);
            }
            ArrayList arrayList2 = aVar.a;
            int lastIndex = CollectionsKt.getLastIndex(arrayList2);
            if (-1 < lastIndex) {
                a4.j.t(arrayList2.get(lastIndex));
                throw null;
            }
        }
        if (ALLOW_THREAD_GAP_WORK && (sVar = this.mGapWorker) != null) {
            boolean remove = sVar.f2027b.remove(this);
            if (sDebugAssertionsEnabled && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.mGapWorker = null;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mItemDecorations.get(i10).onDraw(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onGenericMotionEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            androidx.recyclerview.widget.v0 r0 = r5.mLayout
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            boolean r0 = r5.mLayoutSuppressed
            if (r0 == 0) goto Lb
            return r1
        Lb:
            int r0 = r6.getAction()
            r2 = 8
            if (r0 != r2) goto L78
            int r0 = r6.getSource()
            r0 = r0 & 2
            r2 = 0
            if (r0 == 0) goto L3e
            androidx.recyclerview.widget.v0 r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.v0 r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L3c
            r3 = 10
            float r3 = r6.getAxisValue(r3)
            goto L64
        L3c:
            r3 = r2
            goto L64
        L3e:
            int r0 = r6.getSource()
            r3 = 4194304(0x400000, float:5.877472E-39)
            r0 = r0 & r3
            if (r0 == 0) goto L62
            r0 = 26
            float r0 = r6.getAxisValue(r0)
            androidx.recyclerview.widget.v0 r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.v0 r3 = r5.mLayout
            boolean r3 = r3.canScrollHorizontally()
            if (r3 == 0) goto L62
            r3 = r0
            r0 = r2
            goto L64
        L62:
            r0 = r2
            r3 = r0
        L64:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L6c
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 == 0) goto L78
        L6c:
            float r2 = r5.mScaledHorizontalScrollFactor
            float r3 = r3 * r2
            int r2 = (int) r3
            float r3 = r5.mScaledVerticalScrollFactor
            float r0 = r0 * r3
            int r0 = (int) r0
            r3 = 1
            r5.nestedScrollByInternal(r2, r0, r6, r3)
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        v0 v0Var = this.mLayout;
        if (v0Var == null) {
            return false;
        }
        boolean canScrollHorizontally = v0Var.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                onPointerUp(motionEvent);
                            }
                        } else {
                            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
                            int x10 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x10;
                            this.mInitialTouchX = x10;
                            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.mLastTouchY = y4;
                            this.mInitialTouchY = y4;
                        }
                    } else {
                        cancelScroll();
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
                    if (findPointerIndex < 0) {
                        Log.e(TAG, "Error processing scroll; pointer index for id " + this.mScrollPointerId + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x11 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y10 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i10 = x11 - this.mInitialTouchX;
                        int i11 = y10 - this.mInitialTouchY;
                        if (canScrollHorizontally != 0 && Math.abs(i10) > this.mTouchSlop) {
                            this.mLastTouchX = x11;
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (canScrollVertically && Math.abs(i11) > this.mTouchSlop) {
                            this.mLastTouchY = y10;
                            z10 = true;
                        }
                        if (z10) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.mVelocityTracker.clear();
                stopNestedScroll(0);
            }
        } else {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x12 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x12;
            this.mInitialTouchX = x12;
            int y11 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y11;
            this.mInitialTouchY = y11;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i12 = canScrollHorizontally;
            if (canScrollVertically) {
                i12 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i12, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14 = j0.n.a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        v0 v0Var = this.mLayout;
        if (v0Var == null) {
            defaultOnMeasure(i10, i11);
            return;
        }
        boolean z10 = false;
        if (v0Var.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z10 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z10;
            if (!z10 && this.mAdapter != null) {
                if (this.mState.f1962d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i10, i11);
                this.mState.f1967i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f1967i = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i10, i11);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            k1 k1Var = this.mState;
            if (k1Var.f1969k) {
                k1Var.f1965g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f1965g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f1969k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        j0 j0Var = this.mAdapter;
        if (j0Var != null) {
            this.mState.f1963e = j0Var.getItemCount();
        } else {
            this.mState.f1963e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i10, i11);
        stopInterceptRequestLayout(false);
        this.mState.f1965g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof g1)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g1 g1Var = (g1) parcelable;
        this.mPendingSavedState = g1Var;
        super.onRestoreInstanceState(g1Var.f26666b);
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        g1 g1Var = new g1(super.onSaveInstanceState());
        g1 g1Var2 = this.mPendingSavedState;
        if (g1Var2 != null) {
            g1Var.f1918d = g1Var2.f1918d;
        } else {
            v0 v0Var = this.mLayout;
            if (v0Var != null) {
                g1Var.f1918d = v0Var.onSaveInstanceState();
            } else {
                g1Var.f1918d = null;
            }
        }
        return g1Var;
    }

    public void onScrollStateChanged(int i10) {
    }

    public void onScrolled(int i10, int i11) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12 || i11 != i13) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 496
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            ViewCompat.postOnAnimation(this, this.mItemAnimatorRunner);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z10) {
        this.mDispatchItemsChangedEvent = z10 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(o1 o1Var, p0 p0Var) {
        o1Var.setFlags(0, 8192);
        if (this.mState.f1966h && o1Var.isUpdated() && !o1Var.isRemoved() && !o1Var.shouldIgnore()) {
            this.mViewInfoStore.f1897b.f(getChangedHolderKey(o1Var), o1Var);
        }
        r.k kVar = this.mViewInfoStore.a;
        b2 b2Var = (b2) kVar.getOrDefault(o1Var, null);
        if (b2Var == null) {
            b2Var = b2.a();
            kVar.put(o1Var, b2Var);
        }
        b2Var.f1879b = p0Var;
        b2Var.a |= 4;
    }

    public void removeAndRecycleViews() {
        q0 q0Var = this.mItemAnimator;
        if (q0Var != null) {
            q0Var.e();
        }
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        d1 d1Var = this.mRecycler;
        d1Var.a.clear();
        d1Var.h();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean removeAnimatingView(android.view.View r8) {
        /*
            r7 = this;
            r7.startInterceptRequestLayout()
            androidx.recyclerview.widget.d r0 = r7.mChildHelper
            androidx.recyclerview.widget.c r1 = r0.f1886b
            androidx.recyclerview.widget.h0 r2 = r0.a
            int r3 = r0.f1888d
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L1c
            android.view.View r0 = r0.f1889e
            if (r0 != r8) goto L14
            goto L42
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r0)
            throw r8
        L1c:
            r6 = 2
            if (r3 == r6) goto L7c
            r0.f1888d = r6     // Catch: java.lang.Throwable -> L78
            androidx.recyclerview.widget.RecyclerView r3 = r2.a     // Catch: java.lang.Throwable -> L78
            int r3 = r3.indexOfChild(r8)     // Catch: java.lang.Throwable -> L78
            r6 = -1
            if (r3 != r6) goto L2e
            r0.m(r8)     // Catch: java.lang.Throwable -> L78
            goto L3d
        L2e:
            boolean r6 = r1.f(r3)     // Catch: java.lang.Throwable -> L78
            if (r6 == 0) goto L40
            r1.k(r3)     // Catch: java.lang.Throwable -> L78
            r0.m(r8)     // Catch: java.lang.Throwable -> L78
            r2.d(r3)     // Catch: java.lang.Throwable -> L78
        L3d:
            r0.f1888d = r5
            goto L43
        L40:
            r0.f1888d = r5
        L42:
            r4 = r5
        L43:
            if (r4 == 0) goto L72
            androidx.recyclerview.widget.o1 r0 = getChildViewHolderInt(r8)
            androidx.recyclerview.widget.d1 r1 = r7.mRecycler
            r1.n(r0)
            androidx.recyclerview.widget.d1 r1 = r7.mRecycler
            r1.k(r0)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r0 == 0) goto L72
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "after removing animated view: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = ", "
            r0.append(r8)
            r0.append(r7)
            java.lang.String r8 = r0.toString()
            java.lang.String r0 = "RecyclerView"
            android.util.Log.d(r0, r8)
        L72:
            r8 = r4 ^ 1
            r7.stopInterceptRequestLayout(r8)
            return r4
        L78:
            r8 = move-exception
            r0.f1888d = r5
            throw r8
        L7c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z10) {
        o1 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb2 = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb2.append(childViewHolderInt);
                throw new IllegalArgumentException(a4.j.d(this, sb2));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb3 = new StringBuilder("No ViewHolder found for child: ");
            sb3.append(view);
            throw new IllegalArgumentException(a4.j.d(this, sb3));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z10);
    }

    public void removeItemDecoration(@NonNull r0 r0Var) {
        boolean z10;
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            v0Var.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(r0Var);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            setWillNotDraw(z10);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i10) {
        int itemDecorationCount = getItemDecorationCount();
        if (i10 >= 0 && i10 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i10));
            return;
        }
        throw new IndexOutOfBoundsException(i10 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull x0 x0Var) {
        List<x0> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(x0Var);
    }

    public void removeOnItemTouchListener(@NonNull z0 z0Var) {
        this.mOnItemTouchListeners.remove(z0Var);
        if (this.mInterceptingOnItemTouchListener == z0Var) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull a1 a1Var) {
        List<a1> list = this.mScrollListeners;
        if (list != null) {
            list.remove(a1Var);
        }
    }

    public void removeRecyclerListener(@NonNull e1 e1Var) {
        this.mRecyclerListeners.remove(e1Var);
    }

    public void repositionShadowingViews() {
        o1 o1Var;
        int e2 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e2; i10++) {
            View d10 = this.mChildHelper.d(i10);
            o1 childViewHolder = getChildViewHolder(d10);
            if (childViewHolder != null && (o1Var = childViewHolder.mShadowingHolder) != null) {
                View view = o1Var.itemView;
                int left = d10.getLeft();
                int top = d10.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        int size = this.mOnItemTouchListeners.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.mOnItemTouchListeners.get(i10).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth == 0 && !this.mLayoutSuppressed) {
            super.requestLayout();
        } else {
            this.mLayoutWasDefered = true;
        }
    }

    public void saveOldPositions() {
        int h10 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h10; i10++) {
            o1 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(a4.j.d(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i10, int i11) {
        v0 v0Var = this.mLayout;
        if (v0Var == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = v0Var.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i10 = 0;
            }
            if (!canScrollVertically) {
                i11 = 0;
            }
            scrollByInternal(i10, i11, null, 0);
        }
    }

    public boolean scrollByInternal(int i10, int i11, MotionEvent motionEvent, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z10;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i10, i11, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i17 = iArr2[0];
            int i18 = iArr2[1];
            i13 = i18;
            i14 = i17;
            i15 = i10 - i17;
            i16 = i11 - i18;
        } else {
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i14, i13, i15, i16, this.mScrollOffset, i12, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i19 = iArr4[0];
        int i20 = i15 - i19;
        int i21 = iArr4[1];
        int i22 = i16 - i21;
        if (i19 == 0 && i21 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i23 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i24 = iArr5[0];
        this.mLastTouchX = i23 - i24;
        int i25 = this.mLastTouchY;
        int i26 = iArr5[1];
        this.mLastTouchY = i25 - i26;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i24;
        iArr6[1] = iArr6[1] + i26;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.isFromSource(motionEvent, FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)) {
                pullGlows(motionEvent.getX(), i20, motionEvent.getY(), i22);
            }
            considerReleasingGlowsOnScroll(i10, i11);
        }
        if (i14 != 0 || i13 != 0) {
            dispatchOnScrolled(i14, i13);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z10 || i14 != 0 || i13 != 0) {
            return true;
        }
        return false;
    }

    public void scrollStep(int i10, int i11, @Nullable int[] iArr) {
        int i12;
        int i13;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i14 = j0.n.a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i10 != 0) {
            i12 = this.mLayout.scrollHorizontallyBy(i10, this.mRecycler, this.mState);
        } else {
            i12 = 0;
        }
        if (i11 != 0) {
            i13 = this.mLayout.scrollVerticallyBy(i11, this.mRecycler, this.mState);
        } else {
            i13 = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i12;
            iArr[1] = i13;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        v0 v0Var = this.mLayout;
        if (v0Var == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            v0Var.scrollToPosition(i10);
            awakenScrollBars();
        }
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (shouldDeferAccessibilityEvent(accessibilityEvent)) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(@Nullable q1 q1Var) {
        this.mAccessibilityDelegate = q1Var;
        ViewCompat.setAccessibilityDelegate(this, q1Var);
    }

    public void setAdapter(@Nullable j0 j0Var) {
        setLayoutFrozen(false);
        setAdapterInternal(j0Var, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable m0 m0Var) {
        if (m0Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(o1 o1Var, int i10) {
        if (isComputingLayout()) {
            o1Var.mPendingAccessibilityState = i10;
            this.mPendingAccessibilityImportanceChange.add(o1Var);
            return false;
        }
        ViewCompat.setImportantForAccessibility(o1Var.itemView, i10);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z10) {
        if (z10 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z10;
        super.setClipToPadding(z10);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull n0 n0Var) {
        n0Var.getClass();
        this.mEdgeEffectFactory = n0Var;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z10) {
        this.mHasFixedSize = z10;
    }

    public void setItemAnimator(@Nullable q0 q0Var) {
        q0 q0Var2 = this.mItemAnimator;
        if (q0Var2 != null) {
            q0Var2.e();
            this.mItemAnimator.a = null;
        }
        this.mItemAnimator = q0Var;
        if (q0Var != null) {
            q0Var.a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i10) {
        d1 d1Var = this.mRecycler;
        d1Var.f1893e = i10;
        d1Var.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z10) {
        suppressLayout(z10);
    }

    public void setLayoutManager(@Nullable v0 v0Var) {
        h0 h0Var;
        RecyclerView recyclerView;
        if (v0Var == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            q0 q0Var = this.mItemAnimator;
            if (q0Var != null) {
                q0Var.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            d1 d1Var = this.mRecycler;
            d1Var.a.clear();
            d1Var.h();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            d1 d1Var2 = this.mRecycler;
            d1Var2.a.clear();
            d1Var2.h();
        }
        d dVar = this.mChildHelper;
        dVar.f1886b.l();
        ArrayList arrayList = dVar.f1887c;
        int size = arrayList.size();
        while (true) {
            size--;
            h0Var = dVar.a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            h0Var.getClass();
            o1 childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(h0Var.a);
            }
            arrayList.remove(size);
        }
        int c10 = h0Var.c();
        int i10 = 0;
        while (true) {
            recyclerView = h0Var.a;
            if (i10 >= c10) {
                break;
            }
            View childAt = recyclerView.getChildAt(i10);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
            i10++;
        }
        recyclerView.removeAllViews();
        this.mLayout = v0Var;
        if (v0Var != null) {
            if (v0Var.mRecyclerView == null) {
                v0Var.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            } else {
                StringBuilder sb2 = new StringBuilder("LayoutManager ");
                sb2.append(v0Var);
                sb2.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(a4.j.d(v0Var.mRecyclerView, sb2));
            }
        }
        this.mRecycler.o();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z10) {
        n0.w scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f22361d) {
            ViewCompat.stopNestedScroll(scrollingChildHelper.f22360c);
        }
        scrollingChildHelper.f22361d = z10;
    }

    public void setOnFlingListener(@Nullable y0 y0Var) {
        this.mOnFlingListener = y0Var;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable a1 a1Var) {
        this.mScrollListener = a1Var;
    }

    public void setPreserveFocusAfterLayout(boolean z10) {
        this.mPreserveFocusAfterLayout = z10;
    }

    public void setRecycledViewPool(@Nullable c1 c1Var) {
        d1 d1Var = this.mRecycler;
        RecyclerView recyclerView = d1Var.f1896h;
        d1Var.g(recyclerView.mAdapter, false);
        if (d1Var.f1895g != null) {
            r2.f1884b--;
        }
        d1Var.f1895g = c1Var;
        if (c1Var != null && recyclerView.getAdapter() != null) {
            d1Var.f1895g.f1884b++;
        }
        d1Var.f();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable e1 e1Var) {
    }

    public void setScrollState(int i10) {
        if (i10 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder m10 = a4.j.m("setting scroll state to ", i10, " from ");
            m10.append(this.mScrollState);
            Log.d(TAG, m10.toString(), new Exception());
        }
        this.mScrollState = i10;
        if (i10 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i10);
    }

    public void setScrollingTouchSlop(int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i10 != 0) {
            if (i10 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i10 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable m1 m1Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i10;
        int i11 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i10 = accessibilityEvent.getContentChangeTypes();
        } else {
            i10 = 0;
        }
        if (i10 != 0) {
            i11 = i10;
        }
        this.mEatenAccessibilityChangeFlags |= i11;
        return true;
    }

    public void smoothScrollBy(int i10, int i11) {
        smoothScrollBy(i10, i11, null);
    }

    public void smoothScrollToPosition(int i10) {
        if (this.mLayoutSuppressed) {
            return;
        }
        v0 v0Var = this.mLayout;
        if (v0Var == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            v0Var.smoothScrollToPosition(this, this.mState, i10);
        }
    }

    public void startInterceptRequestLayout() {
        int i10 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i10;
        if (i10 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i10) {
        return getScrollingChildHelper().g(i10, 0);
    }

    public void stopInterceptRequestLayout(boolean z10) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (!sDebugAssertionsEnabled) {
                this.mInterceptRequestLayoutDepth = 1;
            } else {
                throw new IllegalStateException(a4.j.d(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z10 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z10 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        getScrollingChildHelper().h(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z10) {
        if (z10 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z10) {
                this.mLayoutSuppressed = false;
                if (this.mLayoutWasDefered && this.mLayout != null && this.mAdapter != null) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, DECELERATION_RATE, DECELERATION_RATE, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(@Nullable j0 j0Var, boolean z10) {
        setLayoutFrozen(false);
        setAdapterInternal(j0Var, true, z10);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i10, int i11, Object obj) {
        int i12;
        int i13;
        int h10 = this.mChildHelper.h();
        int i14 = i11 + i10;
        for (int i15 = 0; i15 < h10; i15++) {
            View g10 = this.mChildHelper.g(i15);
            o1 childViewHolderInt = getChildViewHolderInt(g10);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i13 = childViewHolderInt.mPosition) >= i10 && i13 < i14) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((w0) g10.getLayoutParams()).f2060c = true;
            }
        }
        d1 d1Var = this.mRecycler;
        ArrayList arrayList = d1Var.f1891c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                o1 o1Var = (o1) arrayList.get(size);
                if (o1Var != null && (i12 = o1Var.mPosition) >= i10 && i12 < i14) {
                    o1Var.addFlags(2);
                    d1Var.i(size);
                }
            } else {
                return;
            }
        }
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.recyclerview.R.attr.recyclerViewStyle);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.recyclerview.widget.o1 findViewHolderForPosition(int r6, boolean r7) {
        /*
            r5 = this;
            androidx.recyclerview.widget.d r0 = r5.mChildHelper
            int r0 = r0.h()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L3a
            androidx.recyclerview.widget.d r3 = r5.mChildHelper
            android.view.View r3 = r3.g(r2)
            androidx.recyclerview.widget.o1 r3 = getChildViewHolderInt(r3)
            if (r3 == 0) goto L37
            boolean r4 = r3.isRemoved()
            if (r4 != 0) goto L37
            if (r7 == 0) goto L23
            int r4 = r3.mPosition
            if (r4 == r6) goto L2a
            goto L37
        L23:
            int r4 = r3.getLayoutPosition()
            if (r4 == r6) goto L2a
            goto L37
        L2a:
            androidx.recyclerview.widget.d r1 = r5.mChildHelper
            android.view.View r4 = r3.itemView
            boolean r1 = r1.k(r4)
            if (r1 == 0) goto L36
            r1 = r3
            goto L37
        L36:
            return r3
        L37:
            int r2 = r2 + 1
            goto L8
        L3a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.o1");
    }

    public void onExitLayoutOrScroll(boolean z10) {
        int i10 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i10;
        if (i10 < 1) {
            if (sDebugAssertionsEnabled && i10 < 0) {
                throw new IllegalStateException(a4.j.d(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z10) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i10, int i11, @Nullable Interpolator interpolator) {
        smoothScrollBy(i10, i11, interpolator, Integer.MIN_VALUE);
    }

    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.mObserver = new f1(this);
        this.mRecycler = new d1(this);
        this.mViewInfoStore = new d2();
        this.mUpdateChildViewsRunnable = new g0(this, 0);
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = sDefaultEdgeEffectFactory;
        this.mItemAnimator = new k();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        int i11 = 1;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new n1(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new q() : null;
        this.mState = new k1();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new h0(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new g0(this, i11);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new h0(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        this.mScaledHorizontalScrollFactor = ViewConfigurationCompat.getScaledHorizontalScrollFactor(viewConfiguration, context);
        this.mScaledVerticalScrollFactor = ViewConfigurationCompat.getScaledVerticalScrollFactor(viewConfiguration, context);
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mPhysicalCoef = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new q1(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i10, 0);
        String string = obtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z10 = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z10;
        if (z10) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i10, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes2, i10, 0);
        boolean z11 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z11);
        Intrinsics.checkNotNullParameter(this, "<this>");
        setTag(com.plantcare.ai.identifier.plantid.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // n0.t
    public boolean dispatchNestedPreScroll(int i10, int i11, int[] iArr, int[] iArr2, int i12) {
        return getScrollingChildHelper().c(i10, i11, iArr, iArr2, i12);
    }

    @Override // n0.t
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14) {
        return getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, null);
    }

    @Override // n0.t
    public boolean hasNestedScrollingParent(int i10) {
        return getScrollingChildHelper().f(i10) != null;
    }

    public void smoothScrollBy(int i10, int i11, @Nullable Interpolator interpolator, int i12) {
        smoothScrollBy(i10, i11, interpolator, i12, false);
    }

    @Override // n0.t
    public boolean startNestedScroll(int i10, int i11) {
        return getScrollingChildHelper().g(i10, i11);
    }

    @Override // n0.t
    public void stopNestedScroll(int i10) {
        getScrollingChildHelper().h(i10);
    }

    public void smoothScrollBy(int i10, int i11, @Nullable Interpolator interpolator, int i12, boolean z10) {
        v0 v0Var = this.mLayout;
        if (v0Var == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!v0Var.canScrollHorizontally()) {
            i10 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i11 = 0;
        }
        if (i10 == 0 && i11 == 0) {
            return;
        }
        if (i12 == Integer.MIN_VALUE || i12 > 0) {
            if (z10) {
                int i13 = i10 != 0 ? 1 : 0;
                if (i11 != 0) {
                    i13 |= 2;
                }
                startNestedScroll(i13, 1);
            }
            this.mViewFlinger.c(i10, i11, interpolator, i12);
            return;
        }
        scrollBy(i10, i11);
    }

    @Override // n0.u
    public final void dispatchNestedScroll(int i10, int i11, int i12, int i13, int[] iArr, int i14, @NonNull int[] iArr2) {
        getScrollingChildHelper().e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    public void addItemDecoration(@NonNull r0 r0Var) {
        addItemDecoration(r0Var, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        v0 v0Var = this.mLayout;
        if (v0Var != null) {
            return v0Var.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(a4.j.d(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
