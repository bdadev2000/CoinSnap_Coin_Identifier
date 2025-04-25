package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.picturexx.business.R;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class DialogCmsViewTipsBinding implements ViewBinding {
    private final LinearLayout rootView;
    public final TextView tvContent;
    public final MaterialButton tvGotIt;

    private DialogCmsViewTipsBinding(LinearLayout rootView, TextView tvContent, MaterialButton tvGotIt) {
        this.rootView = rootView;
        this.tvContent = tvContent;
        this.tvGotIt = tvGotIt;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static DialogCmsViewTipsBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static DialogCmsViewTipsBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.dialog_cms_view_tips, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static DialogCmsViewTipsBinding bind(View rootView) {
        int i = R.id.tv_content;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, i);
        if (textView != null) {
            i = R.id.tv_got_it;
            MaterialButton materialButton = (MaterialButton) ViewBindings.findChildViewById(rootView, i);
            if (materialButton != null) {
                return new DialogCmsViewTipsBinding((LinearLayout) rootView, textView, materialButton);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }
}
