package y0;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class p extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f27821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ u0 f27822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p(u0 u0Var, int i10) {
        super(0);
        this.f27821b = i10;
        this.f27822c = u0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f27821b) {
            case 0:
                return ((a1.h) ((l1) this.f27822c.f27858i.getValue())).f37d;
            default:
                a1.e eVar = (a1.e) this.f27822c.a;
                String b0Var = ((ki.b0) eVar.f21e.getValue()).toString();
                synchronized (a1.e.f17g) {
                    LinkedHashSet linkedHashSet = a1.e.f16f;
                    if (!linkedHashSet.contains(b0Var)) {
                        linkedHashSet.add(b0Var);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + b0Var + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new a1.h(eVar.a, (ki.b0) eVar.f21e.getValue(), eVar.f18b, (i1) eVar.f19c.invoke((ki.b0) eVar.f21e.getValue(), eVar.a), new a1.d(eVar, 1));
        }
    }
}
