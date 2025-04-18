package e3;

import com.google.android.gms.ads.nativead.NativeAd;
import l0.h;

/* loaded from: classes.dex */
public final class b extends h {

    /* renamed from: d, reason: collision with root package name */
    public final int f17087d;

    /* renamed from: f, reason: collision with root package name */
    public final NativeAd f17088f;

    public b(int i10, NativeAd nativeAd) {
        super(2);
        this.f17087d = i10;
        this.f17088f = nativeAd;
        this.f21106c = c.AD_LOADED;
    }

    @Override // l0.h
    public final String toString() {
        return "Status:" + ((c) this.f21106c) + " == nativeView:null == admobNativeAd:" + this.f17088f;
    }
}
