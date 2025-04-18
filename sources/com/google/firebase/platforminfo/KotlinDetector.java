package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import d0.g;

/* loaded from: classes2.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return g.f30129b.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
