package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlBottomSheetBinding implements ViewBinding {
    public final ImageView closeIv;
    public final TextView desc;
    public final ConstraintLayout headerLl;
    private final LinearLayout rootView;
    public final RecyclerView rv;
    public final TextView title;

    private GlBottomSheetBinding(LinearLayout linearLayout, ImageView imageView, TextView textView, ConstraintLayout constraintLayout, RecyclerView recyclerView, TextView textView2) {
        this.rootView = linearLayout;
        this.closeIv = imageView;
        this.desc = textView;
        this.headerLl = constraintLayout;
        this.rv = recyclerView;
        this.title = textView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlBottomSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlBottomSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_bottom_sheet, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlBottomSheetBinding bind(View view) {
        int i = R.id.close_iv;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.desc;
            TextView textView = (TextView) view.findViewById(i);
            if (textView != null) {
                i = R.id.header_ll;
                ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                if (constraintLayout != null) {
                    i = R.id.rv;
                    RecyclerView recyclerView = (RecyclerView) view.findViewById(i);
                    if (recyclerView != null) {
                        i = R.id.title;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            return new GlBottomSheetBinding((LinearLayout) view, imageView, textView, constraintLayout, recyclerView, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
