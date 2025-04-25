package com.glority.android.picturexx.settings.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.picturexx.settings.R;

/* loaded from: classes5.dex */
public abstract class FragmentProfileBinding extends ViewDataBinding {
    public final ConstraintLayout clAvatarContainer;
    public final ConstraintLayout clEmailContainer;
    public final ConstraintLayout clNicknameContainer;
    public final EditText etEmail;
    public final EditText etName;
    public final ImageView ivAvatar;
    public final LayoutSettingToolbarBinding naviBar;
    public final TextView tvAvatarLabel;
    public final TextView tvEmailLabel;
    public final TextView tvNicknameLabel;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentProfileBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, EditText editText, EditText editText2, ImageView imageView, LayoutSettingToolbarBinding layoutSettingToolbarBinding, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.clAvatarContainer = constraintLayout;
        this.clEmailContainer = constraintLayout2;
        this.clNicknameContainer = constraintLayout3;
        this.etEmail = editText;
        this.etName = editText2;
        this.ivAvatar = imageView;
        this.naviBar = layoutSettingToolbarBinding;
        this.tvAvatarLabel = textView;
        this.tvEmailLabel = textView2;
        this.tvNicknameLabel = textView3;
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (FragmentProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile, viewGroup, z, obj);
    }

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (FragmentProfileBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.fragment_profile, null, false, obj);
    }

    public static FragmentProfileBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentProfileBinding bind(View view, Object obj) {
        return (FragmentProfileBinding) bind(obj, view, R.layout.fragment_profile);
    }
}
