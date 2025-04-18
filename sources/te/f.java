package te;

import android.content.Context;
import android.view.OrientationEventListener;
import s7.s2;

/* loaded from: classes4.dex */
public final class f extends OrientationEventListener {
    public final /* synthetic */ s2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(s2 s2Var, Context context) {
        super(context, 3);
        this.a = s2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0008, code lost:
    
        if (r6 != (-1)) goto L24;
     */
    @Override // android.view.OrientationEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onOrientationChanged(int r6) {
        /*
            r5 = this;
            s7.s2 r0 = r5.a
            r1 = 0
            r2 = -1
            if (r6 != r2) goto Lb
            int r6 = r0.f24752c
            if (r6 == r2) goto L2d
            goto L2e
        Lb:
            r2 = 315(0x13b, float:4.41E-43)
            if (r6 >= r2) goto L2d
            r3 = 45
            if (r6 >= r3) goto L14
            goto L2d
        L14:
            r4 = 135(0x87, float:1.89E-43)
            if (r6 < r3) goto L1d
            if (r6 >= r4) goto L1d
            r6 = 90
            goto L2e
        L1d:
            r3 = 225(0xe1, float:3.15E-43)
            if (r6 < r4) goto L26
            if (r6 >= r3) goto L26
            r6 = 180(0xb4, float:2.52E-43)
            goto L2e
        L26:
            if (r6 < r3) goto L2d
            if (r6 >= r2) goto L2d
            r6 = 270(0x10e, float:3.78E-43)
            goto L2e
        L2d:
            r6 = r1
        L2e:
            int r2 = r0.f24752c
            if (r6 == r2) goto L8e
            r0.f24752c = r6
            java.lang.Object r0 = r0.f24755f
            com.google.common.collect.c1 r0 = (com.google.common.collect.c1) r0
            java.lang.Object r2 = r0.f11924c
            fe.c r2 = (fe.c) r2
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.String r4 = "onDeviceOrientationChanged"
            r3[r1] = r4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r4 = 1
            r3[r4] = r1
            r2.a(r4, r3)
            java.lang.Object r1 = r0.f11925d
            com.otaliastudios.cameraview.CameraView r1 = (com.otaliastudios.cameraview.CameraView) r1
            s7.s2 r2 = r1.f16488p
            int r2 = r2.f24753d
            boolean r3 = r1.f16476c
            if (r3 != 0) goto L6d
            int r3 = 360 - r2
            int r3 = r3 % 360
            he.v r1 = r1.f16489q
            ne.a r1 = r1.C
            r1.getClass()
            ne.a.e(r3)
            r1.f22750d = r3
            r1.d()
            goto L7c
        L6d:
            he.v r1 = r1.f16489q
            ne.a r1 = r1.C
            r1.getClass()
            ne.a.e(r6)
            r1.f22750d = r6
            r1.d()
        L7c:
            int r6 = r6 + r2
            int r6 = r6 % 360
            java.lang.Object r1 = r0.f11925d
            com.otaliastudios.cameraview.CameraView r1 = (com.otaliastudios.cameraview.CameraView) r1
            android.os.Handler r1 = r1.f16484l
            j2.r r2 = new j2.r
            r3 = 4
            r2.<init>(r6, r3, r0)
            r1.post(r2)
        L8e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: te.f.onOrientationChanged(int):void");
    }
}
