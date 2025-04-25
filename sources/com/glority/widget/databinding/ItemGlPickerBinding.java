package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class ItemGlPickerBinding implements ViewBinding {
    public final View divider;
    public final ImageView icon;
    public final FrameLayout ivContainer;
    private final ConstraintLayout rootView;
    public final FrameLayout selectedIv;
    public final TextView title;

    private ItemGlPickerBinding(ConstraintLayout constraintLayout, View view, ImageView imageView, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView) {
        this.rootView = constraintLayout;
        this.divider = view;
        this.icon = imageView;
        this.ivContainer = frameLayout;
        this.selectedIv = frameLayout2;
        this.title = textView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemGlPickerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlPickerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gl_picker, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlPickerBinding bind(View view) {
        int i = R.id.divider;
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            i = R.id.icon;
            ImageView imageView = (ImageView) view.findViewById(i);
            if (imageView != null) {
                i = R.id.iv_container;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                if (frameLayout != null) {
                    i = R.id.selected_iv;
                    FrameLayout frameLayout2 = (FrameLayout) view.findViewById(i);
                    if (frameLayout2 != null) {
                        i = R.id.title;
                        TextView textView = (TextView) view.findViewById(i);
                        if (textView != null) {
                            return new ItemGlPickerBinding((ConstraintLayout) view, findViewById, imageView, frameLayout, frameLayout2, textView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
