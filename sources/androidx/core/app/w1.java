package androidx.core.app;

import android.app.RemoteInput;

/* loaded from: classes.dex */
public abstract class w1 {
    public static int a(Object obj) {
        int editChoicesBeforeSending;
        editChoicesBeforeSending = ((RemoteInput) obj).getEditChoicesBeforeSending();
        return editChoicesBeforeSending;
    }

    public static RemoteInput.Builder b(RemoteInput.Builder builder, int i10) {
        RemoteInput.Builder editChoicesBeforeSending;
        editChoicesBeforeSending = builder.setEditChoicesBeforeSending(i10);
        return editChoicesBeforeSending;
    }
}
