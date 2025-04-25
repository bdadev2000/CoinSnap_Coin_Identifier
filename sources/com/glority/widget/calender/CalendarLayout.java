package com.glority.widget.calender;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.widget.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes12.dex */
public class CalendarLayout extends LinearLayout {
    private static final int ACTIVE_POINTER = 1;
    private static final int CALENDAR_SHOW_MODE_BOTH_MONTH_WEEK_VIEW = 0;
    private static final int CALENDAR_SHOW_MODE_ONLY_MONTH_VIEW = 2;
    private static final int CALENDAR_SHOW_MODE_ONLY_WEEK_VIEW = 1;
    private static final int GESTURE_MODE_DEFAULT = 0;
    private static final int GESTURE_MODE_DISABLED = 2;
    private static final int INVALID_POINTER = -1;
    private static final int STATUS_EXPAND = 0;
    private static final int STATUS_SHRINK = 1;
    private float downY;
    private boolean isAnimating;
    private boolean isWeekView;
    private int mActivePointerId;
    private int mCalendarShowMode;
    CalendarView mCalendarView;
    ViewGroup mContentView;
    private int mContentViewId;
    private int mContentViewTranslateY;
    private int mDefaultStatus;
    private CalendarViewDelegate mDelegate;
    private int mGestureMode;
    private int mItemHeight;
    private float mLastX;
    private float mLastY;
    private int mMaximumVelocity;
    MonthViewPager mMonthView;
    private VelocityTracker mVelocityTracker;
    private int mViewPagerTranslateY;

    /* loaded from: classes12.dex */
    public interface CalendarScrollView {
        boolean isScrollToTop();
    }

