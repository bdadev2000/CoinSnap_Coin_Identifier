package te;

import android.os.HandlerThread;

/* loaded from: classes4.dex */
public final class h extends HandlerThread {
    public h(String str) {
        super(str);
    }

    @Override // java.lang.Thread
    public final String toString() {
        return super.toString() + "[" + getThreadId() + "]";
    }
}
