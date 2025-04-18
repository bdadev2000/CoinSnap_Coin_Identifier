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
/* loaded from: classes4.dex */
public class C1277u {
    private static int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private static int f16578b = 0;

    /* renamed from: c, reason: collision with root package name */
    private static int f16579c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static int f16580d = 0;

    /* renamed from: e, reason: collision with root package name */
    private static int f16581e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static int f16582f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static boolean f16583g = false;

    /* renamed from: h, reason: collision with root package name */
    private static InputManager f16584h;

    /* renamed from: com.pgl.ssdk.u$a */
    /* loaded from: classes4.dex */
    public static class a implements Runnable {
        final /* synthetic */ Context a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f16585b;

        public a(Context context, int i10) {
            this.a = context;
            this.f16585b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean isExternal;
            InputManager a = C1277u.a(this.a);
            if (a == null) {
                return;
            }
            InputDevice inputDevice = a.getInputDevice(this.f16585b);
            C1277u.g();
            if (inputDevice == null) {
                C1277u.a();
                C1277u.b();
                C1277u.a("nihc");
            } else if (inputDevice.isVirtual()) {
                C1277u.c();
                C1277u.d();
                C1277u.a("vihc");
            } else if (Build.VERSION.SDK_INT >= 29) {
                isExternal = inputDevice.isExternal();
                if (isExternal) {
                    C1277u.e();
                    C1277u.f();
                    C1277u.a("eihc");
                }
            }
        }
    }

    public static /* synthetic */ int a() {
        int i10 = f16579c;
        f16579c = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int b() {
        int i10 = f16582f;
        f16582f = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int c() {
        int i10 = a;
        a = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int d() {
        int i10 = f16580d;
        f16580d = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int e() {
        int i10 = f16578b;
        f16578b = i10 + 1;
        return i10;
    }

    public static /* synthetic */ int f() {
        int i10 = f16581e;
        f16581e = i10 + 1;
        return i10;
    }

    public static void g() {
        if (f16583g) {
            return;
        }
        try {
            SharedPreferences a10 = L.a(C1278v.b());
            if (a10 != null) {
                f16582f = a10.getInt("nihc", 0);
                f16581e = a10.getInt("eihc", 0);
                f16580d = a10.getInt("vihc", 0);
                f16583g = true;
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(MotionEvent motionEvent, Context context) {
        if (motionEvent == null || context == null) {
            return;
        }
        if (motionEvent.getRawX() > 0.0f || motionEvent.getRawY() > 0.0f) {
            AbstractC1260c.a(new a(context, motionEvent.getDeviceId()));
        }
    }

    public static void a(String str) {
        try {
            SharedPreferences a10 = L.a(C1278v.b());
            if (a10 != null) {
                a10.edit().putInt(str, a10.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    public static void a(JSONObject jSONObject) {
        try {
            jSONObject.put("vihc", f16580d);
            jSONObject.put("eihc", f16581e);
            jSONObject.put("nihc", f16582f);
            jSONObject.put("vic", a);
            jSONObject.put("nic", f16579c);
            jSONObject.put("eic", f16578b);
        } catch (JSONException unused) {
        }
    }

    public static InputManager a(Context context) {
        if (f16584h == null) {
            f16584h = (InputManager) context.getSystemService("input");
        }
        return f16584h;
    }
}
