package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlArticleviewTableImageItemBinding implements ViewBinding {
    public final ImageView iv1;
    public final ImageView iv2;
    private final LinearLayout rootView;

    private GlArticleviewTableImageItemBinding(LinearLayout linearLayout, ImageView imageView, ImageView imageView2) {
        this.rootView = linearLayout;
        this.iv1 = imageView;
        this.iv2 = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewTableImageItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewTableImageItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_table_image_item, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewTableImageItemBinding bind(View view) {
        int i = R.id.iv1;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.iv2;
            ImageView imageView2 = (ImageView) view.findViewById(i);
            if (imageView2 != null) {
                return new GlArticleviewTableImageItemBinding((LinearLayout) view, imageView, imageView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
