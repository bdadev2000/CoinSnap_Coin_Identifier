package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.glority.android.cms.base.MarkdownTextView;
import com.glority.android.cmsui2.R;

/* loaded from: classes14.dex */
public final class CmsCommonTitleBinding implements ViewBinding {
    public final AppCompatImageView ivIcon;
    private final LinearLayout rootView;
    public final MarkdownTextView tvTitle;

    private CmsCommonTitleBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, MarkdownTextView markdownTextView) {
        this.rootView = linearLayout;
        this.ivIcon = appCompatImageView;
        this.tvTitle = markdownTextView;
    }

    @Override // androidx.viewbinding.ViewBinding
    public LinearLayout getRoot() {
        return this.rootView;
    }

    public static CmsCommonTitleBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CmsCommonTitleBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.cms_common_title, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static CmsCommonTitleBinding bind(View view) {
        int i = R.id.iv_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(view, i);
        if (appCompatImageView != null) {
            i = R.id.tv_title;
            MarkdownTextView markdownTextView = (MarkdownTextView) ViewBindings.findChildViewById(view, i);
            if (markdownTextView != null) {
                return new CmsCommonTitleBinding((LinearLayout) view, appCompatImageView, markdownTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
