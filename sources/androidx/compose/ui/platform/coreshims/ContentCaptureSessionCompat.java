package androidx.compose.ui.platform.coreshims;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.compose.ui.graphics.layer.a;
import java.util.ArrayList;
import java.util.List;

@RestrictTo
/* loaded from: classes2.dex */
public class ContentCaptureSessionCompat {

    /* renamed from: a, reason: collision with root package name */
    public final Object f16718a;

    /* renamed from: b, reason: collision with root package name */
    public final View f16719b;

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api23Impl {
        @DoNotInline
        public static Bundle a(ViewStructure viewStructure) {
            return viewStructure.getExtras();
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api29Impl {
        @DoNotInline
        public static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newAutofillId(autofillId, j2);
        }

        @DoNotInline
        public static ViewStructure b(ContentCaptureSession contentCaptureSession, View view) {
            return contentCaptureSession.newViewStructure(view);
        }

        @DoNotInline
        public static ViewStructure c(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j2) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j2);
        }

        @DoNotInline
        public static void d(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        @DoNotInline
        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        @DoNotInline
        public static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    @RequiresApi
    /* loaded from: classes2.dex */
    public static class Api34Impl {
        @DoNotInline
        public static void a(ContentCaptureSession contentCaptureSession, List<ViewStructure> list) {
            contentCaptureSession.notifyViewsAppeared(list);
        }
    }

    public ContentCaptureSessionCompat(ContentCaptureSession contentCaptureSession, View view) {
        this.f16718a = contentCaptureSession;
        this.f16719b = view;
    }

    public final AutofillId a(long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.a(a.f(this.f16718a), ViewCompatShims.a(this.f16719b).f16717a, j2);
        }
        return null;
    }

    public final ViewStructureCompat b(AutofillId autofillId, long j2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new ViewStructureCompat(Api29Impl.c(a.f(this.f16718a), autofillId, j2));
        }
        return null;
    }

    public final void c(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            Api29Impl.e(a.f(this.f16718a), autofillId, charSequence);
        }
    }

    public final void d(ArrayList arrayList) {
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.f16718a;
        if (i2 >= 34) {
            Api34Impl.a(a.f(obj), arrayList);
            return;
        }
        if (i2 >= 29) {
            ContentCaptureSession f2 = a.f(obj);
            View view = this.f16719b;
            ViewStructure b2 = Api29Impl.b(f2, view);
            Api23Impl.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            Api29Impl.d(a.f(obj), b2);
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Api29Impl.d(a.f(obj), (ViewStructure) arrayList.get(i3));
            }
            ViewStructure b3 = Api29Impl.b(a.f(obj), view);
            Api23Impl.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            Api29Impl.d(a.f(obj), b3);
        }
    }

    public final void e(long[] jArr) {
        int i2 = Build.VERSION.SDK_INT;
        Object obj = this.f16718a;
        View view = this.f16719b;
        if (i2 >= 34) {
            Api29Impl.f(a.f(obj), ViewCompatShims.a(view).f16717a, jArr);
            return;
        }
        if (i2 >= 29) {
            ViewStructure b2 = Api29Impl.b(a.f(obj), view);
            Api23Impl.a(b2).putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            Api29Impl.d(a.f(obj), b2);
            Api29Impl.f(a.f(obj), ViewCompatShims.a(view).f16717a, jArr);
            ViewStructure b3 = Api29Impl.b(a.f(obj), view);
            Api23Impl.a(b3).putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            Api29Impl.d(a.f(obj), b3);
        }
    }
}
