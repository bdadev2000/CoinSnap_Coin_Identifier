package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlArticleviewHeaderBinding implements ViewBinding {
    public final ImageView bgIv;
    private final FrameLayout rootView;
    public final CardView userCv;
    public final ImageView userIv;

    private GlArticleviewHeaderBinding(FrameLayout frameLayout, ImageView imageView, CardView cardView, ImageView imageView2) {
        this.rootView = frameLayout;
        this.bgIv = imageView;
        this.userCv = cardView;
        this.userIv = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GlArticleviewHeaderBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlArticleviewHeaderBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_articleview_header, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlArticleviewHeaderBinding bind(View view) {
        int i = R.id.bg_iv;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.user_cv;
            CardView cardView = (CardView) view.findViewById(i);
            if (cardView != null) {
                i = R.id.user_iv;
                ImageView imageView2 = (ImageView) view.findViewById(i);
                if (imageView2 != null) {
                    return new GlArticleviewHeaderBinding((FrameLayout) view, imageView, cardView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
