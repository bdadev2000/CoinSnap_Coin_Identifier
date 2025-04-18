package i;

import b1.d0;
import d0.b0;
import java.io.IOException;
import kotlin.jvm.internal.q;
import okio.Okio;
import q0.p;

/* loaded from: classes3.dex */
public final class h extends j0.i implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f30781a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(j jVar, h0.g gVar) {
        super(2, gVar);
        this.f30781a = jVar;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        return new h(this.f30781a, gVar);
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((h) create((d0) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        i0.a aVar = i0.a.f30806a;
        q.m(obj);
        j jVar = this.f30781a;
        synchronized (jVar) {
            if (!jVar.f30795m || jVar.f30796n) {
                return b0.f30125a;
            }
            try {
                jVar.y();
            } catch (IOException unused) {
                jVar.f30797o = true;
            }
            try {
                if (jVar.f30792j >= 2000) {
                    jVar.D();
                }
            } catch (IOException unused2) {
                jVar.f30798p = true;
                jVar.f30793k = Okio.buffer(Okio.blackhole());
            }
            return b0.f30125a;
        }
    }
}
