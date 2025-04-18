package ni;

import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.cardview.widget.CardView;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class a implements l, RewardItem, y7.c, k8.k, x8.m, a9.k, qb.c, k4.z, wh.b {

    /* renamed from: b, reason: collision with root package name */
    public static final a f22775b = new a();

    /* renamed from: c, reason: collision with root package name */
    public static final a f22776c = new a();

    public /* synthetic */ a() {
    }

    public static final p3.l h(JSONObject jSONObject) {
        boolean z10;
        String optString;
        int i10 = com.facebook.login.i.f11223n;
        JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray(DataSchemeDataSource.SCHEME_DATA);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        int length = jSONArray.length();
        if (length > 0) {
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                JSONObject optJSONObject = jSONArray.optJSONObject(i11);
                String permission = optJSONObject.optString("permission");
                Intrinsics.checkNotNullExpressionValue(permission, "permission");
                if (permission.length() == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 && !Intrinsics.areEqual(permission, "installed") && (optString = optJSONObject.optString(NotificationCompat.CATEGORY_STATUS)) != null) {
                    int hashCode = optString.hashCode();
                    if (hashCode != -1309235419) {
                        if (hashCode != 280295099) {
                            if (hashCode == 568196142 && optString.equals("declined")) {
                                arrayList2.add(permission);
                            }
                        } else if (optString.equals("granted")) {
                            arrayList.add(permission);
                        }
                    } else if (optString.equals("expired")) {
                        arrayList3.add(permission);
                    }
                }
                if (i12 >= length) {
                    break;
                }
                i11 = i12;
            }
        }
        return new p3.l(arrayList, arrayList2, arrayList3);
    }

    public static final Bundle i(String str) {
        int i10 = com.facebook.login.y.f11314c;
        Bundle bundle = new Bundle();
        bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
        bundle.putString("0_auth_logger_id", str);
        bundle.putString("3_method", "");
        bundle.putString("2_result", "");
        bundle.putString("5_error_message", "");
        bundle.putString("4_error_code", "");
        bundle.putString("6_extras", "");
        return bundle;
    }

    public static com.facebook.a j(Bundle bundle, String applicationId) {
        boolean z10;
        String string;
        com.facebook.k kVar = com.facebook.k.FACEBOOK_APPLICATION_SERVICE;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(applicationId, "applicationId");
        Date m10 = com.facebook.internal.m0.m(bundle, "com.facebook.platform.extra.EXPIRES_SECONDS_SINCE_EPOCH", new Date(0L));
        ArrayList<String> stringArrayList = bundle.getStringArrayList("com.facebook.platform.extra.PERMISSIONS");
        String string2 = bundle.getString("com.facebook.platform.extra.ACCESS_TOKEN");
        Date m11 = com.facebook.internal.m0.m(bundle, "com.facebook.platform.extra.EXTRA_DATA_ACCESS_EXPIRATION_TIME", new Date(0L));
        if (string2 != null) {
            boolean z11 = true;
            if (string2.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && (string = bundle.getString("com.facebook.platform.extra.USER_ID")) != null) {
                if (string.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    return new com.facebook.a(string2, applicationId, string, stringArrayList, null, null, kVar, m10, new Date(), m11, bundle.getString("graph_domain"));
                }
                return null;
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.a k(java.util.Collection r16, android.os.Bundle r17, com.facebook.k r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ni.a.k(java.util.Collection, android.os.Bundle, com.facebook.k, java.lang.String):com.facebook.a");
    }

    public static com.facebook.l l(Bundle bundle, String str) {
        boolean z10;
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        String string = bundle.getString("id_token");
        if (string != null) {
            boolean z11 = true;
            if (string.length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10 && str != null) {
                if (str.length() != 0) {
                    z11 = false;
                }
                if (!z11) {
                    try {
                        return new com.facebook.l(string, str);
                    } catch (Exception e2) {
                        throw new com.facebook.q(e2.getMessage(), e2);
                    }
                }
            }
        }
        return null;
    }

    public static com.facebook.login.t m(com.facebook.login.r rVar, String str) {
        return new com.facebook.login.t(rVar, com.facebook.login.s.CANCEL, null, str, null);
    }

    public static MediaCodec n(k8.j jVar) {
        jVar.a.getClass();
        String str = jVar.a.a;
        c6.k.c("createCodec:" + str);
        MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
        c6.k.k();
        return createByCodecName;
    }

    public static com.facebook.login.t o(com.facebook.login.r rVar, com.facebook.a aVar, com.facebook.l lVar) {
        return new com.facebook.login.t(rVar, com.facebook.login.s.SUCCESS, aVar, lVar, null, null);
    }

    public static com.facebook.login.t q(com.facebook.login.r rVar, String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        if (str != null) {
            arrayList.add(str);
        }
        if (str2 != null) {
            arrayList.add(str2);
        }
        return new com.facebook.login.t(rVar, com.facebook.login.s.ERROR, null, TextUtils.join(": ", arrayList), str3);
    }

    public static String r() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("init", System.currentTimeMillis());
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(jSONObject2, "e2e.toString()");
        return jSONObject2;
    }

    public static Uri s(Bundle bundle, String action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (Intrinsics.areEqual(action, "oauth")) {
            return com.facebook.internal.m0.b(bundle, w5.d.d(), "oauth/authorize");
        }
        return com.facebook.internal.m0.b(bundle, w5.d.d(), com.facebook.x.d() + "/dialog/" + action);
    }

    public static void t() {
        File[] listFiles;
        if (com.facebook.internal.m0.x()) {
            return;
        }
        File l10 = com.facebook.appevents.g.l();
        int i10 = 1;
        if (l10 == null) {
            listFiles = new File[0];
        } else {
            listFiles = l10.listFiles(new com.facebook.internal.k0(i10));
            if (listFiles == null) {
                listFiles = new File[0];
            }
        }
        ArrayList arrayList = new ArrayList(listFiles.length);
        for (File file : listFiles) {
            Intrinsics.checkNotNullParameter(file, "file");
            arrayList.add(new j6.c(file));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((j6.c) next).b()) {
                arrayList2.add(next);
            }
        }
        List sortedWith = CollectionsKt.sortedWith(arrayList2, new k0.b(2));
        JSONArray jSONArray = new JSONArray();
        Iterator<Integer> it2 = RangesKt.until(0, Math.min(sortedWith.size(), 5)).iterator();
        while (it2.hasNext()) {
            jSONArray.put(sortedWith.get(((IntIterator) it2).nextInt()));
        }
        com.facebook.appevents.g.J("crash_reports", jSONArray, new k6.b(sortedWith, i10));
    }

    @Override // y7.c
    public long a(long j3) {
        return j3;
    }

    @Override // x8.m
    public long b() {
        throw new NoSuchElementException();
    }

    @Override // k4.z
    public k4.y c(k4.d0 d0Var) {
        return k4.g0.a;
    }

    @Override // ni.l
    public Object convert(Object obj) {
        return obj.toString();
    }

    @Override // x8.m
    public long d() {
        throw new NoSuchElementException();
    }

    @Override // k8.k
    public k8.l e(k8.j jVar) {
        MediaCodec mediaCodec = null;
        try {
            mediaCodec = n(jVar);
            c6.k.c("configureCodec");
            mediaCodec.configure(jVar.f20324b, jVar.f20326d, jVar.f20327e, 0);
            c6.k.k();
            c6.k.c("startCodec");
            mediaCodec.start();
            c6.k.k();
            return new k8.a0(mediaCodec);
        } catch (IOException | RuntimeException e2) {
            if (mediaCodec != null) {
                mediaCodec.release();
            }
            throw e2;
        }
    }

    @Override // wh.b
    public wh.o0 f(wh.z0 z0Var, wh.u0 response) {
        Intrinsics.checkNotNullParameter(response, "response");
        return null;
    }

    @Override // qb.c
    public qb.a g(a aVar, JSONObject jSONObject) {
        ef.b bVar;
        long currentTimeMillis;
        jSONObject.optInt("settings_version", 0);
        int optInt = jSONObject.optInt("cache_duration", 3600);
        double optDouble = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0d);
        double optDouble2 = jSONObject.optDouble("on_demand_backoff_base", 1.2d);
        int optInt2 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        int i10 = 4;
        if (jSONObject.has("session")) {
            bVar = new ef.b(jSONObject.getJSONObject("session").optInt("max_custom_exception_events", 8), i10);
        } else {
            bVar = new ef.b(new JSONObject().optInt("max_custom_exception_events", 8), i10);
        }
        ef.b bVar2 = bVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("features");
        g4.l lVar = new g4.l(jSONObject2.optBoolean("collect_reports", true), jSONObject2.optBoolean("collect_anrs", false), jSONObject2.optBoolean("collect_build_ids", false));
        long j3 = optInt;
        if (jSONObject.has("expires_at")) {
            currentTimeMillis = jSONObject.optLong("expires_at");
        } else {
            aVar.getClass();
            currentTimeMillis = (j3 * 1000) + System.currentTimeMillis();
        }
        return new qb.a(currentTimeMillis, bVar2, lVar, optDouble, optDouble2, optInt2);
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public String getType() {
        return "";
    }

    @Override // x8.m
    public boolean next() {
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public a9.i p(s7.r0 r0Var) {
        char c10;
        String str = r0Var.f24723n;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c10 = 5;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 930165504:
                    if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                        c10 = 6;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c10 = 7;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566015601:
                    if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                        c10 = '\b';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1566016562:
                    if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                        c10 = '\t';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c10 = '\n';
                        break;
                    }
                    c10 = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c10 = 11;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            int i10 = r0Var.F;
            List list = r0Var.f24725p;
            switch (c10) {
                case 0:
                    return new c9.a(list);
                case 1:
                    return new d9.b();
                case 2:
                    return new c9.a();
                case 3:
                    return new j9.i();
                case 4:
                    return new i9.a(list);
                case 5:
                    return new f9.a(list);
                case 6:
                case '\b':
                    return new b9.c(str, i10);
                case 7:
                    return new a9.f();
                case '\t':
                    return new b9.f(i10, list);
                case '\n':
                    return new g9.a();
                case 11:
                    return new h9.c();
            }
        }
        throw new IllegalArgumentException(vd.e.e("Attempted to create decoder for unsupported MIME type: ", str));
    }

    public void u(d3.g gVar, float f10) {
        float f11;
        q.a aVar = (q.a) ((Drawable) gVar.f16812c);
        boolean useCompatPadding = ((CardView) gVar.f16813d).getUseCompatPadding();
        boolean preventCornerOverlap = ((CardView) gVar.f16813d).getPreventCornerOverlap();
        if (f10 != aVar.f23651e || aVar.f23652f != useCompatPadding || aVar.f23653g != preventCornerOverlap) {
            aVar.f23651e = f10;
            aVar.f23652f = useCompatPadding;
            aVar.f23653g = preventCornerOverlap;
            aVar.c(null);
            aVar.invalidateSelf();
        }
        if (!((CardView) gVar.f16813d).getUseCompatPadding()) {
            gVar.H(0, 0, 0, 0);
            return;
        }
        q.a aVar2 = (q.a) ((Drawable) gVar.f16812c);
        float f12 = aVar2.f23651e;
        float f13 = aVar2.a;
        if (((CardView) gVar.f16813d).getPreventCornerOverlap()) {
            f11 = (float) (((1.0d - q.b.a) * f13) + f12);
        } else {
            int i10 = q.b.f23658b;
            f11 = f12;
        }
        int ceil = (int) Math.ceil(f11);
        int ceil2 = (int) Math.ceil(q.b.a(f12, f13, ((CardView) gVar.f16813d).getPreventCornerOverlap()));
        gVar.H(ceil, ceil2, ceil, ceil2);
    }

    public boolean v(s7.r0 r0Var) {
        String str = r0Var.f24723n;
        if (!MimeTypes.TEXT_VTT.equals(str) && !MimeTypes.TEXT_SSA.equals(str) && !MimeTypes.APPLICATION_TTML.equals(str) && !MimeTypes.APPLICATION_MP4VTT.equals(str) && !MimeTypes.APPLICATION_SUBRIP.equals(str) && !MimeTypes.APPLICATION_TX3G.equals(str) && !MimeTypes.APPLICATION_CEA608.equals(str) && !MimeTypes.APPLICATION_MP4CEA608.equals(str) && !MimeTypes.APPLICATION_CEA708.equals(str) && !MimeTypes.APPLICATION_DVBSUBS.equals(str) && !MimeTypes.APPLICATION_PGS.equals(str) && !"text/x-exoplayer-cues".equals(str)) {
            return false;
        }
        return true;
    }

    public /* synthetic */ a(Object obj) {
    }
}
