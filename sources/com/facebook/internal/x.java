package com.facebook.internal;

import java.util.Arrays;

/* loaded from: classes.dex */
public enum x {
    /* JADX INFO: Fake field, exist only in values array */
    ContextChoose("context_choose"),
    /* JADX INFO: Fake field, exist only in values array */
    JoinTournament("join_tournament");

    public final String b;

    x(String str) {
        this.b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static x[] valuesCustom() {
        return (x[]) Arrays.copyOf(values(), 2);
    }
}
