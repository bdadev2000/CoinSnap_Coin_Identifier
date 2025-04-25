package com.glority.android.cmsui2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewbinding.ViewBinding;
import com.glority.android.cmsui2.R;
import com.glority.base.widget.webview.JsbWebView;

/* loaded from: classes14.dex */
public final class ItemCmsWebview2Binding implements ViewBinding {
    private final JsbWebView rootView;
    public final JsbWebView wv;

    private ItemCmsWebview2Binding(JsbWebView jsbWebView, JsbWebView jsbWebView2) {
        this.rootView = jsbWebView;
        this.wv = jsbWebView2;
    }

    @Override // androidx.viewbinding.ViewBinding
    public JsbWebView getRoot() {
        return this.rootView;
    }

    public static ItemCmsWebview2Binding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ItemCmsWebview2Binding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View inflate = layoutInflater.inflate(R.layout.item_cms_webview2, viewGroup, false);
        if (z) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    public static ItemCmsWebview2Binding bind(View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        JsbWebView jsbWebView = (JsbWebView) view;
        return new ItemCmsWebview2Binding(jsbWebView, jsbWebView);
    }
}
