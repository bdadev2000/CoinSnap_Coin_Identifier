package com.glority.android.core.route.share;

import android.net.Uri;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.proguard.NotProguard;
import com.glority.android.core.route.RouteRequest;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareRequest.kt */
@NotProguard
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0002\u0010\bR\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/glority/android/core/route/share/ShareRequest;", "Lcom/glority/android/core/route/RouteRequest;", "", "shareText", "", "uri", "Landroid/net/Uri;", "platform", "(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V", "getPlatform", "()Ljava/lang/String;", "setPlatform", "(Ljava/lang/String;)V", "getShareText", "setShareText", "getUri", "()Landroid/net/Uri;", "setUri", "(Landroid/net/Uri;)V", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class ShareRequest extends RouteRequest<Object> {
    private String platform;
    private String shareText;
    private Uri uri;

    public ShareRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ ShareRequest(String str, Uri uri, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : uri, (i & 4) != 0 ? SharePlatform.FACEBOOK : str2);
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final void setShareText(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shareText = str;
    }

    public final Uri getUri() {
        return this.uri;
    }

    public final void setUri(Uri uri) {
        this.uri = uri;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareRequest(String shareText, Uri uri, String platform) {
        super(UrlShare.INSTANCE.getURL_SHARE_INTERNATIONAL(), null, null, 6, null);
        Intrinsics.checkNotNullParameter(shareText, "shareText");
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.shareText = shareText;
        this.uri = uri;
        this.platform = platform;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final void setPlatform(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }
}
