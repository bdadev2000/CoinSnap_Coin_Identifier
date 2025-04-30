package G7;

import android.view.View;
import androidx.core.view.ViewCompat;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import e0.G;
import e8.U;
import e8.Y;
import e8.k0;
import e8.m0;
import java.io.IOException;
import java.util.Collection;
import java.util.Map;
import t7.y;
import u7.AbstractC2812c;
import u7.AbstractC2816g;
import u7.C2824o;

/* loaded from: classes3.dex */
public final class w extends k implements F7.l {
    public final /* synthetic */ int b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1336c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w() {
        super(1);
        this.b = 1;
        this.f1336c = h.g.b;
    }

    @Override // F7.l
    public final Object invoke(Object obj) {
        String valueOf;
        x xVar = null;
        switch (this.b) {
            case 0:
                M7.f fVar = (M7.f) obj;
                j.e(fVar, "it");
                ((x) this.f1336c).getClass();
                M7.g gVar = fVar.f2012a;
                if (gVar == null) {
                    return "*";
                }
                M7.d dVar = fVar.b;
                if (dVar instanceof x) {
                    xVar = (x) dVar;
                }
                if (xVar == null || (valueOf = xVar.a(true)) == null) {
                    valueOf = String.valueOf(dVar);
                }
                int ordinal = gVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return "out ".concat(valueOf);
                        }
                        throw new RuntimeException();
                    }
                    return "in ".concat(valueOf);
                }
                return valueOf;
            case 1:
                j.e(obj, "it");
                return ((F7.a) this.f1336c).invoke();
            case 2:
                L7.c cVar = (L7.c) obj;
                j.e(cVar, "it");
                return O7.g.W((CharSequence) this.f1336c, cVar);
            case 3:
                ((Y7.h) this.f1336c).b();
                return y.f23029a;
            case 4:
                c8.a aVar = (c8.a) obj;
                j.e(aVar, "$this$buildSerialDescriptor");
                ((a8.a) this.f1336c).getClass();
                aVar.f5422a = C2824o.b;
                return y.f23029a;
            case 5:
                c8.a aVar2 = (c8.a) obj;
                j.e(aVar2, "$this$buildSerialDescriptor");
                c8.a.a(aVar2, "type", k0.b);
                c8.a.a(aVar2, AppMeasurementSdk.ConditionalUserProperty.VALUE, android.support.v4.media.session.a.e("kotlinx.serialization.Polymorphic<" + ((e) ((a8.f) this.f1336c).f4083a).b() + '>', c8.k.f5451d, new c8.g[0], c8.j.b));
                aVar2.f5422a = C2824o.b;
                return y.f23029a;
            case 6:
                Map.Entry entry = (Map.Entry) obj;
                j.e(entry, "entry");
                return Boolean.valueOf(AbstractC2816g.I((Collection) this.f1336c, ViewCompat.getTransitionName((View) entry.getValue())));
            case 7:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb = new StringBuilder();
                c8.h hVar = (c8.h) this.f1336c;
                sb.append(hVar.f5443f[intValue]);
                sb.append(": ");
                sb.append(hVar.f5444g[intValue].a());
                return sb.toString();
            case 8:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    T7.r rVar = ((G) this.f1336c).f19958g;
                    e0.j jVar = new e0.j(th);
                    rVar.getClass();
                    rVar.c(null, jVar);
                }
                Object obj2 = G.f19952k;
                G g9 = (G) this.f1336c;
                synchronized (obj2) {
                    G.f19951j.remove(g9.c().getAbsolutePath());
                }
                return y.f23029a;
            case 9:
                c8.a aVar3 = (c8.a) obj;
                j.e(aVar3, "$this$buildSerialDescriptor");
                ((U) this.f1336c).getClass();
                aVar3.f5422a = C2824o.b;
                return y.f23029a;
            case 10:
                int intValue2 = ((Number) obj).intValue();
                StringBuilder sb2 = new StringBuilder();
                Y y4 = (Y) this.f1336c;
                sb2.append(y4.f20147e[intValue2]);
                sb2.append(": ");
                sb2.append(y4.j(intValue2).a());
                return sb2.toString();
            case 11:
                c8.a aVar4 = (c8.a) obj;
                j.e(aVar4, "$this$buildClassSerialDescriptor");
                m0 m0Var = (m0) this.f1336c;
                c8.a.a(aVar4, "first", m0Var.f20178a.getDescriptor());
                c8.a.a(aVar4, "second", m0Var.b.getDescriptor());
                c8.a.a(aVar4, "third", m0Var.f20179c.getDescriptor());
                return y.f23029a;
            case 12:
                f8.j jVar2 = (f8.j) obj;
                j.e(jVar2, "node");
                g8.n nVar = (g8.n) this.f1336c;
                nVar.O(jVar2, (String) AbstractC2816g.P(nVar.f20509a));
                return y.f23029a;
            case 13:
                f8.j jVar3 = (f8.j) obj;
                j.e(jVar3, "it");
                ((r) this.f1336c).b = jVar3;
                return y.f23029a;
            case 14:
                j.e((IOException) obj, "it");
                byte[] bArr = j8.b.f21214a;
                ((k8.h) this.f1336c).m = true;
                return y.f23029a;
            default:
                if (obj == ((AbstractC2812c) this.f1336c)) {
                    return "(this Collection)";
                }
                return String.valueOf(obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i9) {
        super(1);
        this.b = i9;
        this.f1336c = obj;
    }
}
