package com.bumptech.glide.load.data;

import W1.y;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: d, reason: collision with root package name */
    public static final X1.a f12855d = new X1.a(1);
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f12856c;

    public h() {
        this.b = 0;
        this.f12856c = new HashMap();
    }

    @Override // com.bumptech.glide.load.data.g
    public void b() {
        switch (this.b) {
            case 1:
            case 2:
                return;
            default:
                ((y) this.f12856c).release();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public Object c() {
        switch (this.b) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f12856c).rewind();
            case 2:
                return this.f12856c;
            default:
                y yVar = (y) this.f12856c;
                yVar.reset();
                return yVar;
        }
    }

    public ParcelFileDescriptor e() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f12856c).rewind();
    }

    public h(InputStream inputStream, Q1.f fVar) {
        this.b = 3;
        y yVar = new y(inputStream, fVar);
        this.f12856c = yVar;
        yVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.b = 1;
        this.f12856c = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.b = 2;
        this.f12856c = obj;
    }

    private final void a() {
    }

    private final void d() {
    }
}
