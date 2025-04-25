package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.glority.widget.R;

/* loaded from: classes12.dex */
public final class GlImagepagerBinding implements ViewBinding {
    public final ImageView backIv;
    public final RelativeLayout bottomIndexContainer;
    public final TextView bottomPageIndexTv;
    public final FrameLayout copyRightContainer;
    public final TextView copyRightTv;
    public final ImageView deleteIv;
    public final TextView desc;
    public final ImageView forwardIv;
    public final View mask;
    private final ConstraintLayout rootView;
    public final ConstraintLayout topIndexContainer;
    public final TextView topPageIndexTv;
    public final TextView tvLabel;
    public final ViewPager2 vp2;

    private GlImagepagerBinding(ConstraintLayout constraintLayout, ImageView imageView, RelativeLayout relativeLayout, TextView textView, FrameLayout frameLayout, TextView textView2, ImageView imageView2, TextView textView3, ImageView imageView3, View view, ConstraintLayout constraintLayout2, TextView textView4, TextView textView5, ViewPager2 viewPager2) {
        this.rootView = constraintLayout;
        this.backIv = imageView;
        this.bottomIndexContainer = relativeLayout;
        this.bottomPageIndexTv = textView;
        this.copyRightContainer = frameLayout;
        this.copyRightTv = textView2;
        this.deleteIv = imageView2;
        this.desc = textView3;
        this.forwardIv = imageView3;
        this.mask = view;
        this.topIndexContainer = constraintLayout2;
        this.topPageIndexTv = textView4;
        this.tvLabel = textView5;
        this.vp2 = viewPager2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static GlImagepagerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlImagepagerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_imagepager, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlImagepagerBinding bind(View view) {
        View findViewById;
        int i = R.id.back_iv;
        ImageView imageView = (ImageView) view.findViewById(i);
        if (imageView != null) {
            i = R.id.bottom_index_container;
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(i);
            if (relativeLayout != null) {
                i = R.id.bottom_page_index_tv;
                TextView textView = (TextView) view.findViewById(i);
                if (textView != null) {
                    i = R.id.copy_right_container;
                    FrameLayout frameLayout = (FrameLayout) view.findViewById(i);
                    if (frameLayout != null) {
                        i = R.id.copy_right_tv;
                        TextView textView2 = (TextView) view.findViewById(i);
                        if (textView2 != null) {
                            i = R.id.delete_iv;
                            ImageView imageView2 = (ImageView) view.findViewById(i);
                            if (imageView2 != null) {
                                i = R.id.desc;
                                TextView textView3 = (TextView) view.findViewById(i);
                                if (textView3 != null) {
                                    i = R.id.forward_iv;
                                    ImageView imageView3 = (ImageView) view.findViewById(i);
                                    if (imageView3 != null && (findViewById = view.findViewById((i = R.id.mask))) != null) {
                                        i = R.id.top_index_container;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) view.findViewById(i);
                                        if (constraintLayout != null) {
                                            i = R.id.top_page_index_tv;
                                            TextView textView4 = (TextView) view.findViewById(i);
                                            if (textView4 != null) {
                                                i = R.id.tv_label;
                                                TextView textView5 = (TextView) view.findViewById(i);
                                                if (textView5 != null) {
                                                    i = R.id.vp2;
                                                    ViewPager2 viewPager2 = (ViewPager2) view.findViewById(i);
                                                    if (viewPager2 != null) {
                                                        return new GlImagepagerBinding((ConstraintLayout) view, imageView, relativeLayout, textView, frameLayout, textView2, imageView2, textView3, imageView3, findViewById, constraintLayout, textView4, textView5, viewPager2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
