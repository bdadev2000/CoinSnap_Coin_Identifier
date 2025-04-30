package com.meta.analytics.dsp.uinode;

import android.text.TextUtils;
import com.facebook.ads.internal.checkerframework.checker.nullness.qual.EnsuresNonNull;

/* renamed from: com.facebook.ads.redexgen.X.Ha, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC1192Ha {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @EnsuresNonNull({"#1"})
    public static <T> T A01(T t9) {
        if (t9 != null) {
            return t9;
        }
        throw new NullPointerException();
    }

    public static int A00(int i9, int i10, int i11) {
        if (i9 >= i10 && i9 < i11) {
            return i9;
        }
        throw new IndexOutOfBoundsException();
    }

    @EnsuresNonNull({"#1"})
    public static String A02(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException();
    }

    public static void A03(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void A04(boolean z8) {
        if (z8) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static void A05(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void A06(boolean z8, Object obj) {
        if (z8) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }
}
