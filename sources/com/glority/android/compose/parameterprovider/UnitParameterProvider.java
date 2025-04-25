package com.glority.android.compose.parameterprovider;

import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: UnitParameterProvider.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0004R \u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/glority/android/compose/parameterprovider/UnitParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lkotlin/Function0;", "", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "lib-compose_release"}, k = 1, mv = {1, 9, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public final class UnitParameterProvider implements PreviewParameterProvider<Function0<? extends Unit>> {
    public static final int $stable = 0;

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    public Sequence<Function0<? extends Unit>> getValues() {
        return SequencesKt.sequenceOf(new Function0<Unit>() { // from class: com.glority.android.compose.parameterprovider.UnitParameterProvider$values$text$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }
        });
    }
}
