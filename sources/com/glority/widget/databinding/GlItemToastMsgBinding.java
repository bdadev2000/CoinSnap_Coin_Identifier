package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlItemToastMsgBinding implements ViewBinding {
    public final TextView glTv;
    private final LinearLayout rootView;

    private GlItemToastMsgBinding(LinearLayout linearLayout, TextView textView) {
        this.rootView = linearLayout;
        this.glTv = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlItemToastMsgBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlItemToastMsgBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_item_toast_msg, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemToastMsgBinding bind(View view) {
        int i = R.id.gl_tv;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
            return new GlItemToastMsgBinding((LinearLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
