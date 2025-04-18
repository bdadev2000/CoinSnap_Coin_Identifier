package com.bytedance.sdk.openadsdk.tool;

import com.bytedance.sdk.component.utils.YoT;
import com.bytedance.sdk.openadsdk.FilterWord;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class YFl {
    public static String YFl(List<FilterWord> list) {
        if (list == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<FilterWord> it = list.iterator();
        while (it.hasNext()) {
            JSONObject YFl = YFl(it.next());
            if (YFl != null) {
                jSONArray.put(YFl);
            }
        }
        return jSONArray.toString();
    }

    public static List<FilterWord> YFl(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                FilterWord YFl = YFl(jSONArray.optJSONObject(i10));
                if (YFl != null && YFl.isValid()) {
                    arrayList.add(YFl);
                }
            }
        } catch (JSONException e2) {
            YoT.YFl("MaterialMetaTools", e2.getMessage());
        }
        return arrayList;
    }

    private static FilterWord YFl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            FilterWord filterWord = new FilterWord();
            filterWord.setId(jSONObject.optString("id"));
            filterWord.setName(jSONObject.optString("name"));
            filterWord.setIsSelected(jSONObject.optBoolean("is_selected"));
            JSONArray optJSONArray = jSONObject.optJSONArray("options");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
                    FilterWord YFl = YFl(optJSONArray.optJSONObject(i10));
                    if (YFl != null && YFl.isValid()) {
                        filterWord.addOption(YFl);
                    }
                }
            }
            return filterWord;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static JSONObject YFl(FilterWord filterWord) {
        if (filterWord == null) {
            return null;
        }
        try {
            if (filterWord.isValid()) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", filterWord.getId());
                jSONObject.put("name", filterWord.getName());
                jSONObject.put("is_selected", filterWord.getIsSelected());
                if (filterWord.hasSecondOptions()) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<FilterWord> it = filterWord.getOptions().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(YFl(it.next()));
                    }
                    if (jSONArray.length() > 0) {
                        jSONObject.put("options", jSONArray);
                    }
                }
                return jSONObject;
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
