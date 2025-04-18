package com.google.firebase.sessions.settings;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import kotlin.jvm.internal.r;
import org.jetbrains.annotations.NotNull;
import q0.a;

/* loaded from: classes.dex */
public final class RemoteSettings$settingsCache$2 extends r implements a {
    final /* synthetic */ DataStore<Preferences> $dataStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoteSettings$settingsCache$2(DataStore<Preferences> dataStore) {
        super(0);
        this.$dataStore = dataStore;
    }

    @Override // q0.a
    @NotNull
    public final SettingsCache invoke() {
        return new SettingsCache(this.$dataStore);
    }
}
