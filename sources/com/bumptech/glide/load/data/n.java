package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import n4.w;

/* loaded from: classes.dex */
public final class n implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f9709b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9710c;

    public n(InputStream inputStream, h4.h hVar) {
        w wVar = new w(inputStream, hVar);
        this.f9710c = wVar;
        wVar.mark(5242880);
    }

    public final ParcelFileDescriptor a() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.f9710c).rewind();
    }

    @Override // com.bumptech.glide.load.data.g
    public final void b() {
        switch (this.f9709b) {
            case 0:
            case 1:
                return;
            default:
                ((w) this.f9710c).release();
                return;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public final Object i() {
        int i10 = this.f9709b;
        Object obj = this.f9710c;
        switch (i10) {
            case 0:
                return a();
            case 1:
                return obj;
            default:
                w wVar = (w) obj;
                wVar.reset();
                return wVar;
        }
    }

    public n(ParcelFileDescriptor parcelFileDescriptor) {
        this.f9710c = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public n(Object obj) {
        this.f9710c = obj;
    }
}
