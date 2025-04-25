package com.glority.android.core.route.share;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.utils.UtilsApp;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SharePlatform.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\u001a\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001a\u0010 \u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/glority/android/core/route/share/SharePlatform;", "", "()V", SharePlatform.APP_MESSAGE, "", SharePlatform.EMAIL, SharePlatform.FACEBOOK, "FACEBOOK_MESSAGER", SharePlatform.FACEBOOK_STORY, SharePlatform.INSTAGRAM, SharePlatform.LINE, SharePlatform.MORE, "PACKAGE_NAME_FACEBOOK", "getPACKAGE_NAME_FACEBOOK", "()Ljava/lang/String;", "setPACKAGE_NAME_FACEBOOK", "(Ljava/lang/String;)V", "PACKAGE_NAME_INSTAGRAM", "getPACKAGE_NAME_INSTAGRAM", "setPACKAGE_NAME_INSTAGRAM", "PACKAGE_NAME_LINE", "getPACKAGE_NAME_LINE", "setPACKAGE_NAME_LINE", "PACKAGE_NAME_MESSAGE", "getPACKAGE_NAME_MESSAGE", "setPACKAGE_NAME_MESSAGE", "PACKAGE_NAME_MESSENGER", "getPACKAGE_NAME_MESSENGER", "setPACKAGE_NAME_MESSENGER", "PACKAGE_NAME_TWITTER", "getPACKAGE_NAME_TWITTER", "setPACKAGE_NAME_TWITTER", "PACKAGE_NAME_WHATSAPP", "getPACKAGE_NAME_WHATSAPP", "setPACKAGE_NAME_WHATSAPP", SharePlatform.TWITTER, "WHATSAPP", "checkPlatformExit", "", "platform", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class SharePlatform {
    public static final String APP_MESSAGE = "APP_MESSAGE";
    public static final String EMAIL = "EMAIL";
    public static final String FACEBOOK = "FACEBOOK";
    public static final String FACEBOOK_MESSAGER = "FACEBOOK_MESSENGER";
    public static final String FACEBOOK_STORY = "FACEBOOK_STORY";
    public static final String INSTAGRAM = "INSTAGRAM";
    public static final String LINE = "LINE";
    public static final String MORE = "MORE";
    public static final String TWITTER = "TWITTER";
    public static final String WHATSAPP = "WHATS_APP";
    public static final SharePlatform INSTANCE = new SharePlatform();
    private static String PACKAGE_NAME_FACEBOOK = "com.facebook.katana";
    private static String PACKAGE_NAME_WHATSAPP = "com.whatsapp";
    private static String PACKAGE_NAME_INSTAGRAM = "com.instagram.android";
    private static String PACKAGE_NAME_MESSENGER = "com.facebook.orca";
    private static String PACKAGE_NAME_LINE = "jp.naver.line.android";
    private static String PACKAGE_NAME_TWITTER = "com.twitter.android";
    private static String PACKAGE_NAME_MESSAGE = "com.android.mms";

    private SharePlatform() {
    }

    public final String getPACKAGE_NAME_FACEBOOK() {
        return PACKAGE_NAME_FACEBOOK;
    }

    public final void setPACKAGE_NAME_FACEBOOK(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PACKAGE_NAME_FACEBOOK = str;
    }

    public final String getPACKAGE_NAME_WHATSAPP() {
        return PACKAGE_NAME_WHATSAPP;
    }

    public final void setPACKAGE_NAME_WHATSAPP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PACKAGE_NAME_WHATSAPP = str;
    }

    public final String getPACKAGE_NAME_INSTAGRAM() {
        return PACKAGE_NAME_INSTAGRAM;
    }

    public final void setPACKAGE_NAME_INSTAGRAM(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PACKAGE_NAME_INSTAGRAM = str;
    }

    public final String getPACKAGE_NAME_MESSENGER() {
        return PACKAGE_NAME_MESSENGER;
    }

    public final void setPACKAGE_NAME_MESSENGER(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PACKAGE_NAME_MESSENGER = str;
    }

    public final String getPACKAGE_NAME_LINE() {
        return PACKAGE_NAME_LINE;
    }

    public final void setPACKAGE_NAME_LINE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PACKAGE_NAME_LINE = str;
    }

    public final String getPACKAGE_NAME_TWITTER() {
        return PACKAGE_NAME_TWITTER;
    }

    public final void setPACKAGE_NAME_TWITTER(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PACKAGE_NAME_TWITTER = str;
    }

    public final String getPACKAGE_NAME_MESSAGE() {
        return PACKAGE_NAME_MESSAGE;
    }

    public final void setPACKAGE_NAME_MESSAGE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        PACKAGE_NAME_MESSAGE = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final boolean checkPlatformExit(String platform) {
        String str;
        ApplicationInfo applicationInfo;
        Intrinsics.checkNotNullParameter(platform, "platform");
        switch (platform.hashCode()) {
            case -1658829871:
                if (platform.equals(WHATSAPP)) {
                    str = PACKAGE_NAME_WHATSAPP;
                    break;
                }
                str = "";
                break;
            case -1479469166:
                if (platform.equals(INSTAGRAM)) {
                    str = PACKAGE_NAME_INSTAGRAM;
                    break;
                }
                str = "";
                break;
            case -198363565:
                if (platform.equals(TWITTER)) {
                    str = PACKAGE_NAME_TWITTER;
                    break;
                }
                str = "";
                break;
            case 2336756:
                if (platform.equals(LINE)) {
                    str = PACKAGE_NAME_LINE;
                    break;
                }
                str = "";
                break;
            case 1216680122:
                if (platform.equals(FACEBOOK_MESSAGER)) {
                    str = PACKAGE_NAME_MESSENGER;
                    break;
                }
                str = "";
                break;
            case 1279756998:
                if (platform.equals(FACEBOOK)) {
                    str = PACKAGE_NAME_FACEBOOK;
                    break;
                }
                str = "";
                break;
            case 1742684700:
                if (platform.equals(FACEBOOK_STORY)) {
                    str = PACKAGE_NAME_FACEBOOK;
                    break;
                }
                str = "";
                break;
            case 1789763497:
                if (platform.equals(APP_MESSAGE)) {
                    str = PACKAGE_NAME_MESSAGE;
                    break;
                }
                str = "";
                break;
            default:
                str = "";
                break;
        }
        if (str.length() == 0) {
            return true;
        }
        try {
            applicationInfo = UtilsApp.getApp().getPackageManager().getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        return applicationInfo != null;
    }
}
