package com.glority.share.international;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.net.MailTo;
import com.glority.android.core.route.share.SharePlatform;
import com.glority.share.ext.CommonExtensionsKt;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Email.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/glority/share/international/Email;", "Lcom/glority/share/international/IShare;", "context", "Landroid/content/Context;", "text", "", "(Landroid/content/Context;Ljava/lang/String;)V", FirebaseAnalytics.Event.SHARE, "", "base-share_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes9.dex */
public final class Email implements IShare {
    private final Context context;
    private final String text;

    public Email(Context context, String text) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(text, "text");
        this.context = context;
        this.text = text;
    }

    @Override // com.glority.share.international.IShare
    public void share() {
        CommonExtensionsKt.tryCatch(SharePlatform.EMAIL, new Function0<Unit>() { // from class: com.glority.share.international.Email$share$1
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
                String str2;
                Context context;
                Intent intent = new Intent("android.intent.action.SENDTO");
                intent.setData(Uri.parse(MailTo.MAILTO_SCHEME));
                str = Email.this.text;
                intent.putExtra("android.intent.extra.TEXT", str);
                str2 = Email.this.text;
                intent.putExtra("android.intent.extra.SUBJECT", str2);
                context = Email.this.context;
                context.startActivity(intent);
            }
        });
    }
}
