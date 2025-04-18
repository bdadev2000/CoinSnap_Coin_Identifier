package y5;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.mbridge.msdk.MBridgeConstans;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f27917b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27918c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27919d;

    public d(JSONObject component) {
        int length;
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PARAMETER_NAME_KEY)");
        this.a = string;
        String optString = component.optString(AppMeasurementSdk.ConditionalUserProperty.VALUE);
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PARAMETER_VALUE_KEY)");
        this.f27917b = optString;
        String optString2 = component.optString("path_type", "absolute");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(Constants.EVENT_MAPPING_PATH_TYPE_KEY, Constants.PATH_TYPE_ABSOLUTE)");
        this.f27919d = optString2;
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = component.optJSONArray(MBridgeConstans.DYNAMIC_VIEW_WX_PATH);
        if (optJSONArray != null && (length = optJSONArray.length()) > 0) {
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                JSONObject jSONObject = optJSONArray.getJSONObject(i10);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "jsonPathArray.getJSONObject(i)");
                arrayList.add(new e(jSONObject));
                if (i11 >= length) {
                    break;
                } else {
                    i10 = i11;
                }
            }
        }
        this.f27918c = arrayList;
    }
}
