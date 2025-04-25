package com.glority.purchase.ui;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.glority.purchase.ui.databinding.BuiDialogInputEmailByReminderBindingImpl;
import com.glority.purchase.ui.databinding.MemshipMemo26284aActivityManageMemberShipBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes9.dex */
public class DataBinderMapperImpl extends DataBinderMapper {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_BUIDIALOGINPUTEMAILBYREMINDER = 1;
    private static final int LAYOUT_MEMSHIPMEMO26284AACTIVITYMANAGEMEMBERSHIP = 2;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.bui_dialog_input_email_by_reminder, 1);
        sparseIntArray.put(R.layout.memship_memo26284a_activity_manage_member_ship, 2);
    }

    @Override // androidx.databinding.DataBinderMapper
    public ViewDataBinding getDataBinder(DataBindingComponent dataBindingComponent, View view, int i) {
        int i2 = INTERNAL_LAYOUT_ID_LOOKUP.get(i);
        if (i2 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i2 == 1) {
            if ("layout/bui_dialog_input_email_by_reminder_0".equals(tag)) {
                return new BuiDialogInputEmailByReminderBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for bui_dialog_input_email_by_reminder is invalid. Received: " + tag);
        }
        if (i2 != 2) {
            return null;
        }
        if ("layout/memship_memo26284a_activity_manage_member_ship_0".equals(tag)) {
            return new MemshipMemo26284aActivityManageMemberShipBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for memship_memo26284a_activity_manage_member_ship is invalid. Received: " + tag);
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
        ArrayList arrayList = new ArrayList(6);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.apis.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.core.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.DataBinderMapperImpl());
        arrayList.add(new com.glority.android.picturexx.payment.DataBinderMapperImpl());
        arrayList.add(new com.glority.base.DataBinderMapperImpl());
        return arrayList;
    }

    /* loaded from: classes9.dex */
    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        private InnerBrLookup() {
        }

        static {
            SparseArray<String> sparseArray = new SparseArray<>(7);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "percentage");
            sparseArray.put(2, "price_per_week");
            sparseArray.put(3, "selected_index");
            sparseArray.put(4, "trialDays");
            sparseArray.put(5, "weekly_price");
            sparseArray.put(6, "yearly_price");
        }
    }

    /* loaded from: classes9.dex */
    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        private InnerLayoutIdLookup() {
        }

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(2);
            sKeys = hashMap;
            hashMap.put("layout/bui_dialog_input_email_by_reminder_0", Integer.valueOf(R.layout.bui_dialog_input_email_by_reminder));
            hashMap.put("layout/memship_memo26284a_activity_manage_member_ship_0", Integer.valueOf(R.layout.memship_memo26284a_activity_manage_member_ship));
        }
    }
}
