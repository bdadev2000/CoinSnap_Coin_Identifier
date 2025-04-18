package com.google.firebase.sessions.settings;

import androidx.datastore.preferences.core.MutablePreferences;
import d0.b0;
import h0.g;
import i0.a;
import j0.e;
import j0.i;
import kotlin.jvm.internal.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q0.p;

@e(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class SettingsCache$removeConfigs$2 extends i implements p {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ SettingsCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsCache$removeConfigs$2(SettingsCache settingsCache, g gVar) {
        super(2, gVar);
        this.this$0 = settingsCache;
    }

    @Override // j0.a
    @NotNull
    public final g create(@Nullable Object obj, @NotNull g gVar) {
        SettingsCache$removeConfigs$2 settingsCache$removeConfigs$2 = new SettingsCache$removeConfigs$2(this.this$0, gVar);
        settingsCache$removeConfigs$2.L$0 = obj;
        return settingsCache$removeConfigs$2;
    }

    @Override // q0.p
    @Nullable
    public final Object invoke(@NotNull MutablePreferences mutablePreferences, @Nullable g gVar) {
        return ((SettingsCache$removeConfigs$2) create(mutablePreferences, gVar)).invokeSuspend(b0.f30125a);
    }

    @Override // j0.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a aVar = a.f30806a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        q.m(obj);
        MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
        mutablePreferences.c();
        mutablePreferences.f19088a.clear();
        this.this$0.updateSessionConfigs(mutablePreferences);
        return b0.f30125a;
    }
}
