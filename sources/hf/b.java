package hf;

import com.google.android.gms.ads.LoadAdError;
import jb.g;
import kotlin.jvm.internal.Intrinsics;
import v8.u0;

/* loaded from: classes4.dex */
public final class b extends g {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f19110h;

    public /* synthetic */ b(int i10) {
        this.f19110h = i10;
    }

    @Override // jb.g
    public final void q(LoadAdError loadAdError) {
        switch (this.f19110h) {
            case 2:
                c cVar = u0.f26304j;
                if (cVar != null) {
                    cVar.a();
                    return;
                }
                return;
            case 3:
                c cVar2 = u0.f26304j;
                if (cVar2 != null) {
                    cVar2.a();
                    return;
                }
                return;
            case 4:
                c cVar3 = u0.f26304j;
                if (cVar3 != null) {
                    cVar3.a();
                    return;
                }
                return;
            case 5:
                c cVar4 = u0.f26304j;
                if (cVar4 != null) {
                    cVar4.a();
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // jb.g
    public final void v(e3.b nativeAd) {
        switch (this.f19110h) {
            case 2:
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                u0.f26300f = nativeAd;
                c cVar = u0.f26304j;
                if (cVar != null) {
                    cVar.b();
                    return;
                }
                return;
            case 3:
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                u0.f26301g = nativeAd;
                c cVar2 = u0.f26304j;
                if (cVar2 != null) {
                    cVar2.b();
                    return;
                }
                return;
            case 4:
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                u0.f26302h = nativeAd;
                c cVar3 = u0.f26304j;
                if (cVar3 != null) {
                    cVar3.b();
                    return;
                }
                return;
            case 5:
                Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
                u0.f26303i = nativeAd;
                c cVar4 = u0.f26304j;
                if (cVar4 != null) {
                    cVar4.b();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
