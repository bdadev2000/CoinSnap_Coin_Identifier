package com.glority.android.cms.base;

import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.glority.android.adapterhelper.BaseViewHolder;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseItem.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH&J\u001c\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0004J \u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0015"}, d2 = {"Lcom/glority/android/cms/base/BaseItem;", "", "source", "", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "getLayoutId", "", "logEvent", "", NotificationCompat.CATEGORY_EVENT, "bundle", "Landroid/os/Bundle;", "render", "context", "Landroid/content/Context;", "helper", "Lcom/glority/android/adapterhelper/BaseViewHolder;", "data", "Lcom/glority/android/cms/base/ExtraData;", "base-cms_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes14.dex */
public abstract class BaseItem {
    private final String source;

    public abstract int getLayoutId();

    public abstract void render(Context context, BaseViewHolder helper, ExtraData data);

    public BaseItem(String str) {
        this.source = str;
    }

    public final String getSource() {
        return this.source;
    }

    public static /* synthetic */ void logEvent$default(BaseItem baseItem, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseItem.logEvent(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void logEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (bundle == null) {
            bundle = new Bundle();
        }
        new LogEventRequest(event, LogEventArgumentsKt.logEventBundleAdd(bundle, TuplesKt.to("source", this.source))).post();
    }
}