    public CalendarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mViewPagerTranslateY = 0;
        this.isAnimating = false;
        setOrientation(1);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CalendarLayout);
        this.mContentViewId = obtainStyledAttributes.getResourceId(R.styleable.CalendarLayout_calendar_content_view_id, 0);
        this.mDefaultStatus = obtainStyledAttributes.getInt(R.styleable.CalendarLayout_default_status, 0);
        this.mCalendarShowMode = obtainStyledAttributes.getInt(R.styleable.CalendarLayout_calendar_show_mode, 0);
        this.mGestureMode = obtainStyledAttributes.getInt(R.styleable.CalendarLayout_gesture_mode, 0);
        obtainStyledAttributes.recycle();
        this.mVelocityTracker = VelocityTracker.obtain();
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        this.mMaximumVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setup(CalendarViewDelegate calendarViewDelegate) {
        Calendar createCurrentDate;
        this.mDelegate = calendarViewDelegate;
        this.mItemHeight = calendarViewDelegate.getCalendarItemHeight();
        if (calendarViewDelegate.mSelectedCalendar.isAvailable()) {
            createCurrentDate = calendarViewDelegate.mSelectedCalendar;
        } else {
            createCurrentDate = calendarViewDelegate.createCurrentDate();
        }
        initCalendarPosition(createCurrentDate);
        updateContentViewTranslateY();
    }

    private void initCalendarPosition(Calendar calendar) {
        updateSelectPosition((CalendarUtil.getMonthViewStartDiff(calendar, this.mDelegate.getWeekStart()) + calendar.getDay()) - 1);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateSelectPosition(int i) {
        this.mViewPagerTranslateY = (((i + 7) / 7) - 1) * this.mItemHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateSelectWeek(int i) {
        this.mViewPagerTranslateY = (i - 1) * this.mItemHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateContentViewTranslateY() {
        Calendar calendar = this.mDelegate.mIndexCalendar;
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mContentViewTranslateY = this.mItemHeight * 5;
        } else {
            this.mContentViewTranslateY = CalendarUtil.getMonthViewHeight(calendar.getYear(), calendar.getMonth(), this.mItemHeight, this.mDelegate.getWeekStart()) - this.mItemHeight;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateCalendarItemHeight() {
        this.mItemHeight = this.mDelegate.getCalendarItemHeight();
        if (this.mContentView == null) {
            return;
        }
        Calendar calendar = this.mDelegate.mIndexCalendar;
        updateSelectWeek(CalendarUtil.getWeekFromDayInMonth(calendar, this.mDelegate.getWeekStart()));
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mContentViewTranslateY = this.mItemHeight * 5;
        } else {
            this.mContentViewTranslateY = CalendarUtil.getMonthViewHeight(calendar.getYear(), calendar.getMonth(), this.mItemHeight, this.mDelegate.getWeekStart()) - this.mItemHeight;
        }
        translationViewPager();
    }

    public void hideCalendarView() {
        CalendarView calendarView = this.mCalendarView;
        if (calendarView == null) {
            return;
        }
        calendarView.setVisibility(8);
        if (!isExpand()) {
            expand(0);
        }
        requestLayout();
    }

    public void showCalendarView() {
        this.mCalendarView.setVisibility(0);
        requestLayout();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0042, code lost:
    
        if (r0 != 6) goto L83;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.calender.CalendarLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.isAnimating) {
            return super.dispatchTouchEvent(motionEvent);
        }
        if (this.mGestureMode == 2) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int i = this.mCalendarShowMode;
        if (i == 2 || i == 1) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        if (action == 2 && y - this.mLastY > 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY) && isScrollTop()) {
            requestDisallowInterceptTouchEvent(false);
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int i;
        if (this.isAnimating) {
            return true;
        }
        if (this.mGestureMode == 2 || (i = this.mCalendarShowMode) == 2 || i == 1) {
            return false;
        }
        int action = motionEvent.getAction();
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        if (action == 0) {
            this.mActivePointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.downY = y;
            this.mLastY = y;
            this.mLastX = x;
        } else if (action == 2) {
            float f = y - this.mLastY;
            float f2 = x - this.mLastX;
            if (f < 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY)) {
                return false;
            }
            if (f > 0.0f && this.mContentView.getTranslationY() == (-this.mContentViewTranslateY) && y >= this.mDelegate.getCalendarItemHeight() && !isScrollTop()) {
                return false;
            }
            if (f > 0.0f && this.mContentView.getTranslationY() == 0.0f && y >= CalendarUtil.dipToPx(getContext(), 98.0f)) {
                return false;
            }
            if (Math.abs(f) > Math.abs(f2) && ((f > 0.0f && this.mContentView.getTranslationY() <= 0.0f) || (f < 0.0f && this.mContentView.getTranslationY() >= (-this.mContentViewTranslateY)))) {
                this.mLastY = y;
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    private int getPointerIndex(MotionEvent motionEvent, int i) {
        int findPointerIndex = motionEvent.findPointerIndex(i);
        if (findPointerIndex == -1) {
            this.mActivePointerId = -1;
        }
        return findPointerIndex;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mContentView == null || this.mCalendarView == null) {
            super.onMeasure(i, i2);
            return;
        }
        int year = this.mDelegate.mIndexCalendar.getYear();
        int month = this.mDelegate.mIndexCalendar.getMonth();
        int dipToPx = CalendarUtil.dipToPx(getContext(), 1.0f);
        int monthViewHeight = CalendarUtil.getMonthViewHeight(year, month, this.mDelegate.getCalendarItemHeight(), this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode()) + dipToPx;
        int size = View.MeasureSpec.getSize(i2);
        if (this.mDelegate.isFullScreenCalendar()) {
            super.onMeasure(i, i2);
            this.mContentView.measure(i, View.MeasureSpec.makeMeasureSpec((size - dipToPx) - this.mDelegate.getCalendarItemHeight(), 1073741824));
            ViewGroup viewGroup = this.mContentView;
            viewGroup.layout(viewGroup.getLeft(), this.mContentView.getTop(), this.mContentView.getRight(), this.mContentView.getBottom());
            return;
        }
        if (monthViewHeight >= size && this.mMonthView.getHeight() > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(monthViewHeight + dipToPx, 1073741824);
            size = monthViewHeight;
        } else if (monthViewHeight < size && this.mMonthView.getHeight() > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
        }
        if (this.mCalendarShowMode == 2 || this.mCalendarView.getVisibility() == 8) {
            monthViewHeight = this.mCalendarView.getVisibility() == 8 ? 0 : this.mCalendarView.getHeight();
        } else if (this.mGestureMode == 2 && !this.isAnimating) {
            if (!isExpand()) {
                size -= dipToPx;
                monthViewHeight = this.mItemHeight;
            }
        } else {
            size -= dipToPx;
            monthViewHeight = this.mItemHeight;
        }
        super.onMeasure(i, i2);
        this.mContentView.measure(i, View.MeasureSpec.makeMeasureSpec(size - monthViewHeight, 1073741824));
        ViewGroup viewGroup2 = this.mContentView;
        viewGroup2.layout(viewGroup2.getLeft(), this.mContentView.getTop(), this.mContentView.getRight(), this.mContentView.getBottom());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.mMonthView = (MonthViewPager) findViewById(R.id.vp_month);
        if (getChildCount() > 0) {
            this.mCalendarView = (CalendarView) getChildAt(0);
        }
        this.mContentView = (ViewGroup) findViewById(this.mContentViewId);
    }

    private void translationViewPager() {
        this.mMonthView.setTranslationY(this.mViewPagerTranslateY * ((this.mContentView.getTranslationY() * 1.0f) / this.mContentViewTranslateY));
    }

    public void setModeBothMonthWeekView() {
        this.mCalendarShowMode = 0;
        requestLayout();
    }

    public void setModeOnlyWeekView() {
        this.mCalendarShowMode = 1;
        requestLayout();
    }

    public void setModeOnlyMonthView() {
        this.mCalendarShowMode = 2;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putBoolean("isExpand", isExpand());
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        if (bundle.getBoolean("isExpand")) {
            post(new Runnable() { // from class: com.glority.widget.calender.CalendarLayout.1
                @Override // java.lang.Runnable
                public void run() {
                    CalendarLayout.this.expand(0);
                }
            });
        } else {
            post(new Runnable() { // from class: com.glority.widget.calender.CalendarLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    CalendarLayout.this.shrink(0);
                }
            });
        }
        super.onRestoreInstanceState(parcelable2);
    }

    public final boolean isExpand() {
        return this.mMonthView.getVisibility() == 0;
    }

    public boolean expand() {
        return expand(PsExtractor.VIDEO_STREAM_MASK);
    }

    public boolean expand(int i) {
        if (this.isAnimating || this.mCalendarShowMode == 1 || this.mContentView == null) {
            return false;
        }
        if (this.mMonthView.getVisibility() != 0) {
            onShowMonthView();
            this.isWeekView = false;
            this.mMonthView.setVisibility(0);
        }
        ViewGroup viewGroup = this.mContentView;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), 0.0f);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.widget.calender.CalendarLayout.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CalendarLayout.this.mMonthView.setTranslationY(CalendarLayout.this.mViewPagerTranslateY * ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.mContentViewTranslateY));
                CalendarLayout.this.isAnimating = true;
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.glority.widget.calender.CalendarLayout.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarLayout.this.isAnimating = false;
                if (CalendarLayout.this.mGestureMode == 2) {
                    CalendarLayout.this.requestLayout();
                }
                CalendarLayout.this.hideWeek(true);
                if (CalendarLayout.this.mDelegate.mViewChangeListener != null && CalendarLayout.this.isWeekView) {
                    CalendarLayout.this.mDelegate.mViewChangeListener.onViewChange(true);
                }
                CalendarLayout.this.isWeekView = false;
            }
        });
        ofFloat.start();
        return true;
    }

    public boolean shrink() {
        return shrink(PsExtractor.VIDEO_STREAM_MASK);
    }

    public boolean shrink(int i) {
        ViewGroup viewGroup;
        if (this.mGestureMode == 2) {
            requestLayout();
        }
        if (this.isAnimating || (viewGroup = this.mContentView) == null) {
            return false;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(viewGroup, "translationY", viewGroup.getTranslationY(), -this.mContentViewTranslateY);
        ofFloat.setDuration(i);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.widget.calender.CalendarLayout.5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                CalendarLayout.this.mMonthView.setTranslationY(CalendarLayout.this.mViewPagerTranslateY * ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.mContentViewTranslateY));
                CalendarLayout.this.isAnimating = true;
            }
        });
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.glority.widget.calender.CalendarLayout.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarLayout.this.isAnimating = false;
                CalendarLayout.this.isWeekView = true;
            }
        });
        ofFloat.start();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void initStatus() {
        if ((this.mDefaultStatus == 1 || this.mCalendarShowMode == 1) && this.mCalendarShowMode != 2) {
            if (this.mContentView == null) {
                this.mMonthView.setVisibility(8);
                return;
            } else {
                post(new Runnable() { // from class: com.glority.widget.calender.CalendarLayout.7
                    @Override // java.lang.Runnable
                    public void run() {
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(CalendarLayout.this.mContentView, "translationY", CalendarLayout.this.mContentView.getTranslationY(), -CalendarLayout.this.mContentViewTranslateY);
                        ofFloat.setDuration(0L);
                        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.glority.widget.calender.CalendarLayout.7.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                                CalendarLayout.this.mMonthView.setTranslationY(CalendarLayout.this.mViewPagerTranslateY * ((((Float) valueAnimator.getAnimatedValue()).floatValue() * 1.0f) / CalendarLayout.this.mContentViewTranslateY));
                                CalendarLayout.this.isAnimating = true;
                            }
                        });
                        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.glority.widget.calender.CalendarLayout.7.2
                            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                            public void onAnimationEnd(Animator animator) {
                                super.onAnimationEnd(animator);
                                CalendarLayout.this.isAnimating = false;
                                CalendarLayout.this.isWeekView = true;
                                if (CalendarLayout.this.mDelegate == null || CalendarLayout.this.mDelegate.mViewChangeListener == null) {
                                    return;
                                }
                                CalendarLayout.this.mDelegate.mViewChangeListener.onViewChange(false);
                            }
                        });
                        ofFloat.start();
                    }
                });
                return;
            }
        }
        if (this.mDelegate.mViewChangeListener == null) {
            return;
        }
        post(new Runnable() { // from class: com.glority.widget.calender.CalendarLayout.8
            @Override // java.lang.Runnable
            public void run() {
                CalendarLayout.this.mDelegate.mViewChangeListener.onViewChange(true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideWeek(boolean z) {
        if (z) {
            onShowMonthView();
        }
        this.mMonthView.setVisibility(0);
    }

    private void onShowMonthView() {
        CalendarViewDelegate calendarViewDelegate;
        if (this.mMonthView.getVisibility() == 0 || (calendarViewDelegate = this.mDelegate) == null || calendarViewDelegate.mViewChangeListener == null || !this.isWeekView) {
            return;
        }
        this.mDelegate.mViewChangeListener.onViewChange(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected boolean isScrollTop() {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup instanceof CalendarScrollView) {
            return ((CalendarScrollView) viewGroup).isScrollToTop();
        }
        if (viewGroup instanceof RecyclerView) {
            return ((RecyclerView) viewGroup).computeVerticalScrollOffset() == 0;
        }
        if (!(viewGroup instanceof AbsListView)) {
            return viewGroup.getScrollY() == 0;
        }
        AbsListView absListView = (AbsListView) viewGroup;
        if (absListView.getFirstVisiblePosition() == 0) {
            return absListView.getChildAt(0).getTop() == 0;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void hideContentView() {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.animate().translationY(getHeight() - this.mMonthView.getHeight()).setDuration(220L).setInterpolator(new LinearInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.glority.widget.calender.CalendarLayout.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                CalendarLayout.this.mContentView.setVisibility(4);
                CalendarLayout.this.mContentView.clearAnimation();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void showContentView() {
        ViewGroup viewGroup = this.mContentView;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setTranslationY(getHeight() - this.mMonthView.getHeight());
        this.mContentView.setVisibility(0);
        this.mContentView.animate().translationY(0.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.glority.widget.calender.CalendarLayout.10
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
    }

    private int getCalendarViewHeight() {
        return this.mMonthView.getVisibility() == 0 ? this.mMonthView.getHeight() : this.mDelegate.getCalendarItemHeight();
    }
}
