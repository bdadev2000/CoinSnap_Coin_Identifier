package com.glority.android.uimaker;

import com.glority.android.uimaker.parameter.baseview.WindowParameter;
import com.glority.android.uimaker.parser.ParserV1;
import com.glority.android.uimaker.parser.ParserV2;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UiJsonParser.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/glority/android/uimaker/UiJsonParser;", "", "()V", "parse", "Lcom/glority/android/uimaker/parameter/baseview/WindowParameter;", "json", "", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class UiJsonParser {
    public static final UiJsonParser INSTANCE = new UiJsonParser();

    private UiJsonParser() {
    }

    public final WindowParameter parse(String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        WindowParameter window = (WindowParameter) new Gson().fromJson(json, WindowParameter.class);
        window.getChildViewParameters().clear();
        JSONObject jSONObject = new JSONObject(json);
        if (jSONObject.has("childViewParameters")) {
            JSONArray jsonArray = jSONObject.getJSONArray("childViewParameters");
            String str = json;
            if (StringsKt.contains$default((CharSequence) str, (CharSequence) "\"version\":2", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str, (CharSequence) "\"version\": 2", false, 2, (Object) null)) {
                ParserV2 parserV2 = new ParserV2();
                Intrinsics.checkNotNullExpressionValue(jsonArray, "jsonArray");
                Intrinsics.checkNotNullExpressionValue(window, "window");
                parserV2.parseArray(jsonArray, window);
            } else {
                ParserV1 parserV1 = new ParserV1();
                Intrinsics.checkNotNullExpressionValue(jsonArray, "jsonArray");
                Intrinsics.checkNotNullExpressionValue(window, "window");
                parserV1.parseArray(jsonArray, window);
            }
        }
        Intrinsics.checkNotNullExpressionValue(window, "window");
        return window;
    }
}
