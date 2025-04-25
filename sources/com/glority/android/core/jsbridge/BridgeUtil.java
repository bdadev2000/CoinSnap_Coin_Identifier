package com.glority.android.core.jsbridge;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: BridgeUtil.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004J\u000e\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u0004J\u000e\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u0004J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010\u001c\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010%\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u0004X\u0080D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006¨\u0006&"}, d2 = {"Lcom/glority/android/core/jsbridge/BridgeUtil;", "", "()V", "CALLBACK_ID_FORMAT", "", "getCALLBACK_ID_FORMAT$fwk_core_release", "()Ljava/lang/String;", "EMPTY_STR", "getEMPTY_STR$fwk_core_release", "FETCH_QUEUE", "getFETCH_QUEUE$fwk_core_release", "JS_FETCH_QUEUE_FROM_JAVA", "getJS_FETCH_QUEUE_FROM_JAVA$fwk_core_release", "JS_HANDLE_MESSAGE_FROM_JAVA", "getJS_HANDLE_MESSAGE_FROM_JAVA$fwk_core_release", "RETURN_DATA", "getRETURN_DATA$fwk_core_release", "SCHEMA", "getSCHEMA$fwk_core_release", "SPLIT_MARK", "getSPLIT_MARK$fwk_core_release", "UNDERLINE_STR", "getUNDERLINE_STR$fwk_core_release", "assetFile2Str", "c", "Landroid/content/Context;", "urlStr", "getDataFromReturnUrl", "url", "getFunctionFromReturnUrl", "parseFunctionName", "jsUrl", "webViewLoadJs", "", "view", "Landroid/webkit/WebView;", "webViewLoadLocalJs", "path", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class BridgeUtil {
    private static final String CALLBACK_ID_FORMAT;
    private static final String EMPTY_STR;
    private static final String FETCH_QUEUE;
    private static final String JS_FETCH_QUEUE_FROM_JAVA;
    private static final String JS_HANDLE_MESSAGE_FROM_JAVA;
    private static final String RETURN_DATA;
    private static final String SPLIT_MARK;
    private static final String UNDERLINE_STR;
    public static final BridgeUtil INSTANCE = new BridgeUtil();
    private static final String SCHEMA = "androidjsbridge://";

    private BridgeUtil() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus("androidjsbridge://", "return/");
        RETURN_DATA = stringPlus;
        FETCH_QUEUE = Intrinsics.stringPlus(stringPlus, "_fetchQueue/");
        EMPTY_STR = "";
        UNDERLINE_STR = "_";
        SPLIT_MARK = RemoteSettings.FORWARD_SLASH_STRING;
        CALLBACK_ID_FORMAT = "native_cb_%s";
        JS_HANDLE_MESSAGE_FROM_JAVA = "javascript:chromium._handleMessageFromNative('%s');";
        JS_FETCH_QUEUE_FROM_JAVA = "javascript:chromium._fetchQueue();";
    }

    public final String getSCHEMA$fwk_core_release() {
        return SCHEMA;
    }

    public final String getRETURN_DATA$fwk_core_release() {
        return RETURN_DATA;
    }

    public final String getFETCH_QUEUE$fwk_core_release() {
        return FETCH_QUEUE;
    }

    public final String getEMPTY_STR$fwk_core_release() {
        return EMPTY_STR;
    }

    public final String getUNDERLINE_STR$fwk_core_release() {
        return UNDERLINE_STR;
    }

    public final String getSPLIT_MARK$fwk_core_release() {
        return SPLIT_MARK;
    }

    public final String getCALLBACK_ID_FORMAT$fwk_core_release() {
        return CALLBACK_ID_FORMAT;
    }

    public final String getJS_HANDLE_MESSAGE_FROM_JAVA$fwk_core_release() {
        return JS_HANDLE_MESSAGE_FROM_JAVA;
    }

    public final String getJS_FETCH_QUEUE_FROM_JAVA$fwk_core_release() {
        return JS_FETCH_QUEUE_FROM_JAVA;
    }

    public final String parseFunctionName(String jsUrl) {
        Intrinsics.checkNotNullParameter(jsUrl, "jsUrl");
        return new Regex("\\(.*\\);").replace(StringsKt.replace$default(jsUrl, "javascript:chromium.", "", false, 4, (Object) null), "");
    }

    public final String getDataFromReturnUrl(String url) {
        List emptyList;
        Intrinsics.checkNotNullParameter(url, "url");
        String str = FETCH_QUEUE;
        if (StringsKt.startsWith$default(url, str, false, 2, (Object) null)) {
            return StringsKt.replace$default(url, str, EMPTY_STR, false, 4, (Object) null);
        }
        List<String> split = new Regex(SPLIT_MARK).split(StringsKt.replace$default(url, RETURN_DATA, EMPTY_STR, false, 4, (Object) null), 0);
        int i = 1;
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        Object[] array = emptyList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            if (strArr.length >= 2) {
                StringBuilder sb = new StringBuilder();
                int length = strArr.length;
                if (1 < length) {
                    while (true) {
                        int i2 = i + 1;
                        sb.append(strArr[i]);
                        if (i2 >= length) {
                            break;
                        }
                        i = i2;
                    }
                }
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
                return sb2;
            }
            return "";
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final String getFunctionFromReturnUrl(String url) {
        List emptyList;
        Intrinsics.checkNotNullParameter(url, "url");
        List<String> split = new Regex(SPLIT_MARK).split(StringsKt.replace$default(url, RETURN_DATA, EMPTY_STR, false, 4, (Object) null), 0);
        if (!split.isEmpty()) {
            ListIterator<String> listIterator = split.listIterator(split.size());
            while (listIterator.hasPrevious()) {
                if (listIterator.previous().length() != 0) {
                    emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                    break;
                }
            }
        }
        emptyList = CollectionsKt.emptyList();
        Object[] array = emptyList.toArray(new String[0]);
        if (array != null) {
            String[] strArr = (String[]) array;
            if (strArr.length >= 1) {
                return strArr[0];
            }
            return null;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public final void webViewLoadJs(android.webkit.WebView view, String url) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(url, "url");
        view.loadUrl(Intrinsics.stringPlus("javascript:", Intrinsics.stringPlus("var newscript = document.createElement(\"script\");newscript.src=\"" + url + "\";", "document.scripts[0].parentNode.insertBefore(newscript,document.scripts[0]);")));
    }

    public final void webViewLoadLocalJs(android.webkit.WebView view, String path) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(path, "path");
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        String assetFile2Str = assetFile2Str(context, path);
        Intrinsics.checkNotNull(assetFile2Str);
        view.loadUrl(Intrinsics.stringPlus("javascript:", assetFile2Str));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String assetFile2Str(android.content.Context r8, java.lang.String r9) {
        /*
            r7 = this;
            java.lang.String r0 = "BridgeUtil"
            java.lang.String r1 = "c"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r1 = "urlStr"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r1)
            r1 = 0
            android.content.res.AssetManager r8 = r8.getAssets()     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.io.InputStream r8 = r8.open(r9)     // Catch: java.lang.Throwable -> L5d java.lang.Exception -> L5f
            java.io.BufferedReader r9 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            r2.<init>(r8)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            java.io.Reader r2 = (java.io.Reader) r2     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            r9.<init>(r2)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            r2.<init>()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
        L29:
            java.lang.String r3 = r9.readLine()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            if (r3 == 0) goto L42
            r4 = r3
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            java.lang.String r5 = "^\\s*\\/\\/.*"
            kotlin.text.Regex r6 = new kotlin.text.Regex     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            r6.<init>(r5)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            boolean r4 = r6.matches(r4)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            if (r4 != 0) goto L42
            r2.append(r3)     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
        L42:
            if (r3 != 0) goto L29
            r9.close()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            r8.close()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            java.lang.String r9 = r2.toString()     // Catch: java.lang.Exception -> L5b java.lang.Throwable -> L7c
            r8.close()     // Catch: java.io.IOException -> L52
            goto L5a
        L52:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            com.glority.utils.stability.LogUtils.e(r8)
        L5a:
            return r9
        L5b:
            r9 = move-exception
            goto L61
        L5d:
            r9 = move-exception
            goto L7e
        L5f:
            r9 = move-exception
            r8 = r1
        L61:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L7c
            r3 = 0
            r2[r3] = r9     // Catch: java.lang.Throwable -> L7c
            r9 = 1
            r2[r9] = r0     // Catch: java.lang.Throwable -> L7c
            com.glority.utils.stability.LogUtils.e(r2)     // Catch: java.lang.Throwable -> L7c
            if (r8 == 0) goto L7b
            r8.close()     // Catch: java.io.IOException -> L73
            goto L7b
        L73:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            com.glority.utils.stability.LogUtils.e(r8)
        L7b:
            return r1
        L7c:
            r9 = move-exception
            r1 = r8
        L7e:
            if (r1 == 0) goto L8c
            r1.close()     // Catch: java.io.IOException -> L84
            goto L8c
        L84:
            r8 = move-exception
            java.lang.Object[] r8 = new java.lang.Object[]{r8, r0}
            com.glority.utils.stability.LogUtils.e(r8)
        L8c:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.glority.android.core.jsbridge.BridgeUtil.assetFile2Str(android.content.Context, java.lang.String):java.lang.String");
    }
}
