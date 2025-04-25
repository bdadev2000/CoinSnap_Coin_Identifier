package com.glority.android.detain.memo26893.activity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.detain.base.BaseDetainActivity;
import com.glority.android.detain.memo26781.R;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Detain26893AActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/glority/android/detain/memo26893/activity/Detain26893AActivity;", "Lcom/glority/android/detain/base/BaseDetainActivity;", "()V", "changePrice", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "getBoldAndColorText", "Landroid/text/SpannableStringBuilder;", "text", "", "content", "color", "", "getLayoutId", "getLogPageName", "onBackPressed", "detain-ui_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes13.dex */
public final class Detain26893AActivity extends BaseDetainActivity {
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
        return "detain_26893a";
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.detain_memo26893_activity_b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.detain.base.BaseDetainActivity, com.glority.android.ui.base.BaseActivity
    public void doCreateView(Bundle savedInstanceState) {
        super.doCreateView(savedInstanceState);
        changePrice();
        ((TextView) _$_findCachedViewById(R.id.detain_memo26893_tv_restore)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.detain.memo26893.activity.Detain26893AActivity$doCreateView$1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Detain26893AActivity.this.restoreClick();
            }
        });
        ((TextView) _$_findCachedViewById(R.id.detain_memo26893_iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.detain.memo26893.activity.Detain26893AActivity$doCreateView$2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Detain26893AActivity.this.closeClick();
            }
        });
        ((TextView) _$_findCachedViewById(R.id.detain_memo26893_tv_detain_continue)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.detain.memo26893.activity.Detain26893AActivity$doCreateView$3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                new GuidePurchaseRequest(Detain26893AActivity.this.getCurrentSku(), null, 2, null).post();
                Detain26893AActivity.this.trackContinue();
            }
        });
        TextView info_tv = (TextView) _$_findCachedViewById(R.id.info_tv);
        Intrinsics.checkExpressionValueIsNotNull(info_tv, "info_tv");
        info_tv.setText("Just try premium for free. The first three days are on us!");
        TextView detain_memo26893_tv_try7_day = (TextView) _$_findCachedViewById(R.id.detain_memo26893_tv_try7_day);
        Intrinsics.checkExpressionValueIsNotNull(detain_memo26893_tv_try7_day, "detain_memo26893_tv_try7_day");
        TextView detain_memo26893_tv_try7_day2 = (TextView) _$_findCachedViewById(R.id.detain_memo26893_tv_try7_day);
        Intrinsics.checkExpressionValueIsNotNull(detain_memo26893_tv_try7_day2, "detain_memo26893_tv_try7_day");
        detain_memo26893_tv_try7_day.setText(StringsKt.replace$default(detain_memo26893_tv_try7_day2.getText().toString(), "7", ExifInterface.GPS_MEASUREMENT_3D, false, 4, (Object) null));
    }

    @Override // com.glority.android.detain.base.BaseDetainActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        trackBackPressed();
    }

    @Override // com.glority.android.detain.base.BaseDetainActivity, com.glority.android.detain.base.IDetainBillingListener
    public void changePrice() {
        String str = new BillingUIGetCurrencyCodeRequest(getCurrentSku(), null, 2, null).toResult() + " " + new BillingUIGetPriceBySkuRequest(getCurrentSku(), null, 2, null).toResult();
        TextView detain_memo26893_tv_then_year_price = (TextView) _$_findCachedViewById(R.id.detain_memo26893_tv_then_year_price);
        Intrinsics.checkExpressionValueIsNotNull(detain_memo26893_tv_then_year_price, "detain_memo26893_tv_then_year_price");
        String string = getString(R.string.detain_memo26893_then_year_cancel_anytime, new Object[]{str});
        Intrinsics.checkExpressionValueIsNotNull(string, "getString(R.string.detai…ar_cancel_anytime, price)");
        detain_memo26893_tv_then_year_price.setText(getBoldAndColorText(string, String.valueOf(new BillingUIGetPriceBySkuRequest(getCurrentSku(), null, 2, null).toResult()), R.color.color_333333));
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
            Intrinsics.checkExpressionValueIsNotNull(append, "spannableBuilder1.append…annableStringBuilder(s2))");
            return append;
        }
        return new SpannableStringBuilder(str);
    }
}
