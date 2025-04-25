package com.glority.widget.calender;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.internal.view.SupportMenu;
import com.glority.widget.R;
import com.glority.widget.calender.CalendarView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public final class CalendarViewDelegate {
    static final int FIRST_DAY_OF_MONTH = 0;
    static final int LAST_MONTH_VIEW_SELECT_DAY = 1;
    static final int LAST_MONTH_VIEW_SELECT_DAY_IGNORE_CURRENT = 2;
    private static final int MAX_YEAR = 2099;
    static final int MIN_YEAR = 1900;
    static final int MODE_ALL_MONTH = 0;
    static final int MODE_FIT_MONTH = 2;
    static final int MODE_ONLY_CURRENT_MONTH = 1;
    static final int SELECT_MODE_DEFAULT = 0;
    static final int SELECT_MODE_MULTI = 3;
    static final int SELECT_MODE_RANGE = 2;
    static final int SELECT_MODE_SINGLE = 1;
    static final int WEEK_START_WITH_MON = 2;
    static final int WEEK_START_WITH_SAT = 7;
    static final int WEEK_START_WITH_SUN = 1;
    private boolean isFullScreenCalendar;
    CalendarView.OnCalendarInterceptListener mCalendarInterceptListener;
    private int mCalendarItemHeight;
    CalendarView.OnCalendarLongClickListener mCalendarLongClickListener;
    CalendarView.OnCalendarMultiSelectListener mCalendarMultiSelectListener;
    private int mCalendarPadding;
    private int mCalendarPaddingLeft;
    private int mCalendarPaddingRight;
    CalendarView.OnCalendarRangeSelectListener mCalendarRangeSelectListener;
    CalendarView.OnCalendarSelectListener mCalendarSelectListener;
    CalendarView.OnClickCalendarPaddingListener mClickCalendarPaddingListener;
    private int mCurDayTextColor;
    private int mCurMonthLunarTextColor;
    private Calendar mCurrentDate;
    private int mCurrentMonthTextColor;
    int mCurrentMonthViewItem;
    private int mDayTextSize;
    private int mDefaultCalendarSelectDay;
    Calendar mIndexCalendar;
    CalendarView.OnInnerDateSelectedListener mInnerListener;
    private int mMaxMultiSelectSize;
    private int mMaxSelectRange;
    private int mMaxYear;
    private int mMaxYearDay;
    private int mMaxYearMonth;
    private int mMinSelectRange;
    private int mMinYear;
    private int mMinYearDay;
    private int mMinYearMonth;
    CalendarView.OnMonthChangeListener mMonthChangeListener;
    private Class<?> mMonthViewClass;
    private String mMonthViewClassPath;
    private boolean mMonthViewScrollable;
    private int mMonthViewShowMode;
    private int mOtherMonthLunarTextColor;
    private int mOtherMonthTextColor;
    private int mSchemeBasicColor;
    Map<String, Calendar> mSchemeDatesMap;
    private int mSchemeLunarTextColor;
    private String mSchemeText;
    private int mSchemeTextColor;
    private int mSchemeThemeColor;
    private int mSelectMode;
    Calendar mSelectedCalendar;
    Map<String, Calendar> mSelectedCalendars = new HashMap();
    Calendar mSelectedEndRangeCalendar;
    private int mSelectedLunarTextColor;
    Calendar mSelectedStartRangeCalendar;
    private int mSelectedTextColor;
    private int mSelectedThemeColor;
    CalendarView.OnViewChangeListener mViewChangeListener;
    private int mWeekStart;
    private boolean mWeekViewScrollable;
    CalendarView.OnYearChangeListener mYearChangeListener;
    private boolean mYearViewScrollable;
    private boolean preventLongPressedSelected;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CalendarViewDelegate(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CalendarView);
        this.mCalendarPadding = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding, 0.0f);
        this.mCalendarPaddingLeft = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding_left, 0.0f);
        this.mCalendarPaddingRight = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_padding_right, 0.0f);
        int i = this.mCalendarPadding;
        if (i != 0) {
            this.mCalendarPaddingLeft = i;
            this.mCalendarPaddingRight = i;
        }
        this.mSchemeTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_text_color, -1);
        this.mSchemeBasicColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_basic_color, -11413337);
        this.mSchemeLunarTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_lunar_text_color, -1973791);
        this.mSchemeThemeColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_scheme_theme_color, 1355796431);
        this.mMonthViewClassPath = obtainStyledAttributes.getString(R.styleable.CalendarView_month_view);
        String string = obtainStyledAttributes.getString(R.styleable.CalendarView_scheme_text);
        this.mSchemeText = string;
        if (TextUtils.isEmpty(string)) {
            this.mSchemeText = "记";
        }
        this.mMonthViewScrollable = obtainStyledAttributes.getBoolean(R.styleable.CalendarView_month_view_scrollable, true);
        this.mWeekViewScrollable = obtainStyledAttributes.getBoolean(R.styleable.CalendarView_week_view_scrollable, true);
        this.mYearViewScrollable = obtainStyledAttributes.getBoolean(R.styleable.CalendarView_year_view_scrollable, true);
        this.mDefaultCalendarSelectDay = obtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_auto_select_day, 0);
        this.mMonthViewShowMode = obtainStyledAttributes.getInt(R.styleable.CalendarView_month_view_show_mode, 0);
        this.mWeekStart = obtainStyledAttributes.getInt(R.styleable.CalendarView_week_start_with, 1);
        this.mSelectMode = obtainStyledAttributes.getInt(R.styleable.CalendarView_select_mode, 0);
        this.mMaxMultiSelectSize = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_multi_select_size, Integer.MAX_VALUE);
        this.mMinSelectRange = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_select_range, -1);
        int i2 = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_select_range, -1);
        this.mMaxSelectRange = i2;
        setSelectRange(this.mMinSelectRange, i2);
        this.mCurDayTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_current_day_text_color, SupportMenu.CATEGORY_MASK);
        this.mSelectedThemeColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_selected_theme_color, 1355796431);
        this.mSelectedTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_selected_text_color, -15658735);
        this.mSelectedLunarTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_selected_lunar_text_color, -15658735);
        this.mCurrentMonthTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_text_color, -15658735);
        this.mOtherMonthTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_other_month_text_color, -1973791);
        this.mCurMonthLunarTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_current_month_lunar_text_color, -1973791);
        this.mOtherMonthLunarTextColor = obtainStyledAttributes.getColor(R.styleable.CalendarView_other_month_lunar_text_color, -1973791);
        this.mMinYear = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year, 1971);
        this.mMaxYear = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year, 2055);
        this.mMinYearMonth = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_month, 1);
        this.mMaxYearMonth = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_month, 12);
        this.mMinYearDay = obtainStyledAttributes.getInt(R.styleable.CalendarView_min_year_day, 1);
        this.mMaxYearDay = obtainStyledAttributes.getInt(R.styleable.CalendarView_max_year_day, -1);
        this.mDayTextSize = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CalendarView_day_text_size, CalendarUtil.dipToPx(context, 16.0f));
        this.mCalendarItemHeight = (int) obtainStyledAttributes.getDimension(R.styleable.CalendarView_calendar_height, CalendarUtil.dipToPx(context, 56.0f));
        this.isFullScreenCalendar = obtainStyledAttributes.getBoolean(R.styleable.CalendarView_calendar_match_parent, false);
        if (this.mMinYear <= MIN_YEAR) {
            this.mMinYear = MIN_YEAR;
        }
        if (this.mMaxYear >= MAX_YEAR) {
            this.mMaxYear = MAX_YEAR;
        }
        obtainStyledAttributes.recycle();
        init();
    }

    private void init() {
        this.mCurrentDate = new Calendar();
        Date date = new Date();
        this.mCurrentDate.setYear(CalendarUtil.getDate("yyyy", date));
        this.mCurrentDate.setMonth(CalendarUtil.getDate("MM", date));
        this.mCurrentDate.setDay(CalendarUtil.getDate("dd", date));
        this.mCurrentDate.setCurrentDay(true);
        setRange(this.mMinYear, this.mMinYearMonth, this.mMaxYear, this.mMaxYearMonth);
        try {
            this.mMonthViewClass = TextUtils.isEmpty(this.mMonthViewClassPath) ? DefaultMonthView.class : Class.forName(this.mMonthViewClassPath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void setRange(int i, int i2, int i3, int i4) {
        this.mMinYear = i;
        this.mMinYearMonth = i2;
        this.mMaxYear = i3;
        this.mMaxYearMonth = i4;
        if (i3 < this.mCurrentDate.getYear()) {
            this.mMaxYear = this.mCurrentDate.getYear();
        }
        if (this.mMaxYearDay == -1) {
            this.mMaxYearDay = CalendarUtil.getMonthDaysCount(this.mMaxYear, this.mMaxYearMonth);
        }
        this.mCurrentMonthViewItem = (((this.mCurrentDate.getYear() - this.mMinYear) * 12) + this.mCurrentDate.getMonth()) - this.mMinYearMonth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setRange(int i, int i2, int i3, int i4, int i5, int i6) {
        this.mMinYear = i;
        this.mMinYearMonth = i2;
        this.mMinYearDay = i3;
        this.mMaxYear = i4;
        this.mMaxYearMonth = i5;
        this.mMaxYearDay = i6;
        if (i6 == -1) {
            this.mMaxYearDay = CalendarUtil.getMonthDaysCount(i4, i5);
        }
        this.mCurrentMonthViewItem = (((this.mCurrentDate.getYear() - this.mMinYear) * 12) + this.mCurrentDate.getMonth()) - this.mMinYearMonth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String getSchemeText() {
        return this.mSchemeText;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCurDayTextColor() {
        return this.mCurDayTextColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSchemeTextColor() {
        return this.mSchemeTextColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSchemeBasicColor() {
        return this.mSchemeBasicColor;
    }

    int getSchemeLunarTextColor() {
        return this.mSchemeLunarTextColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getOtherMonthTextColor() {
        return this.mOtherMonthTextColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCurrentMonthTextColor() {
        return this.mCurrentMonthTextColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSelectedTextColor() {
        return this.mSelectedTextColor;
    }

    int getSelectedLunarTextColor() {
        return this.mSelectedLunarTextColor;
    }

    int getCurrentMonthLunarTextColor() {
        return this.mCurMonthLunarTextColor;
    }

    int getOtherMonthLunarTextColor() {
        return this.mOtherMonthLunarTextColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSchemeThemeColor() {
        return this.mSchemeThemeColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSelectedThemeColor() {
        return this.mSelectedThemeColor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Class<?> getMonthViewClass() {
        return this.mMonthViewClass;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinYear() {
        return this.mMinYear;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxYear() {
        return this.mMaxYear;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDayTextSize() {
        return this.mDayTextSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCalendarItemHeight() {
        return this.mCalendarItemHeight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCalendarItemHeight(int i) {
        this.mCalendarItemHeight = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinYearMonth() {
        return this.mMinYearMonth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxYearMonth() {
        return this.mMaxYearMonth;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMonthViewShowMode() {
        return this.mMonthViewShowMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMonthViewShowMode(int i) {
        this.mMonthViewShowMode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setTextColor(int i, int i2, int i3, int i4, int i5) {
        this.mCurDayTextColor = i;
        this.mOtherMonthTextColor = i3;
        this.mCurrentMonthTextColor = i2;
        this.mCurMonthLunarTextColor = i4;
        this.mOtherMonthLunarTextColor = i5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSchemeColor(int i, int i2, int i3) {
        this.mSchemeThemeColor = i;
        this.mSchemeTextColor = i2;
        this.mSchemeLunarTextColor = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSelectColor(int i, int i2, int i3) {
        this.mSelectedThemeColor = i;
        this.mSelectedTextColor = i2;
        this.mSelectedLunarTextColor = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setThemeColor(int i, int i2) {
        this.mSelectedThemeColor = i;
        this.mSchemeThemeColor = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isMonthViewScrollable() {
        return this.mMonthViewScrollable;
    }

    boolean isWeekViewScrollable() {
        return this.mWeekViewScrollable;
    }

    boolean isYearViewScrollable() {
        return this.mYearViewScrollable;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMonthViewScrollable(boolean z) {
        this.mMonthViewScrollable = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setWeekViewScrollable(boolean z) {
        this.mWeekViewScrollable = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setYearViewScrollable(boolean z) {
        this.mYearViewScrollable = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getWeekStart() {
        return this.mWeekStart;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setWeekStart(int i) {
        this.mWeekStart = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setDefaultCalendarSelectDay(int i) {
        this.mDefaultCalendarSelectDay = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getDefaultCalendarSelectDay() {
        return this.mDefaultCalendarSelectDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getSelectMode() {
        return this.mSelectMode;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setSelectMode(int i) {
        this.mSelectMode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinSelectRange() {
        return this.mMinSelectRange;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxSelectRange() {
        return this.mMaxSelectRange;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxMultiSelectSize() {
        return this.mMaxMultiSelectSize;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMaxMultiSelectSize(int i) {
        this.mMaxMultiSelectSize = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void setSelectRange(int i, int i2) {
        if (i > i2 && i2 > 0) {
            this.mMaxSelectRange = i;
            this.mMinSelectRange = i;
            return;
        }
        if (i <= 0) {
            this.mMinSelectRange = -1;
        } else {
            this.mMinSelectRange = i;
        }
        if (i2 <= 0) {
            this.mMaxSelectRange = -1;
        } else {
            this.mMaxSelectRange = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar getCurrentDay() {
        return this.mCurrentDate;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void updateCurrentDay() {
        Date date = new Date();
        this.mCurrentDate.setYear(CalendarUtil.getDate("yyyy", date));
        this.mCurrentDate.setMonth(CalendarUtil.getDate("MM", date));
        this.mCurrentDate.setDay(CalendarUtil.getDate("dd", date));
    }

    int getCalendarPadding() {
        return this.mCalendarPadding;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCalendarPadding(int i) {
        this.mCalendarPadding = i;
        this.mCalendarPaddingLeft = i;
        this.mCalendarPaddingRight = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCalendarPaddingLeft() {
        return this.mCalendarPaddingLeft;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCalendarPaddingLeft(int i) {
        this.mCalendarPaddingLeft = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getCalendarPaddingRight() {
        return this.mCalendarPaddingRight;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setCalendarPaddingRight(int i) {
        this.mCalendarPaddingRight = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setPreventLongPressedSelected(boolean z) {
        this.preventLongPressedSelected = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setMonthViewClass(Class<?> cls) {
        this.mMonthViewClass = cls;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isPreventLongPressedSelected() {
        return this.preventLongPressedSelected;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void clearSelectedScheme() {
        this.mSelectedCalendar.clearScheme();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMinYearDay() {
        return this.mMinYearDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getMaxYearDay() {
        return this.mMaxYearDay;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isFullScreenCalendar() {
        return this.isFullScreenCalendar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void updateSelectCalendarScheme() {
        Map<String, Calendar> map = this.mSchemeDatesMap;
        if (map != null && map.size() > 0) {
            String calendar = this.mSelectedCalendar.toString();
            if (this.mSchemeDatesMap.containsKey(calendar)) {
                this.mSelectedCalendar.mergeScheme(this.mSchemeDatesMap.get(calendar), getSchemeText());
                return;
            }
            return;
        }
        clearSelectedScheme();
    }

    final void updateCalendarScheme(Calendar calendar) {
        Map<String, Calendar> map;
        if (calendar == null || (map = this.mSchemeDatesMap) == null || map.size() == 0) {
            return;
        }
        String calendar2 = calendar.toString();
        if (this.mSchemeDatesMap.containsKey(calendar2)) {
            calendar.mergeScheme(this.mSchemeDatesMap.get(calendar2), getSchemeText());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar createCurrentDate() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.mCurrentDate.getYear());
        calendar.setWeek(this.mCurrentDate.getWeek());
        calendar.setMonth(this.mCurrentDate.getMonth());
        calendar.setDay(this.mCurrentDate.getDay());
        calendar.setCurrentDay(true);
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Calendar getMinRangeCalendar() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.mMinYear);
        calendar.setMonth(this.mMinYearMonth);
        calendar.setDay(this.mMinYearDay);
        calendar.setCurrentDay(calendar.equals(this.mCurrentDate));
        return calendar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Calendar getMaxRangeCalendar() {
        Calendar calendar = new Calendar();
        calendar.setYear(this.mMaxYear);
        calendar.setMonth(this.mMaxYearMonth);
        calendar.setDay(this.mMaxYearDay);
        calendar.setCurrentDay(calendar.equals(this.mCurrentDate));
        return calendar;
    }

    final void addSchemesFromMap(List<Calendar> list) {
        Map<String, Calendar> map = this.mSchemeDatesMap;
        if (map == null || map.size() == 0) {
            return;
        }
        for (Calendar calendar : list) {
            if (this.mSchemeDatesMap.containsKey(calendar.toString())) {
                Calendar calendar2 = this.mSchemeDatesMap.get(calendar.toString());
                if (calendar2 != null) {
                    calendar.setScheme(TextUtils.isEmpty(calendar2.getScheme()) ? getSchemeText() : calendar2.getScheme());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void addSchemes(Map<String, Calendar> map) {
        if (map == null || map.size() == 0) {
            return;
        }
        if (this.mSchemeDatesMap == null) {
            this.mSchemeDatesMap = new HashMap();
        }
        for (String str : map.keySet()) {
            this.mSchemeDatesMap.remove(str);
            Calendar calendar = map.get(str);
            if (calendar != null) {
                this.mSchemeDatesMap.put(str, calendar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void clearSelectRange() {
        this.mSelectedStartRangeCalendar = null;
        this.mSelectedEndRangeCalendar = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final List<Calendar> getSelectCalendarRange() {
        if (this.mSelectMode != 2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.mSelectedStartRangeCalendar != null && this.mSelectedEndRangeCalendar != null) {
            java.util.Calendar calendar = java.util.Calendar.getInstance();
            calendar.set(this.mSelectedStartRangeCalendar.getYear(), this.mSelectedStartRangeCalendar.getMonth() - 1, this.mSelectedStartRangeCalendar.getDay());
            calendar.set(this.mSelectedEndRangeCalendar.getYear(), this.mSelectedEndRangeCalendar.getMonth() - 1, this.mSelectedEndRangeCalendar.getDay());
            long timeInMillis = calendar.getTimeInMillis();
            for (long timeInMillis2 = calendar.getTimeInMillis(); timeInMillis2 <= timeInMillis; timeInMillis2 += 86400000) {
                calendar.setTimeInMillis(timeInMillis2);
                Calendar calendar2 = new Calendar();
                calendar2.setYear(calendar.get(1));
                calendar2.setMonth(calendar.get(2) + 1);
                calendar2.setDay(calendar.get(5));
                updateCalendarScheme(calendar2);
                CalendarView.OnCalendarInterceptListener onCalendarInterceptListener = this.mCalendarInterceptListener;
                if (onCalendarInterceptListener == null || !onCalendarInterceptListener.onCalendarIntercept(calendar2)) {
                    arrayList.add(calendar2);
                }
            }
            addSchemesFromMap(arrayList);
        }
        return arrayList;
    }
}
