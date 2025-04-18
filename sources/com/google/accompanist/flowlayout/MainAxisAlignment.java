package com.google.accompanist.flowlayout;

import androidx.compose.foundation.layout.Arrangement;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public enum MainAxisAlignment {
    Center(Arrangement.e),
    Start(Arrangement.f3774c),
    End(Arrangement.d),
    SpaceEvenly(Arrangement.f3775f),
    SpaceBetween(Arrangement.f3776g),
    SpaceAround(Arrangement.f3777h);


    @NotNull
    private final Arrangement.Vertical arrangement;

    MainAxisAlignment(Arrangement.Vertical vertical) {
        this.arrangement = vertical;
    }

    @NotNull
    public final Arrangement.Vertical getArrangement$flowlayout_release() {
        return this.arrangement;
    }
}
