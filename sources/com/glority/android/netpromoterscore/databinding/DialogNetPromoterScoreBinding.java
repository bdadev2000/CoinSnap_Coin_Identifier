package com.glority.android.netpromoterscore.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.glority.android.netpromoterscore.R;

/* loaded from: classes2.dex */
public abstract class DialogNetPromoterScoreBinding extends ViewDataBinding {
    public final ConstraintLayout clRoot;
    public final AppCompatEditText etNpsExperienceInput;
    public final ImageView ivNpsDialogClose;
    public final ConstraintLayout llNpsHintContainer;
    public final LinearLayout llScoresContainer;
    public final ScrollView npsScrollview;
    public final TextView tvNpsDialogSubmit;
    public final TextView tvNpsDialogTitle;
    public final TextView tvNpsScore00;
    public final TextView tvNpsScore01;
    public final TextView tvNpsScore02;
    public final TextView tvNpsScore03;
    public final TextView tvNpsScore04;
    public final TextView tvNpsScore05;
    public final TextView tvNpsScore06;
    public final TextView tvNpsScore07;
    public final TextView tvNpsScore08;
    public final TextView tvNpsScore09;
    public final TextView tvNpsScore10;

    /* JADX INFO: Access modifiers changed from: protected */
    public DialogNetPromoterScoreBinding(Object obj, View view, int i, ConstraintLayout constraintLayout, AppCompatEditText appCompatEditText, ImageView imageView, ConstraintLayout constraintLayout2, LinearLayout linearLayout, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        super(obj, view, i);
        this.clRoot = constraintLayout;
        this.etNpsExperienceInput = appCompatEditText;
        this.ivNpsDialogClose = imageView;
        this.llNpsHintContainer = constraintLayout2;
        this.llScoresContainer = linearLayout;
        this.npsScrollview = scrollView;
        this.tvNpsDialogSubmit = textView;
        this.tvNpsDialogTitle = textView2;
        this.tvNpsScore00 = textView3;
        this.tvNpsScore01 = textView4;
        this.tvNpsScore02 = textView5;
        this.tvNpsScore03 = textView6;
        this.tvNpsScore04 = textView7;
        this.tvNpsScore05 = textView8;
        this.tvNpsScore06 = textView9;
        this.tvNpsScore07 = textView10;
        this.tvNpsScore08 = textView11;
        this.tvNpsScore09 = textView12;
        this.tvNpsScore10 = textView13;
    }

    public static DialogNetPromoterScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return inflate(layoutInflater, viewGroup, z, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogNetPromoterScoreBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (DialogNetPromoterScoreBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_net_promoter_score, viewGroup, z, obj);
    }

    public static DialogNetPromoterScoreBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogNetPromoterScoreBinding inflate(LayoutInflater layoutInflater, Object obj) {
        return (DialogNetPromoterScoreBinding) ViewDataBinding.inflateInternal(layoutInflater, R.layout.dialog_net_promoter_score, null, false, obj);
    }

    public static DialogNetPromoterScoreBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static DialogNetPromoterScoreBinding bind(View view, Object obj) {
        return (DialogNetPromoterScoreBinding) bind(obj, view, R.layout.dialog_net_promoter_score);
    }
}
