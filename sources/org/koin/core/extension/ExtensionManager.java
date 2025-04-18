package org.koin.core.extension;

import com.facebook.share.internal.ShareConstants;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.koin.core.Koin;
import org.koin.core.annotation.KoinInternalApi;
import p0.a;

@KoinInternalApi
/* loaded from: classes4.dex */
public final class ExtensionManager {

    @NotNull
    private final Koin _koin;

    @NotNull
    private final HashMap<String, KoinExtension> extensions;

    public ExtensionManager(@NotNull Koin koin) {
        a.s(koin, "_koin");
        this._koin = koin;
        this.extensions = new HashMap<>();
    }

    public static /* synthetic */ void getExtensions$annotations() {
    }

    public final void close() {
        Collection<KoinExtension> values = this.extensions.values();
        a.r(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            ((KoinExtension) it.next()).onClose();
        }
    }

    public final <T extends KoinExtension> T getExtension(String str) {
        a.s(str, "id");
        getExtensions().get(str);
        a.A0();
        throw null;
    }

    public final <T extends KoinExtension> T getExtensionOrNull(String str) {
        a.s(str, "id");
        getExtensions().get(str);
        a.A0();
        throw null;
    }

    @NotNull
    public final HashMap<String, KoinExtension> getExtensions() {
        return this.extensions;
    }

    @NotNull
    public final Koin get_koin$koin_core() {
        return this._koin;
    }

    public final <T extends KoinExtension> void registerExtension(@NotNull String str, @NotNull T t2) {
        a.s(str, "id");
        a.s(t2, ShareConstants.MEDIA_EXTENSION);
        this.extensions.put(str, t2);
        t2.setKoin(this._koin);
    }
}
