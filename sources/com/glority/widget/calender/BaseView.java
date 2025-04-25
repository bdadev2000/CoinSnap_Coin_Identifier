package com.glority.widget.calender;

import android.content.Context;
import android.graphics.Paint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* loaded from: classes12.dex */
public abstract class BaseView extends View implements View.OnClickListener, View.OnLongClickListener {
    static final int TEXT_SIZE = 14;
    boolean isClick;
    protected Paint mCurDayLunarTextPaint;
    protected Paint mCurDayTextPaint;
    protected Paint mCurMonthTextPaint;
    int mCurrentItem;
    CalendarViewDelegate mDelegate;
    protected int mItemHeight;
    protected int mItemWidth;
    protected List<Calendar> mItems;
    protected Paint mOtherMonthTextPaint;
    CalendarLayout mParentLayout;
    protected Paint mSchemeBasicPaint;
    protected Paint mSchemePaint;
    protected Paint mSchemeTextPaint;
    protected Paint mSelectTextPaint;
    protected Paint mSelectedPaint;
    protected float mTextBaseLine;
    int mWeekStartWidth;
    protected float mX;
    protected float mY;

    protected void initPaint() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void onDestroy();

    protected void onPreviewHook() {
    }

    abstract void updateCurrentDate();

    public BaseView(Context context) {
        this(context, null);
    }

