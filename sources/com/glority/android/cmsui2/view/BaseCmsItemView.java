package com.glority.android.cmsui2.view;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.app.NotificationCompat;
import com.glority.android.cmsui2.entity.ExtraData;
import com.glority.android.core.data.LogEventArgumentsKt;
import com.glority.android.core.route.analysis.LogEventRequest;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaseCmsItemView.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0004J \u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H&J\b\u0010\u001a\u001a\u00020\u001bH&J\u0018\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0003J$\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012J$\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006!"}, d2 = {"Lcom/glority/android/cmsui2/view/BaseCmsItemView;", "", "source", "", "<init>", "(Ljava/lang/String;)V", "getSource", "()Ljava/lang/String;", "cmsView", "Lcom/glority/android/cmsui2/view/CmsView;", "getCmsView", "()Lcom/glority/android/cmsui2/view/CmsView;", "setCmsView", "(Lcom/glority/android/cmsui2/view/CmsView;)V", "logEvent", "", NotificationCompat.CATEGORY_EVENT, "bundle", "Landroid/os/Bundle;", "render", "context", "Landroid/content/Context;", "rootView", "Landroid/view/View;", "data", "Lcom/glority/android/cmsui2/entity/ExtraData;", "getLayoutId", "", "sendClickLogEvent", "eventName", "layoutTitle", "sendNewClickLogEvent", "sendLogEventByCmsView", "cmsUI2_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes14.dex */
public abstract class BaseCmsItemView {
    private CmsView cmsView;
    private final String source;

    public abstract int getLayoutId();

    public abstract void render(Context context, View rootView, ExtraData data);

    public BaseCmsItemView(String str) {
        this.source = str;
    }

    public final String getSource() {
        return this.source;
    }

    public final CmsView getCmsView() {
        return this.cmsView;
    }

    public final void setCmsView(CmsView cmsView) {
        this.cmsView = cmsView;
    }

    public static /* synthetic */ void logEvent$default(BaseCmsItemView baseCmsItemView, String str, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logEvent");
        }
        if ((i & 2) != 0) {
            bundle = null;
        }
        baseCmsItemView.logEvent(str, bundle);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void logEvent(String event, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (bundle == null) {
            bundle = new Bundle();
        }
        new LogEventRequest(event, LogEventArgumentsKt.logEventBundleAdd(bundle, TuplesKt.to("source", this.source))).post();
    }

    public final void sendClickLogEvent(String eventName, String layoutTitle) {
        CmsView cmsView;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (layoutTitle == null || (cmsView = this.cmsView) == null) {
            return;
        }
        cmsView.sendClickEvent(eventName, layoutTitle);
    }

    public static /* synthetic */ void sendNewClickLogEvent$default(BaseCmsItemView baseCmsItemView, String str, String str2, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendNewClickLogEvent");
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        baseCmsItemView.sendNewClickLogEvent(str, str2, bundle);
    }

    public final void sendNewClickLogEvent(String eventName, String layoutTitle, Bundle bundle) {
        CmsView cmsView;
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (layoutTitle == null || (cmsView = this.cmsView) == null) {
            return;
        }
        cmsView.sendNewClickEvent(eventName, layoutTitle, bundle);
    }

    public static /* synthetic */ void sendLogEventByCmsView$default(BaseCmsItemView baseCmsItemView, String str, String str2, Bundle bundle, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: sendLogEventByCmsView");
        }
        if ((i & 4) != 0) {
            bundle = null;
        }
        baseCmsItemView.sendLogEventByCmsView(str, str2, bundle);
    }

    public final void sendLogEventByCmsView(String event, String layoutTitle, Bundle bundle) {
        Intrinsics.checkNotNullParameter(event, "event");
        CmsView cmsView = this.cmsView;
        if (cmsView != null) {
            cmsView.logEvent(event, layoutTitle, bundle);
        }
    }
}
