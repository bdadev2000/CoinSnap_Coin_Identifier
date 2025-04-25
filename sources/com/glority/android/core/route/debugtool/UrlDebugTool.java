package com.glority.android.core.route.debugtool;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.core.modules.Consts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UrlDebugTool.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/glority/android/core/route/debugtool/UrlDebugTool;", "", "()V", "MODULE", "", "getMODULE", "()Ljava/lang/String;", "URL_ENABLE_DEBUG_TOOL", "getURL_ENABLE_DEBUG_TOOL", "URL_IS_DEBUG_TOOL_ENABLE", "getURL_IS_DEBUG_TOOL_ENABLE", "URL_LOG_EVENT", "getURL_LOG_EVENT", "URL_SHOW_APP_INFO", "getURL_SHOW_APP_INFO", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UrlDebugTool {
    public static final UrlDebugTool INSTANCE = new UrlDebugTool();
    private static final String MODULE;
    private static final String URL_ENABLE_DEBUG_TOOL;
    private static final String URL_IS_DEBUG_TOOL_ENABLE;
    private static final String URL_LOG_EVENT;
    private static final String URL_SHOW_APP_INFO;

    private UrlDebugTool() {
    }

    static {
        String stringPlus = Intrinsics.stringPlus(Consts.INSTANCE.getSCHEME_CONSUMER(), "debugTool");
        MODULE = stringPlus;
        URL_IS_DEBUG_TOOL_ENABLE = Intrinsics.stringPlus(stringPlus, "/isDebugToolEnable");
        URL_ENABLE_DEBUG_TOOL = Intrinsics.stringPlus(stringPlus, "/enableDebugTool");
        URL_LOG_EVENT = Intrinsics.stringPlus(stringPlus, "/logEvent");
        URL_SHOW_APP_INFO = Intrinsics.stringPlus(stringPlus, "/showAppInfo");
    }

    public final String getMODULE() {
        return MODULE;
    }

    public final String getURL_IS_DEBUG_TOOL_ENABLE() {
        return URL_IS_DEBUG_TOOL_ENABLE;
    }

    public final String getURL_ENABLE_DEBUG_TOOL() {
        return URL_ENABLE_DEBUG_TOOL;
    }

    public final String getURL_LOG_EVENT() {
        return URL_LOG_EVENT;
    }

    public final String getURL_SHOW_APP_INFO() {
        return URL_SHOW_APP_INFO;
    }
}
