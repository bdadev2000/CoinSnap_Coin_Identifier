package com.facebook.internal;

import java.util.Arrays;

/* loaded from: classes3.dex */
public enum a0 {
    /* JADX INFO: Fake field, exist only in values array */
    ContextChoose("context_choose"),
    /* JADX INFO: Fake field, exist only in values array */
    JoinTournament("join_tournament");


    /* renamed from: b, reason: collision with root package name */
    public final String f11020b;

    a0(String str) {
        this.f11020b = str;
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static a0[] valuesCustom() {
        return (a0[]) Arrays.copyOf(values(), 2);
    }
}
