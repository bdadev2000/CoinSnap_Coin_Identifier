package androidx.core.app;

import android.app.RemoteInput;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class RemoteInput {

    /* renamed from: a, reason: collision with root package name */
    public final String f18468a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f18469b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence[] f18470c;
    public final boolean d;
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public final Bundle f18471f;

    /* renamed from: g, reason: collision with root package name */
    public final Set f18472g = null;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api20Impl {
        @DoNotInline
        public static void a(Object obj, Intent intent, Bundle bundle) {
            android.app.RemoteInput.addResultsToIntent((android.app.RemoteInput[]) obj, intent, bundle);
        }

        @DoNotInline
        public static Bundle b(Intent intent) {
            return android.app.RemoteInput.getResultsFromIntent(intent);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api26Impl {
        @DoNotInline
        public static void a(RemoteInput remoteInput, Intent intent, Map<String, Uri> map) {
            android.app.RemoteInput.addDataResultToIntent(RemoteInput.a(remoteInput), intent, map);
        }

        @DoNotInline
        public static Set<String> b(Object obj) {
            return ((android.app.RemoteInput) obj).getAllowedDataTypes();
        }

        @DoNotInline
        public static Map<String, Uri> c(Intent intent, String str) {
            return android.app.RemoteInput.getDataResultsFromIntent(intent, str);
        }

        @DoNotInline
        public static RemoteInput.Builder d(RemoteInput.Builder builder, String str, boolean z2) {
            return builder.setAllowDataType(str, z2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api28Impl {
        @DoNotInline
        public static int a(Intent intent) {
            return android.app.RemoteInput.getResultsSource(intent);
        }

        @DoNotInline
        public static void b(Intent intent, int i2) {
            android.app.RemoteInput.setResultsSource(intent, i2);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static int a(Object obj) {
            return ((android.app.RemoteInput) obj).getEditChoicesBeforeSending();
        }

        @DoNotInline
        public static RemoteInput.Builder b(RemoteInput.Builder builder, int i2) {
            return builder.setEditChoicesBeforeSending(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface EditChoicesBeforeSending {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    /* loaded from: classes2.dex */
    public @interface Source {
    }

    public RemoteInput(String str, CharSequence charSequence, CharSequence[] charSequenceArr, boolean z2, int i2, Bundle bundle) {
        this.f18468a = str;
        this.f18469b = charSequence;
        this.f18470c = charSequenceArr;
        this.d = z2;
        this.e = i2;
        this.f18471f = bundle;
        if (i2 == 2 && !z2) {
            throw new IllegalArgumentException("setEditChoicesBeforeSending requires setAllowFreeFormInput");
        }
    }

    public static android.app.RemoteInput a(RemoteInput remoteInput) {
        RemoteInput.Builder addExtras = new RemoteInput.Builder(remoteInput.f18468a).setLabel(remoteInput.f18469b).setChoices(remoteInput.f18470c).setAllowFreeFormInput(remoteInput.d).addExtras(remoteInput.f18471f);
        Set set = remoteInput.f18472g;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                Api26Impl.d(addExtras, (String) it.next(), true);
            }
        }
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.b(addExtras, remoteInput.e);
        }
        return addExtras.build();
    }
}
