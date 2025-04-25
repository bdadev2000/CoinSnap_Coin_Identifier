package com.bumptech.glide.integration.compose;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.glority.android.xx.constants.LogEvents;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: Add missing generic type declarations: [DataT] */
/* compiled from: Preload.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
/* synthetic */ class PreloadKt$rememberGlidePreloadingData$2<DataT> extends FunctionReferenceImpl implements Function1<Integer, DataT> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PreloadKt$rememberGlidePreloadingData$2(Object obj) {
        super(1, obj, List.class, LogEvents.exportemptyalert_close_click_type_get, "get(I)Ljava/lang/Object;", 0);
    }

    public final DataT invoke(int i) {
        return (DataT) ((List) this.receiver).get(i);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Integer num) {
        return invoke(num.intValue());
    }
}
