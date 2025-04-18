package hb;

import a6.k;
import android.app.UiModeManager;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import java.util.Objects;
import jb.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t.h;
import x5.i;

/* loaded from: classes3.dex */
public final class d implements a, od.b, pe.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f19010b;

    /* renamed from: c, reason: collision with root package name */
    public Object f19011c;

    public /* synthetic */ d(Object obj, int i10) {
        this.f19010b = i10;
        this.f19011c = obj;
    }

    public static boolean h(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String k(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    @Override // od.b
    public final JSONObject a(View view) {
        JSONObject a = qd.c.a(0, 0, 0, 0);
        UiModeManager uiModeManager = i.f27399c;
        char c10 = 3;
        if (uiModeManager != null) {
            int currentModeType = uiModeManager.getCurrentModeType();
            if (currentModeType == 1) {
                c10 = 2;
            } else if (currentModeType == 4) {
                c10 = 1;
            }
        }
        try {
            a.put("noOutputDevice", qd.a.a[h.b(c10 == 1 ? c6.c.f2628c : 2)] == 1);
        } catch (JSONException e2) {
            k.b("Error with setting output device status", e2);
        }
        return a;
    }

    public final boolean b(String str) {
        String g10 = g(str);
        if (!"1".equals(g10) && !Boolean.parseBoolean(g10)) {
            return false;
        }
        return true;
    }

    public final Integer c(String str) {
        String g10 = g(str);
        if (!TextUtils.isEmpty(g10)) {
            try {
                return Integer.valueOf(Integer.parseInt(g10));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + k(str) + "(" + g10 + ") into an int");
                return null;
            }
        }
        return null;
    }

    public final JSONArray d(String str) {
        String g10 = g(str);
        if (!TextUtils.isEmpty(g10)) {
            try {
                return new JSONArray(g10);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + k(str) + ": " + g10 + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final String e(Resources resources, String str, String str2) {
        String[] strArr;
        String g10 = g(str2);
        if (!TextUtils.isEmpty(g10)) {
            return g10;
        }
        String g11 = g(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(g11)) {
            return null;
        }
        int identifier = resources.getIdentifier(g11, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", k(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray d10 = d(str2.concat("_loc_args"));
        if (d10 == null) {
            strArr = null;
        } else {
            int length = d10.length();
            strArr = new String[length];
            for (int i10 = 0; i10 < length; i10++) {
                strArr[i10] = d10.optString(i10);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e2) {
            Log.w("NotificationParams", "Missing format argument for " + k(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e2);
            return null;
        }
    }

    @Override // hb.a
    public final void f(Bundle bundle) {
        ((za.c) ((za.b) this.f19011c)).a("clx", "_ae", bundle);
    }

    public final String g(String str) {
        String replace;
        Bundle bundle = (Bundle) this.f19011c;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (((Bundle) this.f19011c).containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle i() {
        boolean z10;
        Bundle bundle = new Bundle((Bundle) this.f19011c);
        for (String str : ((Bundle) this.f19011c).keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10) {
                bundle.remove(str);
            }
        }
        return bundle;
    }

    public final JSONObject j() {
        FileInputStream fileInputStream;
        JSONObject jSONObject;
        b6.a aVar = b6.a.f2288f;
        FileInputStream fileInputStream2 = null;
        aVar.d("Checking for cached settings...", null);
        try {
            File file = (File) this.f19011c;
            if (file.exists()) {
                fileInputStream = new FileInputStream(file);
                try {
                    try {
                        jSONObject = new JSONObject(g.J(fileInputStream));
                        fileInputStream2 = fileInputStream;
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        g.c(fileInputStream2, "Error while closing settings cache file.");
                        throw th;
                    }
                } catch (Exception e2) {
                    e = e2;
                    aVar.e("Failed to fetch cached settings", e);
                    g.c(fileInputStream, "Error while closing settings cache file.");
                    return null;
                }
            } else {
                aVar.h("Settings file does not exist.");
                jSONObject = null;
            }
            g.c(fileInputStream2, "Error while closing settings cache file.");
            return jSONObject;
        } catch (Exception e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            g.c(fileInputStream2, "Error while closing settings cache file.");
            throw th;
        }
    }

    public final String toString() {
        switch (this.f19010b) {
            case 3:
                return ((Field) this.f19011c).toString();
            default:
                return super.toString();
        }
    }

    public d(TypedArray typedArray) {
        this.f19010b = 6;
        this.f19011c = null;
        try {
            this.f19011c = (qe.a) Class.forName(typedArray.getString(9)).newInstance();
        } catch (Exception unused) {
            this.f19011c = new qe.b();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0079  */
    @Override // od.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(android.view.View r7, org.json.JSONObject r8, od.a r9, boolean r10, boolean r11) {
        /*
            r6 = this;
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            nd.c r10 = nd.c.f22727c
            if (r10 == 0) goto L8f
            java.util.Collection r10 = r10.a()
            int r0 = r10.size()
            int r0 = r0 * 2
            int r0 = r0 + 3
            java.util.IdentityHashMap r1 = new java.util.IdentityHashMap
            r1.<init>(r0)
            java.util.Iterator r10 = r10.iterator()
        L1e:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L8f
            java.lang.Object r0 = r10.next()
            kd.i r0 = (kd.i) r0
            ce.a r0 = r0.f20671d
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            if (r0 == 0) goto L1e
            boolean r2 = r0.isAttachedToWindow()
            if (r2 != 0) goto L3b
            goto L4e
        L3b:
            boolean r2 = r0.isShown()
            if (r2 != 0) goto L42
            goto L4e
        L42:
            r2 = r0
        L43:
            if (r2 == 0) goto L5d
            float r3 = r2.getAlpha()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L50
        L4e:
            r2 = 0
            goto L5e
        L50:
            android.view.ViewParent r2 = r2.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L5b
            android.view.View r2 = (android.view.View) r2
            goto L43
        L5b:
            r2 = 0
            goto L43
        L5d:
            r2 = 1
        L5e:
            if (r2 == 0) goto L1e
            android.view.View r0 = r0.getRootView()
            if (r0 == 0) goto L1e
            boolean r2 = r1.containsKey(r0)
            if (r2 != 0) goto L1e
            r1.put(r0, r0)
            float r2 = r0.getZ()
            int r3 = r7.size()
        L77:
            if (r3 <= 0) goto L8b
            int r4 = r3 + (-1)
            java.lang.Object r5 = r7.get(r4)
            android.view.View r5 = (android.view.View) r5
            float r5 = r5.getZ()
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 <= 0) goto L8b
            r3 = r4
            goto L77
        L8b:
            r7.add(r3, r0)
            goto L1e
        L8f:
            java.util.Iterator r7 = r7.iterator()
        L93:
            boolean r10 = r7.hasNext()
            if (r10 == 0) goto Laa
            java.lang.Object r10 = r7.next()
            android.view.View r10 = (android.view.View) r10
            java.lang.Object r0 = r6.f19011c
            od.b r0 = (od.b) r0
            r1 = r9
            rd.a r1 = (rd.a) r1
            r1.a(r10, r0, r8, r11)
            goto L93
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hb.d.a(android.view.View, org.json.JSONObject, od.a, boolean, boolean):void");
    }

    public d(ob.c cVar) {
        this.f19010b = 1;
        this.f19011c = new File((File) cVar.f23293c, "com.crashlytics.settings.json");
    }

    public d(Field field) {
        this.f19010b = 3;
        Objects.requireNonNull(field);
        this.f19011c = field;
    }

    public d(Bundle bundle) {
        this.f19010b = 2;
        this.f19011c = new Bundle(bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10) {
        this();
        this.f19010b = 7;
    }

    public d() {
        this.f19010b = 7;
    }
}
