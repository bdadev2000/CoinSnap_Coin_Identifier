package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.r;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2 extends r implements q0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SelectableInfo f7098a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7099b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionAdjustmentKt$updateSelectionBoundary$currentRawLine$2(SelectableInfo selectableInfo, int i2) {
        super(0);
        this.f7098a = selectableInfo;
        this.f7099b = i2;
    }

    @Override // q0.a
    public final Object invoke() {
        return Integer.valueOf(this.f7098a.f7082f.f(this.f7099b));
    }
}
