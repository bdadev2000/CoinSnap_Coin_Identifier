package a2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import f2.C2269g;
import f2.InterfaceC2265c;
import g2.InterfaceC2288b;
import g2.InterfaceC2289c;
import j2.n;

/* renamed from: a2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0335d implements InterfaceC2289c {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3930c;

    /* renamed from: d, reason: collision with root package name */
    public InterfaceC2265c f3931d;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f3932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f3933g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3934h;

    /* renamed from: i, reason: collision with root package name */
    public Bitmap f3935i;

    public C0335d(Handler handler, int i9, long j7) {
        if (n.i(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.b = Integer.MIN_VALUE;
            this.f3930c = Integer.MIN_VALUE;
            this.f3932f = handler;
            this.f3933g = i9;
            this.f3934h = j7;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // g2.InterfaceC2289c
    public final void a(InterfaceC2265c interfaceC2265c) {
        this.f3931d = interfaceC2265c;
    }

    @Override // g2.InterfaceC2289c
    public final void b(InterfaceC2288b interfaceC2288b) {
        ((C2269g) interfaceC2288b).l(this.b, this.f3930c);
    }

    @Override // g2.InterfaceC2289c
    public final void c(Object obj) {
        this.f3935i = (Bitmap) obj;
        Handler handler = this.f3932f;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f3934h);
    }

    @Override // g2.InterfaceC2289c
    public final InterfaceC2265c g() {
        return this.f3931d;
    }

    @Override // g2.InterfaceC2289c
    public final void h(Drawable drawable) {
        this.f3935i = null;
    }

    @Override // c2.InterfaceC0598i
    public final void onDestroy() {
    }

    @Override // c2.InterfaceC0598i
    public final void onStart() {
    }

    @Override // c2.InterfaceC0598i
    public final void onStop() {
    }

    @Override // g2.InterfaceC2289c
    public final void d(Drawable drawable) {
    }

    @Override // g2.InterfaceC2289c
    public final void e(Drawable drawable) {
    }

    @Override // g2.InterfaceC2289c
    public final void f(InterfaceC2288b interfaceC2288b) {
    }
}
