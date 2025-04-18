package x9;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class g {
    public final float a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27586b;

    /* renamed from: d, reason: collision with root package name */
    public h f27588d;

    /* renamed from: e, reason: collision with root package name */
    public h f27589e;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f27587c = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public int f27590f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f27591g = -1;

    /* renamed from: h, reason: collision with root package name */
    public float f27592h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f27593i = -1;

    public g(float f10, float f11) {
        this.a = f10;
        this.f27586b = f11;
    }

    public final void a(float f10, float f11, float f12, boolean z10, boolean z11) {
        float f13;
        float f14 = f12 / 2.0f;
        float f15 = f10 - f14;
        float f16 = f14 + f10;
        float f17 = this.f27586b;
        if (f16 > f17) {
            f13 = Math.abs(f16 - Math.max(f16 - f12, f17));
        } else {
            f13 = 0.0f;
            if (f15 < 0.0f) {
                f13 = Math.abs(f15 - Math.min(f15 + f12, 0.0f));
            }
        }
        b(f10, f11, f12, z10, z11, f13);
    }

    public final void b(float f10, float f11, float f12, boolean z10, boolean z11, float f13) {
        c(f10, f11, f12, z10, z11, f13, 0.0f, 0.0f);
    }

    public final void c(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14, float f15) {
        if (f12 <= 0.0f) {
            return;
        }
        ArrayList arrayList = this.f27587c;
        if (z11) {
            if (!z10) {
                int i10 = this.f27593i;
                if (i10 != -1 && i10 != 0) {
                    throw new IllegalArgumentException("Anchor keylines must be either the first or last keyline.");
                }
                this.f27593i = arrayList.size();
            } else {
                throw new IllegalArgumentException("Anchor keylines cannot be focal.");
            }
        }
        h hVar = new h(Float.MIN_VALUE, f10, f11, f12, z11, f13, f14, f15);
        if (z10) {
            if (this.f27588d == null) {
                this.f27588d = hVar;
                this.f27590f = arrayList.size();
            }
            if (this.f27591g != -1 && arrayList.size() - this.f27591g > 1) {
                throw new IllegalArgumentException("Keylines marked as focal must be placed next to each other. There cannot be non-focal keylines between focal keylines.");
            }
            if (f12 == this.f27588d.f27596d) {
                this.f27589e = hVar;
                this.f27591g = arrayList.size();
            } else {
                throw new IllegalArgumentException("Keylines that are marked as focal must all have the same masked item size.");
            }
        } else {
            if (this.f27588d == null && f12 < this.f27592h) {
                throw new IllegalArgumentException("Keylines before the first focal keyline must be ordered by incrementing masked item size.");
            }
            if (this.f27589e != null && f12 > this.f27592h) {
                throw new IllegalArgumentException("Keylines after the last focal keyline must be ordered by decreasing masked item size.");
            }
        }
        this.f27592h = f12;
        arrayList.add(hVar);
    }

    public final void d(float f10, float f11, int i10, boolean z10, float f12) {
        if (i10 <= 0 || f12 <= 0.0f) {
            return;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            a((i11 * f12) + f10, f11, f12, z10, false);
        }
    }

    public final i e() {
        if (this.f27588d != null) {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                ArrayList arrayList2 = this.f27587c;
                int size = arrayList2.size();
                float f10 = this.a;
                if (i10 < size) {
                    h hVar = (h) arrayList2.get(i10);
                    arrayList.add(new h((i10 * f10) + (this.f27588d.f27594b - (this.f27590f * f10)), hVar.f27594b, hVar.f27595c, hVar.f27596d, hVar.f27597e, hVar.f27598f, hVar.f27599g, hVar.f27600h));
                    i10++;
                } else {
                    return new i(f10, arrayList, this.f27590f, this.f27591g);
                }
            }
        } else {
            throw new IllegalStateException("There must be a keyline marked as focal.");
        }
    }
}
