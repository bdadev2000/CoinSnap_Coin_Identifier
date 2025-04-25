package com.glority.widget.tracker.calender;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.android.core.data.LogEventArguments;
import com.glority.widget.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlCalendarView.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002()B\u001b\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bJ\u0010\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000bH\u0002J\b\u0010\u001d\u001a\u00020\u001aH\u0002J\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!H\u0002J\u0010\u0010#\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020!J\u000e\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\rR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u00020\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/glority/widget/tracker/calender/GlCalendarView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "dateItemList", "", "Lcom/glority/widget/tracker/calender/GlCalendarView$DateItem;", "dayTimeStamp", "", "mOnSelectedListener", "Lcom/glority/widget/tracker/calender/GlCalendarView$OnSelectedListener;", "titleTv", "Landroid/widget/TextView;", "vp2", "Landroidx/viewpager2/widget/ViewPager2;", "getVp2", "()Landroidx/viewpager2/widget/ViewPager2;", "setVp2", "(Landroidx/viewpager2/widget/ViewPager2;)V", "weekName", "", "", "init", "", "toWeekBefore", "initDateItem", "initView", "isSameDay", "", "day", "Ljava/util/Calendar;", "day2", "isToday", "selected", "calendar", "setOnSelectedListener", "onSelectedListener", "DateItem", "OnSelectedListener", "mod_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes12.dex */
public final class GlCalendarView extends LinearLayout {
    private final List<DateItem> dateItemList;
    private final int dayTimeStamp;
    private OnSelectedListener mOnSelectedListener;
    private TextView titleTv;
    private ViewPager2 vp2;
    private final List<String> weekName;

