package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.settings.R;
import com.glority.base.widget.ScrollableEditText;

/* loaded from: classes5.dex */
public abstract class FragmentFeedbackBinding extends ViewDataBinding {
    public final Button btnFeedbackSend;
    public final EditText etContact;
    public final ScrollableEditText etContent;
    public final LayoutSettingToolbarBinding naviBar;
    public final RecyclerView rvImage;
    public final TextView tvContactTip;
    public final TextView tvContentTip;
    public final TextView tvImageCount;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentFeedbackBinding(Object obj, View view, int i, Button button, EditText editText, ScrollableEditText scrollableEditText, LayoutSettingToolbarBinding layoutSettingToolbarBinding, RecyclerView recyclerView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.btnFeedbackSend = button;
        this.etContact = editText;
        this.etContent = scrollableEditText;
        this.naviBar = layoutSettingToolbarBinding;
        this.rvImage = recyclerView;
        this.tvContactTip = textView;
        this.tvContentTip = textView2;
        this.tvImageCount = textView3;
    }

    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentFeedbackBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_feedback, viewGroup, z, obj);
    }

    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFeedbackBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentFeedbackBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_feedback, null, false, obj);
    }

    public static FragmentFeedbackBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentFeedbackBinding bind(View view, Object obj) {
        return (FragmentFeedbackBinding) bind(obj, view, R.layout.fragment_feedback);
    }
}
