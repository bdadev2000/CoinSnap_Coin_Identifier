package com.glority.android.picturexx.splash;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.glority.android.core.utils.data.PersistData;
import com.glority.android.picturexx.constants.ShortcutConstants;
import com.glority.base.activity.CommonActivity;
import com.glority.base.storage.PersistKey;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* compiled from: DeeplinkHandlerActivity.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0014J\b\u0010\n\u001a\u00020\u000bH\u0014¨\u0006\f"}, d2 = {"Lcom/glority/android/picturexx/splash/DeeplinkHandlerActivity;", "Lcom/glority/base/activity/CommonActivity;", "<init>", "()V", "doCreateView", "", "savedInstanceState", "Landroid/os/Bundle;", "getLayoutId", "", "getLogPageName", "", "splash_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes5.dex */
public final class DeeplinkHandlerActivity extends CommonActivity {
    public static final int $stable = 0;

    @Override // com.glority.android.ui.base.BaseActivity
    protected void doCreateView(Bundle savedInstanceState) {
        List<String> pathSegments;
        String str;
        Uri data = getIntent().getData();
        String path = data != null ? data.getPath() : null;
        Pair[] pairArr = new Pair[1];
        if (path == null) {
            path = "";
        }
        pairArr[0] = TuplesKt.to("from", path);
        logEvent("system_deeplink_click", BundleKt.bundleOf(pairArr));
        Uri data2 = getIntent().getData();
        if (data2 != null && (pathSegments = data2.getPathSegments()) != null && (str = (String) CollectionsKt.last((List) pathSegments)) != null && StringsKt.contains$default((CharSequence) str, (CharSequence) ShortcutConstants.ONE_DAY_FREE_SHORTCUT_ID, false, 2, (Object) null) && PersistData.INSTANCE.get(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_EXPIRED_TIME) == null) {
            PersistData.INSTANCE.set(ShortcutConstants.ONE_DAY_FREE_SHORTCUT_EXPIRED_TIME, Long.valueOf(((Number) PersistData.INSTANCE.get(PersistKey.KEY_SERVER_TIME, 0L)).longValue() + 86400000));
        }
        Intent intent = new Intent(this, (Class<?>) SplashActivity.class);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.addFlags(268435456);
        intent.setData(getIntent().getData());
        startActivity(intent);
        finish();
    }

    @Override // com.glority.android.ui.base.BaseActivity
    protected int getLayoutId() {
        return R.layout.activity_deeplink_handler;
    }

    @Override // com.glority.base.activity.CommonActivity, com.glority.android.ui.base.BaseActivity
    protected String getLogPageName() {
        return "deeplinkhandler";
    }
}