    public BaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurMonthTextPaint = new Paint();
        this.mOtherMonthTextPaint = new Paint();
        this.mSchemePaint = new Paint();
        this.mSelectedPaint = new Paint();
        this.mSchemeTextPaint = new Paint();
        this.mSelectTextPaint = new Paint();
        this.mCurDayTextPaint = new Paint();
        this.mCurDayLunarTextPaint = new Paint();
        this.mSchemeBasicPaint = new Paint();
        this.isClick = true;
        this.mCurrentItem = -1;
        initPaint(context);
    }

    private void initPaint(Context context) {
        this.mCurMonthTextPaint.setAntiAlias(true);
        this.mCurMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurMonthTextPaint.setColor(-15658735);
        this.mCurMonthTextPaint.setFakeBoldText(true);
        this.mCurMonthTextPaint.setTextSize(CalendarUtil.dipToPx(context, 14.0f));
        this.mOtherMonthTextPaint.setAntiAlias(true);
        this.mOtherMonthTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mOtherMonthTextPaint.setColor(-1973791);
        this.mOtherMonthTextPaint.setFakeBoldText(true);
        this.mOtherMonthTextPaint.setTextSize(CalendarUtil.dipToPx(context, 14.0f));
        this.mSchemeTextPaint.setAntiAlias(true);
        this.mSchemeTextPaint.setStyle(Paint.Style.FILL);
        this.mSchemeTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeTextPaint.setColor(-1223853);
        this.mSchemeTextPaint.setFakeBoldText(true);
        this.mSchemeTextPaint.setTextSize(CalendarUtil.dipToPx(context, 14.0f));
        this.mSelectTextPaint.setAntiAlias(true);
        this.mSelectTextPaint.setStyle(Paint.Style.FILL);
        this.mSelectTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mSelectTextPaint.setColor(-1223853);
        this.mSelectTextPaint.setFakeBoldText(true);
        this.mSelectTextPaint.setTextSize(CalendarUtil.dipToPx(context, 14.0f));
        this.mSchemePaint.setAntiAlias(true);
        this.mSchemePaint.setStyle(Paint.Style.FILL);
        this.mSchemePaint.setStrokeWidth(2.0f);
        this.mSchemePaint.setColor(-1052689);
        this.mCurDayTextPaint.setAntiAlias(true);
        this.mCurDayTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayTextPaint.setColor(-7580165);
        this.mCurDayTextPaint.setFakeBoldText(true);
        this.mCurDayTextPaint.setTextSize(CalendarUtil.dipToPx(context, 14.0f));
        this.mCurDayLunarTextPaint.setAntiAlias(true);
        this.mCurDayLunarTextPaint.setTextAlign(Paint.Align.CENTER);
        this.mCurDayLunarTextPaint.setColor(SupportMenu.CATEGORY_MASK);
        this.mCurDayLunarTextPaint.setFakeBoldText(true);
        this.mCurDayLunarTextPaint.setTextSize(CalendarUtil.dipToPx(context, 14.0f));
        this.mSelectedPaint.setAntiAlias(true);
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setStrokeWidth(2.0f);
        this.mSchemeBasicPaint.setAntiAlias(true);
        this.mSchemeBasicPaint.setStyle(Paint.Style.FILL);
        this.mSchemeBasicPaint.setTextAlign(Paint.Align.CENTER);
        this.mSchemeBasicPaint.setColor(-11413337);
        this.mSchemeBasicPaint.setFakeBoldText(true);
        setOnClickListener(this);
        setOnLongClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setup(CalendarViewDelegate calendarViewDelegate) {
        this.mDelegate = calendarViewDelegate;
        this.mWeekStartWidth = calendarViewDelegate.getWeekStart();
        updateStyle();
        updateItemHeight();
        initPaint();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateStyle() {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate == null) {
            return;
        }
        this.mCurDayTextPaint.setColor(calendarViewDelegate.getCurDayTextColor());
        this.mCurMonthTextPaint.setColor(this.mDelegate.getCurrentMonthTextColor());
        this.mOtherMonthTextPaint.setColor(this.mDelegate.getOtherMonthTextColor());
        this.mSelectTextPaint.setColor(this.mDelegate.getSelectedTextColor());
        this.mSchemePaint.setColor(this.mDelegate.getSchemeThemeColor());
        this.mSchemeTextPaint.setColor(this.mDelegate.getSchemeTextColor());
        this.mSchemeBasicPaint.setColor(this.mDelegate.getSchemeBasicColor());
        this.mCurMonthTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mOtherMonthTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mCurDayTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mSchemeTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mSelectTextPaint.setTextSize(this.mDelegate.getDayTextSize());
        this.mSelectedPaint.setStyle(Paint.Style.FILL);
        this.mSelectedPaint.setColor(this.mDelegate.getSelectedThemeColor());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateItemHeight() {
        this.mItemHeight = this.mDelegate.getCalendarItemHeight();
        Paint.FontMetrics fontMetrics = this.mCurMonthTextPaint.getFontMetrics();
        this.mTextBaseLine = ((this.mItemHeight / 2) - fontMetrics.descent) + ((fontMetrics.bottom - fontMetrics.top) / 2.0f);
    }

    final void removeSchemes() {
        for (Calendar calendar : this.mItems) {
            calendar.setScheme("");
            calendar.setSchemeColor(0);
            calendar.setSchemes(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void addSchemesFromMap() {
        if (this.mDelegate.mSchemeDatesMap == null || this.mDelegate.mSchemeDatesMap.size() == 0) {
            return;
        }
        for (Calendar calendar : this.mItems) {
            if (this.mDelegate.mSchemeDatesMap.containsKey(calendar.toString())) {
                Calendar calendar2 = this.mDelegate.mSchemeDatesMap.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? this.mDelegate.getSchemeText() : calendar2.getScheme());
                    calendar.setSchemeColor(calendar2.getSchemeColor());
                    calendar.setSchemes(calendar2.getSchemes());
                }
            } else {
                calendar.setScheme("");
                calendar.setSchemeColor(0);
                calendar.setSchemes(null);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() > 1) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
            this.isClick = true;
        } else if (action != 1) {
            if (action == 2 && this.isClick) {
                this.isClick = Math.abs(motionEvent.getY() - this.mY) <= 50.0f;
            }
        } else {
            this.mX = motionEvent.getX();
            this.mY = motionEvent.getY();
        }
        return super.onTouchEvent(motionEvent);
    }

    protected boolean isSelected(Calendar calendar) {
        List<Calendar> list = this.mItems;
        return list != null && list.indexOf(calendar) == this.mCurrentItem;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void update() {
        if (this.mDelegate.mSchemeDatesMap == null || this.mDelegate.mSchemeDatesMap.size() == 0) {
            removeSchemes();
            invalidate();
        } else {
            addSchemesFromMap();
            invalidate();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean onCalendarIntercept(Calendar calendar) {
        return this.mDelegate.mCalendarInterceptListener != null && this.mDelegate.mCalendarInterceptListener.onCalendarIntercept(calendar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean isInRange(Calendar calendar) {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        return calendarViewDelegate != null && CalendarUtil.isCalendarInRange(calendar, calendarViewDelegate);
    }

    protected int getWeekStartWith() {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            return calendarViewDelegate.getWeekStart();
        }
        return 1;
    }

    protected int getCalendarPaddingLeft() {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            return calendarViewDelegate.getCalendarPaddingLeft();
        }
        return 0;
    }

    protected int getCalendarPaddingRight() {
        CalendarViewDelegate calendarViewDelegate = this.mDelegate;
        if (calendarViewDelegate != null) {
            return calendarViewDelegate.getCalendarPaddingRight();
        }
        return 0;
    }
}
