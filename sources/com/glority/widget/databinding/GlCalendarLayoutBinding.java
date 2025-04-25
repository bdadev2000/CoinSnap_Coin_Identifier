package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlCalendarLayoutBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView titleTv;
    public final ViewPager2 vp2;

    private GlCalendarLayoutBinding(LinearLayout linearLayout, TextView textView, ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.titleTv = textView;
        this.vp2 = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlCalendarLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlCalendarLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_calendar_layout, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlCalendarLayoutBinding bind(View view) {
        int i = R.id.title_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.vp2;
            ViewPager2 viewPager2 = (ViewPager2) view.findViewById(i);
            if (viewPager2 != null) {
                return new GlCalendarLayoutBinding((LinearLayout) view, textView, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
