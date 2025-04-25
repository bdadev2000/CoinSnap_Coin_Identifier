package com.bumptech.glide.integration.compose;

import android.graphics.drawable.Drawable;
import androidx.compose.runtime.Composer;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.RequestBuilder;
import com.glority.android.core.data.LogEventArguments;
import com.glority.android.xx.constants.LogEvents;
import kotlin.Metadata;
import kotlin.Pair;

/* compiled from: Preload.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J(\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\u0004H§\u0002¢\u0006\u0002\u0010\fR\u0012\u0010\u0003\u001a\u00020\u0004X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/bumptech/glide/integration/compose/GlidePreloadingData;", "DataT", "", LogEventArguments.ARG_SIZE, "", "getSize", "()I", LogEvents.exportemptyalert_close_click_type_get, "Lkotlin/Pair;", "Lcom/bumptech/glide/RequestBuilder;", "Landroid/graphics/drawable/Drawable;", "index", "(ILandroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "compose_release"}, k = 1, mv = {1, 7, 1}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes7.dex */
public interface GlidePreloadingData<DataT> {
    Pair<DataT, RequestBuilder<Drawable>> get(int i, Composer composer, int i2);

    int getSize();
}
