package com.glority.share.international;

import android.content.Context;
import android.net.Uri;
import com.glority.android.core.route.share.SharePlatform;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareBuilder.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\bJ\u0010\u0010\u0011\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/glority/share/international/ShareBuilder;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "platform", "", "shareText", "uri", "Landroid/net/Uri;", "build", "Lcom/glority/share/international/IShare;", "setPlatform", "setText", "text", "setUri", "base-share_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class ShareBuilder {
    private final Context context;
    private String platform;
    private String shareText;
    private Uri uri;

    public ShareBuilder(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.shareText = "";
        this.platform = SharePlatform.FACEBOOK;
    }

    public final Context getContext() {
        return this.context;
    }

    public final IShare build() {
        String str = this.platform;
        switch (str.hashCode()) {
            case -1658829871:
                if (str.equals(SharePlatform.WHATSAPP)) {
                    return new WhatsApp(this.context, this.shareText, this.uri);
                }
                return null;
            case -1479469166:
                if (!str.equals(SharePlatform.INSTAGRAM)) {
                    return null;
                }
                Uri uri = this.uri;
                return uri != null ? new Instagram(this.context, uri) : null;
            case -198363565:
                if (str.equals(SharePlatform.TWITTER)) {
                    return new Twitter(this.context, this.shareText, this.uri);
                }
                return null;
            case 2336756:
                if (str.equals(SharePlatform.LINE)) {
                    return new Line(this.context, this.shareText, this.uri);
                }
                return null;
            case 2372437:
                if (str.equals(SharePlatform.MORE)) {
                    return new ShareMore(this.context, this.shareText, this.uri);
                }
                return null;
            case 66081660:
                if (str.equals(SharePlatform.EMAIL)) {
                    return new Email(this.context, this.shareText);
                }
                return null;
            case 1216680122:
                if (str.equals(SharePlatform.FACEBOOK_MESSAGER)) {
                    return new Messenger(this.context, this.shareText, this.uri);
                }
                return null;
            case 1279756998:
                if (str.equals(SharePlatform.FACEBOOK)) {
                    return new FaceBook(this.context, this.shareText, this.uri);
                }
                return null;
            case 1789763497:
                if (str.equals(SharePlatform.APP_MESSAGE)) {
                    return new Message(this.context, this.shareText, this.uri);
                }
                return null;
            default:
                return null;
        }
    }

    public final ShareBuilder setText(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        this.shareText = text;
        return this;
    }

    public final ShareBuilder setUri(Uri uri) {
        this.uri = uri;
        return this;
    }

    public final ShareBuilder setPlatform(String platform) {
        Intrinsics.checkNotNullParameter(platform, "platform");
        this.platform = platform;
        return this;
    }
}
