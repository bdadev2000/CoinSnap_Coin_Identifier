package androidx.loader.content;

import android.database.ContentObserver;
import androidx.core.util.DebugUtils;

/* loaded from: classes.dex */
public class Loader<D> {

    /* renamed from: a, reason: collision with root package name */
    public boolean f20256a;

    /* loaded from: classes.dex */
    public final class ForceLoadContentObserver extends ContentObserver {
        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z2) {
            throw null;
        }
    }

    /* loaded from: classes.dex */
    public interface OnLoadCanceledListener<D> {
    }

    /* loaded from: classes.dex */
    public interface OnLoadCompleteListener<D> {
    }

    public void a(Object obj) {
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(64);
        DebugUtils.a(sb, this);
        sb.append(" id=");
        sb.append(0);
        sb.append("}");
        return sb.toString();
    }
}
