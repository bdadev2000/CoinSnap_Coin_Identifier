package androidx.activity;

import java.util.ListIterator;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class s extends Lambda implements Function0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f616b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z f617c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(z zVar, int i10) {
        super(0);
        this.f616b = i10;
        this.f617c = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.f616b) {
            case 0:
                m0invoke();
                return Unit.INSTANCE;
            case 1:
                m0invoke();
                return Unit.INSTANCE;
            default:
                m0invoke();
                return Unit.INSTANCE;
        }
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m0invoke() {
        Object obj;
        int i10 = this.f616b;
        z zVar = this.f617c;
        switch (i10) {
            case 0:
                zVar.b();
                return;
            case 1:
                ArrayDeque arrayDeque = zVar.f625b;
                ListIterator<E> listIterator = arrayDeque.listIterator(arrayDeque.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((q) obj).a) {
                        }
                    } else {
                        obj = null;
                    }
                }
                zVar.f626c = null;
                return;
            default:
                zVar.b();
                return;
        }
    }
}
