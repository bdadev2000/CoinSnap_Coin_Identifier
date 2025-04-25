package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.base.databinding.LayoutToolbarBinding;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.imageview.ShapeableImageView;

/* loaded from: classes2.dex */
public abstract class FragmentConsultBinding extends ViewDataBinding {
    public final EditText emailEt;
    public final GlTextView emailTv;
    public final ShapeableImageView headerIv;
    public final TextView noteCountTv;
    public final EditText noteEt;
    public final GlTextView noteTv;
    public final FrameLayout questionFl;
    public final RecyclerView rv;
    public final MaterialButton submitBtn;
    public final LayoutToolbarBinding toolBar;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentConsultBinding(Object _bindingComponent, View _root, int _localFieldCount, EditText emailEt, GlTextView emailTv, ShapeableImageView headerIv, TextView noteCountTv, EditText noteEt, GlTextView noteTv, FrameLayout questionFl, RecyclerView rv, MaterialButton submitBtn, LayoutToolbarBinding toolBar) {
        super(_bindingComponent, _root, _localFieldCount);
        this.emailEt = emailEt;
        this.emailTv = emailTv;
        this.headerIv = headerIv;
        this.noteCountTv = noteCountTv;
        this.noteEt = noteEt;
        this.noteTv = noteTv;
        this.questionFl = questionFl;
        this.rv = rv;
        this.submitBtn = submitBtn;
        this.toolBar = toolBar;
    }

    public static FragmentConsultBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentConsultBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentConsultBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_consult, root, attachToRoot, component);
    }

    public static FragmentConsultBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentConsultBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentConsultBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_consult, null, false, component);
    }

    public static FragmentConsultBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentConsultBinding bind(View view, Object component) {
        return (FragmentConsultBinding) bind(component, view, R.layout.fragment_consult);
    }
}
