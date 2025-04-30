package o1;

import D3.f;
import com.google.android.gms.ads.nativead.NativeAd;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2493b extends f {
    public final int b;

    /* renamed from: c, reason: collision with root package name */
    public final NativeAd f21937c;

    public C2493b(int i9, NativeAd nativeAd) {
        this.b = i9;
        this.f21937c = nativeAd;
        this.f743a = 3;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Status:");
        int i9 = this.f743a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            str = "null";
                        } else {
                            str = "AD_RENDER_SUCCESS";
                        }
                    } else {
                        str = "AD_LOAD_FAIL";
                    }
                } else {
                    str = "AD_LOADED";
                }
            } else {
                str = "AD_LOADING";
            }
        } else {
            str = "AD_INIT";
        }
        sb.append(str);
        sb.append(" == nativeView:null == admobNativeAd:");
        sb.append(this.f21937c);
        return sb.toString();
    }
}
