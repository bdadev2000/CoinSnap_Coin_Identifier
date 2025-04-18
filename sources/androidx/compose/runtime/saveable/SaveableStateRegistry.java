package androidx.compose.runtime.saveable;

import java.util.Map;
import q0.a;

/* loaded from: classes2.dex */
public interface SaveableStateRegistry {

    /* loaded from: classes2.dex */
    public interface Entry {
        void unregister();
    }

    boolean a(Object obj);

    Entry b(String str, a aVar);

    Map d();

    Object e(String str);
}
