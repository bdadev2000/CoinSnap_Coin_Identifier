package A2;

import G7.j;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f29a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f30c;

    /* renamed from: d, reason: collision with root package name */
    public final String f31d;

    public d(JSONObject jSONObject) {
        int length;
        String string = jSONObject.getString("name");
        j.d(string, "component.getString(PARAMETER_NAME_KEY)");
        this.f29a = string;
        String optString = jSONObject.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        j.d(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.b = optString;
        String optString2 = jSONObject.optString("path_type", "absolute");
        j.d(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f31d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i9 = 0;
            while (true) {
                int i10 = i9 + 1;
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i9);
                j.d(jSONObject2, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new e(jSONObject2));
                if (i10 >= length) {
                    break;
                } else {
                    i9 = i10;
                }
            }
        }
        this.f30c = arrayList;
    }
}
