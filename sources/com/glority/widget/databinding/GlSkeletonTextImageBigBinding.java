package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes12.dex */
public final class GlSkeletonTextImageBigBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final ShapeableImageView v1;
    public final ShapeableImageView v10;
    public final ShapeableImageView v11;
    public final ShapeableImageView v12;
    public final ShapeableImageView v13;
    public final ShapeableImageView v2;
    public final ShapeableImageView v20;
    public final ShapeableImageView v21;
    public final ShapeableImageView v22;
    public final ShapeableImageView v23;

    private GlSkeletonTextImageBigBinding(LinearLayout linearLayout, ShapeableImageView shapeableImageView, ShapeableImageView shapeableImageView2, ShapeableImageView shapeableImageView3, ShapeableImageView shapeableImageView4, ShapeableImageView shapeableImageView5, ShapeableImageView shapeableImageView6, ShapeableImageView shapeableImageView7, ShapeableImageView shapeableImageView8, ShapeableImageView shapeableImageView9, ShapeableImageView shapeableImageView10) {
        this.rootView = linearLayout;
        this.v1 = shapeableImageView;
        this.v10 = shapeableImageView2;
        this.v11 = shapeableImageView3;
        this.v12 = shapeableImageView4;
        this.v13 = shapeableImageView5;
        this.v2 = shapeableImageView6;
        this.v20 = shapeableImageView7;
        this.v21 = shapeableImageView8;
        this.v22 = shapeableImageView9;
        this.v23 = shapeableImageView10;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static GlSkeletonTextImageBigBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlSkeletonTextImageBigBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_skeleton_text_image_big, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlSkeletonTextImageBigBinding bind(View view) {
        int i = R.id.v1;
        ShapeableImageView shapeableImageView = (ShapeableImageView) view.findViewById(i);
        if (shapeableImageView != null) {
            i = R.id.v10;
            ShapeableImageView shapeableImageView2 = (ShapeableImageView) view.findViewById(i);
            if (shapeableImageView2 != null) {
                i = R.id.v11;
                ShapeableImageView shapeableImageView3 = (ShapeableImageView) view.findViewById(i);
                if (shapeableImageView3 != null) {
                    i = R.id.v12;
                    ShapeableImageView shapeableImageView4 = (ShapeableImageView) view.findViewById(i);
                    if (shapeableImageView4 != null) {
                        i = R.id.v13;
                        ShapeableImageView shapeableImageView5 = (ShapeableImageView) view.findViewById(i);
                        if (shapeableImageView5 != null) {
                            i = R.id.v2;
                            ShapeableImageView shapeableImageView6 = (ShapeableImageView) view.findViewById(i);
                            if (shapeableImageView6 != null) {
                                i = R.id.v20;
                                ShapeableImageView shapeableImageView7 = (ShapeableImageView) view.findViewById(i);
                                if (shapeableImageView7 != null) {
                                    i = R.id.v21;
                                    ShapeableImageView shapeableImageView8 = (ShapeableImageView) view.findViewById(i);
                                    if (shapeableImageView8 != null) {
                                        i = R.id.v22;
                                        ShapeableImageView shapeableImageView9 = (ShapeableImageView) view.findViewById(i);
                                        if (shapeableImageView9 != null) {
                                            i = R.id.v23;
                                            ShapeableImageView shapeableImageView10 = (ShapeableImageView) view.findViewById(i);
                                            if (shapeableImageView10 != null) {
                                                return new GlSkeletonTextImageBigBinding((LinearLayout) view, shapeableImageView, shapeableImageView2, shapeableImageView3, shapeableImageView4, shapeableImageView5, shapeableImageView6, shapeableImageView7, shapeableImageView8, shapeableImageView9, shapeableImageView10);
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
