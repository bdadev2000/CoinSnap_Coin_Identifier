package androidx.compose.runtime;

import androidx.compose.runtime.collection.ScatterSetWrapper;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import java.util.ArrayList;
import java.util.Set;

/* loaded from: classes3.dex */
public interface ControlledComposition extends Composition {
    void a(Object obj);

    void b(ScatterSetWrapper scatterSetWrapper);

    void e();

    void g(q0.a aVar);

    void h(MovableContentState movableContentState);

    boolean i();

    void invalidateAll();

    boolean j(Set set);

    void k(ArrayList arrayList);

    void m(ComposableLambdaImpl composableLambdaImpl);

    void n();

    boolean o();

    void p(Object obj);

    void r();

    void s();

    Object u(ControlledComposition controlledComposition, int i2, q0.a aVar);
}
