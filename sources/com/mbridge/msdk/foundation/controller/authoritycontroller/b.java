package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.e;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.OnCompletionListener;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f13040c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f13041d = true;

    /* renamed from: b, reason: collision with root package name */
    protected AuthorityInfoBean f13042b;

    /* renamed from: g, reason: collision with root package name */
    private e f13045g;
    public ArrayList<String> a = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private int f13043e = 3;

    /* renamed from: f, reason: collision with root package name */
    private String f13044f = "";

    public b() {
        c();
    }

    public static boolean b() {
        return f13041d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i10;
        boolean b3 = this.f13045g.b();
        c(this.f13045g.a());
        if (b3) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        c(i10);
        this.f13042b.authDeviceIdStatus(b3 ? 1 : 0);
    }

    public abstract int b(String str);

    public final void c() {
        this.f13042b = new AuthorityInfoBean();
        try {
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.f13042b.authGenDataStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.f13042b.authDeviceIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.f13042b.authSerialIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.f13042b.authOther(1);
            }
            this.a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public final AuthorityInfoBean d() {
        AuthorityInfoBean authorityInfoBean = this.f13042b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public final boolean e() {
        int i10 = this.f13043e;
        return i10 == 1 || i10 == 3;
    }

    public final int f() {
        return com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_COPPA, 0);
    }

    public final int g() {
        return this.f13043e;
    }

    public final String h() {
        JSONArray jSONArray = new JSONArray();
        for (int i10 = 0; i10 < this.a.size(); i10++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.a.get(i10)));
                jSONObject.put("client_status", a(this.a.get(i10)));
                jSONObject.put("server_status", b(this.a.get(i10)));
                jSONArray.put(jSONObject);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public final String i() {
        return this.f13044f;
    }

    public static void b(boolean z10) {
        f13041d = z10;
    }

    public static boolean a() {
        return f13040c;
    }

    public final void b(int i10) {
        com.mbridge.msdk.foundation.a.a.a.a().b(MBridgeConstans.AUTHORITY_DNT, i10);
    }

    public static void a(boolean z10) {
        f13040c = z10;
    }

    public final void a(int i10) {
        if (this.f13042b != null) {
            c(i10);
        }
    }

    public final void a(final Context context, final OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            com.mbridge.msdk.foundation.same.f.b.b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    b.this.a(context);
                    onCompletionListener.onCompletion();
                }
            });
        } else {
            a(context);
        }
    }

    public final int a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String a = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (TextUtils.isEmpty(a)) {
                    return 0;
                }
                return Integer.parseInt(a);
            }
        } catch (Exception e2) {
            ad.b("SDKAuthorityController", e2.getMessage());
        }
        return 0;
    }

    public final void a(String str, int i10) {
        if (this.f13042b != null) {
            if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                this.f13042b.authGenDataStatus(i10);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                this.f13042b.authDeviceIdStatus(i10);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
                this.f13042b.a(i10);
            } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
                this.f13042b.authSerialIdStatus(i10);
            } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
                this.f13042b.authOther(i10);
            }
        }
    }

    private void c(int i10) {
        this.f13043e = i10 != 1 ? 2 : 1;
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f13044f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f13045g == null) {
                e eVar = new e(context);
                this.f13045g = eVar;
                eVar.a(new e.a() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.2
                    @Override // com.mbridge.msdk.foundation.controller.e.a
                    public final void a() {
                        b.this.j();
                    }
                });
            }
            j();
        } catch (Throwable th2) {
            ad.b("SDKAuthorityController", th2.getMessage());
        }
    }
}
