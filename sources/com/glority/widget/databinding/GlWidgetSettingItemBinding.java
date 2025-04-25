package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.google.android.material.textview.MaterialTextView;

/* loaded from: classes12.dex */
public final class GlWidgetSettingItemBinding implements ViewBinding {
    public final View bottomLine;
    public final ImageView ivIcon;
    public final ImageView ivRightIcon;
    private final LinearLayout rootView;
    public final SwitchCompat scChecked;
    public final TextView tvDesc;
    public final MaterialTextView tvRightInfo;
    public final TextView tvTitle;

    private GlWidgetSettingItemBinding(LinearLayout linearLayout, View view, ImageView imageView, ImageView imageView2, SwitchCompat switchCompat, TextView textView, MaterialTextView materialTextView, TextView textView2) {
        this.rootView = linearLayout;
        this.bottomLine = view;
        this.ivIcon = imageView;
        this.ivRightIcon = imageView2;
        this.scChecked = switchCompat;
        this.tvDesc = textView;
        this.tvRightInfo = materialTextView;
        this.tvTitle = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlWidgetSettingItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlWidgetSettingItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_widget_setting_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlWidgetSettingItemBinding bind(View view) {
        int i = R.id.bottom_line;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = R.id.iv_icon;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.iv_right_icon;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    i = R.id.sc_checked;
                    SwitchCompat switchCompat = (SwitchCompat) view.findViewById(i);
                    if (switchCompat != null) {
                        i = R.id.tv_desc;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            i = R.id.tv_right_info;
                            MaterialTextView materialTextView = (MaterialTextView) view.findViewById(i);
                            if (materialTextView != null) {
                                i = R.id.tv_title;
                                TextView textView2 = (TextView) view.findViewById(i);
                                if (textView2 != null) {
                                    return new GlWidgetSettingItemBinding((LinearLayout) view, findViewById, imageView, imageView2, switchCompat, textView, materialTextView, textView2);
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
