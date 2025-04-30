package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pgl.ssdk.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2066u {

    /* renamed from: a, reason: collision with root package name */
    private static int f19599a = 0;
    private static int b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f19600c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f19601d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f19602e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f19603f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f19604g = false;

    /* renamed from: h, reason: collision with root package name */
    private static InputManager f19605h;

    /* renamed from: com.pgl.ssdk.u$a */
    /* loaded from: classes3.dex */
    public static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f19606a;
        final /* synthetic */ int b;

        public a(Context context, int i9) {
            this.f19606a = context;
            this.b = i9;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isExternal;
            InputManager a6 = C2066u.a(this.f19606a);
            if (a6 == null) {
                return;
            }
            InputDevice inputDevice = a6.getInputDevice(this.b);
            C2066u.g();
            if (inputDevice == null) {
                C2066u.a();
                C2066u.b();
                C2066u.a("nihc");
            } else if (inputDevice.isVirtual()) {
                C2066u.c();
                C2066u.d();
                C2066u.a("vihc");
            } else if (Build.VERSION.SDK_INT >= 29) {
                isExternal = inputDevice.isExternal();
                if (isExternal) {
                    C2066u.e();
                    C2066u.f();
                    C2066u.a("eihc");
                }
            }
        }
    }

    public static /* synthetic */ int a() {
        int i9 = f19600c;
        f19600c = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int b() {
        int i9 = f19603f;
        f19603f = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int c() {
        int i9 = f19599a;
        f19599a = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int d() {
        int i9 = f19601d;
        f19601d = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int e() {
        int i9 = b;
        b = i9 + 1;
        return i9;
    }

    public static /* synthetic */ int f() {
        int i9 = f19602e;
        f19602e = i9 + 1;
        return i9;
    }

    public static void g() {
        if (f19604g) {
            return;
        }
        try {
            SharedPreferences a6 = K.a(v.b());
            if (a6 != null) {
                f19603f = a6.getInt("nihc", 0);
                f19602e = a6.getInt("eihc", 0);
                f19601d = a6.getInt("vihc", 0);
                f19604g = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            AbstractC2049c.a(new a(context, motionEvent.getDeviceId()));
        }
    }

    public static void a(String str) {
        try {
            SharedPreferences a6 = K.a(v.b());
            if (a6 != null) {
                a6.edit().putInt(str, a6.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            jSONObject.put("vihc", f19601d);
            jSONObject.put("eihc", f19602e);
            jSONObject.put("nihc", f19603f);
            jSONObject.put("vic", f19599a);
            jSONObject.put("nic", f19600c);
            jSONObject.put("eic", b);
        } catch (JSONException unused) {
        }
    }

    public static InputManager a(Context context) {
        if (f19605h == null) {
            f19605h = (InputManager) context.getSystemService("input");
        }
        return f19605h;
    }
}
