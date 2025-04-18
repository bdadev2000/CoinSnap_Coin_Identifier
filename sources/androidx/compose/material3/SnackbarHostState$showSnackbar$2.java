package androidx.compose.material3;

import androidx.compose.material3.SnackbarHostState;
import b1.f0;
import b1.l;
import h0.g;
import i1.d;
import j0.e;
import kotlin.jvm.internal.q;

@e(c = "androidx.compose.material3.SnackbarHostState", f = "SnackbarHost.kt", l = {446, 449}, m = "showSnackbar")
/* loaded from: classes3.dex */
final class SnackbarHostState$showSnackbar$2 extends j0.c {

    /* renamed from: a, reason: collision with root package name */
    public SnackbarHostState f11538a;

    /* renamed from: b, reason: collision with root package name */
    public SnackbarVisuals f11539b;

    /* renamed from: c, reason: collision with root package name */
    public i1.a f11540c;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ Object f11541f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ SnackbarHostState f11542g;

    /* renamed from: h, reason: collision with root package name */
    public int f11543h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SnackbarHostState$showSnackbar$2(SnackbarHostState snackbarHostState, g gVar) {
        super(gVar);
        this.f11542g = snackbarHostState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [i1.a] */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.compose.material3.SnackbarHostState, java.lang.Object] */
    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        SnackbarHostState$showSnackbar$2 snackbarHostState$showSnackbar$2;
        d dVar;
        SnackbarVisuals snackbarVisuals;
        SnackbarHostState snackbarHostState;
        SnackbarHostState snackbarHostState2;
        Throwable th;
        i1.a aVar;
        this.f11541f = obj;
        this.f11543h |= Integer.MIN_VALUE;
        ?? r10 = this.f11542g;
        r10.getClass();
        int i2 = this.f11543h;
        if ((i2 & Integer.MIN_VALUE) != 0) {
            this.f11543h = i2 - Integer.MIN_VALUE;
            snackbarHostState$showSnackbar$2 = this;
        } else {
            snackbarHostState$showSnackbar$2 = new SnackbarHostState$showSnackbar$2(r10, this);
        }
        Object obj2 = snackbarHostState$showSnackbar$2.f11541f;
        i0.a aVar2 = i0.a.f30806a;
        int i3 = snackbarHostState$showSnackbar$2.f11543h;
        try {
            try {
                if (i3 == 0) {
                    q.m(obj2);
                    snackbarHostState$showSnackbar$2.f11538a = r10;
                    snackbarHostState$showSnackbar$2.f11539b = null;
                    dVar = r10.f11534a;
                    snackbarHostState$showSnackbar$2.f11540c = dVar;
                    snackbarHostState$showSnackbar$2.f11543h = 1;
                    if (dVar.d(null, snackbarHostState$showSnackbar$2) == aVar2) {
                        return aVar2;
                    }
                    snackbarVisuals = null;
                    snackbarHostState = r10;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar = snackbarHostState$showSnackbar$2.f11540c;
                        snackbarHostState2 = snackbarHostState$showSnackbar$2.f11538a;
                        try {
                            q.m(obj2);
                            snackbarHostState2.f11535b.setValue(null);
                            ((d) aVar).f(null);
                            return obj2;
                        } catch (Throwable th2) {
                            th = th2;
                            snackbarHostState2.f11535b.setValue(null);
                            throw th;
                        }
                    }
                    ?? r102 = snackbarHostState$showSnackbar$2.f11540c;
                    snackbarVisuals = snackbarHostState$showSnackbar$2.f11539b;
                    SnackbarHostState snackbarHostState3 = snackbarHostState$showSnackbar$2.f11538a;
                    q.m(obj2);
                    dVar = r102;
                    snackbarHostState = snackbarHostState3;
                }
                snackbarHostState$showSnackbar$2.f11538a = snackbarHostState;
                snackbarHostState$showSnackbar$2.f11539b = snackbarVisuals;
                snackbarHostState$showSnackbar$2.f11540c = dVar;
                snackbarHostState$showSnackbar$2.f11543h = 2;
                l lVar = new l(1, f0.r(snackbarHostState$showSnackbar$2));
                lVar.p();
                snackbarHostState.f11535b.setValue(new SnackbarHostState.SnackbarDataImpl(snackbarVisuals, lVar));
                Object o2 = lVar.o();
                if (o2 == aVar2) {
                    return aVar2;
                }
                snackbarHostState2 = snackbarHostState;
                aVar = dVar;
                obj2 = o2;
                snackbarHostState2.f11535b.setValue(null);
                ((d) aVar).f(null);
                return obj2;
            } catch (Throwable th3) {
                snackbarHostState2 = snackbarHostState;
                th = th3;
                snackbarHostState2.f11535b.setValue(null);
                throw th;
            }
        } catch (Throwable th4) {
            ((d) r10).f(null);
            throw th4;
        }
    }
}
