package androidx.compose.runtime.saveable;

import androidx.compose.runtime.RememberObserver;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import q0.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SaveableHolder<T> implements SaverScope, RememberObserver {

    /* renamed from: a, reason: collision with root package name */
    public Saver f14497a;

    /* renamed from: b, reason: collision with root package name */
    public SaveableStateRegistry f14498b;

    /* renamed from: c, reason: collision with root package name */
    public String f14499c;
    public Object d;

    /* renamed from: f, reason: collision with root package name */
    public Object[] f14500f;

    /* renamed from: g, reason: collision with root package name */
    public SaveableStateRegistry.Entry f14501g;

    /* renamed from: h, reason: collision with root package name */
    public final a f14502h = new SaveableHolder$valueProvider$1(this);

    public SaveableHolder(Saver saver, SaveableStateRegistry saveableStateRegistry, String str, Object obj, Object[] objArr) {
        this.f14497a = saver;
        this.f14498b = saveableStateRegistry;
        this.f14499c = str;
        this.d = obj;
        this.f14500f = objArr;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean a(Object obj) {
        SaveableStateRegistry saveableStateRegistry = this.f14498b;
        return saveableStateRegistry == null || saveableStateRegistry.a(obj);
    }

    public final void b() {
        String a2;
        SaveableStateRegistry saveableStateRegistry = this.f14498b;
        if (this.f14501g != null) {
            throw new IllegalArgumentException(("entry(" + this.f14501g + ") is not null").toString());
        }
        if (saveableStateRegistry != null) {
            a aVar = this.f14502h;
            Object invoke = ((SaveableHolder$valueProvider$1) aVar).invoke();
            if (invoke == null || saveableStateRegistry.a(invoke)) {
                this.f14501g = saveableStateRegistry.b(this.f14499c, aVar);
                return;
            }
            if (invoke instanceof SnapshotMutableState) {
                SnapshotMutableState snapshotMutableState = (SnapshotMutableState) invoke;
                if (snapshotMutableState.f() == SnapshotStateKt.h() || snapshotMutableState.f() == SnapshotStateKt.m() || snapshotMutableState.f() == SnapshotStateKt.j()) {
                    a2 = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    a2 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                a2 = RememberSaveableKt.a(invoke);
            }
            throw new IllegalArgumentException(a2);
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onAbandoned() {
        SaveableStateRegistry.Entry entry = this.f14501g;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onForgotten() {
        SaveableStateRegistry.Entry entry = this.f14501g;
        if (entry != null) {
            entry.unregister();
        }
    }

    @Override // androidx.compose.runtime.RememberObserver
    public final void onRemembered() {
        b();
    }
}
