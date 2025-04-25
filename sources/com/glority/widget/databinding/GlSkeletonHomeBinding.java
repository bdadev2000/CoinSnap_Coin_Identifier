package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes12.dex */
public final class GlSkeletonHomeBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ShapeableImageView v1a;
    public final ShapeableImageView v1b;
    public final ShapeableImageView v1c;
    public final ShapeableImageView v1d;
    public final ShapeableImageView v1e;
    public final ShapeableImageView v1f;
    public final ShapeableImageView v1g;
    public final ShapeableImageView v1h;
    public final ShapeableImageView v2a;
    public final ShapeableImageView v2b;
    public final ShapeableImageView v2c;
    public final ShapeableImageView v2d;
    public final ShapeableImageView v2e;
    public final ShapeableImageView v2f;
    public final ShapeableImageView v2g;
    public final ShapeableImageView v2h;

    private GlSkeletonHomeBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, ShapeableImageView shapeableImageView6, ShapeableImageView shapeableImageView7, ShapeableImageView shapeableImageView8, ShapeableImageView shapeableImageView9, ShapeableImageView shapeableImageView10, ShapeableImageView shapeableImageView11, ShapeableImageView shapeableImageView12, ShapeableImageView shapeableImageView13, ShapeableImageView shapeableImageView14, ShapeableImageView shapeableImageView15, ShapeableImageView shapeableImageView16) {
        this.rootView = linearLayout;
        this.v1a = shapeableImageView;
        this.v1b = shapeableImageView2;
        this.v1c = shapeableImageView3;
        this.v1d = shapeableImageView4;
        this.v1e = shapeableImageView5;
        this.v1f = shapeableImageView6;
        this.v1g = shapeableImageView7;
        this.v1h = shapeableImageView8;
        this.v2a = shapeableImageView9;
        this.v2b = shapeableImageView10;
        this.v2c = shapeableImageView11;
        this.v2d = shapeableImageView12;
        this.v2e = shapeableImageView13;
        this.v2f = shapeableImageView14;
        this.v2g = shapeableImageView15;
        this.v2h = shapeableImageView16;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlSkeletonHomeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlSkeletonHomeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_skeleton_home, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlSkeletonHomeBinding bind(View view) {
        int i = R.id.v1a;
        ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(i);
        if (shapeableImageView != null) {
            i = R.id.v1b;
            ShapeableImageView shapeableImageView2 = (ShapeableImageView) view.findViewById(i);
            if (shapeableImageView2 != null) {
                i = R.id.v1c;
                ShapeableImageView shapeableImageView3 = (ShapeableImageView) view.findViewById(i);
                if (shapeableImageView3 != null) {
                    i = R.id.v1d;
                    ShapeableImageView shapeableImageView4 = (ShapeableImageView) view.findViewById(i);
                    if (shapeableImageView4 != null) {
                        i = R.id.v1e;
                        ShapeableImageView shapeableImageView5 = (ShapeableImageView) view.findViewById(i);
                        if (shapeableImageView5 != null) {
                            i = R.id.v1f;
                            ShapeableImageView shapeableImageView6 = (ShapeableImageView) view.findViewById(i);
                            if (shapeableImageView6 != null) {
                                i = R.id.v1g;
                                ShapeableImageView shapeableImageView7 = (ShapeableImageView) view.findViewById(i);
                                if (shapeableImageView7 != null) {
                                    i = R.id.v1h;
                                    ShapeableImageView shapeableImageView8 = (ShapeableImageView) view.findViewById(i);
                                    if (shapeableImageView8 != null) {
                                        i = R.id.v2a;
                                        ShapeableImageView shapeableImageView9 = (ShapeableImageView) view.findViewById(i);
                                        if (shapeableImageView9 != null) {
                                            i = R.id.v2b;
                                            ShapeableImageView shapeableImageView10 = (ShapeableImageView) view.findViewById(i);
                                            if (shapeableImageView10 != null) {
                                                i = R.id.v2c;
                                                ShapeableImageView shapeableImageView11 = (ShapeableImageView) view.findViewById(i);
                                                if (shapeableImageView11 != null) {
                                                    i = R.id.v2d;
                                                    ShapeableImageView shapeableImageView12 = (ShapeableImageView) view.findViewById(i);
                                                    if (shapeableImageView12 != null) {
                                                        i = R.id.v2e;
                                                        ShapeableImageView shapeableImageView13 = (ShapeableImageView) view.findViewById(i);
                                                        if (shapeableImageView13 != null) {
                                                            i = R.id.v2f;
                                                            ShapeableImageView shapeableImageView14 = (ShapeableImageView) view.findViewById(i);
                                                            if (shapeableImageView14 != null) {
                                                                i = R.id.v2g;
                                                                ShapeableImageView shapeableImageView15 = (ShapeableImageView) view.findViewById(i);
                                                                if (shapeableImageView15 != null) {
                                                                    i = R.id.v2h;
                                                                    ShapeableImageView shapeableImageView16 = (ShapeableImageView) view.findViewById(i);
                                                                    if (shapeableImageView16 != null) {
                                                                        return new GlSkeletonHomeBinding((LinearLayout) view, shapeableImageView, shapeableImageView2, shapeableImageView3, shapeableImageView4, shapeableImageView5, shapeableImageView6, shapeableImageView7, shapeableImageView8, shapeableImageView9, shapeableImageView10, shapeableImageView11, shapeableImageView12, shapeableImageView13, shapeableImageView14, shapeableImageView15, shapeableImageView16);
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
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
