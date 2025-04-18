package com.mbridge.msdk.video.signal;

import android.app.Activity;
import com.mbridge.msdk.out.NativeListener;

/* loaded from: classes4.dex */
public interface a extends e {

    /* renamed from: com.mbridge.msdk.video.signal.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public interface InterfaceC0212a extends NativeListener.NativeTrackingListener {
        void a();

        void a(int i10, String str);

        void a(boolean z10);

        void b();
    }

    int a();

    void a(int i10);

    void a(int i10, String str);

    void a(Activity activity);

    void a(InterfaceC0212a interfaceC0212a);

    void a(com.mbridge.msdk.videocommon.d.c cVar);

    void a(String str);

    void a(kd.a aVar);

    void a(kd.b bVar);

    void a(ld.b bVar);

    void a(boolean z10);

    void b(int i10);

    void b(String str);

    void b(boolean z10);

    boolean b();

    String c();

    void c(int i10);

    void d();

    void d(int i10);

    void e();

    void e(int i10);

    void f();

    void f(int i10);

    int g();

    String g(int i10);

    int h();

    void h(int i10);

    String i();
}
