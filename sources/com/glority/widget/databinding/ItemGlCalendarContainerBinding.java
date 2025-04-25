package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class ItemGlCalendarContainerBinding implements ViewBinding {
    public final GlItemWeekLayoutItemBinding friLayout;
    public final GlItemWeekLayoutItemBinding monLayout;
    private final LinearLayout rootView;
    public final GlItemWeekLayoutItemBinding satLayout;
    public final GlItemWeekLayoutItemBinding sunLayout;
    public final GlItemWeekLayoutItemBinding thuLayout;
    public final GlItemWeekLayoutItemBinding tueLayout;
    public final GlItemWeekLayoutItemBinding wedLayout;

    private ItemGlCalendarContainerBinding(LinearLayout linearLayout, GlItemWeekLayoutItemBinding glItemWeekLayoutItemBinding, GlItemWeekLayoutItemBinding glItemWeekLayoutItemBinding2, GlItemWeekLayoutItemBinding glItemWeekLayoutItemBinding3, GlItemWeekLayoutItemBinding glItemWeekLayoutItemBinding4, GlItemWeekLayoutItemBinding glItemWeekLayoutItemBinding5, GlItemWeekLayoutItemBinding glItemWeekLayoutItemBinding6, GlItemWeekLayoutItemBinding glItemWeekLayoutItemBinding7) {
        this.rootView = linearLayout;
        this.friLayout = glItemWeekLayoutItemBinding;
        this.monLayout = glItemWeekLayoutItemBinding2;
        this.satLayout = glItemWeekLayoutItemBinding3;
        this.sunLayout = glItemWeekLayoutItemBinding4;
        this.thuLayout = glItemWeekLayoutItemBinding5;
        this.tueLayout = glItemWeekLayoutItemBinding6;
        this.wedLayout = glItemWeekLayoutItemBinding7;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static ItemGlCalendarContainerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlCalendarContainerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gl_calendar_container, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlCalendarContainerBinding bind(View view) {
        int i = R.id.fri_layout;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            GlItemWeekLayoutItemBinding bind = GlItemWeekLayoutItemBinding.bind(findViewById);
            i = R.id.mon_layout;
            View findViewById2 = view.findViewById(i);
            if (findViewById2 != null) {
                GlItemWeekLayoutItemBinding bind2 = GlItemWeekLayoutItemBinding.bind(findViewById2);
                i = R.id.sat_layout;
                View findViewById3 = view.findViewById(i);
                if (findViewById3 != null) {
                    GlItemWeekLayoutItemBinding bind3 = GlItemWeekLayoutItemBinding.bind(findViewById3);
                    i = R.id.sun_layout;
                    View findViewById4 = view.findViewById(i);
                    if (findViewById4 != null) {
                        GlItemWeekLayoutItemBinding bind4 = GlItemWeekLayoutItemBinding.bind(findViewById4);
                        i = R.id.thu_layout;
                        View findViewById5 = view.findViewById(i);
                        if (findViewById5 != null) {
                            GlItemWeekLayoutItemBinding bind5 = GlItemWeekLayoutItemBinding.bind(findViewById5);
                            i = R.id.tue_layout;
                            View findViewById6 = view.findViewById(i);
                            if (findViewById6 != null) {
                                GlItemWeekLayoutItemBinding bind6 = GlItemWeekLayoutItemBinding.bind(findViewById6);
                                i = R.id.wed_layout;
                                View findViewById7 = view.findViewById(i);
                                if (findViewById7 != null) {
                                    return new ItemGlCalendarContainerBinding((LinearLayout) view, bind, bind2, bind3, bind4, bind5, bind6, GlItemWeekLayoutItemBinding.bind(findViewById7));
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
