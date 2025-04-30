package androidx.core.app;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public abstract class p0 {
    public static int a(Object obj) {
        return ((RemoteInput) obj).getEditChoicesBeforeSending();
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i9) {
        return builder.setEditChoicesBeforeSending(i9);
    }
}
