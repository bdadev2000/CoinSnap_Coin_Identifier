package com.glority.widget.calender;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import com.glority.widget.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class CalendarView extends FrameLayout {
    private final CalendarViewDelegate mDelegate;
    private MonthViewPager mMonthPager;
    CalendarLayout mParentLayout;

    /* loaded from: classes12.dex */
    public interface OnCalendarInterceptListener {
        boolean onCalendarIntercept(Calendar calendar);

        void onCalendarInterceptClick(Calendar calendar, boolean z);
    }

    /* loaded from: classes12.dex */
    public interface OnCalendarLongClickListener {
        void onCalendarLongClick(Calendar calendar);

        void onCalendarLongClickOutOfRange(Calendar calendar);
    }

    /* loaded from: classes12.dex */
    public interface OnCalendarMultiSelectListener {
        void onCalendarMultiSelect(Calendar calendar, int i, int i2);

        void onCalendarMultiSelectOutOfRange(Calendar calendar);

        void onMultiSelectOutOfSize(Calendar calendar, int i);
    }

    /* loaded from: classes12.dex */
    public interface OnCalendarRangeSelectListener {
        void onCalendarRangeSelect(Calendar calendar, boolean z);

        void onCalendarSelectOutOfRange(Calendar calendar);

        void onSelectOutOfRange(Calendar calendar, boolean z);
    }

    /* loaded from: classes12.dex */
    public interface OnCalendarSelectListener {
        void onCalendarOutOfRange(Calendar calendar);

        void onCalendarSelect(Calendar calendar, boolean z);
    }

    /* loaded from: classes12.dex */
    public interface OnClickCalendarPaddingListener {
        void onClickCalendarPadding(float f, float f2, boolean z, Calendar calendar, Object obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes12.dex */
    public interface OnInnerDateSelectedListener {
        void onMonthDateSelected(Calendar calendar, boolean z);

        void onWeekDateSelected(Calendar calendar, boolean z);
    }

    /* loaded from: classes12.dex */
    public interface OnMonthChangeListener {
        void onMonthChange(int i, int i2);
    }

    /* loaded from: classes12.dex */
    public interface OnViewChangeListener {
        void onViewChange(boolean z);
    }

    /* loaded from: classes12.dex */
    public interface OnWeekChangeListener {
        void onWeekChange(List<Calendar> list);
    }

    /* loaded from: classes12.dex */
    public interface OnYearChangeListener {
        void onYearChange(int i);
    }

    /* loaded from: classes12.dex */
    public interface OnYearViewChangeListener {
        void onYearViewChange(boolean z);
    }

    public CalendarView(Context context) {
        this(context, null);
    }

    public CalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mDelegate = new CalendarViewDelegate(context, attributeSet);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.cv_layout_calendar_view, (ViewGroup) this, true);
        MonthViewPager monthViewPager = (MonthViewPager) findViewById(R.id.vp_month);
        this.mMonthPager = monthViewPager;
        ((FrameLayout.LayoutParams) monthViewPager.getLayoutParams()).setMargins(0, CalendarUtil.dipToPx(context, 1.0f), 0, 0);
        this.mDelegate.mInnerListener = new OnInnerDateSelectedListener() { // from class: com.glority.widget.calender.CalendarView.1
            @Override // com.glority.widget.calender.CalendarView.OnInnerDateSelectedListener
            public void onMonthDateSelected(Calendar calendar, boolean z) {
                if (calendar.getYear() == CalendarView.this.mDelegate.getCurrentDay().getYear() && calendar.getMonth() == CalendarView.this.mDelegate.getCurrentDay().getMonth() && CalendarView.this.mMonthPager.getCurrentItem() != CalendarView.this.mDelegate.mCurrentMonthViewItem) {
                    return;
                }
                CalendarView.this.mDelegate.mIndexCalendar = calendar;
                if (CalendarView.this.mDelegate.getSelectMode() == 0 || z) {
                    CalendarView.this.mDelegate.mSelectedCalendar = calendar;
                }
                CalendarView.this.mMonthPager.updateSelected();
            }

            @Override // com.glority.widget.calender.CalendarView.OnInnerDateSelectedListener
            public void onWeekDateSelected(Calendar calendar, boolean z) {
                CalendarView.this.mDelegate.mIndexCalendar = calendar;
                if (CalendarView.this.mDelegate.getSelectMode() == 0 || z || CalendarView.this.mDelegate.mIndexCalendar.equals(CalendarView.this.mDelegate.mSelectedCalendar)) {
                    CalendarView.this.mDelegate.mSelectedCalendar = calendar;
                }
                CalendarView.this.mMonthPager.setCurrentItem((((calendar.getYear() - CalendarView.this.mDelegate.getMinYear()) * 12) + CalendarView.this.mDelegate.mIndexCalendar.getMonth()) - CalendarView.this.mDelegate.getMinYearMonth(), false);
                CalendarView.this.mMonthPager.updateSelected();
            }
        };
        if (this.mDelegate.getSelectMode() == 0) {
            if (isInRange(this.mDelegate.getCurrentDay())) {
                CalendarViewDelegate calendarViewDelegate = this.mDelegate;
                calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.createCurrentDate();
            } else {
                CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
                calendarViewDelegate2.mSelectedCalendar = calendarViewDelegate2.getMinRangeCalendar();
            }
        } else {
            this.mDelegate.mSelectedCalendar = new Calendar();
        }
        CalendarViewDelegate calendarViewDelegate3 = this.mDelegate;
        calendarViewDelegate3.mIndexCalendar = calendarViewDelegate3.mSelectedCalendar;
        this.mMonthPager.setup(this.mDelegate);
        this.mMonthPager.setCurrentItem(this.mDelegate.mCurrentMonthViewItem);
    }

    public void setRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (CalendarUtil.compareTo(i, i2, i3, i4, i5, i6) > 0) {
            return;
        }
        this.mDelegate.setRange(i, i2, i3, i4, i5, i6);
        this.mMonthPager.notifyDataSetChanged();
        if (!isInRange(this.mDelegate.mSelectedCalendar)) {
            CalendarViewDelegate calendarViewDelegate = this.mDelegate;
            calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.getMinRangeCalendar();
            this.mDelegate.updateSelectCalendarScheme();
            CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
            calendarViewDelegate2.mIndexCalendar = calendarViewDelegate2.mSelectedCalendar;
        }
        this.mMonthPager.updateRange();
    }

    public int getCurDay() {
        return this.mDelegate.getCurrentDay().getDay();
    }

    public int getCurMonth() {
        return this.mDelegate.getCurrentDay().getMonth();
    }

    public int getCurYear() {
        return this.mDelegate.getCurrentDay().getYear();
    }

    public void showYearSelectLayout(int i) {
        showSelectLayout(i);
    }

    private void showSelectLayout(int i) {
        CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout != null && calendarLayout.mContentView != null && !this.mParentLayout.isExpand()) {
            this.mParentLayout.expand();
        }
        CalendarLayout calendarLayout2 = this.mParentLayout;
        if (calendarLayout2 != null) {
            calendarLayout2.hideContentView();
        }
        this.mMonthPager.animate().scaleX(0.0f).scaleY(0.0f).setDuration(260L).setInterpolator(new LinearInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.glority.widget.calender.CalendarView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
    }

    public void closeYearSelectLayout() {
        closeSelectLayout((((this.mDelegate.mSelectedCalendar.getYear() - this.mDelegate.getMinYear()) * 12) + this.mDelegate.mSelectedCalendar.getMonth()) - this.mDelegate.getMinYearMonth());
    }

    private void closeSelectLayout(int i) {
        if (i == this.mMonthPager.getCurrentItem()) {
            if (this.mDelegate.mCalendarSelectListener != null && this.mDelegate.getSelectMode() != 1) {
                this.mDelegate.mCalendarSelectListener.onCalendarSelect(this.mDelegate.mSelectedCalendar, false);
            }
        } else {
            this.mMonthPager.setCurrentItem(i, false);
        }
        this.mMonthPager.animate().scaleX(1.0f).scaleY(1.0f).setDuration(180L).setInterpolator(new LinearInterpolator()).setListener(new AnimatorListenerAdapter() { // from class: com.glority.widget.calender.CalendarView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                if (CalendarView.this.mParentLayout == null) {
                    CalendarView.this.mMonthPager.setVisibility(0);
                } else {
                    CalendarView.this.mParentLayout.showContentView();
                    if (CalendarView.this.mParentLayout.isExpand()) {
                        CalendarView.this.mMonthPager.setVisibility(0);
                    } else {
                        CalendarView.this.mParentLayout.shrink();
                    }
                }
                CalendarView.this.mMonthPager.clearAnimation();
            }
        });
    }

    public void scrollToCurrent() {
        scrollToCurrent(false);
    }

    public void scrollToCurrent(boolean z) {
        if (isInRange(this.mDelegate.getCurrentDay())) {
            Calendar createCurrentDate = this.mDelegate.createCurrentDate();
            if (this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(createCurrentDate)) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(createCurrentDate, false);
                return;
            }
            CalendarViewDelegate calendarViewDelegate = this.mDelegate;
            calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.createCurrentDate();
            CalendarViewDelegate calendarViewDelegate2 = this.mDelegate;
            calendarViewDelegate2.mIndexCalendar = calendarViewDelegate2.mSelectedCalendar;
            this.mDelegate.updateSelectCalendarScheme();
            if (this.mMonthPager.getVisibility() == 0) {
                this.mMonthPager.scrollToCurrent(z);
            }
        }
    }

    public void scrollToNext() {
        scrollToNext(false);
    }

    public void scrollToNext(boolean z) {
        MonthViewPager monthViewPager = this.mMonthPager;
        monthViewPager.setCurrentItem(monthViewPager.getCurrentItem() + 1, z);
    }

    public void scrollToPre() {
        scrollToPre(false);
    }

    public void scrollToPre(boolean z) {
        this.mMonthPager.setCurrentItem(r0.getCurrentItem() - 1, z);
    }

    public void scrollToSelectCalendar() {
        if (this.mDelegate.mSelectedCalendar.isAvailable()) {
            scrollToCalendar(this.mDelegate.mSelectedCalendar.getYear(), this.mDelegate.mSelectedCalendar.getMonth(), this.mDelegate.mSelectedCalendar.getDay(), false, true);
        }
    }

    public void scrollToCalendar(int i, int i2, int i3) {
        scrollToCalendar(i, i2, i3, false, true);
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z) {
        scrollToCalendar(i, i2, i3, z, true);
    }

    public void scrollToCalendar(int i, int i2, int i3, boolean z, boolean z2) {
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        if (calendar.isAvailable() && isInRange(calendar)) {
            if (this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(calendar)) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
            } else {
                this.mMonthPager.scrollToCalendar(i, i2, i3, z, z2);
            }
        }
    }

    public final void setMonthViewScrollable(boolean z) {
        this.mDelegate.setMonthViewScrollable(z);
    }

    public final void setWeekViewScrollable(boolean z) {
        this.mDelegate.setWeekViewScrollable(z);
    }

    public final void setYearViewScrollable(boolean z) {
        this.mDelegate.setYearViewScrollable(z);
    }

    public final void setDefaultMonthViewSelectDay() {
        this.mDelegate.setDefaultCalendarSelectDay(0);
    }

    public final void setLastMonthViewSelectDay() {
        this.mDelegate.setDefaultCalendarSelectDay(1);
    }

    public final void setLastMonthViewSelectDayIgnoreCurrent() {
        this.mDelegate.setDefaultCalendarSelectDay(2);
    }

    public final void clearSelectRange() {
        this.mDelegate.clearSelectRange();
        this.mMonthPager.clearSelectRange();
    }

    public final void clearSingleSelect() {
        this.mDelegate.mSelectedCalendar = new Calendar();
        this.mMonthPager.clearSingleSelect();
    }

    public final void clearMultiSelect() {
        this.mDelegate.mSelectedCalendars.clear();
        this.mMonthPager.clearMultiSelect();
    }

    public final void putMultiSelect(Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (Calendar calendar : calendarArr) {
            if (calendar != null && !this.mDelegate.mSelectedCalendars.containsKey(calendar.toString())) {
                this.mDelegate.mSelectedCalendars.put(calendar.toString(), calendar);
            }
        }
        update();
    }

    public final void removeMultiSelect(Calendar... calendarArr) {
        if (calendarArr == null || calendarArr.length == 0) {
            return;
        }
        for (Calendar calendar : calendarArr) {
            if (calendar != null && this.mDelegate.mSelectedCalendars.containsKey(calendar.toString())) {
                this.mDelegate.mSelectedCalendars.remove(calendar.toString());
            }
        }
        update();
    }

    public final List<Calendar> getMultiSelectCalendars() {
        ArrayList arrayList = new ArrayList();
        if (this.mDelegate.mSelectedCalendars.size() == 0) {
            return arrayList;
        }
        arrayList.addAll(this.mDelegate.mSelectedCalendars.values());
        Collections.sort(arrayList);
        return arrayList;
    }

    public final List<Calendar> getSelectCalendarRange() {
        return this.mDelegate.getSelectCalendarRange();
    }

    public final void setCalendarItemHeight(int i) {
        if (this.mDelegate.getCalendarItemHeight() == i) {
            return;
        }
        this.mDelegate.setCalendarItemHeight(i);
        this.mMonthPager.updateItemHeight();
        CalendarLayout calendarLayout = this.mParentLayout;
        if (calendarLayout == null) {
            return;
        }
        calendarLayout.updateCalendarItemHeight();
    }

    public final void setMonthView(Class<?> cls) {
        if (cls == null || this.mDelegate.getMonthViewClass().equals(cls)) {
            return;
        }
        this.mDelegate.setMonthViewClass(cls);
        this.mMonthPager.updateMonthViewClass();
    }

    public final void setOnCalendarInterceptListener(OnCalendarInterceptListener onCalendarInterceptListener) {
        if (onCalendarInterceptListener == null) {
            this.mDelegate.mCalendarInterceptListener = null;
        }
        if (onCalendarInterceptListener == null || this.mDelegate.getSelectMode() == 0) {
            return;
        }
        this.mDelegate.mCalendarInterceptListener = onCalendarInterceptListener;
        if (onCalendarInterceptListener.onCalendarIntercept(this.mDelegate.mSelectedCalendar)) {
            this.mDelegate.mSelectedCalendar = new Calendar();
        }
    }

    public final void setOnClickCalendarPaddingListener(OnClickCalendarPaddingListener onClickCalendarPaddingListener) {
        if (onClickCalendarPaddingListener == null) {
            this.mDelegate.mClickCalendarPaddingListener = null;
        }
        if (onClickCalendarPaddingListener == null) {
            return;
        }
        this.mDelegate.mClickCalendarPaddingListener = onClickCalendarPaddingListener;
    }

    public void setOnYearChangeListener(OnYearChangeListener onYearChangeListener) {
        this.mDelegate.mYearChangeListener = onYearChangeListener;
    }

    public void setOnMonthChangeListener(OnMonthChangeListener onMonthChangeListener) {
        this.mDelegate.mMonthChangeListener = onMonthChangeListener;
    }

    public void setOnCalendarSelectListener(OnCalendarSelectListener onCalendarSelectListener) {
        this.mDelegate.mCalendarSelectListener = onCalendarSelectListener;
        if (this.mDelegate.mCalendarSelectListener != null && this.mDelegate.getSelectMode() == 0 && isInRange(this.mDelegate.mSelectedCalendar)) {
            this.mDelegate.updateSelectCalendarScheme();
        }
    }

    public final void setOnCalendarRangeSelectListener(OnCalendarRangeSelectListener onCalendarRangeSelectListener) {
        this.mDelegate.mCalendarRangeSelectListener = onCalendarRangeSelectListener;
    }

    public final void setOnCalendarMultiSelectListener(OnCalendarMultiSelectListener onCalendarMultiSelectListener) {
        this.mDelegate.mCalendarMultiSelectListener = onCalendarMultiSelectListener;
    }

    public final void setSelectRange(int i, int i2) {
        if (i > i2) {
            return;
        }
        this.mDelegate.setSelectRange(i, i2);
    }

    public final void setSelectStartCalendar(int i, int i2, int i3) {
        if (this.mDelegate.getSelectMode() != 2) {
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        setSelectStartCalendar(calendar);
    }

    public final void setSelectStartCalendar(Calendar calendar) {
        if (this.mDelegate.getSelectMode() == 2 && calendar != null) {
            if (!isInRange(calendar)) {
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(calendar, true);
                }
            } else if (onCalendarIntercept(calendar)) {
                if (this.mDelegate.mCalendarInterceptListener != null) {
                    this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
                }
            } else {
                this.mDelegate.mSelectedEndRangeCalendar = null;
                this.mDelegate.mSelectedStartRangeCalendar = calendar;
                scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
            }
        }
    }

    public final void setSelectEndCalendar(int i, int i2, int i3) {
        if (this.mDelegate.getSelectMode() == 2 && this.mDelegate.mSelectedStartRangeCalendar != null) {
            Calendar calendar = new Calendar();
            calendar.setYear(i);
            calendar.setMonth(i2);
            calendar.setDay(i3);
            setSelectEndCalendar(calendar);
        }
    }

    public final void setSelectEndCalendar(Calendar calendar) {
        if (this.mDelegate.getSelectMode() == 2 && this.mDelegate.mSelectedStartRangeCalendar != null) {
            setSelectCalendarRange(this.mDelegate.mSelectedStartRangeCalendar, calendar);
        }
    }

    public final void setSelectCalendarRange(int i, int i2, int i3, int i4, int i5, int i6) {
        if (this.mDelegate.getSelectMode() != 2) {
            return;
        }
        Calendar calendar = new Calendar();
        calendar.setYear(i);
        calendar.setMonth(i2);
        calendar.setDay(i3);
        Calendar calendar2 = new Calendar();
        calendar2.setYear(i4);
        calendar2.setMonth(i5);
        calendar2.setDay(i6);
        setSelectCalendarRange(calendar, calendar2);
    }

    public final void setSelectCalendarRange(Calendar calendar, Calendar calendar2) {
        if (this.mDelegate.getSelectMode() != 2 || calendar == null || calendar2 == null) {
            return;
        }
        if (onCalendarIntercept(calendar)) {
            if (this.mDelegate.mCalendarInterceptListener != null) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar, false);
                return;
            }
            return;
        }
        if (onCalendarIntercept(calendar2)) {
            if (this.mDelegate.mCalendarInterceptListener != null) {
                this.mDelegate.mCalendarInterceptListener.onCalendarInterceptClick(calendar2, false);
                return;
            }
            return;
        }
        int differ = calendar2.differ(calendar);
        if (differ >= 0 && isInRange(calendar) && isInRange(calendar2)) {
            if (this.mDelegate.getMinSelectRange() != -1 && this.mDelegate.getMinSelectRange() > differ + 1) {
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(calendar2, true);
                    return;
                }
                return;
            }
            if (this.mDelegate.getMaxSelectRange() != -1 && this.mDelegate.getMaxSelectRange() < differ + 1) {
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onSelectOutOfRange(calendar2, false);
                }
            } else {
                if (this.mDelegate.getMinSelectRange() == -1 && differ == 0) {
                    this.mDelegate.mSelectedStartRangeCalendar = calendar;
                    this.mDelegate.mSelectedEndRangeCalendar = null;
                    if (this.mDelegate.mCalendarRangeSelectListener != null) {
                        this.mDelegate.mCalendarRangeSelectListener.onCalendarRangeSelect(calendar, false);
                    }
                    scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
                    return;
                }
                this.mDelegate.mSelectedStartRangeCalendar = calendar;
                this.mDelegate.mSelectedEndRangeCalendar = calendar2;
                if (this.mDelegate.mCalendarRangeSelectListener != null) {
                    this.mDelegate.mCalendarRangeSelectListener.onCalendarRangeSelect(calendar, false);
                    this.mDelegate.mCalendarRangeSelectListener.onCalendarRangeSelect(calendar2, true);
                }
                scrollToCalendar(calendar.getYear(), calendar.getMonth(), calendar.getDay());
            }
        }
    }

    protected final boolean onCalendarIntercept(Calendar calendar) {
        return this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(calendar);
    }

    public final int getMaxMultiSelectSize() {
        return this.mDelegate.getMaxMultiSelectSize();
    }

    public final void setMaxMultiSelectSize(int i) {
        this.mDelegate.setMaxMultiSelectSize(i);
    }

    public final int getMinSelectRange() {
        return this.mDelegate.getMinSelectRange();
    }

    public final int getMaxSelectRange() {
        return this.mDelegate.getMaxSelectRange();
    }

    public void setOnCalendarLongClickListener(OnCalendarLongClickListener onCalendarLongClickListener) {
        this.mDelegate.mCalendarLongClickListener = onCalendarLongClickListener;
    }

    public void setOnCalendarLongClickListener(OnCalendarLongClickListener onCalendarLongClickListener, boolean z) {
        this.mDelegate.mCalendarLongClickListener = onCalendarLongClickListener;
        this.mDelegate.setPreventLongPressedSelected(z);
    }

    public void setOnViewChangeListener(OnViewChangeListener onViewChangeListener) {
        this.mDelegate.mViewChangeListener = onViewChangeListener;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        if (this.mDelegate == null) {
            return super.onSaveInstanceState();
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("super", super.onSaveInstanceState());
        bundle.putSerializable("selected_calendar", this.mDelegate.mSelectedCalendar);
        bundle.putSerializable("index_calendar", this.mDelegate.mIndexCalendar);
        return bundle;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Bundle bundle = (Bundle) parcelable;
        Parcelable parcelable2 = bundle.getParcelable("super");
        this.mDelegate.mSelectedCalendar = (Calendar) bundle.getSerializable("selected_calendar");
        this.mDelegate.mIndexCalendar = (Calendar) bundle.getSerializable("index_calendar");
        if (this.mDelegate.mCalendarSelectListener != null) {
            this.mDelegate.mCalendarSelectListener.onCalendarSelect(this.mDelegate.mSelectedCalendar, false);
        }
        if (this.mDelegate.mIndexCalendar != null) {
            scrollToCalendar(this.mDelegate.mIndexCalendar.getYear(), this.mDelegate.mIndexCalendar.getMonth(), this.mDelegate.mIndexCalendar.getDay());
        }
        update();
        super.onRestoreInstanceState(parcelable2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() == null || !(getParent() instanceof CalendarLayout)) {
            return;
        }
        CalendarLayout calendarLayout = (CalendarLayout) getParent();
        this.mParentLayout = calendarLayout;
        this.mMonthPager.mParentLayout = calendarLayout;
        this.mParentLayout.setup(this.mDelegate);
        this.mParentLayout.initStatus();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i2);
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || !calendarViewDelegate.isFullScreenCalendar()) {
            super.onMeasure(i, i2);
        } else {
            setCalendarItemHeight(size / 6);
            super.onMeasure(i, i2);
        }
    }

    public final void setSchemeDate(Map<String, Calendar> map) {
        this.mDelegate.mSchemeDatesMap = map;
        this.mDelegate.updateSelectCalendarScheme();
        this.mMonthPager.updateScheme();
    }

    public final void clearSchemeDate() {
        this.mDelegate.mSchemeDatesMap = null;
        this.mDelegate.clearSelectedScheme();
        this.mMonthPager.updateScheme();
    }

    public final void addSchemeDate(Calendar calendar) {
        if (calendar == null || !calendar.isAvailable()) {
            return;
        }
        if (this.mDelegate.mSchemeDatesMap == null) {
            this.mDelegate.mSchemeDatesMap = new HashMap();
        }
        this.mDelegate.mSchemeDatesMap.remove(calendar.toString());
        this.mDelegate.mSchemeDatesMap.put(calendar.toString(), calendar);
        this.mDelegate.updateSelectCalendarScheme();
        this.mMonthPager.updateScheme();
    }

    public final void addSchemeDate(Map<String, Calendar> map) {
        if (this.mDelegate == null || map == null || map.size() == 0) {
            return;
        }
        if (this.mDelegate.mSchemeDatesMap == null) {
            this.mDelegate.mSchemeDatesMap = new HashMap();
        }
        this.mDelegate.addSchemes(map);
        this.mDelegate.updateSelectCalendarScheme();
        this.mMonthPager.updateScheme();
    }

    public final void removeSchemeDate(Calendar calendar) {
        if (calendar == null || this.mDelegate.mSchemeDatesMap == null || this.mDelegate.mSchemeDatesMap.size() == 0) {
            return;
        }
        this.mDelegate.mSchemeDatesMap.remove(calendar.toString());
        if (this.mDelegate.mSelectedCalendar.equals(calendar)) {
            this.mDelegate.clearSelectedScheme();
        }
        this.mMonthPager.updateScheme();
    }

    public void setTextColor(int i, int i2, int i3, int i4, int i5) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null) {
            return;
        }
        calendarViewDelegate.setTextColor(i, i2, i3, i4, i5);
        this.mMonthPager.updateStyle();
    }

    public void setSelectedColor(int i, int i2, int i3) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null) {
            return;
        }
        calendarViewDelegate.setSelectColor(i, i2, i3);
        this.mMonthPager.updateStyle();
    }

    public void setThemeColor(int i, int i2) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null) {
            return;
        }
        calendarViewDelegate.setThemeColor(i, i2);
        this.mMonthPager.updateStyle();
    }

    public void setSchemeColor(int i, int i2, int i3) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null || this.mMonthPager == null) {
            return;
        }
        calendarViewDelegate.setSchemeColor(i, i2, i3);
        this.mMonthPager.updateStyle();
    }

    public void setCalendarPadding(int i) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        calendarViewDelegate.setCalendarPadding(i);
        update();
    }

    public void setCalendarPaddingLeft(int i) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        calendarViewDelegate.setCalendarPaddingLeft(i);
        update();
    }

    public void setCalendarPaddingRight(int i) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        calendarViewDelegate.setCalendarPaddingRight(i);
        update();
    }

    public final void setSelectDefaultMode() {
        if (this.mDelegate.getSelectMode() == 0) {
            return;
        }
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        calendarViewDelegate.mSelectedCalendar = calendarViewDelegate.mIndexCalendar;
        this.mDelegate.setSelectMode(0);
        this.mMonthPager.updateDefaultSelect();
    }

    public void setSelectRangeMode() {
        if (this.mDelegate.getSelectMode() == 2) {
            return;
        }
        this.mDelegate.setSelectMode(2);
        clearSelectRange();
    }

    public void setSelectMultiMode() {
        if (this.mDelegate.getSelectMode() == 3) {
            return;
        }
        this.mDelegate.setSelectMode(3);
        clearMultiSelect();
    }

    public void setSelectSingleMode() {
        if (this.mDelegate.getSelectMode() == 1) {
            return;
        }
        this.mDelegate.setSelectMode(1);
        this.mMonthPager.updateSelected();
    }

    public void setWeekStarWithSun() {
        setWeekStart(1);
    }

    public void setWeekStarWithMon() {
        setWeekStart(2);
    }

    public void setWeekStarWithSat() {
        setWeekStart(7);
    }

    private void setWeekStart(int i) {
        if ((i == 1 || i == 2 || i == 7) && i != this.mDelegate.getWeekStart()) {
            this.mDelegate.setWeekStart(i);
            this.mMonthPager.updateWeekStart();
        }
    }

    public boolean isSingleSelectMode() {
        return this.mDelegate.getSelectMode() == 1;
    }

    public void setAllMode() {
        setShowMode(0);
    }

    public void setOnlyCurrentMode() {
        setShowMode(1);
    }

    public void setFixMode() {
        setShowMode(2);
    }

    private void setShowMode(int i) {
        if ((i == 0 || i == 1 || i == 2) && this.mDelegate.getMonthViewShowMode() != i) {
            this.mDelegate.setMonthViewShowMode(i);
            this.mMonthPager.updateShowMode();
        }
    }

    public final void update() {
        this.mMonthPager.updateScheme();
    }

    public final void updateCurrentDate() {
        if (this.mDelegate == null || this.mMonthPager == null) {
            return;
        }
        if (getCurDay() == java.util.Calendar.getInstance().get(5)) {
            return;
        }
        this.mDelegate.updateCurrentDay();
        this.mMonthPager.updateCurrentDate();
    }

    public List<Calendar> getCurrentMonthCalendars() {
        return this.mMonthPager.getCurrentMonthCalendars();
    }

    public Calendar getSelectedCalendar() {
        return this.mDelegate.mSelectedCalendar;
    }

    public Calendar getMinRangeCalendar() {
        return this.mDelegate.getMinRangeCalendar();
    }

    public Calendar getMaxRangeCalendar() {
        return this.mDelegate.getMaxRangeCalendar();
    }

    public MonthViewPager getMonthViewPager() {
        return this.mMonthPager;
    }

    protected final boolean isInRange(Calendar calendar) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        return calendarViewDelegate != null && CalendarUtil.isCalendarInRange(calendar, calendarViewDelegate);
    }
}
