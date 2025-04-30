package com.facebook.appevents;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.view.View;
import com.applovin.sdk.AppLovinEventTypes;
import com.facebook.C;
import com.facebook.C0785a;
import com.facebook.C1849l;
import com.facebook.G;
import com.facebook.internal.K;
import com.facebook.w;
import com.facebook.z;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.SameMD5;
import i8.C2371h;
import i8.I;
import i8.u;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONObject;
import q.Z0;
import q.b1;
import u7.C2826q;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f13486a = true;
    public static volatile E1.d b;

    /* renamed from: c, reason: collision with root package name */
    public static volatile E1.c f13487c;

    public static void a(StringBuilder sb, Object obj, F7.l lVar) {
        boolean z8;
        if (lVar != null) {
            sb.append((CharSequence) lVar.invoke(obj));
            return;
        }
        if (obj == null) {
            z8 = true;
        } else {
            z8 = obj instanceof CharSequence;
        }
        if (z8) {
            sb.append((CharSequence) obj);
        } else if (obj instanceof Character) {
            sb.append(((Character) obj).charValue());
        } else {
            sb.append((CharSequence) String.valueOf(obj));
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L2.d] */
    public static final L2.d b(String str, String str2) {
        ?? obj = new Object();
        obj.b = L2.b.f1711d;
        Context a6 = com.facebook.r.a();
        String str3 = null;
        try {
            PackageInfo packageInfo = a6.getPackageManager().getPackageInfo(a6.getPackageName(), 0);
            if (packageInfo != null) {
                str3 = packageInfo.versionName;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        obj.f1719d = str3;
        obj.f1720e = str;
        obj.f1721f = str2;
        Long valueOf = Long.valueOf(System.currentTimeMillis() / 1000);
        obj.f1722g = valueOf;
        StringBuffer stringBuffer = new StringBuffer("anr_log_");
        stringBuffer.append(String.valueOf(valueOf));
        stringBuffer.append(".json");
        String stringBuffer2 = stringBuffer.toString();
        G7.j.d(stringBuffer2, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        obj.f1717a = stringBuffer2;
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, L2.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final L2.d c(java.lang.Throwable r7, L2.b r8) {
        /*
            L2.d r0 = new L2.d
            r0.<init>()
            r0.b = r8
            android.content.Context r1 = com.facebook.r.a()
            java.lang.String r2 = r1.getPackageName()
            r3 = 0
            r4 = 0
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
            if (r1 != 0) goto L1d
        L1b:
            r1 = r4
            goto L1f
        L1d:
            java.lang.String r1 = r1.versionName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1b
        L1f:
            r0.f1719d = r1
            if (r7 != 0) goto L25
            r1 = r4
            goto L38
        L25:
            java.lang.Throwable r1 = r7.getCause()
            if (r1 != 0) goto L30
            java.lang.String r1 = r7.toString()
            goto L38
        L30:
            java.lang.Throwable r1 = r7.getCause()
            java.lang.String r1 = java.lang.String.valueOf(r1)
        L38:
            r0.f1720e = r1
            if (r7 != 0) goto L3d
            goto L6a
        L3d:
            org.json.JSONArray r1 = new org.json.JSONArray
            r1.<init>()
        L42:
            if (r7 == 0) goto L66
            if (r7 == r4) goto L66
            java.lang.StackTraceElement[] r2 = r7.getStackTrace()
            java.lang.String r4 = "t.stackTrace"
            G7.j.d(r2, r4)
            int r4 = r2.length
            r5 = r3
        L51:
            if (r5 >= r4) goto L5f
            r6 = r2[r5]
            int r5 = r5 + 1
            java.lang.String r6 = r6.toString()
            r1.put(r6)
            goto L51
        L5f:
            java.lang.Throwable r2 = r7.getCause()
            r4 = r7
            r7 = r2
            goto L42
        L66:
            java.lang.String r4 = r1.toString()
        L6a:
            r0.f1721f = r4
            long r1 = java.lang.System.currentTimeMillis()
            r7 = 1000(0x3e8, float:1.401E-42)
            long r3 = (long) r7
            long r1 = r1 / r3
            java.lang.Long r7 = java.lang.Long.valueOf(r1)
            r0.f1722g = r7
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            int r8 = r8.ordinal()
            r2 = 1
            if (r8 == r2) goto La1
            r2 = 2
            if (r8 == r2) goto L9e
            r2 = 3
            if (r8 == r2) goto L9b
            r2 = 4
            if (r8 == r2) goto L98
            r2 = 5
            if (r8 == r2) goto L95
            java.lang.String r8 = "Unknown"
            goto La3
        L95:
            java.lang.String r8 = "thread_check_log_"
            goto La3
        L98:
            java.lang.String r8 = "shield_log_"
            goto La3
        L9b:
            java.lang.String r8 = "crash_log_"
            goto La3
        L9e:
            java.lang.String r8 = "anr_log_"
            goto La3
        La1:
            java.lang.String r8 = "analysis_log_"
        La3:
            r1.append(r8)
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r1.append(r7)
            java.lang.String r7 = ".json"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            java.lang.String r8 = "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()"
            G7.j.d(r7, r8)
            r0.f1717a = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.i.c(java.lang.Throwable, L2.b):L2.d");
    }

    public static C d(String str, C0785a c0785a, String str2) {
        String str3;
        String str4 = C.f13380j;
        C x9 = R3.e.x(c0785a, String.format(Locale.US, "%s/app_indexing", Arrays.copyOf(new Object[]{str2}, 1)), null, null);
        Bundle bundle = x9.f13384d;
        if (bundle == null) {
            bundle = new Bundle();
        }
        bundle.putString("tree", str);
        Context a6 = com.facebook.r.a();
        try {
            str3 = a6.getPackageManager().getPackageInfo(a6.getPackageName(), 0).versionName;
            G7.j.d(str3, "{\n      val packageInfo = context.packageManager.getPackageInfo(context.packageName, 0)\n      packageInfo.versionName\n    }");
        } catch (PackageManager.NameNotFoundException unused) {
            str3 = "";
        }
        bundle.putString("app_version", str3);
        bundle.putString("platform", "android");
        bundle.putString("request_type", "app_indexing");
        if ("app_indexing".equals("app_indexing")) {
            bundle.putString("device_session_id", z2.d.a());
        }
        x9.f13384d = bundle;
        x9.j(new w(2));
        return x9;
    }

    public static int e(int i9, int i10) {
        if (i10 <= 1073741823) {
            return Math.min(Math.max(i9, i10), 1073741823);
        }
        throw new IllegalArgumentException(F2.h.B("min (%s) must be less than or equal to max (%s)", Integer.valueOf(i10), 1073741823));
    }

    public static int f(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }

    public static Drawable g(Context context, Context context2, int i9, Resources.Theme theme) {
        try {
            if (f13486a) {
                return l(context2, i9, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e4) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return I.h.getDrawable(context2, i9);
            }
            throw e4;
        } catch (NoClassDefFoundError unused2) {
            f13486a = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        Resources resources = context2.getResources();
        ThreadLocal threadLocal = K.o.f1632a;
        return K.i.a(resources, i9, theme);
    }

    public static String h(String str, JSONObject jSONObject) {
        if (jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return null;
    }

    public static boolean i(I i9, i8.C c9) {
        G7.j.e(c9, com.vungle.ads.internal.ui.i.REQUEST_KEY_EXTRA);
        int i10 = i9.f20776f;
        if (i10 != 200 && i10 != 410 && i10 != 414 && i10 != 501 && i10 != 203 && i10 != 204) {
            if (i10 != 307) {
                if (i10 != 308 && i10 != 404 && i10 != 405) {
                    switch (i10) {
                        case 300:
                        case 301:
                            break;
                        case 302:
                            break;
                        default:
                            return false;
                    }
                }
            }
            if (I.b(i9, "Expires") == null && i9.a().f20828c == -1 && !i9.a().f20831f && !i9.a().f20830e) {
                return false;
            }
        }
        if (i9.a().b) {
            return false;
        }
        C2371h c2371h = c9.f20758f;
        if (c2371h == null) {
            int i11 = C2371h.f20826n;
            c2371h = n.m(c9.f20755c);
            c9.f20758f = c2371h;
        }
        if (c2371h.b) {
            return false;
        }
        return true;
    }

    public static String j(u uVar) {
        G7.j.e(uVar, "url");
        w8.i iVar = w8.i.f24015f;
        return r6.b.c(uVar.f20891i).b(SameMD5.TAG).d();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, L2.d] */
    public static final L2.d k(File file) {
        L2.b bVar;
        G7.j.e(file, "file");
        ?? obj = new Object();
        String name = file.getName();
        G7.j.d(name, "file.name");
        obj.f1717a = name;
        if (O7.o.C(name, "crash_log_", false)) {
            bVar = L2.b.f1712f;
        } else if (O7.o.C(name, "shield_log_", false)) {
            bVar = L2.b.f1713g;
        } else if (O7.o.C(name, "thread_check_log_", false)) {
            bVar = L2.b.f1714h;
        } else if (O7.o.C(name, "analysis_log_", false)) {
            bVar = L2.b.f1710c;
        } else if (O7.o.C(name, "anr_log_", false)) {
            bVar = L2.b.f1711d;
        } else {
            bVar = L2.b.b;
        }
        obj.b = bVar;
        JSONObject s5 = n.s(name);
        if (s5 != null) {
            obj.f1722g = Long.valueOf(s5.optLong(CampaignEx.JSON_KEY_TIMESTAMP, 0L));
            obj.f1719d = s5.optString("app_version", null);
            obj.f1720e = s5.optString("reason", null);
            obj.f1721f = s5.optString("callstack", null);
            obj.f1718c = s5.optJSONArray("feature_names");
        }
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [o.d, android.content.ContextWrapper] */
    public static Drawable l(Context context, int i9, Resources.Theme theme) {
        if (theme != null) {
            ?? contextWrapper = new ContextWrapper(context);
            contextWrapper.b = theme;
            contextWrapper.a(theme.getResources().getConfiguration());
            context = contextWrapper;
        }
        return n.g(context, i9);
    }

    public static final C m(C0785a c0785a, Uri uri, K k6) {
        String path = uri.getPath();
        boolean equalsIgnoreCase = "file".equalsIgnoreCase(uri.getScheme());
        G g9 = G.f13409c;
        if (equalsIgnoreCase && path != null) {
            z zVar = new z(ParcelFileDescriptor.open(new File(path), 268435456));
            Bundle bundle = new Bundle(1);
            bundle.putParcelable("file", zVar);
            return new C(c0785a, "me/staging_resources", bundle, g9, k6);
        }
        if (AppLovinEventTypes.USER_VIEWED_CONTENT.equalsIgnoreCase(uri.getScheme())) {
            z zVar2 = new z(uri);
            Bundle bundle2 = new Bundle(1);
            bundle2.putParcelable("file", zVar2);
            return new C(c0785a, "me/staging_resources", bundle2, g9, k6);
        }
        throw new C1849l("The image Uri must be either a file:// or content:// Uri");
    }

    public static final synchronized void n(D0.i iVar) {
        s sVar;
        synchronized (i.class) {
            if (O2.a.b(i.class)) {
                return;
            }
            try {
                G7.j.e(iVar, "eventsToPersist");
                r v6 = g.v();
                for (b bVar : iVar.d()) {
                    synchronized (iVar) {
                        G7.j.e(bVar, "accessTokenAppIdPair");
                        sVar = (s) iVar.f614a.get(bVar);
                    }
                    if (sVar != null) {
                        v6.a(bVar, sVar.c());
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                g.w(v6);
            } catch (Throwable th) {
                O2.a.a(i.class, th);
            }
        }
    }

    public static final synchronized void o(b bVar, s sVar) {
        synchronized (i.class) {
            if (O2.a.b(i.class)) {
                return;
            }
            try {
                G7.j.e(bVar, "accessTokenAppIdPair");
                G7.j.e(sVar, "appEvents");
                r v6 = g.v();
                v6.a(bVar, sVar.c());
                g.w(v6);
            } catch (Throwable th) {
                O2.a.a(i.class, th);
            }
        }
    }

    public static int p(w8.t tVar) {
        try {
            long readDecimalLong = tVar.readDecimalLong();
            String readUtf8LineStrict = tVar.readUtf8LineStrict(Long.MAX_VALUE);
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.length() <= 0) {
                return (int) readDecimalLong;
            }
            throw new IOException("expected an int but was \"" + readDecimalLong + readUtf8LineStrict + '\"');
        } catch (NumberFormatException e4) {
            throw new IOException(e4.getMessage());
        }
    }

    public static void q(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            Z0.a(view, charSequence);
            return;
        }
        b1 b1Var = b1.m;
        if (b1Var != null && b1Var.b == view) {
            b1.b(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            b1 b1Var2 = b1.f22627n;
            if (b1Var2 != null && b1Var2.b == view) {
                b1Var2.a();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new b1(view, charSequence);
    }

    public static Set r(i8.s sVar) {
        int size = sVar.size();
        TreeSet treeSet = null;
        int i9 = 0;
        while (i9 < size) {
            int i10 = i9 + 1;
            if ("Vary".equalsIgnoreCase(sVar.c(i9))) {
                String e4 = sVar.e(i9);
                if (treeSet == null) {
                    Comparator comparator = String.CASE_INSENSITIVE_ORDER;
                    G7.j.d(comparator, "CASE_INSENSITIVE_ORDER");
                    treeSet = new TreeSet(comparator);
                }
                Iterator it = O7.g.U(e4, new char[]{','}).iterator();
                while (it.hasNext()) {
                    treeSet.add(O7.g.a0((String) it.next()).toString());
                }
            }
            i9 = i10;
        }
        if (treeSet == null) {
            return C2826q.b;
        }
        return treeSet;
    }
}
