package com.glority.share.international;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.share.SharePlatform;
import com.glority.share.ShareHandler;
import com.glority.share.ext.CommonExtensionsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Instagram.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/glority/share/international/Instagram;", "Lcom/glority/share/international/IShare;", "context", "Landroid/content/Context;", "imageUri", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;)V", FirebaseAnalytics.Event.SHARE, "", "base-share_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class Instagram implements IShare {
    private final Context context;
    private final Uri imageUri;

    public Instagram(Context context, Uri imageUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(imageUri, "imageUri");
        this.context = context;
        this.imageUri = imageUri;
    }

    @Override // com.glority.share.international.IShare
    public void share() {
        CommonExtensionsKt.tryCatch(SharePlatform.INSTAGRAM, new Function0<Unit>() { // from class: com.glority.share.international.Instagram$share$1
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
                Uri uri;
                Uri uri2;
                Context context;
                if (!SharePlatform.INSTANCE.checkPlatformExit(SharePlatform.INSTAGRAM)) {
                    Router.onResponse(ShareHandler.INSTANCE.getRequestId(), 1);
                    return;
                }
                Intent intent = new Intent("android.intent.action.SEND");
                intent.setPackage(SharePlatform.INSTANCE.getPACKAGE_NAME_INSTAGRAM());
                intent.addFlags(1);
                uri = Instagram.this.imageUri;
                intent.putExtra("android.intent.extra.STREAM", uri);
                uri2 = Instagram.this.imageUri;
                intent.setDataAndType(uri2, "image/*");
                context = Instagram.this.context;
                context.startActivity(intent);
            }
        });
    }
}
