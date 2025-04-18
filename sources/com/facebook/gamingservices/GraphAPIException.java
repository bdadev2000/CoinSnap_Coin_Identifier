package com.facebook.gamingservices;

import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class GraphAPIException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GraphAPIException(@NotNull String str) {
        super(str);
        p0.a.s(str, "message");
    }
}
