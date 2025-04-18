package androidx.lifecycle;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/CompositeGeneratedAdaptersObserver;", "Landroidx/lifecycle/t;", "lifecycle-common"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class CompositeGeneratedAdaptersObserver implements t {

    /* renamed from: b, reason: collision with root package name */
    public final i[] f1768b;

    public CompositeGeneratedAdaptersObserver(i[] generatedAdapters) {
        Intrinsics.checkNotNullParameter(generatedAdapters, "generatedAdapters");
        this.f1768b = generatedAdapters;
    }

    @Override // androidx.lifecycle.t
    public final void a(v source, n event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        new d0();
        i[] iVarArr = this.f1768b;
        if (iVarArr.length <= 0) {
            if (iVarArr.length <= 0) {
                return;
            }
            i iVar = iVarArr[0];
            throw null;
        }
        i iVar2 = iVarArr[0];
        throw null;
    }
}
