package com.glority.share.international;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.webkit.internal.AssetHelper;
import com.glority.android.core.route.share.SharePlatform;
import com.glority.share.ext.CommonExtensionsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Message.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/glority/share/international/Message;", "Lcom/glority/share/international/IShare;", "context", "Landroid/content/Context;", "text", "", "imageUri", "Landroid/net/Uri;", "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V", "sendSmsByuri", "", FirebaseAnalytics.Event.SHARE, "base-share_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class Message implements IShare {
    private final Context context;
    private final Uri imageUri;
    private final String text;

    public Message(Context context, String str, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.text = str;
        this.imageUri = uri;
    }

    @Override // com.glority.share.international.IShare
    public void share() {
        CommonExtensionsKt.tryCatch(SharePlatform.APP_MESSAGE, new Function0<Unit>() { // from class: com.glority.share.international.Message$share$1
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String str;
                Uri uri;
                Context context;
                Uri uri2;
                if (!SharePlatform.INSTANCE.checkPlatformExit(SharePlatform.APP_MESSAGE)) {
                    Message.this.sendSmsByuri();
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setPackage(SharePlatform.INSTANCE.getPACKAGE_NAME_MESSAGE());
                intent.addFlags(1);
                str = Message.this.text;
                intent.putExtra("sms_body", str);
                uri = Message.this.imageUri;
                if (uri != null) {
                    uri2 = Message.this.imageUri;
                    intent.putExtra("android.intent.extra.STREAM", uri2);
                    intent.setType("image/*");
                } else {
                    intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
                }
                context = Message.this.context;
                context.startActivity(intent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendSmsByuri() {
        Intent intent = new Intent("android.intent.action.SEND", Uri.fromParts("smsto", "", null));
        intent.addFlags(1);
        intent.putExtra("sms_body", this.text);
        Uri uri = this.imageUri;
        if (uri != null) {
            intent.putExtra("android.intent.extra.STREAM", uri);
            intent.setType("image/*");
        } else {
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
        }
        this.context.startActivity(intent);
    }
}
