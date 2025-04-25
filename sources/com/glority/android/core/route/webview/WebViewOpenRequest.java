package com.glority.android.core.route.webview;

import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.xx.constants.Args;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WebViewOpenRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nBO\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\rR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000fR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0003\u001a\u00020\u0002¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/glority/android/core/route/webview/WebViewOpenRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "webUrl", Args.title, "headers", "Landroid/os/Bundle;", "isBilling", "", "cache", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZ)V", "logName", "logBundle", "(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZLjava/lang/String;Landroid/os/Bundle;)V", "getCache", "()Z", "getHeaders", "()Landroid/os/Bundle;", "getLogBundle", "getLogName", "()Ljava/lang/String;", "getTitle", "getWebUrl", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class WebViewOpenRequest extends RouteRequest<String> {
    private final boolean cache;
    private final Bundle headers;
    private final boolean isBilling;
    private final Bundle logBundle;
    private final String logName;
    private final String title;
    private final String webUrl;

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Bundle getHeaders() {
        return this.headers;
    }

    /* renamed from: isBilling, reason: from getter */
    public final boolean getIsBilling() {
        return this.isBilling;
    }

    public final boolean getCache() {
        return this.cache;
    }

    public final String getLogName() {
        return this.logName;
    }

    public final Bundle getLogBundle() {
        return this.logBundle;
    }

    public /* synthetic */ WebViewOpenRequest(String str, String str2, Bundle bundle, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewOpenRequest(String webUrl, String title, Bundle bundle, boolean z, boolean z2) {
        super(UrlWebView.INSTANCE.getURL_OPEN(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(webUrl, "webUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.webUrl = webUrl;
        this.title = title;
        this.headers = bundle;
        this.isBilling = z;
        this.cache = z2;
        this.logName = null;
        this.logBundle = null;
    }

    public /* synthetic */ WebViewOpenRequest(String str, String str2, Bundle bundle, boolean z, boolean z2, String str3, Bundle bundle2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bundle, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : bundle2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebViewOpenRequest(String webUrl, String title, Bundle bundle, boolean z, boolean z2, String str, Bundle bundle2) {
        super(UrlWebView.INSTANCE.getURL_OPEN(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(webUrl, "webUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        this.webUrl = webUrl;
        this.title = title;
        this.headers = bundle;
        this.isBilling = z;
        this.cache = z2;
        this.logName = str;
        this.logBundle = bundle2;
    }
}
