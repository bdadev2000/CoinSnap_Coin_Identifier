package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.viewbinding.ViewBinding;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class ItemResultMainImgeShareBinding implements ViewBinding {
    public final ImageView detailHeaderShareIv;
    private final ImageView rootView;

    private ItemResultMainImgeShareBinding(ImageView imageView, ImageView imageView2) {
        this.rootView = imageView;
        this.detailHeaderShareIv = imageView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ImageView getRoot() {
        return this.rootView;
    }

    public static ItemResultMainImgeShareBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemResultMainImgeShareBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_result_main_imge_share, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemResultMainImgeShareBinding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ImageView imageView = (ImageView) view;
        return new ItemResultMainImgeShareBinding(imageView, imageView);
    }
}
