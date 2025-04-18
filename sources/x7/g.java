package x7;

import java.util.UUID;

/* loaded from: classes3.dex */
public final class g extends Exception {
    public g(UUID uuid) {
        super("Media does not support uuid: " + uuid);
    }
}
