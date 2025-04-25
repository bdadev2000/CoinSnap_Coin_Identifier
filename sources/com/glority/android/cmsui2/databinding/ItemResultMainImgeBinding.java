package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class ItemResultMainImgeBinding implements ViewBinding {
    public final ImageView detailHeaderIv;
    private final ImageView rootView;

    private ItemResultMainImgeBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.detailHeaderIv = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }

    public static ItemResultMainImgeBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemResultMainImgeBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_result_main_imge, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemResultMainImgeBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new ItemResultMainImgeBinding(imageView, imageView);
    }
}
