package androidx.viewpager.widget;

import B3.k;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.G;
import b0.AbstractC0547b;
import com.mbridge.msdk.foundation.entity.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class ViewPager extends ViewGroup {
    private static final int CLOSE_ENOUGH = 2;
    private static final boolean DEBUG = false;
    private static final int DEFAULT_GUTTER_SIZE = 16;
    private static final int DEFAULT_OFFSCREEN_PAGES = 1;
    private static final int DRAW_ORDER_DEFAULT = 0;
    private static final int DRAW_ORDER_FORWARD = 1;
    private static final int DRAW_ORDER_REVERSE = 2;
    private static final int INVALID_POINTER = -1;
    private static final int MAX_SETTLE_DURATION = 600;
    private static final int MIN_DISTANCE_FOR_FLING = 25;
    private static final int MIN_FLING_VELOCITY = 400;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    private static final String TAG = "ViewPager";
    private static final boolean USE_CACHE = false;
    private int mActivePointerId;
    PagerAdapter mAdapter;
    private List<e> mAdapterChangeListeners;
    private int mBottomPageBounds;
    private boolean mCalledSuper;
    private int mChildHeightMeasureSpec;
    private int mChildWidthMeasureSpec;
    private int mCloseEnough;
    int mCurItem;
    private int mDecorChildCount;
    private int mDefaultGutterSize;
    private int mDrawingOrder;
    private ArrayList<View> mDrawingOrderedChildren;
    private final Runnable mEndScrollRunnable;
    private int mExpectedAdapterCount;
    private long mFakeDragBeginTime;
    private boolean mFakeDragging;
    private boolean mFirstLayout;
    private float mFirstOffset;
    private int mFlingDistance;
    private int mGutterSize;
    private boolean mInLayout;
    private float mInitialMotionX;
    private float mInitialMotionY;
    private f mInternalPageChangeListener;
    private boolean mIsBeingDragged;
    private boolean mIsScrollStarted;
    private boolean mIsUnableToDrag;
    private final ArrayList<b> mItems;
    private float mLastMotionX;
    private float mLastMotionY;
    private float mLastOffset;
    private EdgeEffect mLeftEdge;
    private Drawable mMarginDrawable;
    private int mMaximumVelocity;
    private int mMinimumVelocity;
    private boolean mNeedCalculatePageOffsets;
    private h mObserver;
    private int mOffscreenPageLimit;
    private f mOnPageChangeListener;
    private List<f> mOnPageChangeListeners;
    private int mPageMargin;
    private g mPageTransformer;
    private int mPageTransformerLayerType;
    private boolean mPopulatePending;
    private Parcelable mRestoredAdapterState;
    private ClassLoader mRestoredClassLoader;
    private int mRestoredCurItem;
    private EdgeEffect mRightEdge;
    private int mScrollState;
    private Scroller mScroller;
    private boolean mScrollingCacheEnabled;
    private final b mTempItem;
    private final Rect mTempRect;
    private int mTopPageBounds;
    private int mTouchSlop;
    private VelocityTracker mVelocityTracker;
    static final int[] LAYOUT_ATTRS = {R.attr.layout_gravity};
    private static final Comparator<b> COMPARATOR = new C5.c(9);
    private static final Interpolator sInterpolator = new G(1);
    private static final j sPositionComparator = new Object();

    /* JADX WARN: Type inference failed for: r3v2, types: [androidx.viewpager.widget.b, java.lang.Object] */
    public ViewPager(@NonNull Context context) {
        super(context);
        this.mItems = new ArrayList<>();
        this.mTempItem = new Object();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new k(this, 9);
        this.mScrollState = 0;
        initViewPager();
    }

    private void calculatePageOffsets(b bVar, int i9, b bVar2) {
        float f9;
        float f10;
        float f11;
        int i10;
        int i11;
        b bVar3;
        b bVar4;
        int count = this.mAdapter.getCount();
        int clientWidth = getClientWidth();
        if (clientWidth > 0) {
            f9 = this.mPageMargin / clientWidth;
        } else {
            f9 = 0.0f;
        }
        if (bVar2 != null) {
            int i12 = bVar2.b;
            int i13 = bVar.b;
            if (i12 < i13) {
                float f12 = bVar2.f5156e + bVar2.f5155d + f9;
                int i14 = i12 + 1;
                int i15 = 0;
                while (i14 <= bVar.b && i15 < this.mItems.size()) {
                    b bVar5 = this.mItems.get(i15);
                    while (true) {
                        bVar4 = bVar5;
                        if (i14 <= bVar4.b || i15 >= this.mItems.size() - 1) {
                            break;
                        }
                        i15++;
                        bVar5 = this.mItems.get(i15);
                    }
                    while (i14 < bVar4.b) {
                        f12 += this.mAdapter.getPageWidth(i14) + f9;
                        i14++;
                    }
                    bVar4.f5156e = f12;
                    f12 += bVar4.f5155d + f9;
                    i14++;
                }
            } else if (i12 > i13) {
                int size = this.mItems.size() - 1;
                float f13 = bVar2.f5156e;
                while (true) {
                    i12--;
                    if (i12 < bVar.b || size < 0) {
                        break;
                    }
                    b bVar6 = this.mItems.get(size);
                    while (true) {
                        bVar3 = bVar6;
                        if (i12 >= bVar3.b || size <= 0) {
                            break;
                        }
                        size--;
                        bVar6 = this.mItems.get(size);
                    }
                    while (i12 > bVar3.b) {
                        f13 -= this.mAdapter.getPageWidth(i12) + f9;
                        i12--;
                    }
                    f13 -= bVar3.f5155d + f9;
                    bVar3.f5156e = f13;
                }
            }
        }
        int size2 = this.mItems.size();
        float f14 = bVar.f5156e;
        int i16 = bVar.b;
        int i17 = i16 - 1;
        if (i16 == 0) {
            f10 = f14;
        } else {
            f10 = -3.4028235E38f;
        }
        this.mFirstOffset = f10;
        int i18 = count - 1;
        if (i16 == i18) {
            f11 = (bVar.f5155d + f14) - 1.0f;
        } else {
            f11 = Float.MAX_VALUE;
        }
        this.mLastOffset = f11;
        int i19 = i9 - 1;
        while (i19 >= 0) {
            b bVar7 = this.mItems.get(i19);
            while (true) {
                i11 = bVar7.b;
                if (i17 <= i11) {
                    break;
                }
                f14 -= this.mAdapter.getPageWidth(i17) + f9;
                i17--;
            }
            f14 -= bVar7.f5155d + f9;
            bVar7.f5156e = f14;
            if (i11 == 0) {
                this.mFirstOffset = f14;
            }
            i19--;
            i17--;
        }
        float f15 = bVar.f5156e + bVar.f5155d + f9;
        int i20 = bVar.b + 1;
        int i21 = i9 + 1;
        while (i21 < size2) {
            b bVar8 = this.mItems.get(i21);
            while (true) {
                i10 = bVar8.b;
                if (i20 >= i10) {
                    break;
                }
                f15 += this.mAdapter.getPageWidth(i20) + f9;
                i20++;
            }
            if (i10 == i18) {
                this.mLastOffset = (bVar8.f5155d + f15) - 1.0f;
            }
            bVar8.f5156e = f15;
            f15 += bVar8.f5155d + f9;
            i21++;
            i20++;
        }
        this.mNeedCalculatePageOffsets = false;
    }

    private void completeScroll(boolean z8) {
        boolean z9;
        if (this.mScrollState == 2) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (z9) {
            setScrollingCacheEnabled(false);
            if (!this.mScroller.isFinished()) {
                this.mScroller.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.mScroller.getCurrX();
                int currY = this.mScroller.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        pageScrolled(currX);
                    }
                }
            }
        }
        this.mPopulatePending = false;
        for (int i9 = 0; i9 < this.mItems.size(); i9++) {
            b bVar = this.mItems.get(i9);
            if (bVar.f5154c) {
                bVar.f5154c = false;
                z9 = true;
            }
        }
        if (z9) {
            if (z8) {
                ViewCompat.postOnAnimation(this, this.mEndScrollRunnable);
            } else {
                this.mEndScrollRunnable.run();
            }
        }
    }

    private int determineTargetPage(int i9, float f9, int i10, int i11) {
        float f10;
        if (Math.abs(i11) > this.mFlingDistance && Math.abs(i10) > this.mMinimumVelocity) {
            if (i10 <= 0) {
                i9++;
            }
        } else {
            if (i9 >= this.mCurItem) {
                f10 = 0.4f;
            } else {
                f10 = 0.6f;
            }
            i9 += (int) (f9 + f10);
        }
        if (this.mItems.size() > 0) {
            return Math.max(this.mItems.get(0).b, Math.min(i9, ((b) o.g(this.mItems, 1)).b));
        }
        return i9;
    }

    private void dispatchOnPageScrolled(int i9, float f9, int i10) {
        f fVar = this.mOnPageChangeListener;
        if (fVar != null) {
            fVar.onPageScrolled(i9, f9, i10);
        }
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                f fVar2 = this.mOnPageChangeListeners.get(i11);
                if (fVar2 != null) {
                    fVar2.onPageScrolled(i9, f9, i10);
                }
            }
        }
        f fVar3 = this.mInternalPageChangeListener;
        if (fVar3 != null) {
            fVar3.onPageScrolled(i9, f9, i10);
        }
    }

    private void dispatchOnPageSelected(int i9) {
        f fVar = this.mOnPageChangeListener;
        if (fVar != null) {
            fVar.onPageSelected(i9);
        }
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar2 = this.mOnPageChangeListeners.get(i10);
                if (fVar2 != null) {
                    fVar2.onPageSelected(i9);
                }
            }
        }
        f fVar3 = this.mInternalPageChangeListener;
        if (fVar3 != null) {
            fVar3.onPageSelected(i9);
        }
    }

    private void dispatchOnScrollStateChanged(int i9) {
        f fVar = this.mOnPageChangeListener;
        if (fVar != null) {
            fVar.onPageScrollStateChanged(i9);
        }
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                f fVar2 = this.mOnPageChangeListeners.get(i10);
                if (fVar2 != null) {
                    fVar2.onPageScrollStateChanged(i9);
                }
            }
        }
        f fVar3 = this.mInternalPageChangeListener;
        if (fVar3 != null) {
            fVar3.onPageScrollStateChanged(i9);
        }
    }

    private void enableLayers(boolean z8) {
        int i9;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (z8) {
                i9 = this.mPageTransformerLayerType;
            } else {
                i9 = 0;
            }
            getChildAt(i10).setLayerType(i9, null);
        }
    }

    private void endDrag() {
        this.mIsBeingDragged = false;
        this.mIsUnableToDrag = false;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.mVelocityTracker = null;
        }
    }

    private Rect getChildRectInPagerCoordinates(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left = viewGroup.getLeft() + rect.left;
            rect.right = viewGroup.getRight() + rect.right;
            rect.top = viewGroup.getTop() + rect.top;
            rect.bottom = viewGroup.getBottom() + rect.bottom;
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private b infoForCurrentScrollPosition() {
        float f9;
        float f10;
        int i9;
        int clientWidth = getClientWidth();
        float f11 = 0.0f;
        if (clientWidth > 0) {
            f9 = getScrollX() / clientWidth;
        } else {
            f9 = 0.0f;
        }
        if (clientWidth > 0) {
            f10 = this.mPageMargin / clientWidth;
        } else {
            f10 = 0.0f;
        }
        int i10 = 0;
        boolean z8 = true;
        b bVar = null;
        int i11 = -1;
        float f12 = 0.0f;
        while (i10 < this.mItems.size()) {
            b bVar2 = this.mItems.get(i10);
            if (!z8 && bVar2.b != (i9 = i11 + 1)) {
                bVar2 = this.mTempItem;
                bVar2.f5156e = f11 + f12 + f10;
                bVar2.b = i9;
                bVar2.f5155d = this.mAdapter.getPageWidth(i9);
                i10--;
            }
            b bVar3 = bVar2;
            f11 = bVar3.f5156e;
            float f13 = bVar3.f5155d + f11 + f10;
            if (!z8 && f9 < f11) {
                return bVar;
            }
            if (f9 >= f13 && i10 != this.mItems.size() - 1) {
                int i12 = bVar3.b;
                float f14 = bVar3.f5155d;
                i10++;
                z8 = false;
                i11 = i12;
                f12 = f14;
                bVar = bVar3;
            } else {
                return bVar3;
            }
        }
        return bVar;
    }

    private static boolean isDecorView(@NonNull View view) {
        if (view.getClass().getAnnotation(a.class) != null) {
            return true;
        }
        return false;
    }

    private boolean isGutterDrag(float f9, float f10) {
        if ((f9 < this.mGutterSize && f10 > 0.0f) || (f9 > getWidth() - this.mGutterSize && f10 < 0.0f)) {
            return true;
        }
        return false;
    }

    private void onSecondaryPointerUp(MotionEvent motionEvent) {
        int i9;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mActivePointerId) {
            if (actionIndex == 0) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            this.mLastMotionX = motionEvent.getX(i9);
            this.mActivePointerId = motionEvent.getPointerId(i9);
            VelocityTracker velocityTracker = this.mVelocityTracker;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean pageScrolled(int i9) {
        if (this.mItems.size() == 0) {
            if (this.mFirstLayout) {
                return false;
            }
            this.mCalledSuper = false;
            onPageScrolled(0, 0.0f, 0);
            if (this.mCalledSuper) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
        int clientWidth = getClientWidth();
        int i10 = this.mPageMargin;
        int i11 = clientWidth + i10;
        float f9 = clientWidth;
        int i12 = infoForCurrentScrollPosition.b;
        float f10 = ((i9 / f9) - infoForCurrentScrollPosition.f5156e) / (infoForCurrentScrollPosition.f5155d + (i10 / f9));
        this.mCalledSuper = false;
        onPageScrolled(i12, f10, (int) (i11 * f10));
        if (this.mCalledSuper) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean performDrag(float f9) {
        boolean z8;
        boolean z9;
        float f10 = this.mLastMotionX - f9;
        this.mLastMotionX = f9;
        float scrollX = getScrollX() + f10;
        float clientWidth = getClientWidth();
        float f11 = this.mFirstOffset * clientWidth;
        float f12 = this.mLastOffset * clientWidth;
        boolean z10 = false;
        b bVar = this.mItems.get(0);
        b bVar2 = (b) o.g(this.mItems, 1);
        if (bVar.b != 0) {
            f11 = bVar.f5156e * clientWidth;
            z8 = false;
        } else {
            z8 = true;
        }
        if (bVar2.b != this.mAdapter.getCount() - 1) {
            f12 = bVar2.f5156e * clientWidth;
            z9 = false;
        } else {
            z9 = true;
        }
        if (scrollX < f11) {
            if (z8) {
                this.mLeftEdge.onPull(Math.abs(f11 - scrollX) / clientWidth);
                z10 = true;
            }
            scrollX = f11;
        } else if (scrollX > f12) {
            if (z9) {
                this.mRightEdge.onPull(Math.abs(scrollX - f12) / clientWidth);
                z10 = true;
            }
            scrollX = f12;
        }
        int i9 = (int) scrollX;
        this.mLastMotionX = (scrollX - i9) + this.mLastMotionX;
        scrollTo(i9, getScrollY());
        pageScrolled(i9);
        return z10;
    }

    private void recomputeScrollPosition(int i9, int i10, int i11, int i12) {
        float f9;
        if (i10 > 0 && !this.mItems.isEmpty()) {
            if (!this.mScroller.isFinished()) {
                this.mScroller.setFinalX(getCurrentItem() * getClientWidth());
                return;
            }
            scrollTo((int) ((getScrollX() / (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)) * (((i9 - getPaddingLeft()) - getPaddingRight()) + i11)), getScrollY());
            return;
        }
        b infoForPosition = infoForPosition(this.mCurItem);
        if (infoForPosition != null) {
            f9 = Math.min(infoForPosition.f5156e, this.mLastOffset);
        } else {
            f9 = 0.0f;
        }
        int paddingLeft = (int) (f9 * ((i9 - getPaddingLeft()) - getPaddingRight()));
        if (paddingLeft != getScrollX()) {
            completeScroll(false);
            scrollTo(paddingLeft, getScrollY());
        }
    }

    private void removeNonDecorViews() {
        int i9 = 0;
        while (i9 < getChildCount()) {
            if (!((c) getChildAt(i9).getLayoutParams()).f5157a) {
                removeViewAt(i9);
                i9--;
            }
            i9++;
        }
    }

    private void requestParentDisallowInterceptTouchEvent(boolean z8) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z8);
        }
    }

    private boolean resetTouch() {
        this.mActivePointerId = -1;
        endDrag();
        this.mLeftEdge.onRelease();
        this.mRightEdge.onRelease();
        if (!this.mLeftEdge.isFinished() && !this.mRightEdge.isFinished()) {
            return false;
        }
        return true;
    }

    private void scrollToItem(int i9, boolean z8, int i10, boolean z9) {
        int i11;
        b infoForPosition = infoForPosition(i9);
        if (infoForPosition != null) {
            i11 = (int) (Math.max(this.mFirstOffset, Math.min(infoForPosition.f5156e, this.mLastOffset)) * getClientWidth());
        } else {
            i11 = 0;
        }
        if (z8) {
            smoothScrollTo(i11, 0, i10);
            if (z9) {
                dispatchOnPageSelected(i9);
                return;
            }
            return;
        }
        if (z9) {
            dispatchOnPageSelected(i9);
        }
        completeScroll(false);
        scrollTo(i11, 0);
        pageScrolled(i11);
    }

    private void setScrollingCacheEnabled(boolean z8) {
        if (this.mScrollingCacheEnabled != z8) {
            this.mScrollingCacheEnabled = z8;
        }
    }

    private void sortChildDrawingOrder() {
        if (this.mDrawingOrder != 0) {
            ArrayList<View> arrayList = this.mDrawingOrderedChildren;
            if (arrayList == null) {
                this.mDrawingOrderedChildren = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                this.mDrawingOrderedChildren.add(getChildAt(i9));
            }
            Collections.sort(this.mDrawingOrderedChildren, sPositionComparator);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i9, int i10) {
        b infoForChild;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
                    childAt.addFocusables(arrayList, i9, i10);
                }
            }
        }
        if ((descendantFocusability == 262144 && size != arrayList.size()) || !isFocusable()) {
            return;
        }
        if ((i10 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
            return;
        }
        arrayList.add(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.viewpager.widget.b, java.lang.Object] */
    public b addNewItem(int i9, int i10) {
        ?? obj = new Object();
        obj.b = i9;
        obj.f5153a = this.mAdapter.instantiateItem((ViewGroup) this, i9);
        obj.f5155d = this.mAdapter.getPageWidth(i9);
        if (i10 >= 0 && i10 < this.mItems.size()) {
            this.mItems.add(i10, obj);
        } else {
            this.mItems.add(obj);
        }
        return obj;
    }

    public void addOnAdapterChangeListener(@NonNull e eVar) {
        if (this.mAdapterChangeListeners == null) {
            this.mAdapterChangeListeners = new ArrayList();
        }
        this.mAdapterChangeListeners.add(eVar);
    }

    public void addOnPageChangeListener(@NonNull f fVar) {
        if (this.mOnPageChangeListeners == null) {
            this.mOnPageChangeListeners = new ArrayList();
        }
        this.mOnPageChangeListeners.add(fVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        b infoForChild;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i9, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        c cVar = (c) layoutParams;
        boolean isDecorView = cVar.f5157a | isDecorView(view);
        cVar.f5157a = isDecorView;
        if (this.mInLayout) {
            if (!isDecorView) {
                cVar.f5159d = true;
                addViewInLayout(view, i9, layoutParams);
                return;
            }
            throw new IllegalStateException("Cannot add pager decor view during layout");
        }
        super.addView(view, i9, layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean arrowScroll(int r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.findFocus()
            r1 = 0
            if (r0 != r4) goto L9
        L7:
            r0 = r1
            goto L60
        L9:
            if (r0 == 0) goto L60
            android.view.ViewParent r2 = r0.getParent()
        Lf:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L1b
            if (r2 != r4) goto L16
            goto L60
        L16:
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
        L2f:
            boolean r3 = r0 instanceof android.view.ViewGroup
            if (r3 == 0) goto L48
            java.lang.String r3 = " => "
            r2.append(r3)
            java.lang.Class r3 = r0.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            android.view.ViewParent r0 = r0.getParent()
            goto L2f
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "arrowScroll tried to find focus based on non-child current focused view "
            r0.<init>(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "ViewPager"
            android.util.Log.e(r2, r0)
            goto L7
        L60:
            android.view.FocusFinder r1 = android.view.FocusFinder.getInstance()
            android.view.View r1 = r1.findNextFocus(r4, r0, r5)
            r2 = 66
            r3 = 17
            if (r1 == 0) goto Lb0
            if (r1 == r0) goto Lb0
            if (r5 != r3) goto L90
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto L8b
            if (r2 < r3) goto L8b
            boolean r0 = r4.pageLeft()
            goto Lc7
        L8b:
            boolean r0 = r1.requestFocus()
            goto Lc7
        L90:
            if (r5 != r2) goto Lbc
            android.graphics.Rect r2 = r4.mTempRect
            android.graphics.Rect r2 = r4.getChildRectInPagerCoordinates(r2, r1)
            int r2 = r2.left
            android.graphics.Rect r3 = r4.mTempRect
            android.graphics.Rect r3 = r4.getChildRectInPagerCoordinates(r3, r0)
            int r3 = r3.left
            if (r0 == 0) goto Lab
            if (r2 > r3) goto Lab
            boolean r0 = r4.pageRight()
            goto Lc7
        Lab:
            boolean r0 = r1.requestFocus()
            goto Lc7
        Lb0:
            if (r5 == r3) goto Lc3
            r0 = 1
            if (r5 != r0) goto Lb6
            goto Lc3
        Lb6:
            if (r5 == r2) goto Lbe
            r0 = 2
            if (r5 != r0) goto Lbc
            goto Lbe
        Lbc:
            r0 = 0
            goto Lc7
        Lbe:
            boolean r0 = r4.pageRight()
            goto Lc7
        Lc3:
            boolean r0 = r4.pageLeft()
        Lc7:
            if (r0 == 0) goto Ld0
            int r5 = android.view.SoundEffectConstants.getContantForFocusDirection(r5)
            r4.playSoundEffect(r5)
        Ld0:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.arrowScroll(int):boolean");
    }

    public boolean beginFakeDrag() {
        if (this.mIsBeingDragged) {
            return false;
        }
        this.mFakeDragging = true;
        setScrollState(1);
        this.mLastMotionX = 0.0f;
        this.mInitialMotionX = 0.0f;
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long uptimeMillis = SystemClock.uptimeMillis();
        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, 0.0f, 0.0f, 0);
        this.mVelocityTracker.addMovement(obtain);
        obtain.recycle();
        this.mFakeDragBeginTime = uptimeMillis;
        return true;
    }

    public boolean canScroll(View view, boolean z8, int i9, int i10, int i11) {
        int i12;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i13 = i10 + scrollX;
                if (i13 >= childAt.getLeft() && i13 < childAt.getRight() && (i12 = i11 + scrollY) >= childAt.getTop() && i12 < childAt.getBottom() && canScroll(childAt, true, i9, i13 - childAt.getLeft(), i12 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (z8 && view.canScrollHorizontally(-i9)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i9) {
        if (this.mAdapter == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i9 < 0) {
            if (scrollX <= ((int) (clientWidth * this.mFirstOffset))) {
                return false;
            }
            return true;
        }
        if (i9 <= 0 || scrollX >= ((int) (clientWidth * this.mLastOffset))) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof c) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    public void clearOnPageChangeListeners() {
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.mIsScrollStarted = true;
        if (!this.mScroller.isFinished() && this.mScroller.computeScrollOffset()) {
            int scrollX = getScrollX();
            int scrollY = getScrollY();
            int currX = this.mScroller.getCurrX();
            int currY = this.mScroller.getCurrY();
            if (scrollX != currX || scrollY != currY) {
                scrollTo(currX, currY);
                if (!pageScrolled(currX)) {
                    this.mScroller.abortAnimation();
                    scrollTo(0, currY);
                }
            }
            ViewCompat.postInvalidateOnAnimation(this);
            return;
        }
        completeScroll(true);
    }

    public void dataSetChanged() {
        boolean z8;
        int count = this.mAdapter.getCount();
        this.mExpectedAdapterCount = count;
        if (this.mItems.size() < (this.mOffscreenPageLimit * 2) + 1 && this.mItems.size() < count) {
            z8 = true;
        } else {
            z8 = false;
        }
        int i9 = this.mCurItem;
        int i10 = 0;
        boolean z9 = false;
        while (i10 < this.mItems.size()) {
            b bVar = this.mItems.get(i10);
            int itemPosition = this.mAdapter.getItemPosition(bVar.f5153a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.mItems.remove(i10);
                    i10--;
                    if (!z9) {
                        this.mAdapter.startUpdate((ViewGroup) this);
                        z9 = true;
                    }
                    this.mAdapter.destroyItem((ViewGroup) this, bVar.b, bVar.f5153a);
                    int i11 = this.mCurItem;
                    if (i11 == bVar.b) {
                        i9 = Math.max(0, Math.min(i11, count - 1));
                    }
                } else {
                    int i12 = bVar.b;
                    if (i12 != itemPosition) {
                        if (i12 == this.mCurItem) {
                            i9 = itemPosition;
                        }
                        bVar.b = itemPosition;
                    }
                }
                z8 = true;
            }
            i10++;
        }
        if (z9) {
            this.mAdapter.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.mItems, COMPARATOR);
        if (z8) {
            int childCount = getChildCount();
            for (int i13 = 0; i13 < childCount; i13++) {
                c cVar = (c) getChildAt(i13).getLayoutParams();
                if (!cVar.f5157a) {
                    cVar.f5158c = 0.0f;
                }
            }
            setCurrentItemInternal(i9, false, true);
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !executeKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        b infoForChild;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    public float distanceInfluenceForSnapDuration(float f9) {
        return (float) Math.sin((f9 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        PagerAdapter pagerAdapter;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean z8 = false;
        if (overScrollMode != 0 && (overScrollMode != 1 || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() <= 1)) {
            this.mLeftEdge.finish();
            this.mRightEdge.finish();
        } else {
            if (!this.mLeftEdge.isFinished()) {
                int save = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate(getPaddingTop() + (-height), this.mFirstOffset * width);
                this.mLeftEdge.setSize(height, width);
                z8 = this.mLeftEdge.draw(canvas);
                canvas.restoreToCount(save);
            }
            if (!this.mRightEdge.isFinished()) {
                int save2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.mLastOffset + 1.0f)) * width2);
                this.mRightEdge.setSize(height2, width2);
                z8 |= this.mRightEdge.draw(canvas);
                canvas.restoreToCount(save2);
            }
        }
        if (z8) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.mMarginDrawable;
        if (drawable != null && drawable.isStateful()) {
            drawable.setState(getDrawableState());
        }
    }

    public void endFakeDrag() {
        if (this.mFakeDragging) {
            if (this.mAdapter != null) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.b, ((scrollX / clientWidth) - infoForCurrentScrollPosition.f5156e) / infoForCurrentScrollPosition.f5155d, xVelocity, (int) (this.mLastMotionX - this.mInitialMotionX)), true, true, xVelocity);
            }
            endDrag();
            this.mFakeDragging = false;
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 21) {
                if (keyCode != 22) {
                    if (keyCode == 61) {
                        if (keyEvent.hasNoModifiers()) {
                            return arrowScroll(2);
                        }
                        if (keyEvent.hasModifiers(1)) {
                            return arrowScroll(1);
                        }
                    }
                } else {
                    if (keyEvent.hasModifiers(2)) {
                        return pageRight();
                    }
                    return arrowScroll(66);
                }
            } else {
                if (keyEvent.hasModifiers(2)) {
                    return pageLeft();
                }
                return arrowScroll(17);
            }
        }
        return false;
    }

    public void fakeDragBy(float f9) {
        if (this.mFakeDragging) {
            if (this.mAdapter == null) {
                return;
            }
            this.mLastMotionX += f9;
            float scrollX = getScrollX() - f9;
            float clientWidth = getClientWidth();
            float f10 = this.mFirstOffset * clientWidth;
            float f11 = this.mLastOffset * clientWidth;
            b bVar = this.mItems.get(0);
            b bVar2 = (b) o.g(this.mItems, 1);
            if (bVar.b != 0) {
                f10 = bVar.f5156e * clientWidth;
            }
            if (bVar2.b != this.mAdapter.getCount() - 1) {
                f11 = bVar2.f5156e * clientWidth;
            }
            if (scrollX < f10) {
                scrollX = f10;
            } else if (scrollX > f11) {
                scrollX = f11;
            }
            int i9 = (int) scrollX;
            this.mLastMotionX = (scrollX - i9) + this.mLastMotionX;
            scrollTo(i9, getScrollY());
            pageScrolled(i9);
            MotionEvent obtain = MotionEvent.obtain(this.mFakeDragBeginTime, SystemClock.uptimeMillis(), 2, this.mLastMotionX, 0.0f, 0);
            this.mVelocityTracker.addMovement(obtain);
            obtain.recycle();
            return;
        }
        throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.viewpager.widget.c, android.view.ViewGroup$LayoutParams] */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        ?? layoutParams = new ViewGroup.LayoutParams(-1, -1);
        layoutParams.f5158c = 0.0f;
        return layoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @Nullable
    public PagerAdapter getAdapter() {
        return this.mAdapter;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i9, int i10) {
        if (this.mDrawingOrder == 2) {
            i10 = (i9 - 1) - i10;
        }
        return ((c) this.mDrawingOrderedChildren.get(i10).getLayoutParams()).f5161f;
    }

    public int getCurrentItem() {
        return this.mCurItem;
    }

    public int getOffscreenPageLimit() {
        return this.mOffscreenPageLimit;
    }

    public int getPageMargin() {
        return this.mPageMargin;
    }

    public b infoForAnyChild(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent != this) {
                if (parent != null && (parent instanceof View)) {
                    view = (View) parent;
                } else {
                    return null;
                }
            } else {
                return infoForChild(view);
            }
        }
    }

    public b infoForChild(View view) {
        for (int i9 = 0; i9 < this.mItems.size(); i9++) {
            b bVar = this.mItems.get(i9);
            if (this.mAdapter.isViewFromObject(view, bVar.f5153a)) {
                return bVar;
            }
        }
        return null;
    }

    public b infoForPosition(int i9) {
        for (int i10 = 0; i10 < this.mItems.size(); i10++) {
            b bVar = this.mItems.get(i10);
            if (bVar.b == i9) {
                return bVar;
            }
        }
        return null;
    }

    public void initViewPager() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.mScroller = new Scroller(context, sInterpolator);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f9 = context.getResources().getDisplayMetrics().density;
        this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
        this.mMinimumVelocity = (int) (400.0f * f9);
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        this.mLeftEdge = new EdgeEffect(context);
        this.mRightEdge = new EdgeEffect(context);
        this.mFlingDistance = (int) (25.0f * f9);
        this.mCloseEnough = (int) (2.0f * f9);
        this.mDefaultGutterSize = (int) (f9 * 16.0f);
        ViewCompat.setAccessibilityDelegate(this, new d(this));
        if (ViewCompat.getImportantForAccessibility(this) == 0) {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        ViewCompat.setOnApplyWindowInsetsListener(this, new a7.b(this));
    }

    public boolean isFakeDragging() {
        return this.mFakeDragging;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mFirstLayout = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        removeCallbacks(this.mEndScrollRunnable);
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            this.mScroller.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int i9;
        float f9;
        float f10;
        super.onDraw(canvas);
        if (this.mPageMargin > 0 && this.mMarginDrawable != null && this.mItems.size() > 0 && this.mAdapter != null) {
            int scrollX = getScrollX();
            float width = getWidth();
            float f11 = this.mPageMargin / width;
            int i10 = 0;
            b bVar = this.mItems.get(0);
            float f12 = bVar.f5156e;
            int size = this.mItems.size();
            int i11 = bVar.b;
            int i12 = this.mItems.get(size - 1).b;
            while (i11 < i12) {
                while (true) {
                    i9 = bVar.b;
                    if (i11 <= i9 || i10 >= size) {
                        break;
                    }
                    i10++;
                    bVar = this.mItems.get(i10);
                }
                if (i11 == i9) {
                    float f13 = bVar.f5156e;
                    float f14 = bVar.f5155d;
                    f9 = (f13 + f14) * width;
                    f12 = f13 + f14 + f11;
                } else {
                    float pageWidth = this.mAdapter.getPageWidth(i11);
                    f9 = (f12 + pageWidth) * width;
                    f12 = pageWidth + f11 + f12;
                }
                if (this.mPageMargin + f9 > scrollX) {
                    f10 = f11;
                    this.mMarginDrawable.setBounds(Math.round(f9), this.mTopPageBounds, Math.round(this.mPageMargin + f9), this.mBottomPageBounds);
                    this.mMarginDrawable.draw(canvas);
                } else {
                    f10 = f11;
                }
                if (f9 <= scrollX + r2) {
                    i11++;
                    f11 = f10;
                } else {
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f9;
        int action = motionEvent.getAction() & 255;
        if (action != 3 && action != 1) {
            if (action != 0) {
                if (this.mIsBeingDragged) {
                    return true;
                }
                if (this.mIsUnableToDrag) {
                    return false;
                }
            }
            if (action != 0) {
                if (action != 2) {
                    if (action == 6) {
                        onSecondaryPointerUp(motionEvent);
                    }
                } else {
                    int i9 = this.mActivePointerId;
                    if (i9 != -1) {
                        int findPointerIndex = motionEvent.findPointerIndex(i9);
                        float x9 = motionEvent.getX(findPointerIndex);
                        float f10 = x9 - this.mLastMotionX;
                        float abs = Math.abs(f10);
                        float y4 = motionEvent.getY(findPointerIndex);
                        float abs2 = Math.abs(y4 - this.mInitialMotionY);
                        if (f10 != 0.0f && !isGutterDrag(this.mLastMotionX, f10) && canScroll(this, false, (int) f10, (int) x9, (int) y4)) {
                            this.mLastMotionX = x9;
                            this.mLastMotionY = y4;
                            this.mIsUnableToDrag = true;
                            return false;
                        }
                        int i10 = this.mTouchSlop;
                        if (abs > i10 && abs * 0.5f > abs2) {
                            this.mIsBeingDragged = true;
                            requestParentDisallowInterceptTouchEvent(true);
                            setScrollState(1);
                            float f11 = this.mInitialMotionX;
                            float f12 = this.mTouchSlop;
                            if (f10 > 0.0f) {
                                f9 = f11 + f12;
                            } else {
                                f9 = f11 - f12;
                            }
                            this.mLastMotionX = f9;
                            this.mLastMotionY = y4;
                            setScrollingCacheEnabled(true);
                        } else if (abs2 > i10) {
                            this.mIsUnableToDrag = true;
                        }
                        if (this.mIsBeingDragged && performDrag(x9)) {
                            ViewCompat.postInvalidateOnAnimation(this);
                        }
                    }
                }
            } else {
                float x10 = motionEvent.getX();
                this.mInitialMotionX = x10;
                this.mLastMotionX = x10;
                float y6 = motionEvent.getY();
                this.mInitialMotionY = y6;
                this.mLastMotionY = y6;
                this.mActivePointerId = motionEvent.getPointerId(0);
                this.mIsUnableToDrag = false;
                this.mIsScrollStarted = true;
                this.mScroller.computeScrollOffset();
                if (this.mScrollState == 2 && Math.abs(this.mScroller.getFinalX() - this.mScroller.getCurrX()) > this.mCloseEnough) {
                    this.mScroller.abortAnimation();
                    this.mPopulatePending = false;
                    populate();
                    this.mIsBeingDragged = true;
                    requestParentDisallowInterceptTouchEvent(true);
                    setScrollState(1);
                } else {
                    completeScroll(false);
                    this.mIsBeingDragged = false;
                }
            }
            if (this.mVelocityTracker == null) {
                this.mVelocityTracker = VelocityTracker.obtain();
            }
            this.mVelocityTracker.addMovement(motionEvent);
            return this.mIsBeingDragged;
        }
        resetTouch();
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLayout(boolean r19, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        c cVar;
        c cVar2;
        boolean z8;
        int i11;
        setMeasuredDimension(View.getDefaultSize(0, i9), View.getDefaultSize(0, i10));
        int measuredWidth = getMeasuredWidth();
        this.mGutterSize = Math.min(measuredWidth / 10, this.mDefaultGutterSize);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i12 = 0;
        while (true) {
            boolean z9 = true;
            int i13 = 1073741824;
            if (i12 >= childCount) {
                break;
            }
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && (cVar2 = (c) childAt.getLayoutParams()) != null && cVar2.f5157a) {
                int i14 = cVar2.b;
                int i15 = i14 & 7;
                int i16 = i14 & 112;
                if (i16 != 48 && i16 != 80) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                if (i15 != 3 && i15 != 5) {
                    z9 = false;
                }
                int i17 = Integer.MIN_VALUE;
                if (z8) {
                    i11 = Integer.MIN_VALUE;
                    i17 = 1073741824;
                } else if (z9) {
                    i11 = 1073741824;
                } else {
                    i11 = Integer.MIN_VALUE;
                }
                int i18 = ((ViewGroup.LayoutParams) cVar2).width;
                if (i18 != -2) {
                    if (i18 == -1) {
                        i18 = paddingLeft;
                    }
                    i17 = 1073741824;
                } else {
                    i18 = paddingLeft;
                }
                int i19 = ((ViewGroup.LayoutParams) cVar2).height;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = measuredHeight;
                    }
                } else {
                    i19 = measuredHeight;
                    i13 = i11;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i18, i17), View.MeasureSpec.makeMeasureSpec(i19, i13));
                if (z8) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z9) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i12++;
        }
        this.mChildWidthMeasureSpec = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.mChildHeightMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.mInLayout = true;
        populate();
        this.mInLayout = false;
        int childCount2 = getChildCount();
        for (int i20 = 0; i20 < childCount2; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8 && ((cVar = (c) childAt2.getLayoutParams()) == null || !cVar.f5157a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * cVar.f5158c), 1073741824), this.mChildHeightMeasureSpec);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0064  */
    @androidx.annotation.CallSuper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPageScrolled(int r12, float r13, int r14) {
        /*
            r11 = this;
            int r0 = r11.mDecorChildCount
            r1 = 1
            if (r0 <= 0) goto L6b
            int r0 = r11.getScrollX()
            int r2 = r11.getPaddingLeft()
            int r3 = r11.getPaddingRight()
            int r4 = r11.getWidth()
            int r5 = r11.getChildCount()
            r6 = 0
        L1a:
            if (r6 >= r5) goto L6b
            android.view.View r7 = r11.getChildAt(r6)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.viewpager.widget.c r8 = (androidx.viewpager.widget.c) r8
            boolean r9 = r8.f5157a
            if (r9 != 0) goto L2b
            goto L68
        L2b:
            int r8 = r8.b
            r8 = r8 & 7
            if (r8 == r1) goto L4f
            r9 = 3
            if (r8 == r9) goto L49
            r9 = 5
            if (r8 == r9) goto L39
            r8 = r2
            goto L5c
        L39:
            int r8 = r4 - r3
            int r9 = r7.getMeasuredWidth()
            int r8 = r8 - r9
            int r9 = r7.getMeasuredWidth()
            int r3 = r3 + r9
        L45:
            r10 = r8
            r8 = r2
            r2 = r10
            goto L5c
        L49:
            int r8 = r7.getWidth()
            int r8 = r8 + r2
            goto L5c
        L4f:
            int r8 = r7.getMeasuredWidth()
            int r8 = r4 - r8
            int r8 = r8 / 2
            int r8 = java.lang.Math.max(r8, r2)
            goto L45
        L5c:
            int r2 = r2 + r0
            int r9 = r7.getLeft()
            int r2 = r2 - r9
            if (r2 == 0) goto L67
            r7.offsetLeftAndRight(r2)
        L67:
            r2 = r8
        L68:
            int r6 = r6 + 1
            goto L1a
        L6b:
            r11.dispatchOnPageScrolled(r12, r13, r14)
            r11.mCalledSuper = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.onPageScrolled(int, float, int):void");
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i9, Rect rect) {
        int i10;
        int i11;
        int i12;
        b infoForChild;
        int childCount = getChildCount();
        if ((i9 & 2) != 0) {
            i11 = childCount;
            i10 = 0;
            i12 = 1;
        } else {
            i10 = childCount - 1;
            i11 = -1;
            i12 = -1;
        }
        while (i10 != i11) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (infoForChild = infoForChild(childAt)) != null && infoForChild.b == this.mCurItem && childAt.requestFocus(i9, rect)) {
                return true;
            }
            i10 += i12;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.b);
        PagerAdapter pagerAdapter = this.mAdapter;
        ClassLoader classLoader = iVar.f5166g;
        if (pagerAdapter != null) {
            pagerAdapter.restoreState(iVar.f5165f, classLoader);
            setCurrentItemInternal(iVar.f5164d, false, true);
        } else {
            this.mRestoredCurItem = iVar.f5164d;
            this.mRestoredAdapterState = iVar.f5165f;
            this.mRestoredClassLoader = classLoader;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, androidx.viewpager.widget.i, b0.b] */
    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        ?? abstractC0547b = new AbstractC0547b(super.onSaveInstanceState());
        abstractC0547b.f5164d = this.mCurItem;
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null) {
            abstractC0547b.f5165f = pagerAdapter.saveState();
        }
        return abstractC0547b;
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        super.onSizeChanged(i9, i10, i11, i12);
        if (i9 != i11) {
            int i13 = this.mPageMargin;
            recomputeScrollPosition(i9, i11, i13, i13);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        PagerAdapter pagerAdapter;
        float f9;
        if (this.mFakeDragging) {
            return true;
        }
        boolean z8 = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (pagerAdapter = this.mAdapter) == null || pagerAdapter.getCount() == 0) {
            return false;
        }
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        if (action != 5) {
                            if (action == 6) {
                                onSecondaryPointerUp(motionEvent);
                                this.mLastMotionX = motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.mLastMotionX = motionEvent.getX(actionIndex);
                            this.mActivePointerId = motionEvent.getPointerId(actionIndex);
                        }
                    } else if (this.mIsBeingDragged) {
                        scrollToItem(this.mCurItem, true, 0, false);
                        z8 = resetTouch();
                    }
                } else {
                    if (!this.mIsBeingDragged) {
                        int findPointerIndex = motionEvent.findPointerIndex(this.mActivePointerId);
                        if (findPointerIndex == -1) {
                            z8 = resetTouch();
                        } else {
                            float x9 = motionEvent.getX(findPointerIndex);
                            float abs = Math.abs(x9 - this.mLastMotionX);
                            float y4 = motionEvent.getY(findPointerIndex);
                            float abs2 = Math.abs(y4 - this.mLastMotionY);
                            if (abs > this.mTouchSlop && abs > abs2) {
                                this.mIsBeingDragged = true;
                                requestParentDisallowInterceptTouchEvent(true);
                                float f10 = this.mInitialMotionX;
                                if (x9 - f10 > 0.0f) {
                                    f9 = f10 + this.mTouchSlop;
                                } else {
                                    f9 = f10 - this.mTouchSlop;
                                }
                                this.mLastMotionX = f9;
                                this.mLastMotionY = y4;
                                setScrollState(1);
                                setScrollingCacheEnabled(true);
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                    if (this.mIsBeingDragged) {
                        z8 = performDrag(motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)));
                    }
                }
            } else if (this.mIsBeingDragged) {
                VelocityTracker velocityTracker = this.mVelocityTracker;
                velocityTracker.computeCurrentVelocity(1000, this.mMaximumVelocity);
                int xVelocity = (int) velocityTracker.getXVelocity(this.mActivePointerId);
                this.mPopulatePending = true;
                int clientWidth = getClientWidth();
                int scrollX = getScrollX();
                b infoForCurrentScrollPosition = infoForCurrentScrollPosition();
                float f11 = clientWidth;
                setCurrentItemInternal(determineTargetPage(infoForCurrentScrollPosition.b, ((scrollX / f11) - infoForCurrentScrollPosition.f5156e) / (infoForCurrentScrollPosition.f5155d + (this.mPageMargin / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.mActivePointerId)) - this.mInitialMotionX)), true, true, xVelocity);
                z8 = resetTouch();
            }
        } else {
            this.mScroller.abortAnimation();
            this.mPopulatePending = false;
            populate();
            float x10 = motionEvent.getX();
            this.mInitialMotionX = x10;
            this.mLastMotionX = x10;
            float y6 = motionEvent.getY();
            this.mInitialMotionY = y6;
            this.mLastMotionY = y6;
            this.mActivePointerId = motionEvent.getPointerId(0);
        }
        if (z8) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        return true;
    }

    public boolean pageLeft() {
        int i9 = this.mCurItem;
        if (i9 > 0) {
            setCurrentItem(i9 - 1, true);
            return true;
        }
        return false;
    }

    public boolean pageRight() {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && this.mCurItem < pagerAdapter.getCount() - 1) {
            setCurrentItem(this.mCurItem + 1, true);
            return true;
        }
        return false;
    }

    public void populate() {
        populate(this.mCurItem);
    }

    public void removeOnAdapterChangeListener(@NonNull e eVar) {
        List<e> list = this.mAdapterChangeListeners;
        if (list != null) {
            list.remove(eVar);
        }
    }

    public void removeOnPageChangeListener(@NonNull f fVar) {
        List<f> list = this.mOnPageChangeListeners;
        if (list != null) {
            list.remove(fVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.mInLayout) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public void setAdapter(@Nullable PagerAdapter pagerAdapter) {
        PagerAdapter pagerAdapter2 = this.mAdapter;
        if (pagerAdapter2 != null) {
            pagerAdapter2.setViewPagerObserver(null);
            this.mAdapter.startUpdate((ViewGroup) this);
            for (int i9 = 0; i9 < this.mItems.size(); i9++) {
                b bVar = this.mItems.get(i9);
                this.mAdapter.destroyItem((ViewGroup) this, bVar.b, bVar.f5153a);
            }
            this.mAdapter.finishUpdate((ViewGroup) this);
            this.mItems.clear();
            removeNonDecorViews();
            this.mCurItem = 0;
            scrollTo(0, 0);
        }
        this.mAdapter = pagerAdapter;
        this.mExpectedAdapterCount = 0;
        if (pagerAdapter != null) {
            if (this.mObserver == null) {
                this.mObserver = new h(this);
            }
            this.mAdapter.setViewPagerObserver(this.mObserver);
            this.mPopulatePending = false;
            boolean z8 = this.mFirstLayout;
            this.mFirstLayout = true;
            this.mExpectedAdapterCount = this.mAdapter.getCount();
            if (this.mRestoredCurItem >= 0) {
                this.mAdapter.restoreState(this.mRestoredAdapterState, this.mRestoredClassLoader);
                setCurrentItemInternal(this.mRestoredCurItem, false, true);
                this.mRestoredCurItem = -1;
                this.mRestoredAdapterState = null;
                this.mRestoredClassLoader = null;
            } else if (!z8) {
                populate();
            } else {
                requestLayout();
            }
        }
        List<e> list = this.mAdapterChangeListeners;
        if (list != null && !list.isEmpty() && this.mAdapterChangeListeners.size() > 0) {
            o.v(this.mAdapterChangeListeners.get(0));
            throw null;
        }
    }

    public void setCurrentItem(int i9) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i9, !this.mFirstLayout, false);
    }

    public void setCurrentItemInternal(int i9, boolean z8, boolean z9) {
        setCurrentItemInternal(i9, z8, z9, 0);
    }

    public f setInternalPageChangeListener(f fVar) {
        f fVar2 = this.mInternalPageChangeListener;
        this.mInternalPageChangeListener = fVar;
        return fVar2;
    }

    public void setOffscreenPageLimit(int i9) {
        if (i9 < 1) {
            Log.w(TAG, "Requested offscreen page limit " + i9 + " too small; defaulting to 1");
            i9 = 1;
        }
        if (i9 != this.mOffscreenPageLimit) {
            this.mOffscreenPageLimit = i9;
            populate();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(f fVar) {
        this.mOnPageChangeListener = fVar;
    }

    public void setPageMargin(int i9) {
        int i10 = this.mPageMargin;
        this.mPageMargin = i9;
        int width = getWidth();
        recomputeScrollPosition(width, width, i9, i10);
        requestLayout();
    }

    public void setPageMarginDrawable(@Nullable Drawable drawable) {
        this.mMarginDrawable = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    public void setPageTransformer(boolean z8, @Nullable g gVar) {
        setPageTransformer(z8, gVar, 2);
    }

    public void setScrollState(int i9) {
        if (this.mScrollState == i9) {
            return;
        }
        this.mScrollState = i9;
        dispatchOnScrollStateChanged(i9);
    }

    public void smoothScrollTo(int i9, int i10) {
        smoothScrollTo(i9, i10, 0);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.mMarginDrawable) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.viewpager.widget.c, android.view.ViewGroup$LayoutParams] */
    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ?? layoutParams = new ViewGroup.LayoutParams(context, attributeSet);
        layoutParams.f5158c = 0.0f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, LAYOUT_ATTRS);
        layoutParams.b = obtainStyledAttributes.getInteger(0, 48);
        obtainStyledAttributes.recycle();
        return layoutParams;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        if (r9 == r10) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        r8 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void populate(int r18) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager.widget.ViewPager.populate(int):void");
    }

    public void setCurrentItemInternal(int i9, boolean z8, boolean z9, int i10) {
        PagerAdapter pagerAdapter = this.mAdapter;
        if (pagerAdapter != null && pagerAdapter.getCount() > 0) {
            if (!z9 && this.mCurItem == i9 && this.mItems.size() != 0) {
                setScrollingCacheEnabled(false);
                return;
            }
            if (i9 < 0) {
                i9 = 0;
            } else if (i9 >= this.mAdapter.getCount()) {
                i9 = this.mAdapter.getCount() - 1;
            }
            int i11 = this.mOffscreenPageLimit;
            int i12 = this.mCurItem;
            if (i9 > i12 + i11 || i9 < i12 - i11) {
                for (int i13 = 0; i13 < this.mItems.size(); i13++) {
                    this.mItems.get(i13).f5154c = true;
                }
            }
            boolean z10 = this.mCurItem != i9;
            if (this.mFirstLayout) {
                this.mCurItem = i9;
                if (z10) {
                    dispatchOnPageSelected(i9);
                }
                requestLayout();
                return;
            }
            populate(i9);
            scrollToItem(i9, z8, i10, z10);
            return;
        }
        setScrollingCacheEnabled(false);
    }

    public void setPageTransformer(boolean z8, @Nullable g gVar, int i9) {
        boolean z9 = gVar != null;
        setChildrenDrawingOrderEnabled(z9);
        if (z9) {
            this.mDrawingOrder = z8 ? 2 : 1;
            this.mPageTransformerLayerType = i9;
        } else {
            this.mDrawingOrder = 0;
        }
        if (z9) {
            populate();
        }
    }

    public void smoothScrollTo(int i9, int i10, int i11) {
        int scrollX;
        int abs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.mScroller;
        if (scroller != null && !scroller.isFinished()) {
            scrollX = this.mIsScrollStarted ? this.mScroller.getCurrX() : this.mScroller.getStartX();
            this.mScroller.abortAnimation();
            setScrollingCacheEnabled(false);
        } else {
            scrollX = getScrollX();
        }
        int i12 = scrollX;
        int scrollY = getScrollY();
        int i13 = i9 - i12;
        int i14 = i10 - scrollY;
        if (i13 == 0 && i14 == 0) {
            completeScroll(false);
            populate();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i15 = clientWidth / 2;
        float f9 = clientWidth;
        float f10 = i15;
        float distanceInfluenceForSnapDuration = (distanceInfluenceForSnapDuration(Math.min(1.0f, (Math.abs(i13) * 1.0f) / f9)) * f10) + f10;
        int abs2 = Math.abs(i11);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(distanceInfluenceForSnapDuration / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i13) / ((this.mAdapter.getPageWidth(this.mCurItem) * f9) + this.mPageMargin)) + 1.0f) * 100.0f);
        }
        int min = Math.min(abs, 600);
        this.mIsScrollStarted = false;
        this.mScroller.startScroll(i12, scrollY, i13, i14, min);
        ViewCompat.postInvalidateOnAnimation(this);
    }

    public void setCurrentItem(int i9, boolean z8) {
        this.mPopulatePending = false;
        setCurrentItemInternal(i9, z8, false);
    }

    public void setPageMarginDrawable(int i9) {
        setPageMarginDrawable(I.h.getDrawable(getContext(), i9));
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [androidx.viewpager.widget.b, java.lang.Object] */
    public ViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mItems = new ArrayList<>();
        this.mTempItem = new Object();
        this.mTempRect = new Rect();
        this.mRestoredCurItem = -1;
        this.mRestoredAdapterState = null;
        this.mRestoredClassLoader = null;
        this.mFirstOffset = -3.4028235E38f;
        this.mLastOffset = Float.MAX_VALUE;
        this.mOffscreenPageLimit = 1;
        this.mActivePointerId = -1;
        this.mFirstLayout = true;
        this.mNeedCalculatePageOffsets = false;
        this.mEndScrollRunnable = new k(this, 9);
        this.mScrollState = 0;
        initViewPager();
    }
}
