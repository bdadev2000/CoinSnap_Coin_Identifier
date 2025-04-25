package com.glority.widget.calender;

import android.content.Context;
import android.view.View;
import java.util.Iterator;

/* loaded from: classes12.dex */
public abstract class BaseMonthView extends BaseView {
    protected int mHeight;
    protected int mLineCount;
    protected int mMonth;
    MonthViewPager mMonthViewPager;
    protected int mNextDiff;
    protected int mYear;

    protected Object getClickCalendarPaddingObject(float f, float f2, Calendar calendar) {
        return null;
    }

    @Override // com.glority.widget.calender.BaseView
    protected void onDestroy() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void onLoopStart(int i, int i2) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.widget.calender.BaseView
    public void onPreviewHook() {
    }

    public BaseMonthView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void initMonthWithDate(int i, int i2) {
        this.mYear = i;
        this.mMonth = i2;
        initCalendar();
        this.mHeight = CalendarUtil.getMonthViewHeight(i, i2, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    private void initCalendar() {
        this.mNextDiff = CalendarUtil.getMonthEndDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        int monthViewStartDiff = CalendarUtil.getMonthViewStartDiff(this.mYear, this.mMonth, this.mDelegate.getWeekStart());
        int monthDaysCount = CalendarUtil.getMonthDaysCount(this.mYear, this.mMonth);
        this.mItems = CalendarUtil.initCalendarForMonthView(this.mYear, this.mMonth, this.mDelegate.getCurrentDay(), this.mDelegate.getWeekStart());
        if (this.mItems.contains(this.mDelegate.getCurrentDay())) {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.getCurrentDay());
        } else {
            this.mCurrentItem = this.mItems.indexOf(this.mDelegate.mSelectedCalendar);
        }
        if (this.mCurrentItem > 0 && this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(this.mDelegate.mSelectedCalendar)) {
            this.mCurrentItem = -1;
        }
        if (this.mDelegate.getMonthViewShowMode() == 0) {
            this.mLineCount = 6;
        } else {
            this.mLineCount = ((monthViewStartDiff + monthDaysCount) + this.mNextDiff) / 7;
        }
        addSchemesFromMap();
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Calendar getIndex() {
        if (this.mItemWidth != 0 && this.mItemHeight != 0) {
            if (this.mX <= this.mDelegate.getCalendarPaddingLeft() || this.mX >= getWidth() - this.mDelegate.getCalendarPaddingRight()) {
                onClickCalendarPadding();
            } else {
                int calendarPaddingLeft = ((int) (this.mX - this.mDelegate.getCalendarPaddingLeft())) / this.mItemWidth;
                if (calendarPaddingLeft >= 7) {
                    calendarPaddingLeft = 6;
                }
                int i = ((((int) this.mY) / this.mItemHeight) * 7) + calendarPaddingLeft;
                if (i < 0 || i >= this.mItems.size()) {
                    return null;
                }
                return this.mItems.get(i);
            }
        }
        return null;
    }

    private void onClickCalendarPadding() {
        if (this.mDelegate.mClickCalendarPaddingListener == null) {
            return;
        }
        int calendarPaddingLeft = ((int) (this.mX - this.mDelegate.getCalendarPaddingLeft())) / this.mItemWidth;
        if (calendarPaddingLeft >= 7) {
            calendarPaddingLeft = 6;
        }
        int i = ((((int) this.mY) / this.mItemHeight) * 7) + calendarPaddingLeft;
        Calendar calendar = (i < 0 || i >= this.mItems.size()) ? null : this.mItems.get(i);
        if (calendar == null) {
            return;
        }
        this.mDelegate.mClickCalendarPaddingListener.onClickCalendarPadding(this.mX, this.mY, true, calendar, getClickCalendarPaddingObject(this.mX, this.mY, calendar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setSelectedCalendar(Calendar calendar) {
        this.mCurrentItem = this.mItems.indexOf(calendar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateShowMode() {
        this.mLineCount = CalendarUtil.getMonthViewLineCount(this.mYear, this.mMonth, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        this.mHeight = CalendarUtil.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateWeekStart() {
        initCalendar();
        this.mHeight = CalendarUtil.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.glority.widget.calender.BaseView
    public void updateItemHeight() {
        super.updateItemHeight();
        this.mHeight = CalendarUtil.getMonthViewHeight(this.mYear, this.mMonth, this.mItemHeight, this.mDelegate.getWeekStart(), this.mDelegate.getMonthViewShowMode());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.glority.widget.calender.BaseView
    public void updateCurrentDate() {
        if (this.mItems == null) {
            return;
        }
        if (this.mItems.contains(this.mDelegate.getCurrentDay())) {
            Iterator<Calendar> it = this.mItems.iterator();
            while (it.hasNext()) {
                it.next().setCurrentDay(false);
            }
            this.mItems.get(this.mItems.indexOf(this.mDelegate.getCurrentDay())).setCurrentDay(true);
        }
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getSelectedIndex(Calendar calendar) {
        return this.mItems.indexOf(calendar);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.mLineCount != 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824);
        }
        super.onMeasure(i, i2);
    }
}
