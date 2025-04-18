package eg;

import com.plantcare.ai.identifier.plantid.ui.component.light.meter.LightMeterActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes4.dex */
public final class a extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f17360b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ LightMeterActivity f17361c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(LightMeterActivity lightMeterActivity, int i10) {
        super(0);
        this.f17360b = i10;
        this.f17361c = lightMeterActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f17360b) {
            case 0:
                m130invoke();
                return Unit.INSTANCE;
            case 1:
                m130invoke();
                return Unit.INSTANCE;
            default:
                m130invoke();
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /* renamed from: invoke, reason: collision with other method in class */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m130invoke() {
        /*
            r8 = this;
            int r0 = r8.f17360b
            java.lang.String r1 = "frAds"
            com.plantcare.ai.identifier.plantid.ui.component.light.meter.LightMeterActivity r2 = r8.f17361c
            switch(r0) {
                case 0: goto L6c;
                case 1: goto La;
                default: goto L9;
            }
        L9:
            goto L7b
        La:
            int r0 = com.plantcare.ai.identifier.plantid.ui.component.light.meter.LightMeterActivity.f16641h
            androidx.databinding.e r0 = r2.n()
            kf.s r0 = (kf.s) r0
            android.widget.FrameLayout r0 = r0.f20875t
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r3 = com.bumptech.glide.d.q(r2)
            r4 = 0
            if (r3 == 0) goto L3c
            boolean r3 = hf.f.a     // Catch: java.lang.Exception -> L34
            if (r3 != 0) goto L23
            goto L38
        L23:
            lc.b r3 = hf.f.f19113d     // Catch: java.lang.Exception -> L34
            if (r3 != 0) goto L2d
            java.lang.String r3 = "remoteConfig"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)     // Catch: java.lang.Exception -> L34
            r3 = 0
        L2d:
            java.lang.String r5 = "banner_collab_lightmeter"
            boolean r3 = r3.a(r5)     // Catch: java.lang.Exception -> L34
            goto L39
        L34:
            r3 = move-exception
            r3.printStackTrace()
        L38:
            r3 = r4
        L39:
            if (r3 == 0) goto L3c
            r4 = 1
        L3c:
            java.lang.String r3 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r3)
            java.lang.String r3 = "id"
            java.lang.String r5 = "ca-app-pub-6691965685689933/1207567043"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r1)
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            v8.u0.f26306l = r1
            fe.j r3 = new fe.j
            r3.<init>(r0, r2, r4)
            v8.u0.f26307m = r3
            java.lang.String r6 = "null cannot be cast to non-null type java.lang.Runnable"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r6)
            r6 = 35000(0x88b8, double:1.72923E-319)
            r1.postDelayed(r3, r6)
            v8.u0.R(r0, r2, r5, r4)
            return
        L6c:
            androidx.databinding.e r0 = r2.n()
            kf.s r0 = (kf.s) r0
            android.widget.FrameLayout r0 = r0.f20875t
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.bumptech.glide.e.D(r0)
            return
        L7b:
            int r0 = com.plantcare.ai.identifier.plantid.ui.component.light.meter.LightMeterActivity.f16641h
            r2.t()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: eg.a.m130invoke():void");
    }
}
