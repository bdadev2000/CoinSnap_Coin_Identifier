package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class ItemHomeBanknotesBinding implements ViewBinding {
    public final CardView llBanknoteOffer;
    private final FrameLayout rootView;

    private ItemHomeBanknotesBinding(FrameLayout rootView, CardView llBanknoteOffer) {
        this.rootView = rootView;
        this.llBanknoteOffer = llBanknoteOffer;
    }

    @Override // androidx.viewbinding.ViewBinding
    public FrameLayout getRoot() {
        return this.rootView;
    }

    public static ItemHomeBanknotesBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static ItemHomeBanknotesBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.item_home_banknotes, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemHomeBanknotesBinding bind(View rootView) {
        int i = R.id.ll_banknote_offer;
        CardView cardView = (CardView) ViewBindings.findChildViewById(rootView, i);
        if (cardView != null) {
            return new ItemHomeBanknotesBinding((FrameLayout) rootView, cardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
