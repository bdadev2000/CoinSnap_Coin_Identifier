package com.glority.android.retain.memo27284.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.route.guide.BillingSetPriceBoldRequest;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.retain.base.activity.BaseRetainActivity;
import com.glority.android.retain.memo27284.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Retain27284AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/glority/android/retain/memo27284/activity/Retain27284AActivity;", "Lcom/glority/android/retain/base/activity/BaseRetainActivity;", "()V", "changePrice", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "getLogPageName", "", "retain-ui_27284"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class Retain27284AActivity extends BaseRetainActivity {
    private HashMap _$_findViewCache;

    @Override // com.glority.android.retain.base.activity.BaseRetainActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.glority.android.retain.base.activity.BaseRetainActivity
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "retain_27284a";
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.retain_memo27284_activity_a;
    }

    @Override // com.glority.android.retain.base.activity.IRetainBillingListener
    public void changePrice() {
        TextView tv_then_s_year = (TextView) _$_findCachedViewById(R.id.tv_then_s_year);
        Intrinsics.checkNotNullExpressionValue(tv_then_s_year, "tv_then_s_year");
        new BillingSetPriceBoldRequest(this, tv_then_s_year, Intrinsics.stringPlus(new BillingUIGetCurrencyCodeRequest(getCurrentSku(), null, 2, null).toResult(), " "), new BillingUIGetPriceBySkuRequest(getCurrentSku(), null, 2, null).toResult()).post();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.retain.base.activity.BaseRetainActivity, com.glority.android.ui.base.BaseActivity
    public void doCreateView(Bundle savedInstanceState) {
        super.doCreateView(savedInstanceState);
        TextView tv_content1 = (TextView) _$_findCachedViewById(R.id.tv_content1);
        Intrinsics.checkNotNullExpressionValue(tv_content1, "tv_content1");
        tv_content1.setText(getString(R.string.retain_memo27284_text_unlock_full_access_to_all_picture_this_premium_features, new Object[]{BuildConfig.appName}));
        TextView tv_title2 = (TextView) _$_findCachedViewById(R.id.tv_title2);
        Intrinsics.checkNotNullExpressionValue(tv_title2, "tv_title2");
        tv_title2.setText(getString(R.string.retain_memo27284_text_day_1_day_6, new Object[]{"1", "6"}));
        TextView tv_title3 = (TextView) _$_findCachedViewById(R.id.tv_title3);
        Intrinsics.checkNotNullExpressionValue(tv_title3, "tv_title3");
        tv_title3.setText(getString(R.string.retain_memo27284_text_day_7, new Object[]{"7"}));
        TextView tv_content3 = (TextView) _$_findCachedViewById(R.id.tv_content3);
        Intrinsics.checkNotNullExpressionValue(tv_content3, "tv_content3");
        tv_content3.setText(getString(R.string.retain_memo27284_you_will_be_charged_cancel_anytime_24_hours_before, new Object[]{"24"}));
        changePrice();
        ((TextView) _$_findCachedViewById(R.id.retain_memo27284_tv_restore)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.retain.memo27284.activity.Retain27284AActivity$doCreateView$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Retain27284AActivity.this.restoreClick();
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.retain_memo27284_iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.retain.memo27284.activity.Retain27284AActivity$doCreateView$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Retain27284AActivity.this.closeClick();
            }
        });
        ((TextView) _$_findCachedViewById(R.id.tv_start_my_free_trial)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.retain.memo27284.activity.Retain27284AActivity$doCreateView$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                new GuidePurchaseRequest(Retain27284AActivity.this.getCurrentSku(), null, 2, null).post();
                Retain27284AActivity.this.trackContinue();
            }
        });
    }
}