    /* compiled from: GlCalendarView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/glority/widget/tracker/calender/GlCalendarView$OnSelectedListener;", "", "onSelected", "", "date", "Ljava/util/Calendar;", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public interface OnSelectedListener {
        void onSelected(Calendar date);
    }

    public GlCalendarView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ GlCalendarView(android.content.Context r1, android.util.AttributeSet r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L8
            r2 = 0
            r3 = r2
            android.util.AttributeSet r3 = (android.util.AttributeSet) r3
        L8:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.widget.tracker.calender.GlCalendarView.<init>(android.content.Context, android.util.AttributeSet, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlCalendarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dayTimeStamp = 86400000;
        this.dateItemList = new ArrayList();
        this.weekName = CollectionsKt.listOf((Object[]) new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"});
        LayoutInflater.from(context).inflate(R.layout.gl_calendar_layout, this);
        View findViewById = findViewById(R.id.vp2);
        Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById(R.id.vp2)");
        this.vp2 = (ViewPager2) findViewById;
        View findViewById2 = findViewById(R.id.title_tv);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById(R.id.title_tv)");
        this.titleTv = (TextView) findViewById2;
    }

    public final ViewPager2 getVp2() {
        return this.vp2;
    }

    public final void setVp2(ViewPager2 viewPager2) {
        Intrinsics.checkNotNullParameter(viewPager2, "<set-?>");
        this.vp2 = viewPager2;
    }

    public final void init(int toWeekBefore) {
        initDateItem(toWeekBefore);
        initView();
        Calendar calendar = Calendar.getInstance();
        Intrinsics.checkNotNullExpressionValue(calendar, "Calendar.getInstance()");
        selected(calendar);
    }

    public final void setOnSelectedListener(OnSelectedListener onSelectedListener) {
        Intrinsics.checkNotNullParameter(onSelectedListener, "onSelectedListener");
        this.mOnSelectedListener = onSelectedListener;
    }

    public final void selected(Calendar calendar) {
        int i;
        Object obj;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        RecyclerView.Adapter adapter = this.vp2.getAdapter();
        if (adapter == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.glority.widget.tracker.calender.GlCalendarAdapter");
        }
        GlCalendarAdapter glCalendarAdapter = (GlCalendarAdapter) adapter;
        List<List<? extends DateItem>> data = glCalendarAdapter.getData();
        ListIterator<List<? extends DateItem>> listIterator = data.listIterator(data.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i = -1;
                break;
            }
            Iterator<T> it = listIterator.previous().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (isSameDay(((DateItem) obj).getDate(), calendar)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                i = listIterator.nextIndex();
                break;
            }
        }
        Iterator<T> it2 = glCalendarAdapter.getData().iterator();
        while (it2.hasNext()) {
            for (DateItem dateItem : (List) it2.next()) {
                dateItem.setSelected(isSameDay(dateItem.getDate(), calendar));
            }
        }
        glCalendarAdapter.notifyDataSetChanged();
        if (i != -1) {
            this.vp2.setCurrentItem(i, false);
        }
        OnSelectedListener onSelectedListener = this.mOnSelectedListener;
        if (onSelectedListener != null) {
            onSelectedListener.onSelected(calendar);
        }
        if (isToday(calendar)) {
            this.titleTv.setText("Today");
        } else {
            this.titleTv.setText(new SimpleDateFormat("yyyy-MM").format(calendar.getTime()));
        }
    }

    private final void initView() {
        GlCalendarAdapter glCalendarAdapter = new GlCalendarAdapter(this);
        this.vp2.setAdapter(glCalendarAdapter);
        int size = this.dateItemList.size() / 7;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < size) {
            int i2 = i * 7;
            i++;
            arrayList.add(CollectionsKt.reversed(this.dateItemList.subList(i2, i * 7)));
        }
        glCalendarAdapter.setNewData(CollectionsKt.reversed(arrayList));
        this.vp2.setCurrentItem(arrayList.size(), false);
    }

    private final void initDateItem(int toWeekBefore) {
        int i = 7;
        long currentTimeMillis = System.currentTimeMillis() + ((8 - Calendar.getInstance().get(7)) * this.dayTimeStamp);
        long j = toWeekBefore;
        long j2 = 0;
        if (0 > j) {
            return;
        }
        long j3 = 0;
        while (true) {
            long j4 = j2;
            while (j4 < 7) {
                Calendar calendar = Calendar.getInstance();
                int i2 = this.dayTimeStamp;
                long j5 = j;
                calendar.setTime(new Date((currentTimeMillis - ((i2 * j3) * i)) - (i2 * j4)));
                int i3 = calendar.get(1);
                int i4 = calendar.get(2);
                int i5 = calendar.get(5);
                int i6 = calendar.get(5);
                String str = this.weekName.get(calendar.get(i) - 1);
                String valueOf = String.valueOf(i6);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(1, i3);
                calendar2.set(2, i4);
                calendar2.set(5, i5);
                Unit unit = Unit.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(calendar2, "Calendar.getInstance().a…                        }");
                Intrinsics.checkNotNullExpressionValue(calendar, "this");
                this.dateItemList.add(new DateItem(str, valueOf, calendar2, isToday(calendar), false, 16, null));
                j4++;
                j = j5;
                i = 7;
            }
            long j6 = j;
            if (j3 == j6) {
                return;
            }
            j3++;
            j = j6;
            i = 7;
            j2 = 0;
        }
    }

    private final boolean isToday(Calendar day) {
        Calendar today = Calendar.getInstance();
        today.setTime(new Date());
        Intrinsics.checkNotNullExpressionValue(today, "today");
        return isSameDay(today, day);
    }

    private final boolean isSameDay(Calendar day, Calendar day2) {
        return day2.get(1) == day.get(1) && day2.get(2) == day.get(2) && day2.get(5) == day.get(5);
    }

    /* compiled from: GlCalendarView.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\b\u0010\u001e\u001a\u00020\u0003H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/glority/widget/tracker/calender/GlCalendarView$DateItem;", "", "name", "", LogEventArguments.ARG_NUMBER, "date", "Ljava/util/Calendar;", "isToday", "", "selected", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Calendar;ZZ)V", "getDate", "()Ljava/util/Calendar;", "()Z", "getName", "()Ljava/lang/String;", "getNumber", "getSelected", "setSelected", "(Z)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "mod_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes12.dex */
    public static final /* data */ class DateItem {
        private final Calendar date;
        private final boolean isToday;
        private final String name;
        private final String number;
        private boolean selected;

        public static /* synthetic */ DateItem copy$default(DateItem dateItem, String str, String str2, Calendar calendar, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dateItem.name;
            }
            if ((i & 2) != 0) {
                str2 = dateItem.number;
            }
            String str3 = str2;
            if ((i & 4) != 0) {
                calendar = dateItem.date;
            }
            Calendar calendar2 = calendar;
            if ((i & 8) != 0) {
                z = dateItem.isToday;
            }
            boolean z3 = z;
            if ((i & 16) != 0) {
                z2 = dateItem.selected;
            }
            return dateItem.copy(str, str3, calendar2, z3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNumber() {
            return this.number;
        }

        /* renamed from: component3, reason: from getter */
        public final Calendar getDate() {
            return this.date;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsToday() {
            return this.isToday;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final DateItem copy(String name, String number, Calendar date, boolean isToday, boolean selected) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(date, "date");
            return new DateItem(name, number, date, isToday, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DateItem)) {
                return false;
            }
            DateItem dateItem = (DateItem) other;
            return Intrinsics.areEqual(this.name, dateItem.name) && Intrinsics.areEqual(this.number, dateItem.number) && Intrinsics.areEqual(this.date, dateItem.date) && this.isToday == dateItem.isToday && this.selected == dateItem.selected;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            String str = this.name;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.number;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            Calendar calendar = this.date;
            int hashCode3 = (hashCode2 + (calendar != null ? calendar.hashCode() : 0)) * 31;
            boolean z = this.isToday;
            int i = z;
            if (z != 0) {
                i = 1;
            }
            int i2 = (hashCode3 + i) * 31;
            boolean z2 = this.selected;
            return i2 + (z2 ? 1 : z2 ? 1 : 0);
        }

        public DateItem(String name, String number, Calendar date, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(number, "number");
            Intrinsics.checkNotNullParameter(date, "date");
            this.name = name;
            this.number = number;
            this.date = date;
            this.isToday = z;
            this.selected = z2;
        }

        public final String getName() {
            return this.name;
        }

        public final String getNumber() {
            return this.number;
        }

        public final Calendar getDate() {
            return this.date;
        }

        public final boolean isToday() {
            return this.isToday;
        }

        public /* synthetic */ DateItem(String str, String str2, Calendar calendar, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, calendar, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
        }

        public final boolean getSelected() {
            return this.selected;
        }

        public final void setSelected(boolean z) {
            this.selected = z;
        }

        public String toString() {
            return this.name + '-' + this.number + '-' + this.date;
        }
    }
}
