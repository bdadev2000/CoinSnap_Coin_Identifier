package y2;

import com.facebook.internal.H;
import com.facebook.internal.z;
import com.facebook.r;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.C2720i;
import t7.y;
import u7.AbstractC2829t;

/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f24360a;
    public static final Map b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f24361c;

    /* JADX WARN: Type inference failed for: r1v0, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v13, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v15, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [y2.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v9, types: [y2.f, java.lang.Object] */
    static {
        EnumC2946b enumC2946b = EnumC2946b.ANON_ID;
        m mVar = m.b;
        n nVar = n.ANON_ID;
        ?? obj = new Object();
        obj.f24356a = mVar;
        obj.b = nVar;
        C2720i c2720i = new C2720i(enumC2946b, obj);
        EnumC2946b enumC2946b2 = EnumC2946b.APP_USER_ID;
        n nVar2 = n.FB_LOGIN_ID;
        ?? obj2 = new Object();
        obj2.f24356a = mVar;
        obj2.b = nVar2;
        C2720i c2720i2 = new C2720i(enumC2946b2, obj2);
        EnumC2946b enumC2946b3 = EnumC2946b.ADVERTISER_ID;
        n nVar3 = n.MAD_ID;
        ?? obj3 = new Object();
        obj3.f24356a = mVar;
        obj3.b = nVar3;
        C2720i c2720i3 = new C2720i(enumC2946b3, obj3);
        EnumC2946b enumC2946b4 = EnumC2946b.PAGE_ID;
        n nVar4 = n.PAGE_ID;
        ?? obj4 = new Object();
        obj4.f24356a = mVar;
        obj4.b = nVar4;
        C2720i c2720i4 = new C2720i(enumC2946b4, obj4);
        EnumC2946b enumC2946b5 = EnumC2946b.PAGE_SCOPED_USER_ID;
        n nVar5 = n.PAGE_SCOPED_USER_ID;
        ?? obj5 = new Object();
        obj5.f24356a = mVar;
        obj5.b = nVar5;
        C2720i c2720i5 = new C2720i(enumC2946b5, obj5);
        EnumC2946b enumC2946b6 = EnumC2946b.ADV_TE;
        m mVar2 = m.f24397c;
        n nVar6 = n.ADV_TE;
        ?? obj6 = new Object();
        obj6.f24356a = mVar2;
        obj6.b = nVar6;
        C2720i c2720i6 = new C2720i(enumC2946b6, obj6);
        EnumC2946b enumC2946b7 = EnumC2946b.APP_TE;
        n nVar7 = n.APP_TE;
        ?? obj7 = new Object();
        obj7.f24356a = mVar2;
        obj7.b = nVar7;
        C2720i c2720i7 = new C2720i(enumC2946b7, obj7);
        EnumC2946b enumC2946b8 = EnumC2946b.CONSIDER_VIEWS;
        n nVar8 = n.CONSIDER_VIEWS;
        ?? obj8 = new Object();
        obj8.f24356a = mVar2;
        obj8.b = nVar8;
        C2720i c2720i8 = new C2720i(enumC2946b8, obj8);
        EnumC2946b enumC2946b9 = EnumC2946b.DEVICE_TOKEN;
        n nVar9 = n.DEVICE_TOKEN;
        ?? obj9 = new Object();
        obj9.f24356a = mVar2;
        obj9.b = nVar9;
        C2720i c2720i9 = new C2720i(enumC2946b9, obj9);
        EnumC2946b enumC2946b10 = EnumC2946b.EXT_INFO;
        n nVar10 = n.EXT_INFO;
        ?? obj10 = new Object();
        obj10.f24356a = mVar2;
        obj10.b = nVar10;
        C2720i c2720i10 = new C2720i(enumC2946b10, obj10);
        EnumC2946b enumC2946b11 = EnumC2946b.INCLUDE_DWELL_DATA;
        n nVar11 = n.INCLUDE_DWELL_DATA;
        ?? obj11 = new Object();
        obj11.f24356a = mVar2;
        obj11.b = nVar11;
        C2720i c2720i11 = new C2720i(enumC2946b11, obj11);
        EnumC2946b enumC2946b12 = EnumC2946b.INCLUDE_VIDEO_DATA;
        n nVar12 = n.INCLUDE_VIDEO_DATA;
        ?? obj12 = new Object();
        obj12.f24356a = mVar2;
        obj12.b = nVar12;
        C2720i c2720i12 = new C2720i(enumC2946b12, obj12);
        EnumC2946b enumC2946b13 = EnumC2946b.INSTALL_REFERRER;
        n nVar13 = n.INSTALL_REFERRER;
        ?? obj13 = new Object();
        obj13.f24356a = mVar2;
        obj13.b = nVar13;
        C2720i c2720i13 = new C2720i(enumC2946b13, obj13);
        EnumC2946b enumC2946b14 = EnumC2946b.INSTALLER_PACKAGE;
        n nVar14 = n.INSTALLER_PACKAGE;
        ?? obj14 = new Object();
        obj14.f24356a = mVar2;
        obj14.b = nVar14;
        C2720i c2720i14 = new C2720i(enumC2946b14, obj14);
        EnumC2946b enumC2946b15 = EnumC2946b.RECEIPT_DATA;
        n nVar15 = n.RECEIPT_DATA;
        ?? obj15 = new Object();
        obj15.f24356a = mVar2;
        obj15.b = nVar15;
        C2720i c2720i15 = new C2720i(enumC2946b15, obj15);
        EnumC2946b enumC2946b16 = EnumC2946b.URL_SCHEMES;
        n nVar16 = n.URL_SCHEMES;
        ?? obj16 = new Object();
        obj16.f24356a = mVar2;
        obj16.b = nVar16;
        C2720i c2720i16 = new C2720i(enumC2946b16, obj16);
        EnumC2946b enumC2946b17 = EnumC2946b.USER_DATA;
        ?? obj17 = new Object();
        obj17.f24356a = mVar;
        obj17.b = null;
        f24360a = AbstractC2829t.Z(c2720i, c2720i2, c2720i3, c2720i4, c2720i5, c2720i6, c2720i7, c2720i8, c2720i9, c2720i10, c2720i11, c2720i12, c2720i13, c2720i14, c2720i15, c2720i16, new C2720i(enumC2946b17, obj17));
        C2720i c2720i17 = new C2720i(o.EVENT_TIME, new C2949e(null, k.EVENT_TIME));
        C2720i c2720i18 = new C2720i(o.EVENT_NAME, new C2949e(null, k.EVENT_NAME));
        o oVar = o.VALUE_TO_SUM;
        m mVar3 = m.f24398d;
        b = AbstractC2829t.Z(c2720i17, c2720i18, new C2720i(oVar, new C2949e(mVar3, k.VALUE_TO_SUM)), new C2720i(o.CONTENT_IDS, new C2949e(mVar3, k.CONTENT_IDS)), new C2720i(o.CONTENTS, new C2949e(mVar3, k.CONTENTS)), new C2720i(o.CONTENT_TYPE, new C2949e(mVar3, k.CONTENT_TYPE)), new C2720i(o.CURRENCY, new C2949e(mVar3, k.CURRENCY)), new C2720i(o.DESCRIPTION, new C2949e(mVar3, k.DESCRIPTION)), new C2720i(o.LEVEL, new C2949e(mVar3, k.LEVEL)), new C2720i(o.MAX_RATING_VALUE, new C2949e(mVar3, k.MAX_RATING_VALUE)), new C2720i(o.NUM_ITEMS, new C2949e(mVar3, k.NUM_ITEMS)), new C2720i(o.PAYMENT_INFO_AVAILABLE, new C2949e(mVar3, k.PAYMENT_INFO_AVAILABLE)), new C2720i(o.REGISTRATION_METHOD, new C2949e(mVar3, k.REGISTRATION_METHOD)), new C2720i(o.SEARCH_STRING, new C2949e(mVar3, k.SEARCH_STRING)), new C2720i(o.SUCCESS, new C2949e(mVar3, k.SUCCESS)), new C2720i(o.ORDER_ID, new C2949e(mVar3, k.ORDER_ID)), new C2720i(o.AD_TYPE, new C2949e(mVar3, k.AD_TYPE)));
        f24361c = AbstractC2829t.Z(new C2720i("fb_mobile_achievement_unlocked", l.UNLOCKED_ACHIEVEMENT), new C2720i("fb_mobile_activate_app", l.ACTIVATED_APP), new C2720i("fb_mobile_add_payment_info", l.ADDED_PAYMENT_INFO), new C2720i("fb_mobile_add_to_cart", l.ADDED_TO_CART), new C2720i("fb_mobile_add_to_wishlist", l.ADDED_TO_WISHLIST), new C2720i("fb_mobile_complete_registration", l.COMPLETED_REGISTRATION), new C2720i("fb_mobile_content_view", l.VIEWED_CONTENT), new C2720i("fb_mobile_initiated_checkout", l.INITIATED_CHECKOUT), new C2720i("fb_mobile_level_achieved", l.ACHIEVED_LEVEL), new C2720i("fb_mobile_purchase", l.PURCHASED), new C2720i("fb_mobile_rate", l.RATED), new C2720i("fb_mobile_search", l.SEARCHED), new C2720i("fb_mobile_spent_credits", l.SPENT_CREDITS), new C2720i("fb_mobile_tutorial_completion", l.COMPLETED_TUTORIAL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.HashMap] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object] */
    public static final Object a(Object obj, String str) {
        String str2;
        boolean equals = str.equals("extInfo");
        g gVar = g.b;
        if (!equals && !str.equals("url_schemes") && !str.equals("fb_content_id") && !str.equals("fb_content") && !str.equals("data_processing_options")) {
            boolean equals2 = str.equals("advertiser_tracking_enabled");
            gVar = g.f24357c;
            if (!equals2 && !str.equals("application_tracking_enabled")) {
                gVar = str.equals("_logTime") ? g.f24358d : null;
            }
        }
        if (obj instanceof String) {
            str2 = (String) obj;
        } else {
            str2 = null;
        }
        if (gVar != null && str2 != null) {
            int ordinal = gVar.ordinal();
            if (ordinal != 0) {
                boolean z8 = true;
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return O7.n.v(obj.toString());
                    }
                    throw new RuntimeException();
                }
                Integer v6 = O7.n.v(str2);
                if (v6 == null) {
                    return null;
                }
                if (v6.intValue() == 0) {
                    z8 = false;
                }
                return Boolean.valueOf(z8);
            }
            try {
                ArrayList<??> f9 = H.f(new JSONArray(str2));
                ArrayList arrayList = new ArrayList();
                for (?? r02 : f9) {
                    try {
                        try {
                            r02 = H.g(new JSONObject((String) r02));
                        } catch (JSONException unused) {
                        }
                    } catch (JSONException unused2) {
                        r02 = H.f(new JSONArray((String) r02));
                    }
                    arrayList.add(r02);
                }
                return arrayList;
            } catch (JSONException unused3) {
                L4.f fVar = z.f13680c;
                r.h(com.facebook.H.f13413f);
                return y.f23029a;
            }
        }
        return obj;
    }
}
