package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewbinding.ViewBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public final class GlItemSearchRecentBinding implements ViewBinding {
    private final TextView rootView;
    public final TextView tv;

    private GlItemSearchRecentBinding(TextView rootView, TextView tv) {
        this.rootView = rootView;
        this.tv = tv;
    }

    @Override // androidx.viewbinding.ViewBinding
    public TextView getRoot() {
        return this.rootView;
    }

    public static GlItemSearchRecentBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    public static GlItemSearchRecentBinding inflate(LayoutInflater inflater, ViewGroup parent, boolean attachToParent) {
        View inflate = inflater.inflate(R.layout.gl_item_search_recent, parent, false);
        if (attachToParent) {
            parent.addView(inflate);
        }
        return bind(inflate);
    }

    public static GlItemSearchRecentBinding bind(View rootView) {
        if (rootView == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) rootView;
        return new GlItemSearchRecentBinding(textView, textView);
    }
}
