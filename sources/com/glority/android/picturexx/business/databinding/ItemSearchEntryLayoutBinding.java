package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;

/* loaded from: classes2.dex */
public final class ItemSearchEntryLayoutBinding implements ViewBinding {
    public final ConstraintLayout clItemContainer;
    public final TextView dataTimeTv;
    public final LinearLayout infoLl;
    public final ImageView iv;
    public final AppCompatTextView latinNameTv;
    public final ImageView moreIv;
    public final GlTextView nameTv;
    private final CardView rootView;

    private ItemSearchEntryLayoutBinding(CardView rootView, ConstraintLayout clItemContainer, TextView dataTimeTv, LinearLayout infoLl, ImageView iv, AppCompatTextView latinNameTv, ImageView moreIv, GlTextView nameTv) {
        this.rootView = rootView;
        this.clItemContainer = clItemContainer;
        this.dataTimeTv = dataTimeTv;
        this.infoLl = infoLl;
        this.iv = iv;
        this.latinNameTv = latinNameTv;
        this.moreIv = moreIv;
        this.nameTv = nameTv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public CardView getRoot() {
        return this.rootView;
    }

    public static ItemSearchEntryLayoutBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemSearchEntryLayoutBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_search_entry_layout, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemSearchEntryLayoutBinding bind(View rootView) {
        int i = R.id.cl_item_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) ViewBindings.findChildViewById(rootView, i);
        if (constraintLayout != null) {
            i = R.id.data_time_tv;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
            if (textView != null) {
                i = R.id.info_ll;
                LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, i);
                if (linearLayout != null) {
                    i = R.id.iv;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, i);
                    if (imageView != null) {
                        i = R.id.latin_name_tv;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) ViewBindings.findChildViewById(rootView, i);
                        if (appCompatTextView != null) {
                            i = R.id.more_iv;
                            ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, i);
                            if (imageView2 != null) {
                                i = R.id.name_tv;
                                GlTextView glTextView = (GlTextView) ViewBindings.findChildViewById(rootView, i);
                                if (glTextView != null) {
                                    return new ItemSearchEntryLayoutBinding((CardView) rootView, constraintLayout, textView, linearLayout, imageView, appCompatTextView, imageView2, glTextView);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
