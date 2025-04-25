package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public final class ItemSuggestImageBinding implements ViewBinding {
    private final ConstraintLayout rootView;
    public final ShapeableImageView suggestAddedImage;
    public final ImageView suggestDeletePicture;

    private ItemSuggestImageBinding(ConstraintLayout rootView, ShapeableImageView suggestAddedImage, ImageView suggestDeletePicture) {
        this.rootView = rootView;
        this.suggestAddedImage = suggestAddedImage;
        this.suggestDeletePicture = suggestDeletePicture;
    }

    @Override // androidx.viewbinding.ViewBinding
    public ConstraintLayout getRoot() {
        return this.rootView;
    }

    public static ItemSuggestImageBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSuggestImageBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_suggest_image, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSuggestImageBinding bind(View rootView) {
        int i = R.id.suggest_added_image;
        ShapeableImageView shapeableImageView = (ShapeableImageView) ViewBindings.findChildViewById(rootView, i);
        if (shapeableImageView != null) {
            i = R.id.suggest_delete_picture;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
            if (imageView != null) {
                return new ItemSuggestImageBinding((ConstraintLayout) rootView, shapeableImageView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
