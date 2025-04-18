package com.bytedance.adsdk.ugeno.AlY;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.AlY.Sg;
import java.util.HashMap;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class qsH {
    public static Sg.YFl YFl(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Sg.YFl yFl = new Sg.YFl();
        Uri parse = Uri.parse(str);
        if (parse == null) {
            return null;
        }
        if (!TextUtils.isEmpty(parse.getScheme())) {
            yFl.YFl(parse.getScheme());
        }
        String authority = parse.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            authority = parse.getPath();
        }
        yFl.Sg(authority);
        HashMap hashMap = new HashMap();
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null && queryParameterNames.size() > 0) {
            for (String str2 : queryParameterNames) {
                hashMap.put(str2, com.bytedance.adsdk.ugeno.tN.Sg.YFl(parse.getQueryParameter(str2), jSONObject));
            }
        }
        yFl.YFl(hashMap);
        return yFl;
    }
}
