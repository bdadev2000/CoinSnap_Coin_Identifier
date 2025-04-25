package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlItemWeekLayoutItemBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ImageView temTagV;
    public final LinearLayout viewItemWeekLayoutItemContainer;
    public final GlTextView weekCountTv;
    public final TextView weekDayTv;

    private GlItemWeekLayoutItemBinding(LinearLayout linearLayout, ImageView imageView, LinearLayout linearLayout2, GlTextView glTextView, TextView textView) {
        this.rootView = linearLayout;
        this.temTagV = imageView;
        this.viewItemWeekLayoutItemContainer = linearLayout2;
        this.weekCountTv = glTextView;
        this.weekDayTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlItemWeekLayoutItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlItemWeekLayoutItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_item_week_layout_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemWeekLayoutItemBinding bind(View view) {
        int i = R.id.tem_tag_v;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            i = R.id.week_count_tv;
            GlTextView glTextView = (GlTextView) view.findViewById(i);
            if (glTextView != null) {
                i = R.id.week_day_tv;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    return new GlItemWeekLayoutItemBinding(linearLayout, imageView, linearLayout, glTextView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
