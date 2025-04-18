package com.facebook.login;

import java.util.Arrays;
import kotlin.jvm.internal.k;

/* loaded from: classes3.dex */
public enum CodeChallengeMethod {
    S256("S256"),
    PLAIN("plain");

    CodeChallengeMethod(String str) {
    }

    /* renamed from: values, reason: to resolve conflict with enum method */
    public static CodeChallengeMethod[] valuesCustom() {
        CodeChallengeMethod[] valuesCustom = values();
        return (CodeChallengeMethod[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    /* synthetic */ CodeChallengeMethod(String str, int i2, k kVar) {
        this((i2 & 1) != 0 ? "S256" : str);
    }
}
