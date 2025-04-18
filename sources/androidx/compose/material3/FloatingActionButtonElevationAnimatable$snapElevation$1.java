package androidx.compose.material3;

import h0.g;
import j0.e;

/* JADX INFO: Access modifiers changed from: package-private */
@e(c = "androidx.compose.material3.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", l = {636}, m = "snapElevation")
/* loaded from: classes3.dex */
public final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public Object f9447a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f9448b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ FloatingActionButtonElevationAnimatable f9449c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, g gVar) {
        super(gVar);
        this.f9449c = floatingActionButtonElevationAnimatable;
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        this.f9448b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.f9449c.b(this);
    }
}
