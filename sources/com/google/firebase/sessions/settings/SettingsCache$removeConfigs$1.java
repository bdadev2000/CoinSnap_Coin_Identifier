package com.google.firebase.sessions.settings;

import h0.g;
import j0.c;
import j0.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@e(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", l = {103}, m = "removeConfigs$com_google_firebase_firebase_sessions")
/* loaded from: classes.dex */
public final class SettingsCache$removeConfigs$1 extends c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$1(SettingsCache settingsCache, g gVar) {
        super(gVar);
        this.this$0 = settingsCache;
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.removeConfigs$com_google_firebase_firebase_sessions(this);
    }
}
