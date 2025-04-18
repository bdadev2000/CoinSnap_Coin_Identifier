package androidx.compose.runtime.saveable;

import q0.l;
import q0.p;

/* loaded from: classes4.dex */
public final class SaverKt$Saver$1 implements Saver<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f14534a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f14535b;

    public SaverKt$Saver$1(l lVar, p pVar) {
        this.f14534a = pVar;
        this.f14535b = lVar;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        return this.f14534a.invoke(saverScope, obj);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        return this.f14535b.invoke(obj);
    }
}
