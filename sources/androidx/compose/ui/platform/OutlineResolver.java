package androidx.compose.ui.platform;

import android.graphics.Outline;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RoundRect;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;

@StabilityInferred
/* loaded from: classes3.dex */
public final class OutlineResolver {

    /* renamed from: a, reason: collision with root package name */
    public boolean f16545a = true;

    /* renamed from: b, reason: collision with root package name */
    public final Outline f16546b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.compose.ui.graphics.Outline f16547c;
    public AndroidPath d;
    public Path e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16548f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f16549g;

    /* renamed from: h, reason: collision with root package name */
    public Path f16550h;

    /* renamed from: i, reason: collision with root package name */
    public RoundRect f16551i;

    /* renamed from: j, reason: collision with root package name */
    public float f16552j;

    /* renamed from: k, reason: collision with root package name */
    public long f16553k;

    /* renamed from: l, reason: collision with root package name */
    public long f16554l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f16555m;

    public OutlineResolver() {
        Outline outline = new Outline();
        outline.setAlpha(1.0f);
        this.f16546b = outline;
        this.f16553k = 0L;
        this.f16554l = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (androidx.compose.ui.geometry.CornerRadius.b(r5.e) == r2) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(androidx.compose.ui.graphics.Canvas r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r20.d()
            androidx.compose.ui.graphics.Path r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L11
            r1.g(r2, r3)
            goto Lf1
        L11:
            float r2 = r0.f16552j
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 <= 0) goto Lc5
            androidx.compose.ui.graphics.Path r4 = r0.f16550h
            androidx.compose.ui.geometry.RoundRect r5 = r0.f16551i
            if (r4 == 0) goto L68
            long r6 = r0.f16553k
            long r8 = r0.f16554l
            if (r5 == 0) goto L68
            boolean r10 = androidx.compose.ui.geometry.RoundRectKt.a(r5)
            if (r10 != 0) goto L2b
            goto L68
        L2b:
            float r10 = androidx.compose.ui.geometry.Offset.g(r6)
            float r11 = r5.f14917a
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = androidx.compose.ui.geometry.Offset.h(r6)
            float r11 = r5.f14918b
            int r10 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r10 != 0) goto L68
            float r10 = androidx.compose.ui.geometry.Offset.g(r6)
            float r11 = androidx.compose.ui.geometry.Size.d(r8)
            float r11 = r11 + r10
            float r10 = r5.f14919c
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L68
            float r6 = androidx.compose.ui.geometry.Offset.h(r6)
            float r7 = androidx.compose.ui.geometry.Size.b(r8)
            float r7 = r7 + r6
            float r6 = r5.d
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 != 0) goto L68
            long r5 = r5.e
            float r5 = androidx.compose.ui.geometry.CornerRadius.b(r5)
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 != 0) goto L68
            goto Lc1
        L68:
            long r5 = r0.f16553k
            float r8 = androidx.compose.ui.geometry.Offset.g(r5)
            long r5 = r0.f16553k
            float r9 = androidx.compose.ui.geometry.Offset.h(r5)
            long r5 = r0.f16553k
            float r2 = androidx.compose.ui.geometry.Offset.g(r5)
            long r5 = r0.f16554l
            float r5 = androidx.compose.ui.geometry.Size.d(r5)
            float r10 = r5 + r2
            long r5 = r0.f16553k
            float r2 = androidx.compose.ui.geometry.Offset.h(r5)
            long r5 = r0.f16554l
            float r5 = androidx.compose.ui.geometry.Size.b(r5)
            float r11 = r5 + r2
            float r2 = r0.f16552j
            long r5 = androidx.compose.ui.geometry.CornerRadiusKt.a(r2, r2)
            float r2 = androidx.compose.ui.geometry.CornerRadius.b(r5)
            float r5 = androidx.compose.ui.geometry.CornerRadius.c(r5)
            long r18 = androidx.compose.ui.geometry.CornerRadiusKt.a(r2, r5)
            androidx.compose.ui.geometry.RoundRect r2 = new androidx.compose.ui.geometry.RoundRect
            r7 = r2
            r12 = r18
            r14 = r18
            r16 = r18
            r7.<init>(r8, r9, r10, r11, r12, r14, r16, r18)
            if (r4 != 0) goto Lb5
            androidx.compose.ui.graphics.AndroidPath r4 = androidx.compose.ui.graphics.AndroidPath_androidKt.a()
            goto Lb8
        Lb5:
            r4.reset()
        Lb8:
            androidx.compose.ui.graphics.Path$Direction r5 = androidx.compose.ui.graphics.Path.Direction.f15004a
            r4.v(r2, r5)
            r0.f16551i = r2
            r0.f16550h = r4
        Lc1:
            r1.g(r4, r3)
            goto Lf1
        Lc5:
            long r2 = r0.f16553k
            float r2 = androidx.compose.ui.geometry.Offset.g(r2)
            long r3 = r0.f16553k
            float r3 = androidx.compose.ui.geometry.Offset.h(r3)
            long r4 = r0.f16553k
            float r4 = androidx.compose.ui.geometry.Offset.g(r4)
            long r5 = r0.f16554l
            float r5 = androidx.compose.ui.geometry.Size.d(r5)
            float r4 = r4 + r5
            long r5 = r0.f16553k
            float r5 = androidx.compose.ui.geometry.Offset.h(r5)
            long r6 = r0.f16554l
            float r6 = androidx.compose.ui.geometry.Size.b(r6)
            float r5 = r5 + r6
            r6 = 1
            r1 = r21
            r1.f(r2, r3, r4, r5, r6)
        Lf1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.OutlineResolver.a(androidx.compose.ui.graphics.Canvas):void");
    }

    public final Outline b() {
        d();
        if (this.f16555m && this.f16545a) {
            return this.f16546b;
        }
        return null;
    }

    public final boolean c(androidx.compose.ui.graphics.Outline outline, float f2, boolean z2, float f3, long j2) {
        this.f16546b.setAlpha(f2);
        boolean z3 = !p0.a.g(this.f16547c, outline);
        if (z3) {
            this.f16547c = outline;
            this.f16548f = true;
        }
        this.f16554l = j2;
        boolean z4 = outline != null && (z2 || f3 > 0.0f);
        if (this.f16555m != z4) {
            this.f16555m = z4;
            this.f16548f = true;
        }
        return z3;
    }

    public final void d() {
        if (this.f16548f) {
            this.f16553k = 0L;
            this.f16552j = 0.0f;
            this.e = null;
            this.f16548f = false;
            this.f16549g = false;
            androidx.compose.ui.graphics.Outline outline = this.f16547c;
            Outline outline2 = this.f16546b;
            if (outline == null || !this.f16555m || Size.d(this.f16554l) <= 0.0f || Size.b(this.f16554l) <= 0.0f) {
                outline2.setEmpty();
                return;
            }
            this.f16545a = true;
            if (outline instanceof Outline.Rectangle) {
                Rect rect = ((Outline.Rectangle) outline).f15001a;
                float f2 = rect.f14914a;
                float f3 = rect.f14915b;
                this.f16553k = OffsetKt.a(f2, f3);
                this.f16554l = SizeKt.a(rect.h(), rect.e());
                outline2.setRect(Math.round(rect.f14914a), Math.round(f3), Math.round(rect.f14916c), Math.round(rect.d));
                return;
            }
            if (!(outline instanceof Outline.Rounded)) {
                if (outline instanceof Outline.Generic) {
                    e(((Outline.Generic) outline).f15000a);
                    return;
                }
                return;
            }
            RoundRect roundRect = ((Outline.Rounded) outline).f15002a;
            float b2 = CornerRadius.b(roundRect.e);
            float f4 = roundRect.f14917a;
            float f5 = roundRect.f14918b;
            this.f16553k = OffsetKt.a(f4, f5);
            this.f16554l = SizeKt.a(roundRect.b(), roundRect.a());
            if (RoundRectKt.a(roundRect)) {
                this.f16546b.setRoundRect(Math.round(f4), Math.round(f5), Math.round(roundRect.f14919c), Math.round(roundRect.d), b2);
                this.f16552j = b2;
                return;
            }
            AndroidPath androidPath = this.d;
            if (androidPath == null) {
                androidPath = AndroidPath_androidKt.a();
                this.d = androidPath;
            }
            androidPath.reset();
            androidPath.v(roundRect, Path.Direction.f15004a);
            e(androidPath);
        }
    }

    public final void e(Path path) {
        int i2 = Build.VERSION.SDK_INT;
        android.graphics.Outline outline = this.f16546b;
        if (i2 <= 28 && !path.a()) {
            this.f16545a = false;
            outline.setEmpty();
            this.f16549g = true;
        } else {
            if (!(path instanceof AndroidPath)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            outline.setConvexPath(((AndroidPath) path).f14938a);
            this.f16549g = !outline.canClip();
        }
        this.e = path;
    }
}
