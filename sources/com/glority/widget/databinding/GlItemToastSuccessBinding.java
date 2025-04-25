package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlItemToastSuccessBinding implements ViewBinding {
    public final TextView glTv;
    public final ImageView icon;
    private final LinearLayout rootView;

    private GlItemToastSuccessBinding(LinearLayout linearLayout, TextView textView, ImageView imageView) {
        this.rootView = linearLayout;
        this.glTv = textView;
        this.icon = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlItemToastSuccessBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlItemToastSuccessBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_item_toast_success, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemToastSuccessBinding bind(View view) {
        int i = R.id.gl_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                return new GlItemToastSuccessBinding((LinearLayout) view, textView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
