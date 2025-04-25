package com.glority.android.retain.memo26277.activity;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.exifinterface.media.ExifInterface;
import com.glority.android.core.route.guide.BillingUIGetCurrencyCodeRequest;
import com.glority.android.core.route.guide.BillingUIGetPriceBySkuRequest;
import com.glority.android.core.route.guide.GuidePurchaseRequest;
import com.glority.android.retain.base.activity.BaseRetainActivity;
import com.glority.android.retain.memo25060.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: Retain26277AActivity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J \u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0014J\b\u0010\u0010\u001a\u00020\u000bH\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0016¨\u0006\u0012"}, d2 = {"Lcom/glority/android/retain/memo26277/activity/Retain26277AActivity;", "Lcom/glority/android/retain/base/activity/BaseRetainActivity;", "()V", "changePrice", "", "doCreateView", "savedInstanceState", "Landroid/os/Bundle;", "getBoldAndColorText", "Landroid/text/SpannableStringBuilder;", "text", "", "content", "color", "", "getLayoutId", "getLogPageName", "onBackPressed", "retain-ui_25060"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes4.dex */
public final class Retain26277AActivity extends BaseRetainActivity {
    @Override // com.glority.android.retain.base.activity.BaseRetainActivity, com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "retain_26277A";
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.retain_memo26277_activity_b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.retain.base.activity.BaseRetainActivity, com.glority.android.ui.base.BaseActivity
    public void doCreateView(Bundle savedInstanceState) {
        super.doCreateView(savedInstanceState);
        changePrice();
        ((TextView) findViewById(R.id.retain_memo26277_tv_restore)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.retain.memo26277.activity.Retain26277AActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Retain26277AActivity.m7934doCreateView$lambda0(Retain26277AActivity.this, view);
            }
        });
        ((TextView) findViewById(R.id.retain_memo26277_iv_close)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.retain.memo26277.activity.Retain26277AActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Retain26277AActivity.m7935doCreateView$lambda1(Retain26277AActivity.this, view);
            }
        });
        ((TextView) findViewById(R.id.retain_memo26277_tv_detain_continue)).setOnClickListener(new View.OnClickListener() { // from class: com.glority.android.retain.memo26277.activity.Retain26277AActivity$$ExternalSyntheticLambda2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Retain26277AActivity.m7936doCreateView$lambda2(Retain26277AActivity.this, view);
            }
        });
        ((TextView) findViewById(R.id.info_tv)).setText("Just try premium for free. The first three days are on us!");
        ((TextView) findViewById(R.id.retain_memo26277_tv_try7_day)).setText(StringsKt.replace$default(((TextView) findViewById(R.id.retain_memo26277_tv_try7_day)).getText().toString(), "7", ExifInterface.GPS_MEASUREMENT_3D, false, 4, (Object) null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doCreateView$lambda-0, reason: not valid java name */
    public static final void m7934doCreateView$lambda0(Retain26277AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.restoreClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doCreateView$lambda-1, reason: not valid java name */
    public static final void m7935doCreateView$lambda1(Retain26277AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.closeClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: doCreateView$lambda-2, reason: not valid java name */
    public static final void m7936doCreateView$lambda2(Retain26277AActivity this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        new GuidePurchaseRequest(this$0.getCurrentSku(), null, 2, null).post();
        this$0.trackContinue();
    }

    @Override // com.glority.android.retain.base.activity.BaseRetainActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        trackBackPressed();
    }

    @Override // com.glority.android.retain.base.activity.IRetainBillingListener
    public void changePrice() {
        String sb = new StringBuilder().append((Object) new BillingUIGetCurrencyCodeRequest(getCurrentSku(), null, 2, null).toResult()).append(' ').append((Object) new BillingUIGetPriceBySkuRequest(getCurrentSku(), null, 2, null).toResult()).toString();
        TextView textView = (TextView) findViewById(R.id.retain_memo26277_tv_then_year_price);
        String string = getString(R.string.retain_memo26277_then_year_cancel_anytime, new Object[]{sb});
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.retai…ar_cancel_anytime, price)");
        textView.setText(getBoldAndColorText(string, String.valueOf(new BillingUIGetPriceBySkuRequest(getCurrentSku(), null, 2, null).toResult()), R.color.color_333333));
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
