package com.glority.base.activity;

import android.content.Intent;
import android.os.Bundle;
import com.glority.android.ui.base.BaseActivity;
import com.glority.base.presenter.IResultManager;
import com.glority.base.utils.HandOnBundleUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CommonActivity.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\"\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\fH\u0016J\u0012\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u001b\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001b\u001a\u00020\fH\u0016R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001f"}, d2 = {"Lcom/glority/base/activity/CommonActivity;", "Lcom/glority/android/ui/base/BaseActivity;", "Lcom/glority/base/presenter/IResultManager;", "<init>", "()V", "resultListenerMap", "", "", "Lcom/glority/base/presenter/IResultManager$OnResultListener;", "getResultListenerMap", "()Ljava/util/Map;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "getLogPageName", "", "onDestroy", "startActivity", "intent", "startActivityForResult", "options", "showProgress", "content", "cancelable", "", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public abstract class CommonActivity extends BaseActivity implements IResultManager {
    public static final int $stable = 8;
    private final Map<Integer, IResultManager.OnResultListener> resultListenerMap = new LinkedHashMap();

    @Override // com.glority.base.presenter.IResultManager
    public void putResultListener(int i, IResultManager.OnResultListener onResultListener) {
        IResultManager.DefaultImpls.putResultListener(this, i, onResultListener);
    }

    @Override // com.glority.base.presenter.IResultManager
    public void requestResult(Intent intent, int i, IResultManager.OnResultListener onResultListener) {
        IResultManager.DefaultImpls.requestResult(this, intent, i, onResultListener);
    }

    @Override // com.glority.base.presenter.IResultManager
    public Map<Integer, IResultManager.OnResultListener> getResultListenerMap() {
        return this.resultListenerMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.ui.base.ThemedActivity, com.glority.android.core.route.RouteableActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        Set<String> keySet;
        Bundle handOnBundleFromBundle = HandOnBundleUtils.INSTANCE.getHandOnBundleFromBundle(this);
        if (handOnBundleFromBundle != null && (keySet = handOnBundleFromBundle.keySet()) != null) {
            for (String str : keySet) {
                updateCommonEventArgs(TuplesKt.to(str, handOnBundleFromBundle.get(str)));
            }
        }
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        IResultManager.DefaultImpls.onActivityResult(this, requestCode, resultCode, data);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "";
    }

    @Override // com.glority.android.ui.base.BaseActivity, com.glority.android.core.route.RouteableActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public void startActivity(Intent intent) {
        Bundle handOnBundleFromLast = HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, intent != null ? intent.getExtras() : null);
        if (handOnBundleFromLast != null && intent != null) {
            intent.putExtras(handOnBundleFromLast);
        }
        super.startActivity(intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Bundle handOnBundleFromLast = HandOnBundleUtils.INSTANCE.getHandOnBundleFromLast(this, intent.getExtras());
        if (handOnBundleFromLast != null) {
            intent.putExtras(handOnBundleFromLast);
        }
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    public void showProgress(String content, boolean cancelable) {
        super.showProgress(content, cancelable);
    }

    @Override // com.glority.android.ui.base.BaseActivity
    public void showProgress() {
        super.showProgress();
    }
}
