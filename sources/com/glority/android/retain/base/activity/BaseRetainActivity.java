package com.glority.android.retain.base.activity;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import com.glority.android.core.route.guide.GuideBillingInitRequest;
import com.glority.android.core.route.guide.GuideRestoreRequest;
import com.glority.android.core.route.utils.GetVipStepRequest;
import com.glority.android.ui.base.BaseActivity;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseRetainActivity.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 /2\u00020\u00012\u00020\u0002:\u0001/B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010\u001f\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010\"\u001a\u00020\u001cH\u0004J\u0012\u0010#\u001a\u00020\u001c2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\b\u0010$\u001a\u00020!H\u0002J\"\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\u00112\b\u0010(\u001a\u0004\u0018\u00010)H\u0014J\b\u0010*\u001a\u00020\u001cH\u0016J\b\u0010+\u001a\u00020\u001cH\u0004J\b\u0010,\u001a\u00020\u001cH\u0002J\b\u0010-\u001a\u00020\u001cH\u0004J\b\u0010.\u001a\u00020\u001cH\u0004R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0007\"\u0004\b\u0014\u0010\tR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0007\"\u0004\b\u0017\u0010\tR\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0007\"\u0004\b\u001a\u0010\t¨\u00060"}, d2 = {"Lcom/glority/android/retain/base/activity/BaseRetainActivity;", "Lcom/glority/android/ui/base/BaseActivity;", "Lcom/glority/android/retain/base/activity/IRetainBillingListener;", "()V", "abtestId", "", "getAbtestId", "()Ljava/lang/String;", "setAbtestId", "(Ljava/lang/String;)V", "currentSku", "getCurrentSku", "setCurrentSku", "group", "getGroup", "setGroup", "openPurchaseSuccessRequestCode", "", "pageFrom", "getPageFrom", "setPageFrom", "pageType", "getPageType", "setPageType", "retainId", "getRetainId", "setRetainId", "applyOverrideConfiguration", "", "overrideConfiguration", "Landroid/content/res/Configuration;", "beforeCreate", "savedInstanceState", "Landroid/os/Bundle;", "closeClick", "doCreateView", "getBundle", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "restoreClick", "setActivityOrientation", "trackBackPressed", "trackContinue", "Companion", "base-retain_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes4.dex */
public abstract class BaseRetainActivity extends BaseActivity implements IRetainBillingListener {
    public static final String ARG_ABTEST_ID = "arg_abtest_id";
    public static final String ARG_GROUP = "arg_group";
    public static final String ARG_PAGE_FROM = "arg_page_from";
    public static final String ARG_PAGE_TYPE = "arg_page_type";
    public static final String ARG_RETAIN_ID = "arg_retain_id";
    public static final String ARG_SKU = "arg_sku";
    private HashMap _$_findViewCache;
    private String currentSku;
    private final int openPurchaseSuccessRequestCode = 81;
    private String pageFrom = "";
    private String pageType = "";
    private String group = "";
    private String abtestId = "";
    private String retainId = "";

    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.ui.base.RuntimePermissionActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

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

    public final String getCurrentSku() {
        return this.currentSku;
    }

    public final void setCurrentSku(String str) {
        this.currentSku = str;
    }

    public final String getPageFrom() {
        return this.pageFrom;
    }

    public final void setPageFrom(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pageFrom = str;
    }

    public final String getPageType() {
        return this.pageType;
    }

    public final void setPageType(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.pageType = str;
    }

    public final String getGroup() {
        return this.group;
    }

    public final void setGroup(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.group = str;
    }

    public final String getAbtestId() {
        return this.abtestId;
    }

    public final void setAbtestId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.abtestId = str;
    }

    public final String getRetainId() {
        return this.retainId;
    }

    public final void setRetainId(String str) {
        Intrinsics.checkParameterIsNotNull(str, "<set-?>");
        this.retainId = str;
    }

    @Override // com.glority.android.ui.base.ThemedActivity, android.view.ContextThemeWrapper
    public void applyOverrideConfiguration(Configuration overrideConfiguration) {
        if (overrideConfiguration != null) {
            int i = overrideConfiguration.uiMode;
            Context baseContext = getBaseContext();
            Intrinsics.checkExpressionValueIsNotNull(baseContext, "baseContext");
            Resources resources = baseContext.getResources();
            Intrinsics.checkExpressionValueIsNotNull(resources, "baseContext.resources");
            overrideConfiguration.setTo(resources.getConfiguration());
            overrideConfiguration.uiMode = i;
        }
        super.applyOverrideConfiguration(overrideConfiguration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.BaseActivity
    public void beforeCreate(Bundle savedInstanceState) {
        super.beforeCreate(savedInstanceState);
        setActivityOrientation();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.BaseActivity
    public void doCreateView(Bundle savedInstanceState) {
        new GuideBillingInitRequest(null, 1, null).post();
        this.currentSku = getIntent().getStringExtra("arg_sku");
        String stringExtra = getIntent().getStringExtra("arg_page_type");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.pageType = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("arg_page_from");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.pageFrom = stringExtra2;
        String stringExtra3 = getIntent().getStringExtra("arg_group");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        this.group = stringExtra3;
        String stringExtra4 = getIntent().getStringExtra("arg_abtest_id");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        this.abtestId = stringExtra4;
        String stringExtra5 = getIntent().getStringExtra(ARG_RETAIN_ID);
        this.retainId = stringExtra5 != null ? stringExtra5 : "";
        new LogEventRequest("vip_retain_open", getBundle()).post();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        trackBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == this.openPurchaseSuccessRequestCode) {
            if (resultCode == -1) {
                setResult(-1);
            }
            if (isFinishing()) {
                return;
            }
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void restoreClick() {
        new GuideRestoreRequest(false, null, 3, null).post();
        new LogEventRequest("vip_retain_restore", getBundle()).post();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void closeClick() {
        new LogEventRequest("vip_retain_close", getBundle()).post();
        finish();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void trackContinue() {
        new LogEventRequest("vip_retain_continue", getBundle()).post();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void trackBackPressed() {
        new LogEventRequest("vip_retain_back", getBundle()).post();
    }

    private final void setActivityOrientation() {
        setRequestedOrientation(1);
    }

    private final Bundle getBundle() {
        Pair pair = TuplesKt.to("from", this.pageFrom);
        Pair pair2 = TuplesKt.to("name", this.pageType);
        Pair pair3 = TuplesKt.to(LogEventArguments.ARG_SKU, this.currentSku);
        Pair pair4 = TuplesKt.to("group", this.group);
        Pair pair5 = TuplesKt.to(LogEventArguments.ARG_STRING_1, this.abtestId);
        Locale locale = Locale.getDefault();
        Intrinsics.checkExpressionValueIsNotNull(locale, "Locale.getDefault()");
        return LogEventArgumentsKt.logEventBundleOf(pair, pair2, pair3, pair4, pair5, TuplesKt.to("code", locale.getCountry()), TuplesKt.to(LogEventArguments.ARG_STEP, String.valueOf(new GetVipStepRequest().toResult().intValue())), TuplesKt.to("id", this.retainId));
    }
}
