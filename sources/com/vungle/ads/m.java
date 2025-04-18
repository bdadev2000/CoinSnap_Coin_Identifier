package com.vungle.ads;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class m {
    private m() {
    }

    public /* synthetic */ m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final n fromValue(int i10) {
        n nVar = n.ERROR_LOG_LEVEL_DEBUG;
        if (i10 == nVar.getLevel()) {
            return nVar;
        }
        n nVar2 = n.ERROR_LOG_LEVEL_ERROR;
        if (i10 == nVar2.getLevel()) {
            return nVar2;
        }
        n nVar3 = n.ERROR_LOG_LEVEL_OFF;
        if (i10 == nVar3.getLevel()) {
            return nVar3;
        }
        return nVar2;
    }
}
