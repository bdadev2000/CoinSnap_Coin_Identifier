package com.google.firebase.sessions.settings;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.objectweb.asm.Opcodes;

@e(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {Opcodes.DNEG}, m = "updateConfigValue")
/* loaded from: classes.dex */
public final class SettingsCache$updateConfigValue$1<T> extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$updateConfigValue$1(SettingsCache settingsCache, g gVar) {
        super(gVar);
        this.this$0 = settingsCache;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object updateConfigValue;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        updateConfigValue = this.this$0.updateConfigValue(null, null, this);
        return updateConfigValue;
    }
}
