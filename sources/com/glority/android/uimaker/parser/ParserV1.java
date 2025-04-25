package com.glority.android.uimaker.parser;

import com.glority.android.uimaker.parameter.baseview.ImageViewParameter;
import com.glority.android.uimaker.parameter.baseview.TextViewParameter;
import com.glority.android.uimaker.parameter.baseview.ViewGroupParameter;
import com.glority.android.uimaker.parameter.baseview.ViewParameter;
import com.glority.android.uimaker.parameter.componentview.ComponentViewParameter;
import com.glority.android.uimaker.parameter.componentview.GlPolicyView1Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPolicyView2Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView1Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView2Parameter;
import com.glority.android.uimaker.parameter.componentview.GlPurchaseView3Parameter;
import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ParserV1.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/glority/android/uimaker/parser/ParserV1;", "", "()V", "parseArray", "", "jsonArray", "Lorg/json/JSONArray;", "viewGroupParameter", "Lcom/glority/android/uimaker/parameter/baseview/ViewGroupParameter;", "uimaker_release"}, k = 1, mv = {1, 4, 2})
/* loaded from: classes4.dex */
public final class ParserV1 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x002d. Please report as an issue. */
    public final void parseArray(JSONArray jsonArray, ViewGroupParameter viewGroupParameter) {
        String string;
        Intrinsics.checkNotNullParameter(jsonArray, "jsonArray");
        Intrinsics.checkNotNullParameter(viewGroupParameter, "viewGroupParameter");
        int length = jsonArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jsonArray.getJSONObject(i);
            ViewParameter viewParameter = null;
            if (jSONObject.has("viewType") && (string = jSONObject.getString("viewType")) != null) {
                switch (string.hashCode()) {
                    case -219999918:
                        if (string.equals("TEXTVIEW")) {
                            viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), TextViewParameter.class);
                            break;
                        }
                        break;
                    case 528722178:
                        if (string.equals("COMPONENTVIEW")) {
                            String string2 = jSONObject.getString("componentName");
                            if (Intrinsics.areEqual(string2, "GlPurchaseView1")) {
                                viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), GlPurchaseView1Parameter.class);
                                break;
                            } else if (Intrinsics.areEqual(string2, "GlPurchaseView2")) {
                                viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), GlPurchaseView2Parameter.class);
                                break;
                            } else if (Intrinsics.areEqual(string2, "GlPurchaseView3")) {
                                viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), GlPurchaseView3Parameter.class);
                                break;
                            } else if (Intrinsics.areEqual(string2, "GlPolicyView1")) {
                                viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), GlPolicyView1Parameter.class);
                                break;
                            } else if (Intrinsics.areEqual(string2, "GlPolicyView2")) {
                                viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), GlPolicyView2Parameter.class);
                                break;
                            } else {
                                viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), ComponentViewParameter.class);
                                break;
                            }
                        }
                        break;
                    case 1220913882:
                        if (string.equals("VIEWGROUP")) {
                            viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), ViewGroupParameter.class);
                            if (viewParameter == null) {
                                throw new NullPointerException("null cannot be cast to non-null type com.glority.android.uimaker.parameter.baseview.ViewGroupParameter");
                            }
                            ((ViewGroupParameter) viewParameter).getChildViewParameters().clear();
                            break;
                        }
                        break;
                    case 1909444192:
                        if (string.equals("IMAGEVIEW")) {
                            viewParameter = (ViewParameter) new Gson().fromJson(jSONObject.toString(), ImageViewParameter.class);
                            break;
                        }
                        break;
                }
            }
            if (viewParameter != null) {
                viewGroupParameter.addView(viewParameter);
            }
            if ((viewParameter instanceof ViewGroupParameter) && jSONObject.has("childViews")) {
                JSONArray jSONArray = jSONObject.getJSONArray("childViews");
                Intrinsics.checkNotNullExpressionValue(jSONArray, "jo.getJSONArray(\"childViews\")");
                parseArray(jSONArray, (ViewGroupParameter) viewParameter);
            }
        }
    }
}
