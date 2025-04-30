package A2;

import G7.j;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f32a;
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33c;

    /* renamed from: d, reason: collision with root package name */
    public final String f34d;

    /* renamed from: e, reason: collision with root package name */
    public final String f35e;

    /* renamed from: f, reason: collision with root package name */
    public final String f36f;

    /* renamed from: g, reason: collision with root package name */
    public final String f37g;

    /* renamed from: h, reason: collision with root package name */
    public final int f38h;

    public e(JSONObject jSONObject) {
        String string = jSONObject.getString("class_name");
        j.d(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.f32a = string;
        this.b = jSONObject.optInt("index", -1);
        this.f33c = jSONObject.optInt("id");
        String optString = jSONObject.optString(MimeTypes.BASE_TYPE_TEXT);
        j.d(optString, "component.optString(PATH_TEXT_KEY)");
        this.f34d = optString;
        String optString2 = jSONObject.optString("tag");
        j.d(optString2, "component.optString(PATH_TAG_KEY)");
        this.f35e = optString2;
        String optString3 = jSONObject.optString("description");
        j.d(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f36f = optString3;
        String optString4 = jSONObject.optString("hint");
        j.d(optString4, "component.optString(PATH_HINT_KEY)");
        this.f37g = optString4;
        this.f38h = jSONObject.optInt("match_bitmask");
    }
}
