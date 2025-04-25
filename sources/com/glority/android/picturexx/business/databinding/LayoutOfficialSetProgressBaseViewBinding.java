package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.business.R;

/* loaded from: classes2.dex */
public abstract class LayoutOfficialSetProgressBaseViewBinding extends ViewDataBinding {
    public final ViewSeriesCollectionFolderLayoutBinding icSeriesCollectionFolder;
    public final LinearLayout llOfficialSetContainer;
    public final ProgressBar pbMeSeriesProgress;
    public final AppCompatTextView tvMeSeriesName;
    public final AppCompatTextView tvMeSeriesProgress;

    /* JADX INFO: Access modifiers changed from: protected */
    public LayoutOfficialSetProgressBaseViewBinding(Object _bindingComponent, View _root, int _localFieldCount, ViewSeriesCollectionFolderLayoutBinding icSeriesCollectionFolder, LinearLayout llOfficialSetContainer, ProgressBar pbMeSeriesProgress, AppCompatTextView tvMeSeriesName, AppCompatTextView tvMeSeriesProgress) {
        super(_bindingComponent, _root, _localFieldCount);
        this.icSeriesCollectionFolder = icSeriesCollectionFolder;
        this.llOfficialSetContainer = llOfficialSetContainer;
        this.pbMeSeriesProgress = pbMeSeriesProgress;
        this.tvMeSeriesName = tvMeSeriesName;
        this.tvMeSeriesProgress = tvMeSeriesProgress;
    }

    public static LayoutOfficialSetProgressBaseViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutOfficialSetProgressBaseViewBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (LayoutOfficialSetProgressBaseViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_official_set_progress_base_view, root, attachToRoot, component);
    }

    public static LayoutOfficialSetProgressBaseViewBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutOfficialSetProgressBaseViewBinding inflate(LayoutInflater inflater, Object component) {
        return (LayoutOfficialSetProgressBaseViewBinding) ViewDataBinding.inflateInternal(inflater, R.layout.layout_official_set_progress_base_view, null, false, component);
    }

    public static LayoutOfficialSetProgressBaseViewBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static LayoutOfficialSetProgressBaseViewBinding bind(View view, Object component) {
        return (LayoutOfficialSetProgressBaseViewBinding) bind(component, view, R.layout.layout_official_set_progress_base_view);
    }
}
