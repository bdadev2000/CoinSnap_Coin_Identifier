package w5;

import com.facebook.internal.d0;
import com.facebook.internal.m0;
import java.util.ArrayList;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class i {
    public static final Map a;

    /* renamed from: b, reason: collision with root package name */
    public static final Map f26775b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f26776c;

    static {
        b bVar = b.ANON_ID;
        o oVar = o.USER_DATA;
        b bVar2 = b.ADV_TE;
        o oVar2 = o.APP_DATA;
        a = MapsKt.mapOf(TuplesKt.to(bVar, new g(oVar, p.ANON_ID)), TuplesKt.to(b.APP_USER_ID, new g(oVar, p.FB_LOGIN_ID)), TuplesKt.to(b.ADVERTISER_ID, new g(oVar, p.MAD_ID)), TuplesKt.to(b.PAGE_ID, new g(oVar, p.PAGE_ID)), TuplesKt.to(b.PAGE_SCOPED_USER_ID, new g(oVar, p.PAGE_SCOPED_USER_ID)), TuplesKt.to(bVar2, new g(oVar2, p.ADV_TE)), TuplesKt.to(b.APP_TE, new g(oVar2, p.APP_TE)), TuplesKt.to(b.CONSIDER_VIEWS, new g(oVar2, p.CONSIDER_VIEWS)), TuplesKt.to(b.DEVICE_TOKEN, new g(oVar2, p.DEVICE_TOKEN)), TuplesKt.to(b.EXT_INFO, new g(oVar2, p.EXT_INFO)), TuplesKt.to(b.INCLUDE_DWELL_DATA, new g(oVar2, p.INCLUDE_DWELL_DATA)), TuplesKt.to(b.INCLUDE_VIDEO_DATA, new g(oVar2, p.INCLUDE_VIDEO_DATA)), TuplesKt.to(b.INSTALL_REFERRER, new g(oVar2, p.INSTALL_REFERRER)), TuplesKt.to(b.INSTALLER_PACKAGE, new g(oVar2, p.INSTALLER_PACKAGE)), TuplesKt.to(b.RECEIPT_DATA, new g(oVar2, p.RECEIPT_DATA)), TuplesKt.to(b.URL_SCHEMES, new g(oVar2, p.URL_SCHEMES)), TuplesKt.to(b.USER_DATA, new g(oVar, null)));
        q qVar = q.VALUE_TO_SUM;
        o oVar3 = o.CUSTOM_DATA;
        f26775b = MapsKt.mapOf(TuplesKt.to(q.EVENT_TIME, new f(null, m.EVENT_TIME)), TuplesKt.to(q.EVENT_NAME, new f(null, m.EVENT_NAME)), TuplesKt.to(qVar, new f(oVar3, m.VALUE_TO_SUM)), TuplesKt.to(q.CONTENT_IDS, new f(oVar3, m.CONTENT_IDS)), TuplesKt.to(q.CONTENTS, new f(oVar3, m.CONTENTS)), TuplesKt.to(q.CONTENT_TYPE, new f(oVar3, m.CONTENT_TYPE)), TuplesKt.to(q.CURRENCY, new f(oVar3, m.CURRENCY)), TuplesKt.to(q.DESCRIPTION, new f(oVar3, m.DESCRIPTION)), TuplesKt.to(q.LEVEL, new f(oVar3, m.LEVEL)), TuplesKt.to(q.MAX_RATING_VALUE, new f(oVar3, m.MAX_RATING_VALUE)), TuplesKt.to(q.NUM_ITEMS, new f(oVar3, m.NUM_ITEMS)), TuplesKt.to(q.PAYMENT_INFO_AVAILABLE, new f(oVar3, m.PAYMENT_INFO_AVAILABLE)), TuplesKt.to(q.REGISTRATION_METHOD, new f(oVar3, m.REGISTRATION_METHOD)), TuplesKt.to(q.SEARCH_STRING, new f(oVar3, m.SEARCH_STRING)), TuplesKt.to(q.SUCCESS, new f(oVar3, m.SUCCESS)), TuplesKt.to(q.ORDER_ID, new f(oVar3, m.ORDER_ID)), TuplesKt.to(q.AD_TYPE, new f(oVar3, m.AD_TYPE)));
        f26776c = MapsKt.mapOf(TuplesKt.to("fb_mobile_achievement_unlocked", n.UNLOCKED_ACHIEVEMENT), TuplesKt.to("fb_mobile_activate_app", n.ACTIVATED_APP), TuplesKt.to("fb_mobile_add_payment_info", n.ADDED_PAYMENT_INFO), TuplesKt.to("fb_mobile_add_to_cart", n.ADDED_TO_CART), TuplesKt.to("fb_mobile_add_to_wishlist", n.ADDED_TO_WISHLIST), TuplesKt.to("fb_mobile_complete_registration", n.COMPLETED_REGISTRATION), TuplesKt.to("fb_mobile_content_view", n.VIEWED_CONTENT), TuplesKt.to("fb_mobile_initiated_checkout", n.INITIATED_CHECKOUT), TuplesKt.to("fb_mobile_level_achieved", n.ACHIEVED_LEVEL), TuplesKt.to("fb_mobile_purchase", n.PURCHASED), TuplesKt.to("fb_mobile_rate", n.RATED), TuplesKt.to("fb_mobile_search", n.SEARCHED), TuplesKt.to("fb_mobile_spent_credits", n.SPENT_CREDITS), TuplesKt.to("fb_mobile_tutorial_completion", n.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.util.HashMap] */
    public static final Object a(Object value, String rawValue) {
        String str;
        Intrinsics.checkNotNullParameter(rawValue, "field");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        boolean areEqual = Intrinsics.areEqual(rawValue, "extInfo");
        h hVar = h.ARRAY;
        if (!areEqual && !Intrinsics.areEqual(rawValue, "url_schemes") && !Intrinsics.areEqual(rawValue, "fb_content_id") && !Intrinsics.areEqual(rawValue, "fb_content") && !Intrinsics.areEqual(rawValue, "data_processing_options")) {
            boolean areEqual2 = Intrinsics.areEqual(rawValue, "advertiser_tracking_enabled");
            hVar = h.BOOL;
            if (!areEqual2 && !Intrinsics.areEqual(rawValue, "application_tracking_enabled")) {
                hVar = Intrinsics.areEqual(rawValue, "_logTime") ? h.INT : null;
            }
        }
        if (value instanceof String) {
            str = (String) value;
        } else {
            str = null;
        }
        if (hVar != null && str != null) {
            int ordinal = hVar.ordinal();
            boolean z10 = false;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return StringsKt.toIntOrNull(value.toString());
                    }
                    throw new NoWhenBranchMatchedException();
                }
                Integer intOrNull = StringsKt.toIntOrNull(str);
                if (intOrNull == null) {
                    return null;
                }
                if (intOrNull.intValue() != 0) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            }
            try {
                ArrayList<??> f10 = m0.f(new JSONArray(str));
                ArrayList arrayList = new ArrayList();
                for (?? r22 : f10) {
                    try {
                        try {
                            r22 = m0.g(new JSONObject((String) r22));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        r22 = m0.f(new JSONArray((String) r22));
                    }
                    arrayList.add(r22);
                }
                return arrayList;
            } catch (JSONException e2) {
                com.facebook.internal.m mVar = d0.f11030d;
                com.facebook.internal.m.o(com.facebook.m0.APP_EVENTS, "AppEventsConversionsAPITransformer", "\n transformEvents JSONException: \n%s\n%s", value, e2);
                return Unit.INSTANCE;
            }
        }
        return value;
    }
}
