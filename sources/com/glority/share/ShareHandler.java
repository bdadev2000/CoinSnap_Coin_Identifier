package com.glority.share;

import com.glority.android.core.app.AppContext;
import com.glority.android.core.route.RouteHandler;
import com.glority.android.core.route.RouteRequest;
import com.glority.android.core.route.share.ShareRequest;
import com.glority.android.core.route.share.UrlShare;
import com.glority.share.international.IShare;
import com.glority.share.international.ShareBuilder;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareHandler.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0003J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\nH\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/glority/share/ShareHandler;", "Lcom/glority/android/core/route/RouteHandler;", "", "()V", "url", "", "getUrl", "()Ljava/lang/String;", "execute", "request", "Lcom/glority/android/core/route/RouteRequest;", "post", "", "Companion", "base-share_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class ShareHandler implements RouteHandler<Object> {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String requestId = "";
    private final String url = UrlShare.INSTANCE.getURL_SHARE_INTERNATIONAL();

    @Override // com.glority.android.core.route.RouteHandler
    public Object execute(RouteRequest<Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return null;
    }

    @Override // com.glority.android.core.route.RouteHandler
    public Observable<?> getDependency() {
        return RouteHandler.DefaultImpls.getDependency(this);
    }

    @Override // com.glority.android.core.route.RouteHandler
    public String getUrl() {
        return this.url;
    }

    @Override // com.glority.android.core.route.RouteHandler
    public void post(RouteRequest<Object> request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (!(request instanceof ShareRequest)) {
            request = null;
        }
        ShareRequest shareRequest = (ShareRequest) request;
        if (shareRequest != null) {
            requestId = shareRequest.getId();
            IShare build = new ShareBuilder(AppContext.INSTANCE.peekContext()).setText(shareRequest.getShareText()).setUri(shareRequest.getUri()).setPlatform(shareRequest.getPlatform()).build();
            if (build != null) {
                build.share();
            }
        }
    }

    /* compiled from: ShareHandler.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/share/ShareHandler$Companion;", "", "()V", "requestId", "", "getRequestId", "()Ljava/lang/String;", "setRequestId", "(Ljava/lang/String;)V", "base-share_release"}, k = 1, mv = {1, 4, 2})
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getRequestId() {
            return ShareHandler.requestId;
        }

        public final void setRequestId(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            ShareHandler.requestId = str;
        }
    }
}
