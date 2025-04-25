package com.glority.base.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.base.R;
import com.glority.widget.GlDividerView;
import com.glority.widget.GlTextView;

/* loaded from: classes6.dex */
public abstract class ItemContentFeedbackTextBinding extends ViewDataBinding {
    public final ImageView arrowIv;
    public final GlDividerView dividerV;
    public final ImageView iconIv;
    public final TextView infoTv;
    public final GlTextView titleTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public ItemContentFeedbackTextBinding(Object obj, View view, int i, ImageView imageView, GlDividerView glDividerView, ImageView imageView2, TextView textView, GlTextView glTextView) {
        super(obj, view, i);
        this.arrowIv = imageView;
        this.dividerV = glDividerView;
        this.iconIv = imageView2;
        this.infoTv = textView;
        this.titleTv = glTextView;
    }

    public static ItemContentFeedbackTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContentFeedbackTextBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (ItemContentFeedbackTextBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_content_feedback_text, viewGroup, z, obj);
    }

    public static ItemContentFeedbackTextBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContentFeedbackTextBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (ItemContentFeedbackTextBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.item_content_feedback_text, null, false, obj);
    }

    public static ItemContentFeedbackTextBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static ItemContentFeedbackTextBinding bind(View view, Object obj) {
        return (ItemContentFeedbackTextBinding) bind(obj, view, R.layout.item_content_feedback_text);
    }
}
