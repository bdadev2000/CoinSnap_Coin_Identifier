package com.glority.share.international;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.glority.android.core.route.Router;
import com.glority.android.core.route.share.SharePlatform;
import com.glority.share.ShareHandler;
import com.glority.share.ext.CommonExtensionsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;

/* compiled from: Line.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/glority/share/international/Line;", "Lcom/glority/share/international/IShare;", "context", "Landroid/content/Context;", "text", "", "imageUri", "Landroid/net/Uri;", "(Landroid/content/Context;Ljava/lang/String;Landroid/net/Uri;)V", FirebaseAnalytics.Event.SHARE, "", "shareImage", "shareLinkUrl", "base-share_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class Line implements IShare {
    private final Context context;
    private final Uri imageUri;
    private final String text;

    public Line(Context context, String str, Uri uri) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.text = str;
        this.imageUri = uri;
    }

    @Override // com.glority.share.international.IShare
    public void share() {
        if (this.imageUri != null) {
            shareImage();
        } else {
            shareLinkUrl();
        }
    }

    private final void shareLinkUrl() {
        CommonExtensionsKt.tryCatch(SharePlatform.LINE, new Function0<Unit>() { // from class: com.glority.share.international.Line$shareLinkUrl$1
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
                Context context;
                String str2;
                str = Line.this.text;
                if (str != null) {
                    String str3 = null;
                    try {
                        StringBuilder sb = new StringBuilder("line://msg/text/");
                        str2 = Line.this.text;
                        str3 = sb.append(URLEncoder.encode(str2, "utf-8")).toString();
                    } catch (UnsupportedEncodingException e) {
                        e.printStackTrace();
                    }
                    context = Line.this.context;
                    context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str3)));
                }
            }
        });
    }

    private final void shareImage() {
        if (!SharePlatform.INSTANCE.checkPlatformExit(SharePlatform.LINE)) {
            Router.onResponse(ShareHandler.INSTANCE.getRequestId(), 1);
            return;
        }
        String package_name_line = SharePlatform.INSTANCE.getPACKAGE_NAME_LINE();
        try {
            String str = this.context.getPackageManager().getPackageInfo(package_name_line, 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "packageInfo.versionName");
            Object[] array = new Regex(InstructionFileId.DOT).split(str, 0).toArray(new String[0]);
            if (array != null) {
                String[] strArr = (String[]) array;
                ComponentName componentName = new ComponentName(package_name_line, (strArr.length <= 0 || Integer.parseInt(strArr[0]) >= 8) ? "jp.naver.line.android.activity.selectchat.SelectChatActivityLaunchActivity" : "jp.naver.line.android.activity.selectchat.SelectChatActivity");
                Intent intent = new Intent("android.intent.action.SEND");
                intent.addFlags(1);
                intent.setComponent(componentName);
                if (intent.resolveActivityInfo(this.context.getPackageManager(), 131072) == null) {
                    intent.setComponent(null);
                    intent.setPackage(package_name_line);
                }
                Uri uri = this.imageUri;
                if (uri != null) {
                    intent.setDataAndType(uri, this.context.getContentResolver().getType(this.imageUri));
                }
                intent.putExtra("android.intent.extra.STREAM", this.imageUri);
                this.context.startActivity(intent);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
    }
}
