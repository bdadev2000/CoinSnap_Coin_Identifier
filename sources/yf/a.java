package yf;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f28202b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f28203c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(0);
        this.f28202b = i10;
        this.f28203c = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f28202b) {
            case 0:
                m1776invoke();
                return Unit.INSTANCE;
            default:
                m1776invoke();
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1776invoke() {
        /*
            r10 = this;
            int r0 = r10.f28202b
            java.lang.String r1 = "frAds"
            yf.b r2 = r10.f28203c
            switch(r0) {
                case 0: goto La;
                default: goto L9;
            }
        L9:
            goto L19
        La:
            androidx.databinding.e r0 = r2.c()
            kf.x1 r0 = (kf.x1) r0
            android.widget.FrameLayout r0 = r0.f20923t
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.bumptech.glide.e.D(r0)
            return
        L19:
            r0 = 1
            r2.f28207k = r0
            boolean r0 = x5.i.l()
            if (r0 == 0) goto L32
            androidx.databinding.e r0 = r2.c()
            kf.x1 r0 = (kf.x1) r0
            android.widget.FrameLayout r0 = r0.f20923t
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.bumptech.glide.e.D(r0)
            goto La2
        L32:
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            r0 = 0
            if (r4 == 0) goto L92
            boolean r3 = com.bumptech.glide.d.q(r4)
            if (r3 == 0) goto L82
            boolean r3 = hf.f.a     // Catch: java.lang.Exception -> L56
            if (r3 != 0) goto L44
            goto L5a
        L44:
            lc.b r3 = hf.f.f19113d     // Catch: java.lang.Exception -> L56
            if (r3 != 0) goto L4e
            java.lang.String r3 = "remoteConfig"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)     // Catch: java.lang.Exception -> L56
            goto L4f
        L4e:
            r0 = r3
        L4f:
            java.lang.String r3 = "native_history"
            boolean r0 = r0.a(r3)     // Catch: java.lang.Exception -> L56
            goto L5b
        L56:
            r0 = move-exception
            r0.printStackTrace()
        L5a:
            r0 = 0
        L5b:
            if (r0 == 0) goto L82
            d3.g r3 = d3.g.r()
            java.lang.String r5 = "ca-app-pub-6691965685689933/8894485373"
            r6 = 2131558563(0x7f0d00a3, float:1.8742445E38)
            androidx.databinding.e r0 = r2.c()
            kf.x1 r0 = (kf.x1) r0
            android.widget.FrameLayout r7 = r0.f20923t
            androidx.databinding.e r0 = r2.c()
            kf.x1 r0 = (kf.x1) r0
            kf.u0 r0 = r0.f20925w
            com.facebook.shimmer.ShimmerFrameLayout r8 = r0.f20900t
            hf.a r9 = new hf.a
            r0 = 2
            r9.<init>(r2, r0)
            r3.w(r4, r5, r6, r7, r8, r9)
            goto L90
        L82:
            androidx.databinding.e r0 = r2.c()
            kf.x1 r0 = (kf.x1) r0
            android.widget.FrameLayout r0 = r0.f20923t
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.bumptech.glide.e.D(r0)
        L90:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L92:
            if (r0 != 0) goto La2
            androidx.databinding.e r0 = r2.c()
            kf.x1 r0 = (kf.x1) r0
            android.widget.FrameLayout r0 = r0.f20923t
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.bumptech.glide.e.D(r0)
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yf.a.m1776invoke():void");
    }
}
