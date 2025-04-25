package com.glority.android.core.route.abtest;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlAbtest.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/glority/android/core/route/abtest/UrlAbtest;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "setMODULE", "(Ljava/lang/String;)V", "URL_ABTEST_INIT", "getURL_ABTEST_INIT", "setURL_ABTEST_INIT", "URL_ABTEST_LOGIN_UI_MEMO", "getURL_ABTEST_LOGIN_UI_MEMO", "setURL_ABTEST_LOGIN_UI_MEMO", "URL_ABTEST_ORIGINAL_VARIABLE", "getURL_ABTEST_ORIGINAL_VARIABLE", "setURL_ABTEST_ORIGINAL_VARIABLE", "URL_ABTEST_STRING_VARIABLE", "getURL_ABTEST_STRING_VARIABLE", "setURL_ABTEST_STRING_VARIABLE", "URL_ABTEST_TAG_MAP", "getURL_ABTEST_TAG_MAP", "setURL_ABTEST_TAG_MAP", "URL_ABTEST_VARIABLE", "getURL_ABTEST_VARIABLE", "setURL_ABTEST_VARIABLE", "URL_ABTEST_VARIABLE_DATA", "getURL_ABTEST_VARIABLE_DATA", "setURL_ABTEST_VARIABLE_DATA", "URL_ABTEST_VARIABLE_TEST_ID", "getURL_ABTEST_VARIABLE_TEST_ID", "setURL_ABTEST_VARIABLE_TEST_ID", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlAbtest {
    public static final UrlAbtest INSTANCE = new UrlAbtest();
    private static String MODULE;
    private static String URL_ABTEST_INIT;
    private static String URL_ABTEST_LOGIN_UI_MEMO;
    private static String URL_ABTEST_ORIGINAL_VARIABLE;
    private static String URL_ABTEST_STRING_VARIABLE;
    private static String URL_ABTEST_TAG_MAP;
    private static String URL_ABTEST_VARIABLE;
    private static String URL_ABTEST_VARIABLE_DATA;
    private static String URL_ABTEST_VARIABLE_TEST_ID;

    private UrlAbtest() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "abtest");
        MODULE = stringPlus;
        URL_ABTEST_INIT = Intrinsics.stringPlus(stringPlus, "/init");
        URL_ABTEST_TAG_MAP = Intrinsics.stringPlus(MODULE, "/tag_map");
        URL_ABTEST_VARIABLE_DATA = Intrinsics.stringPlus(MODULE, "/get_variable_data");
        URL_ABTEST_ORIGINAL_VARIABLE = Intrinsics.stringPlus(MODULE, "/get_original_variable");
        URL_ABTEST_VARIABLE_TEST_ID = Intrinsics.stringPlus(MODULE, "/get_variable_test_id");
        URL_ABTEST_VARIABLE = Intrinsics.stringPlus(MODULE, "/get_variable");
        URL_ABTEST_STRING_VARIABLE = Intrinsics.stringPlus(MODULE, "/get_string_variable");
        URL_ABTEST_LOGIN_UI_MEMO = Intrinsics.stringPlus(MODULE, "/get_login_ui_memo");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final void setMODULE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        MODULE = str;
    }

    public final String getURL_ABTEST_INIT() {
        return URL_ABTEST_INIT;
    }

    public final void setURL_ABTEST_INIT(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_INIT = str;
    }

    public final String getURL_ABTEST_TAG_MAP() {
        return URL_ABTEST_TAG_MAP;
    }

    public final void setURL_ABTEST_TAG_MAP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_TAG_MAP = str;
    }

    public final String getURL_ABTEST_VARIABLE_DATA() {
        return URL_ABTEST_VARIABLE_DATA;
    }

    public final void setURL_ABTEST_VARIABLE_DATA(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_VARIABLE_DATA = str;
    }

    public final String getURL_ABTEST_ORIGINAL_VARIABLE() {
        return URL_ABTEST_ORIGINAL_VARIABLE;
    }

    public final void setURL_ABTEST_ORIGINAL_VARIABLE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_ORIGINAL_VARIABLE = str;
    }

    public final String getURL_ABTEST_VARIABLE_TEST_ID() {
        return URL_ABTEST_VARIABLE_TEST_ID;
    }

    public final void setURL_ABTEST_VARIABLE_TEST_ID(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_VARIABLE_TEST_ID = str;
    }

    public final String getURL_ABTEST_VARIABLE() {
        return URL_ABTEST_VARIABLE;
    }

    public final void setURL_ABTEST_VARIABLE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_VARIABLE = str;
    }

    public final String getURL_ABTEST_STRING_VARIABLE() {
        return URL_ABTEST_STRING_VARIABLE;
    }

    public final void setURL_ABTEST_STRING_VARIABLE(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_STRING_VARIABLE = str;
    }

    public final String getURL_ABTEST_LOGIN_UI_MEMO() {
        return URL_ABTEST_LOGIN_UI_MEMO;
    }

    public final void setURL_ABTEST_LOGIN_UI_MEMO(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        URL_ABTEST_LOGIN_UI_MEMO = str;
    }
}
