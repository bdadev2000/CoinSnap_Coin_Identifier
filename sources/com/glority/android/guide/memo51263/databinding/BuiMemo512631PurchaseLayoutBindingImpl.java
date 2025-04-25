package com.glority.android.guide.memo51263.databinding;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import androidx.databinding.adapters.TextViewBindingAdapter;
import com.airbnb.lottie.LottieAnimationView;
import com.glority.android.guide.memo51263.BR;
import com.glority.android.guide.memo51263.R;

/* loaded from: classes3.dex */
public class BuiMemo512631PurchaseLayoutBindingImpl extends BuiMemo512631PurchaseLayoutBinding {
    private static final ViewDataBinding.IncludedLayouts sIncludes = null;
    private static final SparseIntArray sViewsWithIds;
    private long mDirtyFlags;
    private final ConstraintLayout mboundView0;
    private final LinearLayout mboundView1;
    private final AppCompatTextView mboundView10;
    private final AppCompatImageView mboundView12;
    private final AppCompatTextView mboundView13;
    private final AppCompatTextView mboundView14;
    private final LinearLayout mboundView3;
    private final TextView mboundView4;
    private final AppCompatImageView mboundView5;
    private final AppCompatTextView mboundView6;
    private final AppCompatTextView mboundView7;
    private final AppCompatImageView mboundView8;
    private final AppCompatImageView mboundView9;

    @Override // androidx.databinding.ViewDataBinding
    protected boolean onFieldChange(int i, Object obj, int i2) {
        return false;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sViewsWithIds = sparseIntArray;
        sparseIntArray.put(R.id.sv, 17);
        sparseIntArray.put(R.id.ll_root_container, 18);
        sparseIntArray.put(R.id.tv_17000_local, 19);
        sparseIntArray.put(R.id.tv_nearly_5_years, 20);
        sparseIntArray.put(R.id.cl_weekly_item, 21);
        sparseIntArray.put(R.id.cl_yearly_item, 22);
        sparseIntArray.put(R.id.continue_fl, 23);
        sparseIntArray.put(R.id.iv_anima2, 24);
        sparseIntArray.put(R.id.iv_anima, 25);
        sparseIntArray.put(R.id.tv_reminder_guide, 26);
        sparseIntArray.put(R.id.switch1, 27);
        sparseIntArray.put(R.id.policy_tv, 28);
        sparseIntArray.put(R.id.tv_restore, 29);
        sparseIntArray.put(R.id.iv_close, 30);
    }

