package com.glority.android.core.data;

import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: LogEventArguments.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0010 \n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0017\u00100\u001a\b\u0012\u0004\u0012\u00020\u000401¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u00104\u001a\b\u0012\u0004\u0012\u00020\u000401¢\u0006\b\n\u0000\u001a\u0004\b5\u00103R\u0017\u00106\u001a\b\u0012\u0004\u0012\u00020\u000401¢\u0006\b\n\u0000\u001a\u0004\b7\u00103R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u000401¢\u0006\b\n\u0000\u001a\u0004\b9\u00103¨\u0006:"}, d2 = {"Lcom/glority/android/core/data/LogEventArguments;", "", "()V", "ARG_CODE", "", "ARG_CONTENT", "ARG_COUNT", "ARG_DOUBLE_1", "ARG_DOUBLE_2", "ARG_DOUBLE_3", "ARG_DOUBLE_4", "ARG_DOUBLE_5", "ARG_ERROR", "ARG_FROM", "ARG_GROUP", "ARG_ID", "ARG_INDEX", "ARG_INTEGER_1", "ARG_INTEGER_2", "ARG_INTEGER_3", "ARG_INTEGER_4", "ARG_INTEGER_5", "ARG_KEY", "ARG_KEYWORDS", "ARG_LENGTH", "ARG_MESSAGE", "ARG_MODE", "ARG_NAME", "ARG_NUMBER", "ARG_PERCENT", "ARG_PRICE", "ARG_SIZE", "ARG_SKU", "ARG_SOURCE", "ARG_STATUS", "ARG_STEP", "ARG_STRING_1", "ARG_STRING_2", "ARG_STRING_3", "ARG_STRING_4", "ARG_STRING_5", "ARG_TARGET", "ARG_TIME", "ARG_TO", "ARG_TYPE", "ARG_VALUE", "ARG_VERSION", "ARG_VIP", "DOUBLE_PARAMETER_ARRAY", "", "getDOUBLE_PARAMETER_ARRAY", "()Ljava/util/List;", "FLOAT_PARAMETER_ARRAY", "getFLOAT_PARAMETER_ARRAY", "INT_PARAMETER_ARRAY", "getINT_PARAMETER_ARRAY", "STRING_PARAMETER_ARRAY", "getSTRING_PARAMETER_ARRAY", "fwk-core_release"}, k = 1, mv = {1, 5, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class LogEventArguments {
    public static final String ARG_CODE = "code";
    public static final String ARG_CONTENT = "content";
    public static final String ARG_COUNT = "count";
    public static final String ARG_DOUBLE_1 = "double1";
    public static final String ARG_DOUBLE_2 = "double2";
    public static final String ARG_DOUBLE_3 = "double3";
    public static final String ARG_DOUBLE_4 = "double4";
    public static final String ARG_ERROR = "error";
    public static final String ARG_FROM = "from";
    public static final String ARG_GROUP = "group";
    public static final String ARG_ID = "id";
    public static final String ARG_INDEX = "index";
    public static final String ARG_KEY = "key";
    public static final String ARG_MODE = "mode";
    public static final String ARG_NAME = "name";
    public static final String ARG_PRICE = "price";
    public static final String ARG_SOURCE = "source";
    public static final String ARG_STATUS = "status";
    public static final String ARG_TARGET = "target";
    public static final String ARG_TIME = "time";
    public static final String ARG_TO = "to";
    public static final String ARG_TYPE = "type";
    public static final String ARG_VALUE = "value";
    public static final String ARG_VIP = "vip";
    public static final LogEventArguments INSTANCE = new LogEventArguments();
    public static final String ARG_LENGTH = "length";
    public static final String ARG_SIZE = "size";
    public static final String ARG_INTEGER_1 = "integer1";
    public static final String ARG_INTEGER_2 = "integer2";
    public static final String ARG_INTEGER_3 = "integer3";
    public static final String ARG_INTEGER_4 = "integer4";
    public static final String ARG_INTEGER_5 = "integer5";
    private static final List<String> INT_PARAMETER_ARRAY = CollectionsKt.listOf((Object[]) new String[]{ARG_LENGTH, "count", ARG_SIZE, ARG_INTEGER_1, ARG_INTEGER_2, ARG_INTEGER_3, ARG_INTEGER_4, ARG_INTEGER_5});
    public static final String ARG_PERCENT = "percent";
    private static final List<String> FLOAT_PARAMETER_ARRAY = CollectionsKt.listOf(ARG_PERCENT);
    public static final String ARG_NUMBER = "number";
    public static final String ARG_DOUBLE_5 = "double5";
    private static final List<String> DOUBLE_PARAMETER_ARRAY = CollectionsKt.listOf((Object[]) new String[]{"time", ARG_NUMBER, "price", "double1", "double2", "double3", "double4", ARG_DOUBLE_5});
    public static final String ARG_STEP = "step";
    public static final String ARG_KEYWORDS = "keywords";
    public static final String ARG_MESSAGE = "message";
    public static final String ARG_SKU = "sku";
    public static final String ARG_VERSION = "version";
    public static final String ARG_STRING_1 = "string1";
    public static final String ARG_STRING_2 = "string2";
    public static final String ARG_STRING_3 = "string3";
    public static final String ARG_STRING_4 = "string4";
    public static final String ARG_STRING_5 = "string5";
    private static final List<String> STRING_PARAMETER_ARRAY = CollectionsKt.listOf((Object[]) new String[]{"code", "index", ARG_STEP, "type", "content", "error", "from", "group", "id", "key", ARG_KEYWORDS, ARG_MESSAGE, "mode", "name", ARG_SKU, "source", "status", "target", "to", "value", ARG_VERSION, "vip", ARG_STRING_1, ARG_STRING_2, ARG_STRING_3, ARG_STRING_4, ARG_STRING_5});

    private LogEventArguments() {
    }

    public final List<String> getINT_PARAMETER_ARRAY() {
        return INT_PARAMETER_ARRAY;
    }

    public final List<String> getFLOAT_PARAMETER_ARRAY() {
        return FLOAT_PARAMETER_ARRAY;
    }

    public final List<String> getDOUBLE_PARAMETER_ARRAY() {
        return DOUBLE_PARAMETER_ARRAY;
    }

    public final List<String> getSTRING_PARAMETER_ARRAY() {
        return STRING_PARAMETER_ARRAY;
    }
}
