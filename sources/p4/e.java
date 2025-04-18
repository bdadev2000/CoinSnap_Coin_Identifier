package p4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import w4.m;

/* loaded from: classes.dex */
public final class e implements t4.e {

    /* renamed from: b, reason: collision with root package name */
    public final int f23430b;

    /* renamed from: c, reason: collision with root package name */
    public final int f23431c;

    /* renamed from: d, reason: collision with root package name */
    public s4.c f23432d;

    /* renamed from: f, reason: collision with root package name */
    public final Handler f23433f;

    /* renamed from: g, reason: collision with root package name */
    public final int f23434g;

    /* renamed from: h, reason: collision with root package name */
    public final long f23435h;

    /* renamed from: i, reason: collision with root package name */
    public Bitmap f23436i;

    public e(Handler handler, int i10, long j3) {
        if (m.h(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            this.f23430b = Integer.MIN_VALUE;
            this.f23431c = Integer.MIN_VALUE;
            this.f23433f = handler;
            this.f23434g = i10;
            this.f23435h = j3;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
    }

    @Override // t4.e
    public final void a(s4.c cVar) {
        this.f23432d = cVar;
    }

    @Override // t4.e
    public final void b(t4.d dVar) {
        ((s4.h) dVar).n(this.f23430b, this.f23431c);
    }

    @Override // t4.e
    public final void c(Object obj) {
        this.f23436i = (Bitmap) obj;
        Handler handler = this.f23433f;
        handler.sendMessageAtTime(handler.obtainMessage(1, this), this.f23435h);
    }

    @Override // t4.e
    public final /* bridge */ /* synthetic */ void d(Drawable drawable) {
    }

    @Override // t4.e
    public final s4.c e() {
        return this.f23432d;
    }

    @Override // t4.e
    public final void f(Drawable drawable) {
        this.f23436i = null;
    }

    @Override // t4.e
    public final /* bridge */ /* synthetic */ void g(Drawable drawable) {
    }

    @Override // t4.e
    public final /* bridge */ /* synthetic */ void h(t4.d dVar) {
    }

    @Override // com.bumptech.glide.manager.h
    public final /* bridge */ /* synthetic */ void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.h
    public final /* bridge */ /* synthetic */ void onStart() {
    }

    @Override // com.bumptech.glide.manager.h
    public final /* bridge */ /* synthetic */ void onStop() {
    }
}
