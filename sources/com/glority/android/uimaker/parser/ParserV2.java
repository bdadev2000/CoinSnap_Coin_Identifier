package com.glority.android.uimaker.parser;

import com.glority.android.uimaker.Constants;
import com.glority.android.uimaker.parameter.baseview.ViewGroupParameter;
import com.glority.android.uimaker.parameter.baseview.ViewParameter;
import com.google.gson.Gson;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParserV2.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/glority/android/uimaker/parser/ParserV2;", "", "()V", "parseArray", "", "jsonArray", "Lorg/json/JSONArray;", "viewGroupParameter", "Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class ParserV2 {
    public final void parseArray(JSONArray jsonArray, ViewGroupParameter viewGroupParameter) {
        Object obj;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        Intrinsics.checkNotNullParameter(viewGroupParameter, "viewGroupParameter");
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            ViewParameter viewParameter = null;
            if (jSONObject.has("viewName")) {
                String string = jSONObject.getString("viewName");
                Iterator<T> it = Constants.INSTANCE.getAllViewParameters().iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (Intrinsics.areEqual(((ViewParameter) obj).getViewName(), string)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ViewParameter viewParameter2 = (ViewParameter) obj;
                if (viewParameter2 != null) {
                    viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), (Class) viewParameter2.getClass());
                }
            }
            if (viewParameter != null) {
                viewGroupParameter.addView(viewParameter);
            }
            if ((viewParameter instanceof ViewGroupParameter) && jSONObject.has("childViewParameters")) {
                if (viewParameter == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.glority.android.uimaker.parameter.baseview.ViewGroupParameter");
                }
                ViewGroupParameter viewGroupParameter2 = (ViewGroupParameter) viewParameter;
                viewGroupParameter2.getChildViewParameters().clear();
                JSONArray jSONArray = jSONObject.getJSONArray("childViewParameters");
                Intrinsics.checkNotNullExpressionValue(jSONArray, "jo.getJSONArray(\"childViewParameters\")");
                if (viewParameter == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.glority.android.uimaker.parameter.baseview.ViewGroupParameter");
                }
                parseArray(jSONArray, viewGroupParameter2);
            }
        }
    }
}
