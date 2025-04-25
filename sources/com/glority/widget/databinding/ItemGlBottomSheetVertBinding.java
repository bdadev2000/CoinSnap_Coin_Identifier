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
public final class ItemGlBottomSheetVertBinding implements ViewBinding {
    public final TextView desc;
    public final ImageView icon;
    public final FrameLayout ivContainer;
    private final ConstraintLayout rootView;
    public final FrameLayout selectedIv;
    public final TextView title;

    private ItemGlBottomSheetVertBinding(ConstraintLayout constraintLayout, TextView textView, ImageView imageView, FrameLayout frameLayout, FrameLayout frameLayout2, TextView textView2) {
        this.rootView = constraintLayout;
        this.desc = textView;
        this.icon = imageView;
        this.ivContainer = frameLayout;
        this.selectedIv = frameLayout2;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemGlBottomSheetVertBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemGlBottomSheetVertBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_gl_bottom_sheet_vert, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemGlBottomSheetVertBinding bind(View view) {
        int i = R.id.desc;
        TextView textView = (TextView) view.findViewById(i);
        if (textView != null) {
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
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            return new ItemGlBottomSheetVertBinding((ConstraintLayout) view, textView, imageView, frameLayout, frameLayout2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
