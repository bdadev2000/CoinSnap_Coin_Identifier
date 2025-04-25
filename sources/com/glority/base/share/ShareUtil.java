package com.glority.base.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.net.MailTo;
import androidx.webkit.internal.AssetHelper;
import com.glority.android.core.app.AppContext;
import com.glority.android.ui.base.LocaleManager;
import com.glority.base.R;
import com.glority.base.viewmodel.AppViewModel;
import com.glority.component.generatedAPI.kotlinAPI.user.User;
import com.glority.share.international.ShareMore;
import com.glority.utils.app.ResUtils;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ShareUtil.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fJ&\u0010\r\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0002J\u000e\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014J/\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020\u0011\u0018\u0001`\u0016¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/glority/base/share/ShareUtil;", "", "<init>", "()V", "SHARE_APP", "", "SHARE_WALLPAPER", "SHARE_ITEM_NOT_IDENTIFIED", "SHARE_ITEM_IDENTIFIED", "shareAPP", "", "context", "Landroid/content/Context;", "shareInternal", "text", "", "imageUri", "Landroid/net/Uri;", "sendEmail", "activity", "Landroid/app/Activity;", "shareMultiPictures", "Lkotlin/collections/ArrayList;", "Ljava/util/ArrayList;", "(Landroid/content/Context;Ljava/util/ArrayList;)V", "base_release"}, k = 1, mv = {2, 0, 0}, xi = 82)
/* loaded from: classes6.dex */
public final class ShareUtil {
    public static final int $stable = 0;
    public static final ShareUtil INSTANCE = new ShareUtil();
    private static final int SHARE_APP = 1;
    private static final int SHARE_ITEM_IDENTIFIED = 4;
    private static final int SHARE_ITEM_NOT_IDENTIFIED = 3;
    private static final int SHARE_WALLPAPER = 2;

    private ShareUtil() {
    }

    public final void shareAPP(Context context) {
        shareInternal(context, ResUtils.getString(R.string.text_share_app_title, ResUtils.getString(R.string.app_name)) + "\n" + ResUtils.getString(R.string.text_share_app_content) + "\n" + AppViewModel.INSTANCE.getInstance().getShareAppUrl(), null);
    }

    private final void shareInternal(Context context, String text, Uri imageUri) {
        if (context == null || text == null) {
            return;
        }
        new ShareMore(context, text, imageUri).share();
    }

    public final void sendEmail(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intent intent = new Intent("android.intent.action.SENDTO", Uri.parse(MailTo.MAILTO_SCHEME));
        intent.putExtra("android.intent.extra.EMAIL", new String[]{AppContext.INSTANCE.getConfig("contactEmail")});
        int i = R.string.text_share_email_body_template;
        Object[] objArr = new Object[3];
        User value = AppViewModel.INSTANCE.getInstance().getUser().getValue();
        objArr[0] = value != null ? Long.valueOf(value.getUserId()) : "";
        objArr[1] = "Country Code: " + AppViewModel.INSTANCE.getInstance().getCountryCode() + "\nPlatform: Android\nApp Version: " + AppContext.INSTANCE.getConfig("VERSION_NAME") + "\nDevice Brand: " + Build.BRAND + "\nSystem Build Model: " + Build.MODEL + "\nSystem Version: " + Build.VERSION.RELEASE + "\nApp Name: " + ResUtils.getString(R.string.app_name);
        objArr[2] = LocaleManager.getInstance().getLanguage();
        intent.putExtra("android.intent.extra.TEXT", "\n\n\n\n\n" + ResUtils.getString(i, objArr));
        if (intent.resolveActivity(activity.getPackageManager()) != null) {
            activity.startActivity(intent);
        }
    }

    public final void shareMultiPictures(Context context, ArrayList<Uri> imageUri) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
            intent.addFlags(1);
            intent.setType(AssetHelper.DEFAULT_MIME_TYPE);
            intent.putExtra("android.intent.extra.TEXT", "");
            if (imageUri != null) {
                intent.setType("image/*");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", imageUri);
            }
            context.startActivity(Intent.createChooser(intent, " "));
        } catch (Throwable unused) {
        }
    }
}
