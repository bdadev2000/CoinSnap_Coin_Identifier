package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.GlTextView;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlItemBottomNavigationBinding implements ViewBinding {
    public final ImageView iv;
    private final LinearLayout rootView;
    public final GlTextView tv;

    private GlItemBottomNavigationBinding(LinearLayout linearLayout, ImageView imageView, GlTextView glTextView) {
        this.rootView = linearLayout;
        this.iv = imageView;
        this.tv = glTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlItemBottomNavigationBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlItemBottomNavigationBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_item_bottom_navigation, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemBottomNavigationBinding bind(View view) {
        int i = R.id.iv;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.tv;
            GlTextView glTextView = (GlTextView) view.findViewById(i);
            if (glTextView != null) {
                return new GlItemBottomNavigationBinding((LinearLayout) view, imageView, glTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
