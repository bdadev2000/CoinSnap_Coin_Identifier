package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import q0.l;

@StabilityInferred
/* loaded from: classes4.dex */
public final class ProvidedValue<T> {

    /* renamed from: a, reason: collision with root package name */
    public final CompositionLocal f13862a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f13863b;

    /* renamed from: c, reason: collision with root package name */
    public final SnapshotMutationPolicy f13864c;
    public final MutableState d;
    public final l e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f13865f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13866g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f13867h = true;

    public ProvidedValue(CompositionLocal compositionLocal, Object obj, boolean z2, SnapshotMutationPolicy snapshotMutationPolicy, MutableState mutableState, l lVar, boolean z3) {
        this.f13862a = compositionLocal;
        this.f13863b = z2;
        this.f13864c = snapshotMutationPolicy;
        this.d = mutableState;
        this.e = lVar;
        this.f13865f = z3;
        this.f13866g = obj;
    }

    public final Object a() {
        if (this.f13863b) {
            return null;
        }
        MutableState mutableState = this.d;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        Object obj = this.f13866g;
        if (obj != null) {
            return obj;
        }
        ComposerKt.d("Unexpected form of a provided value");
        throw null;
    }
}
