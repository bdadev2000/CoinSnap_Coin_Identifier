package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class ItemGlToastLoadingWithMsgBinding implements ViewBinding {
    public final TextView glTv;
    public final ProgressBar iv;
    private final RelativeLayout rootView;

    private ItemGlToastLoadingWithMsgBinding(RelativeLayout relativeLayout, TextView textView, ProgressBar progressBar) {
        this.rootView = relativeLayout;
        this.glTv = textView;
        this.iv = progressBar;
    }

    @Override // androidx.viewbinding.ViewBinding
    public RelativeLayout getRoot() {
        return this.rootView;
    }

    public static ItemGlToastLoadingWithMsgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlToastLoadingWithMsgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gl_toast_loading_with_msg, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlToastLoadingWithMsgBinding bind(View view) {
        int i = R.id.gl_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            i = R.id.iv;
            ProgressBar progressBar = (ProgressBar) view.findViewById(i);
            if (progressBar != null) {
                return new ItemGlToastLoadingWithMsgBinding((RelativeLayout) view, textView, progressBar);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
