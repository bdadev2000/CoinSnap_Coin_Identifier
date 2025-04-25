package com.glority.widget.calender;

import android.text.TextUtils;
import com.glority.android.cmsui.entity.LikeItem;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public final class Calendar implements Serializable, Comparable<Calendar> {
    private static final long serialVersionUID = 141315161718191143L;
    private int day;
    private String gregorianFestival;
    private boolean isCurrentDay;
    private boolean isCurrentMonth;
    private boolean isLeapYear;
    private boolean isWeekend;
    private int leapMonth;
    private int month;
    private String scheme;
    private int schemeColor;
    private List<Scheme> schemes;
    private int week;
    private int year;

    public int getYear() {
        return this.year;
    }

    public void setYear(int i) {
        this.year = i;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int i) {
        this.month = i;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int i) {
        this.day = i;
    }

    public boolean isCurrentMonth() {
        return this.isCurrentMonth;
    }

    public void setCurrentMonth(boolean z) {
        this.isCurrentMonth = z;
    }

    public boolean isCurrentDay() {
        return this.isCurrentDay;
    }

    public void setCurrentDay(boolean z) {
        this.isCurrentDay = z;
    }

    public String getScheme() {
        return this.scheme;
    }

    public void setScheme(String str) {
        this.scheme = str;
    }

    public int getSchemeColor() {
        return this.schemeColor;
    }

    public void setSchemeColor(int i) {
        this.schemeColor = i;
    }

    public List<Scheme> getSchemes() {
        return this.schemes;
    }

    public void setSchemes(List<Scheme> list) {
        this.schemes = list;
    }

    public void addScheme(Scheme scheme) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(scheme);
    }

    public void addScheme(int i, String str) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, str));
    }

    public void addScheme(int i, int i2, String str) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, i2, str));
    }

    public void addScheme(int i, int i2, String str, String str2) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, i2, str, str2));
    }

    public void addScheme(int i, String str, String str2) {
        if (this.schemes == null) {
            this.schemes = new ArrayList();
        }
        this.schemes.add(new Scheme(i, str, str2));
    }

    public boolean isWeekend() {
        return this.isWeekend;
    }

    public void setWeekend(boolean z) {
        this.isWeekend = z;
    }

    public int getWeek() {
        return this.week;
    }

    public void setWeek(int i) {
        this.week = i;
    }

    public String getGregorianFestival() {
        return this.gregorianFestival;
    }

    public void setGregorianFestival(String str) {
        this.gregorianFestival = str;
    }

    public int getLeapMonth() {
        return this.leapMonth;
    }

    public void setLeapMonth(int i) {
        this.leapMonth = i;
    }

    public boolean isLeapYear() {
        return this.isLeapYear;
    }

    public void setLeapYear(boolean z) {
        this.isLeapYear = z;
    }

    public boolean hasScheme() {
        List<Scheme> list = this.schemes;
        return ((list == null || list.size() == 0) && TextUtils.isEmpty(this.scheme)) ? false : true;
    }

    public boolean isSameMonth(Calendar calendar) {
        return this.year == calendar.getYear() && this.month == calendar.getMonth();
    }

    @Override // java.lang.Comparable
    public int compareTo(Calendar calendar) {
        if (calendar == null) {
            return 1;
        }
        return toString().compareTo(calendar.toString());
    }

    public final int differ(Calendar calendar) {
        return CalendarUtil.differ(this, calendar);
    }

    public boolean isAvailable() {
        int i = this.year;
        boolean z = i > 0;
        int i2 = this.month;
        boolean z2 = z & (i2 > 0);
        int i3 = this.day;
        return z2 & (i3 > 0) & (i3 <= 31) & (i2 <= 12) & (i >= 1900) & (i <= 2099);
    }

    public long getTimeInMillis() {
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.set(1, this.year);
        calendar.set(2, this.month - 1);
        calendar.set(5, this.day);
        return calendar.getTimeInMillis();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Calendar)) {
            Calendar calendar = (Calendar) obj;
            if (calendar.getYear() == this.year && calendar.getMonth() == this.month && calendar.getDay() == this.day) {
                return true;
            }
        }
        return super.equals(obj);
    }

    public String toString() {
        StringBuilder append = new StringBuilder().append(this.year).append("");
        int i = this.month;
        StringBuilder append2 = append.append(i < 10 ? LikeItem.DISLIKE + this.month : Integer.valueOf(i)).append("");
        int i2 = this.day;
        return append2.append(i2 < 10 ? LikeItem.DISLIKE + this.day : Integer.valueOf(i2)).toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void mergeScheme(Calendar calendar, String str) {
        if (calendar == null) {
            return;
        }
        if (!TextUtils.isEmpty(calendar.getScheme())) {
            str = calendar.getScheme();
        }
        setScheme(str);
        setSchemeColor(calendar.getSchemeColor());
        setSchemes(calendar.getSchemes());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void clearScheme() {
        setScheme("");
        setSchemeColor(0);
        setSchemes(null);
    }

    /* loaded from: classes12.dex */
    public static final class Scheme implements Serializable {
        private Object obj;
        private String other;
        private String scheme;
        private int shcemeColor;
        private int type;

        public Scheme() {
        }

        public Scheme(int i, int i2, String str, String str2) {
            this.type = i;
            this.shcemeColor = i2;
            this.scheme = str;
            this.other = str2;
        }

        public Scheme(int i, int i2, String str) {
            this.type = i;
            this.shcemeColor = i2;
            this.scheme = str;
        }

        public Scheme(int i, String str) {
            this.shcemeColor = i;
            this.scheme = str;
        }

        public Scheme(int i, String str, String str2) {
            this.shcemeColor = i;
            this.scheme = str;
            this.other = str2;
        }

        public int getShcemeColor() {
            return this.shcemeColor;
        }

        public void setShcemeColor(int i) {
            this.shcemeColor = i;
        }

        public String getScheme() {
            return this.scheme;
        }

        public void setScheme(String str) {
            this.scheme = str;
        }

        public String getOther() {
            return this.other;
        }

        public void setOther(String str) {
            this.other = str;
        }

        public int getType() {
            return this.type;
        }

        public void setType(int i) {
            this.type = i;
        }

        public Object getObj() {
            return this.obj;
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }
    }
}
