package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlToolTipsStartEndBinding implements ViewBinding {
    public final ImageView archer1;
    public final ImageView archer2;
    public final FrameLayout container;
    private final LinearLayout rootView;

    private GlToolTipsStartEndBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2, FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.archer1 = imageView;
        this.archer2 = imageView2;
        this.container = frameLayout;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlToolTipsStartEndBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlToolTipsStartEndBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_tool_tips_start_end, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlToolTipsStartEndBinding bind(View view) {
        int i = R.id.archer_1;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.archer_2;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null) {
                i = R.id.container;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    return new GlToolTipsStartEndBinding((LinearLayout) view, imageView, imageView2, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