    public BuiMemo512631PurchaseLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view) {
        this(dataBindingComponent, view, mapBindings(dataBindingComponent, view, 31, sIncludes, sViewsWithIds));
    }

    private BuiMemo512631PurchaseLayoutBindingImpl(DataBindingComponent dataBindingComponent, View view, Object[] objArr) {
        super(dataBindingComponent, view, 0, (ConstraintLayout) objArr[21], (ConstraintLayout) objArr[22], (FrameLayout) objArr[23], (AppCompatTextView) objArr[15], (LottieAnimationView) objArr[25], (LottieAnimationView) objArr[24], (ImageView) objArr[30], (LinearLayout) objArr[18], (TextView) objArr[28], (LinearLayout) objArr[16], (ScrollView) objArr[17], (SwitchCompat) objArr[27], (TextView) objArr[19], (TextView) objArr[2], (TextView) objArr[20], (AppCompatTextView) objArr[26], (AppCompatTextView) objArr[29], (AppCompatTextView) objArr[11]);
        this.mDirtyFlags = -1L;
        this.continueTv.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.mboundView0 = constraintLayout;
        constraintLayout.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.mboundView1 = linearLayout;
        linearLayout.setTag(null);
        AppCompatTextView appCompatTextView = (AppCompatTextView) objArr[10];
        this.mboundView10 = appCompatTextView;
        appCompatTextView.setTag(null);
        AppCompatImageView appCompatImageView = (AppCompatImageView) objArr[12];
        this.mboundView12 = appCompatImageView;
        appCompatImageView.setTag(null);
        AppCompatTextView appCompatTextView2 = (AppCompatTextView) objArr[13];
        this.mboundView13 = appCompatTextView2;
        appCompatTextView2.setTag(null);
        AppCompatTextView appCompatTextView3 = (AppCompatTextView) objArr[14];
        this.mboundView14 = appCompatTextView3;
        appCompatTextView3.setTag(null);
        LinearLayout linearLayout2 = (LinearLayout) objArr[3];
        this.mboundView3 = linearLayout2;
        linearLayout2.setTag(null);
        TextView textView = (TextView) objArr[4];
        this.mboundView4 = textView;
        textView.setTag(null);
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) objArr[5];
        this.mboundView5 = appCompatImageView2;
        appCompatImageView2.setTag(null);
        AppCompatTextView appCompatTextView4 = (AppCompatTextView) objArr[6];
        this.mboundView6 = appCompatTextView4;
        appCompatTextView4.setTag(null);
        AppCompatTextView appCompatTextView5 = (AppCompatTextView) objArr[7];
        this.mboundView7 = appCompatTextView5;
        appCompatTextView5.setTag(null);
        AppCompatImageView appCompatImageView3 = (AppCompatImageView) objArr[8];
        this.mboundView8 = appCompatImageView3;
        appCompatImageView3.setTag(null);
        AppCompatImageView appCompatImageView4 = (AppCompatImageView) objArr[9];
        this.mboundView9 = appCompatImageView4;
        appCompatImageView4.setTag(null);
        this.reminderLayout.setTag(null);
        this.tv80Scholars.setTag(null);
        this.tvYearlyPrice.setTag(null);
        setRootTag(view);
        invalidateAll();
    }

    @Override // androidx.databinding.ViewDataBinding
    public void invalidateAll() {
        synchronized (this) {
            this.mDirtyFlags = 64L;
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
        if (BR.weekly_price == i) {
            setWeeklyPrice((String) obj);
        } else if (BR.percentage == i) {
            setPercentage((String) obj);
        } else if (BR.selected_index == i) {
            setSelectedIndex((Integer) obj);
        } else if (BR.price_per_week == i) {
            setPricePerWeek((String) obj);
        } else if (BR.yearly_price == i) {
            setYearlyPrice((String) obj);
        } else {
            if (BR.trialDays != i) {
                return false;
            }
            setTrialDays((Integer) obj);
        }
        return true;
    }

    @Override // com.glority.android.guide.memo51263.databinding.BuiMemo512631PurchaseLayoutBinding
    public void setWeeklyPrice(String str) {
        this.mWeeklyPrice = str;
        synchronized (this) {
            this.mDirtyFlags |= 1;
        }
        notifyPropertyChanged(BR.weekly_price);
        super.requestRebind();
    }

    @Override // com.glority.android.guide.memo51263.databinding.BuiMemo512631PurchaseLayoutBinding
    public void setPercentage(String str) {
        this.mPercentage = str;
        synchronized (this) {
            this.mDirtyFlags |= 2;
        }
        notifyPropertyChanged(BR.percentage);
        super.requestRebind();
    }

    @Override // com.glority.android.guide.memo51263.databinding.BuiMemo512631PurchaseLayoutBinding
    public void setSelectedIndex(Integer num) {
        this.mSelectedIndex = num;
        synchronized (this) {
            this.mDirtyFlags |= 4;
        }
        notifyPropertyChanged(BR.selected_index);
        super.requestRebind();
    }

    @Override // com.glority.android.guide.memo51263.databinding.BuiMemo512631PurchaseLayoutBinding
    public void setPricePerWeek(String str) {
        this.mPricePerWeek = str;
        synchronized (this) {
            this.mDirtyFlags |= 8;
        }
        notifyPropertyChanged(BR.price_per_week);
        super.requestRebind();
    }

    @Override // com.glority.android.guide.memo51263.databinding.BuiMemo512631PurchaseLayoutBinding
    public void setYearlyPrice(String str) {
        this.mYearlyPrice = str;
        synchronized (this) {
            this.mDirtyFlags |= 16;
        }
        notifyPropertyChanged(BR.yearly_price);
        super.requestRebind();
    }

    @Override // com.glority.android.guide.memo51263.databinding.BuiMemo512631PurchaseLayoutBinding
    public void setTrialDays(Integer num) {
        this.mTrialDays = num;
        synchronized (this) {
            this.mDirtyFlags |= 32;
        }
        notifyPropertyChanged(BR.trialDays);
        super.requestRebind();
    }

    @Override // androidx.databinding.ViewDataBinding
    protected void executeBindings() {
        long j;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        String str;
        String str2;
        String str3;
        String str4;
        long j2;
        int colorFromResource;
        synchronized (this) {
            j = this.mDirtyFlags;
            this.mDirtyFlags = 0L;
        }
        String str5 = this.mWeeklyPrice;
        String str6 = this.mPercentage;
        Integer num = this.mSelectedIndex;
        String str7 = this.mPricePerWeek;
        String str8 = this.mYearlyPrice;
        Integer num2 = this.mTrialDays;
        String string = (j & 65) != 0 ? this.mboundView13.getResources().getString(R.string.bui_memo51263_3_days_free_then_text, str5) : null;
        String string2 = (j & 66) != 0 ? this.mboundView4.getResources().getString(R.string.bui_memo51263_text_feature_5, str6) : null;
        long j3 = j & 68;
        if (j3 != 0) {
            int safeUnbox = ViewDataBinding.safeUnbox(num);
            boolean z = safeUnbox == 0;
            boolean z2 = safeUnbox == 1;
            if (j3 != 0) {
                j |= z ? 5574656L : 2787328L;
            }
            if ((j & 68) != 0) {
                j |= z2 ? 17664L : 8832L;
            }
            int colorFromResource2 = getColorFromResource(this.mboundView7, z ? R.color.bui_memo51263_theme : R.color.memo_51263_color_2);
            int i8 = z ? 0 : 4;
            i4 = getColorFromResource(this.mboundView6, z ? R.color.bui_memo51263_theme : R.color.memo_51263_color_2);
            i6 = z ? 0 : 8;
            str = z ? this.continueTv.getResources().getString(R.string.bui_memo51263_personal_center_text_try_for_free) : this.continueTv.getResources().getString(R.string.bui_memo51263_vip_button_continue);
            i = getColorFromResource(this.mboundView10, z2 ? R.color.bui_memo51263_theme : R.color.memo_51263_color_2);
            if (z2) {
                j2 = j;
                colorFromResource = getColorFromResource(this.tvYearlyPrice, R.color.bui_memo51263_theme);
            } else {
                j2 = j;
                colorFromResource = getColorFromResource(this.tvYearlyPrice, R.color.memo_51263_color_2);
            }
            int i9 = z2 ? 0 : 8;
            i7 = colorFromResource;
            i5 = i8;
            j = j2;
            i3 = colorFromResource2;
            i2 = i9;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            str = null;
        }
        long j4 = j & 88;
        if (j4 != 0) {
            str3 = string2;
            str2 = string;
            str4 = this.mboundView14.getResources().getString(R.string.bui_memo51263_just_price_per_year_text, str8, str7);
        } else {
            str2 = string;
            str3 = string2;
            str4 = null;
        }
        long j5 = 96 & j;
        String string3 = j5 != 0 ? this.tv80Scholars.getResources().getString(R.string.bui_memo51263_text_feature_4, num2) : null;
        if ((68 & j) != 0) {
            TextViewBindingAdapter.setText(this.continueTv, str);
            this.mboundView1.setVisibility(i6);
            this.mboundView10.setTextColor(i);
            this.mboundView12.setVisibility(i2);
            this.mboundView13.setVisibility(i6);
            this.mboundView14.setVisibility(i2);
            this.mboundView3.setVisibility(i2);
            this.mboundView5.setVisibility(i6);
            this.mboundView6.setTextColor(i4);
            this.mboundView7.setTextColor(i3);
            this.mboundView8.setVisibility(i6);
            this.mboundView9.setVisibility(i2);
            this.reminderLayout.setVisibility(i5);
            this.tvYearlyPrice.setTextColor(i7);
        }
        if ((65 & j) != 0) {
            TextViewBindingAdapter.setText(this.mboundView13, str2);
        }
        if (j4 != 0) {
            TextViewBindingAdapter.setText(this.mboundView14, str4);
        }
        if ((j & 66) != 0) {
            TextViewBindingAdapter.setText(this.mboundView4, str3);
        }
        if (j5 != 0) {
            TextViewBindingAdapter.setText(this.tv80Scholars, string3);
        }
    }
}
