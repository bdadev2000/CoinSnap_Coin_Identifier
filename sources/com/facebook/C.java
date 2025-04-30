package com.facebook;

import android.net.Uri;
import android.os.Bundle;
import com.facebook.internal.AbstractC1839h;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONObject;
import u7.AbstractC2815f;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: j, reason: collision with root package name */
    public static final String f13380j;

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f13381k;
    public static volatile String l;

    /* renamed from: a, reason: collision with root package name */
    public final C0785a f13382a;
    public final String b;

    /* renamed from: c, reason: collision with root package name */
    public JSONObject f13383c;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f13384d;

    /* renamed from: e, reason: collision with root package name */
    public Object f13385e;

    /* renamed from: f, reason: collision with root package name */
    public final String f13386f;

    /* renamed from: g, reason: collision with root package name */
    public v f13387g;

    /* renamed from: h, reason: collision with root package name */
    public G f13388h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13389i;

    static {
        char[] charArray = "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        G7.j.d(charArray, "(this as java.lang.String).toCharArray()");
        StringBuilder sb = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        int nextInt = secureRandom.nextInt(11) + 30;
        if (nextInt > 0) {
            int i9 = 0;
            do {
                i9++;
                sb.append(charArray[secureRandom.nextInt(charArray.length)]);
            } while (i9 < nextInt);
        }
        String sb2 = sb.toString();
        G7.j.d(sb2, "buffer.toString()");
        f13380j = sb2;
        f13381k = Pattern.compile("^/?v\\d+\\.\\d+/(.*)");
    }

    public C(C0785a c0785a, String str, Bundle bundle, G g9, v vVar) {
        this.f13382a = c0785a;
        this.b = str;
        this.f13386f = null;
        j(vVar);
        this.f13388h = g9 == null ? G.b : g9;
        if (bundle != null) {
            this.f13384d = new Bundle(bundle);
        } else {
            this.f13384d = new Bundle();
        }
        this.f13386f = r.d();
    }

    public static String f() {
        String b = r.b();
        AbstractC1839h.k();
        String str = r.f13805f;
        if (str != null) {
            if (b.length() > 0 && str.length() > 0) {
                return b + '|' + str;
            }
            return null;
        }
        throw new C1849l("A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information.");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r6 = this;
            android.os.Bundle r0 = r6.f13384d
            java.lang.String r1 = r6.e()
            r2 = 0
            if (r1 != 0) goto Lb
            r3 = r2
            goto L11
        Lb:
            java.lang.String r3 = "|"
            boolean r3 = O7.g.E(r3, r1)
        L11:
            java.lang.String r4 = "access_token"
            if (r1 == 0) goto L26
            java.lang.String r5 = "IG"
            boolean r1 = O7.o.C(r1, r5, r2)
            if (r1 == 0) goto L26
            if (r3 != 0) goto L26
            boolean r1 = r6.i()
            if (r1 == 0) goto L26
            goto L3d
        L26:
            java.lang.String r1 = com.facebook.r.e()
            java.lang.String r2 = "instagram.com"
            boolean r1 = G7.j.a(r1, r2)
            r2 = 1
            if (r1 != 0) goto L34
            goto L39
        L34:
            boolean r1 = r6.i()
            r2 = r2 ^ r1
        L39:
            if (r2 != 0) goto L45
            if (r3 != 0) goto L45
        L3d:
            java.lang.String r1 = f()
            r0.putString(r4, r1)
            goto L4e
        L45:
            java.lang.String r1 = r6.e()
            if (r1 == 0) goto L4e
            r0.putString(r4, r1)
        L4e:
            boolean r1 = r0.containsKey(r4)
            if (r1 != 0) goto L73
            com.facebook.r r1 = com.facebook.r.f13801a
            com.facebook.internal.AbstractC1839h.k()
            java.lang.String r1 = com.facebook.r.f13805f
            if (r1 == 0) goto L6b
            boolean r1 = com.facebook.internal.H.B(r1)
            if (r1 == 0) goto L73
            java.lang.String r1 = "C"
            java.lang.String r2 = "Starting with v13 of the SDK, a client token must be embedded in your client code before making Graph API calls. Visit https://developers.facebook.com/docs/android/getting-started#client-token to learn how to implement this change."
            android.util.Log.w(r1, r2)
            goto L73
        L6b:
            com.facebook.l r0 = new com.facebook.l
            java.lang.String r1 = "A valid Facebook client token must be set in the AndroidManifest.xml or set by calling FacebookSdk.setClientToken before initializing the sdk. Visit https://developers.facebook.com/docs/android/getting-started#add-app_id for more information."
            r0.<init>(r1)
            throw r0
        L73:
            java.lang.String r1 = "sdk"
            java.lang.String r2 = "android"
            r0.putString(r1, r2)
            java.lang.String r1 = "format"
            java.lang.String r2 = "json"
            r0.putString(r1, r2)
            com.facebook.r r0 = com.facebook.r.f13801a
            com.facebook.H r0 = com.facebook.H.f13416i
            com.facebook.r.h(r0)
            com.facebook.H r0 = com.facebook.H.f13415h
            com.facebook.r.h(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.C.a():void");
    }

    public final String b(String str, boolean z8) {
        if (!z8 && this.f13388h == G.f13409c) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (String str2 : this.f13384d.keySet()) {
            Object obj = this.f13384d.get(str2);
            if (obj == null) {
                obj = "";
            }
            if (R3.e.v(obj)) {
                buildUpon.appendQueryParameter(str2, R3.e.k(obj).toString());
            } else if (this.f13388h != G.b) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unsupported parameter type for GET request: %s", Arrays.copyOf(new Object[]{obj.getClass().getSimpleName()}, 1)));
            }
        }
        String builder = buildUpon.toString();
        G7.j.d(builder, "uriBuilder.toString()");
        return builder;
    }

    public final F c() {
        ArrayList r9 = R3.e.r(new E(AbstractC2815f.D(new C[]{this})));
        if (r9.size() == 1) {
            return (F) r9.get(0);
        }
        throw new C1849l("invalid state: expected a single response");
    }

    public final D d() {
        E e4 = new E(AbstractC2815f.D(new C[]{this}));
        AbstractC1839h.i(e4);
        D d2 = new D(e4);
        d2.executeOnExecutor(r.c(), new Void[0]);
        return d2;
    }

    public final String e() {
        C0785a c0785a = this.f13382a;
        if (c0785a != null) {
            if (!this.f13384d.containsKey("access_token")) {
                L4.f fVar = com.facebook.internal.z.f13680c;
                String str = c0785a.f13445g;
                fVar.p(str);
                return str;
            }
        } else if (!this.f13384d.containsKey("access_token")) {
            return f();
        }
        return this.f13384d.getString("access_token");
    }

    public final String g() {
        String format;
        String str;
        if (this.f13388h == G.f13409c && (str = this.b) != null && str.endsWith("/videos")) {
            format = String.format("https://graph-video.%s", Arrays.copyOf(new Object[]{r.e()}, 1));
        } else {
            String e4 = r.e();
            G7.j.e(e4, "subdomain");
            format = String.format("https://graph.%s", Arrays.copyOf(new Object[]{e4}, 1));
        }
        String h6 = h(format);
        a();
        return b(h6, false);
    }

    public final String h(String str) {
        boolean z8;
        if (!G7.j.a(r.e(), "instagram.com")) {
            z8 = true;
        } else {
            z8 = !i();
        }
        if (!z8) {
            str = String.format("https://graph.%s", Arrays.copyOf(new Object[]{r.f13814q}, 1));
        }
        Pattern pattern = f13381k;
        String str2 = this.b;
        if (!pattern.matcher(str2).matches()) {
            str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{this.f13386f, str2}, 2));
        }
        return String.format("%s/%s", Arrays.copyOf(new Object[]{str, str2}, 2));
    }

    public final boolean i() {
        String str = this.b;
        if (str == null) {
            return false;
        }
        String str2 = "^/?" + r.b() + "/?.*";
        if (!this.f13389i && !Pattern.matches(str2, str) && !Pattern.matches("^/?app/?.*", str)) {
            return false;
        }
        return true;
    }

    public final void j(v vVar) {
        r rVar = r.f13801a;
        r.h(H.f13416i);
        r.h(H.f13415h);
        this.f13387g = vVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{Request:  accessToken: ");
        Object obj = this.f13382a;
        if (obj == null) {
            obj = "null";
        }
        sb.append(obj);
        sb.append(", graphPath: ");
        sb.append(this.b);
        sb.append(", graphObject: ");
        sb.append(this.f13383c);
        sb.append(", httpMethod: ");
        sb.append(this.f13388h);
        sb.append(", parameters: ");
        sb.append(this.f13384d);
        sb.append("}");
        String sb2 = sb.toString();
        G7.j.d(sb2, "StringBuilder()\n        .append(\"{Request: \")\n        .append(\" accessToken: \")\n        .append(if (accessToken == null) \"null\" else accessToken)\n        .append(\", graphPath: \")\n        .append(graphPath)\n        .append(\", graphObject: \")\n        .append(graphObject)\n        .append(\", httpMethod: \")\n        .append(httpMethod)\n        .append(\", parameters: \")\n        .append(parameters)\n        .append(\"}\")\n        .toString()");
        return sb2;
    }
}
