package y5;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class e {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27920b;

    /* renamed from: c, reason: collision with root package name */
    public final int f27921c;

    /* renamed from: d, reason: collision with root package name */
    public final String f27922d;

    /* renamed from: e, reason: collision with root package name */
    public final String f27923e;

    /* renamed from: f, reason: collision with root package name */
    public final String f27924f;

    /* renamed from: g, reason: collision with root package name */
    public final String f27925g;

    /* renamed from: h, reason: collision with root package name */
    public final int f27926h;

    public e(JSONObject component) {
        Intrinsics.checkNotNullParameter(component, "component");
        String string = component.getString("class_name");
        Intrinsics.checkNotNullExpressionValue(string, "component.getString(PATH_CLASS_NAME_KEY)");
        this.a = string;
        this.f27920b = component.optInt("index", -1);
        this.f27921c = component.optInt("id");
        String optString = component.optString(MimeTypes.BASE_TYPE_TEXT);
        Intrinsics.checkNotNullExpressionValue(optString, "component.optString(PATH_TEXT_KEY)");
        this.f27922d = optString;
        String optString2 = component.optString("tag");
        Intrinsics.checkNotNullExpressionValue(optString2, "component.optString(PATH_TAG_KEY)");
        this.f27923e = optString2;
        String optString3 = component.optString("description");
        Intrinsics.checkNotNullExpressionValue(optString3, "component.optString(PATH_DESCRIPTION_KEY)");
        this.f27924f = optString3;
        String optString4 = component.optString("hint");
        Intrinsics.checkNotNullExpressionValue(optString4, "component.optString(PATH_HINT_KEY)");
        this.f27925g = optString4;
        this.f27926h = component.optInt("match_bitmask");
    }
}
