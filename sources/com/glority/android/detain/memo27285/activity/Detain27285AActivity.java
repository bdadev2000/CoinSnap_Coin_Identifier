package com.glority.android.detain.memo27285.activity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.glority.android.app.BuildConfig;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.detain.base.BaseDetainActivity;
import com.glority.android.detain.memo27285.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Detain27285AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000bH\u0014¨\u0006\u0011"}, d2 = {"Lcom/glority/android/detain/memo27285/activity/Detain27285AActivity;", "Lcom/glority/android/detain/base/BaseDetainActivity;", "()V", "changePrice", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "getBoldAndColorText", "Landroid/text/SpannableStringBuilder;", "text", "", "content", "color", "", "getLayoutId", "getLogPageName", "detain-ui_25997"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes13.dex */
public final class Detain27285AActivity extends BaseDetainActivity {
    private HashMap _$_findViewCache;

    @Override // com.glority.android.detain.base.BaseDetainActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.glority.android.detain.base.BaseDetainActivity
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
        return "detain_25997a";
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.detain_memo27285_activity_a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.detain.base.BaseDetainActivity, com.glority.android.ui.base.BaseActivity
    public void doCreateView(Bundle savedInstanceState) {
        super.doCreateView(savedInstanceState);
        ((TextView) _$_findCachedViewById(R.id.detain_memo27285_tv_restore)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.detain.memo27285.activity.Detain27285AActivity$doCreateView$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Detain27285AActivity.this.restoreClick();
            }
        });
        ((TextView) _$_findCachedViewById(R.id.detain_memo27285_iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.detain.memo27285.activity.Detain27285AActivity$doCreateView$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Detain27285AActivity.this.closeClick();
            }
        });
        ((TextView) _$_findCachedViewById(R.id.detain_memo27285_tv_detain_continue)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.detain.memo27285.activity.Detain27285AActivity$doCreateView$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                new GuidePurchaseRequest(Detain27285AActivity.this.getCurrentSku(), null, 2, null).post();
                Detain27285AActivity.this.trackContinue();
            }
        });
        changePrice();
        TextView tv_content1 = (TextView) _$_findCachedViewById(R.id.tv_content1);
        Intrinsics.checkNotNullExpressionValue(tv_content1, "tv_content1");
        tv_content1.setText(getString(R.string.detain_memo27285_text_unlock_full_access_to_all_picture_this_premium_features, new Object[]{BuildConfig.appName}));
        TextView tv_day1 = (TextView) _$_findCachedViewById(R.id.tv_day1);
        Intrinsics.checkNotNullExpressionValue(tv_day1, "tv_day1");
        tv_day1.setText(getString(R.string.detain_memo27285_text_day_1_day_6, new Object[]{"1", "6"}));
        TextView tv_day2 = (TextView) _$_findCachedViewById(R.id.tv_day2);
        Intrinsics.checkNotNullExpressionValue(tv_day2, "tv_day2");
        tv_day2.setText(getString(R.string.detain_memo27285_text_day_7, new Object[]{"7"}));
        TextView tv_hour = (TextView) _$_findCachedViewById(R.id.tv_hour);
        Intrinsics.checkNotNullExpressionValue(tv_hour, "tv_hour");
        tv_hour.setText(getString(R.string.detain_memo27285_you_will_be_charged_cancel_anytime_24_hours_before, new Object[]{"24"}));
    }

    @Override // com.glority.android.detain.base.BaseDetainActivity, com.glority.android.detain.base.IDetainBillingListener
    public void changePrice() {
        String str = new BillingUIGetCurrencyCodeRequest(getCurrentSku(), null, 2, null).toResult() + " " + new BillingUIGetPriceBySkuRequest(getCurrentSku(), null, 2, null).toResult();
        TextView detain_memo27285_tv_then_year_price = (TextView) _$_findCachedViewById(R.id.detain_memo27285_tv_then_year_price);
        Intrinsics.checkNotNullExpressionValue(detain_memo27285_tv_then_year_price, "detain_memo27285_tv_then_year_price");
        String string = getString(R.string.detain_memo27285_text_then_s_year_cancel_anytime, new Object[]{str});
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.detai…ar_cancel_anytime, price)");
        detain_memo27285_tv_then_year_price.setText(getBoldAndColorText(string, String.valueOf(new BillingUIGetPriceBySkuRequest(getCurrentSku(), null, 2, null).toResult()), R.color.detain_memo27285_color_333333));
    }

    private final SpannableStringBuilder getBoldAndColorText(String text, String content, int color) {
        String str = text;
        String str2 = content;
        if (StringsKt.contains$default((CharSequence) str, (CharSequence) str2, false, 2, (Object) null)) {
            String str3 = (String) StringsKt.split$default((CharSequence) str, new String[]{content}, false, 0, 6, (Object) null).get(0);
            String str4 = (String) StringsKt.split$default((CharSequence) str, new String[]{content}, false, 0, 6, (Object) null).get(1);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str3);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2);
            StyleSpan styleSpan = new StyleSpan(1);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(color));
            spannableStringBuilder2.setSpan(styleSpan, 0, content.length(), 33);
            spannableStringBuilder2.setSpan(foregroundColorSpan, 0, content.length(), 33);
            SpannableStringBuilder append = spannableStringBuilder.append((CharSequence) spannableStringBuilder2).append((CharSequence) new SpannableStringBuilder(str4));
            Intrinsics.checkNotNullExpressionValue(append, "spannableBuilder1.append…annableStringBuilder(s2))");
            return append;
        }
        return new SpannableStringBuilder(str);
    }
}
