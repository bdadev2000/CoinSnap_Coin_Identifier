package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.glority.widget.calender.MonthViewPager;

/* loaded from: classes12.dex */
public final class CvLayoutCalendarViewBinding implements ViewBinding {
    public final FrameLayout frameContent;
    private final View rootView;
    public final MonthViewPager vpMonth;

    private CvLayoutCalendarViewBinding(View view, FrameLayout frameLayout, MonthViewPager monthViewPager) {
        this.rootView = view;
        this.frameContent = frameLayout;
        this.vpMonth = monthViewPager;
    }

    @Override // androidx.viewbinding.ViewBinding
    public View getRoot() {
        return this.rootView;
    }

    public static CvLayoutCalendarViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.cv_layout_calendar_view, viewGroup);
        return bind(viewGroup);
    }

    public static CvLayoutCalendarViewBinding bind(View view) {
        int i = R.id.frameContent;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
        if (frameLayout != null) {
            i = R.id.vp_month;
            MonthViewPager monthViewPager = (MonthViewPager) view.findViewById(i);
            if (monthViewPager != null) {
                return new CvLayoutCalendarViewBinding(view, frameLayout, monthViewPager);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
