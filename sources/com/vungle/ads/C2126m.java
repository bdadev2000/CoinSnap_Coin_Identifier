package com.vungle.ads;

/* renamed from: com.vungle.ads.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2126m {
    public /* synthetic */ C2126m(G7.f fVar) {
        this();
    }

    public final EnumC2128n fromValue(int i9) {
        EnumC2128n enumC2128n = EnumC2128n.ERROR_LOG_LEVEL_DEBUG;
        if (i9 == enumC2128n.getLevel()) {
            return enumC2128n;
        }
        EnumC2128n enumC2128n2 = EnumC2128n.ERROR_LOG_LEVEL_ERROR;
        if (i9 == enumC2128n2.getLevel()) {
            return enumC2128n2;
        }
        EnumC2128n enumC2128n3 = EnumC2128n.ERROR_LOG_LEVEL_OFF;
        if (i9 == enumC2128n3.getLevel()) {
            return enumC2128n3;
        }
        return enumC2128n2;
    }

    private C2126m() {
    }
}
