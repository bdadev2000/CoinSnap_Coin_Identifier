package com.glority.android.picturexx.business.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.glority.android.picturexx.business.R;
import com.glority.widget.GlTextView;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public abstract class FragmentEditCollectionDetailBinding extends ViewDataBinding {
    public final GlTextView acquisitionEt;
    public final MaterialButton addMoreBt;
    public final LinearLayout clAcquisitionDate;
    public final LinearLayout containerV;
    public final LinearLayout date;
    public final TextView gradeEt;
    public final LinearLayout gradeLl;
    public final GlTextView gradeTv;
    public final ImageView ivClose;
    public final LinearLayout mintMarkLl;
    public final ImageView mintmarkIv;
    public final LinearLayout moreInfoLl;
    public final EditText nameEt;
    public final EditText notesEt;
    public final GlTextView photoTv;
    public final TextView priceUnitTv;
    public final RecyclerView rv;
    public final MaterialButton saveBt;
    public final TextView seriesEt;
    public final LinearLayout seriesLl;
    public final GlTextView seriesTitleTv;
    public final GlTextView title;
    public final GlTextView tvNameTitle;
    public final EditText valueEt;
    public final GlTextView valueTv;
    public final GlTextView varietyEt;
    public final GlTextView varietyTv;

    /* JADX INFO: Access modifiers changed from: protected */
    public FragmentEditCollectionDetailBinding(Object _bindingComponent, View _root, int _localFieldCount, GlTextView acquisitionEt, MaterialButton addMoreBt, LinearLayout clAcquisitionDate, LinearLayout containerV, LinearLayout date, TextView gradeEt, LinearLayout gradeLl, GlTextView gradeTv, ImageView ivClose, LinearLayout mintMarkLl, ImageView mintmarkIv, LinearLayout moreInfoLl, EditText nameEt, EditText notesEt, GlTextView photoTv, TextView priceUnitTv, RecyclerView rv, MaterialButton saveBt, TextView seriesEt, LinearLayout seriesLl, GlTextView seriesTitleTv, GlTextView title, GlTextView tvNameTitle, EditText valueEt, GlTextView valueTv, GlTextView varietyEt, GlTextView varietyTv) {
        super(_bindingComponent, _root, _localFieldCount);
        this.acquisitionEt = acquisitionEt;
        this.addMoreBt = addMoreBt;
        this.clAcquisitionDate = clAcquisitionDate;
        this.containerV = containerV;
        this.date = date;
        this.gradeEt = gradeEt;
        this.gradeLl = gradeLl;
        this.gradeTv = gradeTv;
        this.ivClose = ivClose;
        this.mintMarkLl = mintMarkLl;
        this.mintmarkIv = mintmarkIv;
        this.moreInfoLl = moreInfoLl;
        this.nameEt = nameEt;
        this.notesEt = notesEt;
        this.photoTv = photoTv;
        this.priceUnitTv = priceUnitTv;
        this.rv = rv;
        this.saveBt = saveBt;
        this.seriesEt = seriesEt;
        this.seriesLl = seriesLl;
        this.seriesTitleTv = seriesTitleTv;
        this.title = title;
        this.tvNameTitle = tvNameTitle;
        this.valueEt = valueEt;
        this.valueTv = valueTv;
        this.varietyEt = varietyEt;
        this.varietyTv = varietyTv;
    }

    public static FragmentEditCollectionDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot) {
        return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEditCollectionDetailBinding inflate(LayoutInflater inflater, ViewGroup root, boolean attachToRoot, Object component) {
        return (FragmentEditCollectionDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_collection_detail, root, attachToRoot, component);
    }

    public static FragmentEditCollectionDetailBinding inflate(LayoutInflater inflater) {
        return inflate(inflater, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEditCollectionDetailBinding inflate(LayoutInflater inflater, Object component) {
        return (FragmentEditCollectionDetailBinding) ViewDataBinding.inflateInternal(inflater, R.layout.fragment_edit_collection_detail, null, false, component);
    }

    public static FragmentEditCollectionDetailBinding bind(View view) {
        return bind(view, DataBindingUtil.getDefaultComponent());
    }

    @Deprecated
    public static FragmentEditCollectionDetailBinding bind(View view, Object component) {
        return (FragmentEditCollectionDetailBinding) bind(component, view, R.layout.fragment_edit_collection_detail);
    }
}
