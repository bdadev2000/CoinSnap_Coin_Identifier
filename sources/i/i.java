package i;

import com.google.android.gms.tasks.CancellationTokenSource;
import d0.b0;
import e0.w;
import e1.t0;
import java.util.Map;
import kotlin.jvm.internal.q;
import kotlin.jvm.internal.r;
import n1.g1;
import org.objectweb.asm.signature.SignatureVisitor;

/* loaded from: classes3.dex */
public final class i extends r implements q0.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f30782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f30783b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(Object obj, int i2) {
        super(1);
        this.f30782a = i2;
        this.f30783b = obj;
    }

    public final void invoke(Throwable th) {
        int i2 = this.f30782a;
        Object obj = this.f30783b;
        switch (i2) {
            case 6:
                ((b1.k) obj).resumeWith(b0.f30125a);
                return;
            case 7:
            default:
                ((CancellationTokenSource) obj).cancel();
                return;
            case 8:
                ((i1.i) obj).b();
                return;
        }
    }

    @Override // q0.l
    public final Object invoke(Object obj) {
        Object obj2;
        b0 b0Var = b0.f30125a;
        int i2 = this.f30782a;
        Object obj3 = this.f30783b;
        switch (i2) {
            case 0:
                ((j) obj3).f30794l = true;
                return b0Var;
            case 1:
                return obj == ((e0.a) obj3) ? "(this Collection)" : String.valueOf(obj);
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                p0.a.s(entry, "it");
                e0.g gVar = (e0.g) obj3;
                gVar.getClass();
                StringBuilder sb = new StringBuilder();
                Object key = entry.getKey();
                sb.append(key == gVar ? "(this Map)" : String.valueOf(key));
                sb.append(SignatureVisitor.INSTANCEOF);
                Object value = entry.getValue();
                sb.append(value != gVar ? String.valueOf(value) : "(this Map)");
                return sb.toString();
            case 3:
                return ((z0.e) obj3).b(((Number) obj).intValue());
            case 4:
                String str = (String) obj;
                p0.a.s(str, "line");
                return android.support.v4.media.d.r(new StringBuilder(), (String) obj3, str);
            case 5:
                w0.g gVar2 = (w0.g) obj;
                p0.a.s(gVar2, "it");
                return z0.m.s1((CharSequence) obj3, gVar2);
            case 6:
                invoke((Throwable) obj);
                return b0Var;
            case 7:
                Throwable th = (Throwable) obj;
                try {
                    Throwable th2 = (Throwable) ((q0.l) obj3).invoke(th);
                    boolean g2 = p0.a.g(th.getMessage(), th2.getMessage());
                    obj2 = th2;
                    if (!g2) {
                        boolean g3 = p0.a.g(th2.getMessage(), th.toString());
                        obj2 = th2;
                        if (!g3) {
                            obj2 = null;
                        }
                    }
                } catch (Throwable th3) {
                    obj2 = q.d(th3);
                }
                return (Throwable) (obj2 instanceof d0.m ? null : obj2);
            case 8:
                invoke((Throwable) obj);
                return b0Var;
            case 9:
                invoke((Throwable) obj);
                return b0Var;
            case 10:
                l1.a aVar = (l1.a) obj;
                p0.a.s(aVar, "$this$buildSerialDescriptor");
                l1.a.a(aVar, "type", g1.f31079b);
                StringBuilder sb2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
                k1.c cVar = (k1.c) obj3;
                sb2.append(((kotlin.jvm.internal.j) cVar.f30897a).c());
                sb2.append('>');
                l1.a.a(aVar, "value", t0.h(sb2.toString(), l1.k.f31045a, new l1.f[0], l1.j.f31044a));
                w wVar = cVar.f30898b;
                p0.a.s(wVar, "<set-?>");
                aVar.f31012b = wVar;
                return b0Var;
            default:
                int intValue = ((Number) obj).intValue();
                StringBuilder sb3 = new StringBuilder();
                l1.g gVar3 = (l1.g) obj3;
                sb3.append(gVar3.f31032f[intValue]);
                sb3.append(": ");
                sb3.append(gVar3.f31033g[intValue].g());
                return sb3.toString();
        }
    }
}
