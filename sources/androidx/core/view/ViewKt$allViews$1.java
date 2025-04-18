package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import d0.b0;
import java.util.Iterator;
import kotlin.jvm.internal.q;
import q0.p;
import y0.l;

/* JADX INFO: Access modifiers changed from: package-private */
@j0.e(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {409, 411}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class ViewKt$allViews$1 extends j0.h implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f18760a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f18761b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f18762c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewKt$allViews$1(View view, h0.g gVar) {
        super(gVar);
        this.f18762c = view;
    }

    @Override // j0.a
    public final h0.g create(Object obj, h0.g gVar) {
        ViewKt$allViews$1 viewKt$allViews$1 = new ViewKt$allViews$1(this.f18762c, gVar);
        viewKt$allViews$1.f18761b = obj;
        return viewKt$allViews$1;
    }

    @Override // q0.p
    public final Object invoke(Object obj, Object obj2) {
        return ((ViewKt$allViews$1) create((l) obj, (h0.g) obj2)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3 = i0.a.f30806a;
        int i2 = this.f18760a;
        View view = this.f18762c;
        if (i2 == 0) {
            q.m(obj);
            l lVar = (l) this.f18761b;
            this.f18761b = lVar;
            this.f18760a = 1;
            lVar.b(view, this);
            return obj3;
        }
        Object obj4 = b0.f30125a;
        if (i2 == 1) {
            l lVar2 = (l) this.f18761b;
            q.m(obj);
            if (view instanceof ViewGroup) {
                final ViewGroup viewGroup = (ViewGroup) view;
                y0.j jVar = new y0.j() { // from class: androidx.core.view.ViewGroupKt$special$$inlined$Sequence$1
                    @Override // y0.j
                    public final Iterator iterator() {
                        return new TreeIterator(new ViewGroupKt$children$1(viewGroup).iterator());
                    }
                };
                this.f18761b = null;
                this.f18760a = 2;
                lVar2.getClass();
                Iterator it = jVar.iterator();
                y0.k kVar = (y0.k) lVar2;
                if (((TreeIterator) it).f18735c.hasNext()) {
                    kVar.f31445c = it;
                    kVar.f31443a = 2;
                    kVar.d = this;
                    obj2 = obj3;
                } else {
                    obj2 = obj4;
                }
                if (obj2 != obj3) {
                    obj2 = obj4;
                }
                if (obj2 == obj3) {
                    return obj3;
                }
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q.m(obj);
        }
        return obj4;
    }
}
