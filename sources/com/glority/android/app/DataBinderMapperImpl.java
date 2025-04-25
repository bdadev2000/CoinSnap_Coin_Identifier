package com.glority.android.app;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(0);

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        if (INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }

    @Override // androidx.databinding.DataBinderMapper
    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.DataBinderMapper
    public String convertBrIdToString(int i) {
        return InnerBrLookup.sKeys.get(i);
    }

    @Override // androidx.databinding.DataBinderMapper
    public List<DataBinderMapper> collectDependencies() {
        ArrayList arrayList = new ArrayList(12);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.apis.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.netpromoterscore.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.business.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.payment.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.recognize.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.settings.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.splash.DataBinderMapperImpl());
        arrayList.add(new com.glority.base.DataBinderMapperImpl());
        arrayList.add(new com.glority.purchase.ui.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(9);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "metalType");
            sparseArray.put(2, "percentage");
            sparseArray.put(3, "price_per_week");
            sparseArray.put(4, "redDotVisible");
            sparseArray.put(5, "selected_index");
            sparseArray.put(6, "trialDays");
            sparseArray.put(7, "weekly_price");
            sparseArray.put(8, "yearly_price");
        }
    }

    /* loaded from: classes.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys = new HashMap<>(0);

        private InnerLayoutIdLookup() {
        }
    }
}
