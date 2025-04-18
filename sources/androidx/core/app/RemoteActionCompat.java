package androidx.core.app;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.graphics.drawable.Icon;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.VersionedParcelable;

/* loaded from: classes2.dex */
public final class RemoteActionCompat implements VersionedParcelable {

    /* renamed from: a, reason: collision with root package name */
    public IconCompat f18464a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f18465b;

    /* renamed from: c, reason: collision with root package name */
    public CharSequence f18466c;
    public PendingIntent d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f18467f;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        @DoNotInline
        public static RemoteAction a(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
            return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
        }

        @DoNotInline
        public static PendingIntent b(RemoteAction remoteAction) {
            return remoteAction.getActionIntent();
        }

        @DoNotInline
        public static CharSequence c(RemoteAction remoteAction) {
            return remoteAction.getContentDescription();
        }

        @DoNotInline
        public static Icon d(RemoteAction remoteAction) {
            return remoteAction.getIcon();
        }

        @DoNotInline
        public static CharSequence e(RemoteAction remoteAction) {
            return remoteAction.getTitle();
        }

        @DoNotInline
        public static boolean f(RemoteAction remoteAction) {
            return remoteAction.isEnabled();
        }

        @DoNotInline
        public static void g(RemoteAction remoteAction, boolean z2) {
            remoteAction.setEnabled(z2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        @DoNotInline
        public static void a(RemoteAction remoteAction, boolean z2) {
            remoteAction.setShouldShowIcon(z2);
        }

        @DoNotInline
        public static boolean b(RemoteAction remoteAction) {
            return remoteAction.shouldShowIcon();
        }
    }

    @RestrictTo
    public RemoteActionCompat() {
    }
}
