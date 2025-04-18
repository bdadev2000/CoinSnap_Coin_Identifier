package androidx.compose.ui.text;

import androidx.compose.runtime.saveable.SaverScope;
import q0.l;
import q0.p;

/* loaded from: classes2.dex */
public final class SaversKt$NonNullValueClassSaver$1 implements NonNullValueClassSaver<Object, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f16991a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l f16992b;

    public SaversKt$NonNullValueClassSaver$1(l lVar, p pVar) {
        this.f16991a = pVar;
        this.f16992b = lVar;
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object a(SaverScope saverScope, Object obj) {
        return this.f16991a.invoke(saverScope, obj);
    }

    @Override // androidx.compose.runtime.saveable.Saver
    public final Object b(Object obj) {
        return this.f16992b.invoke(obj);
    }
}
