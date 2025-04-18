package androidx.activity;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class r extends Lambda implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f589b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f590c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(z zVar, int i10) {
        super(1);
        this.f589b = i10;
        this.f590c = zVar;
    }

    public final void a(b backEvent) {
        int i10 = this.f589b;
        Object obj = null;
        z zVar = this.f590c;
        switch (i10) {
            case 0:
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                ArrayDeque arrayDeque = zVar.f625b;
                ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        Object previous = listIterator.previous();
                        if (((q) previous).a) {
                            obj = previous;
                        }
                    }
                }
                q qVar = (q) obj;
                zVar.f626c = qVar;
                if (qVar != null) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    return;
                }
                return;
            default:
                Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                ArrayDeque arrayDeque2 = zVar.f625b;
                ListIterator<E> listIterator2 = arrayDeque2.listIterator(arrayDeque2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        Object previous2 = listIterator2.previous();
                        if (((q) previous2).a) {
                            obj = previous2;
                        }
                    }
                }
                if (((q) obj) != null) {
                    Intrinsics.checkNotNullParameter(backEvent, "backEvent");
                    return;
                }
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f589b) {
            case 0:
                a((b) obj);
                return Unit.INSTANCE;
            default:
                a((b) obj);
                return Unit.INSTANCE;
        }
    }
}
