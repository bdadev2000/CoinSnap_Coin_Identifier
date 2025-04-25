package com.glority.android.core.route.loginUi;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlLoginUi.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001e\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u0006\""}, d2 = {"Lcom/glority/android/core/route/loginUi/UrlLoginUi;", "", "()V", "MODULE", "", "OPEN_SIGN_ACTIVITY", "getOPEN_SIGN_ACTIVITY", "()Ljava/lang/String;", "setOPEN_SIGN_ACTIVITY", "(Ljava/lang/String;)V", "SET_COMPLETED_TASK", "getSET_COMPLETED_TASK", "setSET_COMPLETED_TASK", "URL_JUMP_CONVERT", "getURL_JUMP_CONVERT", "setURL_JUMP_CONVERT", "URL_LOGIN_OPEN", "getURL_LOGIN_OPEN", "setURL_LOGIN_OPEN", "URL_LOGIN_UI_ACTIVITY_CREATE", "getURL_LOGIN_UI_ACTIVITY_CREATE", "setURL_LOGIN_UI_ACTIVITY_CREATE", "URL_LOGIN_UI_LOG_EVENTS", "getURL_LOGIN_UI_LOG_EVENTS", "setURL_LOGIN_UI_LOG_EVENTS", "URL_LOGIN_UI_PAGE_OPEN", "getURL_LOGIN_UI_PAGE_OPEN", "setURL_LOGIN_UI_PAGE_OPEN", "URL_LOGIN_UI_SET_POLICY_CLICK", "getURL_LOGIN_UI_SET_POLICY_CLICK", "setURL_LOGIN_UI_SET_POLICY_CLICK", "URL_LOGIN_WITH_GOOGLE", "getURL_LOGIN_WITH_GOOGLE", "setURL_LOGIN_WITH_GOOGLE", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlLoginUi {
    public static final UrlLoginUi INSTANCE = new UrlLoginUi();
    private static final String MODULE;
    private static String OPEN_SIGN_ACTIVITY;
    private static String SET_COMPLETED_TASK;
    private static String URL_JUMP_CONVERT;
    private static String URL_LOGIN_OPEN;
    private static String URL_LOGIN_UI_ACTIVITY_CREATE;
    private static String URL_LOGIN_UI_LOG_EVENTS;
    private static String URL_LOGIN_UI_PAGE_OPEN;
    private static String URL_LOGIN_UI_SET_POLICY_CLICK;
    private static String URL_LOGIN_WITH_GOOGLE;

    private UrlLoginUi() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "loginUi");
        MODULE = stringPlus;
        URL_LOGIN_OPEN = Intrinsics.stringPlus(stringPlus, "/url_login_open");
        URL_LOGIN_UI_ACTIVITY_CREATE = Intrinsics.stringPlus(stringPlus, "/url_login_ui_activity_create");
        URL_LOGIN_WITH_GOOGLE = Intrinsics.stringPlus(stringPlus, "/url_login_with_google");
        OPEN_SIGN_ACTIVITY = Intrinsics.stringPlus(stringPlus, "/open_sign_activity");
        SET_COMPLETED_TASK = Intrinsics.stringPlus(stringPlus, "/set_completed_task");
        URL_JUMP_CONVERT = Intrinsics.stringPlus(stringPlus, "/url_jump_convert");
        URL_LOGIN_UI_LOG_EVENTS = Intrinsics.stringPlus(stringPlus, "/url_login_ui_log_events");
        URL_LOGIN_UI_SET_POLICY_CLICK = Intrinsics.stringPlus(stringPlus, "/url_login_ui_set_policy_click");
        URL_LOGIN_UI_PAGE_OPEN = Intrinsics.stringPlus(stringPlus, "/url_login_ui_page_open");
    }

    public final String getURL_LOGIN_OPEN() {
        return URL_LOGIN_OPEN;
    }

    public final void setURL_LOGIN_OPEN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_LOGIN_OPEN = str;
    }

    public final String getURL_LOGIN_UI_ACTIVITY_CREATE() {
        return URL_LOGIN_UI_ACTIVITY_CREATE;
    }

    public final void setURL_LOGIN_UI_ACTIVITY_CREATE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_LOGIN_UI_ACTIVITY_CREATE = str;
    }

    public final String getURL_LOGIN_WITH_GOOGLE() {
        return URL_LOGIN_WITH_GOOGLE;
    }

    public final void setURL_LOGIN_WITH_GOOGLE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_LOGIN_WITH_GOOGLE = str;
    }

    public final String getOPEN_SIGN_ACTIVITY() {
        return OPEN_SIGN_ACTIVITY;
    }

    public final void setOPEN_SIGN_ACTIVITY(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        OPEN_SIGN_ACTIVITY = str;
    }

    public final String getSET_COMPLETED_TASK() {
        return SET_COMPLETED_TASK;
    }

    public final void setSET_COMPLETED_TASK(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        SET_COMPLETED_TASK = str;
    }

    public final String getURL_JUMP_CONVERT() {
        return URL_JUMP_CONVERT;
    }

    public final void setURL_JUMP_CONVERT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_JUMP_CONVERT = str;
    }

    public final String getURL_LOGIN_UI_LOG_EVENTS() {
        return URL_LOGIN_UI_LOG_EVENTS;
    }

    public final void setURL_LOGIN_UI_LOG_EVENTS(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_LOGIN_UI_LOG_EVENTS = str;
    }

    public final String getURL_LOGIN_UI_SET_POLICY_CLICK() {
        return URL_LOGIN_UI_SET_POLICY_CLICK;
    }

    public final void setURL_LOGIN_UI_SET_POLICY_CLICK(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_LOGIN_UI_SET_POLICY_CLICK = str;
    }

    public final String getURL_LOGIN_UI_PAGE_OPEN() {
        return URL_LOGIN_UI_PAGE_OPEN;
    }

    public final void setURL_LOGIN_UI_PAGE_OPEN(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_LOGIN_UI_PAGE_OPEN = str;
    }
}
