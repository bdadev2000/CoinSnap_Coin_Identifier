package com.facebook;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: j, reason: collision with root package name */
    public static final String f11000j;

    /* renamed from: k, reason: collision with root package name */
    public static final String f11001k;

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f11002l;

    /* renamed from: m, reason: collision with root package name */
    public static volatile String f11003m;
    public final a a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11004b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f11005c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f11006d;

    /* renamed from: e, reason: collision with root package name */
    public Object f11007e;

    /* renamed from: f, reason: collision with root package name */
    public final String f11008f;

    /* renamed from: g, reason: collision with root package name */
    public b0 f11009g;

    /* renamed from: h, reason: collision with root package name */
    public l0 f11010h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11011i;

    /* JADX WARN: Code restructure failed: missing block: B:2:0x002c, code lost:
    
        if (r4 > 0) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x002e, code lost:
    
        r2 = r2 + 1;
        r1.append(r0[r3.nextInt(r0.length)]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x003a, code lost:
    
        if (r2 < r4) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        r0 = r1.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, "buffer.toString()");
        com.facebook.g0.f11001k = r0;
        com.facebook.g0.f11002l = java.util.regex.Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x004f, code lost:
    
        return;
     */
    static {
        /*
            com.facebook.c r0 = new com.facebook.c
            r1 = 7
            r2 = 0
            r0.<init>(r1, r2)
            java.lang.Class<com.facebook.g0> r0 = com.facebook.g0.class
            java.lang.String r0 = r0.getSimpleName()
            com.facebook.g0.f11000j = r0
            java.lang.String r0 = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"
            char[] r0 = r0.toCharArray()
            java.lang.String r1 = "(this as java.lang.String).toCharArray()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.security.SecureRandom r3 = new java.security.SecureRandom
            r3.<init>()
            r4 = 11
            int r4 = r3.nextInt(r4)
            int r4 = r4 + 30
            if (r4 <= 0) goto L3c
        L2e:
            int r2 = r2 + 1
            int r5 = r0.length
            int r5 = r3.nextInt(r5)
            char r5 = r0[r5]
            r1.append(r5)
            if (r2 < r4) goto L2e
        L3c:
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "buffer.toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.facebook.g0.f11001k = r0
            java.lang.String r0 = "^/?v\\d+\\.\\d+/(.*)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.facebook.g0.f11002l = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g0.<clinit>():void");
    }

    public g0(a aVar, String str, Bundle bundle, l0 l0Var, b0 b0Var) {
        this.a = aVar;
        this.f11004b = str;
        this.f11008f = null;
        j(b0Var);
        k(l0Var);
        if (bundle != null) {
            this.f11006d = new Bundle(bundle);
        } else {
            this.f11006d = new Bundle();
        }
        this.f11008f = x.d();
    }

    public static String f() {
        boolean z10;
        String b3 = x.b();
        x5.i.s();
        String str = x.f11426f;
        if (str != null) {
            boolean z11 = true;
            if (b3.length() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                if (str.length() <= 0) {
                    z11 = false;
                }
                if (z11) {
                    return b3 + '|' + str;
                }
            }
            return null;
        }
        throw new q("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x003f, code lost:
    
        if (r3 == false) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f11006d
            java.lang.String r1 = r6.e()
            r2 = 0
            if (r1 != 0) goto Lb
            r3 = r2
            goto L11
        Lb:
            java.lang.String r3 = "|"
            boolean r3 = kotlin.text.StringsKt.d(r1, r3)
        L11:
            r4 = 1
            if (r1 == 0) goto L20
            java.lang.String r5 = "IG"
            boolean r1 = kotlin.text.StringsKt.z(r1, r5)
            if (r1 == 0) goto L20
            if (r3 != 0) goto L20
            r1 = r4
            goto L21
        L20:
            r1 = r2
        L21:
            if (r1 == 0) goto L2a
            boolean r1 = r6.i()
            if (r1 == 0) goto L2a
            goto L41
        L2a:
            java.lang.String r1 = com.facebook.x.e()
            java.lang.String r5 = "instagram.com"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r1 != 0) goto L38
            r1 = r4
            goto L3d
        L38:
            boolean r1 = r6.i()
            r1 = r1 ^ r4
        L3d:
            if (r1 != 0) goto L42
            if (r3 != 0) goto L42
        L41:
            r2 = r4
        L42:
            java.lang.String r1 = "access_token"
            if (r2 == 0) goto L4e
            java.lang.String r2 = f()
            r0.putString(r1, r2)
            goto L57
        L4e:
            java.lang.String r2 = r6.e()
            if (r2 == 0) goto L57
            r0.putString(r1, r2)
        L57:
            boolean r1 = r0.containsKey(r1)
            if (r1 != 0) goto L7c
            com.facebook.x r1 = com.facebook.x.a
            x5.i.s()
            java.lang.String r1 = com.facebook.x.f11426f
            if (r1 == 0) goto L74
            boolean r1 = com.facebook.internal.m0.z(r1)
            if (r1 == 0) goto L7c
            java.lang.String r1 = com.facebook.g0.f11000j
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
            goto L7c
        L74:
            com.facebook.q r0 = new com.facebook.q
            java.lang.String r1 = "A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information."
            r0.<init>(r1)
            throw r0
        L7c:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.x r0 = com.facebook.x.a
            com.facebook.m0 r0 = com.facebook.m0.GRAPH_API_DEBUG_INFO
            com.facebook.x.i(r0)
            com.facebook.m0 r0 = com.facebook.m0.GRAPH_API_DEBUG_WARNING
            com.facebook.x.i(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.g0.a():void");
    }

    public final String b(String str, boolean z10) {
        if (!z10 && this.f11010h == l0.POST) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f11006d.keySet()) {
            Object obj = this.f11006d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (c.x(obj)) {
                buildUpon.appendQueryParameter(str2, c.b(obj).toString());
            } else if (this.f11010h != l0.GET) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(locale, format, *args)");
                throw new IllegalArgumentException(format);
            }
        }
        String builder = buildUpon.toString();
        Intrinsics.checkNotNullExpressionValue(builder, "uriBuilder.toString()");
        return builder;
    }

    public final k0 c() {
        Intrinsics.checkNotNullParameter(this, "request");
        g0[] requests = {this};
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = ArraysKt.toList(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        ArrayList n10 = c.n(new j0(requests2));
        if (n10.size() == 1) {
            return (k0) n10.get(0);
        }
        throw new q("invalid state: expected a single response");
    }

    public final h0 d() {
        g0[] requests = {this};
        Intrinsics.checkNotNullParameter(requests, "requests");
        List requests2 = ArraysKt.toList(requests);
        Intrinsics.checkNotNullParameter(requests2, "requests");
        j0 requests3 = new j0(requests2);
        Intrinsics.checkNotNullParameter(requests3, "requests");
        x5.i.n(requests3);
        h0 h0Var = new h0(requests3);
        h0Var.executeOnExecutor(x.c(), new Void[0]);
        return h0Var;
    }

    public final String e() {
        a aVar = this.a;
        if (aVar != null) {
            if (!this.f11006d.containsKey("access_token")) {
                com.facebook.internal.m mVar = com.facebook.internal.d0.f11030d;
                String str = aVar.f10887g;
                mVar.s(str);
                return str;
            }
        } else if (!this.f11006d.containsKey("access_token")) {
            return f();
        }
        return this.f11006d.getString("access_token");
    }

    public final String g() {
        String h10;
        String str;
        if (this.f11010h == l0.POST && (str = this.f11004b) != null && StringsKt.h(str, "/videos")) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            h10 = com.applovin.impl.mediation.ads.e.h(new Object[]{x.e()}, 1, "https://graph-video.%s", "java.lang.String.format(format, *args)");
        } else {
            String subdomain = x.e();
            Intrinsics.checkNotNullParameter(subdomain, "subdomain");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            h10 = com.applovin.impl.mediation.ads.e.h(new Object[]{subdomain}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        String h11 = h(h10);
        a();
        return b(h11, false);
    }

    public final String h(String str) {
        boolean z10;
        if (!Intrinsics.areEqual(x.e(), "instagram.com")) {
            z10 = true;
        } else {
            z10 = !i();
        }
        if (!z10) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = com.applovin.impl.mediation.ads.e.h(new Object[]{x.f11437q}, 1, "https://graph.%s", "java.lang.String.format(format, *args)");
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        Object[] objArr = new Object[2];
        objArr[0] = str;
        Pattern pattern = f11002l;
        String str2 = this.f11004b;
        if (!pattern.matcher(str2).matches()) {
            str2 = com.applovin.impl.mediation.ads.e.h(new Object[]{this.f11008f, str2}, 2, "%s/%s", "java.lang.String.format(format, *args)");
        }
        objArr[1] = str2;
        return com.applovin.impl.mediation.ads.e.h(objArr, 2, "%s/%s", "java.lang.String.format(format, *args)");
    }

    public final boolean i() {
        String str = this.f11004b;
        if (str == null) {
            return false;
        }
        String str2 = "^/?" + x.b() + "/?.*";
        if (!this.f11011i && !Pattern.matches(str2, str) && !Pattern.matches("^/?app/?.*", str)) {
            return false;
        }
        return true;
    }

    public final void j(b0 b0Var) {
        x xVar = x.a;
        x.i(m0.GRAPH_API_DEBUG_INFO);
        x.i(m0.GRAPH_API_DEBUG_WARNING);
        this.f11009g = b0Var;
    }

    public final void k(l0 l0Var) {
        if (l0Var == null) {
            l0Var = l0.GET;
        }
        this.f11010h = l0Var;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.a;
        if (obj == null) {
            obj = AbstractJsonLexerKt.NULL;
        }
        sb2.append(obj);
        sb2.append(", graphPath: ");
        sb2.append(this.f11004b);
        sb2.append(", graphObject: ");
        sb2.append(this.f11005c);
        sb2.append(", httpMethod: ");
        sb2.append(this.f11010h);
        sb2.append(", parameters: ");
        sb2.append(this.f11006d);
        sb2.append("}");
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb3;
    }
}
