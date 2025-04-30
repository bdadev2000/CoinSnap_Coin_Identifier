package androidx.recyclerview.widget;

import T.C0289u;
import T.InterfaceC0287s;
import a0.C0326a;
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
import b0.AbstractC0547b;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import u7.AbstractC2817h;
import z.AbstractC2965e;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements T.r, InterfaceC0287s {
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
    static final m0 sDefaultEdgeEffectFactory;
    static final Interpolator sQuinticInterpolator;
    static boolean sVerboseLoggingEnabled = false;
    r0 mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    J mAdapter;
    C0518b mAdapterHelper;
    boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private M mChildDrawingOrderCallback;
    C0522d mChildHelper;
    boolean mClipToPadding;
    boolean mDataSetHasChangedAfterLayout;
    boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;

    @NonNull
    private N mEdgeEffectFactory;
    boolean mEnableFastScroller;
    boolean mFirstLayoutComplete;
    RunnableC0538s mGapWorker;
    boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private InterfaceC0517a0 mInterceptingOnItemTouchListener;
    boolean mIsAttached;
    Q mItemAnimator;
    private O mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    final ArrayList<S> mItemDecorations;
    boolean mItemsAddedOrRemoved;
    boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    W mLayout;
    private int mLayoutOrScrollCounter;
    boolean mLayoutSuppressed;
    boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final g0 mObserver;
    private List<Y> mOnChildAttachStateListeners;
    private Z mOnFlingListener;
    private final ArrayList<InterfaceC0517a0> mOnItemTouchListeners;
    final List<p0> mPendingAccessibilityImportanceChange;
    h0 mPendingSavedState;
    private final float mPhysicalCoef;
    boolean mPostedAnimatorRunner;
    C0537q mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    final C0525e0 mRecycler;
    f0 mRecyclerListener;
    final List<f0> mRecyclerListeners;
    final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private AbstractC0519b0 mScrollListener;
    private List<AbstractC0519b0> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private C0289u mScrollingChildHelper;
    final l0 mState;
    final Rect mTempRect;
    private final Rect mTempRect2;
    final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    final o0 mViewFlinger;
    private final D0 mViewInfoProcessCallback;
    final E0 mViewInfoStore;
    private static final int[] NESTED_SCROLLING_ATTRS = {R.attr.nestedScrollingEnabled};
    private static final float DECELERATION_RATE = (float) (Math.log(0.78d) / Math.log(0.9d));
    static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    static final boolean POST_UPDATES_ON_ANIMATION = true;
    static final boolean ALLOW_THREAD_GAP_WORK = true;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;

    /* JADX WARN: Type inference failed for: r0v10, types: [androidx.recyclerview.widget.m0, java.lang.Object] */
    static {
        Class cls = Integer.TYPE;
        LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = new Class[]{Context.class, AttributeSet.class, cls, cls};
        sQuinticInterpolator = new G(0);
        sDefaultEdgeEffectFactory = new Object();
    }

    public RecyclerView(@NonNull Context context) {
        this(context, null);
    }

    private void addAnimatingView(p0 p0Var) {
        boolean z8;
        View view = p0Var.itemView;
        if (view.getParent() == this) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mRecycler.m(getChildViewHolder(view));
        if (p0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z8) {
            this.mChildHelper.a(view, -1, true);
            return;
        }
        C0522d c0522d = this.mChildHelper;
        int indexOfChild = c0522d.f4963a.f4935a.indexOfChild(view);
        if (indexOfChild >= 0) {
            c0522d.b.h(indexOfChild);
            c0522d.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(@NonNull p0 p0Var, @NonNull p0 p0Var2, @NonNull P p2, @NonNull P p7, boolean z8, boolean z9) {
        p0Var.setIsRecyclable(false);
        if (z8) {
            addAnimatingView(p0Var);
        }
        if (p0Var != p0Var2) {
            if (z9) {
                addAnimatingView(p0Var2);
            }
            p0Var.mShadowedHolder = p0Var2;
            addAnimatingView(p0Var);
            this.mRecycler.m(p0Var);
            p0Var2.setIsRecyclable(false);
            p0Var2.mShadowingHolder = p0Var;
        }
        if (this.mItemAnimator.a(p0Var, p0Var2, p2, p7)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(@NonNull p0 p0Var) {
        WeakReference<RecyclerView> weakReference = p0Var.mNestedRecyclerView;
        if (weakReference != null) {
            RecyclerView recyclerView = weakReference.get();
            while (recyclerView != null) {
                if (recyclerView == p0Var.itemView) {
                    return;
                }
                Object parent = recyclerView.getParent();
                if (parent instanceof View) {
                    recyclerView = (View) parent;
                } else {
                    recyclerView = null;
                }
            }
            p0Var.mNestedRecyclerView = null;
        }
    }

    private int consumeFlingInStretch(int i9, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i10) {
        if (i9 > 0 && edgeEffect != null && e1.f.k(edgeEffect) != DECELERATION_RATE) {
            int round = Math.round(e1.f.o(edgeEffect, ((-i9) * FLING_DESTRETCH_FACTOR) / i10, 0.5f) * ((-i10) / FLING_DESTRETCH_FACTOR));
            if (round != i9) {
                edgeEffect.finish();
            }
            return i9 - round;
        }
        if (i9 < 0 && edgeEffect2 != null && e1.f.k(edgeEffect2) != DECELERATION_RATE) {
            float f9 = i10;
            int round2 = Math.round(e1.f.o(edgeEffect2, (i9 * FLING_DESTRETCH_FACTOR) / f9, 0.5f) * (f9 / FLING_DESTRETCH_FACTOR));
            if (round2 != i9) {
                edgeEffect2.finish();
            }
            return i9 - round2;
        }
        return i9;
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i9, int i10) {
        ClassLoader classLoader;
        Object[] objArr;
        Constructor constructor;
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
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(W.class);
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i9), Integer.valueOf(i10)};
                    } catch (NoSuchMethodException e4) {
                        objArr = null;
                        try {
                            constructor = asSubclass.getConstructor(null);
                        } catch (NoSuchMethodException e9) {
                            e9.initCause(e4);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e9);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((W) constructor.newInstance(objArr));
                } catch (ClassCastException e10) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e10);
                } catch (ClassNotFoundException e11) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e11);
                } catch (IllegalAccessException e12) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e12);
                } catch (InstantiationException e13) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e13);
                } catch (InvocationTargetException e14) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e14);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i9, int i10) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        if (iArr[0] == i9 && iArr[1] == i10) {
            return false;
        }
        return true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i9 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i9 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(i9);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15, types: [androidx.recyclerview.widget.P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [androidx.recyclerview.widget.P, java.lang.Object] */
    private void dispatchLayoutStep1() {
        C0 c02;
        boolean z8 = true;
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.f5033i = false;
        startInterceptRequestLayout();
        E0 e02 = this.mViewInfoStore;
        e02.f4932a.clear();
        e02.b.a();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        l0 l0Var = this.mState;
        if (!l0Var.f5034j || !this.mItemsChanged) {
            z8 = false;
        }
        l0Var.f5032h = z8;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        l0Var.f5031g = l0Var.f5035k;
        l0Var.f5029e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.f5034j) {
            int e4 = this.mChildHelper.e();
            for (int i9 = 0; i9 < e4; i9++) {
                p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i9));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    Q q9 = this.mItemAnimator;
                    Q.b(childViewHolderInt);
                    childViewHolderInt.getUnmodifiedPayloads();
                    q9.getClass();
                    ?? obj = new Object();
                    obj.a(childViewHolderInt);
                    x.l lVar = this.mViewInfoStore.f4932a;
                    C0 c03 = (C0) lVar.getOrDefault(childViewHolderInt, null);
                    if (c03 == null) {
                        c03 = C0.a();
                        lVar.put(childViewHolderInt, c03);
                    }
                    c03.b = obj;
                    c03.f4927a |= 4;
                    if (this.mState.f5032h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.b.f(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.f5035k) {
            saveOldPositions();
            l0 l0Var2 = this.mState;
            boolean z9 = l0Var2.f5030f;
            l0Var2.f5030f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, l0Var2);
            this.mState.f5030f = z9;
            for (int i10 = 0; i10 < this.mChildHelper.e(); i10++) {
                p0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i10));
                if (!childViewHolderInt2.shouldIgnore() && ((c02 = (C0) this.mViewInfoStore.f4932a.getOrDefault(childViewHolderInt2, null)) == null || (c02.f4927a & 4) == 0)) {
                    Q.b(childViewHolderInt2);
                    boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(FragmentTransaction.TRANSIT_EXIT_MASK);
                    Q q10 = this.mItemAnimator;
                    childViewHolderInt2.getUnmodifiedPayloads();
                    q10.getClass();
                    ?? obj2 = new Object();
                    obj2.a(childViewHolderInt2);
                    if (hasAnyOfTheFlags) {
                        recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, obj2);
                    } else {
                        x.l lVar2 = this.mViewInfoStore.f4932a;
                        C0 c04 = (C0) lVar2.getOrDefault(childViewHolderInt2, null);
                        if (c04 == null) {
                            c04 = C0.a();
                            lVar2.put(childViewHolderInt2, c04);
                        }
                        c04.f4927a |= 2;
                        c04.b = obj2;
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.f5028d = 2;
    }

    private void dispatchLayoutStep2() {
        boolean z8;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.f5029e = this.mAdapter.getItemCount();
        this.mState.f5027c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.f4991d;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        l0 l0Var = this.mState;
        l0Var.f5031g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, l0Var);
        l0 l0Var2 = this.mState;
        l0Var2.f5030f = false;
        if (l0Var2.f5034j && this.mItemAnimator != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        l0Var2.f5034j = z8;
        l0Var2.f5028d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v12, types: [androidx.recyclerview.widget.P, java.lang.Object] */
    private void dispatchLayoutStep3() {
        boolean g9;
        boolean z8;
        boolean z9;
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        l0 l0Var = this.mState;
        l0Var.f5028d = 1;
        if (l0Var.f5034j) {
            for (int e4 = this.mChildHelper.e() - 1; e4 >= 0; e4--) {
                p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e4));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    this.mItemAnimator.getClass();
                    ?? obj = new Object();
                    obj.a(childViewHolderInt);
                    p0 p0Var = (p0) this.mViewInfoStore.b.d(null, changedHolderKey);
                    if (p0Var != null && !p0Var.shouldIgnore()) {
                        C0 c02 = (C0) this.mViewInfoStore.f4932a.getOrDefault(p0Var, null);
                        if (c02 != null && (c02.f4927a & 1) != 0) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        C0 c03 = (C0) this.mViewInfoStore.f4932a.getOrDefault(childViewHolderInt, null);
                        if (c03 != null && (c03.f4927a & 1) != 0) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        if (z8 && p0Var == childViewHolderInt) {
                            this.mViewInfoStore.a(childViewHolderInt, obj);
                        } else {
                            P b = this.mViewInfoStore.b(p0Var, 4);
                            this.mViewInfoStore.a(childViewHolderInt, obj);
                            P b8 = this.mViewInfoStore.b(childViewHolderInt, 8);
                            if (b == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, p0Var);
                            } else {
                                animateChange(p0Var, childViewHolderInt, b, b8, z8, z9);
                            }
                        }
                    } else {
                        this.mViewInfoStore.a(childViewHolderInt, obj);
                    }
                }
            }
            E0 e02 = this.mViewInfoStore;
            D0 d02 = this.mViewInfoProcessCallback;
            x.l lVar = e02.f4932a;
            for (int i9 = lVar.f24086d - 1; i9 >= 0; i9--) {
                p0 p0Var2 = (p0) lVar.h(i9);
                C0 c04 = (C0) lVar.k(i9);
                int i10 = c04.f4927a;
                if ((i10 & 3) == 3) {
                    RecyclerView recyclerView = ((H) d02).f4935a;
                    recyclerView.mLayout.removeAndRecycleView(p0Var2.itemView, recyclerView.mRecycler);
                } else if ((i10 & 1) != 0) {
                    P p2 = c04.b;
                    if (p2 == null) {
                        RecyclerView recyclerView2 = ((H) d02).f4935a;
                        recyclerView2.mLayout.removeAndRecycleView(p0Var2.itemView, recyclerView2.mRecycler);
                    } else {
                        P p7 = c04.f4928c;
                        RecyclerView recyclerView3 = ((H) d02).f4935a;
                        recyclerView3.mRecycler.m(p0Var2);
                        recyclerView3.animateDisappearance(p0Var2, p2, p7);
                    }
                } else if ((i10 & 14) == 14) {
                    ((H) d02).f4935a.animateAppearance(p0Var2, c04.b, c04.f4928c);
                } else if ((i10 & 12) == 12) {
                    P p9 = c04.b;
                    P p10 = c04.f4928c;
                    H h6 = (H) d02;
                    h6.getClass();
                    p0Var2.setIsRecyclable(false);
                    RecyclerView recyclerView4 = h6.f4935a;
                    if (recyclerView4.mDataSetHasChangedAfterLayout) {
                        if (recyclerView4.mItemAnimator.a(p0Var2, p0Var2, p9, p10)) {
                            recyclerView4.postAnimationRunner();
                        }
                    } else {
                        C0531k c0531k = (C0531k) recyclerView4.mItemAnimator;
                        c0531k.getClass();
                        int i11 = p9.f4937a;
                        int i12 = p10.f4937a;
                        if (i11 == i12 && p9.b == p10.b) {
                            c0531k.c(p0Var2);
                            g9 = false;
                        } else {
                            g9 = c0531k.g(p0Var2, i11, p9.b, i12, p10.b);
                        }
                        if (g9) {
                            recyclerView4.postAnimationRunner();
                        }
                    }
                } else if ((i10 & 4) != 0) {
                    P p11 = c04.b;
                    RecyclerView recyclerView5 = ((H) d02).f4935a;
                    recyclerView5.mRecycler.m(p0Var2);
                    recyclerView5.animateDisappearance(p0Var2, p11, null);
                } else if ((i10 & 8) != 0) {
                    ((H) d02).f4935a.animateAppearance(p0Var2, c04.b, c04.f4928c);
                }
                c04.f4927a = 0;
                c04.b = null;
                c04.f4928c = null;
                C0.f4926d.b(c04);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        l0 l0Var2 = this.mState;
        l0Var2.b = l0Var2.f5029e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        l0Var2.f5034j = false;
        l0Var2.f5035k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        W w2 = this.mLayout;
        if (w2.mPrefetchMaxObservedInInitialPrefetch) {
            w2.mPrefetchMaxCountObserved = 0;
            w2.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.n();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        E0 e03 = this.mViewInfoStore;
        e03.f4932a.clear();
        e03.b.a();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        InterfaceC0517a0 interfaceC0517a0 = this.mInterceptingOnItemTouchListener;
        if (interfaceC0517a0 == null) {
            if (motionEvent.getAction() == 0) {
                return false;
            }
            return findInterceptingOnItemTouchListener(motionEvent);
        }
        C0536p c0536p = (C0536p) interfaceC0517a0;
        if (c0536p.f5068v != 0) {
            if (motionEvent.getAction() == 0) {
                boolean b = c0536p.b(motionEvent.getX(), motionEvent.getY());
                boolean a6 = c0536p.a(motionEvent.getX(), motionEvent.getY());
                if (b || a6) {
                    if (a6) {
                        c0536p.f5069w = 1;
                        c0536p.f5062p = (int) motionEvent.getX();
                    } else if (b) {
                        c0536p.f5069w = 2;
                        c0536p.m = (int) motionEvent.getY();
                    }
                    c0536p.d(2);
                }
            } else if (motionEvent.getAction() == 1 && c0536p.f5068v == 2) {
                c0536p.m = DECELERATION_RATE;
                c0536p.f5062p = DECELERATION_RATE;
                c0536p.d(1);
                c0536p.f5069w = 0;
            } else if (motionEvent.getAction() == 2 && c0536p.f5068v == 2) {
                c0536p.e();
                int i9 = c0536p.f5069w;
                int i10 = c0536p.b;
                if (i9 == 1) {
                    float x9 = motionEvent.getX();
                    int[] iArr = c0536p.f5071y;
                    iArr[0] = i10;
                    int i11 = c0536p.f5063q - i10;
                    iArr[1] = i11;
                    float max = Math.max(i10, Math.min(i11, x9));
                    if (Math.abs(c0536p.f5061o - max) >= 2.0f) {
                        int c9 = C0536p.c(c0536p.f5062p, max, iArr, c0536p.f5065s.computeHorizontalScrollRange(), c0536p.f5065s.computeHorizontalScrollOffset(), c0536p.f5063q);
                        if (c9 != 0) {
                            c0536p.f5065s.scrollBy(c9, 0);
                        }
                        c0536p.f5062p = max;
                    }
                }
                if (c0536p.f5069w == 2) {
                    float y4 = motionEvent.getY();
                    int[] iArr2 = c0536p.f5070x;
                    iArr2[0] = i10;
                    int i12 = c0536p.f5064r - i10;
                    iArr2[1] = i12;
                    float max2 = Math.max(i10, Math.min(i12, y4));
                    if (Math.abs(c0536p.l - max2) >= 2.0f) {
                        int c10 = C0536p.c(c0536p.m, max2, iArr2, c0536p.f5065s.computeVerticalScrollRange(), c0536p.f5065s.computeVerticalScrollOffset(), c0536p.f5064r);
                        if (c10 != 0) {
                            c0536p.f5065s.scrollBy(0, c10);
                        }
                        c0536p.m = max2;
                    }
                }
            }
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.mInterceptingOnItemTouchListener = null;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r6 == 2) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean findInterceptingOnItemTouchListener(android.view.MotionEvent r12) {
        /*
            r11 = this;
            int r0 = r12.getAction()
            java.util.ArrayList<androidx.recyclerview.widget.a0> r1 = r11.mOnItemTouchListeners
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L6e
            java.util.ArrayList<androidx.recyclerview.widget.a0> r4 = r11.mOnItemTouchListeners
            java.lang.Object r4 = r4.get(r3)
            androidx.recyclerview.widget.a0 r4 = (androidx.recyclerview.widget.InterfaceC0517a0) r4
            r5 = r4
            androidx.recyclerview.widget.p r5 = (androidx.recyclerview.widget.C0536p) r5
            int r6 = r5.f5068v
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
            r5.f5069w = r7
            float r6 = r12.getX()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.f5062p = r6
            goto L5a
        L4e:
            if (r6 == 0) goto L5a
            r5.f5069w = r8
            float r6 = r12.getY()
            int r6 = (int) r6
            float r6 = (float) r6
            r5.m = r6
        L5a:
            r5.d(r8)
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
        int e4 = this.mChildHelper.e();
        if (e4 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i9 = Integer.MAX_VALUE;
        int i10 = Integer.MIN_VALUE;
        for (int i11 = 0; i11 < e4; i11++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i11));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i9) {
                    i9 = layoutPosition;
                }
                if (layoutPosition > i10) {
                    i10 = layoutPosition;
                }
            }
        }
        iArr[0] = i9;
        iArr[1] = i10;
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
        for (int i9 = 0; i9 < childCount; i9++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i9));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    @Nullable
    private View findNextViewToFocus() {
        p0 findViewHolderForAdapterPosition;
        l0 l0Var = this.mState;
        int i9 = l0Var.l;
        if (i9 == -1) {
            i9 = 0;
        }
        int b = l0Var.b();
        for (int i10 = i9; i10 < b; i10++) {
            p0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i10);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            }
            if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            }
        }
        int min = Math.min(b, i9);
        do {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
        } while (!findViewHolderForAdapterPosition.itemView.hasFocusable());
        return findViewHolderForAdapterPosition.itemView;
    }

    public static p0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((X) view.getLayoutParams()).f4947a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        X x9 = (X) view.getLayoutParams();
        Rect rect2 = x9.b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) x9).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) x9).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) x9).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) x9).bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
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

    private C0289u getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new C0289u(this);
        }
        return this.mScrollingChildHelper;
    }

    private float getSplineFlingDistance(int i9) {
        double log = Math.log((Math.abs(i9) * INFLEXION) / (this.mPhysicalCoef * SCROLL_FRICTION));
        float f9 = DECELERATION_RATE;
        return (float) (Math.exp((f9 / (f9 - 1.0d)) * log) * this.mPhysicalCoef * SCROLL_FRICTION);
    }

    private void handleMissingPreInfoForChangeError(long j7, p0 p0Var, p0 p0Var2) {
        int e4 = this.mChildHelper.e();
        for (int i9 = 0; i9 < e4; i9++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i9));
            if (childViewHolderInt != p0Var && getChangedHolderKey(childViewHolderInt) == j7) {
                J j9 = this.mAdapter;
                if (j9 != null && j9.hasStableIds()) {
                    StringBuilder sb = new StringBuilder("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(p0Var);
                    throw new IllegalStateException(Q7.n0.h(this, sb));
                }
                StringBuilder sb2 = new StringBuilder("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(p0Var);
                throw new IllegalStateException(Q7.n0.h(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + p0Var2 + " cannot be found but it is necessary for " + p0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e4 = this.mChildHelper.e();
        for (int i9 = 0; i9 < e4; i9++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i9));
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
        this.mChildHelper = new C0522d(new H(this));
    }

    private boolean isPreferredNextFocus(View view, View view2, int i9) {
        int i10;
        int i11;
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
        char c9 = 65535;
        if (this.mLayout.getLayoutDirection() == 1) {
            i10 = -1;
        } else {
            i10 = 1;
        }
        Rect rect = this.mTempRect;
        int i12 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i13 = rect2.left;
        if ((i12 < i13 || rect.right <= i13) && rect.right < rect2.right) {
            i11 = 1;
        } else {
            int i14 = rect.right;
            int i15 = rect2.right;
            if ((i14 > i15 || i12 >= i15) && i12 > i13) {
                i11 = -1;
            } else {
                i11 = 0;
            }
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        if ((i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom) {
            c9 = 1;
        } else {
            int i18 = rect.bottom;
            int i19 = rect2.bottom;
            if ((i18 <= i19 && i16 < i19) || i16 <= i17) {
                c9 = 0;
            }
        }
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 17) {
                    if (i9 != 33) {
                        if (i9 != 66) {
                            if (i9 == 130) {
                                if (c9 <= 0) {
                                    return false;
                                }
                                return true;
                            }
                            StringBuilder sb = new StringBuilder("Invalid direction: ");
                            sb.append(i9);
                            throw new IllegalArgumentException(Q7.n0.h(this, sb));
                        }
                        if (i11 <= 0) {
                            return false;
                        }
                        return true;
                    }
                    if (c9 >= 0) {
                        return false;
                    }
                    return true;
                }
                if (i11 >= 0) {
                    return false;
                }
                return true;
            }
            if (c9 <= 0 && (c9 != 0 || i11 * i10 <= 0)) {
                return false;
            }
            return true;
        }
        if (c9 >= 0 && (c9 != 0 || i11 * i10 >= 0)) {
            return false;
        }
        return true;
    }

    private void nestedScrollByInternal(int i9, int i10, @Nullable MotionEvent motionEvent, int i11) {
        int i12;
        float y4;
        float x9;
        int i13;
        int i14;
        int i15;
        W w2 = this.mLayout;
        if (w2 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        int[] iArr = this.mReusableIntPair;
        int i16 = 0;
        iArr[0] = 0;
        iArr[1] = 0;
        boolean canScrollHorizontally = w2.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollVertically) {
            i12 = (canScrollHorizontally ? 1 : 0) | 2;
        } else {
            i12 = canScrollHorizontally ? 1 : 0;
        }
        if (motionEvent == null) {
            y4 = getHeight() / 2.0f;
        } else {
            y4 = motionEvent.getY();
        }
        if (motionEvent == null) {
            x9 = getWidth() / 2.0f;
        } else {
            x9 = motionEvent.getX();
        }
        int releaseHorizontalGlow = i9 - releaseHorizontalGlow(i9, y4);
        int releaseVerticalGlow = i10 - releaseVerticalGlow(i10, x9);
        startNestedScroll(i12, i11);
        if (canScrollHorizontally) {
            i13 = releaseHorizontalGlow;
        } else {
            i13 = 0;
        }
        if (canScrollVertically) {
            i14 = releaseVerticalGlow;
        } else {
            i14 = 0;
        }
        if (dispatchNestedPreScroll(i13, i14, this.mReusableIntPair, this.mScrollOffset, i11)) {
            int[] iArr2 = this.mReusableIntPair;
            releaseHorizontalGlow -= iArr2[0];
            releaseVerticalGlow -= iArr2[1];
        }
        if (canScrollHorizontally) {
            i15 = releaseHorizontalGlow;
        } else {
            i15 = 0;
        }
        if (canScrollVertically) {
            i16 = releaseVerticalGlow;
        }
        scrollByInternal(i15, i16, motionEvent, i11);
        RunnableC0538s runnableC0538s = this.mGapWorker;
        if (runnableC0538s != null && (releaseHorizontalGlow != 0 || releaseVerticalGlow != 0)) {
            runnableC0538s.a(this, releaseHorizontalGlow, releaseVerticalGlow);
        }
        stopNestedScroll(i11);
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int i9;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            if (actionIndex == 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            this.mScrollPointerId = motionEvent.getPointerId(i9);
            int x9 = (int) (motionEvent.getX(i9) + 0.5f);
            this.mLastTouchX = x9;
            this.mInitialTouchX = x9;
            int y4 = (int) (motionEvent.getY(i9) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        if (this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations()) {
            return true;
        }
        return false;
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            C0518b c0518b = this.mAdapterHelper;
            c0518b.l(c0518b.b);
            c0518b.l(c0518b.f4954c);
            c0518b.f4957f = 0;
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
            z8 = false;
        } else {
            z8 = true;
        }
        l0 l0Var = this.mState;
        if (this.mFirstLayoutComplete && this.mItemAnimator != null && (((z10 = this.mDataSetHasChangedAfterLayout) || z8 || this.mLayout.mRequestedSimpleAnimations) && (!z10 || this.mAdapter.hasStableIds()))) {
            z9 = true;
        } else {
            z9 = false;
        }
        l0Var.f5034j = z9;
        l0 l0Var2 = this.mState;
        if (l0Var2.f5034j && z8 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z11 = true;
        }
        l0Var2.f5035k = z11;
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
            e1.f.o(r1, r4, r9)
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
            e1.f.o(r1, r4, r9)
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
            e1.f.o(r9, r1, r7)
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
            e1.f.o(r9, r1, r2)
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
        p0 p0Var;
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
                if (this.mState.m != -1 && this.mAdapter.hasStableIds()) {
                    p0Var = findViewHolderForItemId(this.mState.m);
                } else {
                    p0Var = null;
                }
                if (p0Var != null && !this.mChildHelper.k(p0Var.itemView) && p0Var.itemView.hasFocusable()) {
                    view = p0Var.itemView;
                } else if (this.mChildHelper.e() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i9 = this.mState.f5036n;
                    if (i9 != -1 && (findViewById = view.findViewById(i9)) != null && findViewById.isFocusable()) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z8;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z8 = this.mLeftGlow.isFinished();
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z8 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z8 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z8 |= this.mBottomGlow.isFinished();
        }
        if (z8) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private int releaseHorizontalGlow(int i9, float f9) {
        float height = f9 / getHeight();
        float width = i9 / getWidth();
        EdgeEffect edgeEffect = this.mLeftGlow;
        float f10 = DECELERATION_RATE;
        if (edgeEffect != null && e1.f.k(edgeEffect) != DECELERATION_RATE) {
            if (canScrollHorizontally(-1)) {
                this.mLeftGlow.onRelease();
            } else {
                float f11 = -e1.f.o(this.mLeftGlow, -width, 1.0f - height);
                if (e1.f.k(this.mLeftGlow) == DECELERATION_RATE) {
                    this.mLeftGlow.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mRightGlow;
            if (edgeEffect2 != null && e1.f.k(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollHorizontally(1)) {
                    this.mRightGlow.onRelease();
                } else {
                    float o3 = e1.f.o(this.mRightGlow, width, height);
                    if (e1.f.k(this.mRightGlow) == DECELERATION_RATE) {
                        this.mRightGlow.onRelease();
                    }
                    f10 = o3;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getWidth());
    }

    private int releaseVerticalGlow(int i9, float f9) {
        float width = f9 / getWidth();
        float height = i9 / getHeight();
        EdgeEffect edgeEffect = this.mTopGlow;
        float f10 = DECELERATION_RATE;
        if (edgeEffect != null && e1.f.k(edgeEffect) != DECELERATION_RATE) {
            if (canScrollVertically(-1)) {
                this.mTopGlow.onRelease();
            } else {
                float f11 = -e1.f.o(this.mTopGlow, -height, width);
                if (e1.f.k(this.mTopGlow) == DECELERATION_RATE) {
                    this.mTopGlow.onRelease();
                }
                f10 = f11;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.mBottomGlow;
            if (edgeEffect2 != null && e1.f.k(edgeEffect2) != DECELERATION_RATE) {
                if (canScrollVertically(1)) {
                    this.mBottomGlow.onRelease();
                } else {
                    float o3 = e1.f.o(this.mBottomGlow, height, 1.0f - width);
                    if (e1.f.k(this.mBottomGlow) == DECELERATION_RATE) {
                        this.mBottomGlow.onRelease();
                    }
                    f10 = o3;
                }
                invalidate();
            }
        }
        return Math.round(f10 * getHeight());
    }

    private void requestChildOnScreen(@NonNull View view, @Nullable View view2) {
        View view3;
        boolean z8;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof X) {
            X x9 = (X) layoutParams;
            if (!x9.f4948c) {
                Rect rect = this.mTempRect;
                int i9 = rect.left;
                Rect rect2 = x9.b;
                rect.left = i9 - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        W w2 = this.mLayout;
        Rect rect3 = this.mTempRect;
        boolean z9 = !this.mFirstLayoutComplete;
        if (view2 == null) {
            z8 = true;
        } else {
            z8 = false;
        }
        w2.requestChildRectangleOnScreen(this, view, rect3, z9, z8);
    }

    private void resetFocusInfo() {
        l0 l0Var = this.mState;
        l0Var.m = -1L;
        l0Var.l = -1;
        l0Var.f5036n = -1;
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
        long j7;
        int absoluteAdapterPosition;
        p0 p0Var = null;
        if (this.mPreserveFocusAfterLayout && hasFocus() && this.mAdapter != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            p0Var = findContainingViewHolder(view);
        }
        if (p0Var == null) {
            resetFocusInfo();
            return;
        }
        l0 l0Var = this.mState;
        if (this.mAdapter.hasStableIds()) {
            j7 = p0Var.getItemId();
        } else {
            j7 = -1;
        }
        l0Var.m = j7;
        l0 l0Var2 = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            absoluteAdapterPosition = -1;
        } else if (p0Var.isRemoved()) {
            absoluteAdapterPosition = p0Var.mOldPosition;
        } else {
            absoluteAdapterPosition = p0Var.getAbsoluteAdapterPosition();
        }
        l0Var2.l = absoluteAdapterPosition;
        this.mState.f5036n = getDeepestFocusedViewWithId(p0Var.itemView);
    }

    private void setAdapterInternal(@Nullable J j7, boolean z8, boolean z9) {
        J j9 = this.mAdapter;
        if (j9 != null) {
            j9.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z8 || z9) {
            removeAndRecycleViews();
        }
        C0518b c0518b = this.mAdapterHelper;
        c0518b.l(c0518b.b);
        c0518b.l(c0518b.f4954c);
        int i9 = 0;
        c0518b.f4957f = 0;
        J j10 = this.mAdapter;
        this.mAdapter = j7;
        if (j7 != null) {
            j7.registerAdapterDataObserver(this.mObserver);
            j7.onAttachedToRecyclerView(this);
        }
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.onAdapterChanged(j10, this.mAdapter);
        }
        C0525e0 c0525e0 = this.mRecycler;
        J j11 = this.mAdapter;
        c0525e0.f4971a.clear();
        c0525e0.g();
        c0525e0.f(j10, true);
        C0523d0 c9 = c0525e0.c();
        if (j10 != null) {
            c9.b--;
        }
        if (!z8 && c9.b == 0) {
            while (true) {
                SparseArray sparseArray = c9.f4967a;
                if (i9 >= sparseArray.size()) {
                    break;
                }
                C0521c0 c0521c0 = (C0521c0) sparseArray.valueAt(i9);
                Iterator it = c0521c0.f4960a.iterator();
                while (it.hasNext()) {
                    r8.k.g(((p0) it.next()).itemView);
                }
                c0521c0.f4960a.clear();
                i9++;
            }
        }
        if (j11 != null) {
            c9.b++;
        } else {
            c9.getClass();
        }
        c0525e0.e();
        this.mState.f5030f = true;
    }

    public static void setDebugAssertionsEnabled(boolean z8) {
        sDebugAssertionsEnabled = z8;
    }

    public static void setVerboseLoggingEnabled(boolean z8) {
        sVerboseLoggingEnabled = z8;
    }

    private boolean shouldAbsorb(@NonNull EdgeEffect edgeEffect, int i9, int i10) {
        if (i9 > 0) {
            return true;
        }
        if (getSplineFlingDistance(-i9) < e1.f.k(edgeEffect) * i10) {
            return true;
        }
        return false;
    }

    private boolean stopGlowAnimations(MotionEvent motionEvent) {
        boolean z8;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && e1.f.k(edgeEffect) != DECELERATION_RATE && !canScrollHorizontally(-1)) {
            e1.f.o(this.mLeftGlow, DECELERATION_RATE, 1.0f - (motionEvent.getY() / getHeight()));
            z8 = true;
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && e1.f.k(edgeEffect2) != DECELERATION_RATE && !canScrollHorizontally(1)) {
            e1.f.o(this.mRightGlow, DECELERATION_RATE, motionEvent.getY() / getHeight());
            z8 = true;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && e1.f.k(edgeEffect3) != DECELERATION_RATE && !canScrollVertically(-1)) {
            e1.f.o(this.mTopGlow, DECELERATION_RATE, motionEvent.getX() / getWidth());
            z8 = true;
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && e1.f.k(edgeEffect4) != DECELERATION_RATE && !canScrollVertically(1)) {
            e1.f.o(this.mBottomGlow, DECELERATION_RATE, 1.0f - (motionEvent.getX() / getWidth()));
            return true;
        }
        return z8;
    }

    private void stopScrollersInternal() {
        o0 o0Var = this.mViewFlinger;
        o0Var.f5045i.removeCallbacks(o0Var);
        o0Var.f5041d.abortAnimation();
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i9, int i10) {
        if (i9 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i9);
            }
        } else if (i9 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i9);
            }
        }
        if (i10 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i10);
            }
        } else if (i10 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i10);
            }
        }
        if (i9 != 0 || i10 != 0) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i9, int i10) {
        W w2 = this.mLayout;
        if (w2 == null || !w2.onAddFocusables(this, arrayList, i9, i10)) {
            super.addFocusables(arrayList, i9, i10);
        }
    }

    public void addItemDecoration(@NonNull S s5, int i9) {
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i9 < 0) {
            this.mItemDecorations.add(s5);
        } else {
            this.mItemDecorations.add(i9, s5);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(@NonNull Y y4) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(y4);
    }

    public void addOnItemTouchListener(@NonNull InterfaceC0517a0 interfaceC0517a0) {
        this.mOnItemTouchListeners.add(interfaceC0517a0);
    }

    public void addOnScrollListener(@NonNull AbstractC0519b0 abstractC0519b0) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(abstractC0519b0);
    }

    public void addRecyclerListener(@NonNull f0 f0Var) {
        boolean z8;
        if (f0Var != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        C2.m.e("'listener' arg cannot be null.", z8);
        this.mRecyclerListeners.add(f0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void animateAppearance(@androidx.annotation.NonNull androidx.recyclerview.widget.p0 r8, @androidx.annotation.Nullable androidx.recyclerview.widget.P r9, @androidx.annotation.NonNull androidx.recyclerview.widget.P r10) {
        /*
            r7 = this;
            r0 = 0
            r8.setIsRecyclable(r0)
            androidx.recyclerview.widget.Q r0 = r7.mItemAnimator
            r1 = r0
            androidx.recyclerview.widget.k r1 = (androidx.recyclerview.widget.C0531k) r1
            if (r9 == 0) goto L24
            r1.getClass()
            int r3 = r9.f4937a
            int r5 = r10.f4937a
            if (r3 != r5) goto L1a
            int r0 = r9.b
            int r2 = r10.b
            if (r0 == r2) goto L24
        L1a:
            int r4 = r9.b
            int r6 = r10.b
            r2 = r8
            boolean r8 = r1.g(r2, r3, r4, r5, r6)
            goto L33
        L24:
            r1.l(r8)
            android.view.View r9 = r8.itemView
            r10 = 0
            r9.setAlpha(r10)
            java.util.ArrayList r9 = r1.f5010i
            r9.add(r8)
            r8 = 1
        L33:
            if (r8 == 0) goto L38
            r7.postAnimationRunner()
        L38:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.animateAppearance(androidx.recyclerview.widget.p0, androidx.recyclerview.widget.P, androidx.recyclerview.widget.P):void");
    }

    public void animateDisappearance(@NonNull p0 p0Var, @NonNull P p2, @Nullable P p7) {
        int i9;
        int i10;
        boolean z8;
        addAnimatingView(p0Var);
        p0Var.setIsRecyclable(false);
        C0531k c0531k = (C0531k) this.mItemAnimator;
        c0531k.getClass();
        int i11 = p2.f4937a;
        int i12 = p2.b;
        View view = p0Var.itemView;
        if (p7 == null) {
            i9 = view.getLeft();
        } else {
            i9 = p7.f4937a;
        }
        int i13 = i9;
        if (p7 == null) {
            i10 = view.getTop();
        } else {
            i10 = p7.b;
        }
        int i14 = i10;
        if (!p0Var.isRemoved() && (i11 != i13 || i12 != i14)) {
            view.layout(i13, i14, view.getWidth() + i13, view.getHeight() + i14);
            z8 = c0531k.g(p0Var, i11, i12, i13, i14);
        } else {
            c0531k.l(p0Var);
            c0531k.f5009h.add(p0Var);
            z8 = true;
        }
        if (z8) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (!isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(Q7.n0.h(this, AbstractC2965e.b(str)));
        }
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(Q7.n0.h(this, new StringBuilder(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(p0 p0Var) {
        Q q9 = this.mItemAnimator;
        if (q9 != null) {
            List<Object> unmodifiedPayloads = p0Var.getUnmodifiedPayloads();
            C0531k c0531k = (C0531k) q9;
            c0531k.getClass();
            if (unmodifiedPayloads.isEmpty() && c0531k.f5008g && !p0Var.isInvalid()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof X) && this.mLayout.checkLayoutParams((X) layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOldPositions() {
        int h6 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h6; i9++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        C0525e0 c0525e0 = this.mRecycler;
        ArrayList arrayList = c0525e0.f4972c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((p0) arrayList.get(i10)).clearOldPosition();
        }
        ArrayList arrayList2 = c0525e0.f4971a;
        int size2 = arrayList2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((p0) arrayList2.get(i11)).clearOldPosition();
        }
        ArrayList arrayList3 = c0525e0.b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i12 = 0; i12 < size3; i12++) {
                ((p0) c0525e0.b.get(i12)).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<Y> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<AbstractC0519b0> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        W w2 = this.mLayout;
        if (w2 == null || !w2.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        W w2 = this.mLayout;
        if (w2 == null || !w2.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        W w2 = this.mLayout;
        if (w2 == null || !w2.canScrollHorizontally()) {
            return 0;
        }
        return this.mLayout.computeHorizontalScrollRange(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        W w2 = this.mLayout;
        if (w2 == null || !w2.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollExtent(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        W w2 = this.mLayout;
        if (w2 == null || !w2.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollOffset(this.mState);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        W w2 = this.mLayout;
        if (w2 == null || !w2.canScrollVertically()) {
            return 0;
        }
        return this.mLayout.computeVerticalScrollRange(this.mState);
    }

    public void considerReleasingGlowsOnScroll(int i9, int i10) {
        boolean z8;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null && !edgeEffect.isFinished() && i9 > 0) {
            this.mLeftGlow.onRelease();
            z8 = this.mLeftGlow.isFinished();
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i9 < 0) {
            this.mRightGlow.onRelease();
            z8 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i10 > 0) {
            this.mTopGlow.onRelease();
            z8 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i10 < 0) {
            this.mBottomGlow.onRelease();
            z8 |= this.mBottomGlow.isFinished();
        }
        if (z8) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public int consumeFlingInHorizontalStretch(int i9) {
        return consumeFlingInStretch(i9, this.mLeftGlow, this.mRightGlow, getWidth());
    }

    public int consumeFlingInVerticalStretch(int i9) {
        return consumeFlingInStretch(i9, this.mTopGlow, this.mBottomGlow, getHeight());
    }

    public void consumePendingUpdateOperations() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout) {
            if (!this.mAdapterHelper.g()) {
                return;
            }
            C0518b c0518b = this.mAdapterHelper;
            int i9 = c0518b.f4957f;
            if ((i9 & 4) != 0 && (i9 & 11) == 0) {
                int i10 = P.n.f2266a;
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
            if (c0518b.g()) {
                int i11 = P.n.f2266a;
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
                return;
            }
            return;
        }
        int i12 = P.n.f2266a;
        Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
    }

    public void defaultOnMeasure(int i9, int i10) {
        setMeasuredDimension(W.chooseSize(i9, getPaddingRight() + getPaddingLeft(), ViewCompat.getMinimumWidth(this)), W.chooseSize(i10, getPaddingBottom() + getPaddingTop(), ViewCompat.getMinimumHeight(this)));
    }

    public void dispatchChildAttached(View view) {
        p0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        J j7 = this.mAdapter;
        if (j7 != null && childViewHolderInt != null) {
            j7.onViewAttachedToWindow(childViewHolderInt);
        }
        List<Y> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((S0.i) this.mOnChildAttachStateListeners.get(size)).getClass();
                X x9 = (X) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) x9).width != -1 || ((ViewGroup.MarginLayoutParams) x9).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    public void dispatchChildDetached(View view) {
        p0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        J j7 = this.mAdapter;
        if (j7 != null && childViewHolderInt != null) {
            j7.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<Y> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).getClass();
            }
        }
    }

    public void dispatchLayout() {
        boolean z8;
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
            return;
        }
        if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
            return;
        }
        this.mState.f5033i = false;
        if (this.mLastAutoMeasureSkippedDueToExact && (this.mLastAutoMeasureNonExactMeasuredWidth != getWidth() || this.mLastAutoMeasureNonExactMeasuredHeight != getHeight())) {
            z8 = true;
        } else {
            z8 = false;
        }
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mLastAutoMeasureSkippedDueToExact = false;
        if (this.mState.f5028d == 1) {
            dispatchLayoutStep1();
            this.mLayout.setExactMeasureSpecsFrom(this);
            dispatchLayoutStep2();
        } else {
            C0518b c0518b = this.mAdapterHelper;
            if ((c0518b.f4954c.isEmpty() || c0518b.b.isEmpty()) && !z8 && this.mLayout.getWidth() == getWidth() && this.mLayout.getHeight() == getHeight()) {
                this.mLayout.setExactMeasureSpecsFrom(this);
            } else {
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            }
        }
        dispatchLayoutStep3();
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f9, float f10, boolean z8) {
        return getScrollingChildHelper().a(f9, f10, z8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f9, float f10) {
        return getScrollingChildHelper().b(f9, f10);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i9, i10, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr) {
        return getScrollingChildHelper().e(i9, i10, i11, i12, iArr, 0, null);
    }

    public void dispatchOnScrollStateChanged(int i9) {
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.onScrollStateChanged(i9);
        }
        onScrollStateChanged(i9);
        AbstractC0519b0 abstractC0519b0 = this.mScrollListener;
        if (abstractC0519b0 != null) {
            abstractC0519b0.a(this, i9);
        }
        List<AbstractC0519b0> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i9);
            }
        }
    }

    public void dispatchOnScrolled(int i9, int i10) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i9, scrollY - i10);
        onScrolled(i9, i10);
        AbstractC0519b0 abstractC0519b0 = this.mScrollListener;
        if (abstractC0519b0 != null) {
            abstractC0519b0.b(this, i9, i10);
        }
        List<AbstractC0519b0> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).b(this, i9, i10);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i9;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            p0 p0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (p0Var.itemView.getParent() == this && !p0Var.shouldIgnore() && (i9 = p0Var.mPendingAccessibilityState) != -1) {
                ViewCompat.setImportantForAccessibility(p0Var.itemView, i9);
                p0Var.mPendingAccessibilityState = -1;
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
        boolean z8;
        int i9;
        boolean z9;
        boolean z10;
        int i10;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            this.mItemDecorations.get(i11).onDrawOver(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z12 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.mClipToPadding) {
                i10 = getPaddingBottom();
            } else {
                i10 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i10, DECELERATION_RATE);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z8 = true;
            } else {
                z8 = false;
            }
            canvas.restoreToCount(save);
        } else {
            z8 = false;
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z10 = true;
            } else {
                z10 = false;
            }
            z8 |= z10;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.mClipToPadding) {
                i9 = getPaddingTop();
            } else {
                i9 = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i9, -width);
            EdgeEffect edgeEffect6 = this.mRightGlow;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z9 = true;
            } else {
                z9 = false;
            }
            z8 |= z9;
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
                z11 = true;
            }
            z8 |= z11;
            canvas.restoreToCount(save4);
        }
        if (z8 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.f()) {
            z12 = z8;
        }
        if (z12) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j7) {
        return super.drawChild(canvas, view, j7);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow != null) {
            return;
        }
        ((m0) this.mEdgeEffectFactory).getClass();
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
        ((m0) this.mEdgeEffectFactory).getClass();
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
        ((m0) this.mEdgeEffectFactory).getClass();
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
        ((m0) this.mEdgeEffectFactory).getClass();
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

    public final void fillRemainingScrollValues(l0 l0Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.f5041d;
            overScroller.getFinalX();
            overScroller.getCurrX();
            l0Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        l0Var.getClass();
    }

    @Nullable
    public View findChildViewUnder(float f9, float f10) {
        for (int e4 = this.mChildHelper.e() - 1; e4 >= 0; e4--) {
            View d2 = this.mChildHelper.d(e4);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f9 >= d2.getLeft() + translationX && f9 <= d2.getRight() + translationX && f10 >= d2.getTop() + translationY && f10 <= d2.getBottom() + translationY) {
                return d2;
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
    public p0 findContainingViewHolder(@NonNull View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    @Nullable
    public p0 findViewHolderForAdapterPosition(int i9) {
        p0 p0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h6 = this.mChildHelper.h();
        for (int i10 = 0; i10 < h6; i10++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i10));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i9) {
                if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                    p0Var = childViewHolderInt;
                } else {
                    return childViewHolderInt;
                }
            }
        }
        return p0Var;
    }

    public p0 findViewHolderForItemId(long j7) {
        J j9 = this.mAdapter;
        p0 p0Var = null;
        if (j9 != null && j9.hasStableIds()) {
            int h6 = this.mChildHelper.h();
            for (int i9 = 0; i9 < h6; i9++) {
                p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j7) {
                    if (this.mChildHelper.k(childViewHolderInt.itemView)) {
                        p0Var = childViewHolderInt;
                    } else {
                        return childViewHolderInt;
                    }
                }
            }
        }
        return p0Var;
    }

    @Nullable
    public p0 findViewHolderForLayoutPosition(int i9) {
        return findViewHolderForPosition(i9, false);
    }

    @Nullable
    @Deprecated
    public p0 findViewHolderForPosition(int i9) {
        return findViewHolderForPosition(i9, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x01fa, code lost:
    
        if (r0 < r14) goto L102;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0202  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean fling(int r20, int r21) {
        /*
            Method dump skipped, instructions count: 575
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i9) {
        boolean z8;
        View view2;
        boolean z9;
        boolean z10;
        boolean z11;
        int i10;
        int i11;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i9);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z12 = true;
        if (this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed) {
            z8 = true;
        } else {
            z8 = false;
        }
        FocusFinder focusFinder = FocusFinder.getInstance();
        if (z8 && (i9 == 2 || i9 == 1)) {
            if (this.mLayout.canScrollVertically()) {
                if (i9 == 2) {
                    i11 = 130;
                } else {
                    i11 = 33;
                }
                if (focusFinder.findNextFocus(this, view, i11) == null) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i9 = i11;
                }
            } else {
                z9 = false;
            }
            if (!z9 && this.mLayout.canScrollHorizontally()) {
                if (this.mLayout.getLayoutDirection() == 1) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i9 == 2) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 ^ z11) {
                    i10 = 66;
                } else {
                    i10 = 17;
                }
                if (focusFinder.findNextFocus(this, view, i10) != null) {
                    z12 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i9 = i10;
                }
                z9 = z12;
            }
            if (z9) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i9, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = focusFinder.findNextFocus(this, view, i9);
        } else {
            View findNextFocus = focusFinder.findNextFocus(this, view, i9);
            if (findNextFocus == null && z8) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i9, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            } else {
                view2 = findNextFocus;
            }
        }
        if (view2 != null && !view2.hasFocusable()) {
            if (getFocusedChild() == null) {
                return super.focusSearch(view, i9);
            }
            requestChildOnScreen(view2, null);
            return view;
        }
        if (!isPreferredNextFocus(view, view2, i9)) {
            return super.focusSearch(view, i9);
        }
        return view2;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        W w2 = this.mLayout;
        if (w2 != null) {
            return w2.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        W w2 = this.mLayout;
        if (w2 != null) {
            return w2.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    @Nullable
    public J getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(p0 p0Var) {
        if (p0Var.hasAnyOfTheFlags(524) || !p0Var.isBound()) {
            return -1;
        }
        C0518b c0518b = this.mAdapterHelper;
        int i9 = p0Var.mPosition;
        ArrayList arrayList = c0518b.b;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            C0516a c0516a = (C0516a) arrayList.get(i10);
            int i11 = c0516a.f4950a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 8) {
                        int i12 = c0516a.b;
                        if (i12 == i9) {
                            i9 = c0516a.f4952d;
                        } else {
                            if (i12 < i9) {
                                i9--;
                            }
                            if (c0516a.f4952d <= i9) {
                                i9++;
                            }
                        }
                    }
                } else {
                    int i13 = c0516a.b;
                    if (i13 <= i9) {
                        int i14 = c0516a.f4952d;
                        if (i13 + i14 > i9) {
                            return -1;
                        }
                        i9 -= i14;
                    } else {
                        continue;
                    }
                }
            } else if (c0516a.b <= i9) {
                i9 += c0516a.f4952d;
            }
        }
        return i9;
    }

    @Override // android.view.View
    public int getBaseline() {
        W w2 = this.mLayout;
        if (w2 != null) {
            return w2.getBaseline();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(p0 p0Var) {
        if (this.mAdapter.hasStableIds()) {
            return p0Var.getItemId();
        }
        return p0Var.mPosition;
    }

    public int getChildAdapterPosition(@NonNull View view) {
        p0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i9, int i10) {
        return super.getChildDrawingOrder(i9, i10);
    }

    public long getChildItemId(@NonNull View view) {
        p0 childViewHolderInt;
        J j7 = this.mAdapter;
        if (j7 == null || !j7.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1L;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(@NonNull View view) {
        p0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(@NonNull View view) {
        return getChildAdapterPosition(view);
    }

    public p0 getChildViewHolder(@NonNull View view) {
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
    public r0 getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(@NonNull View view, @NonNull Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    @NonNull
    public N getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    @Nullable
    public Q getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        X x9 = (X) view.getLayoutParams();
        boolean z8 = x9.f4948c;
        Rect rect = x9.b;
        if (!z8) {
            return rect;
        }
        if (this.mState.f5031g && (x9.f4947a.isUpdated() || x9.f4947a.isInvalid())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i9).getItemOffsets(this.mTempRect, view, this, this.mState);
            int i10 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i10 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        x9.f4948c = false;
        return rect;
    }

    @NonNull
    public S getItemDecorationAt(int i9) {
        int itemDecorationCount = getItemDecorationCount();
        if (i9 >= 0 && i9 < itemDecorationCount) {
            return this.mItemDecorations.get(i9);
        }
        throw new IndexOutOfBoundsException(i9 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    @Nullable
    public W getLayoutManager() {
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
    public Z getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    @NonNull
    public C0523d0 getRecycledViewPool() {
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
        return getScrollingChildHelper().g(0);
    }

    public boolean hasPendingAdapterUpdates() {
        if (this.mFirstLayoutComplete && !this.mDataSetHasChangedAfterLayout && !this.mAdapterHelper.g()) {
            return false;
        }
        return true;
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new C0518b(new H(this));
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
            Resources resources = getContext().getResources();
            new C0536p(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(androidx.recyclerview.R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(androidx.recyclerview.R.dimen.fastscroll_margin));
            return;
        }
        throw new IllegalArgumentException(Q7.n0.h(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
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
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isAnimating() {
        Q q9 = this.mItemAnimator;
        if (q9 != null && q9.f()) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        if (this.mLayoutOrScrollCounter > 0) {
            return true;
        }
        return false;
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
        return getScrollingChildHelper().f2931d;
    }

    public void jumpToPositionForSmoothScroller(int i9) {
        if (this.mLayout == null) {
            return;
        }
        setScrollState(2);
        this.mLayout.scrollToPosition(i9);
        awakenScrollBars();
    }

    public void markItemDecorInsetsDirty() {
        int h6 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h6; i9++) {
            ((X) this.mChildHelper.g(i9).getLayoutParams()).f4948c = true;
        }
        ArrayList arrayList = this.mRecycler.f4972c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            X x9 = (X) ((p0) arrayList.get(i10)).itemView.getLayoutParams();
            if (x9 != null) {
                x9.f4948c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h6 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h6; i9++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        C0525e0 c0525e0 = this.mRecycler;
        ArrayList arrayList = c0525e0.f4972c;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            p0 p0Var = (p0) arrayList.get(i10);
            if (p0Var != null) {
                p0Var.addFlags(6);
                p0Var.addChangePayload(null);
            }
        }
        J j7 = c0525e0.f4977h.mAdapter;
        if (j7 == null || !j7.hasStableIds()) {
            c0525e0.g();
        }
    }

    public void nestedScrollBy(int i9, int i10) {
        nestedScrollByInternal(i9, i10, null, 1);
    }

    public void offsetChildrenHorizontal(int i9) {
        int e4 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e4; i10++) {
            this.mChildHelper.d(i10).offsetLeftAndRight(i9);
        }
    }

    public void offsetChildrenVertical(int i9) {
        int e4 = this.mChildHelper.e();
        for (int i10 = 0; i10 < e4; i10++) {
            this.mChildHelper.d(i10).offsetTopAndBottom(i9);
        }
    }

    public void offsetPositionRecordsForInsert(int i9, int i10) {
        int h6 = this.mChildHelper.h();
        for (int i11 = 0; i11 < h6; i11++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i11));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i9) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert attached child " + i11 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition + i10));
                }
                childViewHolderInt.offsetPosition(i10, false);
                this.mState.f5030f = true;
            }
        }
        ArrayList arrayList = this.mRecycler.f4972c;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            p0 p0Var = (p0) arrayList.get(i12);
            if (p0Var != null && p0Var.mPosition >= i9) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForInsert cached " + i12 + " holder " + p0Var + " now at position " + (p0Var.mPosition + i10));
                }
                p0Var.offsetPosition(i10, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i9, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int h6 = this.mChildHelper.h();
        int i18 = -1;
        if (i9 < i10) {
            i12 = i9;
            i11 = i10;
            i13 = -1;
        } else {
            i11 = i9;
            i12 = i10;
            i13 = 1;
        }
        for (int i19 = 0; i19 < h6; i19++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i19));
            if (childViewHolderInt != null && (i17 = childViewHolderInt.mPosition) >= i12 && i17 <= i11) {
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove attached child " + i19 + " holder " + childViewHolderInt);
                }
                if (childViewHolderInt.mPosition == i9) {
                    childViewHolderInt.offsetPosition(i10 - i9, false);
                } else {
                    childViewHolderInt.offsetPosition(i13, false);
                }
                this.mState.f5030f = true;
            }
        }
        C0525e0 c0525e0 = this.mRecycler;
        c0525e0.getClass();
        if (i9 < i10) {
            i15 = i9;
            i14 = i10;
        } else {
            i14 = i9;
            i18 = 1;
            i15 = i10;
        }
        ArrayList arrayList = c0525e0.f4972c;
        int size = arrayList.size();
        for (int i20 = 0; i20 < size; i20++) {
            p0 p0Var = (p0) arrayList.get(i20);
            if (p0Var != null && (i16 = p0Var.mPosition) >= i15 && i16 <= i14) {
                if (i16 == i9) {
                    p0Var.offsetPosition(i10 - i9, false);
                } else {
                    p0Var.offsetPosition(i18, false);
                }
                if (sVerboseLoggingEnabled) {
                    Log.d(TAG, "offsetPositionRecordsForMove cached child " + i20 + " holder " + p0Var);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i9, int i10, boolean z8) {
        int i11 = i9 + i10;
        int h6 = this.mChildHelper.h();
        for (int i12 = 0; i12 < h6; i12++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i13 = childViewHolderInt.mPosition;
                if (i13 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now at position " + (childViewHolderInt.mPosition - i10));
                    }
                    childViewHolderInt.offsetPosition(-i10, z8);
                    this.mState.f5030f = true;
                } else if (i13 >= i9) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove attached child " + i12 + " holder " + childViewHolderInt + " now REMOVED");
                    }
                    childViewHolderInt.flagRemovedAndOffsetPosition(i9 - 1, -i10, z8);
                    this.mState.f5030f = true;
                }
            }
        }
        C0525e0 c0525e0 = this.mRecycler;
        ArrayList arrayList = c0525e0.f4972c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p0 p0Var = (p0) arrayList.get(size);
            if (p0Var != null) {
                int i14 = p0Var.mPosition;
                if (i14 >= i11) {
                    if (sVerboseLoggingEnabled) {
                        Log.d(TAG, "offsetPositionRecordsForRemove cached " + size + " holder " + p0Var + " now at position " + (p0Var.mPosition - i10));
                    }
                    p0Var.offsetPosition(-i10, z8);
                } else if (i14 >= i9) {
                    p0Var.addFlags(8);
                    c0525e0.h(size);
                }
            }
        }
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (r1 >= 30.0f) goto L22;
     */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, androidx.recyclerview.widget.s] */
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
            androidx.recyclerview.widget.e0 r1 = r5.mRecycler
            r1.e()
            androidx.recyclerview.widget.W r1 = r5.mLayout
            if (r1 == 0) goto L23
            r1.dispatchAttachedToWindow(r5)
        L23:
            r5.mPostedAnimatorRunner = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
            if (r0 == 0) goto L8c
            java.lang.ThreadLocal r0 = androidx.recyclerview.widget.RunnableC0538s.f5084g
            java.lang.Object r1 = r0.get()
            androidx.recyclerview.widget.s r1 = (androidx.recyclerview.widget.RunnableC0538s) r1
            r5.mGapWorker = r1
            if (r1 != 0) goto L6f
            androidx.recyclerview.widget.s r1 = new androidx.recyclerview.widget.s
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.b = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f5088f = r2
            r5.mGapWorker = r1
            android.view.Display r1 = androidx.core.view.ViewCompat.getDisplay(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L61
            if (r1 == 0) goto L61
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L61
            goto L63
        L61:
            r1 = 1114636288(0x42700000, float:60.0)
        L63:
            androidx.recyclerview.widget.s r2 = r5.mGapWorker
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.f5087d = r3
            r0.set(r2)
        L6f:
            androidx.recyclerview.widget.s r0 = r5.mGapWorker
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.sDebugAssertionsEnabled
            java.util.ArrayList r0 = r0.b
            if (r1 == 0) goto L89
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L81
            goto L89
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L89:
            r0.add(r5)
        L8c:
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
        RunnableC0538s runnableC0538s;
        super.onDetachedFromWindow();
        Q q9 = this.mItemAnimator;
        if (q9 != null) {
            q9.e();
        }
        stopScroll();
        int i9 = 0;
        this.mIsAttached = false;
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        this.mViewInfoStore.getClass();
        do {
        } while (C0.f4926d.g() != null);
        C0525e0 c0525e0 = this.mRecycler;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = c0525e0.f4972c;
            if (i10 >= arrayList.size()) {
                break;
            }
            r8.k.g(((p0) arrayList.get(i10)).itemView);
            i10++;
        }
        c0525e0.f(c0525e0.f4977h.mAdapter, false);
        while (i9 < getChildCount()) {
            int i11 = i9 + 1;
            View childAt = getChildAt(i9);
            if (childAt != null) {
                C0326a c0326a = (C0326a) childAt.getTag(com.tools.arruler.photomeasure.camera.ruler.R.id.pooling_container_listener_holder_tag);
                if (c0326a == null) {
                    c0326a = new C0326a();
                    childAt.setTag(com.tools.arruler.photomeasure.camera.ruler.R.id.pooling_container_listener_holder_tag, c0326a);
                }
                ArrayList arrayList2 = c0326a.f3910a;
                int A8 = AbstractC2817h.A(arrayList2);
                if (-1 >= A8) {
                    i9 = i11;
                } else {
                    com.mbridge.msdk.foundation.entity.o.v(arrayList2.get(A8));
                    throw null;
                }
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        if (ALLOW_THREAD_GAP_WORK && (runnableC0538s = this.mGapWorker) != null) {
            boolean remove = runnableC0538s.b.remove(this);
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
        for (int i9 = 0; i9 < size; i9++) {
            this.mItemDecorations.get(i9).onDraw(canvas, this, this.mState);
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
            androidx.recyclerview.widget.W r0 = r5.mLayout
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
            androidx.recyclerview.widget.W r0 = r5.mLayout
            boolean r0 = r0.canScrollVertically()
            if (r0 == 0) goto L2c
            r0 = 9
            float r0 = r6.getAxisValue(r0)
            float r0 = -r0
            goto L2d
        L2c:
            r0 = r2
        L2d:
            androidx.recyclerview.widget.W r3 = r5.mLayout
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
            androidx.recyclerview.widget.W r3 = r5.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r3 == 0) goto L57
            float r0 = -r0
            goto L3c
        L57:
            androidx.recyclerview.widget.W r3 = r5.mLayout
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
        boolean z8;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        W w2 = this.mLayout;
        if (w2 == null) {
            return false;
        }
        boolean canScrollHorizontally = w2.canScrollHorizontally();
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
                            int x9 = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.mLastTouchX = x9;
                            this.mInitialTouchX = x9;
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
                    int x10 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y6 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.mScrollState != 1) {
                        int i9 = x10 - this.mInitialTouchX;
                        int i10 = y6 - this.mInitialTouchY;
                        if (canScrollHorizontally != 0 && Math.abs(i9) > this.mTouchSlop) {
                            this.mLastTouchX = x10;
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        if (canScrollVertically && Math.abs(i10) > this.mTouchSlop) {
                            this.mLastTouchY = y6;
                            z8 = true;
                        }
                        if (z8) {
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
            int x11 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x11;
            this.mInitialTouchX = x11;
            int y9 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y9;
            this.mInitialTouchY = y9;
            if (stopGlowAnimations(motionEvent) || this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            int i11 = canScrollHorizontally;
            if (canScrollVertically) {
                i11 = (canScrollHorizontally ? 1 : 0) | 2;
            }
            startNestedScroll(i11, 0);
        }
        if (this.mScrollState != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i9, int i10, int i11, int i12) {
        int i13 = P.n.f2266a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        W w2 = this.mLayout;
        if (w2 == null) {
            defaultOnMeasure(i9, i10);
            return;
        }
        boolean z8 = false;
        if (w2.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i9);
            int mode2 = View.MeasureSpec.getMode(i10);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i9, i10);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z8 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z8;
            if (!z8 && this.mAdapter != null) {
                if (this.mState.f5028d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i9, i10);
                this.mState.f5033i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i9, i10);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.f5033i = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i9, i10);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i9, i10);
            return;
        }
        if (this.mAdapterUpdateDuringMeasure) {
            startInterceptRequestLayout();
            onEnterLayoutOrScroll();
            processAdapterUpdatesAndSetAnimationFlags();
            onExitLayoutOrScroll();
            l0 l0Var = this.mState;
            if (l0Var.f5035k) {
                l0Var.f5031g = true;
            } else {
                this.mAdapterHelper.c();
                this.mState.f5031g = false;
            }
            this.mAdapterUpdateDuringMeasure = false;
            stopInterceptRequestLayout(false);
        } else if (this.mState.f5035k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        J j7 = this.mAdapter;
        if (j7 != null) {
            this.mState.f5029e = j7.getItemCount();
        } else {
            this.mState.f5029e = 0;
        }
        startInterceptRequestLayout();
        this.mLayout.onMeasure(this.mRecycler, this.mState, i9, i10);
        stopInterceptRequestLayout(false);
        this.mState.f5031g = false;
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i9, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof h0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        h0 h0Var = (h0) parcelable;
        this.mPendingSavedState = h0Var;
        super.onRestoreInstanceState(h0Var.b);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.os.Parcelable, androidx.recyclerview.widget.h0, b0.b] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? abstractC0547b = new AbstractC0547b(super.onSaveInstanceState());
        h0 h0Var = this.mPendingSavedState;
        if (h0Var != null) {
            abstractC0547b.f4991d = h0Var.f4991d;
        } else {
            W w2 = this.mLayout;
            if (w2 != null) {
                abstractC0547b.f4991d = w2.onSaveInstanceState();
            } else {
                abstractC0547b.f4991d = null;
            }
        }
        return abstractC0547b;
    }

    public void onScrollStateChanged(int i9) {
    }

    public void onScrolled(int i9, int i10) {
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11 || i10 != i12) {
            invalidateGlows();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 493
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

    public void processDataSetCompletelyChanged(boolean z8) {
        this.mDispatchItemsChangedEvent = z8 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(p0 p0Var, P p2) {
        p0Var.setFlags(0, FragmentTransaction.TRANSIT_EXIT_MASK);
        if (this.mState.f5032h && p0Var.isUpdated() && !p0Var.isRemoved() && !p0Var.shouldIgnore()) {
            this.mViewInfoStore.b.f(getChangedHolderKey(p0Var), p0Var);
        }
        x.l lVar = this.mViewInfoStore.f4932a;
        C0 c02 = (C0) lVar.getOrDefault(p0Var, null);
        if (c02 == null) {
            c02 = C0.a();
            lVar.put(p0Var, c02);
        }
        c02.b = p2;
        c02.f4927a |= 4;
    }

    public void removeAndRecycleViews() {
        Q q9 = this.mItemAnimator;
        if (q9 != null) {
            q9.e();
        }
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        C0525e0 c0525e0 = this.mRecycler;
        c0525e0.f4971a.clear();
        c0525e0.g();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean removeAnimatingView(android.view.View r8) {
        /*
            r7 = this;
            r7.startInterceptRequestLayout()
            androidx.recyclerview.widget.d r0 = r7.mChildHelper
            androidx.recyclerview.widget.c r1 = r0.b
            androidx.recyclerview.widget.H r2 = r0.f4963a
            int r3 = r0.f4965d
            r4 = 1
            r5 = 0
            if (r3 != r4) goto L1d
            android.view.View r0 = r0.f4966e
            if (r0 != r8) goto L15
        L13:
            r4 = r5
            goto L46
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r8.<init>(r0)
            throw r8
        L1d:
            r6 = 2
            if (r3 == r6) goto L7e
            r0.f4965d = r6     // Catch: java.lang.Throwable -> L31
            androidx.recyclerview.widget.RecyclerView r3 = r2.f4935a     // Catch: java.lang.Throwable -> L31
            int r3 = r3.indexOfChild(r8)     // Catch: java.lang.Throwable -> L31
            r6 = -1
            if (r3 != r6) goto L33
            r0.m(r8)     // Catch: java.lang.Throwable -> L31
        L2e:
            r0.f4965d = r5
            goto L46
        L31:
            r8 = move-exception
            goto L7b
        L33:
            boolean r6 = r1.d(r3)     // Catch: java.lang.Throwable -> L31
            if (r6 == 0) goto L43
            r1.f(r3)     // Catch: java.lang.Throwable -> L31
            r0.m(r8)     // Catch: java.lang.Throwable -> L31
            r2.c(r3)     // Catch: java.lang.Throwable -> L31
            goto L2e
        L43:
            r0.f4965d = r5
            goto L13
        L46:
            if (r4 == 0) goto L75
            androidx.recyclerview.widget.p0 r0 = getChildViewHolderInt(r8)
            androidx.recyclerview.widget.e0 r1 = r7.mRecycler
            r1.m(r0)
            androidx.recyclerview.widget.e0 r1 = r7.mRecycler
            r1.j(r0)
            boolean r0 = androidx.recyclerview.widget.RecyclerView.sVerboseLoggingEnabled
            if (r0 == 0) goto L75
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
        L75:
            r8 = r4 ^ 1
            r7.stopInterceptRequestLayout(r8)
            return r4
        L7b:
            r0.f4965d = r5
            throw r8
        L7e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.removeAnimatingView(android.view.View):boolean");
    }

    @Override // android.view.ViewGroup
    public void removeDetachedView(View view, boolean z8) {
        p0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(Q7.n0.h(this, sb));
            }
        } else if (sDebugAssertionsEnabled) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(Q7.n0.h(this, sb2));
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z8);
    }

    public void removeItemDecoration(@NonNull S s5) {
        boolean z8;
        W w2 = this.mLayout;
        if (w2 != null) {
            w2.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(s5);
        if (this.mItemDecorations.isEmpty()) {
            if (getOverScrollMode() == 2) {
                z8 = true;
            } else {
                z8 = false;
            }
            setWillNotDraw(z8);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i9) {
        int itemDecorationCount = getItemDecorationCount();
        if (i9 >= 0 && i9 < itemDecorationCount) {
            removeItemDecoration(getItemDecorationAt(i9));
            return;
        }
        throw new IndexOutOfBoundsException(i9 + " is an invalid index for size " + itemDecorationCount);
    }

    public void removeOnChildAttachStateChangeListener(@NonNull Y y4) {
        List<Y> list = this.mOnChildAttachStateListeners;
        if (list == null) {
            return;
        }
        list.remove(y4);
    }

    public void removeOnItemTouchListener(@NonNull InterfaceC0517a0 interfaceC0517a0) {
        this.mOnItemTouchListeners.remove(interfaceC0517a0);
        if (this.mInterceptingOnItemTouchListener == interfaceC0517a0) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(@NonNull AbstractC0519b0 abstractC0519b0) {
        List<AbstractC0519b0> list = this.mScrollListeners;
        if (list != null) {
            list.remove(abstractC0519b0);
        }
    }

    public void removeRecyclerListener(@NonNull f0 f0Var) {
        this.mRecyclerListeners.remove(f0Var);
    }

    public void repositionShadowingViews() {
        p0 p0Var;
        int e4 = this.mChildHelper.e();
        for (int i9 = 0; i9 < e4; i9++) {
            View d2 = this.mChildHelper.d(i9);
            p0 childViewHolder = getChildViewHolder(d2);
            if (childViewHolder != null && (p0Var = childViewHolder.mShadowingHolder) != null) {
                View view = p0Var.itemView;
                int left = d2.getLeft();
                int top = d2.getTop();
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
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        int size = this.mOnItemTouchListeners.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.mOnItemTouchListeners.get(i9).getClass();
        }
        super.requestDisallowInterceptTouchEvent(z8);
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
        int h6 = this.mChildHelper.h();
        for (int i9 = 0; i9 < h6; i9++) {
            p0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i9));
            if (sDebugAssertionsEnabled && childViewHolderInt.mPosition == -1 && !childViewHolderInt.isRemoved()) {
                throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
            }
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    @Override // android.view.View
    public void scrollBy(int i9, int i10) {
        W w2 = this.mLayout;
        if (w2 == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        boolean canScrollHorizontally = w2.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (canScrollHorizontally || canScrollVertically) {
            if (!canScrollHorizontally) {
                i9 = 0;
            }
            if (!canScrollVertically) {
                i10 = 0;
            }
            scrollByInternal(i9, i10, null, 0);
        }
    }

    public boolean scrollByInternal(int i9, int i10, MotionEvent motionEvent, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        boolean z8;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i9, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i16 = iArr2[0];
            int i17 = iArr2[1];
            i12 = i17;
            i13 = i16;
            i14 = i9 - i16;
            i15 = i10 - i17;
        } else {
            i12 = 0;
            i13 = 0;
            i14 = 0;
            i15 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i13, i12, i14, i15, this.mScrollOffset, i11, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i18 = iArr4[0];
        int i19 = i14 - i18;
        int i20 = iArr4[1];
        int i21 = i15 - i20;
        if (i18 == 0 && i20 == 0) {
            z8 = false;
        } else {
            z8 = true;
        }
        int i22 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        int i23 = iArr5[0];
        this.mLastTouchX = i22 - i23;
        int i24 = this.mLastTouchY;
        int i25 = iArr5[1];
        this.mLastTouchY = i24 - i25;
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + i23;
        iArr6[1] = iArr6[1] + i25;
        if (getOverScrollMode() != 2) {
            if (motionEvent != null && !MotionEventCompat.isFromSource(motionEvent, FragmentTransaction.TRANSIT_FRAGMENT_CLOSE)) {
                pullGlows(motionEvent.getX(), i19, motionEvent.getY(), i21);
            }
            considerReleasingGlowsOnScroll(i9, i10);
        }
        if (i13 != 0 || i12 != 0) {
            dispatchOnScrolled(i13, i12);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (z8 || i13 != 0 || i12 != 0) {
            return true;
        }
        return false;
    }

    public void scrollStep(int i9, int i10, @Nullable int[] iArr) {
        int i11;
        int i12;
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i13 = P.n.f2266a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        if (i9 != 0) {
            i11 = this.mLayout.scrollHorizontallyBy(i9, this.mRecycler, this.mState);
        } else {
            i11 = 0;
        }
        if (i10 != 0) {
            i12 = this.mLayout.scrollVerticallyBy(i10, this.mRecycler, this.mState);
        } else {
            i12 = 0;
        }
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = i11;
            iArr[1] = i12;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i9, int i10) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i9) {
        if (this.mLayoutSuppressed) {
            return;
        }
        stopScroll();
        W w2 = this.mLayout;
        if (w2 == null) {
            Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            w2.scrollToPosition(i9);
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

    public void setAccessibilityDelegateCompat(@Nullable r0 r0Var) {
        this.mAccessibilityDelegate = r0Var;
        ViewCompat.setAccessibilityDelegate(this, r0Var);
    }

    public void setAdapter(@Nullable J j7) {
        setLayoutFrozen(false);
        setAdapterInternal(j7, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(@Nullable M m) {
        if (m == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    public boolean setChildImportantForAccessibilityInternal(p0 p0Var, int i9) {
        if (isComputingLayout()) {
            p0Var.mPendingAccessibilityState = i9;
            this.mPendingAccessibilityImportanceChange.add(p0Var);
            return false;
        }
        ViewCompat.setImportantForAccessibility(p0Var.itemView, i9);
        return true;
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z8) {
        if (z8 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z8;
        super.setClipToPadding(z8);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(@NonNull N n2) {
        n2.getClass();
        this.mEdgeEffectFactory = n2;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z8) {
        this.mHasFixedSize = z8;
    }

    public void setItemAnimator(@Nullable Q q9) {
        Q q10 = this.mItemAnimator;
        if (q10 != null) {
            q10.e();
            this.mItemAnimator.f4938a = null;
        }
        this.mItemAnimator = q9;
        if (q9 != null) {
            q9.f4938a = this.mItemAnimatorListener;
        }
    }

    public void setItemViewCacheSize(int i9) {
        C0525e0 c0525e0 = this.mRecycler;
        c0525e0.f4974e = i9;
        c0525e0.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z8) {
        suppressLayout(z8);
    }

    public void setLayoutManager(@Nullable W w2) {
        H h6;
        if (w2 == this.mLayout) {
            return;
        }
        stopScroll();
        if (this.mLayout != null) {
            Q q9 = this.mItemAnimator;
            if (q9 != null) {
                q9.e();
            }
            this.mLayout.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
            C0525e0 c0525e0 = this.mRecycler;
            c0525e0.f4971a.clear();
            c0525e0.g();
            if (this.mIsAttached) {
                this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
            }
            this.mLayout.setRecyclerView(null);
            this.mLayout = null;
        } else {
            C0525e0 c0525e02 = this.mRecycler;
            c0525e02.f4971a.clear();
            c0525e02.g();
        }
        C0522d c0522d = this.mChildHelper;
        c0522d.b.g();
        ArrayList arrayList = c0522d.f4964c;
        int size = arrayList.size();
        while (true) {
            size--;
            h6 = c0522d.f4963a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            h6.getClass();
            p0 childViewHolderInt = getChildViewHolderInt(view);
            if (childViewHolderInt != null) {
                childViewHolderInt.onLeftHiddenState(h6.f4935a);
            }
            arrayList.remove(size);
        }
        RecyclerView recyclerView = h6.f4935a;
        int childCount = recyclerView.getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = recyclerView.getChildAt(i9);
            recyclerView.dispatchChildDetached(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeAllViews();
        this.mLayout = w2;
        if (w2 != null) {
            if (w2.mRecyclerView == null) {
                w2.setRecyclerView(this);
                if (this.mIsAttached) {
                    this.mLayout.dispatchAttachedToWindow(this);
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(w2);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(Q7.n0.h(w2.mRecyclerView, sb));
            }
        }
        this.mRecycler.n();
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
    public void setNestedScrollingEnabled(boolean z8) {
        C0289u scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.f2931d) {
            ViewCompat.stopNestedScroll(scrollingChildHelper.f2930c);
        }
        scrollingChildHelper.f2931d = z8;
    }

    public void setOnFlingListener(@Nullable Z z8) {
        this.mOnFlingListener = z8;
    }

    @Deprecated
    public void setOnScrollListener(@Nullable AbstractC0519b0 abstractC0519b0) {
        this.mScrollListener = abstractC0519b0;
    }

    public void setPreserveFocusAfterLayout(boolean z8) {
        this.mPreserveFocusAfterLayout = z8;
    }

    public void setRecycledViewPool(@Nullable C0523d0 c0523d0) {
        C0525e0 c0525e0 = this.mRecycler;
        RecyclerView recyclerView = c0525e0.f4977h;
        c0525e0.f(recyclerView.mAdapter, false);
        if (c0525e0.f4976g != null) {
            r2.b--;
        }
        c0525e0.f4976g = c0523d0;
        if (c0523d0 != null && recyclerView.getAdapter() != null) {
            c0525e0.f4976g.b++;
        }
        c0525e0.e();
    }

    @Deprecated
    public void setRecyclerListener(@Nullable f0 f0Var) {
    }

    public void setScrollState(int i9) {
        if (i9 == this.mScrollState) {
            return;
        }
        if (sVerboseLoggingEnabled) {
            StringBuilder p2 = Q7.n0.p(i9, "setting scroll state to ", " from ");
            p2.append(this.mScrollState);
            Log.d(TAG, p2.toString(), new Exception());
        }
        this.mScrollState = i9;
        if (i9 != 2) {
            stopScrollersInternal();
        }
        dispatchOnScrollStateChanged(i9);
    }

    public void setScrollingTouchSlop(int i9) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i9 != 0) {
            if (i9 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i9 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(@Nullable n0 n0Var) {
        this.mRecycler.getClass();
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i9;
        int i10 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        if (accessibilityEvent != null) {
            i9 = accessibilityEvent.getContentChangeTypes();
        } else {
            i9 = 0;
        }
        if (i9 != 0) {
            i10 = i9;
        }
        this.mEatenAccessibilityChangeFlags |= i10;
        return true;
    }

    public void smoothScrollBy(int i9, int i10) {
        smoothScrollBy(i9, i10, null);
    }

    public void smoothScrollToPosition(int i9) {
        if (this.mLayoutSuppressed) {
            return;
        }
        W w2 = this.mLayout;
        if (w2 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            w2.smoothScrollToPosition(this, this.mState, i9);
        }
    }

    public void startInterceptRequestLayout() {
        int i9 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i9;
        if (i9 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i9) {
        return getScrollingChildHelper().h(i9, 0);
    }

    public void stopInterceptRequestLayout(boolean z8) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            if (!sDebugAssertionsEnabled) {
                this.mInterceptRequestLayoutDepth = 1;
            } else {
                throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z8 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z8 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
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
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z8) {
        if (z8 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z8) {
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

    public void swapAdapter(@Nullable J j7, boolean z8) {
        setLayoutFrozen(false);
        setAdapterInternal(j7, true, z8);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i9, int i10, Object obj) {
        int i11;
        int i12;
        int h6 = this.mChildHelper.h();
        int i13 = i10 + i9;
        for (int i14 = 0; i14 < h6; i14++) {
            View g9 = this.mChildHelper.g(i14);
            p0 childViewHolderInt = getChildViewHolderInt(g9);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i12 = childViewHolderInt.mPosition) >= i9 && i12 < i13) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((X) g9.getLayoutParams()).f4948c = true;
            }
        }
        C0525e0 c0525e0 = this.mRecycler;
        ArrayList arrayList = c0525e0.f4972c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            p0 p0Var = (p0) arrayList.get(size);
            if (p0Var != null && (i11 = p0Var.mPosition) >= i9 && i11 < i13) {
                p0Var.addFlags(2);
                c0525e0.h(size);
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
    public androidx.recyclerview.widget.p0 findViewHolderForPosition(int r6, boolean r7) {
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
            androidx.recyclerview.widget.p0 r3 = getChildViewHolderInt(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.findViewHolderForPosition(int, boolean):androidx.recyclerview.widget.p0");
    }

    public void onExitLayoutOrScroll(boolean z8) {
        int i9 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i9;
        if (i9 < 1) {
            if (sDebugAssertionsEnabled && i9 < 0) {
                throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.mLayoutOrScrollCounter = 0;
            if (z8) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i9, int i10, @Nullable Interpolator interpolator) {
        smoothScrollBy(i9, i10, interpolator, Integer.MIN_VALUE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [androidx.recyclerview.widget.k, java.lang.Object, androidx.recyclerview.widget.Q] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.recyclerview.widget.l0, java.lang.Object] */
    public RecyclerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.mObserver = new g0(this);
        this.mRecycler = new C0525e0(this);
        this.mViewInfoStore = new E0();
        this.mUpdateChildViewsRunnable = new F(this, 0);
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
        ?? obj = new Object();
        obj.f4938a = null;
        obj.b = new ArrayList();
        obj.f4939c = 120L;
        obj.f4940d = 120L;
        obj.f4941e = 250L;
        obj.f4942f = 250L;
        obj.f5008g = true;
        obj.f5009h = new ArrayList();
        obj.f5010i = new ArrayList();
        obj.f5011j = new ArrayList();
        obj.f5012k = new ArrayList();
        obj.l = new ArrayList();
        obj.m = new ArrayList();
        obj.f5013n = new ArrayList();
        obj.f5014o = new ArrayList();
        obj.f5015p = new ArrayList();
        obj.f5016q = new ArrayList();
        obj.f5017r = new ArrayList();
        this.mItemAnimator = obj;
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new o0(this);
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new Object() : null;
        ?? obj2 = new Object();
        obj2.f5026a = -1;
        obj2.b = 0;
        obj2.f5027c = 0;
        obj2.f5028d = 1;
        obj2.f5029e = 0;
        obj2.f5030f = false;
        obj2.f5031g = false;
        obj2.f5032h = false;
        obj2.f5033i = false;
        obj2.f5034j = false;
        obj2.f5035k = false;
        this.mState = obj2;
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new H(this);
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new F(this, 1);
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new H(this);
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
        this.mItemAnimator.f4938a = this.mItemAnimatorListener;
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new r0(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.recyclerview.R.styleable.RecyclerView, i9, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, androidx.recyclerview.R.styleable.RecyclerView, attributeSet, obtainStyledAttributes, i9, 0);
        String string = obtainStyledAttributes.getString(androidx.recyclerview.R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(androidx.recyclerview.R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z8 = obtainStyledAttributes.getBoolean(androidx.recyclerview.R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z8;
        if (z8) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(androidx.recyclerview.R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i9, 0);
        int[] iArr = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i9, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, obtainStyledAttributes2, i9, 0);
        boolean z9 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z9);
        setTag(com.tools.arruler.photomeasure.camera.ruler.R.id.is_pooling_container_tag, Boolean.TRUE);
    }

    @Override // T.r
    public boolean dispatchNestedPreScroll(int i9, int i10, int[] iArr, int[] iArr2, int i11) {
        return getScrollingChildHelper().c(i9, i10, iArr, iArr2, i11);
    }

    @Override // T.r
    public boolean dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr, int i13) {
        return getScrollingChildHelper().e(i9, i10, i11, i12, iArr, i13, null);
    }

    @Override // T.r
    public boolean hasNestedScrollingParent(int i9) {
        return getScrollingChildHelper().g(i9);
    }

    public void smoothScrollBy(int i9, int i10, @Nullable Interpolator interpolator, int i11) {
        smoothScrollBy(i9, i10, interpolator, i11, false);
    }

    @Override // T.r
    public boolean startNestedScroll(int i9, int i10) {
        return getScrollingChildHelper().h(i9, i10);
    }

    @Override // T.r
    public void stopNestedScroll(int i9) {
        getScrollingChildHelper().i(i9);
    }

    public void smoothScrollBy(int i9, int i10, @Nullable Interpolator interpolator, int i11, boolean z8) {
        W w2 = this.mLayout;
        if (w2 == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.mLayoutSuppressed) {
            return;
        }
        if (!w2.canScrollHorizontally()) {
            i9 = 0;
        }
        if (!this.mLayout.canScrollVertically()) {
            i10 = 0;
        }
        if (i9 == 0 && i10 == 0) {
            return;
        }
        if (i11 != Integer.MIN_VALUE && i11 <= 0) {
            scrollBy(i9, i10);
            return;
        }
        if (z8) {
            int i12 = i9 != 0 ? 1 : 0;
            if (i10 != 0) {
                i12 |= 2;
            }
            startNestedScroll(i12, 1);
        }
        this.mViewFlinger.c(i9, i10, interpolator, i11);
    }

    @Override // T.InterfaceC0287s
    public final void dispatchNestedScroll(int i9, int i10, int i11, int i12, int[] iArr, int i13, @NonNull int[] iArr2) {
        getScrollingChildHelper().e(i9, i10, i11, i12, iArr, i13, iArr2);
    }

    public void addItemDecoration(@NonNull S s5) {
        addItemDecoration(s5, -1);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        W w2 = this.mLayout;
        if (w2 != null) {
            return w2.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(Q7.n0.h(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
