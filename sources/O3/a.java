package O3;

import android.graphics.Typeface;
import n1.C2475f;

/* loaded from: classes2.dex */
public final class a extends com.bumptech.glide.c {

    /* renamed from: d, reason: collision with root package name */
    public final Typeface f2157d;

    /* renamed from: e, reason: collision with root package name */
    public final C2475f f2158e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f2159f;

    public a(C2475f c2475f, Typeface typeface) {
        super(3);
        this.f2157d = typeface;
        this.f2158e = c2475f;
    }

    @Override // com.bumptech.glide.c
    public final void P(int i9) {
        if (!this.f2159f) {
            L3.b bVar = (L3.b) this.f2158e.f21833c;
            if (bVar.j(this.f2157d)) {
                bVar.h(false);
            }
        }
    }

    @Override // com.bumptech.glide.c
    public final void Q(Typeface typeface, boolean z8) {
        if (!this.f2159f) {
            L3.b bVar = (L3.b) this.f2158e.f21833c;
            if (bVar.j(typeface)) {
                bVar.h(false);
            }
        }
    }
}
