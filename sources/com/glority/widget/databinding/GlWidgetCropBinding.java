package com.glority.widget.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.glority.widget.R;
import com.glority.widget.scanner.CropPointsView;

/* loaded from: classes12.dex */
public final class GlWidgetCropBinding implements ViewBinding {
    public final CropPointsView cpv;
    public final CardView cvImage;
    public final FrameLayout flContainer;
    public final ImageView iv;
    private final FrameLayout rootView;

    private GlWidgetCropBinding(FrameLayout frameLayout, CropPointsView cropPointsView, CardView cardView, FrameLayout frameLayout2, ImageView imageView) {
        this.rootView = frameLayout;
        this.cpv = cropPointsView;
        this.cvImage = cardView;
        this.flContainer = frameLayout2;
        this.iv = imageView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static GlWidgetCropBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GlWidgetCropBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.gl_widget_crop, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlWidgetCropBinding bind(View view) {
        int i = R.id.cpv;
        CropPointsView cropPointsView = (CropPointsView) view.findViewById(i);
        if (cropPointsView != null) {
            i = R.id.cv_image;
            CardView cardView = (CardView) view.findViewById(i);
            if (cardView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                i = R.id.iv;
                ImageView imageView = (ImageView) view.findViewById(i);
                if (imageView != null) {
                    return new GlWidgetCropBinding(frameLayout, cropPointsView, cardView, frameLayout, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
