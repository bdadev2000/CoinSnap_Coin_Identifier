package com.glority.android.guide.memo51262.databinding;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import androidx.databinding.adapters.ViewBindingAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.guide.memo51262.BR;
import com.glority.android.guide.memo51262.R;

/* loaded from: classes3.dex */
public class BuiMemo512621PurchaseLayoutBindingImpl extends BuiMemo512621PurchaseLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final LinearLayout mboundView1;
    private final LinearLayout mboundView3;
    private final TextView mboundView4;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.sv, 9);
        sparseIntArray.put(R.id.ll_root_container, 10);
        sparseIntArray.put(R.id.tv_17000_local, 11);
        sparseIntArray.put(R.id.tv_nearly_5_years, 12);
        sparseIntArray.put(R.id.tv_yearly_cost, 13);
        sparseIntArray.put(R.id.tv_price_per_week_1, 14);
        sparseIntArray.put(R.id.tv_price_per_week_2, 15);
        sparseIntArray.put(R.id.continue_fl, 16);
        sparseIntArray.put(R.id.iv_anima2, 17);
        sparseIntArray.put(R.id.iv_anima, 18);
        sparseIntArray.put(R.id.policy_tv, 19);
        sparseIntArray.put(R.id.tv_restore, 20);
        sparseIntArray.put(R.id.iv_close, 21);
    }

    public BuiMemo512621PurchaseLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 22, sIncludes, sViewsWithIds));
    }

    private BuiMemo512621PurchaseLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (FrameLayout) objArr[16], (AppCompatTextView) objArr[8], (LottieAnimationView) objArr[18], (LottieAnimationView) objArr[17], (ImageView) objArr[21], (LinearLayout) objArr[10], (LinearLayout) objArr[7], (LinearLayout) objArr[5], (TextView) objArr[19], (ScrollView) objArr[9], (TextView) objArr[11], (TextView) objArr[2], (TextView) objArr[12], (AppCompatTextView) objArr[14], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[20], (AppCompatTextView) objArr[6], (AppCompatTextView) objArr[13]);
        this.mDirtyFlags = -1L;
        this.continueTv.setTag(null);
        this.llYearlyWeeklyItem.setTag(null);
        this.llYearlyYearlyItem.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout;
        linearLayout.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.mboundView3 = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.mboundView4 = textView;
        textView.setTag(null);
        this.tv80Scholars.setTag(null);
        this.tvSavePercentage.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 8L;
        }
        requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean hasPendingBindings() {
        synchronized (this) {
            return this.mDirtyFlags != 0;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean setVariable(int i, Object obj) {
        if (BR.trialDays == i) {
            setTrialDays((Integer) obj);
        } else if (BR.percentage == i) {
            setPercentage((String) obj);
        } else {
            if (BR.selected_index != i) {
                return false;
            }
            setSelectedIndex((Integer) obj);
        }
        return true;
    }

    @Override // com.glority.android.guide.memo51262.databinding.BuiMemo512621PurchaseLayoutBinding
    public void setTrialDays(Integer num) {
        this.mTrialDays = num;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(BR.trialDays);
        super.requestRebind();
    }

    @Override // com.glority.android.guide.memo51262.databinding.BuiMemo512621PurchaseLayoutBinding
    public void setPercentage(String str) {
        this.mPercentage = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(BR.percentage);
        super.requestRebind();
    }

    @Override // com.glority.android.guide.memo51262.databinding.BuiMemo512621PurchaseLayoutBinding
    public void setSelectedIndex(Integer num) {
        this.mSelectedIndex = num;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(BR.selected_index);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        Drawable drawable;
        Drawable drawable2;
        Drawable drawable3;
        int i;
        int i2;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        Integer num = this.mTrialDays;
        String str = this.mPercentage;
        Integer num2 = this.mSelectedIndex;
        String str2 = null;
        String string = (j & 9) != 0 ? this.tv80Scholars.getResources().getString(R.string.bui_memo51262_text_feature_4, num) : null;
        String string2 = (j & 10) != 0 ? this.mboundView4.getResources().getString(R.string.bui_memo51262_text_feature_5, str) : null;
        long j2 = j & 12;
        if (j2 != 0) {
            int safeUnbox = ViewDataBinding.safeUnbox(num2);
            boolean z = safeUnbox == 1;
            boolean z2 = safeUnbox == 0;
            if (j2 != 0) {
                j |= z ? 34816L : 17408L;
            }
            if ((j & 12) != 0) {
                j |= z2 ? 8864L : 4432L;
            }
            drawable = AppCompatResources.getDrawable(this.llYearlyWeeklyItem.getContext(), z ? R.drawable.bui_memo51262_item_selected_bg : R.drawable.bui_memo51262_item_unselected_bg);
            int i3 = z ? 0 : 8;
            Drawable drawable4 = z2 ? AppCompatResources.getDrawable(this.tvSavePercentage.getContext(), R.drawable.bui_memo51262_save_percentage_selected_bg) : AppCompatResources.getDrawable(this.tvSavePercentage.getContext(), R.drawable.bui_memo51262_save_percentage_unselected_bg);
            int i4 = z2 ? 0 : 8;
            String string3 = this.continueTv.getResources().getString(z2 ? R.string.bui_memo51262_vip_button_continue : R.string.bui_memo51262_personal_center_text_try_for_free);
            i2 = i4;
            i = i3;
            drawable3 = drawable4;
            drawable2 = AppCompatResources.getDrawable(this.llYearlyYearlyItem.getContext(), z2 ? R.drawable.bui_memo51262_item_selected_bg : R.drawable.bui_memo51262_item_unselected_bg);
            str2 = string3;
        } else {
            drawable = null;
            drawable2 = null;
            drawable3 = null;
            i = 0;
            i2 = 0;
        }
        if ((j & 12) != 0) {
            TextViewBindingAdapter.setText(this.continueTv, str2);
            ViewBindingAdapter.setBackground(this.llYearlyWeeklyItem, drawable);
            ViewBindingAdapter.setBackground(this.llYearlyYearlyItem, drawable2);
            this.mboundView1.setVisibility(i);
            this.mboundView3.setVisibility(i2);
            ViewBindingAdapter.setBackground(this.tvSavePercentage, drawable3);
        }
        if ((10 & j) != 0) {
            TextViewBindingAdapter.setText(this.mboundView4, string2);
        }
        if ((j & 9) != 0) {
            TextViewBindingAdapter.setText(this.tv80Scholars, string);
        }
    }
}
