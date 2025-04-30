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

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: c, reason: collision with root package name */
    private static boolean f15394c = true;

    /* renamed from: d, reason: collision with root package name */
    private static boolean f15395d = true;
    protected AuthorityInfoBean b;

    /* renamed from: g, reason: collision with root package name */
    private e f15399g;

    /* renamed from: a, reason: collision with root package name */
    public ArrayList<String> f15396a = new ArrayList<>();

    /* renamed from: e, reason: collision with root package name */
    private int f15397e = 3;

    /* renamed from: f, reason: collision with root package name */
    private String f15398f = "";

    public b() {
        c();
    }

    public static boolean b() {
        return f15395d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        int i9;
        boolean b = this.f15399g.b();
        c(this.f15399g.a());
        if (b) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        c(i9);
        this.b.authDeviceIdStatus(b ? 1 : 0);
    }

    public abstract int b(String str);

    public final void c() {
        this.b = new AuthorityInfoBean();
        try {
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.b.authGenDataStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.b.authDeviceIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.b.authSerialIdStatus(1);
            }
            if (com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.b.authOther(1);
            }
            this.f15396a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f15396a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f15396a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f15396a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final AuthorityInfoBean d() {
        AuthorityInfoBean authorityInfoBean = this.b;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        AuthorityInfoBean authorityInfoBean2 = new AuthorityInfoBean();
        authorityInfoBean2.a(1);
        return authorityInfoBean2;
    }

    public final boolean e() {
        int i9 = this.f15397e;
        if (i9 == 1 || i9 == 3) {
            return true;
        }
        return false;
    }

    public final int f() {
        return com.mbridge.msdk.foundation.a.a.a.a().a(MBridgeConstans.AUTHORITY_COPPA, 0);
    }

    public final int g() {
        return this.f15397e;
    }

    public final String h() {
        JSONArray jSONArray = new JSONArray();
        for (int i9 = 0; i9 < this.f15396a.size(); i9++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f15396a.get(i9)));
                jSONObject.put("client_status", a(this.f15396a.get(i9)));
                jSONObject.put("server_status", b(this.f15396a.get(i9)));
                jSONArray.put(jSONObject);
            } catch (JSONException e4) {
                e4.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    public final String i() {
        return this.f15398f;
    }

    public static void b(boolean z8) {
        f15395d = z8;
    }

    public static boolean a() {
        return f15394c;
    }

    public final void b(int i9) {
        com.mbridge.msdk.foundation.a.a.a.a().b(MBridgeConstans.AUTHORITY_DNT, i9);
    }

    public static void a(boolean z8) {
        f15394c = z8;
    }

    public final void a(int i9) {
        if (this.b != null) {
            c(i9);
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
                String a6 = com.mbridge.msdk.foundation.a.a.a.a().a(str);
                if (TextUtils.isEmpty(a6)) {
                    return 0;
                }
                return Integer.parseInt(a6);
            }
        } catch (Exception e4) {
            ad.b("SDKAuthorityController", e4.getMessage());
        }
        return 0;
    }

    public final void a(String str, int i9) {
        if (this.b != null) {
            if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                this.b.authGenDataStatus(i9);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
                this.b.authDeviceIdStatus(i9);
                return;
            }
            if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
                this.b.a(i9);
            } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
                this.b.authSerialIdStatus(i9);
            } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
                this.b.authOther(i9);
            }
        }
    }

    private void c(int i9) {
        this.f15397e = i9 != 1 ? 2 : 1;
    }

    private void c(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f15398f = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context) {
        try {
            if (this.f15399g == null) {
                e eVar = new e(context);
                this.f15399g = eVar;
                eVar.a(new e.a() { // from class: com.mbridge.msdk.foundation.controller.authoritycontroller.b.2
                    @Override // com.mbridge.msdk.foundation.controller.e.a
                    public final void a() {
                        b.this.j();
                    }
                });
            }
            j();
        } catch (Throwable th) {
            ad.b("SDKAuthorityController", th.getMessage());
        }
    }
}
