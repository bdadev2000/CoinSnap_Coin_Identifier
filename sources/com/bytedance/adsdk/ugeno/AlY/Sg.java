package com.bytedance.adsdk.ugeno.AlY;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.DebugKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class Sg {
    private List<YFl> Sg;
    private YFl YFl;

    /* loaded from: classes.dex */
    public static class YFl {
        private String Sg;
        private String YFl = "global";
        private Map<String, String> tN;

        public String Sg() {
            return this.Sg;
        }

        public String YFl() {
            return this.YFl;
        }

        public Map<String, String> tN() {
            return this.tN;
        }

        public String toString() {
            return "Action{scheme='" + this.YFl + "', name='" + this.Sg + "', params=" + this.tN + AbstractJsonLexerKt.END_OBJ;
        }

        public void Sg(String str) {
            this.Sg = str;
        }

        public void YFl(String str) {
            this.YFl = str;
        }

        public void YFl(Map<String, String> map) {
            this.tN = map;
        }
    }

    public List<YFl> Sg() {
        return this.Sg;
    }

    public YFl YFl() {
        return this.YFl;
    }

    public static Sg YFl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        Sg sg2 = new Sg();
        String optString = jSONObject.optString(DebugKt.DEBUG_PROPERTY_VALUE_ON);
        JSONArray optJSONArray = jSONObject.optJSONArray("handlers");
        sg2.YFl = qsH.YFl(optString, jSONObject2);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < optJSONArray.length(); i10++) {
            YFl YFl2 = qsH.YFl(optJSONArray.optString(i10), jSONObject2);
            if (YFl2 != null) {
                arrayList.add(YFl2);
            }
        }
        sg2.Sg = arrayList;
        return sg2;
    }
}
